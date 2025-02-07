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
import com.plaid.client.model.WebhookEnvironmentValues;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Contains the state of a SMS same-day microdeposits verification session.
 */
@ApiModel(description = "Contains the state of a SMS same-day microdeposits verification session.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-07T19:05:33.763924Z[Etc/UTC]")
public class HostedMMDVerificationWebhook {
  public static final String SERIALIZED_NAME_WEBHOOK_TYPE = "webhook_type";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_TYPE)
  private String webhookType;

  public static final String SERIALIZED_NAME_WEBHOOK_CODE = "webhook_code";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_CODE)
  private String webhookCode;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private String itemId;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_ENVIRONMENT = "environment";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT)
  private WebhookEnvironmentValues environment;


  public HostedMMDVerificationWebhook webhookType(String webhookType) {
    
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


  public HostedMMDVerificationWebhook webhookCode(String webhookCode) {
    
    this.webhookCode = webhookCode;
    return this;
  }

   /**
   * &#x60;SMS_MICRODEPOSITS_VERIFICATION&#x60;
   * @return webhookCode
  **/
  @ApiModelProperty(required = true, value = "`SMS_MICRODEPOSITS_VERIFICATION`")

  public String getWebhookCode() {
    return webhookCode;
  }


  public void setWebhookCode(String webhookCode) {
    this.webhookCode = webhookCode;
  }


  public HostedMMDVerificationWebhook status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * The final status of the same-day microdeposits verification. Will always be &#x60;MANUALLY_VERIFIED&#x60; or &#x60;VERIFICATION_FAILED&#x60;.
   * @return status
  **/
  @ApiModelProperty(required = true, value = "The final status of the same-day microdeposits verification. Will always be `MANUALLY_VERIFIED` or `VERIFICATION_FAILED`.")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public HostedMMDVerificationWebhook itemId(String itemId) {
    
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


  public HostedMMDVerificationWebhook accountId(String accountId) {
    
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


  public HostedMMDVerificationWebhook environment(WebhookEnvironmentValues environment) {
    
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
    HostedMMDVerificationWebhook hostedMMDVerificationWebhook = (HostedMMDVerificationWebhook) o;
    return Objects.equals(this.webhookType, hostedMMDVerificationWebhook.webhookType) &&
        Objects.equals(this.webhookCode, hostedMMDVerificationWebhook.webhookCode) &&
        Objects.equals(this.status, hostedMMDVerificationWebhook.status) &&
        Objects.equals(this.itemId, hostedMMDVerificationWebhook.itemId) &&
        Objects.equals(this.accountId, hostedMMDVerificationWebhook.accountId) &&
        Objects.equals(this.environment, hostedMMDVerificationWebhook.environment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhookType, webhookCode, status, itemId, accountId, environment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HostedMMDVerificationWebhook {\n");
    sb.append("    webhookType: ").append(toIndentedString(webhookType)).append("\n");
    sb.append("    webhookCode: ").append(toIndentedString(webhookCode)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

