/*
 * (C) Copyright IBM Corp. 2021.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.watson.natural_language_understanding.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Returns text classifications for the content.
 *
 * <p>Supported languages: English only.
 */
public class ClassificationsOptions extends GenericModel {

  protected String model;

  /** Builder. */
  public static class Builder {
    private String model;

    private Builder(ClassificationsOptions classificationsOptions) {
      this.model = classificationsOptions.model;
    }

    /** Instantiates a new builder. */
    public Builder() {}

    /**
     * Builds a ClassificationsOptions.
     *
     * @return the new ClassificationsOptions instance
     */
    public ClassificationsOptions build() {
      return new ClassificationsOptions(this);
    }

    /**
     * Set the model.
     *
     * @param model the model
     * @return the ClassificationsOptions builder
     */
    public Builder model(String model) {
      this.model = model;
      return this;
    }
  }

  protected ClassificationsOptions(Builder builder) {
    model = builder.model;
  }

  /**
   * New builder.
   *
   * @return a ClassificationsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the model.
   *
   * <p>Enter a [custom
   * model](https://cloud.ibm.com/docs/natural-language-understanding?topic=natural-language-understanding-customizing)
   * ID of the classification model to be used.
   *
   * @return the model
   */
  public String model() {
    return model;
  }
}
