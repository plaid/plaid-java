/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.11.0
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
import com.plaid.client.model.APR;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * An object representing a credit card account.
 */
@ApiModel(description = "An object representing a credit card account.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-31T09:49:55.055Z[GMT]")
public class CreditCardLiability {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_APRS = "aprs";
  @SerializedName(SERIALIZED_NAME_APRS)
  private List<APR> aprs = new ArrayList<>();

  public static final String SERIALIZED_NAME_IS_OVERDUE = "is_overdue";
  @SerializedName(SERIALIZED_NAME_IS_OVERDUE)
  private Boolean isOverdue;

  public static final String SERIALIZED_NAME_LAST_PAYMENT_AMOUNT = "last_payment_amount";
  @SerializedName(SERIALIZED_NAME_LAST_PAYMENT_AMOUNT)
  private Double lastPaymentAmount;

  public static final String SERIALIZED_NAME_LAST_PAYMENT_DATE = "last_payment_date";
  @SerializedName(SERIALIZED_NAME_LAST_PAYMENT_DATE)
  private String lastPaymentDate;

  public static final String SERIALIZED_NAME_LAST_STATEMENT_BALANCE = "last_statement_balance";
  @SerializedName(SERIALIZED_NAME_LAST_STATEMENT_BALANCE)
  private Double lastStatementBalance;

  public static final String SERIALIZED_NAME_LAST_STATEMENT_ISSUE_DATE = "last_statement_issue_date";
  @SerializedName(SERIALIZED_NAME_LAST_STATEMENT_ISSUE_DATE)
  private String lastStatementIssueDate;

  public static final String SERIALIZED_NAME_MINIMUM_PAYMENT_AMOUNT = "minimum_payment_amount";
  @SerializedName(SERIALIZED_NAME_MINIMUM_PAYMENT_AMOUNT)
  private Double minimumPaymentAmount;

  public static final String SERIALIZED_NAME_NEXT_PAYMENT_DUE_DATE = "next_payment_due_date";
  @SerializedName(SERIALIZED_NAME_NEXT_PAYMENT_DUE_DATE)
  private String nextPaymentDueDate;


  public CreditCardLiability accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * The ID of the account that this liability belongs to.
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the account that this liability belongs to.")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public CreditCardLiability aprs(List<APR> aprs) {
    
