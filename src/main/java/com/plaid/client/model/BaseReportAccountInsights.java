/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.586.4
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
import com.plaid.client.model.BaseReportAverageFlowInsights;
import com.plaid.client.model.BaseReportLongestGapInsights;
import com.plaid.client.model.BaseReportNumberFlowInsights;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Calculated insights derived from transaction-level data.
 */
@ApiModel(description = "Calculated insights derived from transaction-level data.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-14T16:41:31.650700Z[Etc/UTC]")
public class BaseReportAccountInsights {
  public static final String SERIALIZED_NAME_OLDEST_TRANSACTION_DATE = "oldest_transaction_date";
  @SerializedName(SERIALIZED_NAME_OLDEST_TRANSACTION_DATE)
  private LocalDate oldestTransactionDate;

  public static final String SERIALIZED_NAME_MOST_RECENT_TRANSACTION_DATE = "most_recent_transaction_date";
  @SerializedName(SERIALIZED_NAME_MOST_RECENT_TRANSACTION_DATE)
  private LocalDate mostRecentTransactionDate;

  public static final String SERIALIZED_NAME_DAYS_AVAILABLE = "days_available";
  @SerializedName(SERIALIZED_NAME_DAYS_AVAILABLE)
  private Integer daysAvailable;

  public static final String SERIALIZED_NAME_AVERAGE_DAYS_BETWEEN_TRANSACTIONS = "average_days_between_transactions";
  @SerializedName(SERIALIZED_NAME_AVERAGE_DAYS_BETWEEN_TRANSACTIONS)
  private Double averageDaysBetweenTransactions;

  public static final String SERIALIZED_NAME_LONGEST_GAP_BETWEEN_TRANSACTIONS = "longest_gap_between_transactions";
  @SerializedName(SERIALIZED_NAME_LONGEST_GAP_BETWEEN_TRANSACTIONS)
  private List<BaseReportLongestGapInsights> longestGapBetweenTransactions = null;

  public static final String SERIALIZED_NAME_LONGEST_GAPS_BETWEEN_TRANSACTIONS = "longest_gaps_between_transactions";
  @SerializedName(SERIALIZED_NAME_LONGEST_GAPS_BETWEEN_TRANSACTIONS)
  private List<BaseReportLongestGapInsights> longestGapsBetweenTransactions = null;

