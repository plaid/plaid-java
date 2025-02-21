/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.620.0
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
 * Fired when a change to the user&#39;s income is detected. You should call &#x60;/credit/bank_income/refresh&#x60; to get updated income data for the user. To receive this webhook, subscribe in the [Dashboard](https://dashboard.plaid.com/developers/webhooks).
 */
@ApiModel(description = "Fired when a change to the user's income is detected. You should call `/credit/bank_income/refresh` to get updated income data for the user. To receive this webhook, subscribe in the [Dashboard](https://dashboard.plaid.com/developers/webhooks).")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-21T16:44:11.345889Z[Etc/UTC]")
public class BankIncomeRefreshUpdateWebhook {
  public static final String SERIALIZED_NAME_WEBHOOK_TYPE = "webhook_type";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_TYPE)
  private String webhookType;

  public static final String SERIALIZED_NAME_WEBHOOK_CODE = "webhook_code";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_CODE)
  private String webhookCode;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_ENVIRONMENT = "environment";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT)
  private WebhookEnvironmentValues environment;


  public BankIncomeRefreshUpdateWebhook webhookType(String webhookType) {
    
    this.webhookType = webhookType;
    return this;
  }

   /**
   * &#x60;INCOME&#x60;
   * @return webhookType
  **/
  @ApiModelProperty(required = true, value = "`INCOME`")

  public String getWebhookType() {
    return webhookType;
  }


  public void setWebhookType(String webhookType) {
    this.webhookType = webhookType;
  }


  public BankIncomeRefreshUpdateWebhook webhookCode(String webhookCode) {
    
    this.webhookCode = webhookCode;
    return this;
  }

   /**
   * &#x60;BANK_INCOME_REFRESH_UPDATE&#x60;
   * @return webhookCode
  **/
  @ApiModelProperty(required = true, value = "`BANK_INCOME_REFRESH_UPDATE`")

  public String getWebhookCode() {
    return webhookCode;
  }


  public void setWebhookCode(String webhookCode) {
    this.webhookCode = webhookCode;
  }


  public BankIncomeRefreshUpdateWebhook userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * The &#x60;user_id&#x60; corresponding to the user the webhook has fired for.
   * @return userId
  **/
  @ApiModelProperty(required = true, value = "The `user_id` corresponding to the user the webhook has fired for.")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }


  public BankIncomeRefreshUpdateWebhook environment(WebhookEnvironmentValues environment) {
    
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
    BankIncomeRefreshUpdateWebhook bankIncomeRefreshUpdateWebhook = (BankIncomeRefreshUpdateWebhook) o;
    return Objects.equals(this.webhookType, bankIncomeRefreshUpdateWebhook.webhookType) &&
        Objects.equals(this.webhookCode, bankIncomeRefreshUpdateWebhook.webhookCode) &&
        Objects.equals(this.userId, bankIncomeRefreshUpdateWebhook.userId) &&
        Objects.equals(this.environment, bankIncomeRefreshUpdateWebhook.environment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhookType, webhookCode, userId, environment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankIncomeRefreshUpdateWebhook {\n");
    sb.append("    webhookType: ").append(toIndentedString(webhookType)).append("\n");
    sb.append("    webhookCode: ").append(toIndentedString(webhookCode)).append("\n");
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

