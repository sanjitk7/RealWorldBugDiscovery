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

package io.crate.analyze;

import java.io.IOException;
import java.util.List;
import java.util.function.Consumer;

import org.elasticsearch.common.io.stream.StreamInput;
import org.elasticsearch.common.io.stream.StreamOutput;

import io.crate.expression.symbol.Symbol;
import io.crate.expression.symbol.Symbols;
import io.crate.metadata.Reference;
import io.crate.metadata.doc.DocTableInfo;
import org.elasticsearch.common.io.stream.Writeable;

public record AnalyzedAlterTableDropColumn(DocTableInfo table, List<DropColumn> columns) implements DDLStatement {

    @Override
    public <C, R> R accept(AnalyzedStatementVisitor<C, R> visitor, C context) {
        return visitor.visitAlterTableDropColumn(this, context);
    }

    @Override
    public void visitSymbols(Consumer<? super Symbol> consumer) {
    }

    public record DropColumn(Reference ref, boolean ifExists) implements Writeable {

        public DropColumn(StreamInput in) throws IOException {
            this((Reference) Symbols.fromStream(in), in.readBoolean());
        }

        @Override
        public void writeTo(StreamOutput out) throws IOException {
            Symbols.toStream(ref, out);
            out.writeBoolean(ifExists);
        }
    }
}
