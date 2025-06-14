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

/**
 * The amount of income earned year to date, as based on paystub data.
 */
@ApiModel(description = "The amount of income earned year to date, as based on paystub data.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-12T21:24:48.076128Z[Etc/UTC]")
public class PaystubYTDDetails {
  public static final String SERIALIZED_NAME_GROSS_EARNINGS = "gross_earnings";
  @SerializedName(SERIALIZED_NAME_GROSS_EARNINGS)
  private Double grossEarnings;

  public static final String SERIALIZED_NAME_NET_EARNINGS = "net_earnings";
  @SerializedName(SERIALIZED_NAME_NET_EARNINGS)
  private Double netEarnings;


  public PaystubYTDDetails grossEarnings(Double grossEarnings) {
    
    this.grossEarnings = grossEarnings;
    return this;
  }

   /**
   * Year-to-date gross earnings.
   * @return grossEarnings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Year-to-date gross earnings.")

  public Double getGrossEarnings() {
    return grossEarnings;
  }


  public void setGrossEarnings(Double grossEarnings) {
    this.grossEarnings = grossEarnings;
  }


  public PaystubYTDDetails netEarnings(Double netEarnings) {
    
    this.netEarnings = netEarnings;
    return this;
  }

   /**
   * Year-to-date net (take home) earnings.
   * @return netEarnings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Year-to-date net (take home) earnings.")

  public Double getNetEarnings() {
    return netEarnings;
  }


  public void setNetEarnings(Double netEarnings) {
    this.netEarnings = netEarnings;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaystubYTDDetails paystubYTDDetails = (PaystubYTDDetails) o;
    return Objects.equals(this.grossEarnings, paystubYTDDetails.grossEarnings) &&
        Objects.equals(this.netEarnings, paystubYTDDetails.netEarnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(grossEarnings, netEarnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaystubYTDDetails {\n");
    sb.append("    grossEarnings: ").append(toIndentedString(grossEarnings)).append("\n");
    sb.append("    netEarnings: ").append(toIndentedString(netEarnings)).append("\n");
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

