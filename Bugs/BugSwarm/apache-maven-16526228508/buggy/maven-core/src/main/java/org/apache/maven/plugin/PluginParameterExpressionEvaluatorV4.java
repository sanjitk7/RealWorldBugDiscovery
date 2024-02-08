/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.maven.plugin;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.Properties;

import org.apache.maven.api.Project;
import org.apache.maven.api.Session;
import org.apache.maven.internal.impl.DefaultMojoExecution;
import org.apache.maven.internal.impl.DefaultSession;
import org.apache.maven.plugin.descriptor.MojoDescriptor;
import org.apache.maven.plugin.descriptor.PluginDescriptor;
import org.codehaus.plexus.component.configurator.expression.ExpressionEvaluationException;
import org.codehaus.plexus.component.configurator.expression.TypeAwareExpressionEvaluator;
import org.codehaus.plexus.util.introspection.ReflectionValueExtractor;

/**
 * Evaluator for plugin parameters expressions. Content surrounded by <code>${</code> and <code>}</code> is evaluated.
 * Recognized values are:
 * <table border="1">
 * <caption>Expression matrix</caption>
 * <tr><th>expression</th>                     <th></th>               <th>evaluation result</th></tr>
 * <tr><td><code>session</code></td>           <td></td>               <td>the actual {@link Session}</td></tr>
 * <tr><td><code>session.*</code></td>         <td>(since Maven 3)</td><td></td></tr>
 * <tr><td><code>localRepository</code></td>   <td></td>
 *                                             <td>{@link Session#getLocalRepository()}</td></tr>
 * <tr><td><code>reactorProjects</code></td>   <td></td>               <td>{@link Session#getProjects()}</td></tr>
 * <tr><td><code>project</code></td>           <td></td>
 *                                 <td>{@link org.apache.maven.execution.MavenSession#getCurrentProject()}</td></tr>
 * <tr><td><code>project.*</code></td>         <td></td>               <td></td></tr>
 * <tr><td><code>pom.*</code></td>             <td>(since Maven 3)</td><td>same as <code>project.*</code></td></tr>
 * <tr><td><code>executedProject</code></td>   <td></td>
 *                                 <td>{@link org.apache.maven.project.MavenProject#getExecutionProject()}</td></tr>
 * <tr><td><code>settings</code></td>          <td></td>               <td>{@link Session#getSettings()}</td></tr>
 * <tr><td><code>settings.*</code></td>        <td></td>               <td></td></tr>
 * <tr><td><code>basedir</code></td>           <td></td>
 *                                 <td>{@link Session#getExecutionRootDirectory()} or
 *                                                 <code>System.getProperty( "user.dir" )</code> if null</td></tr>
 * <tr><td><code>mojoExecution</code></td>     <td></td>               <td>the actual {@link MojoExecution}</td></tr>
 * <tr><td><code>mojo</code></td>              <td>(since Maven 3)</td><td>same as <code>mojoExecution</code></td></tr>
 * <tr><td><code>mojo.*</code></td>            <td>(since Maven 3)</td><td></td></tr>
 * <tr><td><code>plugin</code></td>            <td>(since Maven 3)</td>
 *                             <td>{@link MojoExecution#getMojoDescriptor()}.{@link MojoDescriptor#getPluginDescriptor()
 *                                 getPluginDescriptor()}</td></tr>
 * <tr><td><code>plugin.*</code></td>          <td></td>               <td></td></tr>
 * <tr><td><code>*</code></td>                 <td></td>               <td>user properties</td></tr>
 * <tr><td><code>*</code></td>                 <td></td>               <td>system properties</td></tr>
 * <tr><td><code>*</code></td>                 <td></td>               <td>project properties</td></tr>
 * </table>
 * <i>Notice:</i> <code>reports</code> was supported in Maven 2.x but was removed in Maven 3
 *
 * @author Jason van Zyl
 * @see Session
 * @see MojoExecution
 */
public class PluginParameterExpressionEvaluatorV4 implements TypeAwareExpressionEvaluator {
    private Session session;

    private MojoExecution mojoExecution;

    private Project project;

    private Path basedir;

    private Properties properties;

    public PluginParameterExpressionEvaluatorV4(Session session, Project project) {
        this(session, project, null);
    }

