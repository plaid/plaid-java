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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * An object containing metadata about the provided transactions.
 */
@ApiModel(description = "An object containing metadata about the provided transactions.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-17T19:36:14.619905Z[Etc/UTC]")
public class PrismCashScoreMetadata {
  public static final String SERIALIZED_NAME_MAX_AGE = "max_age";
  @SerializedName(SERIALIZED_NAME_MAX_AGE)
  private Integer maxAge;

  public static final String SERIALIZED_NAME_MIN_AGE = "min_age";
  @SerializedName(SERIALIZED_NAME_MIN_AGE)
  private Integer minAge;

  public static final String SERIALIZED_NAME_MIN_AGE_CREDIT = "min_age_credit";
  @SerializedName(SERIALIZED_NAME_MIN_AGE_CREDIT)
  private Integer minAgeCredit;

  public static final String SERIALIZED_NAME_MIN_AGE_DEBIT = "min_age_debit";
  @SerializedName(SERIALIZED_NAME_MIN_AGE_DEBIT)
  private Integer minAgeDebit;

  public static final String SERIALIZED_NAME_MAX_AGE_DEBIT = "max_age_debit";
  @SerializedName(SERIALIZED_NAME_MAX_AGE_DEBIT)
  private Integer maxAgeDebit;

  public static final String SERIALIZED_NAME_MAX_AGE_CREDIT = "max_age_credit";
  @SerializedName(SERIALIZED_NAME_MAX_AGE_CREDIT)
  private Integer maxAgeCredit;

  public static final String SERIALIZED_NAME_NUM_TRXN_CREDIT = "num_trxn_credit";
  @SerializedName(SERIALIZED_NAME_NUM_TRXN_CREDIT)
  private Integer numTrxnCredit;

  public static final String SERIALIZED_NAME_NUM_TRXN_DEBIT = "num_trxn_debit";
  @SerializedName(SERIALIZED_NAME_NUM_TRXN_DEBIT)
  private Integer numTrxnDebit;

  public static final String SERIALIZED_NAME_L1M_CREDIT_VALUE_CNT = "l1m_credit_value_cnt";
  @SerializedName(SERIALIZED_NAME_L1M_CREDIT_VALUE_CNT)
  private Integer l1mCreditValueCnt;

  public static final String SERIALIZED_NAME_L1M_DEBIT_VALUE_CNT = "l1m_debit_value_cnt";
  @SerializedName(SERIALIZED_NAME_L1M_DEBIT_VALUE_CNT)
  private Integer l1mDebitValueCnt;


  public PrismCashScoreMetadata maxAge(Integer maxAge) {
    
    this.maxAge = maxAge;
    return this;
  }

