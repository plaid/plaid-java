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
import com.plaid.client.model.CreditBankIncomeCategory;
import com.plaid.client.model.CreditBankIncomeHistoricalSummary;
import com.plaid.client.model.CreditBankIncomePayFrequency;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Detailed information for the income source.
 */
@ApiModel(description = "Detailed information for the income source.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-12T21:24:48.076128Z[Etc/UTC]")
public class CreditBankIncomeSource {
  public static final String SERIALIZED_NAME_INCOME_SOURCE_ID = "income_source_id";
  @SerializedName(SERIALIZED_NAME_INCOME_SOURCE_ID)
  private String incomeSourceId;

  public static final String SERIALIZED_NAME_INCOME_DESCRIPTION = "income_description";
  @SerializedName(SERIALIZED_NAME_INCOME_DESCRIPTION)
  private String incomeDescription;

  public static final String SERIALIZED_NAME_INCOME_CATEGORY = "income_category";
  @SerializedName(SERIALIZED_NAME_INCOME_CATEGORY)
  private CreditBankIncomeCategory incomeCategory;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private LocalDate startDate;

  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private LocalDate endDate;

  public static final String SERIALIZED_NAME_PAY_FREQUENCY = "pay_frequency";
  @SerializedName(SERIALIZED_NAME_PAY_FREQUENCY)
  private CreditBankIncomePayFrequency payFrequency;

  public static final String SERIALIZED_NAME_TOTAL_AMOUNT = "total_amount";
  @SerializedName(SERIALIZED_NAME_TOTAL_AMOUNT)
  private Double totalAmount;

