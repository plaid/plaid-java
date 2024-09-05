/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.556.0
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
 * An object representing information about the net pay amount on the paystub.
 */
@ApiModel(description = "An object representing information about the net pay amount on the paystub.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-04T20:03:42.500463Z[Etc/UTC]")
public class PaystubOverrideNetPay {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_YTD_AMOUNT = "ytd_amount";
  @SerializedName(SERIALIZED_NAME_YTD_AMOUNT)
  private Double ytdAmount;


  public PaystubOverrideNetPay description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description of the net pay
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Description of the net pay")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public PaystubOverrideNetPay currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * The ISO-4217 currency code of the net pay.
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ISO-4217 currency code of the net pay.")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public PaystubOverrideNetPay ytdAmount(Double ytdAmount) {
    
    this.ytdAmount = ytdAmount;
    return this;
  }

   /**
   * The year-to-date amount of the net pay
   * @return ytdAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The year-to-date amount of the net pay")

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
    PaystubOverrideNetPay paystubOverrideNetPay = (PaystubOverrideNetPay) o;
    return Objects.equals(this.description, paystubOverrideNetPay.description) &&
        Objects.equals(this.currency, paystubOverrideNetPay.currency) &&
        Objects.equals(this.ytdAmount, paystubOverrideNetPay.ytdAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, currency, ytdAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaystubOverrideNetPay {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

