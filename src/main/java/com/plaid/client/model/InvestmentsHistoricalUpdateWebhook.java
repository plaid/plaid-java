/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.508.0
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
import com.plaid.client.model.PlaidError;
import com.plaid.client.model.WebhookEnvironmentValues;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * Fired after an asynchronous extraction on an investments account.
 */
@ApiModel(description = "Fired after an asynchronous extraction on an investments account.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-17T19:36:14.619905Z[Etc/UTC]")
public class InvestmentsHistoricalUpdateWebhook {
  public static final String SERIALIZED_NAME_WEBHOOK_TYPE = "webhook_type";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_TYPE)
  private String webhookType;

  public static final String SERIALIZED_NAME_WEBHOOK_CODE = "webhook_code";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_CODE)
  private String webhookCode;

  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private String itemId;

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private PlaidError error;

  public static final String SERIALIZED_NAME_NEW_INVESTMENTS_TRANSACTIONS = "new_investments_transactions";
  @SerializedName(SERIALIZED_NAME_NEW_INVESTMENTS_TRANSACTIONS)
  private Double newInvestmentsTransactions;

  public static final String SERIALIZED_NAME_CANCELED_INVESTMENTS_TRANSACTIONS = "canceled_investments_transactions";
  @SerializedName(SERIALIZED_NAME_CANCELED_INVESTMENTS_TRANSACTIONS)
  private Double canceledInvestmentsTransactions;

  public static final String SERIALIZED_NAME_ENVIRONMENT = "environment";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT)
  private WebhookEnvironmentValues environment;


  public InvestmentsHistoricalUpdateWebhook webhookType(String webhookType) {
    
    this.webhookType = webhookType;
    return this;
  }

   /**
   * &#x60;INVESTMENTS_TRANSACTIONS&#x60;
   * @return webhookType
  **/
  @ApiModelProperty(required = true, value = "`INVESTMENTS_TRANSACTIONS`")

  public String getWebhookType() {
    return webhookType;
  }


  public void setWebhookType(String webhookType) {
    this.webhookType = webhookType;
  }


  public InvestmentsHistoricalUpdateWebhook webhookCode(String webhookCode) {
    
    this.webhookCode = webhookCode;
    return this;
  }

   /**
   * &#x60;HISTORICAL_UPDATE&#x60;
   * @return webhookCode
  **/
  @ApiModelProperty(required = true, value = "`HISTORICAL_UPDATE`")

  public String getWebhookCode() {
    return webhookCode;
  }


  public void setWebhookCode(String webhookCode) {
    this.webhookCode = webhookCode;
  }


  public InvestmentsHistoricalUpdateWebhook itemId(String itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * The &#x60;item_id&#x60; of the Item associated with this webhook, warning, or error
   * @return itemId
  **/
  @ApiModelProperty(required = true, value = "The `item_id` of the Item associated with this webhook, warning, or error")

  public String getItemId() {
    return itemId;
  }


  public void setItemId(String itemId) {
    this.itemId = itemId;
  }


  public InvestmentsHistoricalUpdateWebhook error(PlaidError error) {
    
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PlaidError getError() {
    return error;
  }


  public void setError(PlaidError error) {
    this.error = error;
  }


  public InvestmentsHistoricalUpdateWebhook newInvestmentsTransactions(Double newInvestmentsTransactions) {
    
    this.newInvestmentsTransactions = newInvestmentsTransactions;
    return this;
  }

   /**
   * The number of new transactions reported since the last time this webhook was fired.
   * @return newInvestmentsTransactions
  **/
  @ApiModelProperty(required = true, value = "The number of new transactions reported since the last time this webhook was fired.")

  public Double getNewInvestmentsTransactions() {
    return newInvestmentsTransactions;
  }


  public void setNewInvestmentsTransactions(Double newInvestmentsTransactions) {
    this.newInvestmentsTransactions = newInvestmentsTransactions;
  }


  public InvestmentsHistoricalUpdateWebhook canceledInvestmentsTransactions(Double canceledInvestmentsTransactions) {
    
    this.canceledInvestmentsTransactions = canceledInvestmentsTransactions;
    return this;
  }

   /**
   * The number of canceled transactions reported since the last time this webhook was fired.
   * @return canceledInvestmentsTransactions
  **/
  @ApiModelProperty(required = true, value = "The number of canceled transactions reported since the last time this webhook was fired.")

  public Double getCanceledInvestmentsTransactions() {
    return canceledInvestmentsTransactions;
  }


  public void setCanceledInvestmentsTransactions(Double canceledInvestmentsTransactions) {
    this.canceledInvestmentsTransactions = canceledInvestmentsTransactions;
  }


  public InvestmentsHistoricalUpdateWebhook environment(WebhookEnvironmentValues environment) {
    
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
    InvestmentsHistoricalUpdateWebhook investmentsHistoricalUpdateWebhook = (InvestmentsHistoricalUpdateWebhook) o;
    return Objects.equals(this.webhookType, investmentsHistoricalUpdateWebhook.webhookType) &&
        Objects.equals(this.webhookCode, investmentsHistoricalUpdateWebhook.webhookCode) &&
        Objects.equals(this.itemId, investmentsHistoricalUpdateWebhook.itemId) &&
        Objects.equals(this.error, investmentsHistoricalUpdateWebhook.error) &&
        Objects.equals(this.newInvestmentsTransactions, investmentsHistoricalUpdateWebhook.newInvestmentsTransactions) &&
        Objects.equals(this.canceledInvestmentsTransactions, investmentsHistoricalUpdateWebhook.canceledInvestmentsTransactions) &&
        Objects.equals(this.environment, investmentsHistoricalUpdateWebhook.environment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhookType, webhookCode, itemId, error, newInvestmentsTransactions, canceledInvestmentsTransactions, environment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvestmentsHistoricalUpdateWebhook {\n");
    sb.append("    webhookType: ").append(toIndentedString(webhookType)).append("\n");
    sb.append("    webhookCode: ").append(toIndentedString(webhookCode)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    newInvestmentsTransactions: ").append(toIndentedString(newInvestmentsTransactions)).append("\n");
    sb.append("    canceledInvestmentsTransactions: ").append(toIndentedString(canceledInvestmentsTransactions)).append("\n");
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

