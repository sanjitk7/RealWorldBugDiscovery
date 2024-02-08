/*
 * Copyright 2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.hateoas.hal.forms;

import static com.fasterxml.jackson.annotation.JsonInclude.*;
import static org.springframework.hateoas.hal.Jackson2HalModule.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lombok.Builder;
import lombok.Data;
import lombok.Singular;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.hal.forms.HalFormsDeserializers.HalFormsDocumentDeserializer;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * Represents a HAL-Forms document.
 * 
 * @author Dietrich Schulten
 * @author Greg Turnquist
 */
@Data
@Builder(builderMethodName = "halFormsDocument")
@JsonPropertyOrder({ "content", "links", "templates" })
@JsonDeserialize(using = HalFormsDocumentDeserializer.class)
public class HalFormsDocument {

	@JsonUnwrapped
	private Object content;

	@Singular private List<Link> links;

	@Singular private Map<String, Template> templates;

	HalFormsDocument(Object content, List<Link> links, Map<String, Template> templates) {

		this.content = content;
		this.links = links;
		this.templates = templates;
	}

	HalFormsDocument() {
		this(null, new ArrayList<Link>(), new HashMap<String, Template>());
	}

	@JsonInclude(Include.NON_NULL)
	public Object getContent() {
		return this.content;
	}

	@JsonProperty("_links")
	@JsonInclude(Include.NON_EMPTY)
	@JsonSerialize(using = HalLinkListSerializer.class)
	@JsonDeserialize(using = HalLinkListDeserializer.class)
	public List<Link> getLinks() {
		return this.links;
	}

	@JsonProperty("_templates")
	@JsonInclude(Include.NON_EMPTY)
	public Map<String, Template> getTemplates() {
		return this.templates;
	}

	@JsonIgnore
	public Template getTemplate() {
		return getTemplate(Template.DEFAULT_KEY);
	}

	@JsonIgnore
	public Template getTemplate(String key) {
		return this.templates.get(key);
	}
}
