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

/**
 * Details about the number of income sources
 */
@ApiModel(description = "Details about the number of income sources")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-07T19:05:33.763924Z[Etc/UTC]")
public class IncomeSourcesCounts {
  public static final String SERIALIZED_NAME_BASELINE_COUNT = "baseline_count";
  @SerializedName(SERIALIZED_NAME_BASELINE_COUNT)
  private Double baselineCount;

  public static final String SERIALIZED_NAME_CURRENT_COUNT = "current_count";
  @SerializedName(SERIALIZED_NAME_CURRENT_COUNT)
  private Double currentCount;


  public IncomeSourcesCounts baselineCount(Double baselineCount) {
    
    this.baselineCount = baselineCount;
    return this;
  }

   /**
   * The number of income sources detected at the subscription date
   * @return baselineCount
  **/
  @ApiModelProperty(required = true, value = "The number of income sources detected at the subscription date")

  public Double getBaselineCount() {
    return baselineCount;
  }


  public void setBaselineCount(Double baselineCount) {
    this.baselineCount = baselineCount;
  }


  public IncomeSourcesCounts currentCount(Double currentCount) {
    
    this.currentCount = currentCount;
    return this;
  }

   /**
   * The number of income sources currently detected
   * @return currentCount
  **/
  @ApiModelProperty(required = true, value = "The number of income sources currently detected")

  public Double getCurrentCount() {
    return currentCount;
  }


  public void setCurrentCount(Double currentCount) {
    this.currentCount = currentCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncomeSourcesCounts incomeSourcesCounts = (IncomeSourcesCounts) o;
    return Objects.equals(this.baselineCount, incomeSourcesCounts.baselineCount) &&
        Objects.equals(this.currentCount, incomeSourcesCounts.currentCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baselineCount, currentCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncomeSourcesCounts {\n");
    sb.append("    baselineCount: ").append(toIndentedString(baselineCount)).append("\n");
    sb.append("    currentCount: ").append(toIndentedString(currentCount)).append("\n");
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

