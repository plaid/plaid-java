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
import com.plaid.client.model.LoanIdentifierType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The information used to identify this loan by various parties to the transaction or other organizations.
 */
@ApiModel(description = "The information used to identify this loan by various parties to the transaction or other organizations.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-09T17:51:17.896278Z[Etc/UTC]")
public class LoanIdentifier {
  public static final String SERIALIZED_NAME_LOAN_IDENTIFIER = "LoanIdentifier";
  @SerializedName(SERIALIZED_NAME_LOAN_IDENTIFIER)
  private String loanIdentifier;

  public static final String SERIALIZED_NAME_LOAN_IDENTIFIER_TYPE = "LoanIdentifierType";
  @SerializedName(SERIALIZED_NAME_LOAN_IDENTIFIER_TYPE)
  private LoanIdentifierType loanIdentifierType;


  public LoanIdentifier loanIdentifier(String loanIdentifier) {
    
    this.loanIdentifier = loanIdentifier;
    return this;
  }

   /**
   * The value of the identifier for the specified type.
   * @return loanIdentifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The value of the identifier for the specified type.")

  public String getLoanIdentifier() {
    return loanIdentifier;
  }


  public void setLoanIdentifier(String loanIdentifier) {
    this.loanIdentifier = loanIdentifier;
  }


  public LoanIdentifier loanIdentifierType(LoanIdentifierType loanIdentifierType) {
    
    this.loanIdentifierType = loanIdentifierType;
    return this;
  }

   /**
   * Get loanIdentifierType
   * @return loanIdentifierType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public LoanIdentifierType getLoanIdentifierType() {
    return loanIdentifierType;
  }


  public void setLoanIdentifierType(LoanIdentifierType loanIdentifierType) {
    this.loanIdentifierType = loanIdentifierType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoanIdentifier loanIdentifier = (LoanIdentifier) o;
    return Objects.equals(this.loanIdentifier, loanIdentifier.loanIdentifier) &&
        Objects.equals(this.loanIdentifierType, loanIdentifier.loanIdentifierType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loanIdentifier, loanIdentifierType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoanIdentifier {\n");
    sb.append("    loanIdentifier: ").append(toIndentedString(loanIdentifier)).append("\n");
    sb.append("    loanIdentifierType: ").append(toIndentedString(loanIdentifierType)).append("\n");
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

