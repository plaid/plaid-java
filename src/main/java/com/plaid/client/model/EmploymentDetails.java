/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.508.0
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
import com.plaid.client.model.Pay;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;

/**
 * An object representing employment details found on a paystub.
 */
@ApiModel(description = "An object representing employment details found on a paystub.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-17T19:36:14.619905Z[Etc/UTC]")
public class EmploymentDetails {
  public static final String SERIALIZED_NAME_ANNUAL_SALARY = "annual_salary";
  @SerializedName(SERIALIZED_NAME_ANNUAL_SALARY)
  private Pay annualSalary;

  public static final String SERIALIZED_NAME_HIRE_DATE = "hire_date";
  @SerializedName(SERIALIZED_NAME_HIRE_DATE)
  private LocalDate hireDate;


  public EmploymentDetails annualSalary(Pay annualSalary) {
    
    this.annualSalary = annualSalary;
    return this;
  }

   /**
   * Get annualSalary
   * @return annualSalary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Pay getAnnualSalary() {
    return annualSalary;
  }


  public void setAnnualSalary(Pay annualSalary) {
    this.annualSalary = annualSalary;
  }


  public EmploymentDetails hireDate(LocalDate hireDate) {
    
    this.hireDate = hireDate;
    return this;
  }

   /**
   * Date on which the employee was hired, in the YYYY-MM-DD format.
   * @return hireDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date on which the employee was hired, in the YYYY-MM-DD format.")

  public LocalDate getHireDate() {
    return hireDate;
  }


  public void setHireDate(LocalDate hireDate) {
    this.hireDate = hireDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmploymentDetails employmentDetails = (EmploymentDetails) o;
    return Objects.equals(this.annualSalary, employmentDetails.annualSalary) &&
        Objects.equals(this.hireDate, employmentDetails.hireDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(annualSalary, hireDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmploymentDetails {\n");
    sb.append("    annualSalary: ").append(toIndentedString(annualSalary)).append("\n");
    sb.append("    hireDate: ").append(toIndentedString(hireDate)).append("\n");
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

