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

package io.crate.execution.ddl.tables;

import static io.crate.metadata.cluster.AlterTableClusterStateExecutor.resolveIndices;
import static io.crate.metadata.cluster.DDLClusterStateHelpers.parseMapping;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.Function;

import org.elasticsearch.cluster.ClusterState;
import org.elasticsearch.cluster.metadata.IndexMetadata;
import org.elasticsearch.cluster.metadata.IndexTemplateMetadata;
import org.elasticsearch.cluster.metadata.MappingMetadata;
import org.elasticsearch.cluster.metadata.Metadata;
import org.elasticsearch.common.Strings;
import org.elasticsearch.common.xcontent.json.JsonXContent;
import org.elasticsearch.index.Index;
import org.elasticsearch.index.mapper.DocumentMapper;
import org.elasticsearch.index.mapper.MapperService;

import io.crate.analyze.AlterTableRenameColumnAnalyzer;
import io.crate.analyze.AnalyzedAlterTableRenameColumn;
import io.crate.analyze.ParamTypeHints;
import io.crate.analyze.expressions.ExpressionAnalysisContext;
import io.crate.analyze.expressions.ExpressionAnalyzer;
import io.crate.common.CheckedFunction;
import io.crate.expression.symbol.Symbol;
import io.crate.expression.symbol.format.Style;
import io.crate.metadata.ColumnIdent;
import io.crate.metadata.CoordinatorTxnCtx;
import io.crate.metadata.NodeContext;
import io.crate.metadata.PartitionName;
import io.crate.metadata.cluster.DDLClusterStateTaskExecutor;
import io.crate.metadata.doc.DocTableInfo;
import io.crate.metadata.doc.DocTableInfoFactory;
import io.crate.sql.ExpressionFormatter;
import io.crate.sql.parser.SqlParser;
import io.crate.sql.tree.Expression;
import io.crate.sql.tree.ExpressionRewriter;
import io.crate.sql.tree.QualifiedNameReference;
import io.crate.sql.tree.SubscriptExpression;

public class RenameColumnTask extends DDLClusterStateTaskExecutor<RenameColumnRequest> {

    private final NodeContext nodeContext;
    private final CheckedFunction<IndexMetadata, MapperService, IOException> createMapperService;

    public RenameColumnTask(NodeContext nodeContext,
                            CheckedFunction<IndexMetadata, MapperService, IOException> createMapperService) {
        this.nodeContext = nodeContext;
        this.createMapperService = createMapperService;
    }

    @Override
    protected ClusterState execute(ClusterState currentState, RenameColumnRequest request) throws Exception {
        var renameColumn = request.renameColumn();
        var relationName = request.relationName();

        var docTableInfoFactory = new DocTableInfoFactory(nodeContext);
        DocTableInfo docTableInfo = docTableInfoFactory.create(relationName, currentState);
        var txnCtx = CoordinatorTxnCtx.systemTransactionContext();
        ExpressionAnalyzer expressionAnalyzer = new ExpressionAnalyzer(
            txnCtx, nodeContext, ParamTypeHints.EMPTY, new AlterTableRenameColumnAnalyzer.FieldProviderResolvesUnknownColumns(docTableInfo), null);
        ExpressionAnalysisContext expressionAnalysisContext = new ExpressionAnalysisContext(txnCtx.sessionSettings());
        Function<Expression, Symbol> toSymbol = expr -> expressionAnalyzer.convert(expr, expressionAnalysisContext);

        // validate the source column has not been modified and the target name has not been taken since the analysis.
        var refToRename = renameColumn.refToRename();
        if (!refToRename.equals(docTableInfo.getReference(refToRename.column()))) {
            throw new IllegalStateException(String.format(Locale.ENGLISH, "The column %s has been modified while renaming", refToRename));
        }
        if (docTableInfo.getReference(renameColumn.newName()) != null) {
            throw new IllegalArgumentException("Cannot rename column to a name that is in use");
        }

        Metadata.Builder metadataBuilder = Metadata.builder(currentState.metadata());
        String templateName = PartitionName.templateName(relationName.schema(), relationName.name());
        IndexTemplateMetadata indexTemplateMetadata = currentState.metadata().templates().get(templateName);
        if (indexTemplateMetadata != null) {
            // Partitioned table
            var templateMapping = parseMapping(indexTemplateMetadata.mapping().toString());
            renameKeys(templateMapping, renameColumn, toSymbol);
            metadataBuilder.put(
                new IndexTemplateMetadata.Builder(indexTemplateMetadata)
                    .putMapping(Strings.toString(JsonXContent.builder().map(templateMapping)))
                    .build());
        }

        currentState = updateMapping(
            currentState,
            metadataBuilder,
            relationName.indexNameOrAlias(),
            renameColumn,
            toSymbol);
        // ensure the table can still be parsed into a DocTableInfo to avoid breaking the table.
        docTableInfoFactory.create(relationName, currentState);
        return currentState;
    }

