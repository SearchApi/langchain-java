/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hw.langchain.sql.database;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import java.sql.SQLException;

/**
 * @description: SQLDatabaseTest
 * @author: HamaWhite
 */
public class SQLDatabaseTest {

    private static SQLDatabase database;

    @BeforeAll
    public static void setup() throws SQLException {
        database = new SQLDatabase("jdbc:h2:mem:test;DB_CLOSE_DELAY=-1", "demo", "demo");
    }


    @AfterAll
    public static void cleanup() throws SQLException {
        database.close();
    }

}