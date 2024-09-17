/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.565.0
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
import com.plaid.client.model.EarningsBreakdownCanonicalDescription;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * An object representing the earnings line items for the pay period.
 */
@ApiModel(description = "An object representing the earnings line items for the pay period.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-17T16:42:02.150702Z[Etc/UTC]")
public class PaystubOverrideEarningsBreakdown {
  public static final String SERIALIZED_NAME_CANONICAL_DESCRIPTION = "canonical_description";
  @SerializedName(SERIALIZED_NAME_CANONICAL_DESCRIPTION)
  private EarningsBreakdownCanonicalDescription canonicalDescription;

  public static final String SERIALIZED_NAME_CURRENT_AMOUNT = "current_amount";
  @SerializedName(SERIALIZED_NAME_CURRENT_AMOUNT)
  private Double currentAmount;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_HOURS = "hours";
  @SerializedName(SERIALIZED_NAME_HOURS)
  private Double hours;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_RATE = "rate";
  @SerializedName(SERIALIZED_NAME_RATE)
  private Double rate;

  public static final String SERIALIZED_NAME_YTD_AMOUNT = "ytd_amount";
  @SerializedName(SERIALIZED_NAME_YTD_AMOUNT)
  private Double ytdAmount;


  public PaystubOverrideEarningsBreakdown canonicalDescription(EarningsBreakdownCanonicalDescription canonicalDescription) {
    
    this.canonicalDescription = canonicalDescription;
    return this;
  }

   /**
   * Get canonicalDescription
   * @return canonicalDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EarningsBreakdownCanonicalDescription getCanonicalDescription() {
    return canonicalDescription;
  }


  public void setCanonicalDescription(EarningsBreakdownCanonicalDescription canonicalDescription) {
    this.canonicalDescription = canonicalDescription;
  }


  public PaystubOverrideEarningsBreakdown currentAmount(Double currentAmount) {
    
    this.currentAmount = currentAmount;
    return this;
  }

   /**
   * Raw amount of the earning line item.
   * @return currentAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Raw amount of the earning line item.")

  public Double getCurrentAmount() {
    return currentAmount;
  }


  public void setCurrentAmount(Double currentAmount) {
    this.currentAmount = currentAmount;
  }


  public PaystubOverrideEarningsBreakdown description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description of the earning line item.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Description of the earning line item.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public PaystubOverrideEarningsBreakdown hours(Double hours) {
    
    this.hours = hours;
    return this;
  }

   /**
   * Number of hours applicable for this earning.
   * @return hours
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of hours applicable for this earning.")

  public Double getHours() {
    return hours;
  }


  public void setHours(Double hours) {
    this.hours = hours;
  }


  public PaystubOverrideEarningsBreakdown currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * The ISO-4217 currency code of the line item.
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ISO-4217 currency code of the line item.")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public PaystubOverrideEarningsBreakdown rate(Double rate) {
    
    this.rate = rate;
    return this;
  }

   /**
   * Hourly rate applicable for this earning.
   * @return rate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Hourly rate applicable for this earning.")

  public Double getRate() {
    return rate;
  }


  public void setRate(Double rate) {
    this.rate = rate;
  }


  public PaystubOverrideEarningsBreakdown ytdAmount(Double ytdAmount) {
    
    this.ytdAmount = ytdAmount;
    return this;
  }

   /**
   * The year-to-date amount of the deduction.
   * @return ytdAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The year-to-date amount of the deduction.")

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
    PaystubOverrideEarningsBreakdown paystubOverrideEarningsBreakdown = (PaystubOverrideEarningsBreakdown) o;
    return Objects.equals(this.canonicalDescription, paystubOverrideEarningsBreakdown.canonicalDescription) &&
        Objects.equals(this.currentAmount, paystubOverrideEarningsBreakdown.currentAmount) &&
        Objects.equals(this.description, paystubOverrideEarningsBreakdown.description) &&
        Objects.equals(this.hours, paystubOverrideEarningsBreakdown.hours) &&
        Objects.equals(this.currency, paystubOverrideEarningsBreakdown.currency) &&
        Objects.equals(this.rate, paystubOverrideEarningsBreakdown.rate) &&
        Objects.equals(this.ytdAmount, paystubOverrideEarningsBreakdown.ytdAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canonicalDescription, currentAmount, description, hours, currency, rate, ytdAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaystubOverrideEarningsBreakdown {\n");
    sb.append("    canonicalDescription: ").append(toIndentedString(canonicalDescription)).append("\n");
    sb.append("    currentAmount: ").append(toIndentedString(currentAmount)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    hours: ").append(toIndentedString(hours)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
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

