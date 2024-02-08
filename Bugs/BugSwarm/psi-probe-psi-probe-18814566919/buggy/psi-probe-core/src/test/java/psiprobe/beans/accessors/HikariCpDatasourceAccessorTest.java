/*
 * Licensed under the GPL License. You may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   https://www.gnu.org/licenses/old-licenses/gpl-2.0.html
 *
 * THIS PACKAGE IS PROVIDED "AS IS" AND WITHOUT ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING,
 * WITHOUT LIMITATION, THE IMPLIED WARRANTIES OF MERCHANTIBILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE.
 */
package psiprobe.beans.accessors;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.zaxxer.hikari.HikariDataSource;

import mockit.Mocked;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * The Class HikariCpDatasourceAccessorTest.
 */
class HikariCpDatasourceAccessorTest {

  /** The accessor. */
  HikariCpDatasourceAccessor accessor;

  /** The source. */
  @Mocked
  HikariDataSource source;

  /** The bad source. */
  ComboPooledDataSource badSource;

  /**
   * Before.
   */
  @BeforeEach
  void before() {
    accessor = new HikariCpDatasourceAccessor();
    badSource = new ComboPooledDataSource();
  }

  /**
   * Can map test.
   */
  @Test
  void canMapTest() {
    Assertions.assertTrue(accessor.canMap(source));
  }

  /**
   * Cannot map test.
   */
  @Test
  void cannotMapTest() {
    Assertions.assertFalse(accessor.canMap(badSource));
  }

  /**
   * Gets the info test.
   *
   * @throws Exception the exception
   */
  @Disabled
  @Test
  void getInfoTest() throws Exception {
    accessor.getInfo(source);
  }

}
