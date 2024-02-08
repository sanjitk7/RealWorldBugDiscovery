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
package org.apache.maven.internal.transformation;

import javax.annotation.PreDestroy;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import javax.xml.stream.XMLStreamException;

import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.stream.Collectors;

import org.apache.maven.api.Repository;
import org.apache.maven.api.model.DistributionManagement;
import org.apache.maven.api.model.Model;
import org.apache.maven.api.model.ModelBase;
import org.apache.maven.api.model.Profile;
import org.apache.maven.api.services.Source;
import org.apache.maven.api.spi.ModelParser;
import org.apache.maven.feature.Features;
import org.apache.maven.model.building.ModelSourceTransformer;
import org.apache.maven.model.building.TransformerContext;
import org.apache.maven.model.building.TransformerException;
import org.apache.maven.model.v4.MavenModelVersion;
import org.apache.maven.model.v4.MavenStaxReader;
import org.apache.maven.model.v4.MavenStaxWriter;
import org.apache.maven.project.MavenProject;
import org.apache.maven.project.artifact.ProjectArtifact;
import org.eclipse.aether.RepositorySystemSession;
import org.eclipse.aether.artifact.Artifact;
import org.eclipse.aether.artifact.DefaultArtifact;
import org.eclipse.aether.deployment.DeployRequest;
import org.eclipse.aether.installation.InstallRequest;

/**
 * Consumer POM transformer.
 *
 * @since TBD
 */
@Singleton
@Named("consumer-pom")
public final class ConsumerPomArtifactTransformer {

    private static final String BOM_PACKAGING = "bom";

    public static final String POM_PACKAGING = "pom";

    private static final String CONSUMER_POM_CLASSIFIER = "consumer";

    private static final String BUILD_POM_CLASSIFIER = "build";

    private static final String NAMESPACE_FORMAT = "http://maven.apache.org/POM/%s";

    private static final String SCHEMA_LOCATION_FORMAT = "https://maven.apache.org/xsd/maven-%s.xsd";

    private final Set<Path> toDelete = new CopyOnWriteArraySet<>();

    private final Map<String, ModelParser> modelParsers;

    private final ModelSourceTransformer transformer;

    @Inject
    ConsumerPomArtifactTransformer(Map<String, ModelParser> modelParsers, ModelSourceTransformer transformer) {
        this.modelParsers = modelParsers;
        this.transformer = transformer;
    }

    public void injectTransformedArtifacts(MavenProject project, RepositorySystemSession session) throws IOException {
        if (project.getFile() == null) {
            // If there is no build POM there is no reason to inject artifacts for the consumer POM.
            return;
        }
        if (isActive(session)) {
            Path buildDir =
                    project.getBuild() != null ? Paths.get(project.getBuild().getDirectory()) : null;
            if (buildDir != null) {
                Files.createDirectories(buildDir);
            }
            Path consumer = buildDir != null
                    ? Files.createTempFile(buildDir, CONSUMER_POM_CLASSIFIER + "-", ".pom")
                    : Files.createTempFile(CONSUMER_POM_CLASSIFIER + "-", ".pom");
            deferDeleteFile(consumer);
            TransformerContext context = (TransformerContext) session.getData().get(TransformerContext.KEY);
            project.addAttachedArtifact(createConsumerPomArtifact(project, consumer, context));
        } else if (project.getModel().isRoot()) {
            throw new IllegalStateException(
                    "The use of the root attribute on the model requires the buildconsumer feature to be active");
        }
    }

    public ConsumerPomArtifact createConsumerPomArtifact(
            MavenProject project, Path consumer, TransformerContext context) {
        return new ConsumerPomArtifact(project, consumer, context);
    }

    private void deferDeleteFile(Path generatedFile) {
        toDelete.add(generatedFile.toAbsolutePath());
    }

    @PreDestroy
    private void doDeleteFiles() {
        for (Path file : toDelete) {
            try {
                Files.delete(file);
            } catch (IOException e) {
                // ignore, we did our best...
            }
        }
    }

    public InstallRequest remapInstallArtifacts(RepositorySystemSession session, InstallRequest request) {
        if (isActive(session) && consumerPomPresent(request.getArtifacts())) {
            request.setArtifacts(replacePom(request.getArtifacts()));
        }
        return request;
    }

    public DeployRequest remapDeployArtifacts(RepositorySystemSession session, DeployRequest request) {
        if (isActive(session) && consumerPomPresent(request.getArtifacts())) {
            request.setArtifacts(replacePom(request.getArtifacts()));
        }
        return request;
    }

    private boolean isActive(RepositorySystemSession session) {
        return Features.buildConsumer(session.getUserProperties()).isActive();
    }

    private boolean consumerPomPresent(Collection<Artifact> artifacts) {
        return artifacts.stream()
                .anyMatch(a -> "pom".equals(a.getExtension()) && CONSUMER_POM_CLASSIFIER.equals(a.getClassifier()));
    }

