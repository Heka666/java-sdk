/*
 * (C) Copyright IBM Corp. 2018, 2021.
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
package com.ibm.watson.speech_to_text.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;
import java.util.ArrayList;
import java.util.List;

/** The addWord options. */
public class AddWordOptions extends GenericModel {

  protected String customizationId;
  protected String wordName;
  protected String word;
  protected List<String> soundsLike;
  protected String displayAs;

  /** Builder. */
  public static class Builder {
    private String customizationId;
    private String wordName;
    private String word;
    private List<String> soundsLike;
    private String displayAs;

    private Builder(AddWordOptions addWordOptions) {
      this.customizationId = addWordOptions.customizationId;
      this.wordName = addWordOptions.wordName;
      this.word = addWordOptions.word;
      this.soundsLike = addWordOptions.soundsLike;
      this.displayAs = addWordOptions.displayAs;
    }

    /** Instantiates a new builder. */
    public Builder() {}

    /**
     * Instantiates a new builder with required properties.
     *
     * @param customizationId the customizationId
     * @param wordName the wordName
     */
    public Builder(String customizationId, String wordName) {
      this.customizationId = customizationId;
      this.wordName = wordName;
    }

    /**
     * Builds a AddWordOptions.
     *
     * @return the new AddWordOptions instance
     */
    public AddWordOptions build() {
      return new AddWordOptions(this);
    }

    /**
     * Adds an soundsLike to soundsLike.
     *
     * @param soundsLike the new soundsLike
     * @return the AddWordOptions builder
     */
    public Builder addSoundsLike(String soundsLike) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(soundsLike, "soundsLike cannot be null");
      if (this.soundsLike == null) {
        this.soundsLike = new ArrayList<String>();
      }
      this.soundsLike.add(soundsLike);
      return this;
    }

    /**
     * Set the customizationId.
     *
     * @param customizationId the customizationId
     * @return the AddWordOptions builder
     */
    public Builder customizationId(String customizationId) {
      this.customizationId = customizationId;
      return this;
    }

    /**
     * Set the wordName.
     *
     * @param wordName the wordName
     * @return the AddWordOptions builder
     */
    public Builder wordName(String wordName) {
      this.wordName = wordName;
      return this;
    }

    /**
     * Set the word.
     *
     * @param word the word
     * @return the AddWordOptions builder
     */
    public Builder word(String word) {
      this.word = word;
      return this;
    }

    /**
     * Set the soundsLike. Existing soundsLike will be replaced.
     *
     * @param soundsLike the soundsLike
     * @return the AddWordOptions builder
     */
    public Builder soundsLike(List<String> soundsLike) {
      this.soundsLike = soundsLike;
      return this;
    }

    /**
     * Set the displayAs.
     *
     * @param displayAs the displayAs
     * @return the AddWordOptions builder
     */
    public Builder displayAs(String displayAs) {
      this.displayAs = displayAs;
      return this;
    }
  }

  protected AddWordOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(
        builder.customizationId, "customizationId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.wordName, "wordName cannot be empty");
    customizationId = builder.customizationId;
    wordName = builder.wordName;
    word = builder.word;
    soundsLike = builder.soundsLike;
    displayAs = builder.displayAs;
  }

  /**
   * New builder.
   *
   * @return a AddWordOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the customizationId.
   *
   * <p>The customization ID (GUID) of the custom language model that is to be used for the request.
   * You must make the request with credentials for the instance of the service that owns the custom
   * model.
   *
   * @return the customizationId
   */
  public String customizationId() {
    return customizationId;
  }

  /**
   * Gets the wordName.
   *
   * <p>The custom word that is to be added to or updated in the custom language model. Do not
   * include spaces in the word. Use a `-` (dash) or `_` (underscore) to connect the tokens of
   * compound words. URL-encode the word if it includes non-ASCII characters. For more information,
   * see [Character
   * encoding](https://cloud.ibm.com/docs/speech-to-text?topic=speech-to-text-corporaWords#charEncoding).
   *
   * @return the wordName
   */
  public String wordName() {
    return wordName;
  }

  /**
   * Gets the word.
   *
   * <p>For the [Add custom words](#addwords) method, you must specify the custom word that is to be
   * added to or updated in the custom model. Do not include spaces in the word. Use a `-` (dash) or
   * `_` (underscore) to connect the tokens of compound words.
   *
   * <p>Omit this parameter for the [Add a custom word](#addword) method.
   *
   * @return the word
   */
  public String word() {
    return word;
  }

  /**
   * Gets the soundsLike.
   *
   * <p>_For a custom model that is based on a previous-generation model_, an array of sounds-like
   * pronunciations for the custom word. Specify how words that are difficult to pronounce, foreign
   * words, acronyms, and so on can be pronounced by users. * For a word that is not in the
   * service's base vocabulary, omit the parameter to have the service automatically generate a
   * sounds-like pronunciation for the word. * For a word that is in the service's base vocabulary,
   * use the parameter to specify additional pronunciations for the word. You cannot override the
   * default pronunciation of a word; pronunciations you add augment the pronunciation from the base
   * vocabulary.
   *
   * <p>A word can have at most five sounds-like pronunciations. A pronunciation can include at most
   * 40 characters not including spaces.
   *
   * <p>_For a custom model that is based on a next-generation model_, omit this field. Custom
   * models based on next-generation models do not support the `sounds_like` field. The service
   * ignores the field.
   *
   * @return the soundsLike
   */
  public List<String> soundsLike() {
    return soundsLike;
  }

  /**
   * Gets the displayAs.
   *
   * <p>An alternative spelling for the custom word when it appears in a transcript. Use the
   * parameter when you want the word to have a spelling that is different from its usual
   * representation or from its spelling in corpora training data.
   *
   * @return the displayAs
   */
  public String displayAs() {
    return displayAs;
  }
}
