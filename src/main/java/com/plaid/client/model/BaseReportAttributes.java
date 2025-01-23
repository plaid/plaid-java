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
import com.plaid.client.model.TotalInflowAmount;
import com.plaid.client.model.TotalInflowAmount30d;
import com.plaid.client.model.TotalInflowAmount60d;
import com.plaid.client.model.TotalInflowAmount90d;
import com.plaid.client.model.TotalOutflowAmount;
import com.plaid.client.model.TotalOutflowAmount30d;
import com.plaid.client.model.TotalOutflowAmount60d;
import com.plaid.client.model.TotalOutflowAmount90d;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * Calculated attributes derived from transaction-level data.
 */
@ApiModel(description = "Calculated attributes derived from transaction-level data.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-23T20:55:58.809242Z[Etc/UTC]")
public class BaseReportAttributes {
  public static final String SERIALIZED_NAME_NSF_OVERDRAFT_TRANSACTIONS_COUNT = "nsf_overdraft_transactions_count";
  @SerializedName(SERIALIZED_NAME_NSF_OVERDRAFT_TRANSACTIONS_COUNT)
  private Integer nsfOverdraftTransactionsCount;

  public static final String SERIALIZED_NAME_NSF_OVERDRAFT_TRANSACTIONS_COUNT30D = "nsf_overdraft_transactions_count_30d";
  @SerializedName(SERIALIZED_NAME_NSF_OVERDRAFT_TRANSACTIONS_COUNT30D)
  private Integer nsfOverdraftTransactionsCount30d;

  public static final String SERIALIZED_NAME_NSF_OVERDRAFT_TRANSACTIONS_COUNT60D = "nsf_overdraft_transactions_count_60d";
  @SerializedName(SERIALIZED_NAME_NSF_OVERDRAFT_TRANSACTIONS_COUNT60D)
  private Integer nsfOverdraftTransactionsCount60d;

  public static final String SERIALIZED_NAME_NSF_OVERDRAFT_TRANSACTIONS_COUNT90D = "nsf_overdraft_transactions_count_90d";
  @SerializedName(SERIALIZED_NAME_NSF_OVERDRAFT_TRANSACTIONS_COUNT90D)
  private Integer nsfOverdraftTransactionsCount90d;

  public static final String SERIALIZED_NAME_IS_PRIMARY_ACCOUNT = "is_primary_account";
  @SerializedName(SERIALIZED_NAME_IS_PRIMARY_ACCOUNT)
  private Boolean isPrimaryAccount;

  public static final String SERIALIZED_NAME_PRIMARY_ACCOUNT_SCORE = "primary_account_score";
  @SerializedName(SERIALIZED_NAME_PRIMARY_ACCOUNT_SCORE)
  private Double primaryAccountScore;

  public static final String SERIALIZED_NAME_TOTAL_INFLOW_AMOUNT = "total_inflow_amount";
  @SerializedName(SERIALIZED_NAME_TOTAL_INFLOW_AMOUNT)
  private TotalInflowAmount totalInflowAmount;

  public static final String SERIALIZED_NAME_TOTAL_INFLOW_AMOUNT30D = "total_inflow_amount_30d";
  @SerializedName(SERIALIZED_NAME_TOTAL_INFLOW_AMOUNT30D)
  private TotalInflowAmount30d totalInflowAmount30d;

  public static final String SERIALIZED_NAME_TOTAL_INFLOW_AMOUNT60D = "total_inflow_amount_60d";
  @SerializedName(SERIALIZED_NAME_TOTAL_INFLOW_AMOUNT60D)
  private TotalInflowAmount60d totalInflowAmount60d;

  public static final String SERIALIZED_NAME_TOTAL_INFLOW_AMOUNT90D = "total_inflow_amount_90d";
  @SerializedName(SERIALIZED_NAME_TOTAL_INFLOW_AMOUNT90D)
  private TotalInflowAmount90d totalInflowAmount90d;

  public static final String SERIALIZED_NAME_TOTAL_OUTFLOW_AMOUNT = "total_outflow_amount";
  @SerializedName(SERIALIZED_NAME_TOTAL_OUTFLOW_AMOUNT)
  private TotalOutflowAmount totalOutflowAmount;

  public static final String SERIALIZED_NAME_TOTAL_OUTFLOW_AMOUNT30D = "total_outflow_amount_30d";
  @SerializedName(SERIALIZED_NAME_TOTAL_OUTFLOW_AMOUNT30D)
  private TotalOutflowAmount30d totalOutflowAmount30d;

