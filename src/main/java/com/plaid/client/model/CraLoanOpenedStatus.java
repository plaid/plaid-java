/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.586.4
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
import com.plaid.client.model.CraLoanStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;

/**
 * Contains the status and date information of the loan when registering.
 */
@ApiModel(description = "Contains the status and date information of the loan when registering.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-14T16:41:31.650700Z[Etc/UTC]")
public class CraLoanOpenedStatus {
  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private CraLoanStatus status;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private LocalDate date;


  public CraLoanOpenedStatus status(CraLoanStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")

  public CraLoanStatus getStatus() {
    return status;
  }


  public void setStatus(CraLoanStatus status) {
    this.status = status;
  }


  public CraLoanOpenedStatus date(LocalDate date) {
    
    this.date = date;
    return this;
  }

   /**
   * The effective date for the status of the loan. The date should be in ISO 8601 format (YYYY-MM-DD).
   * @return date
  **/
  @ApiModelProperty(required = true, value = "The effective date for the status of the loan. The date should be in ISO 8601 format (YYYY-MM-DD).")

  public LocalDate getDate() {
    return date;
  }


  public void setDate(LocalDate date) {
    this.date = date;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CraLoanOpenedStatus craLoanOpenedStatus = (CraLoanOpenedStatus) o;
    return Objects.equals(this.status, craLoanOpenedStatus.status) &&
        Objects.equals(this.date, craLoanOpenedStatus.date);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, date);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CraLoanOpenedStatus {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
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

