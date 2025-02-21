/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.620.0
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

/**
 * A statement&#39;s metadata associated with an account
 */
@ApiModel(description = "A statement's metadata associated with an account")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-21T16:44:11.345889Z[Etc/UTC]")
public class StatementsStatement {
  public static final String SERIALIZED_NAME_STATEMENT_ID = "statement_id";
  @SerializedName(SERIALIZED_NAME_STATEMENT_ID)
  private String statementId;

  public static final String SERIALIZED_NAME_MONTH = "month";
  @SerializedName(SERIALIZED_NAME_MONTH)
  private Integer month;

  public static final String SERIALIZED_NAME_YEAR = "year";
  @SerializedName(SERIALIZED_NAME_YEAR)
  private Integer year;


  public StatementsStatement statementId(String statementId) {
    
    this.statementId = statementId;
    return this;
  }

   /**
   * Plaid&#39;s unique identifier for the statement.
   * @return statementId
  **/
  @ApiModelProperty(required = true, value = "Plaid's unique identifier for the statement.")

  public String getStatementId() {
    return statementId;
  }


  public void setStatementId(String statementId) {
    this.statementId = statementId;
  }


  public StatementsStatement month(Integer month) {
    
    this.month = month;
    return this;
  }

   /**
   * Month of the year. Possible values: 1 through 12 (January through December).
   * @return month
  **/
  @ApiModelProperty(required = true, value = "Month of the year. Possible values: 1 through 12 (January through December).")

  public Integer getMonth() {
    return month;
  }


  public void setMonth(Integer month) {
    this.month = month;
  }


  public StatementsStatement year(Integer year) {
    
    this.year = year;
    return this;
  }

   /**
   * The year of statement.
   * minimum: 2010
   * @return year
  **/
  @ApiModelProperty(required = true, value = "The year of statement.")

  public Integer getYear() {
    return year;
  }


  public void setYear(Integer year) {
    this.year = year;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatementsStatement statementsStatement = (StatementsStatement) o;
    return Objects.equals(this.statementId, statementsStatement.statementId) &&
        Objects.equals(this.month, statementsStatement.month) &&
        Objects.equals(this.year, statementsStatement.year);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statementId, month, year);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatementsStatement {\n");
    sb.append("    statementId: ").append(toIndentedString(statementId)).append("\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
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

