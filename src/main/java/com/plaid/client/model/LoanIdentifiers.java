/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.610.1
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
import com.plaid.client.model.LoanIdentifier;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Collection of current and previous identifiers for this loan.
 */
@ApiModel(description = "Collection of current and previous identifiers for this loan.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-23T20:55:58.809242Z[Etc/UTC]")
public class LoanIdentifiers {
  public static final String SERIALIZED_NAME_L_O_A_N_I_D_E_N_T_I_F_I_E_R = "LOAN_IDENTIFIER";
  @SerializedName(SERIALIZED_NAME_L_O_A_N_I_D_E_N_T_I_F_I_E_R)
  private LoanIdentifier LOAN_IDENTIFIER;


  public LoanIdentifiers LOAN_IDENTIFIER(LoanIdentifier LOAN_IDENTIFIER) {
    
    this.LOAN_IDENTIFIER = LOAN_IDENTIFIER;
    return this;
  }

   /**
   * Get LOAN_IDENTIFIER
   * @return LOAN_IDENTIFIER
  **/
  @ApiModelProperty(required = true, value = "")

  public LoanIdentifier getLOANIDENTIFIER() {
    return LOAN_IDENTIFIER;
  }


  public void setLOANIDENTIFIER(LoanIdentifier LOAN_IDENTIFIER) {
    this.LOAN_IDENTIFIER = LOAN_IDENTIFIER;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoanIdentifiers loanIdentifiers = (LoanIdentifiers) o;
    return Objects.equals(this.LOAN_IDENTIFIER, loanIdentifiers.LOAN_IDENTIFIER);
  }

  @Override
  public int hashCode() {
    return Objects.hash(LOAN_IDENTIFIER);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoanIdentifiers {\n");
    sb.append("    LOAN_IDENTIFIER: ").append(toIndentedString(LOAN_IDENTIFIER)).append("\n");
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

