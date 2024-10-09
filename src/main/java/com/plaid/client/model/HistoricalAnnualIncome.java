/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.575.0
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
 * An object representing the historical annual income amount.
 */
@ApiModel(description = "An object representing the historical annual income amount.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-09T17:51:17.896278Z[Etc/UTC]")
public class HistoricalAnnualIncome {
  public static final String SERIALIZED_NAME_BASELINE_AMOUNT = "baseline_amount";
  @SerializedName(SERIALIZED_NAME_BASELINE_AMOUNT)
  private Double baselineAmount;

  public static final String SERIALIZED_NAME_CURRENT_AMOUNT = "current_amount";
  @SerializedName(SERIALIZED_NAME_CURRENT_AMOUNT)
  private Double currentAmount;


  public HistoricalAnnualIncome baselineAmount(Double baselineAmount) {
    
    this.baselineAmount = baselineAmount;
    return this;
  }

   /**
   * The historical annual income at the time of subscription
   * @return baselineAmount
  **/
  @ApiModelProperty(required = true, value = "The historical annual income at the time of subscription")

  public Double getBaselineAmount() {
    return baselineAmount;
  }


  public void setBaselineAmount(Double baselineAmount) {
    this.baselineAmount = baselineAmount;
  }


  public HistoricalAnnualIncome currentAmount(Double currentAmount) {
    
    this.currentAmount = currentAmount;
    return this;
  }

   /**
   * The current historical annual income
   * @return currentAmount
  **/
  @ApiModelProperty(required = true, value = "The current historical annual income")

  public Double getCurrentAmount() {
    return currentAmount;
  }


  public void setCurrentAmount(Double currentAmount) {
    this.currentAmount = currentAmount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoricalAnnualIncome historicalAnnualIncome = (HistoricalAnnualIncome) o;
    return Objects.equals(this.baselineAmount, historicalAnnualIncome.baselineAmount) &&
        Objects.equals(this.currentAmount, historicalAnnualIncome.currentAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baselineAmount, currentAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricalAnnualIncome {\n");
    sb.append("    baselineAmount: ").append(toIndentedString(baselineAmount)).append("\n");
    sb.append("    currentAmount: ").append(toIndentedString(currentAmount)).append("\n");
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

