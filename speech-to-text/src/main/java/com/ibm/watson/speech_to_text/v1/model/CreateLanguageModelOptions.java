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

/** The createLanguageModel options. */
public class CreateLanguageModelOptions extends GenericModel {

  /**
   * The name of the base language model that is to be customized by the new custom language model.
   * The new custom model can be used only with the base model that it customizes.
   *
   * <p>To determine whether a base model supports language model customization, use the [Get a
   * model](#getmodel) method and check that the attribute `custom_language_model` is set to `true`.
   * You can also refer to [Language support for
   * customization](https://cloud.ibm.com/docs/speech-to-text?topic=speech-to-text-custom-support#custom-language-support).
   */
  public interface BaseModelName {
    /** ar-MS_Telephony. */
    String AR_MS_TELEPHONY = "ar-MS_Telephony";
    /** de-DE_BroadbandModel. */
    String DE_DE_BROADBANDMODEL = "de-DE_BroadbandModel";
    /** de-DE_NarrowbandModel. */
    String DE_DE_NARROWBANDMODEL = "de-DE_NarrowbandModel";
    /** de-DE_Telephony. */
    String DE_DE_TELEPHONY = "de-DE_Telephony";
    /** en-AU_BroadbandModel. */
    String EN_AU_BROADBANDMODEL = "en-AU_BroadbandModel";
    /** en-AU_NarrowbandModel. */
    String EN_AU_NARROWBANDMODEL = "en-AU_NarrowbandModel";
    /** en-AU_Telephony. */
    String EN_AU_TELEPHONY = "en-AU_Telephony";
    /** en-GB_BroadbandModel. */
    String EN_GB_BROADBANDMODEL = "en-GB_BroadbandModel";
    /** en-GB_NarrowbandModel. */
    String EN_GB_NARROWBANDMODEL = "en-GB_NarrowbandModel";
    /** en-GB_Telephony. */
    String EN_GB_TELEPHONY = "en-GB_Telephony";
    /** en-IN_Telephony. */
    String EN_IN_TELEPHONY = "en-IN_Telephony";
    /** en-US_BroadbandModel. */
    String EN_US_BROADBANDMODEL = "en-US_BroadbandModel";
    /** en-US_Multimedia. */
    String EN_US_MULTIMEDIA = "en-US_Multimedia";
    /** en-US_NarrowbandModel. */
    String EN_US_NARROWBANDMODEL = "en-US_NarrowbandModel";
    /** en-US_ShortForm_NarrowbandModel. */
    String EN_US_SHORTFORM_NARROWBANDMODEL = "en-US_ShortForm_NarrowbandModel";
    /** en-US_Telephony. */
    String EN_US_TELEPHONY = "en-US_Telephony";
    /** es-AR_BroadbandModel. */
    String ES_AR_BROADBANDMODEL = "es-AR_BroadbandModel";
    /** es-AR_NarrowbandModel. */
    String ES_AR_NARROWBANDMODEL = "es-AR_NarrowbandModel";
    /** es-CL_BroadbandModel. */
    String ES_CL_BROADBANDMODEL = "es-CL_BroadbandModel";
    /** es-CL_NarrowbandModel. */
    String ES_CL_NARROWBANDMODEL = "es-CL_NarrowbandModel";
    /** es-CO_BroadbandModel. */
    String ES_CO_BROADBANDMODEL = "es-CO_BroadbandModel";
    /** es-CO_NarrowbandModel. */
    String ES_CO_NARROWBANDMODEL = "es-CO_NarrowbandModel";
    /** es-ES_BroadbandModel. */
    String ES_ES_BROADBANDMODEL = "es-ES_BroadbandModel";
    /** es-ES_NarrowbandModel. */
    String ES_ES_NARROWBANDMODEL = "es-ES_NarrowbandModel";
    /** es-ES_Telephony. */
    String ES_ES_TELEPHONY = "es-ES_Telephony";
    /** es-MX_BroadbandModel. */
    String ES_MX_BROADBANDMODEL = "es-MX_BroadbandModel";
    /** es-MX_NarrowbandModel. */
    String ES_MX_NARROWBANDMODEL = "es-MX_NarrowbandModel";
    /** es-PE_BroadbandModel. */
    String ES_PE_BROADBANDMODEL = "es-PE_BroadbandModel";
    /** es-PE_NarrowbandModel. */
    String ES_PE_NARROWBANDMODEL = "es-PE_NarrowbandModel";
    /** fr-CA_BroadbandModel. */
    String FR_CA_BROADBANDMODEL = "fr-CA_BroadbandModel";
    /** fr-CA_NarrowbandModel. */
    String FR_CA_NARROWBANDMODEL = "fr-CA_NarrowbandModel";
    /** fr-CA_Telephony. */
    String FR_CA_TELEPHONY = "fr-CA_Telephony";
    /** fr-FR_BroadbandModel. */
    String FR_FR_BROADBANDMODEL = "fr-FR_BroadbandModel";
    /** fr-FR_Multimedia. */
    String FR_FR_MULTIMEDIA = "fr-FR_Multimedia";
    /** fr-FR_NarrowbandModel. */
    String FR_FR_NARROWBANDMODEL = "fr-FR_NarrowbandModel";
    /** fr-FR_Telephony. */
    String FR_FR_TELEPHONY = "fr-FR_Telephony";
    /** hi-IN_Telephony. */
    String HI_IN_TELEPHONY = "hi-IN_Telephony";
    /** it-IT_BroadbandModel. */
    String IT_IT_BROADBANDMODEL = "it-IT_BroadbandModel";
    /** it-IT_NarrowbandModel. */
    String IT_IT_NARROWBANDMODEL = "it-IT_NarrowbandModel";
    /** it-IT_Telephony. */
    String IT_IT_TELEPHONY = "it-IT_Telephony";
    /** ja-JP_BroadbandModel. */
    String JA_JP_BROADBANDMODEL = "ja-JP_BroadbandModel";
    /** ja-JP_Multimedia. */
    String JA_JP_MULTIMEDIA = "ja-JP_Multimedia";
    /** ja-JP_NarrowbandModel. */
    String JA_JP_NARROWBANDMODEL = "ja-JP_NarrowbandModel";
    /** ko-KR_BroadbandModel. */
    String KO_KR_BROADBANDMODEL = "ko-KR_BroadbandModel";
    /** ko-KR_Multimedia. */
    String KO_KR_MULTIMEDIA = "ko-KR_Multimedia";
    /** ko-KR_NarrowbandModel. */
    String KO_KR_NARROWBANDMODEL = "ko-KR_NarrowbandModel";
    /** ko-KR_Telephony. */
    String KO_KR_TELEPHONY = "ko-KR_Telephony";
    /** nl-BE_Telephony. */
    String NL_BE_TELEPHONY = "nl-BE_Telephony";
    /** nl-NL_BroadbandModel. */
    String NL_NL_BROADBANDMODEL = "nl-NL_BroadbandModel";
    /** nl-NL_NarrowbandModel. */
    String NL_NL_NARROWBANDMODEL = "nl-NL_NarrowbandModel";
    /** pt-BR_BroadbandModel. */
    String PT_BR_BROADBANDMODEL = "pt-BR_BroadbandModel";
    /** pt-BR_NarrowbandModel. */
    String PT_BR_NARROWBANDMODEL = "pt-BR_NarrowbandModel";
    /** pt-BR_Telephony. */
    String PT_BR_TELEPHONY = "pt-BR_Telephony";
  }

