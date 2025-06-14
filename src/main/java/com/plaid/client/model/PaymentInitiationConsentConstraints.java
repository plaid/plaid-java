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
import com.plaid.client.model.PaymentConsentMaxPaymentAmount;
import com.plaid.client.model.PaymentConsentPeriodicAmount;
import com.plaid.client.model.PaymentConsentValidDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Limitations that will be applied to payments initiated using the payment consent.
 */
@ApiModel(description = "Limitations that will be applied to payments initiated using the payment consent.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-12T21:24:48.076128Z[Etc/UTC]")
public class PaymentInitiationConsentConstraints {
  public static final String SERIALIZED_NAME_VALID_DATE_TIME = "valid_date_time";
  @SerializedName(SERIALIZED_NAME_VALID_DATE_TIME)
  private PaymentConsentValidDateTime validDateTime;

  public static final String SERIALIZED_NAME_MAX_PAYMENT_AMOUNT = "max_payment_amount";
  @SerializedName(SERIALIZED_NAME_MAX_PAYMENT_AMOUNT)
  private PaymentConsentMaxPaymentAmount maxPaymentAmount;

  public static final String SERIALIZED_NAME_PERIODIC_AMOUNTS = "periodic_amounts";
  @SerializedName(SERIALIZED_NAME_PERIODIC_AMOUNTS)
  private List<PaymentConsentPeriodicAmount> periodicAmounts = new ArrayList<>();


  public PaymentInitiationConsentConstraints validDateTime(PaymentConsentValidDateTime validDateTime) {
    
    this.validDateTime = validDateTime;
    return this;
  }

   /**
   * Get validDateTime
   * @return validDateTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentConsentValidDateTime getValidDateTime() {
    return validDateTime;
  }


  public void setValidDateTime(PaymentConsentValidDateTime validDateTime) {
    this.validDateTime = validDateTime;
  }


  public PaymentInitiationConsentConstraints maxPaymentAmount(PaymentConsentMaxPaymentAmount maxPaymentAmount) {
    
    this.maxPaymentAmount = maxPaymentAmount;
    return this;
  }

   /**
   * Get maxPaymentAmount
   * @return maxPaymentAmount
  **/
  @ApiModelProperty(required = true, value = "")

  public PaymentConsentMaxPaymentAmount getMaxPaymentAmount() {
    return maxPaymentAmount;
  }


  public void setMaxPaymentAmount(PaymentConsentMaxPaymentAmount maxPaymentAmount) {
    this.maxPaymentAmount = maxPaymentAmount;
  }


  public PaymentInitiationConsentConstraints periodicAmounts(List<PaymentConsentPeriodicAmount> periodicAmounts) {
    
    this.periodicAmounts = periodicAmounts;
    return this;
  }

  public PaymentInitiationConsentConstraints addPeriodicAmountsItem(PaymentConsentPeriodicAmount periodicAmountsItem) {
    this.periodicAmounts.add(periodicAmountsItem);
    return this;
  }

   /**
   * A list of amount limitations per period of time.
   * @return periodicAmounts
  **/
  @ApiModelProperty(required = true, value = "A list of amount limitations per period of time.")

  public List<PaymentConsentPeriodicAmount> getPeriodicAmounts() {
    return periodicAmounts;
  }


  public void setPeriodicAmounts(List<PaymentConsentPeriodicAmount> periodicAmounts) {
    this.periodicAmounts = periodicAmounts;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentInitiationConsentConstraints paymentInitiationConsentConstraints = (PaymentInitiationConsentConstraints) o;
    return Objects.equals(this.validDateTime, paymentInitiationConsentConstraints.validDateTime) &&
        Objects.equals(this.maxPaymentAmount, paymentInitiationConsentConstraints.maxPaymentAmount) &&
        Objects.equals(this.periodicAmounts, paymentInitiationConsentConstraints.periodicAmounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validDateTime, maxPaymentAmount, periodicAmounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentInitiationConsentConstraints {\n");
    sb.append("    validDateTime: ").append(toIndentedString(validDateTime)).append("\n");
    sb.append("    maxPaymentAmount: ").append(toIndentedString(maxPaymentAmount)).append("\n");
    sb.append("    periodicAmounts: ").append(toIndentedString(periodicAmounts)).append("\n");
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

