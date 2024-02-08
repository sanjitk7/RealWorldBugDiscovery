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

package io.crate.metadata.doc;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.elasticsearch.Version;
import org.elasticsearch.action.support.IndicesOptions;
import org.elasticsearch.cluster.ClusterState;
import org.elasticsearch.cluster.metadata.IndexMetadata;
import org.elasticsearch.cluster.metadata.IndexNameExpressionResolver;
import org.elasticsearch.cluster.metadata.IndexTemplateMetadata;
import org.elasticsearch.cluster.metadata.MappingMetadata;
import org.elasticsearch.cluster.metadata.Metadata;
import org.elasticsearch.common.inject.Inject;
import org.elasticsearch.common.inject.Singleton;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.index.IndexNotFoundException;
import org.elasticsearch.index.mapper.TypeParsers;
import org.jetbrains.annotations.Nullable;

import io.crate.analyze.NumberOfReplicas;
import io.crate.analyze.ParamTypeHints;
import io.crate.analyze.expressions.ExpressionAnalysisContext;
import io.crate.analyze.expressions.ExpressionAnalyzer;
import io.crate.analyze.relations.FieldProvider;
import io.crate.common.Booleans;
import io.crate.common.collections.Maps;
import io.crate.exceptions.RelationUnknown;
import io.crate.exceptions.UnhandledServerException;
import io.crate.expression.symbol.Symbol;
import io.crate.metadata.ColumnIdent;
import io.crate.metadata.CoordinatorTxnCtx;
import io.crate.metadata.IndexParts;
import io.crate.metadata.IndexReference;
import io.crate.metadata.IndexType;
import io.crate.metadata.NodeContext;
import io.crate.metadata.PartitionName;
import io.crate.metadata.Reference;
import io.crate.metadata.RelationName;
import io.crate.metadata.SimpleReference;
import io.crate.metadata.table.Operation;
import io.crate.replication.logical.metadata.PublicationsMetadata;
import io.crate.sql.parser.SqlParser;
import io.crate.sql.tree.CheckConstraint;
import io.crate.sql.tree.ColumnPolicy;
import io.crate.types.ArrayType;
import io.crate.types.DataType;
import io.crate.types.DataTypes;
import io.crate.types.ObjectType;
import io.crate.types.StorageSupport;

@Singleton
public class DocTableInfoFactory {

    private static final Logger LOGGER = LogManager.getLogger(DocTableInfoFactory.class);

    private final NodeContext nodeCtx;
    private final ExpressionAnalyzer expressionAnalyzer;
    private final CoordinatorTxnCtx systemTransactionContext;

    @Inject
    public DocTableInfoFactory(NodeContext nodeCtx) {
        this.nodeCtx = nodeCtx;
        this.systemTransactionContext = CoordinatorTxnCtx.systemTransactionContext();
        this.expressionAnalyzer = new ExpressionAnalyzer(
            systemTransactionContext,
            nodeCtx,
            ParamTypeHints.EMPTY,
            FieldProvider.UNSUPPORTED,
            null
        );
    }

