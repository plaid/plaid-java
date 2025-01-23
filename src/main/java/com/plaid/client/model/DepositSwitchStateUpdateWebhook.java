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
import com.plaid.client.model.WebhookEnvironmentValues;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * (Deprecated) Fired when the status of a deposit switch request has changed.
 */
@ApiModel(description = "(Deprecated) Fired when the status of a deposit switch request has changed.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-23T18:11:57.813484Z[Etc/UTC]")
public class DepositSwitchStateUpdateWebhook {
  public static final String SERIALIZED_NAME_WEBHOOK_TYPE = "webhook_type";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_TYPE)
  private String webhookType;

  public static final String SERIALIZED_NAME_WEBHOOK_CODE = "webhook_code";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_CODE)
  private String webhookCode;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_DEPOSIT_SWITCH_ID = "deposit_switch_id";
  @SerializedName(SERIALIZED_NAME_DEPOSIT_SWITCH_ID)
  private String depositSwitchId;

  public static final String SERIALIZED_NAME_ENVIRONMENT = "environment";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT)
  private WebhookEnvironmentValues environment;


  public DepositSwitchStateUpdateWebhook webhookType(String webhookType) {
    
    this.webhookType = webhookType;
    return this;
  }

   /**
   * &#x60;\&quot;DEPOSIT_SWITCH\&quot;&#x60;
   * @return webhookType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "`\"DEPOSIT_SWITCH\"`")

  public String getWebhookType() {
    return webhookType;
  }


  public void setWebhookType(String webhookType) {
    this.webhookType = webhookType;
  }


  public DepositSwitchStateUpdateWebhook webhookCode(String webhookCode) {
    
    this.webhookCode = webhookCode;
    return this;
  }

   /**
   * &#x60;\&quot;SWITCH_STATE_UPDATE\&quot;&#x60;
   * @return webhookCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "`\"SWITCH_STATE_UPDATE\"`")

  public String getWebhookCode() {
    return webhookCode;
  }


  public void setWebhookCode(String webhookCode) {
    this.webhookCode = webhookCode;
  }


  public DepositSwitchStateUpdateWebhook state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   *  The state, or status, of the deposit switch.  &#x60;initialized&#x60;: The deposit switch has been initialized with the user entering the information required to submit the deposit switch request.  &#x60;processing&#x60;: The deposit switch request has been submitted and is being processed.  &#x60;completed&#x60;: The user&#39;s employer has fulfilled and completed the deposit switch request.  &#x60;error&#x60;: There was an error processing the deposit switch request.  For more information, see the [Deposit Switch API reference](/docs/deposit-switch/reference#deposit_switchget).
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = " The state, or status, of the deposit switch.  `initialized`: The deposit switch has been initialized with the user entering the information required to submit the deposit switch request.  `processing`: The deposit switch request has been submitted and is being processed.  `completed`: The user's employer has fulfilled and completed the deposit switch request.  `error`: There was an error processing the deposit switch request.  For more information, see the [Deposit Switch API reference](/docs/deposit-switch/reference#deposit_switchget).")

  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }


  public DepositSwitchStateUpdateWebhook depositSwitchId(String depositSwitchId) {
    
    this.depositSwitchId = depositSwitchId;
    return this;
  }

   /**
   * The ID of the deposit switch.
   * @return depositSwitchId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the deposit switch.")

  public String getDepositSwitchId() {
    return depositSwitchId;
  }


  public void setDepositSwitchId(String depositSwitchId) {
    this.depositSwitchId = depositSwitchId;
  }


  public DepositSwitchStateUpdateWebhook environment(WebhookEnvironmentValues environment) {
    
    this.environment = environment;
    return this;
  }

   /**
   * Get environment
   * @return environment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WebhookEnvironmentValues getEnvironment() {
    return environment;
  }


  public void setEnvironment(WebhookEnvironmentValues environment) {
    this.environment = environment;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepositSwitchStateUpdateWebhook depositSwitchStateUpdateWebhook = (DepositSwitchStateUpdateWebhook) o;
    return Objects.equals(this.webhookType, depositSwitchStateUpdateWebhook.webhookType) &&
        Objects.equals(this.webhookCode, depositSwitchStateUpdateWebhook.webhookCode) &&
        Objects.equals(this.state, depositSwitchStateUpdateWebhook.state) &&
        Objects.equals(this.depositSwitchId, depositSwitchStateUpdateWebhook.depositSwitchId) &&
        Objects.equals(this.environment, depositSwitchStateUpdateWebhook.environment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhookType, webhookCode, state, depositSwitchId, environment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositSwitchStateUpdateWebhook {\n");
    sb.append("    webhookType: ").append(toIndentedString(webhookType)).append("\n");
    sb.append("    webhookCode: ").append(toIndentedString(webhookCode)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    depositSwitchId: ").append(toIndentedString(depositSwitchId)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
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

