/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package x7.core.bean;


public class Reduce {
    private ReduceType type;
    private String property;

    public ReduceType getType() {
        return type;
    }
    public void setType(ReduceType type) {
        this.type = type;
    }
    public String getProperty() {
        return property;
    }
    public void setProperty(String property) {
        this.property = property;
    }

    @Override
    public String toString() {
        return "Reduce{" +
                "type=" + type +
                ", property='" + property + '\'' +
                '}';
    }

    public enum ReduceType {

        SUM,
        COUNT,
        MAX,
        MIN,
        AVG
    }
}
