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
package fr.codeonce.grizzly.common.runtime;

import fr.codeonce.grizzly.common.runtime.resource.RuntimeResourceFunction;

public class FunctionsExecuteRequest {

    private RuntimeResourceFunction function;
    private String jsonRequestModel;
    private String pojoRequestModel;
    private String executionType;
    private String jsonPersistanceModel;
    private float lastUpdatRequestModel;
    private String mongoURI;
    private String collectionName;
    private String dbName;
    private String provider;
    private String logId;

    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId;
    }

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getMongoURI() {
        return mongoURI;
    }

    public void setMongoURI(String mongoURI) {
        this.mongoURI = mongoURI;
    }

    public String getCollectionName() {
        return collectionName;
    }

    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }

    public float getLastUpdatRequestModel() {

        return lastUpdatRequestModel;
    }

    public void setLastUpdatRequestModel(float lastUpdatRequestModel) {
        this.lastUpdatRequestModel = lastUpdatRequestModel;
    }

    public String getJsonPersistanceModel() {

        return jsonPersistanceModel;
    }

    public void setJsonPersistanceModel(String jsonPersistanceModel) {
        this.jsonPersistanceModel = jsonPersistanceModel;
    }

    public String getJsonRequestModel() {
        return jsonRequestModel;
    }

    public void setJsonRequestModel(String jsonRequestModel) {
        this.jsonRequestModel = jsonRequestModel;
    }

    public String getPojoRequestModel() {
        return pojoRequestModel;
    }

    public void setPojoRequestModel(String pojoRequestModel) {
        this.pojoRequestModel = pojoRequestModel;
    }

    public String getExecutionType() {
        return executionType;
    }

    public void setExecutionType(String executionType) {
        this.executionType = executionType;
    }

    public RuntimeResourceFunction getFunction() {
        return function;
    }

    public void setFunction(RuntimeResourceFunction function) {
        this.function = function;
    }

}