  public static final String SERIALIZED_NAME_TOTAL_OUTFLOW_AMOUNT60D = "total_outflow_amount_60d";
  @SerializedName(SERIALIZED_NAME_TOTAL_OUTFLOW_AMOUNT60D)
  private TotalOutflowAmount60d totalOutflowAmount60d;

  public static final String SERIALIZED_NAME_TOTAL_OUTFLOW_AMOUNT90D = "total_outflow_amount_90d";
  @SerializedName(SERIALIZED_NAME_TOTAL_OUTFLOW_AMOUNT90D)
  private TotalOutflowAmount90d totalOutflowAmount90d;


  public BaseReportAttributes nsfOverdraftTransactionsCount(Integer nsfOverdraftTransactionsCount) {
    
    this.nsfOverdraftTransactionsCount = nsfOverdraftTransactionsCount;
    return this;
  }

   /**
   * The number of NSF and overdraft fee transactions in the time range for the report in the given account.
   * @return nsfOverdraftTransactionsCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of NSF and overdraft fee transactions in the time range for the report in the given account.")

  public Integer getNsfOverdraftTransactionsCount() {
    return nsfOverdraftTransactionsCount;
  }


  public void setNsfOverdraftTransactionsCount(Integer nsfOverdraftTransactionsCount) {
    this.nsfOverdraftTransactionsCount = nsfOverdraftTransactionsCount;
  }


  public BaseReportAttributes nsfOverdraftTransactionsCount30d(Integer nsfOverdraftTransactionsCount30d) {
    
    this.nsfOverdraftTransactionsCount30d = nsfOverdraftTransactionsCount30d;
    return this;
  }

   /**
   * The number of NSF and overdraft fee transactions in the last 30 days for a given account.
   * @return nsfOverdraftTransactionsCount30d
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of NSF and overdraft fee transactions in the last 30 days for a given account.")

  public Integer getNsfOverdraftTransactionsCount30d() {
    return nsfOverdraftTransactionsCount30d;
  }


  public void setNsfOverdraftTransactionsCount30d(Integer nsfOverdraftTransactionsCount30d) {
    this.nsfOverdraftTransactionsCount30d = nsfOverdraftTransactionsCount30d;
  }


  public BaseReportAttributes nsfOverdraftTransactionsCount60d(Integer nsfOverdraftTransactionsCount60d) {
    
    this.nsfOverdraftTransactionsCount60d = nsfOverdraftTransactionsCount60d;
    return this;
  }

   /**
   * The number of NSF and overdraft fee transactions in the last 60 days for a given account.
   * @return nsfOverdraftTransactionsCount60d
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of NSF and overdraft fee transactions in the last 60 days for a given account.")

  public Integer getNsfOverdraftTransactionsCount60d() {
    return nsfOverdraftTransactionsCount60d;
  }


  public void setNsfOverdraftTransactionsCount60d(Integer nsfOverdraftTransactionsCount60d) {
    this.nsfOverdraftTransactionsCount60d = nsfOverdraftTransactionsCount60d;
  }


  public BaseReportAttributes nsfOverdraftTransactionsCount90d(Integer nsfOverdraftTransactionsCount90d) {
    
    this.nsfOverdraftTransactionsCount90d = nsfOverdraftTransactionsCount90d;
    return this;
  }

   /**
   * The number of NSF and overdraft fee transactions in the last 90 days for a given account.
   * @return nsfOverdraftTransactionsCount90d
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of NSF and overdraft fee transactions in the last 90 days for a given account.")

  public Integer getNsfOverdraftTransactionsCount90d() {
    return nsfOverdraftTransactionsCount90d;
  }


  public void setNsfOverdraftTransactionsCount90d(Integer nsfOverdraftTransactionsCount90d) {
    this.nsfOverdraftTransactionsCount90d = nsfOverdraftTransactionsCount90d;
  }


  public BaseReportAttributes isPrimaryAccount(Boolean isPrimaryAccount) {
    
    this.isPrimaryAccount = isPrimaryAccount;
    return this;
  }

   /**
   * Prediction indicator of whether the account is a primary account. Only one account per account type across the items connected will have a value of true.
   * @return isPrimaryAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Prediction indicator of whether the account is a primary account. Only one account per account type across the items connected will have a value of true.")

  public Boolean getIsPrimaryAccount() {
    return isPrimaryAccount;
  }


  public void setIsPrimaryAccount(Boolean isPrimaryAccount) {
    this.isPrimaryAccount = isPrimaryAccount;
  }


  public BaseReportAttributes primaryAccountScore(Double primaryAccountScore) {
    
    this.primaryAccountScore = primaryAccountScore;
    return this;
  }

   /**
   * Value ranging from 0-1. The higher the score, the more confident we are of the account being the primary account.
   * @return primaryAccountScore
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Value ranging from 0-1. The higher the score, the more confident we are of the account being the primary account.")

  public Double getPrimaryAccountScore() {
    return primaryAccountScore;
  }


  public void setPrimaryAccountScore(Double primaryAccountScore) {
    this.primaryAccountScore = primaryAccountScore;
  }


  public BaseReportAttributes totalInflowAmount(TotalInflowAmount totalInflowAmount) {
    
    this.totalInflowAmount = totalInflowAmount;
    return this;
  }

   /**
   * Get totalInflowAmount
   * @return totalInflowAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TotalInflowAmount getTotalInflowAmount() {
    return totalInflowAmount;
  }


  public void setTotalInflowAmount(TotalInflowAmount totalInflowAmount) {
    this.totalInflowAmount = totalInflowAmount;
  }


  public BaseReportAttributes totalInflowAmount30d(TotalInflowAmount30d totalInflowAmount30d) {
    
    this.totalInflowAmount30d = totalInflowAmount30d;
    return this;
  }

   /**
   * Get totalInflowAmount30d
   * @return totalInflowAmount30d
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TotalInflowAmount30d getTotalInflowAmount30d() {
    return totalInflowAmount30d;
  }


  public void setTotalInflowAmount30d(TotalInflowAmount30d totalInflowAmount30d) {
    this.totalInflowAmount30d = totalInflowAmount30d;
  }


  public BaseReportAttributes totalInflowAmount60d(TotalInflowAmount60d totalInflowAmount60d) {
    
    this.totalInflowAmount60d = totalInflowAmount60d;
    return this;
  }

   /**
   * Get totalInflowAmount60d
   * @return totalInflowAmount60d
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TotalInflowAmount60d getTotalInflowAmount60d() {
    return totalInflowAmount60d;
  }


  public void setTotalInflowAmount60d(TotalInflowAmount60d totalInflowAmount60d) {
    this.totalInflowAmount60d = totalInflowAmount60d;
  }


  public BaseReportAttributes totalInflowAmount90d(TotalInflowAmount90d totalInflowAmount90d) {
    
    this.totalInflowAmount90d = totalInflowAmount90d;
    return this;
  }

   /**
   * Get totalInflowAmount90d
   * @return totalInflowAmount90d
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TotalInflowAmount90d getTotalInflowAmount90d() {
    return totalInflowAmount90d;
  }


  public void setTotalInflowAmount90d(TotalInflowAmount90d totalInflowAmount90d) {
    this.totalInflowAmount90d = totalInflowAmount90d;
  }


  public BaseReportAttributes totalOutflowAmount(TotalOutflowAmount totalOutflowAmount) {
    
    this.totalOutflowAmount = totalOutflowAmount;
    return this;
  }

   /**
   * Get totalOutflowAmount
   * @return totalOutflowAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TotalOutflowAmount getTotalOutflowAmount() {
    return totalOutflowAmount;
  }


  public void setTotalOutflowAmount(TotalOutflowAmount totalOutflowAmount) {
    this.totalOutflowAmount = totalOutflowAmount;
  }


  public BaseReportAttributes totalOutflowAmount30d(TotalOutflowAmount30d totalOutflowAmount30d) {
    
    this.totalOutflowAmount30d = totalOutflowAmount30d;
    return this;
  }

   /**
   * Get totalOutflowAmount30d
   * @return totalOutflowAmount30d
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TotalOutflowAmount30d getTotalOutflowAmount30d() {
    return totalOutflowAmount30d;
  }


  public void setTotalOutflowAmount30d(TotalOutflowAmount30d totalOutflowAmount30d) {
    this.totalOutflowAmount30d = totalOutflowAmount30d;
  }


  public BaseReportAttributes totalOutflowAmount60d(TotalOutflowAmount60d totalOutflowAmount60d) {
    
    this.totalOutflowAmount60d = totalOutflowAmount60d;
    return this;
  }

   /**
   * Get totalOutflowAmount60d
   * @return totalOutflowAmount60d
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TotalOutflowAmount60d getTotalOutflowAmount60d() {
    return totalOutflowAmount60d;
  }


  public void setTotalOutflowAmount60d(TotalOutflowAmount60d totalOutflowAmount60d) {
    this.totalOutflowAmount60d = totalOutflowAmount60d;
  }


  public BaseReportAttributes totalOutflowAmount90d(TotalOutflowAmount90d totalOutflowAmount90d) {
    
    this.totalOutflowAmount90d = totalOutflowAmount90d;
    return this;
  }

   /**
   * Get totalOutflowAmount90d
   * @return totalOutflowAmount90d
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TotalOutflowAmount90d getTotalOutflowAmount90d() {
    return totalOutflowAmount90d;
  }


  public void setTotalOutflowAmount90d(TotalOutflowAmount90d totalOutflowAmount90d) {
    this.totalOutflowAmount90d = totalOutflowAmount90d;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BaseReportAttributes baseReportAttributes = (BaseReportAttributes) o;
    return Objects.equals(this.nsfOverdraftTransactionsCount, baseReportAttributes.nsfOverdraftTransactionsCount) &&
        Objects.equals(this.nsfOverdraftTransactionsCount30d, baseReportAttributes.nsfOverdraftTransactionsCount30d) &&
        Objects.equals(this.nsfOverdraftTransactionsCount60d, baseReportAttributes.nsfOverdraftTransactionsCount60d) &&
        Objects.equals(this.nsfOverdraftTransactionsCount90d, baseReportAttributes.nsfOverdraftTransactionsCount90d) &&
        Objects.equals(this.isPrimaryAccount, baseReportAttributes.isPrimaryAccount) &&
        Objects.equals(this.primaryAccountScore, baseReportAttributes.primaryAccountScore) &&
        Objects.equals(this.totalInflowAmount, baseReportAttributes.totalInflowAmount) &&
        Objects.equals(this.totalInflowAmount30d, baseReportAttributes.totalInflowAmount30d) &&
        Objects.equals(this.totalInflowAmount60d, baseReportAttributes.totalInflowAmount60d) &&
        Objects.equals(this.totalInflowAmount90d, baseReportAttributes.totalInflowAmount90d) &&
        Objects.equals(this.totalOutflowAmount, baseReportAttributes.totalOutflowAmount) &&
        Objects.equals(this.totalOutflowAmount30d, baseReportAttributes.totalOutflowAmount30d) &&
        Objects.equals(this.totalOutflowAmount60d, baseReportAttributes.totalOutflowAmount60d) &&
        Objects.equals(this.totalOutflowAmount90d, baseReportAttributes.totalOutflowAmount90d);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nsfOverdraftTransactionsCount, nsfOverdraftTransactionsCount30d, nsfOverdraftTransactionsCount60d, nsfOverdraftTransactionsCount90d, isPrimaryAccount, primaryAccountScore, totalInflowAmount, totalInflowAmount30d, totalInflowAmount60d, totalInflowAmount90d, totalOutflowAmount, totalOutflowAmount30d, totalOutflowAmount60d, totalOutflowAmount90d);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseReportAttributes {\n");
    sb.append("    nsfOverdraftTransactionsCount: ").append(toIndentedString(nsfOverdraftTransactionsCount)).append("\n");
    sb.append("    nsfOverdraftTransactionsCount30d: ").append(toIndentedString(nsfOverdraftTransactionsCount30d)).append("\n");
    sb.append("    nsfOverdraftTransactionsCount60d: ").append(toIndentedString(nsfOverdraftTransactionsCount60d)).append("\n");
    sb.append("    nsfOverdraftTransactionsCount90d: ").append(toIndentedString(nsfOverdraftTransactionsCount90d)).append("\n");
    sb.append("    isPrimaryAccount: ").append(toIndentedString(isPrimaryAccount)).append("\n");
    sb.append("    primaryAccountScore: ").append(toIndentedString(primaryAccountScore)).append("\n");
    sb.append("    totalInflowAmount: ").append(toIndentedString(totalInflowAmount)).append("\n");
    sb.append("    totalInflowAmount30d: ").append(toIndentedString(totalInflowAmount30d)).append("\n");
    sb.append("    totalInflowAmount60d: ").append(toIndentedString(totalInflowAmount60d)).append("\n");
    sb.append("    totalInflowAmount90d: ").append(toIndentedString(totalInflowAmount90d)).append("\n");
    sb.append("    totalOutflowAmount: ").append(toIndentedString(totalOutflowAmount)).append("\n");
    sb.append("    totalOutflowAmount30d: ").append(toIndentedString(totalOutflowAmount30d)).append("\n");
    sb.append("    totalOutflowAmount60d: ").append(toIndentedString(totalOutflowAmount60d)).append("\n");
    sb.append("    totalOutflowAmount90d: ").append(toIndentedString(totalOutflowAmount90d)).append("\n");
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

