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
 * Defines the response schema for &#x60;/transfer/metrics/get&#x60;
 */
@ApiModel(description = "Defines the response schema for `/transfer/metrics/get`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-17T19:36:14.619905Z[Etc/UTC]")
public class TransferMetricsGetResponse {
  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;

  public static final String SERIALIZED_NAME_DAILY_DEBIT_TRANSFER_VOLUME = "daily_debit_transfer_volume";
  @SerializedName(SERIALIZED_NAME_DAILY_DEBIT_TRANSFER_VOLUME)
  private String dailyDebitTransferVolume;

  public static final String SERIALIZED_NAME_DAILY_CREDIT_TRANSFER_VOLUME = "daily_credit_transfer_volume";
  @SerializedName(SERIALIZED_NAME_DAILY_CREDIT_TRANSFER_VOLUME)
  private String dailyCreditTransferVolume;

  public static final String SERIALIZED_NAME_MONTHLY_TRANSFER_VOLUME = "monthly_transfer_volume";
  @SerializedName(SERIALIZED_NAME_MONTHLY_TRANSFER_VOLUME)
  private String monthlyTransferVolume;

  public static final String SERIALIZED_NAME_MONTHLY_DEBIT_TRANSFER_VOLUME = "monthly_debit_transfer_volume";
  @SerializedName(SERIALIZED_NAME_MONTHLY_DEBIT_TRANSFER_VOLUME)
  private String monthlyDebitTransferVolume;

  public static final String SERIALIZED_NAME_MONTHLY_CREDIT_TRANSFER_VOLUME = "monthly_credit_transfer_volume";
  @SerializedName(SERIALIZED_NAME_MONTHLY_CREDIT_TRANSFER_VOLUME)
  private String monthlyCreditTransferVolume;

  public static final String SERIALIZED_NAME_ISO_CURRENCY_CODE = "iso_currency_code";
  @SerializedName(SERIALIZED_NAME_ISO_CURRENCY_CODE)
  private String isoCurrencyCode;


  public TransferMetricsGetResponse requestId(String requestId) {
    
    this.requestId = requestId;
    return this;
  }

   /**
   * A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive.
   * @return requestId
  **/
  @ApiModelProperty(required = true, value = "A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive.")

  public String getRequestId() {
    return requestId;
  }


  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  public TransferMetricsGetResponse dailyDebitTransferVolume(String dailyDebitTransferVolume) {
    
    this.dailyDebitTransferVolume = dailyDebitTransferVolume;
    return this;
  }

   /**
   * Sum of dollar amount of debit transfers in last 24 hours (decimal string with two digits of precision e.g. \&quot;10.00\&quot;).
   * @return dailyDebitTransferVolume
  **/
  @ApiModelProperty(required = true, value = "Sum of dollar amount of debit transfers in last 24 hours (decimal string with two digits of precision e.g. \"10.00\").")

  public String getDailyDebitTransferVolume() {
    return dailyDebitTransferVolume;
  }


  public void setDailyDebitTransferVolume(String dailyDebitTransferVolume) {
    this.dailyDebitTransferVolume = dailyDebitTransferVolume;
  }


  public TransferMetricsGetResponse dailyCreditTransferVolume(String dailyCreditTransferVolume) {
    
    this.dailyCreditTransferVolume = dailyCreditTransferVolume;
    return this;
  }

   /**
   * Sum of dollar amount of credit transfers in last 24 hours (decimal string with two digits of precision e.g. \&quot;10.00\&quot;).
   * @return dailyCreditTransferVolume
  **/
  @ApiModelProperty(required = true, value = "Sum of dollar amount of credit transfers in last 24 hours (decimal string with two digits of precision e.g. \"10.00\").")

  public String getDailyCreditTransferVolume() {
    return dailyCreditTransferVolume;
  }


  public void setDailyCreditTransferVolume(String dailyCreditTransferVolume) {
    this.dailyCreditTransferVolume = dailyCreditTransferVolume;
  }


  public TransferMetricsGetResponse monthlyTransferVolume(String monthlyTransferVolume) {
    
    this.monthlyTransferVolume = monthlyTransferVolume;
    return this;
  }

   /**
   * Sum of dollar amount of credit and debit transfers in current calendar month (decimal string with two digits of precision e.g. \&quot;10.00\&quot;).
   * @return monthlyTransferVolume
  **/
  @ApiModelProperty(required = true, value = "Sum of dollar amount of credit and debit transfers in current calendar month (decimal string with two digits of precision e.g. \"10.00\").")

