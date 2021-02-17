/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.5.3
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Fired when an Item’s access consent is expiring in 7 days. Some Items have explicit expiration times and we try to relay this when possible to reduce service disruption. This can be resolved by having the user go through Link’s update mode.
 */
@ApiModel(description = "Fired when an Item’s access consent is expiring in 7 days. Some Items have explicit expiration times and we try to relay this when possible to reduce service disruption. This can be resolved by having the user go through Link’s update mode.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-17T22:11:20.181Z[GMT]")
public class PendingExpirationWebhook {
  public static final String SERIALIZED_NAME_WEBHOOK_TYPE = "webhook_type";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_TYPE)
  private String webhookType;

  public static final String SERIALIZED_NAME_WEBHOOK_CODE = "webhook_code";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_CODE)
  private String webhookCode;

  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private String itemId;

  public static final String SERIALIZED_NAME_CONSENT_EXPIRATION_TIME = "consent_expiration_time";
  @SerializedName(SERIALIZED_NAME_CONSENT_EXPIRATION_TIME)
  private String consentExpirationTime;


  public PendingExpirationWebhook webhookType(String webhookType) {
    
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


  public PendingExpirationWebhook webhookCode(String webhookCode) {
    
    this.webhookCode = webhookCode;
    return this;
  }

   /**
   * &#x60;PENDING_EXPIRATION&#x60;
   * @return webhookCode
  **/
  @ApiModelProperty(required = true, value = "`PENDING_EXPIRATION`")

  public String getWebhookCode() {
    return webhookCode;
  }


  public void setWebhookCode(String webhookCode) {
    this.webhookCode = webhookCode;
  }


  public PendingExpirationWebhook itemId(String itemId) {
    
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


  public PendingExpirationWebhook consentExpirationTime(String consentExpirationTime) {
    
    this.consentExpirationTime = consentExpirationTime;
    return this;
  }

   /**
   * The date and time at which the Item&#39;s access consent will expire, in ISO 8601 format
   * @return consentExpirationTime
  **/
  @ApiModelProperty(required = true, value = "The date and time at which the Item's access consent will expire, in ISO 8601 format")

  public String getConsentExpirationTime() {
    return consentExpirationTime;
  }


  public void setConsentExpirationTime(String consentExpirationTime) {
    this.consentExpirationTime = consentExpirationTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PendingExpirationWebhook pendingExpirationWebhook = (PendingExpirationWebhook) o;
    return Objects.equals(this.webhookType, pendingExpirationWebhook.webhookType) &&
        Objects.equals(this.webhookCode, pendingExpirationWebhook.webhookCode) &&
        Objects.equals(this.itemId, pendingExpirationWebhook.itemId) &&
        Objects.equals(this.consentExpirationTime, pendingExpirationWebhook.consentExpirationTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhookType, webhookCode, itemId, consentExpirationTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PendingExpirationWebhook {\n");
    sb.append("    webhookType: ").append(toIndentedString(webhookType)).append("\n");
    sb.append("    webhookCode: ").append(toIndentedString(webhookCode)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    consentExpirationTime: ").append(toIndentedString(consentExpirationTime)).append("\n");
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

