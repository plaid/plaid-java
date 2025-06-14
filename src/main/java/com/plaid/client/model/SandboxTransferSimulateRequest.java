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
import com.plaid.client.model.TransferFailure;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Defines the request schema for &#x60;/sandbox/transfer/simulate&#x60;
 */
@ApiModel(description = "Defines the request schema for `/sandbox/transfer/simulate`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-12T21:24:48.076128Z[Etc/UTC]")
public class SandboxTransferSimulateRequest {
  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_TRANSFER_ID = "transfer_id";
  @SerializedName(SERIALIZED_NAME_TRANSFER_ID)
  private String transferId;

  public static final String SERIALIZED_NAME_TEST_CLOCK_ID = "test_clock_id";
  @SerializedName(SERIALIZED_NAME_TEST_CLOCK_ID)
  private String testClockId;

  public static final String SERIALIZED_NAME_EVENT_TYPE = "event_type";
  @SerializedName(SERIALIZED_NAME_EVENT_TYPE)
  private String eventType;

  public static final String SERIALIZED_NAME_FAILURE_REASON = "failure_reason";
  @SerializedName(SERIALIZED_NAME_FAILURE_REASON)
  private TransferFailure failureReason;

  public static final String SERIALIZED_NAME_WEBHOOK = "webhook";
  @SerializedName(SERIALIZED_NAME_WEBHOOK)
  private String webhook;


  public SandboxTransferSimulateRequest clientId(String clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * Your Plaid API &#x60;client_id&#x60;. The &#x60;client_id&#x60; is required and may be provided either in the &#x60;PLAID-CLIENT-ID&#x60; header or as part of a request body.
   * @return clientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Your Plaid API `client_id`. The `client_id` is required and may be provided either in the `PLAID-CLIENT-ID` header or as part of a request body.")

  public String getClientId() {
    return clientId;
  }


  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public SandboxTransferSimulateRequest secret(String secret) {
    
    this.secret = secret;
    return this;
  }

   /**
   * Your Plaid API &#x60;secret&#x60;. The &#x60;secret&#x60; is required and may be provided either in the &#x60;PLAID-SECRET&#x60; header or as part of a request body.
   * @return secret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Your Plaid API `secret`. The `secret` is required and may be provided either in the `PLAID-SECRET` header or as part of a request body.")

  public String getSecret() {
    return secret;
  }


  public void setSecret(String secret) {
    this.secret = secret;
  }


  public SandboxTransferSimulateRequest transferId(String transferId) {
    
    this.transferId = transferId;
    return this;
  }

   /**
   * Plaid’s unique identifier for a transfer.
   * @return transferId
  **/
  @ApiModelProperty(required = true, value = "Plaid’s unique identifier for a transfer.")

  public String getTransferId() {
    return transferId;
  }


  public void setTransferId(String transferId) {
    this.transferId = transferId;
  }


  public SandboxTransferSimulateRequest testClockId(String testClockId) {
    
    this.testClockId = testClockId;
    return this;
  }

   /**
   * Plaid’s unique identifier for a test clock. If provided, the event to be simulated is created at the &#x60;virtual_time&#x60; on the provided &#x60;test_clock&#x60;.
   * @return testClockId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Plaid’s unique identifier for a test clock. If provided, the event to be simulated is created at the `virtual_time` on the provided `test_clock`.")

  public String getTestClockId() {
    return testClockId;
  }


  public void setTestClockId(String testClockId) {
    this.testClockId = testClockId;
  }


  public SandboxTransferSimulateRequest eventType(String eventType) {
    
    this.eventType = eventType;
    return this;
  }

   /**
   * The asynchronous event to be simulated. May be: &#x60;posted&#x60;, &#x60;settled&#x60;, &#x60;failed&#x60;, &#x60;funds_available&#x60;, or &#x60;returned&#x60;.  An error will be returned if the event type is incompatible with the current transfer status. Compatible status --&gt; event type transitions include:  &#x60;pending&#x60; --&gt; &#x60;failed&#x60;  &#x60;pending&#x60; --&gt; &#x60;posted&#x60;  &#x60;posted&#x60; --&gt; &#x60;returned&#x60;  &#x60;posted&#x60; --&gt; &#x60;settled&#x60;  &#x60;settled&#x60; --&gt; &#x60;funds_available&#x60; (only applicable to ACH debits.) 
   * @return eventType
  **/
  @ApiModelProperty(required = true, value = "The asynchronous event to be simulated. May be: `posted`, `settled`, `failed`, `funds_available`, or `returned`.  An error will be returned if the event type is incompatible with the current transfer status. Compatible status --> event type transitions include:  `pending` --> `failed`  `pending` --> `posted`  `posted` --> `returned`  `posted` --> `settled`  `settled` --> `funds_available` (only applicable to ACH debits.) ")

  public String getEventType() {
    return eventType;
  }


  public void setEventType(String eventType) {
    this.eventType = eventType;
  }


  public SandboxTransferSimulateRequest failureReason(TransferFailure failureReason) {
    
    this.failureReason = failureReason;
    return this;
  }

   /**
   * Get failureReason
   * @return failureReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TransferFailure getFailureReason() {
    return failureReason;
  }


  public void setFailureReason(TransferFailure failureReason) {
    this.failureReason = failureReason;
  }


  public SandboxTransferSimulateRequest webhook(String webhook) {
    
    this.webhook = webhook;
    return this;
  }

   /**
   * The webhook URL to which a &#x60;TRANSFER_EVENTS_UPDATE&#x60; webhook should be sent.
   * @return webhook
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The webhook URL to which a `TRANSFER_EVENTS_UPDATE` webhook should be sent.")

  public String getWebhook() {
    return webhook;
  }


  public void setWebhook(String webhook) {
    this.webhook = webhook;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SandboxTransferSimulateRequest sandboxTransferSimulateRequest = (SandboxTransferSimulateRequest) o;
    return Objects.equals(this.clientId, sandboxTransferSimulateRequest.clientId) &&
        Objects.equals(this.secret, sandboxTransferSimulateRequest.secret) &&
        Objects.equals(this.transferId, sandboxTransferSimulateRequest.transferId) &&
        Objects.equals(this.testClockId, sandboxTransferSimulateRequest.testClockId) &&
        Objects.equals(this.eventType, sandboxTransferSimulateRequest.eventType) &&
        Objects.equals(this.failureReason, sandboxTransferSimulateRequest.failureReason) &&
        Objects.equals(this.webhook, sandboxTransferSimulateRequest.webhook);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, secret, transferId, testClockId, eventType, failureReason, webhook);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SandboxTransferSimulateRequest {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    transferId: ").append(toIndentedString(transferId)).append("\n");
    sb.append("    testClockId: ").append(toIndentedString(testClockId)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
    sb.append("    webhook: ").append(toIndentedString(webhook)).append("\n");
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

