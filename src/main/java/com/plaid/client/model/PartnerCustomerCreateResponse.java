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
import com.plaid.client.model.PartnerEndCustomerWithSecrets;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Response schema for &#x60;/partner/customer/create&#x60;.
 */
@ApiModel(description = "Response schema for `/partner/customer/create`.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-12T21:24:48.076128Z[Etc/UTC]")
public class PartnerCustomerCreateResponse {
  public static final String SERIALIZED_NAME_END_CUSTOMER = "end_customer";
  @SerializedName(SERIALIZED_NAME_END_CUSTOMER)
  private PartnerEndCustomerWithSecrets endCustomer;

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;


  public PartnerCustomerCreateResponse endCustomer(PartnerEndCustomerWithSecrets endCustomer) {
    
    this.endCustomer = endCustomer;
    return this;
  }

   /**
   * Get endCustomer
   * @return endCustomer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PartnerEndCustomerWithSecrets getEndCustomer() {
    return endCustomer;
  }


  public void setEndCustomer(PartnerEndCustomerWithSecrets endCustomer) {
    this.endCustomer = endCustomer;
  }


  public PartnerCustomerCreateResponse requestId(String requestId) {
    
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
    PartnerCustomerCreateResponse partnerCustomerCreateResponse = (PartnerCustomerCreateResponse) o;
    return Objects.equals(this.endCustomer, partnerCustomerCreateResponse.endCustomer) &&
        Objects.equals(this.requestId, partnerCustomerCreateResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endCustomer, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartnerCustomerCreateResponse {\n");
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

