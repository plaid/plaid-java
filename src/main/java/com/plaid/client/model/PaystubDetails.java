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
import com.plaid.client.model.PaystubPayFrequency;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;

/**
 * An object representing details that can be found on the paystub.
 */
@ApiModel(description = "An object representing details that can be found on the paystub.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-28T19:43:00.996446Z[Etc/UTC]")
public class PaystubDetails {
  public static final String SERIALIZED_NAME_PAY_PERIOD_START_DATE = "pay_period_start_date";
  @SerializedName(SERIALIZED_NAME_PAY_PERIOD_START_DATE)
  private LocalDate payPeriodStartDate;

  public static final String SERIALIZED_NAME_PAY_PERIOD_END_DATE = "pay_period_end_date";
  @SerializedName(SERIALIZED_NAME_PAY_PERIOD_END_DATE)
  private LocalDate payPeriodEndDate;

  public static final String SERIALIZED_NAME_PAY_DATE = "pay_date";
  @SerializedName(SERIALIZED_NAME_PAY_DATE)
  private LocalDate payDate;

  public static final String SERIALIZED_NAME_PAYSTUB_PROVIDER = "paystub_provider";
  @SerializedName(SERIALIZED_NAME_PAYSTUB_PROVIDER)
  private String paystubProvider;

  public static final String SERIALIZED_NAME_PAY_FREQUENCY = "pay_frequency";
  @SerializedName(SERIALIZED_NAME_PAY_FREQUENCY)
  private PaystubPayFrequency payFrequency;


  public PaystubDetails payPeriodStartDate(LocalDate payPeriodStartDate) {
    
    this.payPeriodStartDate = payPeriodStartDate;
    return this;
  }

   /**
   * Beginning date of the pay period on the paystub in the &#39;YYYY-MM-DD&#39; format.
   * @return payPeriodStartDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Beginning date of the pay period on the paystub in the 'YYYY-MM-DD' format.")

  public LocalDate getPayPeriodStartDate() {
    return payPeriodStartDate;
  }


  public void setPayPeriodStartDate(LocalDate payPeriodStartDate) {
    this.payPeriodStartDate = payPeriodStartDate;
  }


  public PaystubDetails payPeriodEndDate(LocalDate payPeriodEndDate) {
    
    this.payPeriodEndDate = payPeriodEndDate;
    return this;
  }

   /**
   * Ending date of the pay period on the paystub in the &#39;YYYY-MM-DD&#39; format.
   * @return payPeriodEndDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Ending date of the pay period on the paystub in the 'YYYY-MM-DD' format.")

  public LocalDate getPayPeriodEndDate() {
    return payPeriodEndDate;
  }


  public void setPayPeriodEndDate(LocalDate payPeriodEndDate) {
    this.payPeriodEndDate = payPeriodEndDate;
  }


  public PaystubDetails payDate(LocalDate payDate) {
    
    this.payDate = payDate;
    return this;
  }

   /**
   * Pay date on the paystub in the &#39;YYYY-MM-DD&#39; format.
   * @return payDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Pay date on the paystub in the 'YYYY-MM-DD' format.")

  public LocalDate getPayDate() {
    return payDate;
  }


  public void setPayDate(LocalDate payDate) {
    this.payDate = payDate;
  }


  public PaystubDetails paystubProvider(String paystubProvider) {
    
    this.paystubProvider = paystubProvider;
    return this;
  }

   /**
   * The name of the payroll provider that generated the paystub, e.g. ADP
   * @return paystubProvider
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the payroll provider that generated the paystub, e.g. ADP")

  public String getPaystubProvider() {
    return paystubProvider;
  }


  public void setPaystubProvider(String paystubProvider) {
    this.paystubProvider = paystubProvider;
  }


  public PaystubDetails payFrequency(PaystubPayFrequency payFrequency) {
    
    this.payFrequency = payFrequency;
    return this;
  }

   /**
   * Get payFrequency
   * @return payFrequency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaystubPayFrequency getPayFrequency() {
    return payFrequency;
  }


  public void setPayFrequency(PaystubPayFrequency payFrequency) {
    this.payFrequency = payFrequency;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaystubDetails paystubDetails = (PaystubDetails) o;
    return Objects.equals(this.payPeriodStartDate, paystubDetails.payPeriodStartDate) &&
        Objects.equals(this.payPeriodEndDate, paystubDetails.payPeriodEndDate) &&
        Objects.equals(this.payDate, paystubDetails.payDate) &&
        Objects.equals(this.paystubProvider, paystubDetails.paystubProvider) &&
        Objects.equals(this.payFrequency, paystubDetails.payFrequency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payPeriodStartDate, payPeriodEndDate, payDate, paystubProvider, payFrequency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaystubDetails {\n");
    sb.append("    payPeriodStartDate: ").append(toIndentedString(payPeriodStartDate)).append("\n");
    sb.append("    payPeriodEndDate: ").append(toIndentedString(payPeriodEndDate)).append("\n");
    sb.append("    payDate: ").append(toIndentedString(payDate)).append("\n");
    sb.append("    paystubProvider: ").append(toIndentedString(paystubProvider)).append("\n");
    sb.append("    payFrequency: ").append(toIndentedString(payFrequency)).append("\n");
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

