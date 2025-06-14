/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.645.0
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
import com.plaid.client.model.TrustIndex;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * Response object for /protect/event/get
 */
@ApiModel(description = "Response object for /protect/event/get")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-12T21:24:48.076128Z[Etc/UTC]")
public class ProtectEventGetResponse {
  public static final String SERIALIZED_NAME_EVENT_ID = "event_id";
  @SerializedName(SERIALIZED_NAME_EVENT_ID)
  private String eventId;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private OffsetDateTime timestamp;

  public static final String SERIALIZED_NAME_TRUST_INDEX = "trust_index";
  @SerializedName(SERIALIZED_NAME_TRUST_INDEX)
  private TrustIndex trustIndex;

  public static final String SERIALIZED_NAME_FRAUD_ATTRIBUTES = "fraud_attributes";
  @SerializedName(SERIALIZED_NAME_FRAUD_ATTRIBUTES)
  private Object fraudAttributes;

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;


  public ProtectEventGetResponse eventId(String eventId) {
    
    this.eventId = eventId;
    return this;
  }

   /**
   * The event ID.
   * @return eventId
  **/
  @ApiModelProperty(required = true, value = "The event ID.")

  public String getEventId() {
    return eventId;
  }


  public void setEventId(String eventId) {
    this.eventId = eventId;
  }


  public ProtectEventGetResponse timestamp(OffsetDateTime timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * The timestamp of the event, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format, e.g. &#x60;\&quot;2017-09-14T14:42:19.350Z\&quot;&#x60;
   * @return timestamp
  **/
  @ApiModelProperty(required = true, value = "The timestamp of the event, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format, e.g. `\"2017-09-14T14:42:19.350Z\"`")

  public OffsetDateTime getTimestamp() {
    return timestamp;
  }


  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }


  public ProtectEventGetResponse trustIndex(TrustIndex trustIndex) {
    
    this.trustIndex = trustIndex;
    return this;
  }

   /**
   * Get trustIndex
   * @return trustIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TrustIndex getTrustIndex() {
    return trustIndex;
  }


  public void setTrustIndex(TrustIndex trustIndex) {
    this.trustIndex = trustIndex;
  }


  public ProtectEventGetResponse fraudAttributes(Object fraudAttributes) {
    
    this.fraudAttributes = fraudAttributes;
    return this;
  }

   /**
   * Event fraud attributes as an arbitrary set of key-value pairs.
   * @return fraudAttributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Event fraud attributes as an arbitrary set of key-value pairs.")

  public Object getFraudAttributes() {
    return fraudAttributes;
  }


  public void setFraudAttributes(Object fraudAttributes) {
    this.fraudAttributes = fraudAttributes;
  }


  public ProtectEventGetResponse requestId(String requestId) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProtectEventGetResponse protectEventGetResponse = (ProtectEventGetResponse) o;
    return Objects.equals(this.eventId, protectEventGetResponse.eventId) &&
        Objects.equals(this.timestamp, protectEventGetResponse.timestamp) &&
        Objects.equals(this.trustIndex, protectEventGetResponse.trustIndex) &&
        Objects.equals(this.fraudAttributes, protectEventGetResponse.fraudAttributes) &&
        Objects.equals(this.requestId, protectEventGetResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, timestamp, trustIndex, fraudAttributes, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProtectEventGetResponse {\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    trustIndex: ").append(toIndentedString(trustIndex)).append("\n");
    sb.append("    fraudAttributes: ").append(toIndentedString(fraudAttributes)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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

