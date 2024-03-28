/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.503.5
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
import com.plaid.client.model.PayrollIncomeRateOfPay;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * An object containing account level data.
 */
@ApiModel(description = "An object containing account level data.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-28T19:43:00.996446Z[Etc/UTC]")
public class PayrollIncomeAccountData {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_RATE_OF_PAY = "rate_of_pay";
  @SerializedName(SERIALIZED_NAME_RATE_OF_PAY)
  private PayrollIncomeRateOfPay rateOfPay;

  public static final String SERIALIZED_NAME_PAY_FREQUENCY = "pay_frequency";
  @SerializedName(SERIALIZED_NAME_PAY_FREQUENCY)
  private String payFrequency;


  public PayrollIncomeAccountData accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * ID of the payroll provider account.
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "ID of the payroll provider account.")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public PayrollIncomeAccountData rateOfPay(PayrollIncomeRateOfPay rateOfPay) {
    
    this.rateOfPay = rateOfPay;
    return this;
  }

   /**
   * Get rateOfPay
   * @return rateOfPay
  **/
  @ApiModelProperty(required = true, value = "")

  public PayrollIncomeRateOfPay getRateOfPay() {
    return rateOfPay;
  }


  public void setRateOfPay(PayrollIncomeRateOfPay rateOfPay) {
    this.rateOfPay = rateOfPay;
  }


  public PayrollIncomeAccountData payFrequency(String payFrequency) {
    
    this.payFrequency = payFrequency;
    return this;
  }

   /**
   * The frequency at which an individual is paid.
   * @return payFrequency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The frequency at which an individual is paid.")

  public String getPayFrequency() {
    return payFrequency;
  }


  public void setPayFrequency(String payFrequency) {
    this.payFrequency = payFrequency;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayrollIncomeAccountData payrollIncomeAccountData = (PayrollIncomeAccountData) o;
    return Objects.equals(this.accountId, payrollIncomeAccountData.accountId) &&
        Objects.equals(this.rateOfPay, payrollIncomeAccountData.rateOfPay) &&
        Objects.equals(this.payFrequency, payrollIncomeAccountData.payFrequency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, rateOfPay, payFrequency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayrollIncomeAccountData {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    rateOfPay: ").append(toIndentedString(rateOfPay)).append("\n");
    sb.append("    payFrequency: ").append(toIndentedString(payFrequency)).append("\n");
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

