///usr/bin/env jbang "$0" "$@" ; exit $?

/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

//JAVA 17+
//REPOS apache=https://repository.apache.org/snapshots,krok=https://repo.croc.ru/artifactory/RocInt,maven=https://repo1.maven.org/maven2
//DEPS org.apache.camel:archetypes:4.6.1-SNAPSHOT
// camel-kamelets - это отдельный проект на гитхабе.
package main;

import org.apache.camel.dsl.jbang.core.commands.CamelJBangMain;

/**
 * Main to run CamelJBang
 */
public class CamelJBang {

    public static void main(String... args) {
        CamelJBangMain.run(args);
    }

}
