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
import java.util.ArrayList;
import java.util.List;

/**
 * SandboxUserResetLoginRequest defines the request schema for &#x60;/sandbox/user/reset_login&#x60;
 */
@ApiModel(description = "SandboxUserResetLoginRequest defines the request schema for `/sandbox/user/reset_login`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-12T21:24:48.076128Z[Etc/UTC]")
public class SandboxUserResetLoginRequest {
  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_USER_TOKEN = "user_token";
  @SerializedName(SERIALIZED_NAME_USER_TOKEN)
  private String userToken;

  public static final String SERIALIZED_NAME_ITEM_IDS = "item_ids";
  @SerializedName(SERIALIZED_NAME_ITEM_IDS)
  private List<String> itemIds = null;


  public SandboxUserResetLoginRequest clientId(String clientId) {
    
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


  public SandboxUserResetLoginRequest secret(String secret) {
    
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


  public SandboxUserResetLoginRequest userToken(String userToken) {
    
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


  public SandboxUserResetLoginRequest itemIds(List<String> itemIds) {
    
    this.itemIds = itemIds;
    return this;
  }

  public SandboxUserResetLoginRequest addItemIdsItem(String itemIdsItem) {
    if (this.itemIds == null) {
      this.itemIds = new ArrayList<>();
    }
    this.itemIds.add(itemIdsItem);
    return this;
  }

   /**
   * An array of &#x60;item_id&#x60;s associated with the User to be reset.  If empty or &#x60;null&#x60;, this field will default to resetting all Items associated with the User.
   * @return itemIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of `item_id`s associated with the User to be reset.  If empty or `null`, this field will default to resetting all Items associated with the User.")

  public List<String> getItemIds() {
    return itemIds;
  }


  public void setItemIds(List<String> itemIds) {
    this.itemIds = itemIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SandboxUserResetLoginRequest sandboxUserResetLoginRequest = (SandboxUserResetLoginRequest) o;
    return Objects.equals(this.clientId, sandboxUserResetLoginRequest.clientId) &&
        Objects.equals(this.secret, sandboxUserResetLoginRequest.secret) &&
        Objects.equals(this.userToken, sandboxUserResetLoginRequest.userToken) &&
        Objects.equals(this.itemIds, sandboxUserResetLoginRequest.itemIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, secret, userToken, itemIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SandboxUserResetLoginRequest {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    userToken: ").append(toIndentedString(userToken)).append("\n");
    sb.append("    itemIds: ").append(toIndentedString(itemIds)).append("\n");
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

