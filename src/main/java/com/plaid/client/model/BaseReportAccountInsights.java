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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-28T19:43:00.996446Z[Etc/UTC]")
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

  public static final String SERIALIZED_NAME_NUMBER_OF_INFLOWS = "number_of_inflows";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_INFLOWS)
  private List<BaseReportNumberFlowInsights> numberOfInflows = null;

  public static final String SERIALIZED_NAME_AVERAGE_INFLOW_AMOUNT = "average_inflow_amount";
  @SerializedName(SERIALIZED_NAME_AVERAGE_INFLOW_AMOUNT)
  private List<BaseReportAverageFlowInsights> averageInflowAmount = null;

  public static final String SERIALIZED_NAME_NUMBER_OF_OUTFLOWS = "number_of_outflows";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_OUTFLOWS)
  private List<BaseReportNumberFlowInsights> numberOfOutflows = null;

  public static final String SERIALIZED_NAME_AVERAGE_OUTFLOW_AMOUNT = "average_outflow_amount";
  @SerializedName(SERIALIZED_NAME_AVERAGE_OUTFLOW_AMOUNT)
  private List<BaseReportAverageFlowInsights> averageOutflowAmount = null;

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
   * Longest gap between sequential transactions
   * @return longestGapBetweenTransactions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Longest gap between sequential transactions")

  public List<BaseReportLongestGapInsights> getLongestGapBetweenTransactions() {
    return longestGapBetweenTransactions;
  }


  public void setLongestGapBetweenTransactions(List<BaseReportLongestGapInsights> longestGapBetweenTransactions) {
    this.longestGapBetweenTransactions = longestGapBetweenTransactions;
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
   * The number of debits into the account. This field will be null for non-depository accounts.
   * @return numberOfInflows
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of debits into the account. This field will be null for non-depository accounts.")

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
   * Average amount of debit transactions into account. This field will be null for non-depository accounts. This field only takes into account USD transactions from the account.
   * @return averageInflowAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Average amount of debit transactions into account. This field will be null for non-depository accounts. This field only takes into account USD transactions from the account.")

  public List<BaseReportAverageFlowInsights> getAverageInflowAmount() {
    return averageInflowAmount;
  }


  public void setAverageInflowAmount(List<BaseReportAverageFlowInsights> averageInflowAmount) {
    this.averageInflowAmount = averageInflowAmount;
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
   * The number of credit into the account. This field will be null for non-depository accounts.
   * @return numberOfOutflows
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of credit into the account. This field will be null for non-depository accounts.")

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
   * Average amount of credit transactions into account. This field will be null for non-depository accounts. This field only takes into account USD transactions from the account.
   * @return averageOutflowAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Average amount of credit transactions into account. This field will be null for non-depository accounts. This field only takes into account USD transactions from the account.")

  public List<BaseReportAverageFlowInsights> getAverageOutflowAmount() {
    return averageOutflowAmount;
  }


  public void setAverageOutflowAmount(List<BaseReportAverageFlowInsights> averageOutflowAmount) {
    this.averageOutflowAmount = averageOutflowAmount;
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
        Objects.equals(this.numberOfInflows, baseReportAccountInsights.numberOfInflows) &&
        Objects.equals(this.averageInflowAmount, baseReportAccountInsights.averageInflowAmount) &&
        Objects.equals(this.numberOfOutflows, baseReportAccountInsights.numberOfOutflows) &&
        Objects.equals(this.averageOutflowAmount, baseReportAccountInsights.averageOutflowAmount) &&
        Objects.equals(this.numberOfDaysNoTransactions, baseReportAccountInsights.numberOfDaysNoTransactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oldestTransactionDate, mostRecentTransactionDate, daysAvailable, averageDaysBetweenTransactions, longestGapBetweenTransactions, numberOfInflows, averageInflowAmount, numberOfOutflows, averageOutflowAmount, numberOfDaysNoTransactions);
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
    sb.append("    numberOfInflows: ").append(toIndentedString(numberOfInflows)).append("\n");
    sb.append("    averageInflowAmount: ").append(toIndentedString(averageInflowAmount)).append("\n");
    sb.append("    numberOfOutflows: ").append(toIndentedString(numberOfOutflows)).append("\n");
    sb.append("    averageOutflowAmount: ").append(toIndentedString(averageOutflowAmount)).append("\n");
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