    public DocTableInfo createNew(RelationName relation, Metadata metadata) {
        String templateName = PartitionName.templateName(relation.schema(), relation.name());
        PublicationsMetadata publicationsMetadata = metadata.custom(PublicationsMetadata.TYPE);
        IndexTemplateMetadata indexTemplateMetadata = metadata.templates().get(templateName);
        Version versionCreated;
        Version versionUpgraded;
        Map<String, Object> mappingSource;
        Settings tableParameters;
        IndexMetadata.State state;
        int numberOfShards;
        String numberOfReplicas;
        if (indexTemplateMetadata == null) {
            IndexMetadata index = metadata.index(relation.indexNameOrAlias());
            if (index == null) {
                throw new RelationUnknown(relation);
            }
            Settings indexSettings = index.getSettings();
            tableParameters = indexSettings;
            versionCreated = IndexMetadata.SETTING_INDEX_VERSION_CREATED.get(indexSettings);
            versionUpgraded = indexSettings.getAsVersion(IndexMetadata.SETTING_VERSION_UPGRADED, null);
            state = index.getState();
            MappingMetadata mapping = index.mapping();
            mappingSource = mapping == null ? Map.of() : mapping.sourceAsMap();
            numberOfShards = index.getNumberOfShards();
            numberOfReplicas = NumberOfReplicas.fromSettings(indexSettings);
        } else {
        }
        Map<String, Object> metaMap = Maps.getOrDefault(mappingSource, "_meta", Map.of());
        Map<String, String> generatedColumns = Maps.getOrDefault(metaMap, "generated_columns", Map.of());
        List<ColumnIdent> partitionedBy = parsePartitionedByStringsList(
            Maps.getOrDefault(metaMap, "partitioned_by", List.of())
        );
        String routing = Maps.get(metaMap, "routing");
        List<ColumnIdent> primaryKeys = getPrimaryKeys(metaMap);
        boolean hasAutoGeneratedPrimaryKey = false;
        if (primaryKeys == null && routing == null && indexTemplateMetadata == null) {
            hasAutoGeneratedPrimaryKey = true;
            primaryKeys = List.of(DocSysColumns.ID);
        }
        Set<ColumnIdent> notNullColumns = getNotNullColumns(metaMap);
        Map<Object, Object> indicesMap = Maps.getOrDefault(metaMap, "indices", Map.of());
        Map<String, Object> properties = Maps.getOrDefault(mappingSource, "properties", Map.of());
        List<CheckConstraint<Symbol>> checkConstraints = getCheckConstraints(metaMap);

        return new DocTableInfo(
            relation,
            columns,
            droppedColumns,
            partitionedByColumns,
            generatedColumns,
            notNullColumns,
            indexColumns,
            references,
            analyzers,
            Maps.get(metaMap, "pk_constraint_name"),
            primaryKeys,
            checkConstraints,
            clusteredBy,
            hasAutoGeneratedPrimaryKey,
            concreteIndices,
            concreteOpenIndices,
            numberOfShards,
            numberOfReplicas,
            tableParameters,
            partitionedBy,
            partitions,
            ColumnPolicy.fromMappingValue(mappingSource.get("dynamic")),
            versionCreated,
            versionUpgraded,
            state == IndexMetadata.State.CLOSE,
            Operation.buildFromIndexSettingsAndState(
                metadata.settings(),
                state,
                publicationsMetadata == null ? false : publicationsMetadata.isPublished(relation)
            )
        );
    }

    private List<CheckConstraint<Symbol>> getCheckConstraints(Map<String, Object> metaMap) {
        Map<String, String> checkConstraints = Maps.get(metaMap, "check_constraints");
        if (checkConstraints == null) {
            return List.of();
        }
        List<CheckConstraint<Symbol>> result = new ArrayList<>(checkConstraints.size());
        for (Entry<String,String> entry : checkConstraints.entrySet()) {
            String name = entry.getKey();
            String expressionStr = entry.getValue();
            Symbol expression = parseExpression(expressionStr);
            var checkConstraint = new CheckConstraint<>(name, null, expression, expressionStr);
            result.add(checkConstraint);
        }
        return result;
    }

