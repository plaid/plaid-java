/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.610.1
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
 * Details regarding authorization usage.
 */
@ApiModel(description = "Details regarding authorization usage.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-23T18:11:57.813484Z[Etc/UTC]")
public class TransferMetricsGetAuthorizationUsage {
  public static final String SERIALIZED_NAME_DAILY_CREDIT_UTILIZATION = "daily_credit_utilization";
  @SerializedName(SERIALIZED_NAME_DAILY_CREDIT_UTILIZATION)
  private String dailyCreditUtilization;

  public static final String SERIALIZED_NAME_DAILY_DEBIT_UTILIZATION = "daily_debit_utilization";
  @SerializedName(SERIALIZED_NAME_DAILY_DEBIT_UTILIZATION)
  private String dailyDebitUtilization;

  public static final String SERIALIZED_NAME_MONTHLY_CREDIT_UTILIZATION = "monthly_credit_utilization";
  @SerializedName(SERIALIZED_NAME_MONTHLY_CREDIT_UTILIZATION)
  private String monthlyCreditUtilization;

  public static final String SERIALIZED_NAME_MONTHLY_DEBIT_UTILIZATION = "monthly_debit_utilization";
  @SerializedName(SERIALIZED_NAME_MONTHLY_DEBIT_UTILIZATION)
  private String monthlyDebitUtilization;


  public TransferMetricsGetAuthorizationUsage dailyCreditUtilization(String dailyCreditUtilization) {
    
    this.dailyCreditUtilization = dailyCreditUtilization;
    return this;
  }

   /**
   * The daily credit utilization formatted as a decimal.
   * @return dailyCreditUtilization
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The daily credit utilization formatted as a decimal.")

  public String getDailyCreditUtilization() {
    return dailyCreditUtilization;
  }


  public void setDailyCreditUtilization(String dailyCreditUtilization) {
    this.dailyCreditUtilization = dailyCreditUtilization;
  }


  public TransferMetricsGetAuthorizationUsage dailyDebitUtilization(String dailyDebitUtilization) {
    
    this.dailyDebitUtilization = dailyDebitUtilization;
    return this;
  }

   /**
   * The daily debit utilization formatted as a decimal.
   * @return dailyDebitUtilization
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The daily debit utilization formatted as a decimal.")

  public String getDailyDebitUtilization() {
    return dailyDebitUtilization;
  }


  public void setDailyDebitUtilization(String dailyDebitUtilization) {
    this.dailyDebitUtilization = dailyDebitUtilization;
  }


  public TransferMetricsGetAuthorizationUsage monthlyCreditUtilization(String monthlyCreditUtilization) {
    
    this.monthlyCreditUtilization = monthlyCreditUtilization;
    return this;
  }

   /**
   * The monthly credit utilization formatted as a decimal.
   * @return monthlyCreditUtilization
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The monthly credit utilization formatted as a decimal.")

  public String getMonthlyCreditUtilization() {
    return monthlyCreditUtilization;
  }


  public void setMonthlyCreditUtilization(String monthlyCreditUtilization) {
    this.monthlyCreditUtilization = monthlyCreditUtilization;
  }


  public TransferMetricsGetAuthorizationUsage monthlyDebitUtilization(String monthlyDebitUtilization) {
    
    this.monthlyDebitUtilization = monthlyDebitUtilization;
    return this;
  }

   /**
   * The monthly debit utilization formatted as a decimal.
   * @return monthlyDebitUtilization
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The monthly debit utilization formatted as a decimal.")

  public String getMonthlyDebitUtilization() {
    return monthlyDebitUtilization;
  }


  public void setMonthlyDebitUtilization(String monthlyDebitUtilization) {
    this.monthlyDebitUtilization = monthlyDebitUtilization;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferMetricsGetAuthorizationUsage transferMetricsGetAuthorizationUsage = (TransferMetricsGetAuthorizationUsage) o;
    return Objects.equals(this.dailyCreditUtilization, transferMetricsGetAuthorizationUsage.dailyCreditUtilization) &&
        Objects.equals(this.dailyDebitUtilization, transferMetricsGetAuthorizationUsage.dailyDebitUtilization) &&
        Objects.equals(this.monthlyCreditUtilization, transferMetricsGetAuthorizationUsage.monthlyCreditUtilization) &&
        Objects.equals(this.monthlyDebitUtilization, transferMetricsGetAuthorizationUsage.monthlyDebitUtilization);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dailyCreditUtilization, dailyDebitUtilization, monthlyCreditUtilization, monthlyDebitUtilization);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferMetricsGetAuthorizationUsage {\n");
    sb.append("    dailyCreditUtilization: ").append(toIndentedString(dailyCreditUtilization)).append("\n");
    sb.append("    dailyDebitUtilization: ").append(toIndentedString(dailyDebitUtilization)).append("\n");
    sb.append("    monthlyCreditUtilization: ").append(toIndentedString(monthlyCreditUtilization)).append("\n");
    sb.append("    monthlyDebitUtilization: ").append(toIndentedString(monthlyDebitUtilization)).append("\n");
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

