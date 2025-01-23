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
import java.util.ArrayList;
import java.util.List;

/**
 * BaseReportGetRequest defines the request schema for &#x60;/cra/check_report/base_report/get&#x60;
 */
@ApiModel(description = "BaseReportGetRequest defines the request schema for `/cra/check_report/base_report/get`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-23T18:11:57.813484Z[Etc/UTC]")
public class CraCheckReportBaseReportGetRequest {
  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_USER_TOKEN = "user_token";
  @SerializedName(SERIALIZED_NAME_USER_TOKEN)
  private String userToken;

  public static final String SERIALIZED_NAME_THIRD_PARTY_USER_TOKEN = "third_party_user_token";
  @SerializedName(SERIALIZED_NAME_THIRD_PARTY_USER_TOKEN)
  private String thirdPartyUserToken;

  public static final String SERIALIZED_NAME_ITEM_IDS = "item_ids";
  @SerializedName(SERIALIZED_NAME_ITEM_IDS)
  private List<String> itemIds = null;


  public CraCheckReportBaseReportGetRequest clientId(String clientId) {
    
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


  public CraCheckReportBaseReportGetRequest secret(String secret) {
    
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


  public CraCheckReportBaseReportGetRequest userToken(String userToken) {
    
    this.userToken = userToken;
    return this;
  }

   /**
   * The user token associated with the User data is being requested for.
   * @return userToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The user token associated with the User data is being requested for.")

  public String getUserToken() {
    return userToken;
  }


  public void setUserToken(String userToken) {
    this.userToken = userToken;
  }


  public CraCheckReportBaseReportGetRequest thirdPartyUserToken(String thirdPartyUserToken) {
    
    this.thirdPartyUserToken = thirdPartyUserToken;
    return this;
  }

   /**
   * The third-party user token associated with the requested User data.
   * @return thirdPartyUserToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The third-party user token associated with the requested User data.")

  public String getThirdPartyUserToken() {
    return thirdPartyUserToken;
  }


  public void setThirdPartyUserToken(String thirdPartyUserToken) {
    this.thirdPartyUserToken = thirdPartyUserToken;
  }


  public CraCheckReportBaseReportGetRequest itemIds(List<String> itemIds) {
    
    this.itemIds = itemIds;
    return this;
  }

  public CraCheckReportBaseReportGetRequest addItemIdsItem(String itemIdsItem) {
    if (this.itemIds == null) {
      this.itemIds = new ArrayList<>();
    }
    this.itemIds.add(itemIdsItem);
    return this;
  }

   /**
   * The item IDs to include in the Base Report. If not provided, all items associated with the user will be included.
   * @return itemIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The item IDs to include in the Base Report. If not provided, all items associated with the user will be included.")

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
    CraCheckReportBaseReportGetRequest craCheckReportBaseReportGetRequest = (CraCheckReportBaseReportGetRequest) o;
    return Objects.equals(this.clientId, craCheckReportBaseReportGetRequest.clientId) &&
        Objects.equals(this.secret, craCheckReportBaseReportGetRequest.secret) &&
        Objects.equals(this.userToken, craCheckReportBaseReportGetRequest.userToken) &&
        Objects.equals(this.thirdPartyUserToken, craCheckReportBaseReportGetRequest.thirdPartyUserToken) &&
        Objects.equals(this.itemIds, craCheckReportBaseReportGetRequest.itemIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, secret, userToken, thirdPartyUserToken, itemIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CraCheckReportBaseReportGetRequest {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    userToken: ").append(toIndentedString(userToken)).append("\n");
    sb.append("    thirdPartyUserToken: ").append(toIndentedString(thirdPartyUserToken)).append("\n");
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

