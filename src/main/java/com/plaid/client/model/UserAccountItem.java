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
 * An Item created during a Layer authorization session.
 */
@ApiModel(description = "An Item created during a Layer authorization session.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-07T19:05:33.763924Z[Etc/UTC]")
public class UserAccountItem {
  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private String itemId;

  public static final String SERIALIZED_NAME_ACCESS_TOKEN = "access_token";
  @SerializedName(SERIALIZED_NAME_ACCESS_TOKEN)
  private String accessToken;


  public UserAccountItem itemId(String itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * The Plaid Item ID. The &#x60;item_id&#x60; is always unique; linking the same account at the same institution twice will result in two Items with different &#x60;item_id&#x60; values. Like all Plaid identifiers, the &#x60;item_id&#x60; is case-sensitive.
   * @return itemId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Plaid Item ID. The `item_id` is always unique; linking the same account at the same institution twice will result in two Items with different `item_id` values. Like all Plaid identifiers, the `item_id` is case-sensitive.")

  public String getItemId() {
    return itemId;
  }


  public void setItemId(String itemId) {
    this.itemId = itemId;
  }


  public UserAccountItem accessToken(String accessToken) {
    
    this.accessToken = accessToken;
    return this;
  }

   /**
   * The access token associated with the Item data is being requested for.
   * @return accessToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The access token associated with the Item data is being requested for.")

  public String getAccessToken() {
    return accessToken;
  }


  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserAccountItem userAccountItem = (UserAccountItem) o;
    return Objects.equals(this.itemId, userAccountItem.itemId) &&
        Objects.equals(this.accessToken, userAccountItem.accessToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemId, accessToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAccountItem {\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
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