    private ClusterState updateMapping(ClusterState currentState,
                                       Metadata.Builder metadataBuilder,
                                       String indexName,
                                       AnalyzedAlterTableRenameColumn.RenameColumn renameColumn,
                                       Function<Expression, Symbol> toSymbol) throws IOException {
        Index[] concreteIndices = resolveIndices(currentState, indexName);

        for (Index index : concreteIndices) {
            final IndexMetadata indexMetadata = currentState.metadata().getIndexSafe(index);

            Map<String, Object> indexMapping = indexMetadata.mapping().sourceAsMap();

            indexMapping = renameKeys(indexMapping, renameColumn, toSymbol);

            MapperService mapperService = createMapperService.apply(indexMetadata);

            DocumentMapper mapper = mapperService.merge(indexMapping, MapperService.MergeReason.MAPPING_UPDATE);

            IndexMetadata.Builder imBuilder = IndexMetadata.builder(indexMetadata);
            imBuilder.putMapping(new MappingMetadata(mapper.mappingSource())).mappingVersion(1 + imBuilder.mappingVersion());

            metadataBuilder.put(imBuilder); // implicitly increments metadata version.
        }

        return ClusterState.builder(currentState).metadata(metadataBuilder).build();
    }

    @SuppressWarnings("unchecked")
    public static Map<String, Object> renameKeys(Map<String, Object> mapping,
                                                 AnalyzedAlterTableRenameColumn.RenameColumn renameColumn,
                                                 Function<Expression, Symbol> toSymbol) {
        var src = renameColumn.refToRename().column();
        List<String> srcPaths = new ArrayList<>(src.path());
        srcPaths.addFirst(src.name());
        if (mapping.containsKey("default")) {
            mapping = (Map<String, Object>) mapping.get("default");
        }
        var m = (Map<String, Object>) mapping.get("_meta");
        renameKeysFromPartitionedBy(m, renameColumn);
        renameKeysFromPrimaryKeys(m, renameColumn);
        renameKeysFromCheckConstraints(m, renameColumn);
        renameKeysFromGeneratedExpressions(m, renameColumn, toSymbol);

        m = (Map<String, Object>) mapping.get("properties");
        for (int i = 0; i < srcPaths.size() - 1; i++) {
            m = (Map<String, Object>) m.get(srcPaths.get(i));
            m = (Map<String, Object>) m.get("properties");
        }
        var val = m.remove(srcPaths.getLast());
        m.put(renameColumn.newName().leafName(), val);
        return mapping;
    }

    @SuppressWarnings("unchecked")
    private static void renameKeysFromPartitionedBy(Map<String, Object> mapping,
                                                    AnalyzedAlterTableRenameColumn.RenameColumn renameColumn) {
        ColumnIdent colToRename = renameColumn.refToRename().column();
        ColumnIdent newName = renameColumn.newName();

        List<List<String>> partitionedByCols = (List<List<String>>) mapping.get("partitioned_by");
        List<List<String>> renamedPartitionedByCols = new ArrayList<>();

        for (var partitionedBy : partitionedByCols) {
            // Partitioned by columns are stored as i.e. `o.a` not `o['a']` such that it cannot be re-parsed as expressions.
            // That is why the renaming is done in strings instead of using ColumnRenameVisitor.
            ColumnIdent currPartitionByCol = ColumnIdent.fromPath(partitionedBy.get(0));
            if (colToRename.equals(currPartitionByCol)) {
                renamedPartitionedByCols.add(List.of(newName.fqn(), partitionedBy.get(1)));
            } else {
                boolean parentRenamed = false;
                for (ColumnIdent currPartitionedByParentCol = currPartitionByCol.getParent();
                     currPartitionedByParentCol != null;
                     currPartitionedByParentCol = currPartitionedByParentCol.getParent()) {
                    if (colToRename.equals(currPartitionedByParentCol)) {
                        renamedPartitionedByCols.add(
                            List.of(
                                currPartitionByCol.fqn().replaceFirst(colToRename.fqn(), newName.fqn()),
                                partitionedBy.get(1)));
                        parentRenamed = true;
                        break;
                    }
                }
                if (!parentRenamed) {
                    renamedPartitionedByCols.add(partitionedBy);
                }
            }
            mapping.put("partitioned_by", renamedPartitionedByCols);
        }
    }

