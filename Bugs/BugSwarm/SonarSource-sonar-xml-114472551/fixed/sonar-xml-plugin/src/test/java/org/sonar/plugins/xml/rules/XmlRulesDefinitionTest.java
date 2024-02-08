/*
 * SonarQube XML Plugin
 * Copyright (C) 2010-2016 SonarSource SA
 * mailto:contact AT sonarsource DOT com
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package org.sonar.plugins.xml.rules;

import static org.fest.assertions.Assertions.assertThat;

import org.junit.Test;
import org.sonar.api.server.rule.RulesDefinition;
import org.sonar.api.server.rule.RulesDefinition.Rule;
import org.sonar.plugins.xml.checks.CheckRepository;

public class XmlRulesDefinitionTest {

  @Test
  public void test() {
    XmlRulesDefinition rulesDefinition = new XmlRulesDefinition();
    RulesDefinition.Context context = new RulesDefinition.Context();
    rulesDefinition.define(context);
    RulesDefinition.Repository repository = context.repository("xml");

    assertThat(repository.name()).isEqualTo("SonarQube");
    assertThat(repository.language()).isEqualTo("xml");
    assertThat(repository.rules()).hasSize(CheckRepository.getChecks().size());

    RulesDefinition.Rule alertUseRule = repository.rule("IndentCheck");
    assertThat(alertUseRule).isNotNull();
    assertThat(alertUseRule.name()).isEqualTo("Source code should be indented consistently");

    for (Rule rule : repository.rules()) {
      for (RulesDefinition.Param param : rule.params()) {
        assertThat(param.description()).as("description for " + param.key()).isNotEmpty();
      }
    }
  }

}
