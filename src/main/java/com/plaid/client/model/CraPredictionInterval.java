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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * The object containing prediction interval data.
 */
@ApiModel(description = "The object containing prediction interval data.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-23T20:55:58.809242Z[Etc/UTC]")
public class CraPredictionInterval {
  public static final String SERIALIZED_NAME_LOWER_BOUND = "lower_bound";
  @SerializedName(SERIALIZED_NAME_LOWER_BOUND)
  private Double lowerBound;

  public static final String SERIALIZED_NAME_UPPER_BOUND = "upper_bound";
  @SerializedName(SERIALIZED_NAME_UPPER_BOUND)
  private Double upperBound;

  public static final String SERIALIZED_NAME_PROBABILITY = "probability";
  @SerializedName(SERIALIZED_NAME_PROBABILITY)
  private Double probability;


  public CraPredictionInterval lowerBound(Double lowerBound) {
    
    this.lowerBound = lowerBound;
    return this;
  }

   /**
   * The lower bound of the predicted attribute for the given probability.
   * @return lowerBound
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The lower bound of the predicted attribute for the given probability.")

  public Double getLowerBound() {
    return lowerBound;
  }


  public void setLowerBound(Double lowerBound) {
    this.lowerBound = lowerBound;
  }


  public CraPredictionInterval upperBound(Double upperBound) {
    
    this.upperBound = upperBound;
    return this;
  }

   /**
   * The upper bound of the predicted attribute for the given probability.
   * @return upperBound
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The upper bound of the predicted attribute for the given probability.")

  public Double getUpperBound() {
    return upperBound;
  }


  public void setUpperBound(Double upperBound) {
    this.upperBound = upperBound;
  }


  public CraPredictionInterval probability(Double probability) {
    
    this.probability = probability;
    return this;
  }

   /**
   * The probability of the actual value of the attribute falling within the upper and lower bound. This is a percentage represented as a value between 0 and 1.
   * @return probability
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The probability of the actual value of the attribute falling within the upper and lower bound. This is a percentage represented as a value between 0 and 1.")

  public Double getProbability() {
    return probability;
  }


  public void setProbability(Double probability) {
    this.probability = probability;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CraPredictionInterval craPredictionInterval = (CraPredictionInterval) o;
    return Objects.equals(this.lowerBound, craPredictionInterval.lowerBound) &&
        Objects.equals(this.upperBound, craPredictionInterval.upperBound) &&
        Objects.equals(this.probability, craPredictionInterval.probability);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lowerBound, upperBound, probability);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CraPredictionInterval {\n");
    sb.append("    lowerBound: ").append(toIndentedString(lowerBound)).append("\n");
    sb.append("    upperBound: ").append(toIndentedString(upperBound)).append("\n");
    sb.append("    probability: ").append(toIndentedString(probability)).append("\n");
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

