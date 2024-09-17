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
import com.plaid.client.model.CreditAmountWithCurrency;
import com.plaid.client.model.CreditBankIncomeHistoricalSummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Summary for bank income across all income sources and items (max history of 730 days).
 */
@ApiModel(description = "Summary for bank income across all income sources and items (max history of 730 days).")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-17T16:42:02.150702Z[Etc/UTC]")
public class CreditBankIncomeSummary {
  public static final String SERIALIZED_NAME_TOTAL_AMOUNT = "total_amount";
  @SerializedName(SERIALIZED_NAME_TOTAL_AMOUNT)
  private Double totalAmount;

  public static final String SERIALIZED_NAME_ISO_CURRENCY_CODE = "iso_currency_code";
  @SerializedName(SERIALIZED_NAME_ISO_CURRENCY_CODE)
  private String isoCurrencyCode;

  public static final String SERIALIZED_NAME_UNOFFICIAL_CURRENCY_CODE = "unofficial_currency_code";
  @SerializedName(SERIALIZED_NAME_UNOFFICIAL_CURRENCY_CODE)
  private String unofficialCurrencyCode;

  public static final String SERIALIZED_NAME_TOTAL_AMOUNTS = "total_amounts";
  @SerializedName(SERIALIZED_NAME_TOTAL_AMOUNTS)
  private List<CreditAmountWithCurrency> totalAmounts = null;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private LocalDate startDate;

  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private LocalDate endDate;

  public static final String SERIALIZED_NAME_INCOME_SOURCES_COUNT = "income_sources_count";
  @SerializedName(SERIALIZED_NAME_INCOME_SOURCES_COUNT)
  private Integer incomeSourcesCount;

  public static final String SERIALIZED_NAME_INCOME_CATEGORIES_COUNT = "income_categories_count";
  @SerializedName(SERIALIZED_NAME_INCOME_CATEGORIES_COUNT)
  private Integer incomeCategoriesCount;

  public static final String SERIALIZED_NAME_INCOME_TRANSACTIONS_COUNT = "income_transactions_count";
  @SerializedName(SERIALIZED_NAME_INCOME_TRANSACTIONS_COUNT)
  private Integer incomeTransactionsCount;

  public static final String SERIALIZED_NAME_HISTORICAL_SUMMARY = "historical_summary";
  @SerializedName(SERIALIZED_NAME_HISTORICAL_SUMMARY)
  private List<CreditBankIncomeHistoricalSummary> historicalSummary = null;


  public CreditBankIncomeSummary totalAmount(Double totalAmount) {
    
    this.totalAmount = totalAmount;
    return this;
  }

