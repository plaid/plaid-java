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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * IssuesSearchRequest defines the request schema for &#x60;/issues/search&#x60;.
 */
@ApiModel(description = "IssuesSearchRequest defines the request schema for `/issues/search`.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-07T19:05:33.763924Z[Etc/UTC]")
public class IssuesSearchRequest {
  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private String itemId;

  public static final String SERIALIZED_NAME_LINK_SESSION_ID = "link_session_id";
  @SerializedName(SERIALIZED_NAME_LINK_SESSION_ID)
  private String linkSessionId;

  public static final String SERIALIZED_NAME_LINK_SESSION_REQUEST_ID = "link_session_request_id";
  @SerializedName(SERIALIZED_NAME_LINK_SESSION_REQUEST_ID)
  private String linkSessionRequestId;


  public IssuesSearchRequest clientId(String clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * Your Plaid API &#x60;client_id&#x60;. The &#x60;client_id&#x60; is required and may be provided either in the &#x60;PLAID-CLIENT-ID&#x60; header or as part of a request body.
   * @return clientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Your Plaid API `client_id`. The `client_id` is required and may be provided either in the `PLAID-CLIENT-ID` header or as part of a request body.")

  public String getClientId() {
    return clientId;
  }


  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public IssuesSearchRequest secret(String secret) {
    
    this.secret = secret;
    return this;
  }

   /**
   * Your Plaid API &#x60;secret&#x60;. The &#x60;secret&#x60; is required and may be provided either in the &#x60;PLAID-SECRET&#x60; header or as part of a request body.
   * @return secret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Your Plaid API `secret`. The `secret` is required and may be provided either in the `PLAID-SECRET` header or as part of a request body.")

  public String getSecret() {
    return secret;
  }


  public void setSecret(String secret) {
    this.secret = secret;
  }


  public IssuesSearchRequest itemId(String itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * A unique identifier for the Plaid Item.
   * @return itemId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A unique identifier for the Plaid Item.")

  public String getItemId() {
    return itemId;
  }


  public void setItemId(String itemId) {
    this.itemId = itemId;
  }


  public IssuesSearchRequest linkSessionId(String linkSessionId) {
    
    this.linkSessionId = linkSessionId;
    return this;
  }

   /**
   * A unique identifier for the Link session.
   * @return linkSessionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A unique identifier for the Link session.")

  public String getLinkSessionId() {
    return linkSessionId;
  }


  public void setLinkSessionId(String linkSessionId) {
    this.linkSessionId = linkSessionId;
  }


  public IssuesSearchRequest linkSessionRequestId(String linkSessionRequestId) {
    
    this.linkSessionRequestId = linkSessionRequestId;
    return this;
  }

   /**
   * The &#x60;request_id&#x60; for the Link session that might have had an institution connection issue.
   * @return linkSessionRequestId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The `request_id` for the Link session that might have had an institution connection issue.")

  public String getLinkSessionRequestId() {
    return linkSessionRequestId;
  }


  public void setLinkSessionRequestId(String linkSessionRequestId) {
    this.linkSessionRequestId = linkSessionRequestId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssuesSearchRequest issuesSearchRequest = (IssuesSearchRequest) o;
    return Objects.equals(this.clientId, issuesSearchRequest.clientId) &&
        Objects.equals(this.secret, issuesSearchRequest.secret) &&
        Objects.equals(this.itemId, issuesSearchRequest.itemId) &&
        Objects.equals(this.linkSessionId, issuesSearchRequest.linkSessionId) &&
        Objects.equals(this.linkSessionRequestId, issuesSearchRequest.linkSessionRequestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, secret, itemId, linkSessionId, linkSessionRequestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssuesSearchRequest {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    linkSessionId: ").append(toIndentedString(linkSessionId)).append("\n");
    sb.append("    linkSessionRequestId: ").append(toIndentedString(linkSessionRequestId)).append("\n");
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

