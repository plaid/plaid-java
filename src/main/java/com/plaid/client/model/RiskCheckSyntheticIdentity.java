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
import com.plaid.client.model.RiskLevel;
import com.plaid.client.model.SyntheticFraud;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Field containing the data used in determining the outcome of the synthetic identity risk check.  Contains the following fields:  &#x60;score&#x60; - A score from 0 to 100 indicating the likelihood that the user is a synthetic identity.
 */
@ApiModel(description = "Field containing the data used in determining the outcome of the synthetic identity risk check.  Contains the following fields:  `score` - A score from 0 to 100 indicating the likelihood that the user is a synthetic identity.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-21T16:44:11.345889Z[Etc/UTC]")
public class RiskCheckSyntheticIdentity {
  public static final String SERIALIZED_NAME_SCORE = "score";
  @SerializedName(SERIALIZED_NAME_SCORE)
  private Integer score;

  public static final String SERIALIZED_NAME_RISK_LEVEL = "risk_level";
  @SerializedName(SERIALIZED_NAME_RISK_LEVEL)
  private RiskLevel riskLevel;

  public static final String SERIALIZED_NAME_FIRST_PARTY_SYNTHETIC_FRAUD = "first_party_synthetic_fraud";
  @SerializedName(SERIALIZED_NAME_FIRST_PARTY_SYNTHETIC_FRAUD)
  private SyntheticFraud firstPartySyntheticFraud;

  public static final String SERIALIZED_NAME_THIRD_PARTY_SYNTHETIC_FRAUD = "third_party_synthetic_fraud";
  @SerializedName(SERIALIZED_NAME_THIRD_PARTY_SYNTHETIC_FRAUD)
  private SyntheticFraud thirdPartySyntheticFraud;


  public RiskCheckSyntheticIdentity score(Integer score) {
    
    this.score = score;
    return this;
  }

   /**
   * A score from 0 to 100 indicating the likelihood that the user is a synthetic identity.
   * @return score
  **/
  @ApiModelProperty(example = "0", required = true, value = "A score from 0 to 100 indicating the likelihood that the user is a synthetic identity.")

  public Integer getScore() {
    return score;
  }


  public void setScore(Integer score) {
    this.score = score;
  }


  public RiskCheckSyntheticIdentity riskLevel(RiskLevel riskLevel) {
    
    this.riskLevel = riskLevel;
    return this;
  }

   /**
   * Get riskLevel
   * @return riskLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RiskLevel getRiskLevel() {
    return riskLevel;
  }


  public void setRiskLevel(RiskLevel riskLevel) {
    this.riskLevel = riskLevel;
  }


  public RiskCheckSyntheticIdentity firstPartySyntheticFraud(SyntheticFraud firstPartySyntheticFraud) {
    
    this.firstPartySyntheticFraud = firstPartySyntheticFraud;
    return this;
  }

   /**
   * Get firstPartySyntheticFraud
   * @return firstPartySyntheticFraud
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SyntheticFraud getFirstPartySyntheticFraud() {
    return firstPartySyntheticFraud;
  }


  public void setFirstPartySyntheticFraud(SyntheticFraud firstPartySyntheticFraud) {
    this.firstPartySyntheticFraud = firstPartySyntheticFraud;
  }


  public RiskCheckSyntheticIdentity thirdPartySyntheticFraud(SyntheticFraud thirdPartySyntheticFraud) {
    
    this.thirdPartySyntheticFraud = thirdPartySyntheticFraud;
    return this;
  }

   /**
   * Get thirdPartySyntheticFraud
   * @return thirdPartySyntheticFraud
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SyntheticFraud getThirdPartySyntheticFraud() {
    return thirdPartySyntheticFraud;
  }


  public void setThirdPartySyntheticFraud(SyntheticFraud thirdPartySyntheticFraud) {
    this.thirdPartySyntheticFraud = thirdPartySyntheticFraud;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiskCheckSyntheticIdentity riskCheckSyntheticIdentity = (RiskCheckSyntheticIdentity) o;
    return Objects.equals(this.score, riskCheckSyntheticIdentity.score) &&
        Objects.equals(this.riskLevel, riskCheckSyntheticIdentity.riskLevel) &&
        Objects.equals(this.firstPartySyntheticFraud, riskCheckSyntheticIdentity.firstPartySyntheticFraud) &&
        Objects.equals(this.thirdPartySyntheticFraud, riskCheckSyntheticIdentity.thirdPartySyntheticFraud);
  }

  @Override
  public int hashCode() {
    return Objects.hash(score, riskLevel, firstPartySyntheticFraud, thirdPartySyntheticFraud);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskCheckSyntheticIdentity {\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    riskLevel: ").append(toIndentedString(riskLevel)).append("\n");
    sb.append("    firstPartySyntheticFraud: ").append(toIndentedString(firstPartySyntheticFraud)).append("\n");
    sb.append("    thirdPartySyntheticFraud: ").append(toIndentedString(thirdPartySyntheticFraud)).append("\n");
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

