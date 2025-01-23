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

/**
 * RiskProfile is deprecated, use &#x60;ruleset&#x60; instead.
 */
@ApiModel(description = "RiskProfile is deprecated, use `ruleset` instead.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-23T18:11:57.813484Z[Etc/UTC]")
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
   * The key of the risk profile used for this transaction.
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The key of the risk profile used for this transaction.")

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
   * The evaluated outcome for this transaction. You can configure a list of outcomes, such as \&quot;accept\&quot;, \&quot;review\&quot;, and \&quot;decline\&quot; using the Signal dashboard located within the Plaid Dashboard.
   * @return outcome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The evaluated outcome for this transaction. You can configure a list of outcomes, such as \"accept\", \"review\", and \"decline\" using the Signal dashboard located within the Plaid Dashboard.")

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

