/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.385.1
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
 * Information about the student&#39;s eligibility in the Public Service Loan Forgiveness program. This is only returned if the institution is FedLoan (&#x60;ins_116527&#x60;). 
 */
@ApiModel(description = "Information about the student's eligibility in the Public Service Loan Forgiveness program. This is only returned if the institution is FedLoan (`ins_116527`). ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-28T17:05:32.818783Z[Etc/UTC]")
public class PSLFStatus {
  public static final String SERIALIZED_NAME_ESTIMATED_ELIGIBILITY_DATE = "estimated_eligibility_date";
  @SerializedName(SERIALIZED_NAME_ESTIMATED_ELIGIBILITY_DATE)
  private LocalDate estimatedEligibilityDate;

  public static final String SERIALIZED_NAME_PAYMENTS_MADE = "payments_made";
  @SerializedName(SERIALIZED_NAME_PAYMENTS_MADE)
  private Integer paymentsMade;

  public static final String SERIALIZED_NAME_PAYMENTS_REMAINING = "payments_remaining";
  @SerializedName(SERIALIZED_NAME_PAYMENTS_REMAINING)
  private Integer paymentsRemaining;


  public PSLFStatus estimatedEligibilityDate(LocalDate estimatedEligibilityDate) {
    
    this.estimatedEligibilityDate = estimatedEligibilityDate;
    return this;
  }

   /**
   * The estimated date borrower will have completed 120 qualifying monthly payments. Returned in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (YYYY-MM-DD).
   * @return estimatedEligibilityDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The estimated date borrower will have completed 120 qualifying monthly payments. Returned in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (YYYY-MM-DD).")

  public LocalDate getEstimatedEligibilityDate() {
    return estimatedEligibilityDate;
  }


  public void setEstimatedEligibilityDate(LocalDate estimatedEligibilityDate) {
    this.estimatedEligibilityDate = estimatedEligibilityDate;
  }


  public PSLFStatus paymentsMade(Integer paymentsMade) {
    
    this.paymentsMade = paymentsMade;
    return this;
  }

   /**
   * The number of qualifying payments that have been made.
   * @return paymentsMade
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The number of qualifying payments that have been made.")

  public Integer getPaymentsMade() {
    return paymentsMade;
  }


  public void setPaymentsMade(Integer paymentsMade) {
    this.paymentsMade = paymentsMade;
  }


  public PSLFStatus paymentsRemaining(Integer paymentsRemaining) {
    
    this.paymentsRemaining = paymentsRemaining;
    return this;
  }

   /**
   * The number of qualifying payments remaining.
   * @return paymentsRemaining
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The number of qualifying payments remaining.")

  public Integer getPaymentsRemaining() {
    return paymentsRemaining;
  }


  public void setPaymentsRemaining(Integer paymentsRemaining) {
    this.paymentsRemaining = paymentsRemaining;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PSLFStatus psLFStatus = (PSLFStatus) o;
    return Objects.equals(this.estimatedEligibilityDate, psLFStatus.estimatedEligibilityDate) &&
        Objects.equals(this.paymentsMade, psLFStatus.paymentsMade) &&
        Objects.equals(this.paymentsRemaining, psLFStatus.paymentsRemaining);
  }

  @Override
  public int hashCode() {
    return Objects.hash(estimatedEligibilityDate, paymentsMade, paymentsRemaining);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PSLFStatus {\n");
    sb.append("    estimatedEligibilityDate: ").append(toIndentedString(estimatedEligibilityDate)).append("\n");
    sb.append("    paymentsMade: ").append(toIndentedString(paymentsMade)).append("\n");
    sb.append("    paymentsRemaining: ").append(toIndentedString(paymentsRemaining)).append("\n");
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

