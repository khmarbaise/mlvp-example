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
 * This class represents a path in the meaning 
 * of a folder.
 * 
 * @author Karl Heinz Marbaise
 *
 */
public class Path {

    private String path;

    public Path(String path) {
        super();
        setPath(path);
    }

    public Path() {
        setPath(null);
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * This will check if the given path
     * is part of the path which is represented by 
     * this instance.
     * @see {@link PathTest}
     * @param path The path to check for.
     * @return true if the given path is contained in false otherwise.
     */
    public boolean contains(String path) {
        boolean result = false;
        FileName fn = new FileName(path);
        if (fn.getPath().startsWith(getPath())) {
            result = true;
        }
        return result;
    }

}
