/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.610.1
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
 * UserThirdPartyTokenCreateRequest defines the request schema for &#x60;/user/third_party_token/create&#x60;
 */
@ApiModel(description = "UserThirdPartyTokenCreateRequest defines the request schema for `/user/third_party_token/create`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-23T18:11:57.813484Z[Etc/UTC]")
public class UserThirdPartyTokenCreateRequest {
  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_USER_TOKEN = "user_token";
  @SerializedName(SERIALIZED_NAME_USER_TOKEN)
  private String userToken;

  public static final String SERIALIZED_NAME_THIRD_PARTY_CLIENT_ID = "third_party_client_id";
  @SerializedName(SERIALIZED_NAME_THIRD_PARTY_CLIENT_ID)
  private String thirdPartyClientId;

  public static final String SERIALIZED_NAME_EXPIRATION_TIME = "expiration_time";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_TIME)
  private OffsetDateTime expirationTime;


  public UserThirdPartyTokenCreateRequest clientId(String clientId) {
    
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


  public UserThirdPartyTokenCreateRequest secret(String secret) {
    
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


  public UserThirdPartyTokenCreateRequest userToken(String userToken) {
    
    this.userToken = userToken;
    return this;
  }

   /**
   * The user token associated with the User data is being requested for.
   * @return userToken
  **/
  @ApiModelProperty(required = true, value = "The user token associated with the User data is being requested for.")

  public String getUserToken() {
    return userToken;
  }


  public void setUserToken(String userToken) {
    this.userToken = userToken;
  }


  public UserThirdPartyTokenCreateRequest thirdPartyClientId(String thirdPartyClientId) {
    
    this.thirdPartyClientId = thirdPartyClientId;
    return this;
  }

   /**
   * The Plaid API &#x60;client_id&#x60; of the third-party client the token will be shared with. The token will only be valid for the specified client.
   * @return thirdPartyClientId
  **/
  @ApiModelProperty(required = true, value = "The Plaid API `client_id` of the third-party client the token will be shared with. The token will only be valid for the specified client.")

  public String getThirdPartyClientId() {
    return thirdPartyClientId;
  }


  public void setThirdPartyClientId(String thirdPartyClientId) {
    this.thirdPartyClientId = thirdPartyClientId;
  }


  public UserThirdPartyTokenCreateRequest expirationTime(OffsetDateTime expirationTime) {
    
    this.expirationTime = expirationTime;
    return this;
  }

   /**
   * The expiration date and time for the third-party user token in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (&#x60;YYYY-MM-DDThh:mm:ssZ&#x60;). The expiration is restricted to a maximum of 24 hours from the token&#39;s creation time. If not provided, the token will automatically expire after 24 hours.
   * @return expirationTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The expiration date and time for the third-party user token in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (`YYYY-MM-DDThh:mm:ssZ`). The expiration is restricted to a maximum of 24 hours from the token's creation time. If not provided, the token will automatically expire after 24 hours.")

  public OffsetDateTime getExpirationTime() {
    return expirationTime;
  }


  public void setExpirationTime(OffsetDateTime expirationTime) {
    this.expirationTime = expirationTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserThirdPartyTokenCreateRequest userThirdPartyTokenCreateRequest = (UserThirdPartyTokenCreateRequest) o;
    return Objects.equals(this.clientId, userThirdPartyTokenCreateRequest.clientId) &&
        Objects.equals(this.secret, userThirdPartyTokenCreateRequest.secret) &&
        Objects.equals(this.userToken, userThirdPartyTokenCreateRequest.userToken) &&
        Objects.equals(this.thirdPartyClientId, userThirdPartyTokenCreateRequest.thirdPartyClientId) &&
        Objects.equals(this.expirationTime, userThirdPartyTokenCreateRequest.expirationTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, secret, userToken, thirdPartyClientId, expirationTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserThirdPartyTokenCreateRequest {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    userToken: ").append(toIndentedString(userToken)).append("\n");
    sb.append("    thirdPartyClientId: ").append(toIndentedString(thirdPartyClientId)).append("\n");
    sb.append("    expirationTime: ").append(toIndentedString(expirationTime)).append("\n");
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