  public String getMonthlyTransferVolume() {
    return monthlyTransferVolume;
  }


  public void setMonthlyTransferVolume(String monthlyTransferVolume) {
    this.monthlyTransferVolume = monthlyTransferVolume;
  }


  public TransferMetricsGetResponse monthlyDebitTransferVolume(String monthlyDebitTransferVolume) {
    
    this.monthlyDebitTransferVolume = monthlyDebitTransferVolume;
    return this;
  }

   /**
   * Sum of dollar amount of debit transfers in current calendar month (decimal string with two digits of precision e.g. \&quot;10.00\&quot;).
   * @return monthlyDebitTransferVolume
  **/
  @ApiModelProperty(required = true, value = "Sum of dollar amount of debit transfers in current calendar month (decimal string with two digits of precision e.g. \"10.00\").")

  public String getMonthlyDebitTransferVolume() {
    return monthlyDebitTransferVolume;
  }


  public void setMonthlyDebitTransferVolume(String monthlyDebitTransferVolume) {
    this.monthlyDebitTransferVolume = monthlyDebitTransferVolume;
  }


  public TransferMetricsGetResponse monthlyCreditTransferVolume(String monthlyCreditTransferVolume) {
    
    this.monthlyCreditTransferVolume = monthlyCreditTransferVolume;
    return this;
  }

   /**
   * Sum of dollar amount of credit transfers in current calendar month (decimal string with two digits of precision e.g. \&quot;10.00\&quot;).
   * @return monthlyCreditTransferVolume
  **/
  @ApiModelProperty(required = true, value = "Sum of dollar amount of credit transfers in current calendar month (decimal string with two digits of precision e.g. \"10.00\").")

  public String getMonthlyCreditTransferVolume() {
    return monthlyCreditTransferVolume;
  }


  public void setMonthlyCreditTransferVolume(String monthlyCreditTransferVolume) {
    this.monthlyCreditTransferVolume = monthlyCreditTransferVolume;
  }


  public TransferMetricsGetResponse isoCurrencyCode(String isoCurrencyCode) {
    
    this.isoCurrencyCode = isoCurrencyCode;
    return this;
  }

   /**
   * The currency of the dollar amount, e.g. \&quot;USD\&quot;.
   * @return isoCurrencyCode
  **/
  @ApiModelProperty(required = true, value = "The currency of the dollar amount, e.g. \"USD\".")

  public String getIsoCurrencyCode() {
    return isoCurrencyCode;
  }


  public void setIsoCurrencyCode(String isoCurrencyCode) {
    this.isoCurrencyCode = isoCurrencyCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferMetricsGetResponse transferMetricsGetResponse = (TransferMetricsGetResponse) o;
    return Objects.equals(this.requestId, transferMetricsGetResponse.requestId) &&
        Objects.equals(this.dailyDebitTransferVolume, transferMetricsGetResponse.dailyDebitTransferVolume) &&
        Objects.equals(this.dailyCreditTransferVolume, transferMetricsGetResponse.dailyCreditTransferVolume) &&
        Objects.equals(this.monthlyTransferVolume, transferMetricsGetResponse.monthlyTransferVolume) &&
        Objects.equals(this.monthlyDebitTransferVolume, transferMetricsGetResponse.monthlyDebitTransferVolume) &&
        Objects.equals(this.monthlyCreditTransferVolume, transferMetricsGetResponse.monthlyCreditTransferVolume) &&
        Objects.equals(this.isoCurrencyCode, transferMetricsGetResponse.isoCurrencyCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, dailyDebitTransferVolume, dailyCreditTransferVolume, monthlyTransferVolume, monthlyDebitTransferVolume, monthlyCreditTransferVolume, isoCurrencyCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferMetricsGetResponse {\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    dailyDebitTransferVolume: ").append(toIndentedString(dailyDebitTransferVolume)).append("\n");
    sb.append("    dailyCreditTransferVolume: ").append(toIndentedString(dailyCreditTransferVolume)).append("\n");
    sb.append("    monthlyTransferVolume: ").append(toIndentedString(monthlyTransferVolume)).append("\n");
    sb.append("    monthlyDebitTransferVolume: ").append(toIndentedString(monthlyDebitTransferVolume)).append("\n");
    sb.append("    monthlyCreditTransferVolume: ").append(toIndentedString(monthlyCreditTransferVolume)).append("\n");
    sb.append("    isoCurrencyCode: ").append(toIndentedString(isoCurrencyCode)).append("\n");
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

