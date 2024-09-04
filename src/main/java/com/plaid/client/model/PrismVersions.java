/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.555.0
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
import com.plaid.client.model.PrismCashScoreVersion;
import com.plaid.client.model.PrismFirstDetectVersion;
import com.plaid.client.model.PrismInsightsVersion;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The versions of Prism products to evaluate
 */
@ApiModel(description = "The versions of Prism products to evaluate")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-04T15:13:56.933796Z[Etc/UTC]")
public class PrismVersions {
  public static final String SERIALIZED_NAME_FIRSTDETECT = "firstdetect";
  @SerializedName(SERIALIZED_NAME_FIRSTDETECT)
  private PrismFirstDetectVersion firstdetect;

  public static final String SERIALIZED_NAME_CASHSCORE = "cashscore";
  @SerializedName(SERIALIZED_NAME_CASHSCORE)
  private PrismCashScoreVersion cashscore;

  public static final String SERIALIZED_NAME_INSIGHTS = "insights";
  @SerializedName(SERIALIZED_NAME_INSIGHTS)
  private PrismInsightsVersion insights;


  public PrismVersions firstdetect(PrismFirstDetectVersion firstdetect) {
    
    this.firstdetect = firstdetect;
    return this;
  }

   /**
   * Get firstdetect
   * @return firstdetect
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PrismFirstDetectVersion getFirstdetect() {
    return firstdetect;
  }


  public void setFirstdetect(PrismFirstDetectVersion firstdetect) {
    this.firstdetect = firstdetect;
  }


  public PrismVersions cashscore(PrismCashScoreVersion cashscore) {
    
    this.cashscore = cashscore;
    return this;
  }

   /**
   * Get cashscore
   * @return cashscore
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PrismCashScoreVersion getCashscore() {
    return cashscore;
  }


  public void setCashscore(PrismCashScoreVersion cashscore) {
    this.cashscore = cashscore;
  }


  public PrismVersions insights(PrismInsightsVersion insights) {
    
    this.insights = insights;
    return this;
  }

   /**
   * Get insights
   * @return insights
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PrismInsightsVersion getInsights() {
    return insights;
  }


  public void setInsights(PrismInsightsVersion insights) {
    this.insights = insights;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrismVersions prismVersions = (PrismVersions) o;
    return Objects.equals(this.firstdetect, prismVersions.firstdetect) &&
        Objects.equals(this.cashscore, prismVersions.cashscore) &&
        Objects.equals(this.insights, prismVersions.insights);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstdetect, cashscore, insights);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrismVersions {\n");
    sb.append("    firstdetect: ").append(toIndentedString(firstdetect)).append("\n");
    sb.append("    cashscore: ").append(toIndentedString(cashscore)).append("\n");
    sb.append("    insights: ").append(toIndentedString(insights)).append("\n");
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

