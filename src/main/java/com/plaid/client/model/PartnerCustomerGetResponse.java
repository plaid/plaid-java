/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.385.1
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
import com.plaid.client.model.PartnerEndCustomer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Response schema for &#x60;/partner/customer/get&#x60;.
 */
@ApiModel(description = "Response schema for `/partner/customer/get`.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-28T17:05:32.818783Z[Etc/UTC]")
public class PartnerCustomerGetResponse {
  public static final String SERIALIZED_NAME_END_CUSTOMER = "end_customer";
  @SerializedName(SERIALIZED_NAME_END_CUSTOMER)
  private PartnerEndCustomer endCustomer;

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;


  public PartnerCustomerGetResponse endCustomer(PartnerEndCustomer endCustomer) {
    
    this.endCustomer = endCustomer;
    return this;
  }

   /**
   * Get endCustomer
   * @return endCustomer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PartnerEndCustomer getEndCustomer() {
    return endCustomer;
  }


  public void setEndCustomer(PartnerEndCustomer endCustomer) {
    this.endCustomer = endCustomer;
  }


  public PartnerCustomerGetResponse requestId(String requestId) {
    
    this.requestId = requestId;
    return this;
  }

   /**
   * A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive.
   * @return requestId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive.")

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
    PartnerCustomerGetResponse partnerCustomerGetResponse = (PartnerCustomerGetResponse) o;
    return Objects.equals(this.endCustomer, partnerCustomerGetResponse.endCustomer) &&
        Objects.equals(this.requestId, partnerCustomerGetResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endCustomer, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartnerCustomerGetResponse {\n");
    sb.append("    endCustomer: ").append(toIndentedString(endCustomer)).append("\n");
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

