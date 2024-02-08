/*
 * Copyright 1999-2015 dangdang.com.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * </p>
 */

package com.dangdang.ddframe.rdb.common.sql.strategy;

import com.dangdang.ddframe.rdb.common.jaxb.SqlShardingRule;
import com.dangdang.ddframe.rdb.common.sql.common.ShardingTestStrategy;
import com.dangdang.ddframe.rdb.sharding.constant.DatabaseType;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;
import java.util.Set;

@RunWith(Parameterized.class)
@Ignore
public class HintShardingDatabaseOnlyTest extends ShardingDatabaseOnlyTest {
    
    public HintShardingDatabaseOnlyTest(final String testCaseName, final String sql, final Set<DatabaseType> types, final List<SqlShardingRule> sqlShardingRules) {
        super(testCaseName, sql, types, sqlShardingRules);
    }
    
    @Override
    protected ShardingTestStrategy getShardingStrategy() {
        return ShardingTestStrategy.hint;
    }
}
