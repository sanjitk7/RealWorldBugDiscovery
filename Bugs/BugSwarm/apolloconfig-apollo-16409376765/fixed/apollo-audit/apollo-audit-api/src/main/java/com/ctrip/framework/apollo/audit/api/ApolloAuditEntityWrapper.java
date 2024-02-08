/*
 * Copyright 2023 Apollo Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package com.ctrip.framework.apollo.audit.api;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class ApolloAuditEntityWrapper {

  private String entityName;

  private List<Field> dataInfluenceFields;

  private Field entityIdField;

  public ApolloAuditEntityWrapper() {
    this.dataInfluenceFields = new ArrayList<>();
  }

  public ApolloAuditEntityWrapper entityName(String val) {
    this.entityName = val;
    return this;
  }

  public ApolloAuditEntityWrapper entityIdField(Field f) {
    this.entityIdField = f;
    return this;
  }

  public ApolloAuditEntityWrapper dataInfluenceFields(List<Field> val) {
    this.dataInfluenceFields = val;
    return this;
  }

  public ApolloAuditEntityWrapper addDataInfluenceFields(Field f) {
    this.dataInfluenceFields.add(f);
    return this;
  }

  public String getEntityName() {
    return entityName;
  }

  public Field getEntityIdField() {
    return entityIdField;
  }

  public List<Field> getDataInfluenceFields() {
    return dataInfluenceFields;
  }
}
