/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.617.1
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
 * An object containing data on the overall period of the statement.
 */
@ApiModel(description = "An object containing data on the overall period of the statement.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-07T19:05:33.763924Z[Etc/UTC]")
public class CreditBankStatementUploadBankAccountPeriod {
  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private LocalDate startDate;

  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private LocalDate endDate;

  public static final String SERIALIZED_NAME_STARTING_BALANCE = "starting_balance";
  @SerializedName(SERIALIZED_NAME_STARTING_BALANCE)
  private Double startingBalance;

  public static final String SERIALIZED_NAME_ENDING_BALANCE = "ending_balance";
  @SerializedName(SERIALIZED_NAME_ENDING_BALANCE)
  private Double endingBalance;


  public CreditBankStatementUploadBankAccountPeriod startDate(LocalDate startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * The start date of the statement period in ISO 8601 format (YYYY-MM-DD).
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The start date of the statement period in ISO 8601 format (YYYY-MM-DD).")

  public LocalDate getStartDate() {
    return startDate;
  }


  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }


  public CreditBankStatementUploadBankAccountPeriod endDate(LocalDate endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * The end date of the statement period in ISO 8601 format (YYYY-MM-DD).
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The end date of the statement period in ISO 8601 format (YYYY-MM-DD).")

  public LocalDate getEndDate() {
    return endDate;
  }


  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }


  public CreditBankStatementUploadBankAccountPeriod startingBalance(Double startingBalance) {
    
    this.startingBalance = startingBalance;
    return this;
  }

   /**
   * The starting balance of the bank account for the period.
   * @return startingBalance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The starting balance of the bank account for the period.")

  public Double getStartingBalance() {
    return startingBalance;
  }


  public void setStartingBalance(Double startingBalance) {
    this.startingBalance = startingBalance;
  }


  public CreditBankStatementUploadBankAccountPeriod endingBalance(Double endingBalance) {
    
    this.endingBalance = endingBalance;
    return this;
  }

   /**
   * The ending balance of the bank account for the period.
   * @return endingBalance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The ending balance of the bank account for the period.")

  public Double getEndingBalance() {
    return endingBalance;
  }


  public void setEndingBalance(Double endingBalance) {
    this.endingBalance = endingBalance;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditBankStatementUploadBankAccountPeriod creditBankStatementUploadBankAccountPeriod = (CreditBankStatementUploadBankAccountPeriod) o;
    return Objects.equals(this.startDate, creditBankStatementUploadBankAccountPeriod.startDate) &&
        Objects.equals(this.endDate, creditBankStatementUploadBankAccountPeriod.endDate) &&
        Objects.equals(this.startingBalance, creditBankStatementUploadBankAccountPeriod.startingBalance) &&
        Objects.equals(this.endingBalance, creditBankStatementUploadBankAccountPeriod.endingBalance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate, startingBalance, endingBalance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditBankStatementUploadBankAccountPeriod {\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    startingBalance: ").append(toIndentedString(startingBalance)).append("\n");
    sb.append("    endingBalance: ").append(toIndentedString(endingBalance)).append("\n");
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