    @SuppressWarnings("unchecked")
    private void parseColumns(@Nullable ColumnIdent parent,
                             Map<String, Object> properties) {
        for (Entry<String,Object> entry : properties.entrySet()) {
            String columnName = entry.getKey();
            Map<String, Object> columnProperties = (Map<String, Object>) entry.getValue();
            DataType<?> type = DocIndexMetadata.getColumnDataType(columnProperties);
            ColumnIdent column = parent == null ? new ColumnIdent(columnName) : parent.getChild(columnName);
            columnProperties = innerProperties(columnProperties);

            Symbol defaultExpression = parseExpression(Maps.get(columnProperties, "default_expr"));
            IndexType indexType = getColumnIndexType(columnProperties);

            StorageSupport<?> storageSupport = type.storageSupportSafe();
            boolean docValuesDefault = storageSupport.getComputedDocValuesDefault(indexType);
            String docValues = columnProperties.get(TypeParsers.DOC_VALUES).toString();
            boolean hasDocValues = docValues == null ? docValuesDefault : Booleans.parseBoolean(docValues);

            int position = Maps.getOrDefault(columnProperties, "position", 0);
            Number oidNum = Maps.getOrDefault(columnProperties, "oid", Metadata.COLUMN_OID_UNASSIGNED);
            long oid = oidNum.longValue();
            DataType<?> elementType = ArrayType.unnest(type);

            if (elementType.equals(DataTypes.GEO_SHAPE)) {
                String geoTree = (String) columnProperties.get("tree");
                String precision = (String) columnProperties.get("precision");
                Integer treeLevels = (Integer) columnProperties.get("tree_levels");
                Double distanceErrorPct = (Double) columnProperties.get("distance_error_pct");
            } else if (elementType.id() == ObjectType.ID) {
                ColumnPolicy columnPolicy = ColumnPolicy.fromMappingValue(columnProperties.get("dynamic"));
            } else if (type != DataTypes.NOT_SUPPORTED) {
                // TODO: copy_to

                var indicesKey = oid == Metadata.COLUMN_OID_UNASSIGNED ? column.fqn() : Long.toString(oid);
                if (indicesMap.containsKey(indicesKey)) {
                    List<String> sources = Maps.get(columnProperties, "sources");
                    if (sources != null) {
                        IndexReference.Builder builder = getOrCreateIndexBuilder(newIdent);
                        builder.indexType(indexType)
                            .position(position)
                            .oid(oid)
                            .analyzer((String) columnProperties.get("analyzer"))
                            .sources(sources);
                    }
                } else {
                    Reference ref = new SimpleReference(
                        ident,
                        granularity,
                        type,
                        position,
                        defaultExpression
                    );
                }
            }
        }
    }


    @Nullable
    private Symbol parseExpression(@Nullable String expression) {
        if (expression == null) {
            return null;
        }
        return expressionAnalyzer.convert(
            SqlParser.createExpression(expression),
            new ExpressionAnalysisContext(systemTransactionContext.sessionSettings())
        );
    }

    /**
     * Get the IndexType from columnProperties.
     * <br />
     * Properties might look like:
     * <pre>
     *     {
     *         "type": "integer"
     *     }
     *
     *
     *     {
     *         "type": "text",
     *         "analyzer": "english"
     *     }
     *
     *
     *     {
     *          "type": "text",
     *          "fields": {
     *              "keyword": {
     *                  "type": "keyword",
     *                  "ignore_above": "256"
     *              }
     *          }
     *     }
     *
     *     {
     *         "type": "date",
     *         "index": "no"
     *     }
     *
     *     {
     *          "type": "keyword",
     *          "index": false
     *     }
     * </pre>
     */
    private static IndexType getColumnIndexType(Map<String, Object> columnProperties) {
        Object index = columnProperties.get("index");
        if (index == null) {
            if ("text".equals(columnProperties.get("type"))) {
                return IndexType.FULLTEXT;
            }
            return IndexType.PLAIN;
        }
        if (Boolean.FALSE.equals(index) || "no".equals(index) || "false".equals(index)) {
            return IndexType.NONE;
        }

        if ("not_analyzed".equals(index)) {
            return IndexType.PLAIN;
        }
        return IndexType.FULLTEXT;
    }

    /**
     * Extract `inner` if present, otherwise properties as is.
     * Array types have the mapping for their inner type within `inner`
     **/
    private static Map<String, Object> innerProperties(Map<String, Object> columnProperties) {
        Map<String, Object> inner = Maps.get(columnProperties, "inner");
        return inner == null ? columnProperties : inner;
    }

