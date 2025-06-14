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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;

/**
 * A possible account detected to be associated with a transaction user.
 */
@ApiModel(description = "A possible account detected to be associated with a transaction user.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-12T21:24:48.076128Z[Etc/UTC]")
public class DetectedAccount {
  public static final String SERIALIZED_NAME_ACCOUNT_TYPE = "account_type";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_TYPE)
  private String accountType;

  public static final String SERIALIZED_NAME_ACCOUNT_SUBTYPE = "account_subtype";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_SUBTYPE)
  private String accountSubtype;

  public static final String SERIALIZED_NAME_TRANSACTION_COUNT = "transaction_count";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_COUNT)
  private Integer transactionCount;

  public static final String SERIALIZED_NAME_OLDEST_TRANSACTION_DATE = "oldest_transaction_date";
  @SerializedName(SERIALIZED_NAME_OLDEST_TRANSACTION_DATE)
  private LocalDate oldestTransactionDate;

  public static final String SERIALIZED_NAME_NEWEST_TRANSACTION_DATE = "newest_transaction_date";
  @SerializedName(SERIALIZED_NAME_NEWEST_TRANSACTION_DATE)
  private LocalDate newestTransactionDate;

  public static final String SERIALIZED_NAME_NEWEST_TRANSACTION_AMOUNT = "newest_transaction_amount";
  @SerializedName(SERIALIZED_NAME_NEWEST_TRANSACTION_AMOUNT)
  private Double newestTransactionAmount;

  public static final String SERIALIZED_NAME_TOTAL_OUTFLOWS = "total_outflows";
  @SerializedName(SERIALIZED_NAME_TOTAL_OUTFLOWS)
  private Double totalOutflows;

  public static final String SERIALIZED_NAME_TOTAL_INFLOWS = "total_inflows";
  @SerializedName(SERIALIZED_NAME_TOTAL_INFLOWS)
  private Double totalInflows;


  public DetectedAccount accountType(String accountType) {
    
    this.accountType = accountType;
    return this;
  }

   /**
   * The detected account type (depository, credit, loan, investment etc.).
   * @return accountType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The detected account type (depository, credit, loan, investment etc.).")

  public String getAccountType() {
    return accountType;
  }


  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }


  public DetectedAccount accountSubtype(String accountSubtype) {
    
    this.accountSubtype = accountSubtype;
    return this;
  }

   /**
   * The detected subtype of the account, based on the transactions to/from the institution.
   * @return accountSubtype
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The detected subtype of the account, based on the transactions to/from the institution.")

  public String getAccountSubtype() {
    return accountSubtype;
  }


  public void setAccountSubtype(String accountSubtype) {
    this.accountSubtype = accountSubtype;
  }


  public DetectedAccount transactionCount(Integer transactionCount) {
    
    this.transactionCount = transactionCount;
    return this;
  }

   /**
   * The number of transactions associated with this detected account type at this financial institution.
   * @return transactionCount
  **/
  @ApiModelProperty(required = true, value = "The number of transactions associated with this detected account type at this financial institution.")

  public Integer getTransactionCount() {
    return transactionCount;
  }


  public void setTransactionCount(Integer transactionCount) {
    this.transactionCount = transactionCount;
  }


  public DetectedAccount oldestTransactionDate(LocalDate oldestTransactionDate) {
    
    this.oldestTransactionDate = oldestTransactionDate;
    return this;
  }

   /**
   * The date of the oldest transaction associated with this detected account type at this financial institution.
   * @return oldestTransactionDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date of the oldest transaction associated with this detected account type at this financial institution.")

  public LocalDate getOldestTransactionDate() {
    return oldestTransactionDate;
  }


  public void setOldestTransactionDate(LocalDate oldestTransactionDate) {
    this.oldestTransactionDate = oldestTransactionDate;
  }


  public DetectedAccount newestTransactionDate(LocalDate newestTransactionDate) {
    
    this.newestTransactionDate = newestTransactionDate;
    return this;
  }

   /**
   * The date of the newest transaction associated with this detected account type at this financial institution.
   * @return newestTransactionDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date of the newest transaction associated with this detected account type at this financial institution.")

  public LocalDate getNewestTransactionDate() {
    return newestTransactionDate;
  }


  public void setNewestTransactionDate(LocalDate newestTransactionDate) {
    this.newestTransactionDate = newestTransactionDate;
  }


  public DetectedAccount newestTransactionAmount(Double newestTransactionAmount) {
    
    this.newestTransactionAmount = newestTransactionAmount;
    return this;
  }

   /**
   * Amount of the most recent transaction associated with this detected account type at this financial institution.
   * @return newestTransactionAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Amount of the most recent transaction associated with this detected account type at this financial institution.")

  public Double getNewestTransactionAmount() {
    return newestTransactionAmount;
  }


  public void setNewestTransactionAmount(Double newestTransactionAmount) {
    this.newestTransactionAmount = newestTransactionAmount;
  }


  public DetectedAccount totalOutflows(Double totalOutflows) {
    
    this.totalOutflows = totalOutflows;
    return this;
  }

   /**
   * Sum of outflow amounts associated with this detected account type at this financial institution.
   * @return totalOutflows
  **/
  @ApiModelProperty(required = true, value = "Sum of outflow amounts associated with this detected account type at this financial institution.")

  public Double getTotalOutflows() {
    return totalOutflows;
  }


  public void setTotalOutflows(Double totalOutflows) {
    this.totalOutflows = totalOutflows;
  }


  public DetectedAccount totalInflows(Double totalInflows) {
    
    this.totalInflows = totalInflows;
    return this;
  }

   /**
   * Sum of inflow amounts associated with this detected account type at this financial institution.
   * @return totalInflows
  **/
  @ApiModelProperty(required = true, value = "Sum of inflow amounts associated with this detected account type at this financial institution.")

  public Double getTotalInflows() {
    return totalInflows;
  }


  public void setTotalInflows(Double totalInflows) {
    this.totalInflows = totalInflows;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetectedAccount detectedAccount = (DetectedAccount) o;
    return Objects.equals(this.accountType, detectedAccount.accountType) &&
        Objects.equals(this.accountSubtype, detectedAccount.accountSubtype) &&
        Objects.equals(this.transactionCount, detectedAccount.transactionCount) &&
        Objects.equals(this.oldestTransactionDate, detectedAccount.oldestTransactionDate) &&
        Objects.equals(this.newestTransactionDate, detectedAccount.newestTransactionDate) &&
        Objects.equals(this.newestTransactionAmount, detectedAccount.newestTransactionAmount) &&
        Objects.equals(this.totalOutflows, detectedAccount.totalOutflows) &&
        Objects.equals(this.totalInflows, detectedAccount.totalInflows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountType, accountSubtype, transactionCount, oldestTransactionDate, newestTransactionDate, newestTransactionAmount, totalOutflows, totalInflows);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetectedAccount {\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    accountSubtype: ").append(toIndentedString(accountSubtype)).append("\n");
    sb.append("    transactionCount: ").append(toIndentedString(transactionCount)).append("\n");
    sb.append("    oldestTransactionDate: ").append(toIndentedString(oldestTransactionDate)).append("\n");
    sb.append("    newestTransactionDate: ").append(toIndentedString(newestTransactionDate)).append("\n");
    sb.append("    newestTransactionAmount: ").append(toIndentedString(newestTransactionAmount)).append("\n");
    sb.append("    totalOutflows: ").append(toIndentedString(totalOutflows)).append("\n");
    sb.append("    totalInflows: ").append(toIndentedString(totalInflows)).append("\n");
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

