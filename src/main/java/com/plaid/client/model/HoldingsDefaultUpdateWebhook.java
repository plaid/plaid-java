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
import com.plaid.client.model.PlaidError;
import com.plaid.client.model.WebhookEnvironmentValues;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * Fired when new or updated holdings have been detected on an investment account. The webhook typically fires in response to any newly added holdings or price changes to existing holdings, most commonly after market close.
 */
@ApiModel(description = "Fired when new or updated holdings have been detected on an investment account. The webhook typically fires in response to any newly added holdings or price changes to existing holdings, most commonly after market close.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-12T21:24:48.076128Z[Etc/UTC]")
public class HoldingsDefaultUpdateWebhook {
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

  public static final String SERIALIZED_NAME_NEW_HOLDINGS = "new_holdings";
  @SerializedName(SERIALIZED_NAME_NEW_HOLDINGS)
  private Double newHoldings;

  public static final String SERIALIZED_NAME_UPDATED_HOLDINGS = "updated_holdings";
  @SerializedName(SERIALIZED_NAME_UPDATED_HOLDINGS)
  private Double updatedHoldings;

  public static final String SERIALIZED_NAME_ENVIRONMENT = "environment";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT)
  private WebhookEnvironmentValues environment;


  public HoldingsDefaultUpdateWebhook webhookType(String webhookType) {
    
    this.webhookType = webhookType;
    return this;
  }

   /**
   * &#x60;HOLDINGS&#x60;
   * @return webhookType
  **/
  @ApiModelProperty(required = true, value = "`HOLDINGS`")

  public String getWebhookType() {
    return webhookType;
  }


  public void setWebhookType(String webhookType) {
    this.webhookType = webhookType;
  }


  public HoldingsDefaultUpdateWebhook webhookCode(String webhookCode) {
    
    this.webhookCode = webhookCode;
    return this;
  }

   /**
   * &#x60;DEFAULT_UPDATE&#x60;
   * @return webhookCode
  **/
  @ApiModelProperty(required = true, value = "`DEFAULT_UPDATE`")

  public String getWebhookCode() {
    return webhookCode;
  }


  public void setWebhookCode(String webhookCode) {
    this.webhookCode = webhookCode;
  }


  public HoldingsDefaultUpdateWebhook itemId(String itemId) {
    
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


  public HoldingsDefaultUpdateWebhook error(PlaidError error) {
    
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


  public HoldingsDefaultUpdateWebhook newHoldings(Double newHoldings) {
    
    this.newHoldings = newHoldings;
    return this;
  }

   /**
   * The number of new holdings reported since the last time this webhook was fired.
   * @return newHoldings
  **/
  @ApiModelProperty(required = true, value = "The number of new holdings reported since the last time this webhook was fired.")

  public Double getNewHoldings() {
    return newHoldings;
  }


  public void setNewHoldings(Double newHoldings) {
    this.newHoldings = newHoldings;
  }


  public HoldingsDefaultUpdateWebhook updatedHoldings(Double updatedHoldings) {
    
    this.updatedHoldings = updatedHoldings;
    return this;
  }

   /**
   * The number of updated holdings reported since the last time this webhook was fired.
   * @return updatedHoldings
  **/
  @ApiModelProperty(required = true, value = "The number of updated holdings reported since the last time this webhook was fired.")

  public Double getUpdatedHoldings() {
    return updatedHoldings;
  }


  public void setUpdatedHoldings(Double updatedHoldings) {
    this.updatedHoldings = updatedHoldings;
  }


  public HoldingsDefaultUpdateWebhook environment(WebhookEnvironmentValues environment) {
    
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
    HoldingsDefaultUpdateWebhook holdingsDefaultUpdateWebhook = (HoldingsDefaultUpdateWebhook) o;
    return Objects.equals(this.webhookType, holdingsDefaultUpdateWebhook.webhookType) &&
        Objects.equals(this.webhookCode, holdingsDefaultUpdateWebhook.webhookCode) &&
        Objects.equals(this.itemId, holdingsDefaultUpdateWebhook.itemId) &&
        Objects.equals(this.error, holdingsDefaultUpdateWebhook.error) &&
        Objects.equals(this.newHoldings, holdingsDefaultUpdateWebhook.newHoldings) &&
        Objects.equals(this.updatedHoldings, holdingsDefaultUpdateWebhook.updatedHoldings) &&
        Objects.equals(this.environment, holdingsDefaultUpdateWebhook.environment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhookType, webhookCode, itemId, error, newHoldings, updatedHoldings, environment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HoldingsDefaultUpdateWebhook {\n");
    sb.append("    webhookType: ").append(toIndentedString(webhookType)).append("\n");
    sb.append("    webhookCode: ").append(toIndentedString(webhookCode)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    newHoldings: ").append(toIndentedString(newHoldings)).append("\n");
    sb.append("    updatedHoldings: ").append(toIndentedString(updatedHoldings)).append("\n");
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

