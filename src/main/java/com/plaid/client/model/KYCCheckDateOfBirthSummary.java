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
import com.plaid.client.model.HiddenMatchSummaryCode;
import com.plaid.client.model.MatchSummaryCode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Result summary object specifying how the &#x60;date_of_birth&#x60; field matched.
 */
@ApiModel(description = "Result summary object specifying how the `date_of_birth` field matched.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-23T18:11:57.813484Z[Etc/UTC]")
public class KYCCheckDateOfBirthSummary {
  public static final String SERIALIZED_NAME_SUMMARY = "summary";
  @SerializedName(SERIALIZED_NAME_SUMMARY)
  private MatchSummaryCode summary;

  public static final String SERIALIZED_NAME_DAY = "day";
  @SerializedName(SERIALIZED_NAME_DAY)
  private HiddenMatchSummaryCode day;

  public static final String SERIALIZED_NAME_MONTH = "month";
  @SerializedName(SERIALIZED_NAME_MONTH)
  private HiddenMatchSummaryCode month;

  public static final String SERIALIZED_NAME_YEAR = "year";
  @SerializedName(SERIALIZED_NAME_YEAR)
  private HiddenMatchSummaryCode year;


  public KYCCheckDateOfBirthSummary summary(MatchSummaryCode summary) {
    
    this.summary = summary;
    return this;
  }

   /**
   * Get summary
   * @return summary
  **/
  @ApiModelProperty(required = true, value = "")

  public MatchSummaryCode getSummary() {
    return summary;
  }


  public void setSummary(MatchSummaryCode summary) {
    this.summary = summary;
  }


  public KYCCheckDateOfBirthSummary day(HiddenMatchSummaryCode day) {
    
    this.day = day;
    return this;
  }

   /**
   * Get day
   * @return day
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HiddenMatchSummaryCode getDay() {
    return day;
  }


  public void setDay(HiddenMatchSummaryCode day) {
    this.day = day;
  }


  public KYCCheckDateOfBirthSummary month(HiddenMatchSummaryCode month) {
    
    this.month = month;
    return this;
  }

   /**
   * Get month
   * @return month
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HiddenMatchSummaryCode getMonth() {
    return month;
  }


  public void setMonth(HiddenMatchSummaryCode month) {
    this.month = month;
  }


  public KYCCheckDateOfBirthSummary year(HiddenMatchSummaryCode year) {
    
    this.year = year;
    return this;
  }

   /**
   * Get year
   * @return year
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HiddenMatchSummaryCode getYear() {
    return year;
  }


  public void setYear(HiddenMatchSummaryCode year) {
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
    KYCCheckDateOfBirthSummary kyCCheckDateOfBirthSummary = (KYCCheckDateOfBirthSummary) o;
    return Objects.equals(this.summary, kyCCheckDateOfBirthSummary.summary) &&
        Objects.equals(this.day, kyCCheckDateOfBirthSummary.day) &&
        Objects.equals(this.month, kyCCheckDateOfBirthSummary.month) &&
        Objects.equals(this.year, kyCCheckDateOfBirthSummary.year);
  }

  @Override
  public int hashCode() {
    return Objects.hash(summary, day, month, year);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KYCCheckDateOfBirthSummary {\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    day: ").append(toIndentedString(day)).append("\n");
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

