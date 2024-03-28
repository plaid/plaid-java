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
import com.plaid.client.model.WebhookEnvironmentValues;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Fired when risk signals have been processed for documents uploaded via Document Income. It will typically take a minute or two for this webhook to fire after the end user has uploaded their documents in the Document Income flow. Once this webhook has fired, &#x60;/credit/payroll_income/risk_signals/get&#x60; may then be called to determine whether the documents were successfully processed and to retrieve risk data.
 */
@ApiModel(description = "Fired when risk signals have been processed for documents uploaded via Document Income. It will typically take a minute or two for this webhook to fire after the end user has uploaded their documents in the Document Income flow. Once this webhook has fired, `/credit/payroll_income/risk_signals/get` may then be called to determine whether the documents were successfully processed and to retrieve risk data.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-28T19:43:00.996446Z[Etc/UTC]")
public class IncomeVerificationRiskSignalsStatusWebhook {
  public static final String SERIALIZED_NAME_WEBHOOK_TYPE = "webhook_type";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_TYPE)
  private String webhookType;

  public static final String SERIALIZED_NAME_WEBHOOK_CODE = "webhook_code";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_CODE)
  private String webhookCode;

  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private String itemId;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_RISK_SIGNALS_STATUS = "risk_signals_status";
  @SerializedName(SERIALIZED_NAME_RISK_SIGNALS_STATUS)
  private String riskSignalsStatus;

  public static final String SERIALIZED_NAME_ENVIRONMENT = "environment";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT)
  private WebhookEnvironmentValues environment;


  public IncomeVerificationRiskSignalsStatusWebhook webhookType(String webhookType) {
    
    this.webhookType = webhookType;
    return this;
  }

   /**
   * &#x60;\&quot;INCOME\&quot;&#x60;
   * @return webhookType
  **/
  @ApiModelProperty(required = true, value = "`\"INCOME\"`")

  public String getWebhookType() {
    return webhookType;
  }


  public void setWebhookType(String webhookType) {
    this.webhookType = webhookType;
  }


  public IncomeVerificationRiskSignalsStatusWebhook webhookCode(String webhookCode) {
    
    this.webhookCode = webhookCode;
    return this;
  }

   /**
   * &#x60;INCOME_VERIFICATION_RISK_SIGNALS&#x60;
   * @return webhookCode
  **/
  @ApiModelProperty(required = true, value = "`INCOME_VERIFICATION_RISK_SIGNALS`")

  public String getWebhookCode() {
    return webhookCode;
  }


  public void setWebhookCode(String webhookCode) {
    this.webhookCode = webhookCode;
  }


  public IncomeVerificationRiskSignalsStatusWebhook itemId(String itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * The Item ID associated with the verification.
   * @return itemId
  **/
  @ApiModelProperty(required = true, value = "The Item ID associated with the verification.")

  public String getItemId() {
    return itemId;
  }


  public void setItemId(String itemId) {
    this.itemId = itemId;
  }


  public IncomeVerificationRiskSignalsStatusWebhook userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * The Plaid &#x60;user_id&#x60; of the User associated with this webhook, warning, or error.
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Plaid `user_id` of the User associated with this webhook, warning, or error.")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }


  public IncomeVerificationRiskSignalsStatusWebhook riskSignalsStatus(String riskSignalsStatus) {
    
    this.riskSignalsStatus = riskSignalsStatus;
    return this;
  }

   /**
   * &#x60;RISK_SIGNALS_PROCESSING_COMPLETE&#x60;: The income verification fraud detection processing has completed. If the user uploaded multiple documents, this webhook will fire when all documents have finished processing. Call the &#x60;/credit/payroll_income/risk_signals/get&#x60; endpoint to get all risk signal data.
   * @return riskSignalsStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "`RISK_SIGNALS_PROCESSING_COMPLETE`: The income verification fraud detection processing has completed. If the user uploaded multiple documents, this webhook will fire when all documents have finished processing. Call the `/credit/payroll_income/risk_signals/get` endpoint to get all risk signal data.")

  public String getRiskSignalsStatus() {
    return riskSignalsStatus;
  }


  public void setRiskSignalsStatus(String riskSignalsStatus) {
    this.riskSignalsStatus = riskSignalsStatus;
  }


  public IncomeVerificationRiskSignalsStatusWebhook environment(WebhookEnvironmentValues environment) {
    
    this.environment = environment;
    return this;
  }

   /**
   * Get environment
   * @return environment
  **/
  @ApiModelProperty(required = true, value = "")

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
    IncomeVerificationRiskSignalsStatusWebhook incomeVerificationRiskSignalsStatusWebhook = (IncomeVerificationRiskSignalsStatusWebhook) o;
    return Objects.equals(this.webhookType, incomeVerificationRiskSignalsStatusWebhook.webhookType) &&
        Objects.equals(this.webhookCode, incomeVerificationRiskSignalsStatusWebhook.webhookCode) &&
        Objects.equals(this.itemId, incomeVerificationRiskSignalsStatusWebhook.itemId) &&
        Objects.equals(this.userId, incomeVerificationRiskSignalsStatusWebhook.userId) &&
        Objects.equals(this.riskSignalsStatus, incomeVerificationRiskSignalsStatusWebhook.riskSignalsStatus) &&
        Objects.equals(this.environment, incomeVerificationRiskSignalsStatusWebhook.environment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhookType, webhookCode, itemId, userId, riskSignalsStatus, environment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncomeVerificationRiskSignalsStatusWebhook {\n");
    sb.append("    webhookType: ").append(toIndentedString(webhookType)).append("\n");
    sb.append("    webhookCode: ").append(toIndentedString(webhookCode)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    riskSignalsStatus: ").append(toIndentedString(riskSignalsStatus)).append("\n");
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

