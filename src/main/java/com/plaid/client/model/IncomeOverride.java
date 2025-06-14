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
import com.plaid.client.model.PaystubOverride;
import com.plaid.client.model.W2Override;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Specify payroll data on the account.
 */
@ApiModel(description = "Specify payroll data on the account.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-12T21:24:48.076128Z[Etc/UTC]")
public class IncomeOverride {
  public static final String SERIALIZED_NAME_PAYSTUBS = "paystubs";
  @SerializedName(SERIALIZED_NAME_PAYSTUBS)
  private List<PaystubOverride> paystubs = null;

  public static final String SERIALIZED_NAME_W2S = "w2s";
  @SerializedName(SERIALIZED_NAME_W2S)
  private List<W2Override> w2s = null;


  public IncomeOverride paystubs(List<PaystubOverride> paystubs) {
    
    this.paystubs = paystubs;
    return this;
  }

  public IncomeOverride addPaystubsItem(PaystubOverride paystubsItem) {
    if (this.paystubs == null) {
      this.paystubs = new ArrayList<>();
    }
    this.paystubs.add(paystubsItem);
    return this;
  }

   /**
   * A list of paystubs associated with the account.
   * @return paystubs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of paystubs associated with the account.")

  public List<PaystubOverride> getPaystubs() {
    return paystubs;
  }


  public void setPaystubs(List<PaystubOverride> paystubs) {
    this.paystubs = paystubs;
  }


  public IncomeOverride w2s(List<W2Override> w2s) {
    
    this.w2s = w2s;
    return this;
  }

  public IncomeOverride addW2sItem(W2Override w2sItem) {
    if (this.w2s == null) {
      this.w2s = new ArrayList<>();
    }
    this.w2s.add(w2sItem);
    return this;
  }

   /**
   * A list of w2s associated with the account.
   * @return w2s
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of w2s associated with the account.")

  public List<W2Override> getW2s() {
    return w2s;
  }


  public void setW2s(List<W2Override> w2s) {
    this.w2s = w2s;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncomeOverride incomeOverride = (IncomeOverride) o;
    return Objects.equals(this.paystubs, incomeOverride.paystubs) &&
        Objects.equals(this.w2s, incomeOverride.w2s);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paystubs, w2s);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncomeOverride {\n");
    sb.append("    paystubs: ").append(toIndentedString(paystubs)).append("\n");
    sb.append("    w2s: ").append(toIndentedString(w2s)).append("\n");
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

