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

public class AWSCredentials {

    private String type;
    private String awsAccessKeyId;
    private String awsSecretAccess;
    private String awsSessionToken;
    private String region;

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the awsAccessKeyId
     */
    public String getAwsAccessKeyId() {
        return awsAccessKeyId;
    }

    /**
     * @param awsAccessKeyId the awsAccessKeyId to set
     */
    public void setAwsAccessKeyId(String awsAccessKeyId) {
        this.awsAccessKeyId = awsAccessKeyId;
    }

    /**
     * @return the awsSecretAccess
     */
    public String getAwsSecretAccess() {
        return awsSecretAccess;
    }

    /**
     * @param awsSecretAccess the awsSecretAccess to set
     */
    public void setAwsSecretAccess(String awsSecretAccess) {
        this.awsSecretAccess = awsSecretAccess;
    }

    /**
     * @return the awsSessionToken
     */
    public String getAwsSessionToken() {
        return awsSessionToken;
    }

    /**
     * @param awsSessionToken the awsSessionToken to set
     */
    public void setAwsSessionToken(String awsSessionToken) {
        this.awsSessionToken = awsSessionToken;
    }

    /**
     * @return the region
     */
    public String getRegion() {
        return region;
    }

    /**
     * @param region the region to set
     */
    public void setRegion(String region) {
        this.region = region;
    }

}
