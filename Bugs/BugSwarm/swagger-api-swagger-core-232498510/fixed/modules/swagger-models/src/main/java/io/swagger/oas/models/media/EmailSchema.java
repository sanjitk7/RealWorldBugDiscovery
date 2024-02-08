/**
 * Copyright 2017 SmartBear Software
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.swagger.oas.models.media;

import java.util.Objects;
import io.swagger.oas.models.ExternalDocumentation;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * EmailSchema
 */


public class EmailSchema extends Schema {
  private String type = "string";
  private String format = "email";
  private String _default = null;
  private List<String> _enum = null;

  /**
   * returns the type property from a EmailSchema instance.
   *
   * @return String type
   **/

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public EmailSchema type(String type) {
    this.type = type;
    return this;
  }

  /**
   * returns the format property from a EmailSchema instance.
   *
   * @return String format
   **/

  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  public EmailSchema format(String format) {
    this.format = format;
    return this;
  }

  /**
   * returns the _default property from a EmailSchema instance.
   *
   * @return String _default
   **/

  public String getDefault() {
    return _default;
  }

  public void setDefault(String _default) {
    this._default = _default;
  }

  public EmailSchema _default(String _default) {
    this._default = _default;
    return this;
  }

  /**
   * returns the _enum property from a EmailSchema instance.
   *
   * @return List&lt;String&gt; _enum
   **/

  public List<String> getEnum() {
    return _enum;
  }

  public void setEnum(List<String> _enum) {
    this._enum = _enum;
  }

  public EmailSchema _enum(List<String> _enum) {
    this._enum = _enum;
    return this;
  }

  public EmailSchema addEnumItem(String _enumItem) {
    if(this._enum == null) {
      this._enum = new ArrayList<String>();
    }
    this._enum.add(_enumItem);
    return this;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailSchema emailSchema = (EmailSchema) o;
    return Objects.equals(this.type, emailSchema.type) &&
        Objects.equals(this.format, emailSchema.format) &&
        Objects.equals(this._default, emailSchema._default) &&
        Objects.equals(this._enum, emailSchema._enum) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, format, _default, _enum, super.hashCode());
  }



  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailSchema {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    _enum: ").append(toIndentedString(_enum)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

