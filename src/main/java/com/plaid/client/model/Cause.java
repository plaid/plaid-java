/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.78.2
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
import com.plaid.client.model.PlaidError;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * An error object and associated &#x60;item_id&#x60; used to identify a specific Item and error when a batch operation operating on multiple Items has encountered an error in one of the Items.
 */
@ApiModel(description = "An error object and associated `item_id` used to identify a specific Item and error when a batch operation operating on multiple Items has encountered an error in one of the Items.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-01T22:12:31.879Z[GMT]")
public class Cause {
  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private String itemId;

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private PlaidError error = null;


  public Cause itemId(String itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * The &#x60;item_id&#x60; of the Item associated with this webhook, warning, or error
   * @return itemId
  **/
  @ApiModelProperty(required = true, value = "The `item_id` of the Item associated with this webhook, warning, or error")

  public String getItemId() {
    return itemId;
  }


  public void setItemId(String itemId) {
    this.itemId = itemId;
  }


  public Cause error(PlaidError error) {
    
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @ApiModelProperty(required = true, value = "")

  public PlaidError getError() {
    return error;
  }


  public void setError(PlaidError error) {
    this.error = error;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cause cause = (Cause) o;
    return Objects.equals(this.itemId, cause.itemId) &&
        Objects.equals(this.error, cause.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemId, error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cause {\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

