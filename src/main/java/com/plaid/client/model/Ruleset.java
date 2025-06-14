/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.645.0
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
import com.plaid.client.model.RuleDetails;
import com.plaid.client.model.RuleResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Details about the transaction result after evaluated by the requested Ruleset. If a &#x60;ruleset_key&#x60; is not provided, this field will be omitted. This feature is currently in closed beta; to request access, contact your account manager.
 */
@ApiModel(description = "Details about the transaction result after evaluated by the requested Ruleset. If a `ruleset_key` is not provided, this field will be omitted. This feature is currently in closed beta; to request access, contact your account manager.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-12T21:24:48.076128Z[Etc/UTC]")
public class Ruleset {
  public static final String SERIALIZED_NAME_RULESET_KEY = "ruleset_key";
  @SerializedName(SERIALIZED_NAME_RULESET_KEY)
  private String rulesetKey;

  public static final String SERIALIZED_NAME_RESULT = "result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private RuleResult result;

  public static final String SERIALIZED_NAME_TRIGGERED_RULE_DETAILS = "triggered_rule_details";
  @SerializedName(SERIALIZED_NAME_TRIGGERED_RULE_DETAILS)
  private RuleDetails triggeredRuleDetails;

  public static final String SERIALIZED_NAME_OUTCOME = "outcome";
  @SerializedName(SERIALIZED_NAME_OUTCOME)
  private String outcome;


  public Ruleset rulesetKey(String rulesetKey) {
    
    this.rulesetKey = rulesetKey;
    return this;
  }

   /**
   * The key of the Ruleset used for this transaction.
   * @return rulesetKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The key of the Ruleset used for this transaction.")

  public String getRulesetKey() {
    return rulesetKey;
  }


  public void setRulesetKey(String rulesetKey) {
    this.rulesetKey = rulesetKey;
  }


  public Ruleset result(RuleResult result) {
    
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @ApiModelProperty(required = true, value = "")

  public RuleResult getResult() {
    return result;
  }


  public void setResult(RuleResult result) {
    this.result = result;
  }


  public Ruleset triggeredRuleDetails(RuleDetails triggeredRuleDetails) {
    
    this.triggeredRuleDetails = triggeredRuleDetails;
    return this;
  }

   /**
   * Get triggeredRuleDetails
   * @return triggeredRuleDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RuleDetails getTriggeredRuleDetails() {
    return triggeredRuleDetails;
  }


  public void setTriggeredRuleDetails(RuleDetails triggeredRuleDetails) {
    this.triggeredRuleDetails = triggeredRuleDetails;
  }


  public Ruleset outcome(String outcome) {
    
    this.outcome = outcome;
    return this;
  }

   /**
   * The evaluated outcome for this transaction. This field is deprecated, use &#x60;result&#x60; or &#x60;triggered_rule_details.custom_action_key&#x60; instead.
   * @return outcome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The evaluated outcome for this transaction. This field is deprecated, use `result` or `triggered_rule_details.custom_action_key` instead.")

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
    Ruleset ruleset = (Ruleset) o;
    return Objects.equals(this.rulesetKey, ruleset.rulesetKey) &&
        Objects.equals(this.result, ruleset.result) &&
        Objects.equals(this.triggeredRuleDetails, ruleset.triggeredRuleDetails) &&
        Objects.equals(this.outcome, ruleset.outcome);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rulesetKey, result, triggeredRuleDetails, outcome);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ruleset {\n");
    sb.append("    rulesetKey: ").append(toIndentedString(rulesetKey)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    triggeredRuleDetails: ").append(toIndentedString(triggeredRuleDetails)).append("\n");
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

