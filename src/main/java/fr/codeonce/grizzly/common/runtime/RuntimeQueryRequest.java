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

import fr.codeonce.grizzly.common.runtime.resource.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class RuntimeQueryRequest implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private String parsedQuery;
    private String httpMethod;
    private String path;
    private String executionType;
    private String queryType;
    private String databaseType;
    private String queryName;
    private String query;
    private String dbsourceConnectionMode;
    private String dbsourceId;
    private String connectionMode;
    private String physicalDatabaseName;
    private String databaseName;
    private String collectionName;
    private String returnType;
    private List<String> fields;
    private List<RuntimeResourceParameter> parameters;
    private List<RuntimeAPIResponse> responses;
    private boolean pageable;
    private boolean many;
    private List<String> securityLevel = new ArrayList<>();
    private String username;
    private Provider provider;
    private String bucketName;
    private String indexType;
    private String serviceURL;
    private List<MicrogatewayMapping> mapping;
    private String host;
    private List<RuntimeResourceFunction> outFunctions = new ArrayList<RuntimeResourceFunction>();
    private List<RuntimeResourceFunction> inFunctions = new ArrayList<RuntimeResourceFunction>();
    private List<fr.codeonce.grizzly.common.runtime.resource.RuntimeResourceRequestModel> requestModels;
    private List<RuntimeResourceFunction> functions = new ArrayList<RuntimeResourceFunction>();
    private RuntimeResourceLog resourceLog;
    private List<String> existedIdentityProvidersName;
    private List<SecurityApiConfig> authorizedApps;
    private String currentMicroservicetype;
    private boolean defaultIdP;

    public List<SecurityApiConfig> getAuthorizedApps() {
        return authorizedApps;
    }

    public void setAuthorizedApps(List<SecurityApiConfig> list) {
        this.authorizedApps = list;
    }

    public List<String> getExistedIdentityProvidersName() {
        return existedIdentityProvidersName;
    }

    public void setExistedIdentityProvidersName(List<String> existedIdentityProvidersName) {
        this.existedIdentityProvidersName = existedIdentityProvidersName;
    }

    public RuntimeResourceLog getResourceLog() {
        return resourceLog;
    }

    public void setResourceLog(RuntimeResourceLog resourceLog) {
        this.resourceLog = resourceLog;
    }

    public List<RuntimeResourceFunction> getFunctions() {
        return functions;
    }

    public void setFunctions(List<RuntimeResourceFunction> functions) {
        this.functions = functions;
    }

    public List<fr.codeonce.grizzly.common.runtime.resource.RuntimeResourceRequestModel> getRequestModels() {
        return requestModels;
    }

    public void setRequestModels(List<fr.codeonce.grizzly.common.runtime.resource.RuntimeResourceRequestModel> list) {
        this.requestModels = list;
    }

    public List<RuntimeResourceFunction> getInFunctions() {
        return inFunctions;
    }

    public List<RuntimeResourceFunction> getOutFunctions() {
        return outFunctions;
    }

    public void setInFunctions(List<RuntimeResourceFunction> inFunctions) {
        this.inFunctions = inFunctions;
    }

    public void setOutFunctions(List<RuntimeResourceFunction> outFunctions) {
        this.outFunctions = outFunctions;
    }

    public String getDatabaseType() {
        return databaseType;
    }

    public void setDatabaseType(String databaseType) {
        this.databaseType = databaseType;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public RuntimeQueryRequest() {
        this.fields = new ArrayList<>();
    }

    public String getHttpMethod() {
        return httpMethod;
    }

    public void setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public String getExecutionType() {
        return executionType;
    }

    public void setExecutionType(String executionType) {
        this.executionType = executionType;
    }

    public String getQueryType() {
        return queryType;
    }

    public void setQueryType(String queryType) {
        this.queryType = queryType;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getDbsourceConnectionMode() {
        return dbsourceConnectionMode;
    }

    public void setDbsourceConnectionMode(String dbsourceConnectionMode) {
        this.dbsourceConnectionMode = dbsourceConnectionMode;
    }

    public String getDbsourceId() {
        return dbsourceId;
    }

    public void setDbsourceId(String dbsourceId) {
        this.dbsourceId = dbsourceId;
    }

    public String getConnectionMode() {
        return connectionMode;
    }

    public void setConnectionMode(String connectionMode) {
        this.connectionMode = connectionMode;
    }

    public String getPhysicalDatabaseName() {
        return physicalDatabaseName;
    }

    public void setPhysicalDatabaseName(String physicalDatabaseName) {
        this.physicalDatabaseName = physicalDatabaseName;
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public String getCollectionName() {
        return collectionName;
    }

    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }

    public String getReturnType() {
        return returnType;
    }

    public void setReturnType(String returnType) {
        this.returnType = returnType;
    }

    public List<String> getFields() {
        return fields;
    }

    public void setFields(List<String> fields) {
        this.fields = fields;
    }

    public List<RuntimeResourceParameter> getParameters() {
        return parameters;
    }

    public void setParameters(List<RuntimeResourceParameter> parameters) {
        this.parameters = parameters;
    }

    public boolean isPageable() {
        return pageable;
    }

    public void setPageable(boolean pageable) {
        this.pageable = pageable;
    }

    public boolean isMany() {
        return many;
    }

    public void setMany(boolean many) {
        this.many = many;
    }

    public List<String> getSecurityLevel() {
        return securityLevel;
    }

    public void setSecurityLevel(List<String> securityLevel) {
        this.securityLevel = securityLevel;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getIndexType() {
        return indexType;
    }

    public void setIndexType(String indexType) {
        this.indexType = indexType;
    }

    public String getParsedQuery() {
        return parsedQuery;
    }

    public void setParsedQuery(String parsedQuery) {
        this.parsedQuery = parsedQuery;
    }

    public String getServiceURL() {
        return serviceURL;
    }

    public void setServiceURL(String serviceURL) {
        this.serviceURL = serviceURL;
    }

    public List<MicrogatewayMapping> getMapping() {
        return mapping;
    }

    public void setMapping(List<MicrogatewayMapping> mapping) {
        this.mapping = mapping;
    }

    public List<RuntimeAPIResponse> getResponses() {
        return responses;
    }

    public void setResponses(List<RuntimeAPIResponse> responses) {
        this.responses = responses;
    }

    public String getCurrentMicroservicetype() {
        return currentMicroservicetype;
    }

    public void setCurrentMicroservicetype(String currentMicroservicetype) {
        this.currentMicroservicetype = currentMicroservicetype;
    }

    public String getQueryName() {
        return queryName;
    }

    public void setQueryName(String queryName) {
        this.queryName = queryName;
    }

    public boolean isDefaultIdP() {
        return defaultIdP;
    }

    public void setDefaultIdP(boolean defaultIdP) {
        this.defaultIdP = defaultIdP;
    }

}
