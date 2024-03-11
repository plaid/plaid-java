/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.499.0
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
import com.plaid.client.model.AccountVerificationInsightsAccountNumberFormat;
import com.plaid.client.model.AccountVerificationInsightsNetworkStatus;
import com.plaid.client.model.AccountVerificationInsightsPreviousReturns;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Insights from performing database verification for the account.
 */
@ApiModel(description = "Insights from performing database verification for the account.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-11T17:59:43.087249Z[Etc/UTC]")
public class AccountVerificationInsights {
  public static final String SERIALIZED_NAME_NETWORK_STATUS = "network_status";
  @SerializedName(SERIALIZED_NAME_NETWORK_STATUS)
  private AccountVerificationInsightsNetworkStatus networkStatus;

  public static final String SERIALIZED_NAME_PREVIOUS_RETURNS = "previous_returns";
  @SerializedName(SERIALIZED_NAME_PREVIOUS_RETURNS)
  private AccountVerificationInsightsPreviousReturns previousReturns;

  public static final String SERIALIZED_NAME_ACCOUNT_NUMBER_FORMAT = "account_number_format";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NUMBER_FORMAT)
  private AccountVerificationInsightsAccountNumberFormat accountNumberFormat;


  public AccountVerificationInsights networkStatus(AccountVerificationInsightsNetworkStatus networkStatus) {
    
    this.networkStatus = networkStatus;
    return this;
  }

   /**
   * Get networkStatus
   * @return networkStatus
  **/
  @ApiModelProperty(required = true, value = "")

  public AccountVerificationInsightsNetworkStatus getNetworkStatus() {
    return networkStatus;
  }


  public void setNetworkStatus(AccountVerificationInsightsNetworkStatus networkStatus) {
    this.networkStatus = networkStatus;
  }


  public AccountVerificationInsights previousReturns(AccountVerificationInsightsPreviousReturns previousReturns) {
    
    this.previousReturns = previousReturns;
    return this;
  }

   /**
   * Get previousReturns
   * @return previousReturns
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AccountVerificationInsightsPreviousReturns getPreviousReturns() {
    return previousReturns;
  }


  public void setPreviousReturns(AccountVerificationInsightsPreviousReturns previousReturns) {
    this.previousReturns = previousReturns;
  }


  public AccountVerificationInsights accountNumberFormat(AccountVerificationInsightsAccountNumberFormat accountNumberFormat) {
    
    this.accountNumberFormat = accountNumberFormat;
    return this;
  }

   /**
   * Get accountNumberFormat
   * @return accountNumberFormat
  **/
  @ApiModelProperty(required = true, value = "")

  public AccountVerificationInsightsAccountNumberFormat getAccountNumberFormat() {
    return accountNumberFormat;
  }


  public void setAccountNumberFormat(AccountVerificationInsightsAccountNumberFormat accountNumberFormat) {
    this.accountNumberFormat = accountNumberFormat;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountVerificationInsights accountVerificationInsights = (AccountVerificationInsights) o;
    return Objects.equals(this.networkStatus, accountVerificationInsights.networkStatus) &&
        Objects.equals(this.previousReturns, accountVerificationInsights.previousReturns) &&
        Objects.equals(this.accountNumberFormat, accountVerificationInsights.accountNumberFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkStatus, previousReturns, accountNumberFormat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountVerificationInsights {\n");
    sb.append("    networkStatus: ").append(toIndentedString(networkStatus)).append("\n");
    sb.append("    previousReturns: ").append(toIndentedString(previousReturns)).append("\n");
    sb.append("    accountNumberFormat: ").append(toIndentedString(accountNumberFormat)).append("\n");
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

