/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.556.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.plaid.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.plaid.client.model.LinkEvent;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * This webhook contains a summary of the events from a Link session and will be fired after the user finishes going through Link. If the user abandons the Link flow (i.e., closes the hosted link webpage or leaves Link open for too long without taking any action), the webhook will be fired 5-15 minutes after the last user interaction. A single Link session may occasionally generate multiple &#x60;EVENTS&#x60; webhooks. If this occurs, the new webhook will contain all previous events for the session, as well as new events that occurred since the previous &#x60;EVENTS&#x60; webhook was sent. If this occurs, events can be grouped using the &#x60;link_session_id&#x60; field and, if necessary, de-duplicated using the &#x60;event_id&#x60; field. By default, the &#x60;EVENTS&#x60; webhook is enabled only for clients that are enabled for Hosted Link. If you would like to receive this webhook and are not using Hosted Link, contact your Account Manager.
 */
@ApiModel(description = "This webhook contains a summary of the events from a Link session and will be fired after the user finishes going through Link. If the user abandons the Link flow (i.e., closes the hosted link webpage or leaves Link open for too long without taking any action), the webhook will be fired 5-15 minutes after the last user interaction. A single Link session may occasionally generate multiple `EVENTS` webhooks. If this occurs, the new webhook will contain all previous events for the session, as well as new events that occurred since the previous `EVENTS` webhook was sent. If this occurs, events can be grouped using the `link_session_id` field and, if necessary, de-duplicated using the `event_id` field. By default, the `EVENTS` webhook is enabled only for clients that are enabled for Hosted Link. If you would like to receive this webhook and are not using Hosted Link, contact your Account Manager.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-04T20:03:42.500463Z[Etc/UTC]")
public class LinkEventsWebhook {
  public static final String SERIALIZED_NAME_WEBHOOK_TYPE = "webhook_type";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_TYPE)
  private String webhookType;

  public static final String SERIALIZED_NAME_WEBHOOK_CODE = "webhook_code";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_CODE)
  private String webhookCode;

  public static final String SERIALIZED_NAME_EVENTS = "events";
  @SerializedName(SERIALIZED_NAME_EVENTS)
  private List<LinkEvent> events = new ArrayList<>();

  public static final String SERIALIZED_NAME_LINK_SESSION_ID = "link_session_id";
  @SerializedName(SERIALIZED_NAME_LINK_SESSION_ID)
  private String linkSessionId;

  public static final String SERIALIZED_NAME_LINK_TOKEN = "link_token";
  @SerializedName(SERIALIZED_NAME_LINK_TOKEN)
  private String linkToken;


  public LinkEventsWebhook webhookType(String webhookType) {
    
    this.webhookType = webhookType;
    return this;
  }

   /**
   * &#x60;LINK&#x60;
   * @return webhookType
  **/
  @ApiModelProperty(required = true, value = "`LINK`")

  public String getWebhookType() {
    return webhookType;
  }


  public void setWebhookType(String webhookType) {
    this.webhookType = webhookType;
  }


  public LinkEventsWebhook webhookCode(String webhookCode) {
    
    this.webhookCode = webhookCode;
    return this;
  }

   /**
   * &#x60;EVENTS&#x60;
   * @return webhookCode
  **/
  @ApiModelProperty(required = true, value = "`EVENTS`")

  public String getWebhookCode() {
    return webhookCode;
  }


  public void setWebhookCode(String webhookCode) {
    this.webhookCode = webhookCode;
  }


  public LinkEventsWebhook events(List<LinkEvent> events) {
    
    this.events = events;
    return this;
  }

  public LinkEventsWebhook addEventsItem(LinkEvent eventsItem) {
    this.events.add(eventsItem);
    return this;
  }

   /**
   * The Link events emitted during the Link session
   * @return events
  **/
  @ApiModelProperty(required = true, value = "The Link events emitted during the Link session")

  public List<LinkEvent> getEvents() {
    return events;
  }


  public void setEvents(List<LinkEvent> events) {
    this.events = events;
  }


  public LinkEventsWebhook linkSessionId(String linkSessionId) {
    
    this.linkSessionId = linkSessionId;
    return this;
  }

   /**
   * An identifier for the Link session these events occurred in
   * @return linkSessionId
  **/
  @ApiModelProperty(required = true, value = "An identifier for the Link session these events occurred in")

  public String getLinkSessionId() {
    return linkSessionId;
  }


  public void setLinkSessionId(String linkSessionId) {
    this.linkSessionId = linkSessionId;
  }


  public LinkEventsWebhook linkToken(String linkToken) {
    
    this.linkToken = linkToken;
    return this;
  }

   /**
   * The Link token used to create the Link session these events are from
   * @return linkToken
  **/
  @ApiModelProperty(required = true, value = "The Link token used to create the Link session these events are from")

  public String getLinkToken() {
    return linkToken;
  }


  public void setLinkToken(String linkToken) {
    this.linkToken = linkToken;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkEventsWebhook linkEventsWebhook = (LinkEventsWebhook) o;
    return Objects.equals(this.webhookType, linkEventsWebhook.webhookType) &&
        Objects.equals(this.webhookCode, linkEventsWebhook.webhookCode) &&
        Objects.equals(this.events, linkEventsWebhook.events) &&
        Objects.equals(this.linkSessionId, linkEventsWebhook.linkSessionId) &&
        Objects.equals(this.linkToken, linkEventsWebhook.linkToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhookType, webhookCode, events, linkSessionId, linkToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkEventsWebhook {\n");
    sb.append("    webhookType: ").append(toIndentedString(webhookType)).append("\n");
    sb.append("    webhookCode: ").append(toIndentedString(webhookCode)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    linkSessionId: ").append(toIndentedString(linkSessionId)).append("\n");
    sb.append("    linkToken: ").append(toIndentedString(linkToken)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