   /**
   * Number of days since the oldest transaction.
   * @return maxAge
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Number of days since the oldest transaction.")

  public Integer getMaxAge() {
    return maxAge;
  }


  public void setMaxAge(Integer maxAge) {
    this.maxAge = maxAge;
  }


  public PrismCashScoreMetadata minAge(Integer minAge) {
    
    this.minAge = minAge;
    return this;
  }

   /**
   * Number of days since the latest transaction.
   * @return minAge
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Number of days since the latest transaction.")

  public Integer getMinAge() {
    return minAge;
  }


  public void setMinAge(Integer minAge) {
    this.minAge = minAge;
  }


  public PrismCashScoreMetadata minAgeCredit(Integer minAgeCredit) {
    
    this.minAgeCredit = minAgeCredit;
    return this;
  }

   /**
   * Number of days since the latest credit transaction.
   * @return minAgeCredit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Number of days since the latest credit transaction.")

  public Integer getMinAgeCredit() {
    return minAgeCredit;
  }


  public void setMinAgeCredit(Integer minAgeCredit) {
    this.minAgeCredit = minAgeCredit;
  }


  public PrismCashScoreMetadata minAgeDebit(Integer minAgeDebit) {
    
    this.minAgeDebit = minAgeDebit;
    return this;
  }

   /**
   * Number of days since the latest debit transaction.
   * @return minAgeDebit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Number of days since the latest debit transaction.")

  public Integer getMinAgeDebit() {
    return minAgeDebit;
  }


  public void setMinAgeDebit(Integer minAgeDebit) {
    this.minAgeDebit = minAgeDebit;
  }


  public PrismCashScoreMetadata maxAgeDebit(Integer maxAgeDebit) {
    
    this.maxAgeDebit = maxAgeDebit;
    return this;
  }

   /**
   * Number of days since the oldest debit transaction.
   * @return maxAgeDebit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Number of days since the oldest debit transaction.")

  public Integer getMaxAgeDebit() {
    return maxAgeDebit;
  }


  public void setMaxAgeDebit(Integer maxAgeDebit) {
    this.maxAgeDebit = maxAgeDebit;
  }


  public PrismCashScoreMetadata maxAgeCredit(Integer maxAgeCredit) {
    
    this.maxAgeCredit = maxAgeCredit;
    return this;
  }

   /**
   * Number of days since the oldest credit transaction.
   * @return maxAgeCredit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Number of days since the oldest credit transaction.")

  public Integer getMaxAgeCredit() {
    return maxAgeCredit;
  }


  public void setMaxAgeCredit(Integer maxAgeCredit) {
    this.maxAgeCredit = maxAgeCredit;
  }


  public PrismCashScoreMetadata numTrxnCredit(Integer numTrxnCredit) {
    
    this.numTrxnCredit = numTrxnCredit;
    return this;
  }

   /**
   * Number of credit transactions.
   * @return numTrxnCredit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Number of credit transactions.")

  public Integer getNumTrxnCredit() {
    return numTrxnCredit;
  }


  public void setNumTrxnCredit(Integer numTrxnCredit) {
    this.numTrxnCredit = numTrxnCredit;
  }


  public PrismCashScoreMetadata numTrxnDebit(Integer numTrxnDebit) {
    
    this.numTrxnDebit = numTrxnDebit;
    return this;
  }

   /**
   * Number of debit transactions.
   * @return numTrxnDebit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Number of debit transactions.")

  public Integer getNumTrxnDebit() {
    return numTrxnDebit;
  }


  public void setNumTrxnDebit(Integer numTrxnDebit) {
    this.numTrxnDebit = numTrxnDebit;
  }


  public PrismCashScoreMetadata l1mCreditValueCnt(Integer l1mCreditValueCnt) {
    
    this.l1mCreditValueCnt = l1mCreditValueCnt;
    return this;
  }

   /**
   * Number of credit transactions in the last 30 days.
   * @return l1mCreditValueCnt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Number of credit transactions in the last 30 days.")

  public Integer getL1mCreditValueCnt() {
    return l1mCreditValueCnt;
  }


  public void setL1mCreditValueCnt(Integer l1mCreditValueCnt) {
    this.l1mCreditValueCnt = l1mCreditValueCnt;
  }


  public PrismCashScoreMetadata l1mDebitValueCnt(Integer l1mDebitValueCnt) {
    
    this.l1mDebitValueCnt = l1mDebitValueCnt;
    return this;
  }

   /**
   * Number of debit transactions in the last 30 days.
   * @return l1mDebitValueCnt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Number of debit transactions in the last 30 days.")

  public Integer getL1mDebitValueCnt() {
    return l1mDebitValueCnt;
  }


  public void setL1mDebitValueCnt(Integer l1mDebitValueCnt) {
    this.l1mDebitValueCnt = l1mDebitValueCnt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrismCashScoreMetadata prismCashScoreMetadata = (PrismCashScoreMetadata) o;
    return Objects.equals(this.maxAge, prismCashScoreMetadata.maxAge) &&
        Objects.equals(this.minAge, prismCashScoreMetadata.minAge) &&
        Objects.equals(this.minAgeCredit, prismCashScoreMetadata.minAgeCredit) &&
        Objects.equals(this.minAgeDebit, prismCashScoreMetadata.minAgeDebit) &&
        Objects.equals(this.maxAgeDebit, prismCashScoreMetadata.maxAgeDebit) &&
        Objects.equals(this.maxAgeCredit, prismCashScoreMetadata.maxAgeCredit) &&
        Objects.equals(this.numTrxnCredit, prismCashScoreMetadata.numTrxnCredit) &&
        Objects.equals(this.numTrxnDebit, prismCashScoreMetadata.numTrxnDebit) &&
        Objects.equals(this.l1mCreditValueCnt, prismCashScoreMetadata.l1mCreditValueCnt) &&
        Objects.equals(this.l1mDebitValueCnt, prismCashScoreMetadata.l1mDebitValueCnt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxAge, minAge, minAgeCredit, minAgeDebit, maxAgeDebit, maxAgeCredit, numTrxnCredit, numTrxnDebit, l1mCreditValueCnt, l1mDebitValueCnt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrismCashScoreMetadata {\n");
    sb.append("    maxAge: ").append(toIndentedString(maxAge)).append("\n");
    sb.append("    minAge: ").append(toIndentedString(minAge)).append("\n");
    sb.append("    minAgeCredit: ").append(toIndentedString(minAgeCredit)).append("\n");
    sb.append("    minAgeDebit: ").append(toIndentedString(minAgeDebit)).append("\n");
    sb.append("    maxAgeDebit: ").append(toIndentedString(maxAgeDebit)).append("\n");
    sb.append("    maxAgeCredit: ").append(toIndentedString(maxAgeCredit)).append("\n");
    sb.append("    numTrxnCredit: ").append(toIndentedString(numTrxnCredit)).append("\n");
    sb.append("    numTrxnDebit: ").append(toIndentedString(numTrxnDebit)).append("\n");
    sb.append("    l1mCreditValueCnt: ").append(toIndentedString(l1mCreditValueCnt)).append("\n");
    sb.append("    l1mDebitValueCnt: ").append(toIndentedString(l1mDebitValueCnt)).append("\n");
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