    @SuppressWarnings("unchecked")
    private static void renameKeysFromPrimaryKeys(Map<String, Object> mapping,
                                                  AnalyzedAlterTableRenameColumn.RenameColumn renameColumn) {
        ColumnIdent colToRename = renameColumn.refToRename().column();
        ColumnIdent newName = renameColumn.newName();

        List<String> primaryKeys = (List<String>) mapping.remove("primary_keys");
        List<String> renamed = new ArrayList<>(primaryKeys.size());

        for (String primaryKey : primaryKeys) {
            // Primary keys are stored as i.e. `o.a` not `o['a']` such that it cannot be re-parsed as expressions.
            // That is why the renaming is done in strings instead of using ColumnRenameVisitor.
            ColumnIdent pKCol = ColumnIdent.fromPath(primaryKey);
            if (colToRename.equals(pKCol)) {
                renamed.add(newName.fqn());
            } else {
                boolean parentRenamed = false;
                for (ColumnIdent currPkParentCol = pKCol.getParent();
                     currPkParentCol != null;
                     currPkParentCol = currPkParentCol.getParent()) {
                    if (colToRename.equals(currPkParentCol)) {
                        renamed.add(pKCol.fqn().replaceFirst(colToRename.fqn(), newName.fqn()));
                        parentRenamed = true;
                        break;
                    }
                }
                if (!parentRenamed) {
                    renamed.add(primaryKey);
                }
            }
        }
        mapping.put("primary_keys", renamed);
    }

    @SuppressWarnings("unchecked")
    private static void renameKeysFromCheckConstraints(Map<String, Object> mapping,
                                                       AnalyzedAlterTableRenameColumn.RenameColumn renameColumn) {
        var oldNameToNewName = Map.entry(
            SqlParser.createExpression(renameColumn.refToRename().column().sqlFqn()),
            SqlParser.createExpression(renameColumn.newName().sqlFqn()));
        var checks = (Map<String, String>) mapping.get("check_constraints");
        var renamedChecks = new LinkedHashMap<String, String>();
        for (var e : checks.entrySet()) {
            var checkExpr = SqlParser.createExpression(e.getValue());
            var renamedCheckExpr = checkExpr.accept(ColumnRenameVisitor.INSTANCE, oldNameToNewName);
            renamedChecks.put(
                e.getKey(),
                // This is how check constraints in string format are obtained,
                // see CheckConstraint#expressionStr.
                ExpressionFormatter.formatStandaloneExpression(renamedCheckExpr));
        }
        mapping.put("check_constraints", renamedChecks);
    }

    @SuppressWarnings("unchecked")
    private static void renameKeysFromGeneratedExpressions(Map<String, Object> mapping,
                                                           AnalyzedAlterTableRenameColumn.RenameColumn renameColumn,
                                                           Function<Expression, Symbol> toSymbol) {
        var oldNameToNewName = Map.entry(
            SqlParser.createExpression(renameColumn.refToRename().column().sqlFqn()),
            SqlParser.createExpression(renameColumn.newName().sqlFqn()));
        var generatedColumns = (Map<String, String>) mapping.get("generated_columns");
        var renamedGeneratedColumns = new LinkedHashMap<String, String>();
        for (var e : generatedColumns.entrySet()) {
            var genExpr = SqlParser.createExpression(e.getValue());
            var renamedGenExpr = genExpr.accept(ColumnRenameVisitor.INSTANCE, oldNameToNewName);
            renamedGeneratedColumns.put(
                e.getKey(),
                // This is how the generated expressions in string format are obtained,
                // see GeneratedReference#formattedGeneratedExpression.
                toSymbol.apply(renamedGenExpr).toString(Style.UNQUALIFIED));
        }
        mapping.put("generated_columns", renamedGeneratedColumns);
    }

    /* Renames any columns within the expression. */
    private static class ColumnRenameVisitor extends ExpressionRewriter {

        public static final ColumnRenameVisitor INSTANCE = new ColumnRenameVisitor();

        @Override
        protected ExpressionRewriter getInstance() {
            return INSTANCE;
        }

        @Override
        protected Expression visitQualifiedNameReference(QualifiedNameReference node, Map.Entry<Expression, Expression> context) {
            if (context.getKey().equals(node)) {
                return context.getValue();
            }
            return node;
        }

        @Override
        protected Expression visitSubscriptExpression(SubscriptExpression node, Map.Entry<Expression, Expression> context) {
            if (context.getKey().equals(node)) {
                return context.getValue();
            }
            if (context.getKey().equals(node.base())) {
                return new SubscriptExpression(
                    node.base().accept(INSTANCE, context),
                    node.index());
            }
            return node;
        }
    }
}
