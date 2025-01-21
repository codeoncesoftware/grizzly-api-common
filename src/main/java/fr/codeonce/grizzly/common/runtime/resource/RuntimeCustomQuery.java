/*
 * Copyright © 2020 CodeOnce Software (https://www.codeonce.fr/)
 *
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
 */
package fr.codeonce.grizzly.common.runtime.resource;

public class RuntimeCustomQuery {

    private String datasource;
    private String database;
    private String collectionName;
    private String queryName;
    private String indexType;
    private String query;
    private String type;
    private boolean many; // response number of elements (Many or One)
    private boolean requestMany; // request number of elements (Many or One)

    public RuntimeCustomQuery() {
    }

    public RuntimeCustomQuery(String datasource, String database, String collectionName, String query, String indexType, String queryName) {
        super();
        this.datasource = datasource;
        this.database = database;
        this.collectionName = collectionName;
        this.query = query;
        this.indexType = null;
        this.queryName = queryName;
    }

    public String getDatasource() {
        return datasource;
    }

    public void setDatasource(String datasource) {
        this.datasource = datasource;
    }

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public String getCollectionName() {
        return collectionName;
    }

    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isMany() {
        return many;
    }

    public void setMany(boolean many) {
        this.many = many;
    }

    public String getIndexType() {
        return indexType;
    }

    public void setIndexType(String indexType) {
        this.indexType = indexType;
    }

    public boolean isRequestMany() {
        return requestMany;
    }

    public void setRequestMany(boolean requestMany) {
        this.requestMany = requestMany;
    }

    public String getQueryName() {
        return queryName;
    }

    public void setQueryName(String queryName) {
        this.queryName = queryName;
    }


}
