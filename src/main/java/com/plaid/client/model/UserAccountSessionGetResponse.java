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
import com.plaid.client.model.UserAccountIdentity;
import com.plaid.client.model.UserAccountItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * UserAccountSessionGetResponse defines the response schema for &#x60;/user_account/session/get&#x60;
 */
@ApiModel(description = "UserAccountSessionGetResponse defines the response schema for `/user_account/session/get`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-23T20:55:58.809242Z[Etc/UTC]")
public class UserAccountSessionGetResponse {
  public static final String SERIALIZED_NAME_IDENTITY = "identity";
  @SerializedName(SERIALIZED_NAME_IDENTITY)
  private UserAccountIdentity identity;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<UserAccountItem> items = new ArrayList<>();

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;


  public UserAccountSessionGetResponse identity(UserAccountIdentity identity) {
    
    this.identity = identity;
    return this;
  }

   /**
   * Get identity
   * @return identity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public UserAccountIdentity getIdentity() {
    return identity;
  }


  public void setIdentity(UserAccountIdentity identity) {
    this.identity = identity;
  }


  public UserAccountSessionGetResponse items(List<UserAccountItem> items) {
    
    this.items = items;
    return this;
  }

  public UserAccountSessionGetResponse addItemsItem(UserAccountItem itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @ApiModelProperty(required = true, value = "")

  public List<UserAccountItem> getItems() {
    return items;
  }


  public void setItems(List<UserAccountItem> items) {
    this.items = items;
  }


  public UserAccountSessionGetResponse requestId(String requestId) {
    
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
    UserAccountSessionGetResponse userAccountSessionGetResponse = (UserAccountSessionGetResponse) o;
    return Objects.equals(this.identity, userAccountSessionGetResponse.identity) &&
        Objects.equals(this.items, userAccountSessionGetResponse.items) &&
        Objects.equals(this.requestId, userAccountSessionGetResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identity, items, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAccountSessionGetResponse {\n");
    sb.append("    identity: ").append(toIndentedString(identity)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

