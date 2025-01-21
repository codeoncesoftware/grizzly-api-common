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

import fr.codeonce.grizzly.common.runtime.Provider;
import fr.codeonce.grizzly.common.runtime.SecurityApiConfig;

import java.util.ArrayList;
import java.util.List;

public class RuntimeResource {

    private String name;
    private String path;
    private String httpMethod;
    private String executionType;
    private RuntimeResourceFile resourceFile;
    private List<RuntimeResourceFile> secondaryFilePaths;
    private RuntimeCustomQuery customQuery;
    private List<RuntimeResourceParameter> parameters;
    private List<RuntimeAPIResponse> responses;
    private ArrayList<String> securityLevel = new ArrayList<>();
    private List<String> fields;
    private String returnType;
    private boolean pageable;
    private String securityKey;
    private String clientId;
    private Provider provider;
    private String bucketName;
    private String connectionMode;
    private String physicalDatabase;
    private String databaseType;
    private String serviceURL;
    private List<MicrogatewayMapping> mapping;
    private String authMSRuntimeUrl;
    private List<String> existedIdentityProvidersName;
    private List<SecurityApiConfig> authorizedApps;
    private String currentMicroservicetype;
    private boolean defaultIdP;


    public boolean isDefaultIdP() {
        return defaultIdP;
    }

    public void setDefaultIdP(boolean defaultIdP) {
        this.defaultIdP = defaultIdP;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getCurrentMicroservicetype() {
        return currentMicroservicetype;
    }

    public void setCurrentMicroservicetype(String currentMicroservicetype) {
        this.currentMicroservicetype = currentMicroservicetype;
    }

    public List<SecurityApiConfig> getAuthorizedApps() {
        return authorizedApps;
    }

    public void setAuthorizedApps(List<SecurityApiConfig> list) {
        this.authorizedApps = list;
    }

    public String getAuthMSRuntimeUrl() {
        return authMSRuntimeUrl;
    }

    public void setAuthMSRuntimeUrl(String authMSRuntimeUrl) {
        this.authMSRuntimeUrl = authMSRuntimeUrl;
    }

    public List<String> getExistedIdentityProvidersName() {
        return existedIdentityProvidersName;
    }

    public void setExistedIdentityProvidersName(List<String> existedIdentityProvidersName) {
        this.existedIdentityProvidersName = existedIdentityProvidersName;
    }

    public String getDatabaseType() {
        return databaseType;
    }

    public void setDatabaseType(String databaseType) {
        this.databaseType = databaseType;
    }

    private String host;
    private List<RuntimeResourceFunction> outFunctions = new ArrayList<RuntimeResourceFunction>();
    private List<RuntimeResourceFunction> inFunctions = new ArrayList<RuntimeResourceFunction>();
    private List<RuntimeResourceRequestModel> requestModels;
    private List<RuntimeResourceFunction> functions = new ArrayList<RuntimeResourceFunction>();
    private RuntimeResourceLog resourceLog;

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

    public List<RuntimeResourceRequestModel> getRequestModels() {
        return requestModels;
    }

    public void setRequestModels(List<RuntimeResourceRequestModel> requestModal) {
        this.requestModels = requestModal;
    }

    public List<RuntimeResourceFunction> getInFunctions() {
        return inFunctions;
    }

    public void setInFunctions(List<RuntimeResourceFunction> inFunctions) {
        this.inFunctions = inFunctions;
    }

    public List<RuntimeResourceFunction> getOutFunctions() {
        return outFunctions;
    }

    public void setOutFunctions(List<RuntimeResourceFunction> outFunctions) {
        this.outFunctions = outFunctions;
    }

    @Override
    public String toString() {
        return "RuntimeResource [name=" + name + ", path=" + path + ", httpMethod=" + httpMethod + ", executionType="
                + executionType + ", resourceFile=" + resourceFile + ", secondaryFilePaths=" + secondaryFilePaths
                + ", customQuery=" + customQuery + ", parameters=" + parameters + ", responses=" + responses
                + ", securityLevel=" + securityLevel + ", fields=" + fields + ", returnType=" + returnType
                + ", pageable=" + pageable + ", securityKey=" + securityKey + ", clientId=" + clientId + ", authorizedApps=" + authorizedApps +
                ", currentMicroservicetype=" + currentMicroservicetype + ", provider=" + provider + ", bucketName=" + bucketName +
                ", connectionMode=" + connectionMode + ", physicalDatabase=" + physicalDatabase + ", outFunctions=" + outFunctions + "]";
    }

    public RuntimeResource() {
        customQuery = new RuntimeCustomQuery();
        parameters = new ArrayList<>();
        responses = new ArrayList<>();
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getHttpMethod() {
        return httpMethod;
    }

    public void setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
    }

    public String getExecutionType() {
        return executionType;
    }

    public void setExecutionType(String executionType) {
        this.executionType = executionType;
    }

    public RuntimeResourceFile getResourceFile() {
        return resourceFile;
    }

    public void setResourceFile(RuntimeResourceFile resourceFile) {
        this.resourceFile = resourceFile;
    }

    public List<RuntimeResourceFile> getSecondaryFilePaths() {
        return secondaryFilePaths;
    }

    public void setSecondaryFilePaths(List<RuntimeResourceFile> secondaryFilePaths) {
        this.secondaryFilePaths = secondaryFilePaths;
    }

    public RuntimeCustomQuery getCustomQuery() {
        return customQuery;
    }

    public void setCustomQuery(RuntimeCustomQuery customQuery) {
        this.customQuery = customQuery;
    }

    public List<RuntimeResourceParameter> getParameters() {
        return parameters;
    }

    public void setParameters(List<RuntimeResourceParameter> parameters) {
        this.parameters = parameters;
    }

    public List<RuntimeAPIResponse> getResponses() {
        return responses;
    }

    public void setResponses(List<RuntimeAPIResponse> responses) {
        this.responses = responses;
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

    public boolean isPageable() {
        return pageable;
    }

    public void setPageable(boolean pageable) {
        this.pageable = pageable;
    }

    public String getSecurityKey() {
        return securityKey;
    }

    public void setSecurityKey(String securityKey) {
        this.securityKey = securityKey;
    }

    public List<String> getSecurityLevel() {
        return securityLevel;
    }

    public void setSecurityLevel(List<String> securityLevel) {
        this.securityLevel = (ArrayList<String>) securityLevel;
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

    public String getConnectionMode() {
        return connectionMode;
    }

    public void setConnectionMode(String connectionMode) {
        this.connectionMode = connectionMode;
    }

    public String getPhysicalDatabase() {
        return physicalDatabase;
    }

    public void setPhysicalDatabase(String physicalDatabase) {
        this.physicalDatabase = physicalDatabase;
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

}
