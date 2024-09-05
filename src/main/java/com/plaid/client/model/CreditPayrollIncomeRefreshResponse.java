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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CreditPayrollIncomeRefreshResponse defines the response schema for &#x60;/credit/payroll_income/refresh&#x60;
 */
@ApiModel(description = "CreditPayrollIncomeRefreshResponse defines the response schema for `/credit/payroll_income/refresh`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-04T20:03:42.500463Z[Etc/UTC]")
public class CreditPayrollIncomeRefreshResponse {
  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;

  public static final String SERIALIZED_NAME_VERIFICATION_REFRESH_STATUS = "verification_refresh_status";
  @SerializedName(SERIALIZED_NAME_VERIFICATION_REFRESH_STATUS)
  private String verificationRefreshStatus;


  public CreditPayrollIncomeRefreshResponse requestId(String requestId) {
    
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


  public CreditPayrollIncomeRefreshResponse verificationRefreshStatus(String verificationRefreshStatus) {
    
    this.verificationRefreshStatus = verificationRefreshStatus;
    return this;
  }

   /**
   * The verification refresh status. One of the following:  &#x60;\&quot;USER_PRESENCE_REQUIRED\&quot;&#x60; User presence is required to refresh an income verification. &#x60;\&quot;SUCCESSFUL\&quot;&#x60; The income verification refresh was successful. &#x60;\&quot;NOT_FOUND\&quot;&#x60; No new data was found after the income verification refresh.
   * @return verificationRefreshStatus
  **/
  @ApiModelProperty(required = true, value = "The verification refresh status. One of the following:  `\"USER_PRESENCE_REQUIRED\"` User presence is required to refresh an income verification. `\"SUCCESSFUL\"` The income verification refresh was successful. `\"NOT_FOUND\"` No new data was found after the income verification refresh.")

  public String getVerificationRefreshStatus() {
    return verificationRefreshStatus;
  }


  public void setVerificationRefreshStatus(String verificationRefreshStatus) {
    this.verificationRefreshStatus = verificationRefreshStatus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditPayrollIncomeRefreshResponse creditPayrollIncomeRefreshResponse = (CreditPayrollIncomeRefreshResponse) o;
    return Objects.equals(this.requestId, creditPayrollIncomeRefreshResponse.requestId) &&
        Objects.equals(this.verificationRefreshStatus, creditPayrollIncomeRefreshResponse.verificationRefreshStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, verificationRefreshStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditPayrollIncomeRefreshResponse {\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    verificationRefreshStatus: ").append(toIndentedString(verificationRefreshStatus)).append("\n");
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

