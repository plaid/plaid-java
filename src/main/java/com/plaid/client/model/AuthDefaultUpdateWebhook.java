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
import com.plaid.client.model.AuthUpdateTypes;
import com.plaid.client.model.PlaidError;
import com.plaid.client.model.WebhookEnvironmentValues;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Plaid will trigger a &#x60;DEFAULT_UPDATE&#x60; webhook for Items that undergo a change in Auth data. This is generally caused by data partners notifying Plaid of a change in their account numbering system or to their routing numbers. To avoid returned transactions, customers that receive a &#x60;DEFAULT_UPDATE&#x60; webhook with the &#x60;account_ids_with_updated_auth&#x60; object populated should immediately discontinue all usages of existing Auth data for those accounts and call &#x60;/auth/get&#x60; or &#x60;/processor/auth/get&#x60; to obtain updated account and routing numbers.
 */
@ApiModel(description = "Plaid will trigger a `DEFAULT_UPDATE` webhook for Items that undergo a change in Auth data. This is generally caused by data partners notifying Plaid of a change in their account numbering system or to their routing numbers. To avoid returned transactions, customers that receive a `DEFAULT_UPDATE` webhook with the `account_ids_with_updated_auth` object populated should immediately discontinue all usages of existing Auth data for those accounts and call `/auth/get` or `/processor/auth/get` to obtain updated account and routing numbers.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-12T21:24:48.076128Z[Etc/UTC]")
public class AuthDefaultUpdateWebhook {
  public static final String SERIALIZED_NAME_WEBHOOK_TYPE = "webhook_type";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_TYPE)
  private String webhookType;

  public static final String SERIALIZED_NAME_WEBHOOK_CODE = "webhook_code";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_CODE)
  private String webhookCode;

  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private String itemId;

  public static final String SERIALIZED_NAME_ACCOUNT_IDS_WITH_NEW_AUTH = "account_ids_with_new_auth";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_IDS_WITH_NEW_AUTH)
  private List<String> accountIdsWithNewAuth = new ArrayList<>();

  public static final String SERIALIZED_NAME_ACCOUNT_IDS_WITH_UPDATED_AUTH = "account_ids_with_updated_auth";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_IDS_WITH_UPDATED_AUTH)
  private Map<String, List<AuthUpdateTypes>> accountIdsWithUpdatedAuth = new HashMap<>();

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private PlaidError error;

  public static final String SERIALIZED_NAME_ENVIRONMENT = "environment";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT)
  private WebhookEnvironmentValues environment;


  public AuthDefaultUpdateWebhook webhookType(String webhookType) {
    
    this.webhookType = webhookType;
    return this;
  }

   /**
   * &#x60;AUTH&#x60;
   * @return webhookType
  **/
  @ApiModelProperty(required = true, value = "`AUTH`")

  public String getWebhookType() {
    return webhookType;
  }


  public void setWebhookType(String webhookType) {
    this.webhookType = webhookType;
  }


  public AuthDefaultUpdateWebhook webhookCode(String webhookCode) {
    
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


  public AuthDefaultUpdateWebhook itemId(String itemId) {
    
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


  public AuthDefaultUpdateWebhook accountIdsWithNewAuth(List<String> accountIdsWithNewAuth) {
    
    this.accountIdsWithNewAuth = accountIdsWithNewAuth;
    return this;
  }

  public AuthDefaultUpdateWebhook addAccountIdsWithNewAuthItem(String accountIdsWithNewAuthItem) {
    this.accountIdsWithNewAuth.add(accountIdsWithNewAuthItem);
    return this;
  }

   /**
   * An array of &#x60;account_id&#x60;&#39;s for accounts that contain new auth.
   * @return accountIdsWithNewAuth
  **/
  @ApiModelProperty(required = true, value = "An array of `account_id`'s for accounts that contain new auth.")

  public List<String> getAccountIdsWithNewAuth() {
    return accountIdsWithNewAuth;
  }


  public void setAccountIdsWithNewAuth(List<String> accountIdsWithNewAuth) {
    this.accountIdsWithNewAuth = accountIdsWithNewAuth;
  }


  public AuthDefaultUpdateWebhook accountIdsWithUpdatedAuth(Map<String, List<AuthUpdateTypes>> accountIdsWithUpdatedAuth) {
    
    this.accountIdsWithUpdatedAuth = accountIdsWithUpdatedAuth;
    return this;
  }

  public AuthDefaultUpdateWebhook putAccountIdsWithUpdatedAuthItem(String key, List<AuthUpdateTypes> accountIdsWithUpdatedAuthItem) {
    this.accountIdsWithUpdatedAuth.put(key, accountIdsWithUpdatedAuthItem);
    return this;
  }

   /**
   * An object with keys of &#x60;account_id&#x60;&#39;s that are mapped to their respective auth attributes that changed. &#x60;ACCOUNT_NUMBER&#x60; and &#x60;ROUTING_NUMBER&#x60; are the two potential values that can be flagged as updated.  Example: &#x60;{ \&quot;XMBvvyMGQ1UoLbKByoMqH3nXMj84ALSdE5B58\&quot;: [\&quot;ACCOUNT_NUMBER\&quot;] }&#x60; 
   * @return accountIdsWithUpdatedAuth
  **/
  @ApiModelProperty(required = true, value = "An object with keys of `account_id`'s that are mapped to their respective auth attributes that changed. `ACCOUNT_NUMBER` and `ROUTING_NUMBER` are the two potential values that can be flagged as updated.  Example: `{ \"XMBvvyMGQ1UoLbKByoMqH3nXMj84ALSdE5B58\": [\"ACCOUNT_NUMBER\"] }` ")

  public Map<String, List<AuthUpdateTypes>> getAccountIdsWithUpdatedAuth() {
    return accountIdsWithUpdatedAuth;
  }


  public void setAccountIdsWithUpdatedAuth(Map<String, List<AuthUpdateTypes>> accountIdsWithUpdatedAuth) {
    this.accountIdsWithUpdatedAuth = accountIdsWithUpdatedAuth;
  }


  public AuthDefaultUpdateWebhook error(PlaidError error) {
    
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public PlaidError getError() {
    return error;
  }


  public void setError(PlaidError error) {
    this.error = error;
  }


  public AuthDefaultUpdateWebhook environment(WebhookEnvironmentValues environment) {
    
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
    AuthDefaultUpdateWebhook authDefaultUpdateWebhook = (AuthDefaultUpdateWebhook) o;
    return Objects.equals(this.webhookType, authDefaultUpdateWebhook.webhookType) &&
        Objects.equals(this.webhookCode, authDefaultUpdateWebhook.webhookCode) &&
        Objects.equals(this.itemId, authDefaultUpdateWebhook.itemId) &&
        Objects.equals(this.accountIdsWithNewAuth, authDefaultUpdateWebhook.accountIdsWithNewAuth) &&
        Objects.equals(this.accountIdsWithUpdatedAuth, authDefaultUpdateWebhook.accountIdsWithUpdatedAuth) &&
        Objects.equals(this.error, authDefaultUpdateWebhook.error) &&
        Objects.equals(this.environment, authDefaultUpdateWebhook.environment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhookType, webhookCode, itemId, accountIdsWithNewAuth, accountIdsWithUpdatedAuth, error, environment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthDefaultUpdateWebhook {\n");
    sb.append("    webhookType: ").append(toIndentedString(webhookType)).append("\n");
    sb.append("    webhookCode: ").append(toIndentedString(webhookCode)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    accountIdsWithNewAuth: ").append(toIndentedString(accountIdsWithNewAuth)).append("\n");
    sb.append("    accountIdsWithUpdatedAuth: ").append(toIndentedString(accountIdsWithUpdatedAuth)).append("\n");
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