   /**
   * Total amount of earnings across all the income sources in the end user&#39;s Items for the days requested by the client. This may return an incorrect value if the summary includes income sources in multiple currencies. Please use [&#x60;total_amounts&#x60;](https://plaid.com/docs/api/products/income/#credit-bank_income-get-response-bank-income-bank-income-summary-total-amounts) instead.
   * @return totalAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total amount of earnings across all the income sources in the end user's Items for the days requested by the client. This may return an incorrect value if the summary includes income sources in multiple currencies. Please use [`total_amounts`](https://plaid.com/docs/api/products/income/#credit-bank_income-get-response-bank-income-bank-income-summary-total-amounts) instead.")

  public Double getTotalAmount() {
    return totalAmount;
  }


  public void setTotalAmount(Double totalAmount) {
    this.totalAmount = totalAmount;
  }


  public CreditBankIncomeSummary isoCurrencyCode(String isoCurrencyCode) {
    
    this.isoCurrencyCode = isoCurrencyCode;
    return this;
  }

   /**
   * The ISO 4217 currency code of the amount or balance. Please use [&#x60;total_amounts&#x60;](https://plaid.com/docs/api/products/income/#credit-bank_income-get-response-bank-income-bank-income-summary-total-amounts) instead.
   * @return isoCurrencyCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ISO 4217 currency code of the amount or balance. Please use [`total_amounts`](https://plaid.com/docs/api/products/income/#credit-bank_income-get-response-bank-income-bank-income-summary-total-amounts) instead.")

  public String getIsoCurrencyCode() {
    return isoCurrencyCode;
  }


  public void setIsoCurrencyCode(String isoCurrencyCode) {
    this.isoCurrencyCode = isoCurrencyCode;
  }


  public CreditBankIncomeSummary unofficialCurrencyCode(String unofficialCurrencyCode) {
    
    this.unofficialCurrencyCode = unofficialCurrencyCode;
    return this;
  }

   /**
   * The unofficial currency code associated with the amount or balance. Always &#x60;null&#x60; if &#x60;iso_currency_code&#x60; is non-null. Unofficial currency codes are used for currencies that do not have official ISO currency codes, such as cryptocurrencies and the currencies of certain countries. Please use [&#x60;total_amounts&#x60;](https://plaid.com/docs/api/products/income/#credit-bank_income-get-response-bank-income-bank-income-summary-total-amounts) instead.
   * @return unofficialCurrencyCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unofficial currency code associated with the amount or balance. Always `null` if `iso_currency_code` is non-null. Unofficial currency codes are used for currencies that do not have official ISO currency codes, such as cryptocurrencies and the currencies of certain countries. Please use [`total_amounts`](https://plaid.com/docs/api/products/income/#credit-bank_income-get-response-bank-income-bank-income-summary-total-amounts) instead.")

  public String getUnofficialCurrencyCode() {
    return unofficialCurrencyCode;
  }


  public void setUnofficialCurrencyCode(String unofficialCurrencyCode) {
    this.unofficialCurrencyCode = unofficialCurrencyCode;
  }


  public CreditBankIncomeSummary totalAmounts(List<CreditAmountWithCurrency> totalAmounts) {
    
    this.totalAmounts = totalAmounts;
    return this;
  }

  public CreditBankIncomeSummary addTotalAmountsItem(CreditAmountWithCurrency totalAmountsItem) {
    if (this.totalAmounts == null) {
      this.totalAmounts = new ArrayList<>();
    }
    this.totalAmounts.add(totalAmountsItem);
    return this;
  }

   /**
   * Total amount of earnings across all the income sources in the end user&#39;s Items for the days requested by the client. This can contain multiple amounts, with each amount denominated in one unique currency.
   * @return totalAmounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total amount of earnings across all the income sources in the end user's Items for the days requested by the client. This can contain multiple amounts, with each amount denominated in one unique currency.")

  public List<CreditAmountWithCurrency> getTotalAmounts() {
    return totalAmounts;
  }


  public void setTotalAmounts(List<CreditAmountWithCurrency> totalAmounts) {
    this.totalAmounts = totalAmounts;
  }


  public CreditBankIncomeSummary startDate(LocalDate startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * The earliest date within the days requested in which all income sources identified by Plaid appear in a user&#39;s account. The date will be returned in an ISO 8601 format (YYYY-MM-DD).
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The earliest date within the days requested in which all income sources identified by Plaid appear in a user's account. The date will be returned in an ISO 8601 format (YYYY-MM-DD).")

  public LocalDate getStartDate() {
    return startDate;
  }


  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }


  public CreditBankIncomeSummary endDate(LocalDate endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * The latest date in which all income sources identified by Plaid appear in the user&#39;s account. The date will be returned in an ISO 8601 format (YYYY-MM-DD).
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The latest date in which all income sources identified by Plaid appear in the user's account. The date will be returned in an ISO 8601 format (YYYY-MM-DD).")

  public LocalDate getEndDate() {
    return endDate;
  }


  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }


  public CreditBankIncomeSummary incomeSourcesCount(Integer incomeSourcesCount) {
    
    this.incomeSourcesCount = incomeSourcesCount;
    return this;
  }

   /**
   * Number of income sources per end user.
   * @return incomeSourcesCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of income sources per end user.")

  public Integer getIncomeSourcesCount() {
    return incomeSourcesCount;
  }


  public void setIncomeSourcesCount(Integer incomeSourcesCount) {
    this.incomeSourcesCount = incomeSourcesCount;
  }


  public CreditBankIncomeSummary incomeCategoriesCount(Integer incomeCategoriesCount) {
    
    this.incomeCategoriesCount = incomeCategoriesCount;
    return this;
  }

   /**
   * Number of income categories per end user.
   * @return incomeCategoriesCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of income categories per end user.")

  public Integer getIncomeCategoriesCount() {
    return incomeCategoriesCount;
  }


  public void setIncomeCategoriesCount(Integer incomeCategoriesCount) {
    this.incomeCategoriesCount = incomeCategoriesCount;
  }


  public CreditBankIncomeSummary incomeTransactionsCount(Integer incomeTransactionsCount) {
    
    this.incomeTransactionsCount = incomeTransactionsCount;
    return this;
  }

   /**
   * Number of income transactions per end user.
   * @return incomeTransactionsCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of income transactions per end user.")

  public Integer getIncomeTransactionsCount() {
    return incomeTransactionsCount;
  }


  public void setIncomeTransactionsCount(Integer incomeTransactionsCount) {
    this.incomeTransactionsCount = incomeTransactionsCount;
  }


  public CreditBankIncomeSummary historicalSummary(List<CreditBankIncomeHistoricalSummary> historicalSummary) {
    
    this.historicalSummary = historicalSummary;
    return this;
  }

  public CreditBankIncomeSummary addHistoricalSummaryItem(CreditBankIncomeHistoricalSummary historicalSummaryItem) {
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
    CreditBankIncomeSummary creditBankIncomeSummary = (CreditBankIncomeSummary) o;
    return Objects.equals(this.totalAmount, creditBankIncomeSummary.totalAmount) &&
        Objects.equals(this.isoCurrencyCode, creditBankIncomeSummary.isoCurrencyCode) &&
        Objects.equals(this.unofficialCurrencyCode, creditBankIncomeSummary.unofficialCurrencyCode) &&
        Objects.equals(this.totalAmounts, creditBankIncomeSummary.totalAmounts) &&
        Objects.equals(this.startDate, creditBankIncomeSummary.startDate) &&
        Objects.equals(this.endDate, creditBankIncomeSummary.endDate) &&
        Objects.equals(this.incomeSourcesCount, creditBankIncomeSummary.incomeSourcesCount) &&
        Objects.equals(this.incomeCategoriesCount, creditBankIncomeSummary.incomeCategoriesCount) &&
        Objects.equals(this.incomeTransactionsCount, creditBankIncomeSummary.incomeTransactionsCount) &&
        Objects.equals(this.historicalSummary, creditBankIncomeSummary.historicalSummary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalAmount, isoCurrencyCode, unofficialCurrencyCode, totalAmounts, startDate, endDate, incomeSourcesCount, incomeCategoriesCount, incomeTransactionsCount, historicalSummary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditBankIncomeSummary {\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    isoCurrencyCode: ").append(toIndentedString(isoCurrencyCode)).append("\n");
    sb.append("    unofficialCurrencyCode: ").append(toIndentedString(unofficialCurrencyCode)).append("\n");
    sb.append("    totalAmounts: ").append(toIndentedString(totalAmounts)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    incomeSourcesCount: ").append(toIndentedString(incomeSourcesCount)).append("\n");
    sb.append("    incomeCategoriesCount: ").append(toIndentedString(incomeCategoriesCount)).append("\n");
    sb.append("    incomeTransactionsCount: ").append(toIndentedString(incomeTransactionsCount)).append("\n");
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

