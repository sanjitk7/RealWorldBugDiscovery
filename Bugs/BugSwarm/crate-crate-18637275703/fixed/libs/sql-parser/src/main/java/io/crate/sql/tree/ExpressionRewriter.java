/*
 * Licensed to Crate.io GmbH ("Crate") under one or more contributor
 * license agreements.  See the NOTICE file distributed with this work for
 * additional information regarding copyright ownership.  Crate licenses
 * this file to you under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.  You may
 * obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 *
 * However, if you have executed another commercial license agreement
 * with Crate these terms will supersede the license and you may use the
 * software solely pursuant to the terms of the relevant commercial agreement.
 */

package io.crate.sql.tree;

import java.util.Map;

/**
 * This class can be extended to rewrite AST. Override the visit method for the target expression that needs to be
 * re-written with a map entry having the key as the expression used to identify the expression to be re-written and the
 * value as the expression to rewrite with. See {@link RenameColumnTask.ColumnRenameVisitor} as an example.
 */

public abstract class ExpressionRewriter extends DefaultTraversalVisitor<Expression, Map.Entry<Expression, Expression>> {

    protected abstract ExpressionRewriter getInstance();

    @Override
    protected Expression visitComparisonExpression(ComparisonExpression node, Map.Entry<Expression, Expression> context) {
        return new ComparisonExpression(
            node.getType(),
            node.getLeft().accept(getInstance(), context),
            node.getRight().accept(getInstance(), context));
    }

    @Override
    protected Expression visitFunctionCall(FunctionCall node, Map.Entry<Expression, Expression> context) {
        return new FunctionCall(
            node.getName(),
            node.getArguments().stream().map(arg -> arg.accept(getInstance(), context)).toList());
    }

    @Override
    protected Expression visitArithmeticExpression(ArithmeticExpression node, Map.Entry<Expression, Expression> context) {
        return new ArithmeticExpression(
            node.getType(),
            node.getLeft().accept(getInstance(), context),
            node.getRight().accept(getInstance(), context));
    }

    @Override
    protected Expression visitQualifiedNameReference(QualifiedNameReference node, Map.Entry<Expression, Expression> context) {
        return node;
    }

    @Override
    protected Expression visitSubscriptExpression(SubscriptExpression node, Map.Entry<Expression, Expression> context) {
        return new SubscriptExpression(
            node.base().accept(getInstance(), context),
            node.index().accept(getInstance(), context));
    }
}
