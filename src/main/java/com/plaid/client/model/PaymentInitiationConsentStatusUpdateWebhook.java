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
import com.plaid.client.model.PaymentInitiationConsentStatus;
import com.plaid.client.model.PlaidError;
import com.plaid.client.model.WebhookEnvironmentValues;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * Fired when the status of a payment consent has changed.
 */
@ApiModel(description = "Fired when the status of a payment consent has changed.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-23T18:11:57.813484Z[Etc/UTC]")
public class PaymentInitiationConsentStatusUpdateWebhook {
  public static final String SERIALIZED_NAME_WEBHOOK_TYPE = "webhook_type";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_TYPE)
  private String webhookType;

  public static final String SERIALIZED_NAME_WEBHOOK_CODE = "webhook_code";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_CODE)
  private String webhookCode;

  public static final String SERIALIZED_NAME_CONSENT_ID = "consent_id";
  @SerializedName(SERIALIZED_NAME_CONSENT_ID)
  private String consentId;

  public static final String SERIALIZED_NAME_OLD_STATUS = "old_status";
  @SerializedName(SERIALIZED_NAME_OLD_STATUS)
  private PaymentInitiationConsentStatus oldStatus;

  public static final String SERIALIZED_NAME_NEW_STATUS = "new_status";
  @SerializedName(SERIALIZED_NAME_NEW_STATUS)
  private PaymentInitiationConsentStatus newStatus;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private OffsetDateTime timestamp;

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private PlaidError error;

  public static final String SERIALIZED_NAME_ENVIRONMENT = "environment";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT)
  private WebhookEnvironmentValues environment;


  public PaymentInitiationConsentStatusUpdateWebhook webhookType(String webhookType) {
    
    this.webhookType = webhookType;
    return this;
  }

   /**
   * &#x60;PAYMENT_INITIATION&#x60;
   * @return webhookType
  **/
  @ApiModelProperty(required = true, value = "`PAYMENT_INITIATION`")

  public String getWebhookType() {
    return webhookType;
  }


  public void setWebhookType(String webhookType) {
    this.webhookType = webhookType;
  }


  public PaymentInitiationConsentStatusUpdateWebhook webhookCode(String webhookCode) {
    
    this.webhookCode = webhookCode;
    return this;
  }

   /**
   * &#x60;CONSENT_STATUS_UPDATE&#x60;
   * @return webhookCode
  **/
  @ApiModelProperty(required = true, value = "`CONSENT_STATUS_UPDATE`")

  public String getWebhookCode() {
    return webhookCode;
  }


  public void setWebhookCode(String webhookCode) {
    this.webhookCode = webhookCode;
  }


  public PaymentInitiationConsentStatusUpdateWebhook consentId(String consentId) {
    
    this.consentId = consentId;
    return this;
  }

   /**
   * The &#x60;id&#x60; for the consent being updated
   * @return consentId
  **/
  @ApiModelProperty(required = true, value = "The `id` for the consent being updated")

  public String getConsentId() {
    return consentId;
  }


  public void setConsentId(String consentId) {
    this.consentId = consentId;
  }


  public PaymentInitiationConsentStatusUpdateWebhook oldStatus(PaymentInitiationConsentStatus oldStatus) {
    
    this.oldStatus = oldStatus;
    return this;
  }

   /**
   * Get oldStatus
   * @return oldStatus
  **/
  @ApiModelProperty(required = true, value = "")

  public PaymentInitiationConsentStatus getOldStatus() {
    return oldStatus;
  }


  public void setOldStatus(PaymentInitiationConsentStatus oldStatus) {
    this.oldStatus = oldStatus;
  }


  public PaymentInitiationConsentStatusUpdateWebhook newStatus(PaymentInitiationConsentStatus newStatus) {
    
    this.newStatus = newStatus;
    return this;
  }

   /**
   * Get newStatus
   * @return newStatus
  **/
  @ApiModelProperty(required = true, value = "")

  public PaymentInitiationConsentStatus getNewStatus() {
    return newStatus;
  }


  public void setNewStatus(PaymentInitiationConsentStatus newStatus) {
    this.newStatus = newStatus;
  }


  public PaymentInitiationConsentStatusUpdateWebhook timestamp(OffsetDateTime timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * The timestamp of the update, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format, e.g. &#x60;\&quot;2017-09-14T14:42:19.350Z\&quot;&#x60;
   * @return timestamp
  **/
  @ApiModelProperty(required = true, value = "The timestamp of the update, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format, e.g. `\"2017-09-14T14:42:19.350Z\"`")

  public OffsetDateTime getTimestamp() {
    return timestamp;
  }


  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }


  public PaymentInitiationConsentStatusUpdateWebhook error(PlaidError error) {
    
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


  public PaymentInitiationConsentStatusUpdateWebhook environment(WebhookEnvironmentValues environment) {
    
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
    PaymentInitiationConsentStatusUpdateWebhook paymentInitiationConsentStatusUpdateWebhook = (PaymentInitiationConsentStatusUpdateWebhook) o;
    return Objects.equals(this.webhookType, paymentInitiationConsentStatusUpdateWebhook.webhookType) &&
        Objects.equals(this.webhookCode, paymentInitiationConsentStatusUpdateWebhook.webhookCode) &&
        Objects.equals(this.consentId, paymentInitiationConsentStatusUpdateWebhook.consentId) &&
        Objects.equals(this.oldStatus, paymentInitiationConsentStatusUpdateWebhook.oldStatus) &&
        Objects.equals(this.newStatus, paymentInitiationConsentStatusUpdateWebhook.newStatus) &&
        Objects.equals(this.timestamp, paymentInitiationConsentStatusUpdateWebhook.timestamp) &&
        Objects.equals(this.error, paymentInitiationConsentStatusUpdateWebhook.error) &&
        Objects.equals(this.environment, paymentInitiationConsentStatusUpdateWebhook.environment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhookType, webhookCode, consentId, oldStatus, newStatus, timestamp, error, environment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentInitiationConsentStatusUpdateWebhook {\n");
    sb.append("    webhookType: ").append(toIndentedString(webhookType)).append("\n");
    sb.append("    webhookCode: ").append(toIndentedString(webhookCode)).append("\n");
    sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
    sb.append("    oldStatus: ").append(toIndentedString(oldStatus)).append("\n");
    sb.append("    newStatus: ").append(toIndentedString(newStatus)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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

