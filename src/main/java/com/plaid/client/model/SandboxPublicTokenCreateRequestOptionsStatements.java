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
import java.time.LocalDate;

/**
 * An optional set of parameters corresponding to statements options.
 */
@ApiModel(description = "An optional set of parameters corresponding to statements options.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-09T17:51:17.896278Z[Etc/UTC]")
public class SandboxPublicTokenCreateRequestOptionsStatements {
  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private LocalDate startDate;

  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private LocalDate endDate;


  public SandboxPublicTokenCreateRequestOptionsStatements startDate(LocalDate startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * The earliest date for which to fetch statements history. Dates should be formatted as YYYY-MM-DD.
   * @return startDate
  **/
  @ApiModelProperty(required = true, value = "The earliest date for which to fetch statements history. Dates should be formatted as YYYY-MM-DD.")

  public LocalDate getStartDate() {
    return startDate;
  }


  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }


  public SandboxPublicTokenCreateRequestOptionsStatements endDate(LocalDate endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * The most recent date for which to fetch statements history. Dates should be formatted as YYYY-MM-DD.
   * @return endDate
  **/
  @ApiModelProperty(required = true, value = "The most recent date for which to fetch statements history. Dates should be formatted as YYYY-MM-DD.")

  public LocalDate getEndDate() {
    return endDate;
  }


  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SandboxPublicTokenCreateRequestOptionsStatements sandboxPublicTokenCreateRequestOptionsStatements = (SandboxPublicTokenCreateRequestOptionsStatements) o;
    return Objects.equals(this.startDate, sandboxPublicTokenCreateRequestOptionsStatements.startDate) &&
        Objects.equals(this.endDate, sandboxPublicTokenCreateRequestOptionsStatements.endDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SandboxPublicTokenCreateRequestOptionsStatements {\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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

