/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.517.0
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
 * Field containing the data used in determining the outcome of the stolen identity risk check.  Contains the following fields:  &#x60;score&#x60; - A score from 0 to 100 indicating the likelihood that the user is a stolen identity.
 */
@ApiModel(description = "Field containing the data used in determining the outcome of the stolen identity risk check.  Contains the following fields:  `score` - A score from 0 to 100 indicating the likelihood that the user is a stolen identity.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-10T20:14:45.051727Z[Etc/UTC]")
public class RiskCheckStolenIdentity {
  public static final String SERIALIZED_NAME_SCORE = "score";
  @SerializedName(SERIALIZED_NAME_SCORE)
  private Integer score;


  public RiskCheckStolenIdentity score(Integer score) {
    
    this.score = score;
    return this;
  }

   /**
   * A score from 0 to 100 indicating the likelihood that the user is a stolen identity.
   * @return score
  **/
  @ApiModelProperty(example = "0", required = true, value = "A score from 0 to 100 indicating the likelihood that the user is a stolen identity.")

  public Integer getScore() {
    return score;
  }


  public void setScore(Integer score) {
    this.score = score;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiskCheckStolenIdentity riskCheckStolenIdentity = (RiskCheckStolenIdentity) o;
    return Objects.equals(this.score, riskCheckStolenIdentity.score);
  }

  @Override
  public int hashCode() {
    return Objects.hash(score);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskCheckStolenIdentity {\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
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