  public static final String SERIALIZED_NAME_TRANSACTION_COUNT = "transaction_count";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_COUNT)
  private Integer transactionCount;

  public static final String SERIALIZED_NAME_HISTORICAL_SUMMARY = "historical_summary";
  @SerializedName(SERIALIZED_NAME_HISTORICAL_SUMMARY)
  private List<CreditBankIncomeHistoricalSummary> historicalSummary = null;


  public CreditBankIncomeSource incomeSourceId(String incomeSourceId) {
    
    this.incomeSourceId = incomeSourceId;
    return this;
  }

   /**
   * A unique identifier for an income source.
   * @return incomeSourceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A unique identifier for an income source.")

  public String getIncomeSourceId() {
    return incomeSourceId;
  }


  public void setIncomeSourceId(String incomeSourceId) {
    this.incomeSourceId = incomeSourceId;
  }


  public CreditBankIncomeSource incomeDescription(String incomeDescription) {
    
    this.incomeDescription = incomeDescription;
    return this;
  }

   /**
   * The most common name or original description for the underlying income transactions.
   * @return incomeDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The most common name or original description for the underlying income transactions.")

  public String getIncomeDescription() {
    return incomeDescription;
  }


  public void setIncomeDescription(String incomeDescription) {
    this.incomeDescription = incomeDescription;
  }


  public CreditBankIncomeSource incomeCategory(CreditBankIncomeCategory incomeCategory) {
    
    this.incomeCategory = incomeCategory;
    return this;
  }

   /**
   * Get incomeCategory
   * @return incomeCategory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CreditBankIncomeCategory getIncomeCategory() {
    return incomeCategory;
  }


  public void setIncomeCategory(CreditBankIncomeCategory incomeCategory) {
    this.incomeCategory = incomeCategory;
  }


  public CreditBankIncomeSource accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * Plaid&#39;s unique identifier for the account.
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Plaid's unique identifier for the account.")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public CreditBankIncomeSource startDate(LocalDate startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Minimum of all dates within the specific income sources in the user&#39;s bank account for days requested by the client. The date will be returned in an ISO 8601 format (YYYY-MM-DD).
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Minimum of all dates within the specific income sources in the user's bank account for days requested by the client. The date will be returned in an ISO 8601 format (YYYY-MM-DD).")

  public LocalDate getStartDate() {
    return startDate;
  }


  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }


  public CreditBankIncomeSource endDate(LocalDate endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * Maximum of all dates within the specific income sources in the user’s bank account for days requested by the client. The date will be returned in an ISO 8601 format (YYYY-MM-DD).
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Maximum of all dates within the specific income sources in the user’s bank account for days requested by the client. The date will be returned in an ISO 8601 format (YYYY-MM-DD).")

  public LocalDate getEndDate() {
    return endDate;
  }


  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }


  public CreditBankIncomeSource payFrequency(CreditBankIncomePayFrequency payFrequency) {
    
    this.payFrequency = payFrequency;
    return this;
  }

   /**
   * Get payFrequency
   * @return payFrequency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CreditBankIncomePayFrequency getPayFrequency() {
    return payFrequency;
  }


  public void setPayFrequency(CreditBankIncomePayFrequency payFrequency) {
    this.payFrequency = payFrequency;
  }


  public CreditBankIncomeSource totalAmount(Double totalAmount) {
    
    this.totalAmount = totalAmount;
    return this;
  }

   /**
   * Total amount of earnings in the user’s bank account for the specific income source for days requested by the client.
   * @return totalAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total amount of earnings in the user’s bank account for the specific income source for days requested by the client.")

  public Double getTotalAmount() {
    return totalAmount;
  }


  public void setTotalAmount(Double totalAmount) {
    this.totalAmount = totalAmount;
  }


  public CreditBankIncomeSource transactionCount(Integer transactionCount) {
    
    this.transactionCount = transactionCount;
    return this;
  }

   /**
   * Number of transactions for the income source within the start and end date.
   * @return transactionCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of transactions for the income source within the start and end date.")

  public Integer getTransactionCount() {
    return transactionCount;
  }


  public void setTransactionCount(Integer transactionCount) {
    this.transactionCount = transactionCount;
  }


  public CreditBankIncomeSource historicalSummary(List<CreditBankIncomeHistoricalSummary> historicalSummary) {
    
    this.historicalSummary = historicalSummary;
    return this;
  }

  public CreditBankIncomeSource addHistoricalSummaryItem(CreditBankIncomeHistoricalSummary historicalSummaryItem) {
    if (this.historicalSummary == null) {
      this.historicalSummary = new ArrayList<>();
    }
    this.historicalSummary.add(historicalSummaryItem);
    return this;
  }

   /**
   * Get historicalSummary
   * @return historicalSummary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<CreditBankIncomeHistoricalSummary> getHistoricalSummary() {
    return historicalSummary;
  }


  public void setHistoricalSummary(List<CreditBankIncomeHistoricalSummary> historicalSummary) {
    this.historicalSummary = historicalSummary;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditBankIncomeSource creditBankIncomeSource = (CreditBankIncomeSource) o;
    return Objects.equals(this.incomeSourceId, creditBankIncomeSource.incomeSourceId) &&
        Objects.equals(this.incomeDescription, creditBankIncomeSource.incomeDescription) &&
        Objects.equals(this.incomeCategory, creditBankIncomeSource.incomeCategory) &&
        Objects.equals(this.accountId, creditBankIncomeSource.accountId) &&
        Objects.equals(this.startDate, creditBankIncomeSource.startDate) &&
        Objects.equals(this.endDate, creditBankIncomeSource.endDate) &&
        Objects.equals(this.payFrequency, creditBankIncomeSource.payFrequency) &&
        Objects.equals(this.totalAmount, creditBankIncomeSource.totalAmount) &&
        Objects.equals(this.transactionCount, creditBankIncomeSource.transactionCount) &&
        Objects.equals(this.historicalSummary, creditBankIncomeSource.historicalSummary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(incomeSourceId, incomeDescription, incomeCategory, accountId, startDate, endDate, payFrequency, totalAmount, transactionCount, historicalSummary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditBankIncomeSource {\n");
    sb.append("    incomeSourceId: ").append(toIndentedString(incomeSourceId)).append("\n");
    sb.append("    incomeDescription: ").append(toIndentedString(incomeDescription)).append("\n");
    sb.append("    incomeCategory: ").append(toIndentedString(incomeCategory)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    payFrequency: ").append(toIndentedString(payFrequency)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    transactionCount: ").append(toIndentedString(transactionCount)).append("\n");
    sb.append("    historicalSummary: ").append(toIndentedString(historicalSummary)).append("\n");
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

