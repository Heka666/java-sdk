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
package com.ibm.watson.assistant.v2.model;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;
import java.util.ArrayList;
import java.util.List;

/** An input object that includes the input text. */
public class MessageInput extends GenericModel {

  /**
   * The type of the message:
   *
   * <p>- `text`: The user input is processed normally by the assistant. - `search`: Only search
   * results are returned. (Any dialog or actions skill is bypassed.)
   *
   * <p>**Note:** A `search` message results in an error if no search skill is configured for the
   * assistant.
   */
  public interface MessageType {
    /** text. */
    String TEXT = "text";
    /** search. */
    String SEARCH = "search";
  }

  @SerializedName("message_type")
  protected String messageType;

  protected String text;
  protected List<RuntimeIntent> intents;
  protected List<RuntimeEntity> entities;

  @SerializedName("suggestion_id")
  protected String suggestionId;

  protected MessageInputOptions options;

  /** Builder. */
  public static class Builder {
    private String messageType;
    private String text;
    private List<RuntimeIntent> intents;
    private List<RuntimeEntity> entities;
    private String suggestionId;
    private MessageInputOptions options;

    private Builder(MessageInput messageInput) {
      this.messageType = messageInput.messageType;
      this.text = messageInput.text;
      this.intents = messageInput.intents;
      this.entities = messageInput.entities;
      this.suggestionId = messageInput.suggestionId;
      this.options = messageInput.options;
    }

    /** Instantiates a new builder. */
    public Builder() {}

    /**
     * Builds a MessageInput.
     *
     * @return the new MessageInput instance
     */
    public MessageInput build() {
      return new MessageInput(this);
    }

    /**
     * Adds an intent to intents.
     *
     * @param intent the new intent
     * @return the MessageInput builder
     */
    public Builder addIntent(RuntimeIntent intent) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(intent, "intent cannot be null");
      if (this.intents == null) {
        this.intents = new ArrayList<RuntimeIntent>();
      }
      this.intents.add(intent);
      return this;
    }

    /**
     * Adds an entity to entities.
     *
     * @param entity the new entity
     * @return the MessageInput builder
     */
    public Builder addEntity(RuntimeEntity entity) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(entity, "entity cannot be null");
      if (this.entities == null) {
        this.entities = new ArrayList<RuntimeEntity>();
      }
      this.entities.add(entity);
      return this;
    }

    /**
     * Set the messageType.
     *
     * @param messageType the messageType
     * @return the MessageInput builder
     */
    public Builder messageType(String messageType) {
      this.messageType = messageType;
      return this;
    }

    /**
     * Set the text.
     *
     * @param text the text
     * @return the MessageInput builder
     */
    public Builder text(String text) {
      this.text = text;
      return this;
    }

    /**
     * Set the intents. Existing intents will be replaced.
     *
     * @param intents the intents
     * @return the MessageInput builder
     */
    public Builder intents(List<RuntimeIntent> intents) {
      this.intents = intents;
      return this;
    }

    /**
     * Set the entities. Existing entities will be replaced.
     *
     * @param entities the entities
     * @return the MessageInput builder
     */
    public Builder entities(List<RuntimeEntity> entities) {
      this.entities = entities;
      return this;
    }

    /**
     * Set the suggestionId.
     *
     * @param suggestionId the suggestionId
     * @return the MessageInput builder
     */
    public Builder suggestionId(String suggestionId) {
      this.suggestionId = suggestionId;
      return this;
    }

    /**
     * Set the options.
     *
     * @param options the options
     * @return the MessageInput builder
     */
    public Builder options(MessageInputOptions options) {
      this.options = options;
      return this;
    }
  }

  protected MessageInput(Builder builder) {
    messageType = builder.messageType;
    text = builder.text;
    intents = builder.intents;
    entities = builder.entities;
    suggestionId = builder.suggestionId;
    options = builder.options;
  }

  /**
   * New builder.
   *
   * @return a MessageInput builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the messageType.
   *
   * <p>The type of the message:
   *
   * <p>- `text`: The user input is processed normally by the assistant. - `search`: Only search
   * results are returned. (Any dialog or actions skill is bypassed.)
   *
   * <p>**Note:** A `search` message results in an error if no search skill is configured for the
   * assistant.
   *
   * @return the messageType
   */
  public String messageType() {
    return messageType;
  }

  /**
   * Gets the text.
   *
   * <p>The text of the user input. This string cannot contain carriage return, newline, or tab
   * characters.
   *
   * @return the text
   */
  public String text() {
    return text;
  }

  /**
   * Gets the intents.
   *
   * <p>Intents to use when evaluating the user input. Include intents from the previous response to
   * continue using those intents rather than trying to recognize intents in the new input.
   *
   * @return the intents
   */
  public List<RuntimeIntent> intents() {
    return intents;
  }

  /**
   * Gets the entities.
   *
   * <p>Entities to use when evaluating the message. Include entities from the previous response to
   * continue using those entities rather than detecting entities in the new input.
   *
   * @return the entities
   */
  public List<RuntimeEntity> entities() {
    return entities;
  }

  /**
   * Gets the suggestionId.
   *
   * <p>For internal use only.
   *
   * @return the suggestionId
   */
  public String suggestionId() {
    return suggestionId;
  }

  /**
   * Gets the options.
   *
   * <p>Optional properties that control how the assistant responds.
   *
   * @return the options
   */
  public MessageInputOptions options() {
    return options;
  }
}
