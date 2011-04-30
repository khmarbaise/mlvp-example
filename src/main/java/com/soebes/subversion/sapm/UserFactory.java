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

/**
 * Factory to create {@link User} instances.
 *
 * @author Karl Heinz Marbaise
 *
 */
public class UserFactory {

    /**
     * The factory method to create the particular
     * instances.
     * This means you can give one of the following
     * user names:
     * <ul>
     * <li>$authenticated which results in using {@link UserAuthenticated}</li>
     * <li>$anonymous which results in using {@link UserAnonymous}</li>
     * <li>* which results in using {@link UserAsterik}</li>
     * <li>Any other user name results in using {@link User}</li>
     * </ul>
     * @param user The user name which will be used.
     * @return The instance of the {@link User} class.
     */
    public static User createInstance(String user) {
        if (user.equals("$authenticated")) {
            return new UserAuthenticated();
        } else if (user.equals("$anonymous")) {
            return new UserAnonymous();
        } else if (user.equals("*")) {
            return new UserAsterik();
        } else {
            return new User(user);
        }
    }
}