    @Nullable
    private static List<ColumnIdent> getPrimaryKeys(Map<String, Object> metaMap) {
        Object primaryKeys = metaMap.get("primary_keys");
        if (primaryKeys == null) {
            return null;
        }
        if (primaryKeys instanceof String pkString) {
            return List.of(ColumnIdent.fromPath(pkString));
        }
        if (primaryKeys instanceof Collection<?> keys) {
            List<ColumnIdent> result = new ArrayList<>(keys.size());
            for (Object key : keys) {
                result.add(ColumnIdent.fromPath(key.toString()));
            }
            return result;
        }
        return null;
    }

    private static Set<ColumnIdent> getNotNullColumns(Map<String, Object> metaMap) {
        Map<String, Object> constraintsMap = Maps.get(metaMap, "constraints");
        if (constraintsMap == null) {
            return Set.of();
        }
        HashSet<ColumnIdent> result = new HashSet<>();
        Collection<Object> notNullCols = Maps.getOrDefault(constraintsMap, "not_null", List.of());
        for (Object notNullColumn : notNullCols) {
            result.add(ColumnIdent.fromPath(notNullColumn.toString()));
        }
        return result;
    }

    private static List<ColumnIdent> parsePartitionedByStringsList(List<List<String>> partitionedByList) {
        ArrayList<ColumnIdent> builder = new ArrayList<>();
        for (List<String> partitionedByInfo : partitionedByList) {
            builder.add(ColumnIdent.fromPath(partitionedByInfo.get(0)));
        }
        return List.copyOf(builder);
    }

    public DocTableInfo create(RelationName relation, ClusterState state) {
        var metadata = state.metadata();
        PublicationsMetadata publicationsMetadata = metadata.custom(PublicationsMetadata.TYPE);

        DocIndexMetadata docIndexMetadata;
        String[] concreteIndices;
        String[] concreteOpenIndices;
        String templateName = PartitionName.templateName(relation.schema(), relation.name());
        if (metadata.templates().containsKey(templateName)) {
            docIndexMetadata = buildDocIndexMetadataFromTemplate(
                metadata,
                publicationsMetadata,
                relation,
                templateName
            );
            // We need all concrete indices, regardless of their state, for operations such as reopening.
            concreteIndices = IndexNameExpressionResolver.concreteIndexNames(
                metadata,
                IndicesOptions.lenientExpandOpen(),
                relation.indexNameOrAlias()
            );
            // We need all concrete open indices, as closed indices must not appear in the routing.
            concreteOpenIndices = IndexNameExpressionResolver.concreteIndexNames(
                metadata,
                IndicesOptions.fromOptions(true, true, true, false, IndicesOptions.strictExpandOpenAndForbidClosed()),
                relation.indexNameOrAlias()
            );
        } else {
            try {
                concreteIndices = IndexNameExpressionResolver.concreteIndexNames(
                    metadata, IndicesOptions.strictExpandOpen(), relation.indexNameOrAlias());
                concreteOpenIndices = concreteIndices;
                if (concreteIndices.length == 0) {
                    // no matching index found
                    throw new RelationUnknown(relation);
                }
                docIndexMetadata = buildDocIndexMetadata(metadata, publicationsMetadata, relation, concreteIndices[0]);
            } catch (IndexNotFoundException ex) {
                throw new RelationUnknown(relation.fqn(), ex);
            }
        }
        List<PartitionName> partitions = buildPartitions(
            relation,
            concreteIndices,
            docIndexMetadata
        );
        return new DocTableInfo(
            relation,
            docIndexMetadata.columns(),
            docIndexMetadata.droppedColumns(),
            docIndexMetadata.partitionedByColumns(),
            docIndexMetadata.generatedColumnReferences(),
            docIndexMetadata.notNullColumns(),
            docIndexMetadata.indices(),
            docIndexMetadata.references(),
            docIndexMetadata.analyzers(),
            docIndexMetadata.pkConstraintName(),
            docIndexMetadata.primaryKey(),
            docIndexMetadata.checkConstraints(),
            docIndexMetadata.routingCol(),
            docIndexMetadata.hasAutoGeneratedPrimaryKey(),
            concreteIndices,
            concreteOpenIndices,
            docIndexMetadata.numberOfShards(), docIndexMetadata.numberOfReplicas(),
            docIndexMetadata.tableParameters(),
            docIndexMetadata.partitionedBy(),
            partitions,
            docIndexMetadata.columnPolicy(),
            docIndexMetadata.versionCreated(),
            docIndexMetadata.versionUpgraded(),
            docIndexMetadata.isClosed(),
            docIndexMetadata.supportedOperations());
    }

