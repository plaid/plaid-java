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
import com.plaid.client.model.CreditFreddieMacLoan;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A collection of loans that are part of a single deal.
 */
@ApiModel(description = "A collection of loans that are part of a single deal.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-12T21:24:48.076128Z[Etc/UTC]")
public class CreditFreddieMacLoans {
  public static final String SERIALIZED_NAME_L_O_A_N = "LOAN";
  @SerializedName(SERIALIZED_NAME_L_O_A_N)
  private CreditFreddieMacLoan LOAN;


  public CreditFreddieMacLoans LOAN(CreditFreddieMacLoan LOAN) {
    
    this.LOAN = LOAN;
    return this;
  }

   /**
   * Get LOAN
   * @return LOAN
  **/
  @ApiModelProperty(required = true, value = "")

  public CreditFreddieMacLoan getLOAN() {
    return LOAN;
  }


  public void setLOAN(CreditFreddieMacLoan LOAN) {
    this.LOAN = LOAN;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditFreddieMacLoans creditFreddieMacLoans = (CreditFreddieMacLoans) o;
    return Objects.equals(this.LOAN, creditFreddieMacLoans.LOAN);
  }

  @Override
  public int hashCode() {
    return Objects.hash(LOAN);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditFreddieMacLoans {\n");
    sb.append("    LOAN: ").append(toIndentedString(LOAN)).append("\n");
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

