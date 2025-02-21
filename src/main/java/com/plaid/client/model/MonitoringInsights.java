/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.620.0
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
import com.plaid.client.model.MonitoringIncomeInsights;
import com.plaid.client.model.MonitoringLoanInsights;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * An object representing the Monitoring Insights for the given Item
 */
@ApiModel(description = "An object representing the Monitoring Insights for the given Item")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-21T16:44:11.345889Z[Etc/UTC]")
public class MonitoringInsights {
  public static final String SERIALIZED_NAME_INCOME = "income";
  @SerializedName(SERIALIZED_NAME_INCOME)
  private MonitoringIncomeInsights income;

  public static final String SERIALIZED_NAME_LOANS = "loans";
  @SerializedName(SERIALIZED_NAME_LOANS)
  private MonitoringLoanInsights loans;


  public MonitoringInsights income(MonitoringIncomeInsights income) {
    
    this.income = income;
    return this;
  }

   /**
   * Get income
   * @return income
  **/
  @ApiModelProperty(required = true, value = "")

  public MonitoringIncomeInsights getIncome() {
    return income;
  }


  public void setIncome(MonitoringIncomeInsights income) {
    this.income = income;
  }


  public MonitoringInsights loans(MonitoringLoanInsights loans) {
    
    this.loans = loans;
    return this;
  }

   /**
   * Get loans
   * @return loans
  **/
  @ApiModelProperty(required = true, value = "")

  public MonitoringLoanInsights getLoans() {
    return loans;
  }


  public void setLoans(MonitoringLoanInsights loans) {
    this.loans = loans;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitoringInsights monitoringInsights = (MonitoringInsights) o;
    return Objects.equals(this.income, monitoringInsights.income) &&
        Objects.equals(this.loans, monitoringInsights.loans);
  }

  @Override
  public int hashCode() {
    return Objects.hash(income, loans);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitoringInsights {\n");
    sb.append("    income: ").append(toIndentedString(income)).append("\n");
    sb.append("    loans: ").append(toIndentedString(loans)).append("\n");
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

