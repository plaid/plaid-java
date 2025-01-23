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
import com.plaid.client.model.PlaidError;
import com.plaid.client.model.WebhookEnvironmentValues;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Fired when Plaid detects a new account. Upon receiving this webhook, you can prompt your users to share new accounts with you through [update mode](https://plaid.com/docs/link/update-mode/#using-update-mode-to-request-new-accounts) (US/CA only). If the end user has opted not to share new accounts with Plaid via their institution&#39;s OAuth settings, Plaid will not detect new accounts and this webhook will not fire. For end user accounts in the EU and UK, upon receiving this webhook, you can prompt your user to re-link their account and then delete the old Item via &#x60;/item/remove&#x60;.
 */
@ApiModel(description = "Fired when Plaid detects a new account. Upon receiving this webhook, you can prompt your users to share new accounts with you through [update mode](https://plaid.com/docs/link/update-mode/#using-update-mode-to-request-new-accounts) (US/CA only). If the end user has opted not to share new accounts with Plaid via their institution's OAuth settings, Plaid will not detect new accounts and this webhook will not fire. For end user accounts in the EU and UK, upon receiving this webhook, you can prompt your user to re-link their account and then delete the old Item via `/item/remove`.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-23T20:55:58.809242Z[Etc/UTC]")
public class NewAccountsAvailableWebhook {
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

  public static final String SERIALIZED_NAME_ENVIRONMENT = "environment";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT)
  private WebhookEnvironmentValues environment;


  public NewAccountsAvailableWebhook webhookType(String webhookType) {
    
    this.webhookType = webhookType;
    return this;
  }

   /**
   * &#x60;ITEM&#x60;
   * @return webhookType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "`ITEM`")

  public String getWebhookType() {
    return webhookType;
  }


  public void setWebhookType(String webhookType) {
    this.webhookType = webhookType;
  }


  public NewAccountsAvailableWebhook webhookCode(String webhookCode) {
    
    this.webhookCode = webhookCode;
    return this;
  }

   /**
   * &#x60;NEW_ACCOUNTS_AVAILABLE&#x60;
   * @return webhookCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "`NEW_ACCOUNTS_AVAILABLE`")

  public String getWebhookCode() {
    return webhookCode;
  }


  public void setWebhookCode(String webhookCode) {
    this.webhookCode = webhookCode;
  }


  public NewAccountsAvailableWebhook itemId(String itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * The &#x60;item_id&#x60; of the Item associated with this webhook, warning, or error
   * @return itemId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The `item_id` of the Item associated with this webhook, warning, or error")

  public String getItemId() {
    return itemId;
  }


  public void setItemId(String itemId) {
    this.itemId = itemId;
  }


  public NewAccountsAvailableWebhook error(PlaidError error) {
    
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


  public NewAccountsAvailableWebhook environment(WebhookEnvironmentValues environment) {
    
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
    NewAccountsAvailableWebhook newAccountsAvailableWebhook = (NewAccountsAvailableWebhook) o;
    return Objects.equals(this.webhookType, newAccountsAvailableWebhook.webhookType) &&
        Objects.equals(this.webhookCode, newAccountsAvailableWebhook.webhookCode) &&
        Objects.equals(this.itemId, newAccountsAvailableWebhook.itemId) &&
        Objects.equals(this.error, newAccountsAvailableWebhook.error) &&
        Objects.equals(this.environment, newAccountsAvailableWebhook.environment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhookType, webhookCode, itemId, error, environment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewAccountsAvailableWebhook {\n");
    sb.append("    webhookType: ").append(toIndentedString(webhookType)).append("\n");
    sb.append("    webhookCode: ").append(toIndentedString(webhookCode)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

