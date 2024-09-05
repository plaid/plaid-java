/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.556.0
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
import com.plaid.client.model.DetailedOriginator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Defines the response schema for &#x60;/transfer/originator/get&#x60;
 */
@ApiModel(description = "Defines the response schema for `/transfer/originator/get`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-04T20:03:42.500463Z[Etc/UTC]")
public class TransferOriginatorGetResponse {
  public static final String SERIALIZED_NAME_ORIGINATOR = "originator";
  @SerializedName(SERIALIZED_NAME_ORIGINATOR)
  private DetailedOriginator originator;

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;


  public TransferOriginatorGetResponse originator(DetailedOriginator originator) {
    
    this.originator = originator;
    return this;
  }

   /**
   * Get originator
   * @return originator
  **/
  @ApiModelProperty(required = true, value = "")

  public DetailedOriginator getOriginator() {
    return originator;
  }


  public void setOriginator(DetailedOriginator originator) {
    this.originator = originator;
  }


  public TransferOriginatorGetResponse requestId(String requestId) {
    
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
    TransferOriginatorGetResponse transferOriginatorGetResponse = (TransferOriginatorGetResponse) o;
    return Objects.equals(this.originator, transferOriginatorGetResponse.originator) &&
        Objects.equals(this.requestId, transferOriginatorGetResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(originator, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferOriginatorGetResponse {\n");
    sb.append("    originator: ").append(toIndentedString(originator)).append("\n");
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

