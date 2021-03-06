/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.mq.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/DescribeConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** The unique ID that Amazon MQ generates for the configuration. */
    private String configurationId;

    /**
     * The unique ID that Amazon MQ generates for the configuration.
     * 
     * @param configurationId
     *        The unique ID that Amazon MQ generates for the configuration.
     */

    public void setConfigurationId(String configurationId) {
        this.configurationId = configurationId;
    }

    /**
     * The unique ID that Amazon MQ generates for the configuration.
     * 
     * @return The unique ID that Amazon MQ generates for the configuration.
     */

    public String getConfigurationId() {
        return this.configurationId;
    }

    /**
     * The unique ID that Amazon MQ generates for the configuration.
     * 
     * @param configurationId
     *        The unique ID that Amazon MQ generates for the configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConfigurationRequest withConfigurationId(String configurationId) {
        setConfigurationId(configurationId);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getConfigurationId() != null)
            sb.append("ConfigurationId: ").append(getConfigurationId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeConfigurationRequest == false)
            return false;
        DescribeConfigurationRequest other = (DescribeConfigurationRequest) obj;
        if (other.getConfigurationId() == null ^ this.getConfigurationId() == null)
            return false;
        if (other.getConfigurationId() != null && other.getConfigurationId().equals(this.getConfigurationId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigurationId() == null) ? 0 : getConfigurationId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeConfigurationRequest clone() {
        return (DescribeConfigurationRequest) super.clone();
    }

}
