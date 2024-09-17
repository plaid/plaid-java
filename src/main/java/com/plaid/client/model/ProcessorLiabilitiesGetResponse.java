/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.565.0
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
import com.plaid.client.model.AccountBase;
import com.plaid.client.model.LiabilitiesObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ProcessorLiabilitiesGetResponse defines the response schema for &#x60;/processor/liabilities/get&#x60;
 */
@ApiModel(description = "ProcessorLiabilitiesGetResponse defines the response schema for `/processor/liabilities/get`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-17T16:42:02.150702Z[Etc/UTC]")
public class ProcessorLiabilitiesGetResponse {
  public static final String SERIALIZED_NAME_ACCOUNT = "account";
  @SerializedName(SERIALIZED_NAME_ACCOUNT)
  private AccountBase account;

  public static final String SERIALIZED_NAME_LIABILITIES = "liabilities";
  @SerializedName(SERIALIZED_NAME_LIABILITIES)
  private LiabilitiesObject liabilities;

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;


  public ProcessorLiabilitiesGetResponse account(AccountBase account) {
    
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @ApiModelProperty(required = true, value = "")

  public AccountBase getAccount() {
    return account;
  }


  public void setAccount(AccountBase account) {
    this.account = account;
  }


  public ProcessorLiabilitiesGetResponse liabilities(LiabilitiesObject liabilities) {
    
    this.liabilities = liabilities;
    return this;
  }

   /**
   * Get liabilities
   * @return liabilities
  **/
  @ApiModelProperty(required = true, value = "")

  public LiabilitiesObject getLiabilities() {
    return liabilities;
  }


  public void setLiabilities(LiabilitiesObject liabilities) {
    this.liabilities = liabilities;
  }


  public ProcessorLiabilitiesGetResponse requestId(String requestId) {
    
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
    ProcessorLiabilitiesGetResponse processorLiabilitiesGetResponse = (ProcessorLiabilitiesGetResponse) o;
    return Objects.equals(this.account, processorLiabilitiesGetResponse.account) &&
        Objects.equals(this.liabilities, processorLiabilitiesGetResponse.liabilities) &&
        Objects.equals(this.requestId, processorLiabilitiesGetResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, liabilities, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessorLiabilitiesGetResponse {\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    liabilities: ").append(toIndentedString(liabilities)).append("\n");
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

