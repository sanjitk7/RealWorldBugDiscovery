package org.sonar.java.checks.helpers;

import com.sonar.sslr.api.typed.ActionParser;
import java.util.List;
import java.util.Collections;
import org.sonar.java.ast.parser.JavaParser;
import org.sonar.java.bytecode.loader.SquidClassLoader;
import org.sonar.java.resolve.SemanticModel;
import org.sonar.plugins.java.api.tree.AssignmentExpressionTree;
import org.sonar.plugins.java.api.tree.ClassTree;
import org.sonar.plugins.java.api.tree.CompilationUnitTree;
import org.sonar.plugins.java.api.tree.ExpressionStatementTree;
import org.sonar.plugins.java.api.tree.ExpressionTree;
import org.sonar.plugins.java.api.tree.IdentifierTree;
import org.sonar.plugins.java.api.tree.MethodTree;
import org.sonar.plugins.java.api.tree.ReturnStatementTree;
import org.sonar.plugins.java.api.tree.StatementTree;
import org.sonar.plugins.java.api.tree.Tree;
import org.sonar.plugins.java.api.tree.VariableTree;

public abstract class JavaParserHelper {
  private final ActionParser<Tree> p = JavaParser.createParser();

  static IdentifierTree variableFromLastReturnStatement(List<StatementTree> statements) {
    return (IdentifierTree) ((ReturnStatementTree) statements.get(statements.size() - 1)).expression();
  }

  static ExpressionTree assignementExpressionFromStatement(StatementTree statement) {
    return ((AssignmentExpressionTree) ((ExpressionStatementTree) statement).expression()).expression();
  }

  static ExpressionTree initializerFromVariableDeclarationStatement(Tree statement) {
    return ((VariableTree) statement).initializer();
  }

  ClassTree classTree(String classBody) {
    CompilationUnitTree compilationUnitTree = (CompilationUnitTree) p.parse(classBody);
    SemanticModel.createFor(compilationUnitTree, new SquidClassLoader(Collections.emptyList()));
    return (ClassTree) compilationUnitTree.types().get(0);
  }

  MethodTree methodTree(String classBody) {
    ClassTree firstType = classTree(classBody);
    return (MethodTree) firstType.members().get(0);
  }

  List<StatementTree> methodBody(String code) {
    return methodTree(code).block().body();
  }

  static String newCode(String... lines) {
    String lineSeparator = System.lineSeparator();
    StringBuilder sb = new StringBuilder("class A {").append(lineSeparator);
    for (String string : lines) {
      sb.append(string).append(lineSeparator);
    }
    return sb.append("}").append(lineSeparator).toString();
  }

}
