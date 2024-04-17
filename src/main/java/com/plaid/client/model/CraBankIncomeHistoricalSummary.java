/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.508.0
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
import com.plaid.client.model.CraBankIncomeTransaction;
import com.plaid.client.model.CreditAmountWithCurrency;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * The end user&#39;s monthly summary for the income source(s).
 */
@ApiModel(description = "The end user's monthly summary for the income source(s).")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-17T20:52:19.180696Z[Etc/UTC]")
public class CraBankIncomeHistoricalSummary {
  public static final String SERIALIZED_NAME_TOTAL_AMOUNTS = "total_amounts";
  @SerializedName(SERIALIZED_NAME_TOTAL_AMOUNTS)
  private List<CreditAmountWithCurrency> totalAmounts = null;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private LocalDate startDate;

  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private LocalDate endDate;

  public static final String SERIALIZED_NAME_TRANSACTIONS = "transactions";
  @SerializedName(SERIALIZED_NAME_TRANSACTIONS)
  private List<CraBankIncomeTransaction> transactions = null;


  public CraBankIncomeHistoricalSummary totalAmounts(List<CreditAmountWithCurrency> totalAmounts) {
    
    this.totalAmounts = totalAmounts;
    return this;
  }

  public CraBankIncomeHistoricalSummary addTotalAmountsItem(CreditAmountWithCurrency totalAmountsItem) {
    if (this.totalAmounts == null) {
      this.totalAmounts = new ArrayList<>();
    }
    this.totalAmounts.add(totalAmountsItem);
    return this;
  }

   /**
   * Total amount of earnings for the income source(s) of the user for the month in the summary. This can contain multiple amounts, with each amount denominated in one unique currency.
   * @return totalAmounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total amount of earnings for the income source(s) of the user for the month in the summary. This can contain multiple amounts, with each amount denominated in one unique currency.")

  public List<CreditAmountWithCurrency> getTotalAmounts() {
    return totalAmounts;
  }


  public void setTotalAmounts(List<CreditAmountWithCurrency> totalAmounts) {
    this.totalAmounts = totalAmounts;
  }


  public CraBankIncomeHistoricalSummary startDate(LocalDate startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * The start date of the period covered in this monthly summary. This date will be the first day of the month, unless the month being covered is a partial month because it is the first month included in the summary and the date range being requested does not begin with the first day of the month. The date will be returned in an ISO 8601 format (YYYY-MM-DD).
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The start date of the period covered in this monthly summary. This date will be the first day of the month, unless the month being covered is a partial month because it is the first month included in the summary and the date range being requested does not begin with the first day of the month. The date will be returned in an ISO 8601 format (YYYY-MM-DD).")

  public LocalDate getStartDate() {
    return startDate;
  }


  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }


  public CraBankIncomeHistoricalSummary endDate(LocalDate endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * The end date of the period included in this monthly summary. This date will be the last day of the month, unless the month being covered is a partial month because it is the last month included in the summary and the date range being requested does not end with the last day of the month. The date will be returned in an ISO 8601 format (YYYY-MM-DD).
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The end date of the period included in this monthly summary. This date will be the last day of the month, unless the month being covered is a partial month because it is the last month included in the summary and the date range being requested does not end with the last day of the month. The date will be returned in an ISO 8601 format (YYYY-MM-DD).")

  public LocalDate getEndDate() {
    return endDate;
  }


  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }


  public CraBankIncomeHistoricalSummary transactions(List<CraBankIncomeTransaction> transactions) {
    
    this.transactions = transactions;
    return this;
  }

  public CraBankIncomeHistoricalSummary addTransactionsItem(CraBankIncomeTransaction transactionsItem) {
    if (this.transactions == null) {
      this.transactions = new ArrayList<>();
    }
    this.transactions.add(transactionsItem);
    return this;
  }

   /**
   * Get transactions
   * @return transactions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<CraBankIncomeTransaction> getTransactions() {
    return transactions;
  }


  public void setTransactions(List<CraBankIncomeTransaction> transactions) {
    this.transactions = transactions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CraBankIncomeHistoricalSummary craBankIncomeHistoricalSummary = (CraBankIncomeHistoricalSummary) o;
    return Objects.equals(this.totalAmounts, craBankIncomeHistoricalSummary.totalAmounts) &&
        Objects.equals(this.startDate, craBankIncomeHistoricalSummary.startDate) &&
        Objects.equals(this.endDate, craBankIncomeHistoricalSummary.endDate) &&
        Objects.equals(this.transactions, craBankIncomeHistoricalSummary.transactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalAmounts, startDate, endDate, transactions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CraBankIncomeHistoricalSummary {\n");
    sb.append("    totalAmounts: ").append(toIndentedString(totalAmounts)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
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

