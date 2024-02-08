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
package org.sonar.plugins.xml;

import com.google.common.base.Charsets;
import org.junit.Test;
import org.sonar.plugins.xml.parsers.LineCountParser;

import java.io.File;

import static org.fest.assertions.Assertions.assertThat;

public class LineCountDataTest {

  @Test
  public void test_updateAccordingTo_a_delta() throws Exception {
    LineCountData data = new LineCountParser(new File("src/test/resources/parsers/linecount/simple.xml"), Charsets.UTF_8)
      .getLineCountData();

    data.updateAccordingTo(3);

    assertThat(data.effectiveCommentLines()).containsOnly(6);
    assertThat(data.linesNumber()).isEqualTo(21);
    assertThat(data.linesOfCodeLines()).hasSize(15);
    assertThat(data.linesOfCodeLines()).containsOnly(4, 7, 8, 9, 10, 11, 12, 13, 15, 16, 17, 18, 19, 20, 21);
  }

}
