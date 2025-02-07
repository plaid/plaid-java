/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.617.1
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
import com.plaid.client.model.ConsentEvent;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Describes a historical log of item consent events.
 */
@ApiModel(description = "Describes a historical log of item consent events.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-07T19:05:33.763924Z[Etc/UTC]")
public class ConsentEventsGetResponse {
  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;

  public static final String SERIALIZED_NAME_CONSENT_EVENTS = "consent_events";
  @SerializedName(SERIALIZED_NAME_CONSENT_EVENTS)
  private List<ConsentEvent> consentEvents = new ArrayList<>();


  public ConsentEventsGetResponse requestId(String requestId) {
    
    this.requestId = requestId;
    return this;
  }

   /**
   * A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive.
   * @return requestId
  **/
  @ApiModelProperty(required = true, value = "A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive.")

  public String getRequestId() {
    return requestId;
  }


  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  public ConsentEventsGetResponse consentEvents(List<ConsentEvent> consentEvents) {
    
    this.consentEvents = consentEvents;
    return this;
  }

  public ConsentEventsGetResponse addConsentEventsItem(ConsentEvent consentEventsItem) {
    this.consentEvents.add(consentEventsItem);
    return this;
  }

   /**
   * A list of consent events.
   * @return consentEvents
  **/
  @ApiModelProperty(required = true, value = "A list of consent events.")

  public List<ConsentEvent> getConsentEvents() {
    return consentEvents;
  }


  public void setConsentEvents(List<ConsentEvent> consentEvents) {
    this.consentEvents = consentEvents;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsentEventsGetResponse consentEventsGetResponse = (ConsentEventsGetResponse) o;
    return Objects.equals(this.requestId, consentEventsGetResponse.requestId) &&
        Objects.equals(this.consentEvents, consentEventsGetResponse.consentEvents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, consentEvents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsentEventsGetResponse {\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    consentEvents: ").append(toIndentedString(consentEvents)).append("\n");
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

