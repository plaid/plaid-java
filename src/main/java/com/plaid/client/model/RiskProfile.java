/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.503.5
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
 * Details about the transaction result after evaluated by the requested risk profile. If a &#x60;risk_profile_key&#x60; is not provided, this field will be omitted. This feature is currently in closed beta; to request access, contact your account manager.
 */
@ApiModel(description = "Details about the transaction result after evaluated by the requested risk profile. If a `risk_profile_key` is not provided, this field will be omitted. This feature is currently in closed beta; to request access, contact your account manager.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-28T21:00:55.745394Z[Etc/UTC]")
public class RiskProfile {
  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_OUTCOME = "outcome";
  @SerializedName(SERIALIZED_NAME_OUTCOME)
  private String outcome;


  public RiskProfile key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * The name of the risk profile used for this transaction.
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the risk profile used for this transaction.")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public RiskProfile outcome(String outcome) {
    
    this.outcome = outcome;
    return this;
  }

   /**
   * The name of the evaluated outcome for this transaction.
   * @return outcome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the evaluated outcome for this transaction.")

  public String getOutcome() {
    return outcome;
  }


  public void setOutcome(String outcome) {
    this.outcome = outcome;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiskProfile riskProfile = (RiskProfile) o;
    return Objects.equals(this.key, riskProfile.key) &&
        Objects.equals(this.outcome, riskProfile.outcome);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, outcome);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskProfile {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    outcome: ").append(toIndentedString(outcome)).append("\n");
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

