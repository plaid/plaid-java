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
import com.plaid.client.model.MonitoringInsightsStatus;
import com.plaid.client.model.WebhookEnvironmentValues;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * For each user enabled for Cash Flow Updates, this webhook will fire every 14 days with information on the status of the update. Upon receiving the webhook, call &#x60;/cra/monitoring_insights/get&#x60; to retrieve the updated insights.
 */
@ApiModel(description = "For each user enabled for Cash Flow Updates, this webhook will fire every 14 days with information on the status of the update. Upon receiving the webhook, call `/cra/monitoring_insights/get` to retrieve the updated insights.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-23T20:55:58.809242Z[Etc/UTC]")
public class MonitoringInsightsWebhook {
  public static final String SERIALIZED_NAME_WEBHOOK_TYPE = "webhook_type";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_TYPE)
  private String webhookType;

  public static final String SERIALIZED_NAME_WEBHOOK_CODE = "webhook_code";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_CODE)
  private String webhookCode;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private MonitoringInsightsStatus status;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_ENVIRONMENT = "environment";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT)
  private WebhookEnvironmentValues environment;


  public MonitoringInsightsWebhook webhookType(String webhookType) {
    
    this.webhookType = webhookType;
    return this;
  }

   /**
   * &#x60;CRA_MONITORING&#x60;
   * @return webhookType
  **/
  @ApiModelProperty(required = true, value = "`CRA_MONITORING`")

  public String getWebhookType() {
    return webhookType;
  }


  public void setWebhookType(String webhookType) {
    this.webhookType = webhookType;
  }


  public MonitoringInsightsWebhook webhookCode(String webhookCode) {
    
    this.webhookCode = webhookCode;
    return this;
  }

   /**
   * &#x60;INSIGHTS_UPDATED&#x60;
   * @return webhookCode
  **/
  @ApiModelProperty(required = true, value = "`INSIGHTS_UPDATED`")

  public String getWebhookCode() {
    return webhookCode;
  }


  public void setWebhookCode(String webhookCode) {
    this.webhookCode = webhookCode;
  }


  public MonitoringInsightsWebhook status(MonitoringInsightsStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")

  public MonitoringInsightsStatus getStatus() {
    return status;
  }


  public void setStatus(MonitoringInsightsStatus status) {
    this.status = status;
  }


  public MonitoringInsightsWebhook reason(String reason) {
    
    this.reason = reason;
    return this;
  }

   /**
   * The reason for why insights may not be &#x60;AVAILABLE&#x60;
   * @return reason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The reason for why insights may not be `AVAILABLE`")

  public String getReason() {
    return reason;
  }


  public void setReason(String reason) {
    this.reason = reason;
  }


  public MonitoringInsightsWebhook userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * The &#x60;user_id&#x60; that the report is associated with
   * @return userId
  **/
  @ApiModelProperty(required = true, value = "The `user_id` that the report is associated with")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }


  public MonitoringInsightsWebhook environment(WebhookEnvironmentValues environment) {
    
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
    MonitoringInsightsWebhook monitoringInsightsWebhook = (MonitoringInsightsWebhook) o;
    return Objects.equals(this.webhookType, monitoringInsightsWebhook.webhookType) &&
        Objects.equals(this.webhookCode, monitoringInsightsWebhook.webhookCode) &&
        Objects.equals(this.status, monitoringInsightsWebhook.status) &&
        Objects.equals(this.reason, monitoringInsightsWebhook.reason) &&
        Objects.equals(this.userId, monitoringInsightsWebhook.userId) &&
        Objects.equals(this.environment, monitoringInsightsWebhook.environment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhookType, webhookCode, status, reason, userId, environment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitoringInsightsWebhook {\n");
    sb.append("    webhookType: ").append(toIndentedString(webhookType)).append("\n");
    sb.append("    webhookCode: ").append(toIndentedString(webhookCode)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

