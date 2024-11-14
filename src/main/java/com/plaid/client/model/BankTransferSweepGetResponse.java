/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.586.4
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
import com.plaid.client.model.BankTransferSweep;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * BankTransferSweepGetResponse defines the response schema for &#x60;/bank_transfer/sweep/get&#x60;
 */
@ApiModel(description = "BankTransferSweepGetResponse defines the response schema for `/bank_transfer/sweep/get`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-14T16:41:31.650700Z[Etc/UTC]")
public class BankTransferSweepGetResponse {
  public static final String SERIALIZED_NAME_SWEEP = "sweep";
  @SerializedName(SERIALIZED_NAME_SWEEP)
  private BankTransferSweep sweep;

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;


  public BankTransferSweepGetResponse sweep(BankTransferSweep sweep) {
    
    this.sweep = sweep;
    return this;
  }

   /**
   * Get sweep
   * @return sweep
  **/
  @ApiModelProperty(required = true, value = "")

  public BankTransferSweep getSweep() {
    return sweep;
  }


  public void setSweep(BankTransferSweep sweep) {
    this.sweep = sweep;
  }


  public BankTransferSweepGetResponse requestId(String requestId) {
    
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
    BankTransferSweepGetResponse bankTransferSweepGetResponse = (BankTransferSweepGetResponse) o;
    return Objects.equals(this.sweep, bankTransferSweepGetResponse.sweep) &&
        Objects.equals(this.requestId, bankTransferSweepGetResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sweep, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankTransferSweepGetResponse {\n");
    sb.append("    sweep: ").append(toIndentedString(sweep)).append("\n");
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