    public PluginParameterExpressionEvaluatorV4(Session session, Project project, MojoExecution mojoExecution) {
        this.session = session;
        this.mojoExecution = mojoExecution;
        this.properties = new Properties();
        this.project = project;

        //
        // Maven4: We may want to evaluate how this is used but we add these separate as the
        // getExecutionProperties is deprecated in MavenSession.
        //
        this.properties.putAll(session.getUserProperties());
        this.properties.putAll(session.getSystemProperties());

        Path basedir = null;

        if (project != null) {
            Optional<Path> projectFile = project.getBasedir();

            // this should always be the case for non-super POM instances...
            if (projectFile.isPresent()) {
                basedir = projectFile.get().toAbsolutePath();
            }
        }

        if (basedir == null) {
            basedir = session.getExecutionRootDirectory();
        }

        if (basedir == null) {
            basedir = Paths.get(System.getProperty("user.dir"));
        }

        this.basedir = basedir;
    }

    @Override
    public Object evaluate(String expr) throws ExpressionEvaluationException {
        return evaluate(expr, null);
    }

    @Override
    @SuppressWarnings("checkstyle:methodlength")
    public Object evaluate(String expr, Class<?> type) throws ExpressionEvaluationException {
        Object value = null;

        if (expr == null) {
            return null;
        }

        String expression = stripTokens(expr);
        if (expression.equals(expr)) {
            int index = expr.indexOf("${");
            if (index >= 0) {
                int lastIndex = expr.indexOf('}', index);
                if (lastIndex >= 0) {
                    String retVal = expr.substring(0, index);

                    if ((index > 0) && (expr.charAt(index - 1) == '$')) {
                        retVal += expr.substring(index + 1, lastIndex + 1);
                    } else {
                        Object subResult = evaluate(expr.substring(index, lastIndex + 1));

                        if (subResult != null) {
                            retVal += subResult;
                        } else {
                            retVal += "$" + expr.substring(index + 1, lastIndex + 1);
                        }
                    }

                    retVal += evaluate(expr.substring(lastIndex + 1));
                    return retVal;
                }
            }

            // Was not an expression
            return expression.replace("$$", "$");
        }

        if ("localRepository".equals(expression)) {
            // TODO: v4
            value = session.getLocalRepository();
        } else if ("session".equals(expression)) {
            value = session;
        } else if (expression.startsWith("session")) {
            // TODO: v4
            try {
                int pathSeparator = expression.indexOf('/');

                if (pathSeparator > 0) {
                    String pathExpression = expression.substring(1, pathSeparator);
                    value = ReflectionValueExtractor.evaluate(pathExpression, session);
                    value = value + expression.substring(pathSeparator);
                } else {
                    value = ReflectionValueExtractor.evaluate(expression.substring(1), session);
                }
            } catch (Exception e) {
                // TODO don't catch exception
                throw new ExpressionEvaluationException(
                        "Error evaluating plugin parameter expression: " + expression, e);
            }
        } else if ("reactorProjects".equals(expression)) {
            value = session.getProjects();
        } else if ("project".equals(expression)) {
            value = project;
        } else if ("executedProject".equals(expression)) {
            value = ((DefaultSession) session)
                    .getProject(((DefaultSession) session)
                            .getMavenSession()
                            .getCurrentProject()
                            .getExecutionProject());
        } else if (expression.startsWith("project") || expression.startsWith("pom")) {
            // TODO: v4
            try {
                int pathSeparator = expression.indexOf('/');

                if (pathSeparator > 0) {
                    String pathExpression = expression.substring(0, pathSeparator);
                    value = ReflectionValueExtractor.evaluate(pathExpression, project);
                    value = value + expression.substring(pathSeparator);
                } else {
                    value = ReflectionValueExtractor.evaluate(expression.substring(1), project);
                }
            } catch (Exception e) {
                // TODO don't catch exception
                throw new ExpressionEvaluationException(
                        "Error evaluating plugin parameter expression: " + expression, e);
            }
        } else if (expression.equals("repositorySystemSession")) {
            // TODO: v4
        } else if (expression.equals("mojo") || expression.equals("mojoExecution")) {
            value = new DefaultMojoExecution(mojoExecution);
        } else if (expression.startsWith("mojo")) {
            // TODO: v4
            try {
                int pathSeparator = expression.indexOf('/');

                if (pathSeparator > 0) {
                    String pathExpression = expression.substring(1, pathSeparator);
                    value = ReflectionValueExtractor.evaluate(pathExpression, mojoExecution);
                    value = value + expression.substring(pathSeparator);
                } else {
                    value = ReflectionValueExtractor.evaluate(expression.substring(1), mojoExecution);
                }
            } catch (Exception e) {
                // TODO don't catch exception
                throw new ExpressionEvaluationException(
                        "Error evaluating plugin parameter expression: " + expression, e);
            }
        } else if (expression.equals("plugin")) {
            // TODO: v4
            value = mojoExecution.getMojoDescriptor().getPluginDescriptor();
        } else if (expression.startsWith("plugin")) {
            // TODO: v4
            try {
                int pathSeparator = expression.indexOf('/');

                PluginDescriptor pluginDescriptor =
                        mojoExecution.getMojoDescriptor().getPluginDescriptor();

                if (pathSeparator > 0) {
                    String pathExpression = expression.substring(1, pathSeparator);
                    value = ReflectionValueExtractor.evaluate(pathExpression, pluginDescriptor);
                    value = value + expression.substring(pathSeparator);
                } else {
                    value = ReflectionValueExtractor.evaluate(expression.substring(1), pluginDescriptor);
                }
            } catch (Exception e) {
                throw new ExpressionEvaluationException(
                        "Error evaluating plugin parameter expression: " + expression, e);
            }
        } else if ("settings".equals(expression)) {
            value = session.getSettings();
        } else if (expression.startsWith("settings")) {
            try {
                int pathSeparator = expression.indexOf('/');

                if (pathSeparator > 0) {
                    String pathExpression = expression.substring(1, pathSeparator);
                    value = ReflectionValueExtractor.evaluate(pathExpression, session.getSettings());
                    value = value + expression.substring(pathSeparator);
                } else {
                    value = ReflectionValueExtractor.evaluate(expression.substring(1), session.getSettings());
                }
            } catch (Exception e) {
                // TODO don't catch exception
                throw new ExpressionEvaluationException(
                        "Error evaluating plugin parameter expression: " + expression, e);
            }
        } else if ("basedir".equals(expression)) {
            value = basedir.toString();
        } else if (expression.startsWith("basedir")) {
            int pathSeparator = expression.indexOf('/');

            if (pathSeparator > 0) {
                value = basedir.toString() + expression.substring(pathSeparator);
            }
        }

        /*
         * MNG-4312: We neither have reserved all of the above magic expressions nor is their set fixed/well-known (it
         * gets occasionally extended by newer Maven versions). This imposes the risk for existing plugins to
         * unintentionally use such a magic expression for an ordinary property. So here we check whether we
         * ended up with a magic value that is not compatible with the type of the configured mojo parameter (a string
         * could still be converted by the configurator so we leave those alone). If so, back off to evaluating the
         * expression from properties only.
         */
        if (value != null && type != null && !(value instanceof String) && !isTypeCompatible(type, value)) {
            value = null;
        }

        if (value == null) {
            // The CLI should win for defining properties

            if (properties != null) {
                // We will attempt to get nab a property as a way to specify a parameter
                // to a plugin. My particular case here is allowing the surefire plugin
                // to run a single test so I want to specify that class on the cli as
                // a parameter.

                value = properties.getProperty(expression);
            }

            if ((value == null) && ((project != null) && (project.getModel().getProperties() != null))) {
                value = project.getModel().getProperties().get(expression);
            }
        }

        if (value instanceof String) {
            // TODO without #, this could just be an evaluate call...

            String val = (String) value;

            int exprStartDelimiter = val.indexOf("${");

            if (exprStartDelimiter >= 0) {
                if (exprStartDelimiter > 0) {
                    value = val.substring(0, exprStartDelimiter) + evaluate(val.substring(exprStartDelimiter));
                } else {
                    value = evaluate(val.substring(exprStartDelimiter));
                }
            }
        }

        return value;
    }

    private static boolean isTypeCompatible(Class<?> type, Object value) {
        if (type.isInstance(value)) {
            return true;
        }
        // likely Boolean -> boolean, Short -> int etc. conversions, it's not the problem case we try to avoid
        return ((type.isPrimitive() || type.getName().startsWith("java.lang."))
                && value.getClass().getName().startsWith("java.lang."));
    }

    private String stripTokens(String expr) {
        if (expr.startsWith("${") && (expr.indexOf('}') == expr.length() - 1)) {
            expr = expr.substring(2, expr.length() - 1);
        }
        return expr;
    }

    @Override
    public File alignToBaseDirectory(File file) {
        // TODO Copied from the DefaultInterpolator. We likely want to resurrect the PathTranslator or at least a
        // similar component for re-usage
        if (file != null) {
            if (file.isAbsolute()) {
                // path was already absolute, just normalize file separator and we're done
            } else if (file.getPath().startsWith(File.separator)) {
                // drive-relative Windows path, don't align with project directory but with drive root
                file = file.getAbsoluteFile();
            } else {
                // an ordinary relative path, align with project directory
                file = basedir.resolve(file.getPath())
                        .normalize()
                        .toAbsolutePath()
                        .toFile();
            }
        }
        return file;
    }
}