    private Collection<Artifact> replacePom(Collection<Artifact> artifacts) {
        Artifact consumer = null;
        Artifact main = null;
        for (Artifact artifact : artifacts) {
            if ("pom".equals(artifact.getExtension())) {
                if (CONSUMER_POM_CLASSIFIER.equals(artifact.getClassifier())) {
                    consumer = artifact;
                } else if ("".equals(artifact.getClassifier())) {
                    main = artifact;
                }
            }
        }
        if (main != null && consumer != null) {
            ArrayList<Artifact> result = new ArrayList<>(artifacts);
            result.remove(main);
            result.remove(consumer);
            result.add(new DefaultArtifact(
                    consumer.getGroupId(),
                    consumer.getArtifactId(),
                    "",
                    consumer.getExtension(),
                    consumer.getVersion(),
                    consumer.getProperties(),
                    consumer.getFile()));
            result.add(new DefaultArtifact(
                    main.getGroupId(),
                    main.getArtifactId(),
                    BUILD_POM_CLASSIFIER,
                    main.getExtension(),
                    main.getVersion(),
                    main.getProperties(),
                    main.getFile()));
            artifacts = result;
        }
        return artifacts;
    }

    /**
     * Consumer POM is transformed from original POM.
     */
    class ConsumerPomArtifact extends TransformedArtifact {

        private MavenProject project;
        private TransformerContext context;

        ConsumerPomArtifact(MavenProject mavenProject, Path target, TransformerContext context) {
            super(
                    new ProjectArtifact(mavenProject),
                    () -> mavenProject.getFile().toPath(),
                    CONSUMER_POM_CLASSIFIER,
                    "pom",
                    target);
            this.project = mavenProject;
            this.context = context;
        }

        @Override
        public void transform(Path src, Path dest) {
            Model model = project.getModel().getDelegate();
            transform(src, dest, model);
        }

        void transform(Path src, Path dest, Model model) {
            Model consumer;
            String version;

            String packaging = model.getPackaging();
            if (POM_PACKAGING.equals(packaging)) {
                ModelParser parser = null;
                Source source = null;
                for (ModelParser p : modelParsers.values()) {
                    source = p.locate(src.getParent()).orElse(null);
                    if (source != null && src.equals(source.getPath())) {
                        parser = p;
                        break;
                    }
                }

                if (source != null) {
                    consumer = parser.parse(source, null);
                } else {
                    try (InputStream is = Files.newInputStream(src)) {
                        consumer = new MavenStaxReader().read(is);
                    } catch (Exception e) {
                        throw new IllegalStateException("Unable to read POM " + src, e);
                    }
                }
                // file to raw transformation
                org.apache.maven.model.Model m = new org.apache.maven.model.Model(consumer);
                try {
                    transformer.transform(src, context, m);
                } catch (TransformerException e) {
                    throw new IllegalStateException("Unable to transform POM " + src, e);
                }
                consumer = m.getDelegate();
                // raw to consumer transform
                consumer = consumer.withRoot(false).withModules(null);
                if (consumer.getParent() != null) {
                    consumer = consumer.withParent(consumer.getParent().withRelativePath(null));
                }

                if (!consumer.isPreserveModelVersion()) {
                    consumer = consumer.withPreserveModelVersion(false);
                    version = new MavenModelVersion().getModelVersion(consumer);
                    consumer = consumer.withModelVersion(version);
                } else {
                    version = consumer.getModelVersion();
                }
            } else {
                Model.Builder builder = prune(
                        Model.newBuilder(model, true)
                                .preserveModelVersion(false)
                                .root(false)
                                .parent(null)
                                .build(null),
                        model);
                boolean isBom = BOM_PACKAGING.equals(packaging);
                if (isBom) {
                    builder.packaging(POM_PACKAGING);
                }
                builder.profiles(model.getProfiles().stream()
                        .map(p -> prune(Profile.newBuilder(p, true), p).build())
                        .collect(Collectors.toList()));
                consumer = builder.build();
                version = new MavenModelVersion().getModelVersion(consumer);
                consumer = consumer.withModelVersion(version);
            }

            try {
                Files.createDirectories(dest.getParent());
                try (Writer w = Files.newBufferedWriter(dest)) {
                    MavenStaxWriter writer = new MavenStaxWriter();
                    writer.setNamespace(String.format(NAMESPACE_FORMAT, version));
                    writer.setSchemaLocation(String.format(SCHEMA_LOCATION_FORMAT, version));
                    writer.setAddLocationInformation(false);
                    writer.write(w, consumer);
                }
            } catch (XMLStreamException | IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private static <T extends ModelBase.Builder> T prune(T builder, ModelBase model) {
        builder.properties(null).reporting(null);
        if (model.getDistributionManagement() != null
                && model.getDistributionManagement().getRelocation() != null) {
            // keep relocation only
            builder.distributionManagement(DistributionManagement.newBuilder()
                    .relocation(model.getDistributionManagement().getRelocation())
                    .build());
        }
        // only keep repositories others than 'central'
        builder.pluginRepositories(pruneRepositories(model.getPluginRepositories()));
        builder.repositories(pruneRepositories(model.getRepositories()));
        return builder;
    }

    private static List<org.apache.maven.api.model.Repository> pruneRepositories(
            List<org.apache.maven.api.model.Repository> repositories) {
        return repositories.stream()
                .filter(r -> !Repository.CENTRAL_ID.equals(r.getId()))
                .collect(Collectors.toList());
    }
}
