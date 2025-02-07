/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.617.1
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
import com.plaid.client.model.RiskCheckBehaviorBotDetectedLabel;
import com.plaid.client.model.RiskCheckBehaviorFraudRingDetectedLabel;
import com.plaid.client.model.RiskCheckBehaviorUserInteractionsLabel;
import com.plaid.client.model.RiskLevelWithNoData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Result summary object specifying values for &#x60;behavior&#x60; attributes of risk check, when available.
 */
@ApiModel(description = "Result summary object specifying values for `behavior` attributes of risk check, when available.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-07T19:05:33.763924Z[Etc/UTC]")
public class RiskCheckBehavior {
  public static final String SERIALIZED_NAME_USER_INTERACTIONS = "user_interactions";
  @SerializedName(SERIALIZED_NAME_USER_INTERACTIONS)
  private RiskCheckBehaviorUserInteractionsLabel userInteractions;

  public static final String SERIALIZED_NAME_FRAUD_RING_DETECTED = "fraud_ring_detected";
  @SerializedName(SERIALIZED_NAME_FRAUD_RING_DETECTED)
  private RiskCheckBehaviorFraudRingDetectedLabel fraudRingDetected;

  public static final String SERIALIZED_NAME_BOT_DETECTED = "bot_detected";
  @SerializedName(SERIALIZED_NAME_BOT_DETECTED)
  private RiskCheckBehaviorBotDetectedLabel botDetected;

  public static final String SERIALIZED_NAME_RISK_LEVEL = "risk_level";
  @SerializedName(SERIALIZED_NAME_RISK_LEVEL)
  private RiskLevelWithNoData riskLevel;


  public RiskCheckBehavior userInteractions(RiskCheckBehaviorUserInteractionsLabel userInteractions) {
    
    this.userInteractions = userInteractions;
    return this;
  }

   /**
   * Get userInteractions
   * @return userInteractions
  **/
  @ApiModelProperty(required = true, value = "")

  public RiskCheckBehaviorUserInteractionsLabel getUserInteractions() {
    return userInteractions;
  }


  public void setUserInteractions(RiskCheckBehaviorUserInteractionsLabel userInteractions) {
    this.userInteractions = userInteractions;
  }


  public RiskCheckBehavior fraudRingDetected(RiskCheckBehaviorFraudRingDetectedLabel fraudRingDetected) {
    
    this.fraudRingDetected = fraudRingDetected;
    return this;
  }

   /**
   * Get fraudRingDetected
   * @return fraudRingDetected
  **/
  @ApiModelProperty(required = true, value = "")

  public RiskCheckBehaviorFraudRingDetectedLabel getFraudRingDetected() {
    return fraudRingDetected;
  }


  public void setFraudRingDetected(RiskCheckBehaviorFraudRingDetectedLabel fraudRingDetected) {
    this.fraudRingDetected = fraudRingDetected;
  }


  public RiskCheckBehavior botDetected(RiskCheckBehaviorBotDetectedLabel botDetected) {
    
    this.botDetected = botDetected;
    return this;
  }

   /**
   * Get botDetected
   * @return botDetected
  **/
  @ApiModelProperty(required = true, value = "")

  public RiskCheckBehaviorBotDetectedLabel getBotDetected() {
    return botDetected;
  }


  public void setBotDetected(RiskCheckBehaviorBotDetectedLabel botDetected) {
    this.botDetected = botDetected;
  }


  public RiskCheckBehavior riskLevel(RiskLevelWithNoData riskLevel) {
    
    this.riskLevel = riskLevel;
    return this;
  }

   /**
   * Get riskLevel
   * @return riskLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RiskLevelWithNoData getRiskLevel() {
    return riskLevel;
  }


  public void setRiskLevel(RiskLevelWithNoData riskLevel) {
    this.riskLevel = riskLevel;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiskCheckBehavior riskCheckBehavior = (RiskCheckBehavior) o;
    return Objects.equals(this.userInteractions, riskCheckBehavior.userInteractions) &&
        Objects.equals(this.fraudRingDetected, riskCheckBehavior.fraudRingDetected) &&
        Objects.equals(this.botDetected, riskCheckBehavior.botDetected) &&
        Objects.equals(this.riskLevel, riskCheckBehavior.riskLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userInteractions, fraudRingDetected, botDetected, riskLevel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskCheckBehavior {\n");
    sb.append("    userInteractions: ").append(toIndentedString(userInteractions)).append("\n");
    sb.append("    fraudRingDetected: ").append(toIndentedString(fraudRingDetected)).append("\n");
    sb.append("    botDetected: ").append(toIndentedString(botDetected)).append("\n");
    sb.append("    riskLevel: ").append(toIndentedString(riskLevel)).append("\n");
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

