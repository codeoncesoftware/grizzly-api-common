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

public class RuntimeResourceRequestModel {

    private String name;
    private String requestModel;
    private float lastUpdate;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the lastUpdate
     */
    public float getLastUpdate() {
        return lastUpdate;
    }

    /**
     * @param lastUpdate the lastUpdate to set
     */
    public void setLastUpdate(float lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the requestModel
     */
    public String getRequestModel() {
        return requestModel;
    }

    /**
     * @param requestModel the requestModel to set
     */
    public void setRequestModel(String requestModel) {
        this.requestModel = requestModel;
    }
}