  protected String name;
  protected String baseModelName;
  protected String dialect;
  protected String description;

  /** Builder. */
  public static class Builder {
    private String name;
    private String baseModelName;
    private String dialect;
    private String description;

    private Builder(CreateLanguageModelOptions createLanguageModelOptions) {
      this.name = createLanguageModelOptions.name;
      this.baseModelName = createLanguageModelOptions.baseModelName;
      this.dialect = createLanguageModelOptions.dialect;
      this.description = createLanguageModelOptions.description;
    }

    /** Instantiates a new builder. */
    public Builder() {}

    /**
     * Instantiates a new builder with required properties.
     *
     * @param name the name
     * @param baseModelName the baseModelName
     */
    public Builder(String name, String baseModelName) {
      this.name = name;
      this.baseModelName = baseModelName;
    }

    /**
     * Builds a CreateLanguageModelOptions.
     *
     * @return the new CreateLanguageModelOptions instance
     */
    public CreateLanguageModelOptions build() {
      return new CreateLanguageModelOptions(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateLanguageModelOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the baseModelName.
     *
     * @param baseModelName the baseModelName
     * @return the CreateLanguageModelOptions builder
     */
    public Builder baseModelName(String baseModelName) {
      this.baseModelName = baseModelName;
      return this;
    }

    /**
     * Set the dialect.
     *
     * @param dialect the dialect
     * @return the CreateLanguageModelOptions builder
     */
    public Builder dialect(String dialect) {
      this.dialect = dialect;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the CreateLanguageModelOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }
  }

  protected CreateLanguageModelOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name, "name cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(
        builder.baseModelName, "baseModelName cannot be null");
    name = builder.name;
    baseModelName = builder.baseModelName;
    dialect = builder.dialect;
    description = builder.description;
  }

  /**
   * New builder.
   *
   * @return a CreateLanguageModelOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * <p>A user-defined name for the new custom language model. Use a name that is unique among all
   * custom language models that you own. Use a localized name that matches the language of the
   * custom model. Use a name that describes the domain of the custom model, such as `Medical custom
   * model` or `Legal custom model`.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the baseModelName.
   *
   * <p>The name of the base language model that is to be customized by the new custom language
   * model. The new custom model can be used only with the base model that it customizes.
   *
   * <p>To determine whether a base model supports language model customization, use the [Get a
   * model](#getmodel) method and check that the attribute `custom_language_model` is set to `true`.
   * You can also refer to [Language support for
   * customization](https://cloud.ibm.com/docs/speech-to-text?topic=speech-to-text-custom-support#custom-language-support).
   *
   * @return the baseModelName
   */
  public String baseModelName() {
    return baseModelName;
  }

  /**
   * Gets the dialect.
   *
   * <p>The dialect of the specified language that is to be used with the custom language model. For
   * most languages, the dialect matches the language of the base model by default. For example,
   * `en-US` is used for the US English language models. All dialect values are case-insensitive.
   *
   * <p>The parameter is meaningful only for Spanish language models, for which you can always
   * safely omit the parameter to have the service create the correct mapping. For Spanish, the
   * service creates a custom language model that is suited for speech in one of the following
   * dialects: * `es-ES` for Castilian Spanish (`es-ES` models) * `es-LA` for Latin American Spanish
   * (`es-AR`, `es-CL`, `es-CO`, and `es-PE` models) * `es-US` for Mexican (North American) Spanish
   * (`es-MX` models)
   *
   * <p>If you specify the `dialect` parameter for a non-Spanish language model, its value must
   * match the language of the base model. If you specify the `dialect` for a Spanish language
   * model, its value must match one of the defined mappings (`es-ES`, `es-LA`, or `es-MX`).
   *
   * @return the dialect
   */
  public String dialect() {
    return dialect;
  }

  /**
   * Gets the description.
   *
   * <p>A description of the new custom language model. Use a localized description that matches the
   * language of the custom model.
   *
   * @return the description
   */
  public String description() {
    return description;
  }
}