    this.aprs = aprs;
    return this;
  }

  public CreditCardLiability addAprsItem(APR aprsItem) {
    this.aprs.add(aprsItem);
    return this;
  }

   /**
   * The various interest rates that apply to the account.
   * @return aprs
  **/
  @ApiModelProperty(required = true, value = "The various interest rates that apply to the account.")

  public List<APR> getAprs() {
    return aprs;
  }


  public void setAprs(List<APR> aprs) {
    this.aprs = aprs;
  }


  public CreditCardLiability isOverdue(Boolean isOverdue) {
    
    this.isOverdue = isOverdue;
    return this;
  }

   /**
   * true if a payment is currently overdue. Availability for this field is limited.
   * @return isOverdue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "true if a payment is currently overdue. Availability for this field is limited.")

  public Boolean getIsOverdue() {
    return isOverdue;
  }


  public void setIsOverdue(Boolean isOverdue) {
    this.isOverdue = isOverdue;
  }


  public CreditCardLiability lastPaymentAmount(Double lastPaymentAmount) {
    
    this.lastPaymentAmount = lastPaymentAmount;
    return this;
  }

   /**
   * The amount of the last payment.
   * @return lastPaymentAmount
  **/
  @ApiModelProperty(required = true, value = "The amount of the last payment.")

  public Double getLastPaymentAmount() {
    return lastPaymentAmount;
  }


  public void setLastPaymentAmount(Double lastPaymentAmount) {
    this.lastPaymentAmount = lastPaymentAmount;
  }


  public CreditCardLiability lastPaymentDate(String lastPaymentDate) {
    
    this.lastPaymentDate = lastPaymentDate;
    return this;
  }

   /**
   * The date of the last payment. Dates are returned in an ISO 8601 format (YYYY-MM-DD). Availability for this field is limited.
   * @return lastPaymentDate
  **/
  @ApiModelProperty(required = true, value = "The date of the last payment. Dates are returned in an ISO 8601 format (YYYY-MM-DD). Availability for this field is limited.")

  public String getLastPaymentDate() {
    return lastPaymentDate;
  }


  public void setLastPaymentDate(String lastPaymentDate) {
    this.lastPaymentDate = lastPaymentDate;
  }


  public CreditCardLiability lastStatementBalance(Double lastStatementBalance) {
    
    this.lastStatementBalance = lastStatementBalance;
    return this;
  }

   /**
   * The outstanding balance on the last statement. Availability for this field is limited.
   * @return lastStatementBalance
  **/
  @ApiModelProperty(required = true, value = "The outstanding balance on the last statement. Availability for this field is limited.")

  public Double getLastStatementBalance() {
    return lastStatementBalance;
  }


  public void setLastStatementBalance(Double lastStatementBalance) {
    this.lastStatementBalance = lastStatementBalance;
  }


  public CreditCardLiability lastStatementIssueDate(String lastStatementIssueDate) {
    
    this.lastStatementIssueDate = lastStatementIssueDate;
    return this;
  }

   /**
   * The date of the last statement. Dates are returned in an ISO 8601 format (YYYY-MM-DD).
   * @return lastStatementIssueDate
  **/
  @ApiModelProperty(required = true, value = "The date of the last statement. Dates are returned in an ISO 8601 format (YYYY-MM-DD).")

  public String getLastStatementIssueDate() {
    return lastStatementIssueDate;
  }


  public void setLastStatementIssueDate(String lastStatementIssueDate) {
    this.lastStatementIssueDate = lastStatementIssueDate;
  }


  public CreditCardLiability minimumPaymentAmount(Double minimumPaymentAmount) {
    
    this.minimumPaymentAmount = minimumPaymentAmount;
    return this;
  }

   /**
   * The minimum payment due for the next billing cycle.
   * @return minimumPaymentAmount
  **/
  @ApiModelProperty(required = true, value = "The minimum payment due for the next billing cycle.")

  public Double getMinimumPaymentAmount() {
    return minimumPaymentAmount;
  }


  public void setMinimumPaymentAmount(Double minimumPaymentAmount) {
    this.minimumPaymentAmount = minimumPaymentAmount;
  }


  public CreditCardLiability nextPaymentDueDate(String nextPaymentDueDate) {
    
    this.nextPaymentDueDate = nextPaymentDueDate;
    return this;
  }

   /**
   * The due date for the next payment. The due date is &#x60;null&#x60; if a payment is not expected. Dates are returned in an ISO 8601 format (YYYY-MM-DD).
   * @return nextPaymentDueDate
  **/
  @ApiModelProperty(required = true, value = "The due date for the next payment. The due date is `null` if a payment is not expected. Dates are returned in an ISO 8601 format (YYYY-MM-DD).")

  public String getNextPaymentDueDate() {
    return nextPaymentDueDate;
  }


  public void setNextPaymentDueDate(String nextPaymentDueDate) {
    this.nextPaymentDueDate = nextPaymentDueDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditCardLiability creditCardLiability = (CreditCardLiability) o;
    return Objects.equals(this.accountId, creditCardLiability.accountId) &&
        Objects.equals(this.aprs, creditCardLiability.aprs) &&
        Objects.equals(this.isOverdue, creditCardLiability.isOverdue) &&
        Objects.equals(this.lastPaymentAmount, creditCardLiability.lastPaymentAmount) &&
        Objects.equals(this.lastPaymentDate, creditCardLiability.lastPaymentDate) &&
        Objects.equals(this.lastStatementBalance, creditCardLiability.lastStatementBalance) &&
        Objects.equals(this.lastStatementIssueDate, creditCardLiability.lastStatementIssueDate) &&
        Objects.equals(this.minimumPaymentAmount, creditCardLiability.minimumPaymentAmount) &&
        Objects.equals(this.nextPaymentDueDate, creditCardLiability.nextPaymentDueDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, aprs, isOverdue, lastPaymentAmount, lastPaymentDate, lastStatementBalance, lastStatementIssueDate, minimumPaymentAmount, nextPaymentDueDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditCardLiability {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    aprs: ").append(toIndentedString(aprs)).append("\n");
    sb.append("    isOverdue: ").append(toIndentedString(isOverdue)).append("\n");
    sb.append("    lastPaymentAmount: ").append(toIndentedString(lastPaymentAmount)).append("\n");
    sb.append("    lastPaymentDate: ").append(toIndentedString(lastPaymentDate)).append("\n");
    sb.append("    lastStatementBalance: ").append(toIndentedString(lastStatementBalance)).append("\n");
    sb.append("    lastStatementIssueDate: ").append(toIndentedString(lastStatementIssueDate)).append("\n");
    sb.append("    minimumPaymentAmount: ").append(toIndentedString(minimumPaymentAmount)).append("\n");
    sb.append("    nextPaymentDueDate: ").append(toIndentedString(nextPaymentDueDate)).append("\n");
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

