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
import java.math.BigDecimal;

/**
 * An object representing both the current pay period and year to date amount for an earning category.
 */
@ApiModel(description = "An object representing both the current pay period and year to date amount for an earning category.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-12T21:24:48.076128Z[Etc/UTC]")
public class PaystubOverrideEarningsTotal {
  public static final String SERIALIZED_NAME_HOURS = "hours";
  @SerializedName(SERIALIZED_NAME_HOURS)
  private Double hours;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_YTD_AMOUNT = "ytd_amount";
  @SerializedName(SERIALIZED_NAME_YTD_AMOUNT)
  private Double ytdAmount;


  public PaystubOverrideEarningsTotal hours(Double hours) {
    
    this.hours = hours;
    return this;
  }

   /**
   * Total number of hours worked for this pay period
   * @return hours
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total number of hours worked for this pay period")

  public Double getHours() {
    return hours;
  }


  public void setHours(Double hours) {
    this.hours = hours;
  }


  public PaystubOverrideEarningsTotal currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * The ISO-4217 currency code of the line item
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ISO-4217 currency code of the line item")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public PaystubOverrideEarningsTotal ytdAmount(Double ytdAmount) {
    
    this.ytdAmount = ytdAmount;
    return this;
  }

   /**
   * The year-to-date amount for the total earnings
   * @return ytdAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The year-to-date amount for the total earnings")

  public Double getYtdAmount() {
    return ytdAmount;
  }


  public void setYtdAmount(Double ytdAmount) {
    this.ytdAmount = ytdAmount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaystubOverrideEarningsTotal paystubOverrideEarningsTotal = (PaystubOverrideEarningsTotal) o;
    return Objects.equals(this.hours, paystubOverrideEarningsTotal.hours) &&
        Objects.equals(this.currency, paystubOverrideEarningsTotal.currency) &&
        Objects.equals(this.ytdAmount, paystubOverrideEarningsTotal.ytdAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hours, currency, ytdAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaystubOverrideEarningsTotal {\n");
    sb.append("    hours: ").append(toIndentedString(hours)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    ytdAmount: ").append(toIndentedString(ytdAmount)).append("\n");
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

