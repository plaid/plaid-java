/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.46.1
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
 * ProcessorStripeBankAccountTokenCreateResponse defines the response schema for &#x60;/processor/stripe/bank_account/create&#x60;
 */
@ApiModel(description = "ProcessorStripeBankAccountTokenCreateResponse defines the response schema for `/processor/stripe/bank_account/create`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-10T01:11:28.812Z[GMT]")
public class ProcessorStripeBankAccountTokenCreateResponse {
  public static final String SERIALIZED_NAME_STRIPE_BANK_ACCOUNT_TOKEN = "stripe_bank_account_token";
  @SerializedName(SERIALIZED_NAME_STRIPE_BANK_ACCOUNT_TOKEN)
  private String stripeBankAccountToken;

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;


  public ProcessorStripeBankAccountTokenCreateResponse stripeBankAccountToken(String stripeBankAccountToken) {
    
    this.stripeBankAccountToken = stripeBankAccountToken;
    return this;
  }

   /**
   * A token that can be sent to Stripe for use in making API calls to Plaid
   * @return stripeBankAccountToken
  **/
  @ApiModelProperty(required = true, value = "A token that can be sent to Stripe for use in making API calls to Plaid")

  public String getStripeBankAccountToken() {
    return stripeBankAccountToken;
  }


  public void setStripeBankAccountToken(String stripeBankAccountToken) {
    this.stripeBankAccountToken = stripeBankAccountToken;
  }


  public ProcessorStripeBankAccountTokenCreateResponse requestId(String requestId) {
    
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
    ProcessorStripeBankAccountTokenCreateResponse processorStripeBankAccountTokenCreateResponse = (ProcessorStripeBankAccountTokenCreateResponse) o;
    return Objects.equals(this.stripeBankAccountToken, processorStripeBankAccountTokenCreateResponse.stripeBankAccountToken) &&
        Objects.equals(this.requestId, processorStripeBankAccountTokenCreateResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stripeBankAccountToken, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessorStripeBankAccountTokenCreateResponse {\n");
    sb.append("    stripeBankAccountToken: ").append(toIndentedString(stripeBankAccountToken)).append("\n");
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

