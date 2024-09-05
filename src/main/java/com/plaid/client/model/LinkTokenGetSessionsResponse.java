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
import com.plaid.client.model.LinkSessionExit;
import com.plaid.client.model.LinkSessionExitDeprecated;
import com.plaid.client.model.LinkSessionResults;
import com.plaid.client.model.LinkSessionSuccess;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * An object containing information about a link session. Session data will be provided for up to six hours after the session has ended.
 */
@ApiModel(description = "An object containing information about a link session. Session data will be provided for up to six hours after the session has ended.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-04T20:03:42.500463Z[Etc/UTC]")
public class LinkTokenGetSessionsResponse {
  public static final String SERIALIZED_NAME_LINK_SESSION_ID = "link_session_id";
  @SerializedName(SERIALIZED_NAME_LINK_SESSION_ID)
  private String linkSessionId;

  public static final String SERIALIZED_NAME_STARTED_AT = "started_at";
  @SerializedName(SERIALIZED_NAME_STARTED_AT)
  private OffsetDateTime startedAt;

  public static final String SERIALIZED_NAME_FINISHED_AT = "finished_at";
  @SerializedName(SERIALIZED_NAME_FINISHED_AT)
  private OffsetDateTime finishedAt;

  public static final String SERIALIZED_NAME_ON_SUCCESS = "on_success";
  @SerializedName(SERIALIZED_NAME_ON_SUCCESS)
  private LinkSessionSuccess onSuccess;

  public static final String SERIALIZED_NAME_ON_EXIT = "on_exit";
  @SerializedName(SERIALIZED_NAME_ON_EXIT)
  private LinkSessionExitDeprecated onExit;

  public static final String SERIALIZED_NAME_EXIT = "exit";
  @SerializedName(SERIALIZED_NAME_EXIT)
  private LinkSessionExit exit;

  public static final String SERIALIZED_NAME_EVENTS = "events";
  @SerializedName(SERIALIZED_NAME_EVENTS)
  private List<LinkEvent> events = null;

  public static final String SERIALIZED_NAME_RESULTS = "results";
  @SerializedName(SERIALIZED_NAME_RESULTS)
  private LinkSessionResults results;


  public LinkTokenGetSessionsResponse linkSessionId(String linkSessionId) {
    
    this.linkSessionId = linkSessionId;
    return this;
  }

   /**
   * The unique ID for the link session.
   * @return linkSessionId
  **/
  @ApiModelProperty(required = true, value = "The unique ID for the link session.")

  public String getLinkSessionId() {
    return linkSessionId;
  }


  public void setLinkSessionId(String linkSessionId) {
    this.linkSessionId = linkSessionId;
  }


  public LinkTokenGetSessionsResponse startedAt(OffsetDateTime startedAt) {
    
    this.startedAt = startedAt;
    return this;
  }

   /**
   * The timestamp at which the link session was first started, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format.
   * @return startedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The timestamp at which the link session was first started, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format.")

  public OffsetDateTime getStartedAt() {
    return startedAt;
  }


  public void setStartedAt(OffsetDateTime startedAt) {
    this.startedAt = startedAt;
  }


  public LinkTokenGetSessionsResponse finishedAt(OffsetDateTime finishedAt) {
    
    this.finishedAt = finishedAt;
    return this;
  }

   /**
   * The timestamp at which the link session was finished, if available, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format.
   * @return finishedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The timestamp at which the link session was finished, if available, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format.")

  public OffsetDateTime getFinishedAt() {
    return finishedAt;
  }


  public void setFinishedAt(OffsetDateTime finishedAt) {
    this.finishedAt = finishedAt;
  }


  public LinkTokenGetSessionsResponse onSuccess(LinkSessionSuccess onSuccess) {
    
    this.onSuccess = onSuccess;
    return this;
  }

   /**
   * Get onSuccess
   * @return onSuccess
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LinkSessionSuccess getOnSuccess() {
    return onSuccess;
  }


  public void setOnSuccess(LinkSessionSuccess onSuccess) {
    this.onSuccess = onSuccess;
  }


  public LinkTokenGetSessionsResponse onExit(LinkSessionExitDeprecated onExit) {
    
    this.onExit = onExit;
    return this;
  }

   /**
   * Get onExit
   * @return onExit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LinkSessionExitDeprecated getOnExit() {
    return onExit;
  }


  public void setOnExit(LinkSessionExitDeprecated onExit) {
    this.onExit = onExit;
  }


  public LinkTokenGetSessionsResponse exit(LinkSessionExit exit) {
    
    this.exit = exit;
    return this;
  }

   /**
   * Get exit
   * @return exit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LinkSessionExit getExit() {
    return exit;
  }


  public void setExit(LinkSessionExit exit) {
    this.exit = exit;
  }


  public LinkTokenGetSessionsResponse events(List<LinkEvent> events) {
    
    this.events = events;
    return this;
  }

  public LinkTokenGetSessionsResponse addEventsItem(LinkEvent eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<>();
    }
    this.events.add(eventsItem);
    return this;
  }

   /**
   * List of customer-related Link events
   * @return events
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of customer-related Link events")

  public List<LinkEvent> getEvents() {
    return events;
  }


  public void setEvents(List<LinkEvent> events) {
    this.events = events;
  }


  public LinkTokenGetSessionsResponse results(LinkSessionResults results) {
    
    this.results = results;
    return this;
  }

   /**
   * Get results
   * @return results
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LinkSessionResults getResults() {
    return results;
  }


  public void setResults(LinkSessionResults results) {
    this.results = results;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkTokenGetSessionsResponse linkTokenGetSessionsResponse = (LinkTokenGetSessionsResponse) o;
    return Objects.equals(this.linkSessionId, linkTokenGetSessionsResponse.linkSessionId) &&
        Objects.equals(this.startedAt, linkTokenGetSessionsResponse.startedAt) &&
        Objects.equals(this.finishedAt, linkTokenGetSessionsResponse.finishedAt) &&
        Objects.equals(this.onSuccess, linkTokenGetSessionsResponse.onSuccess) &&
        Objects.equals(this.onExit, linkTokenGetSessionsResponse.onExit) &&
        Objects.equals(this.exit, linkTokenGetSessionsResponse.exit) &&
        Objects.equals(this.events, linkTokenGetSessionsResponse.events) &&
        Objects.equals(this.results, linkTokenGetSessionsResponse.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(linkSessionId, startedAt, finishedAt, onSuccess, onExit, exit, events, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkTokenGetSessionsResponse {\n");
    sb.append("    linkSessionId: ").append(toIndentedString(linkSessionId)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
    sb.append("    finishedAt: ").append(toIndentedString(finishedAt)).append("\n");
    sb.append("    onSuccess: ").append(toIndentedString(onSuccess)).append("\n");
    sb.append("    onExit: ").append(toIndentedString(onExit)).append("\n");
    sb.append("    exit: ").append(toIndentedString(exit)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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

