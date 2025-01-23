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
 * The &#x60;USER_ACCOUNT_REVOKED&#x60; webhook is fired when an end user has revoked access to their account on the Data Provider&#39;s portal. This webhook is currently sent only for Chase and PNC Items, but may be sent in the future for other financial institutions that allow account-level permissions revocation through their portals. Upon receiving this webhook, it is recommended to delete any Plaid-derived data you have stored that is associated with the revoked account.  If you are using Auth and receive this webhook, this webhook indicates that the TAN associated with the revoked account is no longer valid and cannot be used to create new transfers. You should not create new ACH transfers for the account that was revoked until access has been re-granted.  You can request the user to re-grant access to their account by sending them through [update mode](https://www.plaid.com/docs/link/update-mode). Alternatively, they may re-grant access directly through the Data Provider&#39;s portal.  After the user has re-granted access, Auth customers should call the auth endpoint again to obtain the new TAN.
 */
@ApiModel(description = "The `USER_ACCOUNT_REVOKED` webhook is fired when an end user has revoked access to their account on the Data Provider's portal. This webhook is currently sent only for Chase and PNC Items, but may be sent in the future for other financial institutions that allow account-level permissions revocation through their portals. Upon receiving this webhook, it is recommended to delete any Plaid-derived data you have stored that is associated with the revoked account.  If you are using Auth and receive this webhook, this webhook indicates that the TAN associated with the revoked account is no longer valid and cannot be used to create new transfers. You should not create new ACH transfers for the account that was revoked until access has been re-granted.  You can request the user to re-grant access to their account by sending them through [update mode](https://www.plaid.com/docs/link/update-mode). Alternatively, they may re-grant access directly through the Data Provider's portal.  After the user has re-granted access, Auth customers should call the auth endpoint again to obtain the new TAN.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-23T20:55:58.809242Z[Etc/UTC]")
public class UserAccountRevokedWebhook {
  public static final String SERIALIZED_NAME_WEBHOOK_TYPE = "webhook_type";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_TYPE)
  private String webhookType;

  public static final String SERIALIZED_NAME_WEBHOOK_CODE = "webhook_code";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_CODE)
  private String webhookCode;

  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private String itemId;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_ENVIRONMENT = "environment";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT)
  private WebhookEnvironmentValues environment;


  public UserAccountRevokedWebhook webhookType(String webhookType) {
    
    this.webhookType = webhookType;
    return this;
  }

   /**
   * &#x60;ITEM&#x60;
   * @return webhookType
  **/
  @ApiModelProperty(required = true, value = "`ITEM`")

  public String getWebhookType() {
    return webhookType;
  }


  public void setWebhookType(String webhookType) {
    this.webhookType = webhookType;
  }


  public UserAccountRevokedWebhook webhookCode(String webhookCode) {
    
    this.webhookCode = webhookCode;
    return this;
  }

   /**
   * &#x60;USER_ACCOUNT_REVOKED&#x60;
   * @return webhookCode
  **/
  @ApiModelProperty(required = true, value = "`USER_ACCOUNT_REVOKED`")

  public String getWebhookCode() {
    return webhookCode;
  }


  public void setWebhookCode(String webhookCode) {
    this.webhookCode = webhookCode;
  }


  public UserAccountRevokedWebhook itemId(String itemId) {
    
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


  public UserAccountRevokedWebhook accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * The external account ID of the affected account
   * @return accountId
  **/
  @ApiModelProperty(required = true, value = "The external account ID of the affected account")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public UserAccountRevokedWebhook environment(WebhookEnvironmentValues environment) {
    
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
    UserAccountRevokedWebhook userAccountRevokedWebhook = (UserAccountRevokedWebhook) o;
    return Objects.equals(this.webhookType, userAccountRevokedWebhook.webhookType) &&
        Objects.equals(this.webhookCode, userAccountRevokedWebhook.webhookCode) &&
        Objects.equals(this.itemId, userAccountRevokedWebhook.itemId) &&
        Objects.equals(this.accountId, userAccountRevokedWebhook.accountId) &&
        Objects.equals(this.environment, userAccountRevokedWebhook.environment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhookType, webhookCode, itemId, accountId, environment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAccountRevokedWebhook {\n");
    sb.append("    webhookType: ").append(toIndentedString(webhookType)).append("\n");
    sb.append("    webhookCode: ").append(toIndentedString(webhookCode)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
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

