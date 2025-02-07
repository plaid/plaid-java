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
import com.plaid.client.model.PaystubOverrideDeductionsBreakdown;
import com.plaid.client.model.PaystubOverrideDeductionsTotal;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * An object with the deduction information found on a paystub.
 */
@ApiModel(description = "An object with the deduction information found on a paystub.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-07T19:05:33.763924Z[Etc/UTC]")
public class PaystubOverrideDeductions {
  public static final String SERIALIZED_NAME_BREAKDOWN = "breakdown";
  @SerializedName(SERIALIZED_NAME_BREAKDOWN)
  private List<PaystubOverrideDeductionsBreakdown> breakdown = null;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private PaystubOverrideDeductionsTotal total;


  public PaystubOverrideDeductions breakdown(List<PaystubOverrideDeductionsBreakdown> breakdown) {
    
    this.breakdown = breakdown;
    return this;
  }

  public PaystubOverrideDeductions addBreakdownItem(PaystubOverrideDeductionsBreakdown breakdownItem) {
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

  public List<PaystubOverrideDeductionsBreakdown> getBreakdown() {
    return breakdown;
  }


  public void setBreakdown(List<PaystubOverrideDeductionsBreakdown> breakdown) {
    this.breakdown = breakdown;
  }


  public PaystubOverrideDeductions total(PaystubOverrideDeductionsTotal total) {
    
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaystubOverrideDeductionsTotal getTotal() {
    return total;
  }


  public void setTotal(PaystubOverrideDeductionsTotal total) {
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
    PaystubOverrideDeductions paystubOverrideDeductions = (PaystubOverrideDeductions) o;
    return Objects.equals(this.breakdown, paystubOverrideDeductions.breakdown) &&
        Objects.equals(this.total, paystubOverrideDeductions.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(breakdown, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaystubOverrideDeductions {\n");
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

