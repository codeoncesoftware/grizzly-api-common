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

import java.util.List;

public class CreateResourceRequest {
    private String path;
    private String httpMethod;
    private String serviceURL;
    private RuntimeCustomQuery runtimeCustomQuery;
    List<String> requestparam;
    List<String> headers;
    private String query;
    private String model;
    private String parsedBody;
    private List<MicrogatewayMapping> mapping;


    public List<MicrogatewayMapping> getMapping() {
        return mapping;
    }

    public void setMapping(List<MicrogatewayMapping> mapping) {
        this.mapping = mapping;
    }

    public String getServiceURL() {
        return serviceURL;
    }

    public void setServiceURL(String serviceURL) {
        this.serviceURL = serviceURL;
    }

    public String getParsedBody() {
        return parsedBody;
    }

    public void setParsedBody(String parsedBody) {
        this.parsedBody = parsedBody;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
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

    public List<String> getRequestparam() {
        return requestparam;
    }

    public void setRequestparam(List<String> requestparam) {
        this.requestparam = requestparam;
    }

    public RuntimeCustomQuery getRuntimeCustomQuery() {
        return runtimeCustomQuery;
    }

    public void setRuntimeCustomQuery(RuntimeCustomQuery runtimeCustomQuery) {
        this.runtimeCustomQuery = runtimeCustomQuery;
    }

    public List<String> getHeaders() {
        return headers;
    }

    public void setHeaders(List<String> headers) {
        this.headers = headers;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


}