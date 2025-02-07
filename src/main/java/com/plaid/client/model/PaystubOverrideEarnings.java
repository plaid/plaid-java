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
import com.plaid.client.model.PaystubOverrideEarningsBreakdown;
import com.plaid.client.model.PaystubOverrideEarningsTotal;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * An object representing both a breakdown of earnings on a paystub and the total earnings.
 */
@ApiModel(description = "An object representing both a breakdown of earnings on a paystub and the total earnings.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-07T19:05:33.763924Z[Etc/UTC]")
public class PaystubOverrideEarnings {
  public static final String SERIALIZED_NAME_BREAKDOWN = "breakdown";
  @SerializedName(SERIALIZED_NAME_BREAKDOWN)
  private List<PaystubOverrideEarningsBreakdown> breakdown = null;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private PaystubOverrideEarningsTotal total;


  public PaystubOverrideEarnings breakdown(List<PaystubOverrideEarningsBreakdown> breakdown) {
    
    this.breakdown = breakdown;
    return this;
  }

  public PaystubOverrideEarnings addBreakdownItem(PaystubOverrideEarningsBreakdown breakdownItem) {
    if (this.breakdown == null) {
      this.breakdown = new ArrayList<>();
    }
    this.breakdown.add(breakdownItem);
    return this;
  }

   /**
   * Get breakdown
   * @return breakdown
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<PaystubOverrideEarningsBreakdown> getBreakdown() {
    return breakdown;
  }


  public void setBreakdown(List<PaystubOverrideEarningsBreakdown> breakdown) {
    this.breakdown = breakdown;
  }


  public PaystubOverrideEarnings total(PaystubOverrideEarningsTotal total) {
    
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaystubOverrideEarningsTotal getTotal() {
    return total;
  }


  public void setTotal(PaystubOverrideEarningsTotal total) {
    this.total = total;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaystubOverrideEarnings paystubOverrideEarnings = (PaystubOverrideEarnings) o;
    return Objects.equals(this.breakdown, paystubOverrideEarnings.breakdown) &&
        Objects.equals(this.total, paystubOverrideEarnings.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(breakdown, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaystubOverrideEarnings {\n");
    sb.append("    breakdown: ").append(toIndentedString(breakdown)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