    private DocIndexMetadata buildDocIndexMetadata(Metadata metadata,
                                                   PublicationsMetadata publicationsMetadata,
                                                   RelationName relation,
                                                   String concreteIndex) {
        DocIndexMetadata docIndexMetadata;
        IndexMetadata indexMetadata = metadata.index(concreteIndex);
        try {
            docIndexMetadata = new DocIndexMetadata(
                nodeCtx,
                indexMetadata,
                relation,
                publicationsMetadata);
        } catch (Exception e) {
            throw new UnhandledServerException("Unable to build DocIndexMetadata", e);
        }
        try {
            return docIndexMetadata.build();
        } catch (Exception e) {
            try {
                LOGGER.error(
                    "Could not build DocIndexMetadata from: {}", indexMetadata.mapping().sourceAsMap());
            } catch (Exception ignored) {
            }
            throw e;
        }
    }

    private DocIndexMetadata buildDocIndexMetadataFromTemplate(Metadata metadata,
                                                               PublicationsMetadata publicationsMetadata,
                                                               RelationName relation,
                                                               String templateName) {
        IndexTemplateMetadata indexTemplateMetadata = metadata.templates().get(templateName);
        DocIndexMetadata docIndexMetadata;
        try {
            IndexMetadata.Builder builder = new IndexMetadata.Builder(relation.indexNameOrAlias());
            builder.putMapping(indexTemplateMetadata.mapping().toString());

            Settings.Builder settingsBuilder = Settings.builder()
                .put(indexTemplateMetadata.settings());
            if (indexTemplateMetadata.settings().get(IndexMetadata.SETTING_VERSION_CREATED) == null) {
                settingsBuilder.put(IndexMetadata.SETTING_VERSION_CREATED, Version.CURRENT);
            }

            Settings settings = settingsBuilder.build();
            builder.settings(settings);
            builder.numberOfShards(settings.getAsInt(IndexMetadata.SETTING_NUMBER_OF_SHARDS, 5));
            builder.numberOfReplicas(settings.getAsInt(IndexMetadata.SETTING_NUMBER_OF_REPLICAS, 1));
            docIndexMetadata = new DocIndexMetadata(nodeCtx, builder.build(), relation, publicationsMetadata);
        } catch (IOException e) {
            throw new UnhandledServerException("Unable to build DocIndexMetadata from template", e);
        }
        return docIndexMetadata.build();
    }

    private static List<PartitionName> buildPartitions(RelationName relation,
                                                       String[] concreteIndices,
                                                       DocIndexMetadata md) {
        if (md.partitionedBy().isEmpty()) {
            return List.of();
        }
        List<PartitionName> partitions = new ArrayList<>();
        for (String indexName : concreteIndices) {
            if (IndexParts.isPartitioned(indexName)) {
                try {
                    PartitionName partitionName = PartitionName.fromIndexOrTemplate(indexName);
                    assert partitionName.relationName().equals(relation) : "ident must equal partitionName";
                    partitions.add(partitionName);
                } catch (IllegalArgumentException e) {
                    // ignore
                    LOGGER.warn(String.format(Locale.ENGLISH, "Cannot build partition %s of index %s", indexName, relation.indexNameOrAlias()));
                }
            }
        }
        return partitions;
    }
}
