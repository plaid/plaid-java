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
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Contains the payment information for a loan payment period.
 */
@ApiModel(description = "Contains the payment information for a loan payment period.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-23T18:11:57.813484Z[Etc/UTC]")
public class CraLoanPaymentHistory {
  public static final String SERIALIZED_NAME_PERIOD = "period";
  @SerializedName(SERIALIZED_NAME_PERIOD)
  private Integer period;

  public static final String SERIALIZED_NAME_DUE_DATE = "due_date";
  @SerializedName(SERIALIZED_NAME_DUE_DATE)
  private LocalDate dueDate;

  public static final String SERIALIZED_NAME_DAYS_PAST_DUE = "days_past_due";
  @SerializedName(SERIALIZED_NAME_DAYS_PAST_DUE)
  private Integer daysPastDue;

  public static final String SERIALIZED_NAME_AMOUNT_PAST_DUE = "amount_past_due";
  @SerializedName(SERIALIZED_NAME_AMOUNT_PAST_DUE)
  private Double amountPastDue;

  public static final String SERIALIZED_NAME_BALANCE_REMAINING = "balance_remaining";
  @SerializedName(SERIALIZED_NAME_BALANCE_REMAINING)
  private Double balanceRemaining;


  public CraLoanPaymentHistory period(Integer period) {
    
    this.period = period;
    return this;
  }

   /**
   * The index to identify the loan&#39;s payment period, starting from 1. For example:   1 means the period between the loan&#39;s opening date and the 1st payment due date.   2 means the period between the loan&#39;s 1st payment due date and 2nd payment due date.
   * @return period
  **/
  @ApiModelProperty(required = true, value = "The index to identify the loan's payment period, starting from 1. For example:   1 means the period between the loan's opening date and the 1st payment due date.   2 means the period between the loan's 1st payment due date and 2nd payment due date.")

  public Integer getPeriod() {
    return period;
  }


  public void setPeriod(Integer period) {
    this.period = period;
  }


  public CraLoanPaymentHistory dueDate(LocalDate dueDate) {
    
    this.dueDate = dueDate;
    return this;
  }

   /**
   * The payment due date or end date of the payment period. The date should be in ISO 8601 format (YYYY-MM-DD).
   * @return dueDate
  **/
  @ApiModelProperty(required = true, value = "The payment due date or end date of the payment period. The date should be in ISO 8601 format (YYYY-MM-DD).")

  public LocalDate getDueDate() {
    return dueDate;
  }


  public void setDueDate(LocalDate dueDate) {
    this.dueDate = dueDate;
  }


  public CraLoanPaymentHistory daysPastDue(Integer daysPastDue) {
    
    this.daysPastDue = daysPastDue;
    return this;
  }

   /**
   * The number of days the loan was delinquent at the end of the pay period. If specified, should be greater of equal to 0.
   * @return daysPastDue
  **/
  @ApiModelProperty(required = true, value = "The number of days the loan was delinquent at the end of the pay period. If specified, should be greater of equal to 0.")

  public Integer getDaysPastDue() {
    return daysPastDue;
  }


  public void setDaysPastDue(Integer daysPastDue) {
    this.daysPastDue = daysPastDue;
  }


  public CraLoanPaymentHistory amountPastDue(Double amountPastDue) {
    
    this.amountPastDue = amountPastDue;
    return this;
  }

   /**
   * The amount past due or the charge-off amount of the loan at the end of the payment period.
   * @return amountPastDue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The amount past due or the charge-off amount of the loan at the end of the payment period.")

  public Double getAmountPastDue() {
    return amountPastDue;
  }


  public void setAmountPastDue(Double amountPastDue) {
    this.amountPastDue = amountPastDue;
  }


  public CraLoanPaymentHistory balanceRemaining(Double balanceRemaining) {
    
    this.balanceRemaining = balanceRemaining;
    return this;
  }

   /**
   * The balance remaining on the loan at the end of the payment period.
   * @return balanceRemaining
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The balance remaining on the loan at the end of the payment period.")

  public Double getBalanceRemaining() {
    return balanceRemaining;
  }


  public void setBalanceRemaining(Double balanceRemaining) {
    this.balanceRemaining = balanceRemaining;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CraLoanPaymentHistory craLoanPaymentHistory = (CraLoanPaymentHistory) o;
    return Objects.equals(this.period, craLoanPaymentHistory.period) &&
        Objects.equals(this.dueDate, craLoanPaymentHistory.dueDate) &&
        Objects.equals(this.daysPastDue, craLoanPaymentHistory.daysPastDue) &&
        Objects.equals(this.amountPastDue, craLoanPaymentHistory.amountPastDue) &&
        Objects.equals(this.balanceRemaining, craLoanPaymentHistory.balanceRemaining);
  }

  @Override
  public int hashCode() {
    return Objects.hash(period, dueDate, daysPastDue, amountPastDue, balanceRemaining);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CraLoanPaymentHistory {\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    daysPastDue: ").append(toIndentedString(daysPastDue)).append("\n");
    sb.append("    amountPastDue: ").append(toIndentedString(amountPastDue)).append("\n");
    sb.append("    balanceRemaining: ").append(toIndentedString(balanceRemaining)).append("\n");
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

