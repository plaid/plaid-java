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
import com.plaid.client.model.EmploymentSourceType;
import com.plaid.client.model.LinkTokenCreateRequestEmploymentBankIncome;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Specifies options for initializing Link for use with the Employment product. This field is required if &#x60;employment&#x60; is included in the &#x60;products&#x60; array.
 */
@ApiModel(description = "Specifies options for initializing Link for use with the Employment product. This field is required if `employment` is included in the `products` array.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-12T21:24:48.076128Z[Etc/UTC]")
public class LinkTokenCreateRequestEmployment {
  public static final String SERIALIZED_NAME_EMPLOYMENT_SOURCE_TYPES = "employment_source_types";
  @SerializedName(SERIALIZED_NAME_EMPLOYMENT_SOURCE_TYPES)
  private List<EmploymentSourceType> employmentSourceTypes = null;

  public static final String SERIALIZED_NAME_BANK_EMPLOYMENT = "bank_employment";
  @SerializedName(SERIALIZED_NAME_BANK_EMPLOYMENT)
  private LinkTokenCreateRequestEmploymentBankIncome bankEmployment;


  public LinkTokenCreateRequestEmployment employmentSourceTypes(List<EmploymentSourceType> employmentSourceTypes) {
    
    this.employmentSourceTypes = employmentSourceTypes;
    return this;
  }

  public LinkTokenCreateRequestEmployment addEmploymentSourceTypesItem(EmploymentSourceType employmentSourceTypesItem) {
    if (this.employmentSourceTypes == null) {
      this.employmentSourceTypes = new ArrayList<>();
    }
    this.employmentSourceTypes.add(employmentSourceTypesItem);
    return this;
  }

   /**
   * The types of source employment data that users will be permitted to share. Options include &#x60;bank&#x60; and &#x60;payroll&#x60;. Currently you can only specify one of these options.
   * @return employmentSourceTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The types of source employment data that users will be permitted to share. Options include `bank` and `payroll`. Currently you can only specify one of these options.")

  public List<EmploymentSourceType> getEmploymentSourceTypes() {
    return employmentSourceTypes;
  }


  public void setEmploymentSourceTypes(List<EmploymentSourceType> employmentSourceTypes) {
    this.employmentSourceTypes = employmentSourceTypes;
  }


  public LinkTokenCreateRequestEmployment bankEmployment(LinkTokenCreateRequestEmploymentBankIncome bankEmployment) {
    
    this.bankEmployment = bankEmployment;
    return this;
  }

   /**
   * Get bankEmployment
   * @return bankEmployment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LinkTokenCreateRequestEmploymentBankIncome getBankEmployment() {
    return bankEmployment;
  }


  public void setBankEmployment(LinkTokenCreateRequestEmploymentBankIncome bankEmployment) {
    this.bankEmployment = bankEmployment;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkTokenCreateRequestEmployment linkTokenCreateRequestEmployment = (LinkTokenCreateRequestEmployment) o;
    return Objects.equals(this.employmentSourceTypes, linkTokenCreateRequestEmployment.employmentSourceTypes) &&
        Objects.equals(this.bankEmployment, linkTokenCreateRequestEmployment.bankEmployment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employmentSourceTypes, bankEmployment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkTokenCreateRequestEmployment {\n");
    sb.append("    employmentSourceTypes: ").append(toIndentedString(employmentSourceTypes)).append("\n");
    sb.append("    bankEmployment: ").append(toIndentedString(bankEmployment)).append("\n");
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