  public static final String SERIALIZED_NAME_NUMBER_OF_INFLOWS = "number_of_inflows";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_INFLOWS)
  private List<BaseReportNumberFlowInsights> numberOfInflows = null;

  public static final String SERIALIZED_NAME_AVERAGE_INFLOW_AMOUNT = "average_inflow_amount";
  @SerializedName(SERIALIZED_NAME_AVERAGE_INFLOW_AMOUNT)
  private List<BaseReportAverageFlowInsights> averageInflowAmount = null;

  public static final String SERIALIZED_NAME_AVERAGE_INFLOW_AMOUNTS = "average_inflow_amounts";
  @SerializedName(SERIALIZED_NAME_AVERAGE_INFLOW_AMOUNTS)
  private List<BaseReportAverageFlowInsights> averageInflowAmounts = null;

  public static final String SERIALIZED_NAME_NUMBER_OF_OUTFLOWS = "number_of_outflows";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_OUTFLOWS)
  private List<BaseReportNumberFlowInsights> numberOfOutflows = null;

  public static final String SERIALIZED_NAME_AVERAGE_OUTFLOW_AMOUNT = "average_outflow_amount";
  @SerializedName(SERIALIZED_NAME_AVERAGE_OUTFLOW_AMOUNT)
  private List<BaseReportAverageFlowInsights> averageOutflowAmount = null;

  public static final String SERIALIZED_NAME_AVERAGE_OUTFLOW_AMOUNTS = "average_outflow_amounts";
  @SerializedName(SERIALIZED_NAME_AVERAGE_OUTFLOW_AMOUNTS)
  private List<BaseReportAverageFlowInsights> averageOutflowAmounts = null;

  public static final String SERIALIZED_NAME_NUMBER_OF_DAYS_NO_TRANSACTIONS = "number_of_days_no_transactions";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_DAYS_NO_TRANSACTIONS)
  private Integer numberOfDaysNoTransactions;


  public BaseReportAccountInsights oldestTransactionDate(LocalDate oldestTransactionDate) {
    
    this.oldestTransactionDate = oldestTransactionDate;
    return this;
  }

   /**
   * Date of the earliest transaction in the base report for the account.
   * @return oldestTransactionDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date of the earliest transaction in the base report for the account.")

  public LocalDate getOldestTransactionDate() {
    return oldestTransactionDate;
  }


  public void setOldestTransactionDate(LocalDate oldestTransactionDate) {
    this.oldestTransactionDate = oldestTransactionDate;
  }


  public BaseReportAccountInsights mostRecentTransactionDate(LocalDate mostRecentTransactionDate) {
    
    this.mostRecentTransactionDate = mostRecentTransactionDate;
    return this;
  }

   /**
   * Date of the most recent transaction in the base report for the account.
   * @return mostRecentTransactionDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date of the most recent transaction in the base report for the account.")

  public LocalDate getMostRecentTransactionDate() {
    return mostRecentTransactionDate;
  }


  public void setMostRecentTransactionDate(LocalDate mostRecentTransactionDate) {
    this.mostRecentTransactionDate = mostRecentTransactionDate;
  }


  public BaseReportAccountInsights daysAvailable(Integer daysAvailable) {
    
    this.daysAvailable = daysAvailable;
    return this;
  }

   /**
   * Number of days days available in the base report for the account.
   * @return daysAvailable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of days days available in the base report for the account.")

  public Integer getDaysAvailable() {
    return daysAvailable;
  }


  public void setDaysAvailable(Integer daysAvailable) {
    this.daysAvailable = daysAvailable;
  }


  public BaseReportAccountInsights averageDaysBetweenTransactions(Double averageDaysBetweenTransactions) {
    
    this.averageDaysBetweenTransactions = averageDaysBetweenTransactions;
    return this;
  }

   /**
   * Average number of days between sequential transactions
   * @return averageDaysBetweenTransactions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Average number of days between sequential transactions")

  public Double getAverageDaysBetweenTransactions() {
    return averageDaysBetweenTransactions;
  }


  public void setAverageDaysBetweenTransactions(Double averageDaysBetweenTransactions) {
    this.averageDaysBetweenTransactions = averageDaysBetweenTransactions;
  }


  public BaseReportAccountInsights longestGapBetweenTransactions(List<BaseReportLongestGapInsights> longestGapBetweenTransactions) {
    
    this.longestGapBetweenTransactions = longestGapBetweenTransactions;
    return this;
  }

  public BaseReportAccountInsights addLongestGapBetweenTransactionsItem(BaseReportLongestGapInsights longestGapBetweenTransactionsItem) {
    if (this.longestGapBetweenTransactions == null) {
      this.longestGapBetweenTransactions = new ArrayList<>();
    }
    this.longestGapBetweenTransactions.add(longestGapBetweenTransactionsItem);
    return this;
  }

   /**
   * Deprecated; use &#x60;longest_gaps_between_transactions&#x60; instead. Longest gap between sequential transactions
   * @return longestGapBetweenTransactions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Deprecated; use `longest_gaps_between_transactions` instead. Longest gap between sequential transactions")

  public List<BaseReportLongestGapInsights> getLongestGapBetweenTransactions() {
    return longestGapBetweenTransactions;
  }


  public void setLongestGapBetweenTransactions(List<BaseReportLongestGapInsights> longestGapBetweenTransactions) {
    this.longestGapBetweenTransactions = longestGapBetweenTransactions;
  }


  public BaseReportAccountInsights longestGapsBetweenTransactions(List<BaseReportLongestGapInsights> longestGapsBetweenTransactions) {
    
    this.longestGapsBetweenTransactions = longestGapsBetweenTransactions;
    return this;
  }

  public BaseReportAccountInsights addLongestGapsBetweenTransactionsItem(BaseReportLongestGapInsights longestGapsBetweenTransactionsItem) {
    if (this.longestGapsBetweenTransactions == null) {
      this.longestGapsBetweenTransactions = new ArrayList<>();
    }
    this.longestGapsBetweenTransactions.add(longestGapsBetweenTransactionsItem);
    return this;
  }

   /**
   * Customers must transition from &#x60;longest_gap_between_transactions&#x60; by January 31st 2025. Longest gap between sequential transactions in a time period. This array can include multiple time periods.
   * @return longestGapsBetweenTransactions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Customers must transition from `longest_gap_between_transactions` by January 31st 2025. Longest gap between sequential transactions in a time period. This array can include multiple time periods.")

  public List<BaseReportLongestGapInsights> getLongestGapsBetweenTransactions() {
    return longestGapsBetweenTransactions;
  }


  public void setLongestGapsBetweenTransactions(List<BaseReportLongestGapInsights> longestGapsBetweenTransactions) {
    this.longestGapsBetweenTransactions = longestGapsBetweenTransactions;
  }


  public BaseReportAccountInsights numberOfInflows(List<BaseReportNumberFlowInsights> numberOfInflows) {
    
    this.numberOfInflows = numberOfInflows;
    return this;
  }

  public BaseReportAccountInsights addNumberOfInflowsItem(BaseReportNumberFlowInsights numberOfInflowsItem) {
    if (this.numberOfInflows == null) {
      this.numberOfInflows = new ArrayList<>();
    }
    this.numberOfInflows.add(numberOfInflowsItem);
    return this;
  }

   /**
   * The number of debits into the account. This array will be empty for non-depository accounts.
   * @return numberOfInflows
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of debits into the account. This array will be empty for non-depository accounts.")

  public List<BaseReportNumberFlowInsights> getNumberOfInflows() {
    return numberOfInflows;
  }


  public void setNumberOfInflows(List<BaseReportNumberFlowInsights> numberOfInflows) {
    this.numberOfInflows = numberOfInflows;
  }


  public BaseReportAccountInsights averageInflowAmount(List<BaseReportAverageFlowInsights> averageInflowAmount) {
    
    this.averageInflowAmount = averageInflowAmount;
    return this;
  }

  public BaseReportAccountInsights addAverageInflowAmountItem(BaseReportAverageFlowInsights averageInflowAmountItem) {
    if (this.averageInflowAmount == null) {
      this.averageInflowAmount = new ArrayList<>();
    }
    this.averageInflowAmount.add(averageInflowAmountItem);
    return this;
  }

   /**
   * Deprecated; use &#x60;average_inflow_amounts&#x60; instead. Average amount of debit transactions into the account. This array will be empty for non-depository accounts. This field only takes into account USD transactions from the account.
   * @return averageInflowAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Deprecated; use `average_inflow_amounts` instead. Average amount of debit transactions into the account. This array will be empty for non-depository accounts. This field only takes into account USD transactions from the account.")

  public List<BaseReportAverageFlowInsights> getAverageInflowAmount() {
    return averageInflowAmount;
  }


  public void setAverageInflowAmount(List<BaseReportAverageFlowInsights> averageInflowAmount) {
    this.averageInflowAmount = averageInflowAmount;
  }


  public BaseReportAccountInsights averageInflowAmounts(List<BaseReportAverageFlowInsights> averageInflowAmounts) {
    
    this.averageInflowAmounts = averageInflowAmounts;
    return this;
  }

  public BaseReportAccountInsights addAverageInflowAmountsItem(BaseReportAverageFlowInsights averageInflowAmountsItem) {
    if (this.averageInflowAmounts == null) {
      this.averageInflowAmounts = new ArrayList<>();
    }
    this.averageInflowAmounts.add(averageInflowAmountsItem);
    return this;
  }

   /**
   * Customers must transition from &#x60;average_inflow_amount&#x60; by January 31st 2025. Average amount of debit transactions into the account in a time period. This array will be empty for non-depository accounts. This field only takes into account USD transactions from the account.
   * @return averageInflowAmounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Customers must transition from `average_inflow_amount` by January 31st 2025. Average amount of debit transactions into the account in a time period. This array will be empty for non-depository accounts. This field only takes into account USD transactions from the account.")

  public List<BaseReportAverageFlowInsights> getAverageInflowAmounts() {
    return averageInflowAmounts;
  }


  public void setAverageInflowAmounts(List<BaseReportAverageFlowInsights> averageInflowAmounts) {
    this.averageInflowAmounts = averageInflowAmounts;
  }


  public BaseReportAccountInsights numberOfOutflows(List<BaseReportNumberFlowInsights> numberOfOutflows) {
    
    this.numberOfOutflows = numberOfOutflows;
    return this;
  }

  public BaseReportAccountInsights addNumberOfOutflowsItem(BaseReportNumberFlowInsights numberOfOutflowsItem) {
    if (this.numberOfOutflows == null) {
      this.numberOfOutflows = new ArrayList<>();
    }
    this.numberOfOutflows.add(numberOfOutflowsItem);
    return this;
  }

   /**
   * The number of outflows from the account. This array will be empty for non-depository accounts.
   * @return numberOfOutflows
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of outflows from the account. This array will be empty for non-depository accounts.")

  public List<BaseReportNumberFlowInsights> getNumberOfOutflows() {
    return numberOfOutflows;
  }


  public void setNumberOfOutflows(List<BaseReportNumberFlowInsights> numberOfOutflows) {
    this.numberOfOutflows = numberOfOutflows;
  }


  public BaseReportAccountInsights averageOutflowAmount(List<BaseReportAverageFlowInsights> averageOutflowAmount) {
    
    this.averageOutflowAmount = averageOutflowAmount;
    return this;
  }

  public BaseReportAccountInsights addAverageOutflowAmountItem(BaseReportAverageFlowInsights averageOutflowAmountItem) {
    if (this.averageOutflowAmount == null) {
      this.averageOutflowAmount = new ArrayList<>();
    }
    this.averageOutflowAmount.add(averageOutflowAmountItem);
    return this;
  }

   /**
   * Deprecated; use &#x60;average_outflow_amounts&#x60; instead. Average amount of transactions out of the account. This array will be empty for non-depository accounts. This field only takes into account USD transactions from the account.
   * @return averageOutflowAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Deprecated; use `average_outflow_amounts` instead. Average amount of transactions out of the account. This array will be empty for non-depository accounts. This field only takes into account USD transactions from the account.")

  public List<BaseReportAverageFlowInsights> getAverageOutflowAmount() {
    return averageOutflowAmount;
  }


  public void setAverageOutflowAmount(List<BaseReportAverageFlowInsights> averageOutflowAmount) {
    this.averageOutflowAmount = averageOutflowAmount;
  }


  public BaseReportAccountInsights averageOutflowAmounts(List<BaseReportAverageFlowInsights> averageOutflowAmounts) {
    
    this.averageOutflowAmounts = averageOutflowAmounts;
    return this;
  }

  public BaseReportAccountInsights addAverageOutflowAmountsItem(BaseReportAverageFlowInsights averageOutflowAmountsItem) {
    if (this.averageOutflowAmounts == null) {
      this.averageOutflowAmounts = new ArrayList<>();
    }
    this.averageOutflowAmounts.add(averageOutflowAmountsItem);
    return this;
  }

   /**
   * Customers must transition from &#x60;average_outflow_amount&#x60; by January 31st 2025. Average amount of transactions out of the account in a time period. This array will be empty for non-depository accounts. This field only takes into account USD transactions from the account.
   * @return averageOutflowAmounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Customers must transition from `average_outflow_amount` by January 31st 2025. Average amount of transactions out of the account in a time period. This array will be empty for non-depository accounts. This field only takes into account USD transactions from the account.")

  public List<BaseReportAverageFlowInsights> getAverageOutflowAmounts() {
    return averageOutflowAmounts;
  }


  public void setAverageOutflowAmounts(List<BaseReportAverageFlowInsights> averageOutflowAmounts) {
    this.averageOutflowAmounts = averageOutflowAmounts;
  }


  public BaseReportAccountInsights numberOfDaysNoTransactions(Integer numberOfDaysNoTransactions) {
    
    this.numberOfDaysNoTransactions = numberOfDaysNoTransactions;
    return this;
  }

   /**
   * Number of days with no transactions
   * @return numberOfDaysNoTransactions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of days with no transactions")

  public Integer getNumberOfDaysNoTransactions() {
    return numberOfDaysNoTransactions;
  }


  public void setNumberOfDaysNoTransactions(Integer numberOfDaysNoTransactions) {
    this.numberOfDaysNoTransactions = numberOfDaysNoTransactions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BaseReportAccountInsights baseReportAccountInsights = (BaseReportAccountInsights) o;
    return Objects.equals(this.oldestTransactionDate, baseReportAccountInsights.oldestTransactionDate) &&
        Objects.equals(this.mostRecentTransactionDate, baseReportAccountInsights.mostRecentTransactionDate) &&
        Objects.equals(this.daysAvailable, baseReportAccountInsights.daysAvailable) &&
        Objects.equals(this.averageDaysBetweenTransactions, baseReportAccountInsights.averageDaysBetweenTransactions) &&
        Objects.equals(this.longestGapBetweenTransactions, baseReportAccountInsights.longestGapBetweenTransactions) &&
        Objects.equals(this.longestGapsBetweenTransactions, baseReportAccountInsights.longestGapsBetweenTransactions) &&
        Objects.equals(this.numberOfInflows, baseReportAccountInsights.numberOfInflows) &&
        Objects.equals(this.averageInflowAmount, baseReportAccountInsights.averageInflowAmount) &&
        Objects.equals(this.averageInflowAmounts, baseReportAccountInsights.averageInflowAmounts) &&
        Objects.equals(this.numberOfOutflows, baseReportAccountInsights.numberOfOutflows) &&
        Objects.equals(this.averageOutflowAmount, baseReportAccountInsights.averageOutflowAmount) &&
        Objects.equals(this.averageOutflowAmounts, baseReportAccountInsights.averageOutflowAmounts) &&
        Objects.equals(this.numberOfDaysNoTransactions, baseReportAccountInsights.numberOfDaysNoTransactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oldestTransactionDate, mostRecentTransactionDate, daysAvailable, averageDaysBetweenTransactions, longestGapBetweenTransactions, longestGapsBetweenTransactions, numberOfInflows, averageInflowAmount, averageInflowAmounts, numberOfOutflows, averageOutflowAmount, averageOutflowAmounts, numberOfDaysNoTransactions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseReportAccountInsights {\n");
    sb.append("    oldestTransactionDate: ").append(toIndentedString(oldestTransactionDate)).append("\n");
    sb.append("    mostRecentTransactionDate: ").append(toIndentedString(mostRecentTransactionDate)).append("\n");
    sb.append("    daysAvailable: ").append(toIndentedString(daysAvailable)).append("\n");
    sb.append("    averageDaysBetweenTransactions: ").append(toIndentedString(averageDaysBetweenTransactions)).append("\n");
    sb.append("    longestGapBetweenTransactions: ").append(toIndentedString(longestGapBetweenTransactions)).append("\n");
    sb.append("    longestGapsBetweenTransactions: ").append(toIndentedString(longestGapsBetweenTransactions)).append("\n");
    sb.append("    numberOfInflows: ").append(toIndentedString(numberOfInflows)).append("\n");
    sb.append("    averageInflowAmount: ").append(toIndentedString(averageInflowAmount)).append("\n");
    sb.append("    averageInflowAmounts: ").append(toIndentedString(averageInflowAmounts)).append("\n");
    sb.append("    numberOfOutflows: ").append(toIndentedString(numberOfOutflows)).append("\n");
    sb.append("    averageOutflowAmount: ").append(toIndentedString(averageOutflowAmount)).append("\n");
    sb.append("    averageOutflowAmounts: ").append(toIndentedString(averageOutflowAmounts)).append("\n");
    sb.append("    numberOfDaysNoTransactions: ").append(toIndentedString(numberOfDaysNoTransactions)).append("\n");
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

