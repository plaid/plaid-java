/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.556.0
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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * The results of the Plaid Check score
 */
@ApiModel(description = "The results of the Plaid Check score")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-04T20:03:42.500463Z[Etc/UTC]")
public class PlaidCheckScore {
  public static final String SERIALIZED_NAME_SCORE = "score";
  @SerializedName(SERIALIZED_NAME_SCORE)
  private Double score;

  public static final String SERIALIZED_NAME_REASON_CODES = "reason_codes";
  @SerializedName(SERIALIZED_NAME_REASON_CODES)
  private List<String> reasonCodes = null;


  public PlaidCheckScore score(Double score) {
    
    this.score = score;
    return this;
  }

   /**
   * The score returned by the Plaid Check Score model.
   * @return score
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The score returned by the Plaid Check Score model.")

  public Double getScore() {
    return score;
  }


  public void setScore(Double score) {
    this.score = score;
  }


  public PlaidCheckScore reasonCodes(List<String> reasonCodes) {
    
    this.reasonCodes = reasonCodes;
    return this;
  }

  public PlaidCheckScore addReasonCodesItem(String reasonCodesItem) {
    if (this.reasonCodes == null) {
      this.reasonCodes = new ArrayList<>();
    }
    this.reasonCodes.add(reasonCodesItem);
    return this;
  }

   /**
   * The reasons for an individual having risk according to the Plaid Check score.
   * @return reasonCodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The reasons for an individual having risk according to the Plaid Check score.")

  public List<String> getReasonCodes() {
    return reasonCodes;
  }


  public void setReasonCodes(List<String> reasonCodes) {
    this.reasonCodes = reasonCodes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlaidCheckScore plaidCheckScore = (PlaidCheckScore) o;
    return Objects.equals(this.score, plaidCheckScore.score) &&
        Objects.equals(this.reasonCodes, plaidCheckScore.reasonCodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(score, reasonCodes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlaidCheckScore {\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    reasonCodes: ").append(toIndentedString(reasonCodes)).append("\n");
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

