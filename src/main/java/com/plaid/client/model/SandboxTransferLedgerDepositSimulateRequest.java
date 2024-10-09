/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.575.0
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
import com.plaid.client.model.TransferLedgerSweepSimulateEventType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Defines the request schema for &#x60;/sandbox/transfer/ledger/deposit/simulate&#x60;
 */
@ApiModel(description = "Defines the request schema for `/sandbox/transfer/ledger/deposit/simulate`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-09T17:51:17.896278Z[Etc/UTC]")
public class SandboxTransferLedgerDepositSimulateRequest {
  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_SWEEP_ID = "sweep_id";
  @SerializedName(SERIALIZED_NAME_SWEEP_ID)
  private String sweepId;

  public static final String SERIALIZED_NAME_EVENT_TYPE = "event_type";
  @SerializedName(SERIALIZED_NAME_EVENT_TYPE)
  private TransferLedgerSweepSimulateEventType eventType;

  public static final String SERIALIZED_NAME_FAILURE_REASON = "failure_reason";
  @SerializedName(SERIALIZED_NAME_FAILURE_REASON)
  private TransferFailure failureReason;


  public SandboxTransferLedgerDepositSimulateRequest clientId(String clientId) {
    
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


  public SandboxTransferLedgerDepositSimulateRequest secret(String secret) {
    
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


  public SandboxTransferLedgerDepositSimulateRequest sweepId(String sweepId) {
    
    this.sweepId = sweepId;
    return this;
  }

   /**
   * Plaid’s unique identifier for a sweep.
   * @return sweepId
  **/
  @ApiModelProperty(required = true, value = "Plaid’s unique identifier for a sweep.")

  public String getSweepId() {
    return sweepId;
  }


  public void setSweepId(String sweepId) {
    this.sweepId = sweepId;
  }


  public SandboxTransferLedgerDepositSimulateRequest eventType(TransferLedgerSweepSimulateEventType eventType) {
    
    this.eventType = eventType;
    return this;
  }

   /**
   * Get eventType
   * @return eventType
  **/
  @ApiModelProperty(required = true, value = "")

  public TransferLedgerSweepSimulateEventType getEventType() {
    return eventType;
  }


  public void setEventType(TransferLedgerSweepSimulateEventType eventType) {
    this.eventType = eventType;
  }


  public SandboxTransferLedgerDepositSimulateRequest failureReason(TransferFailure failureReason) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SandboxTransferLedgerDepositSimulateRequest sandboxTransferLedgerDepositSimulateRequest = (SandboxTransferLedgerDepositSimulateRequest) o;
    return Objects.equals(this.clientId, sandboxTransferLedgerDepositSimulateRequest.clientId) &&
        Objects.equals(this.secret, sandboxTransferLedgerDepositSimulateRequest.secret) &&
        Objects.equals(this.sweepId, sandboxTransferLedgerDepositSimulateRequest.sweepId) &&
        Objects.equals(this.eventType, sandboxTransferLedgerDepositSimulateRequest.eventType) &&
        Objects.equals(this.failureReason, sandboxTransferLedgerDepositSimulateRequest.failureReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, secret, sweepId, eventType, failureReason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SandboxTransferLedgerDepositSimulateRequest {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    sweepId: ").append(toIndentedString(sweepId)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
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

