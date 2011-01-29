/**
 * The Subversion Authentication Parse Module (SAPM for short).
 *
 * Copyright (c) 2010, 2011 by SoftwareEntwicklung Beratung Schulung (SoEBeS)
 * Copyright (c) 2010, 2011 by Karl Heinz Marbaise
 *
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
package com.soebes.subversion.sapm;

import junit.framework.Assert;

import org.testng.annotations.Test;

public class AliasesTest extends TestBase {

    @Test
    public void aliasesTest() {
        Aliases aliases = new Aliases();
        Alias alias_user1 = new Alias("alias_user", "xyz");
        aliases.add(alias_user1);
        Alias alias_user2 = new Alias("alias_user_hugo", "elvira");
        aliases.add(alias_user2);

        Alias alias = aliases.getAlias("alias_user_hugo");
        Assert.assertEquals(alias_user2, alias);
        Assert.assertTrue(aliases.hasAlias("alias_user"));
        Assert.assertTrue(aliases.hasAlias("alias_user_hugo"));
        Assert.assertFalse(aliases.hasAlias("egon"));
    }

}
