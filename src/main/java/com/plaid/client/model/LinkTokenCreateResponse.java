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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * LinkTokenCreateResponse defines the response schema for &#x60;/link/token/create&#x60;
 */
@ApiModel(description = "LinkTokenCreateResponse defines the response schema for `/link/token/create`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-12T21:24:48.076128Z[Etc/UTC]")
public class LinkTokenCreateResponse {
  public static final String SERIALIZED_NAME_LINK_TOKEN = "link_token";
  @SerializedName(SERIALIZED_NAME_LINK_TOKEN)
  private String linkToken;

  public static final String SERIALIZED_NAME_EXPIRATION = "expiration";
  @SerializedName(SERIALIZED_NAME_EXPIRATION)
  private OffsetDateTime expiration;

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;

  public static final String SERIALIZED_NAME_HOSTED_LINK_URL = "hosted_link_url";
  @SerializedName(SERIALIZED_NAME_HOSTED_LINK_URL)
  private String hostedLinkUrl;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;


  public LinkTokenCreateResponse linkToken(String linkToken) {
    
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


  public LinkTokenCreateResponse expiration(OffsetDateTime expiration) {
    
    this.expiration = expiration;
    return this;
  }

   /**
   * The expiration date and time for the &#x60;link_token&#x60;, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format. By default, a &#x60;link_token&#x60; created to generate a &#x60;public_token&#x60; that will be exchanged for a new &#x60;access_token&#x60; expires after 4 hours, and a &#x60;link_token&#x60; created for an existing Item (such as when updating an existing &#x60;access_token&#x60; by launching Link in update mode) expires after 30 minutes. If using [Hosted Link](https://plaid.com/docs/link/hosted-link/), the &#x60;link_token&#x60; will expire at the same time as the Hosted Link URL, and you can customize the duration using the &#x60;hosted_link.url_lifetime_seconds&#x60; option in the request. If using Link Delivery (beta), the &#x60;link_token&#x60; will expire by default after 24 hours if sent via SMS and after 7 days if sent via email. If using Identity Verification, Link token expiration will not be enforced; an Identity Verification Link session can be created with an expired Link token.
   * @return expiration
  **/
  @ApiModelProperty(required = true, value = "The expiration date and time for the `link_token`, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format. By default, a `link_token` created to generate a `public_token` that will be exchanged for a new `access_token` expires after 4 hours, and a `link_token` created for an existing Item (such as when updating an existing `access_token` by launching Link in update mode) expires after 30 minutes. If using [Hosted Link](https://plaid.com/docs/link/hosted-link/), the `link_token` will expire at the same time as the Hosted Link URL, and you can customize the duration using the `hosted_link.url_lifetime_seconds` option in the request. If using Link Delivery (beta), the `link_token` will expire by default after 24 hours if sent via SMS and after 7 days if sent via email. If using Identity Verification, Link token expiration will not be enforced; an Identity Verification Link session can be created with an expired Link token.")

  public OffsetDateTime getExpiration() {
    return expiration;
  }


  public void setExpiration(OffsetDateTime expiration) {
    this.expiration = expiration;
  }


  public LinkTokenCreateResponse requestId(String requestId) {
    
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


  public LinkTokenCreateResponse hostedLinkUrl(String hostedLinkUrl) {
    
    this.hostedLinkUrl = hostedLinkUrl;
    return this;
  }

   /**
   * A URL of a Plaid-hosted Link flow that will use the Link token returned by this request. Only present if the session is enabled for Hosted Link. To enable the session for Hosted Link, send a &#x60;hosted_link&#x60; object in the request.
   * @return hostedLinkUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A URL of a Plaid-hosted Link flow that will use the Link token returned by this request. Only present if the session is enabled for Hosted Link. To enable the session for Hosted Link, send a `hosted_link` object in the request.")

  public String getHostedLinkUrl() {
    return hostedLinkUrl;
  }


  public void setHostedLinkUrl(String hostedLinkUrl) {
    this.hostedLinkUrl = hostedLinkUrl;
  }


  public LinkTokenCreateResponse userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * A unique &#x60;user_id&#x60; generated by Plaid for the client-provided &#x60;client_user_id&#x60;. This field is currently in beta.
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A unique `user_id` generated by Plaid for the client-provided `client_user_id`. This field is currently in beta.")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkTokenCreateResponse linkTokenCreateResponse = (LinkTokenCreateResponse) o;
    return Objects.equals(this.linkToken, linkTokenCreateResponse.linkToken) &&
        Objects.equals(this.expiration, linkTokenCreateResponse.expiration) &&
        Objects.equals(this.requestId, linkTokenCreateResponse.requestId) &&
        Objects.equals(this.hostedLinkUrl, linkTokenCreateResponse.hostedLinkUrl) &&
        Objects.equals(this.userId, linkTokenCreateResponse.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(linkToken, expiration, requestId, hostedLinkUrl, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkTokenCreateResponse {\n");
    sb.append("    linkToken: ").append(toIndentedString(linkToken)).append("\n");
    sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    hostedLinkUrl: ").append(toIndentedString(hostedLinkUrl)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

