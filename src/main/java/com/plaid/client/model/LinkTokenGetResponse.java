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
import com.plaid.client.model.LinkTokenGetMetadataResponse;
import com.plaid.client.model.LinkTokenGetSessionsResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * LinkTokenGetResponse defines the response schema for &#x60;/link/token/get&#x60;
 */
@ApiModel(description = "LinkTokenGetResponse defines the response schema for `/link/token/get`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-07T19:05:33.763924Z[Etc/UTC]")
public class LinkTokenGetResponse {
  public static final String SERIALIZED_NAME_LINK_TOKEN = "link_token";
  @SerializedName(SERIALIZED_NAME_LINK_TOKEN)
  private String linkToken;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_EXPIRATION = "expiration";
  @SerializedName(SERIALIZED_NAME_EXPIRATION)
  private OffsetDateTime expiration;

  public static final String SERIALIZED_NAME_LINK_SESSIONS = "link_sessions";
  @SerializedName(SERIALIZED_NAME_LINK_SESSIONS)
  private List<LinkTokenGetSessionsResponse> linkSessions = null;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private LinkTokenGetMetadataResponse metadata;

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;


  public LinkTokenGetResponse linkToken(String linkToken) {
    
    this.linkToken = linkToken;
    return this;
  }

   /**
   * A &#x60;link_token&#x60;, which can be supplied to Link in order to initialize it and receive a &#x60;public_token&#x60;, which can be exchanged for an &#x60;access_token&#x60;.
   * @return linkToken
  **/
  @ApiModelProperty(required = true, value = "A `link_token`, which can be supplied to Link in order to initialize it and receive a `public_token`, which can be exchanged for an `access_token`.")

  public String getLinkToken() {
    return linkToken;
  }


  public void setLinkToken(String linkToken) {
    this.linkToken = linkToken;
  }


  public LinkTokenGetResponse createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The creation timestamp for the &#x60;link_token&#x60;, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The creation timestamp for the `link_token`, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format.")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public LinkTokenGetResponse expiration(OffsetDateTime expiration) {
    
    this.expiration = expiration;
    return this;
  }

   /**
   * The expiration timestamp for the &#x60;link_token&#x60;, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format.
   * @return expiration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The expiration timestamp for the `link_token`, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format.")

  public OffsetDateTime getExpiration() {
    return expiration;
  }


  public void setExpiration(OffsetDateTime expiration) {
    this.expiration = expiration;
  }


  public LinkTokenGetResponse linkSessions(List<LinkTokenGetSessionsResponse> linkSessions) {
    
    this.linkSessions = linkSessions;
    return this;
  }

  public LinkTokenGetResponse addLinkSessionsItem(LinkTokenGetSessionsResponse linkSessionsItem) {
    if (this.linkSessions == null) {
      this.linkSessions = new ArrayList<>();
    }
    this.linkSessions.add(linkSessionsItem);
    return this;
  }

   /**
   * Information about Link sessions created using this &#x60;link_token&#x60;. Session data will be provided for up to six hours after the session has ended.
   * @return linkSessions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Information about Link sessions created using this `link_token`. Session data will be provided for up to six hours after the session has ended.")

  public List<LinkTokenGetSessionsResponse> getLinkSessions() {
    return linkSessions;
  }


  public void setLinkSessions(List<LinkTokenGetSessionsResponse> linkSessions) {
    this.linkSessions = linkSessions;
  }


  public LinkTokenGetResponse metadata(LinkTokenGetMetadataResponse metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @ApiModelProperty(required = true, value = "")

  public LinkTokenGetMetadataResponse getMetadata() {
    return metadata;
  }


  public void setMetadata(LinkTokenGetMetadataResponse metadata) {
    this.metadata = metadata;
  }


  public LinkTokenGetResponse requestId(String requestId) {
    
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
    LinkTokenGetResponse linkTokenGetResponse = (LinkTokenGetResponse) o;
    return Objects.equals(this.linkToken, linkTokenGetResponse.linkToken) &&
        Objects.equals(this.createdAt, linkTokenGetResponse.createdAt) &&
        Objects.equals(this.expiration, linkTokenGetResponse.expiration) &&
        Objects.equals(this.linkSessions, linkTokenGetResponse.linkSessions) &&
        Objects.equals(this.metadata, linkTokenGetResponse.metadata) &&
        Objects.equals(this.requestId, linkTokenGetResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(linkToken, createdAt, expiration, linkSessions, metadata, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkTokenGetResponse {\n");
    sb.append("    linkToken: ").append(toIndentedString(linkToken)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
    sb.append("    linkSessions: ").append(toIndentedString(linkSessions)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

