/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.556.0
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
import com.plaid.client.model.OmittableTransferType;
import com.plaid.client.model.TransferEventType;
import com.plaid.client.model.TransferFailure;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * Represents an event in the Transfers API.
 */
@ApiModel(description = "Represents an event in the Transfers API.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-04T20:03:42.500463Z[Etc/UTC]")
public class TransferEvent {
  public static final String SERIALIZED_NAME_EVENT_ID = "event_id";
  @SerializedName(SERIALIZED_NAME_EVENT_ID)
  private Integer eventId;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private OffsetDateTime timestamp;

  public static final String SERIALIZED_NAME_EVENT_TYPE = "event_type";
  @SerializedName(SERIALIZED_NAME_EVENT_TYPE)
  private TransferEventType eventType;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_FUNDING_ACCOUNT_ID = "funding_account_id";
  @SerializedName(SERIALIZED_NAME_FUNDING_ACCOUNT_ID)
  private String fundingAccountId;

  public static final String SERIALIZED_NAME_LEDGER_ID = "ledger_id";
  @SerializedName(SERIALIZED_NAME_LEDGER_ID)
  private String ledgerId;

  public static final String SERIALIZED_NAME_TRANSFER_ID = "transfer_id";
  @SerializedName(SERIALIZED_NAME_TRANSFER_ID)
  private String transferId;

  public static final String SERIALIZED_NAME_ORIGINATION_ACCOUNT_ID = "origination_account_id";
  @SerializedName(SERIALIZED_NAME_ORIGINATION_ACCOUNT_ID)
  private String originationAccountId;

  public static final String SERIALIZED_NAME_TRANSFER_TYPE = "transfer_type";
  @SerializedName(SERIALIZED_NAME_TRANSFER_TYPE)
  private OmittableTransferType transferType;

  public static final String SERIALIZED_NAME_TRANSFER_AMOUNT = "transfer_amount";
  @SerializedName(SERIALIZED_NAME_TRANSFER_AMOUNT)
  private String transferAmount;

  public static final String SERIALIZED_NAME_FAILURE_REASON = "failure_reason";
  @SerializedName(SERIALIZED_NAME_FAILURE_REASON)
  private TransferFailure failureReason;

  public static final String SERIALIZED_NAME_SWEEP_ID = "sweep_id";
  @SerializedName(SERIALIZED_NAME_SWEEP_ID)
  private String sweepId;

  public static final String SERIALIZED_NAME_SWEEP_AMOUNT = "sweep_amount";
  @SerializedName(SERIALIZED_NAME_SWEEP_AMOUNT)
  private String sweepAmount;

  public static final String SERIALIZED_NAME_REFUND_ID = "refund_id";
  @SerializedName(SERIALIZED_NAME_REFUND_ID)
  private String refundId;

  public static final String SERIALIZED_NAME_ORIGINATOR_CLIENT_ID = "originator_client_id";
  @SerializedName(SERIALIZED_NAME_ORIGINATOR_CLIENT_ID)
  private String originatorClientId;


  public TransferEvent eventId(Integer eventId) {
    
    this.eventId = eventId;
    return this;
  }

   /**
   * Plaid’s unique identifier for this event. IDs are sequential unsigned 64-bit integers.
   * minimum: 0
   * @return eventId
  **/
  @ApiModelProperty(required = true, value = "Plaid’s unique identifier for this event. IDs are sequential unsigned 64-bit integers.")

  public Integer getEventId() {
    return eventId;
  }


  public void setEventId(Integer eventId) {
    this.eventId = eventId;
  }


  public TransferEvent timestamp(OffsetDateTime timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * The datetime when this event occurred. This will be of the form &#x60;2006-01-02T15:04:05Z&#x60;.
   * @return timestamp
  **/
  @ApiModelProperty(required = true, value = "The datetime when this event occurred. This will be of the form `2006-01-02T15:04:05Z`.")

  public OffsetDateTime getTimestamp() {
    return timestamp;
  }


  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }


  public TransferEvent eventType(TransferEventType eventType) {
    
    this.eventType = eventType;
    return this;
  }

   /**
   * Get eventType
   * @return eventType
  **/
  @ApiModelProperty(required = true, value = "")

  public TransferEventType getEventType() {
    return eventType;
  }


  public void setEventType(TransferEventType eventType) {
    this.eventType = eventType;
  }


  public TransferEvent accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * The account ID associated with the transfer. This field is omitted for Plaid Ledger Sweep events.
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The account ID associated with the transfer. This field is omitted for Plaid Ledger Sweep events.")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public TransferEvent fundingAccountId(String fundingAccountId) {
    
    this.fundingAccountId = fundingAccountId;
    return this;
  }

   /**
   * The id of the associated funding account, available in the Plaid Dashboard. If present, this indicates which of your business checking accounts will be credited or debited.
   * @return fundingAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The id of the associated funding account, available in the Plaid Dashboard. If present, this indicates which of your business checking accounts will be credited or debited.")

  public String getFundingAccountId() {
    return fundingAccountId;
  }


  public void setFundingAccountId(String fundingAccountId) {
    this.fundingAccountId = fundingAccountId;
  }


  public TransferEvent ledgerId(String ledgerId) {
    
    this.ledgerId = ledgerId;
    return this;
  }

   /**
   * Plaid’s unique identifier for a Plaid Ledger Balance.
   * @return ledgerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Plaid’s unique identifier for a Plaid Ledger Balance.")

  public String getLedgerId() {
    return ledgerId;
  }


  public void setLedgerId(String ledgerId) {
    this.ledgerId = ledgerId;
  }


  public TransferEvent transferId(String transferId) {
    
    this.transferId = transferId;
    return this;
  }

   /**
   * Plaid’s unique identifier for a transfer. This field is &#x60;null&#x60; for Plaid Ledger Sweep events.
   * @return transferId
  **/
  @ApiModelProperty(required = true, value = "Plaid’s unique identifier for a transfer. This field is `null` for Plaid Ledger Sweep events.")

  public String getTransferId() {
    return transferId;
  }


  public void setTransferId(String transferId) {
    this.transferId = transferId;
  }


  public TransferEvent originationAccountId(String originationAccountId) {
    
    this.originationAccountId = originationAccountId;
    return this;
  }

   /**
   * The ID of the origination account that this balance belongs to.
   * @return originationAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The ID of the origination account that this balance belongs to.")

  public String getOriginationAccountId() {
    return originationAccountId;
  }


  public void setOriginationAccountId(String originationAccountId) {
    this.originationAccountId = originationAccountId;
  }


  public TransferEvent transferType(OmittableTransferType transferType) {
    
    this.transferType = transferType;
    return this;
  }

   /**
   * Get transferType
   * @return transferType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OmittableTransferType getTransferType() {
    return transferType;
  }


  public void setTransferType(OmittableTransferType transferType) {
    this.transferType = transferType;
  }


  public TransferEvent transferAmount(String transferAmount) {
    
    this.transferAmount = transferAmount;
    return this;
  }

   /**
   * The amount of the transfer (decimal string with two digits of precision e.g. \&quot;10.00\&quot;). This field is omitted for Plaid Ledger Sweep events.
   * @return transferAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The amount of the transfer (decimal string with two digits of precision e.g. \"10.00\"). This field is omitted for Plaid Ledger Sweep events.")

  public String getTransferAmount() {
    return transferAmount;
  }


  public void setTransferAmount(String transferAmount) {
    this.transferAmount = transferAmount;
  }


  public TransferEvent failureReason(TransferFailure failureReason) {
    
    this.failureReason = failureReason;
    return this;
  }

   /**
   * Get failureReason
   * @return failureReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public TransferFailure getFailureReason() {
    return failureReason;
  }


  public void setFailureReason(TransferFailure failureReason) {
    this.failureReason = failureReason;
  }


  public TransferEvent sweepId(String sweepId) {
    
    this.sweepId = sweepId;
    return this;
  }

   /**
   * Plaid’s unique identifier for a sweep.
   * @return sweepId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Plaid’s unique identifier for a sweep.")

  public String getSweepId() {
    return sweepId;
  }


  public void setSweepId(String sweepId) {
    this.sweepId = sweepId;
  }


  public TransferEvent sweepAmount(String sweepAmount) {
    
    this.sweepAmount = sweepAmount;
    return this;
  }

   /**
   * A signed amount of how much was &#x60;swept&#x60; or &#x60;return_swept&#x60; for this transfer (decimal string with two digits of precision e.g. \&quot;-5.50\&quot;).
   * @return sweepAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "A signed amount of how much was `swept` or `return_swept` for this transfer (decimal string with two digits of precision e.g. \"-5.50\").")

  public String getSweepAmount() {
    return sweepAmount;
  }


  public void setSweepAmount(String sweepAmount) {
    this.sweepAmount = sweepAmount;
  }


  public TransferEvent refundId(String refundId) {
    
    this.refundId = refundId;
    return this;
  }

   /**
   * Plaid’s unique identifier for a refund. A non-null value indicates the event is for the associated refund of the transfer.
   * @return refundId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Plaid’s unique identifier for a refund. A non-null value indicates the event is for the associated refund of the transfer.")

  public String getRefundId() {
    return refundId;
  }


  public void setRefundId(String refundId) {
    this.refundId = refundId;
  }


  public TransferEvent originatorClientId(String originatorClientId) {
    
    this.originatorClientId = originatorClientId;
    return this;
  }

   /**
   * The Plaid client ID that is the originator of the transfer that this event applies to. Only present if the transfer was created on behalf of another client as a third-party sender (TPS).
   * @return originatorClientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The Plaid client ID that is the originator of the transfer that this event applies to. Only present if the transfer was created on behalf of another client as a third-party sender (TPS).")

  public String getOriginatorClientId() {
    return originatorClientId;
  }


  public void setOriginatorClientId(String originatorClientId) {
    this.originatorClientId = originatorClientId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferEvent transferEvent = (TransferEvent) o;
    return Objects.equals(this.eventId, transferEvent.eventId) &&
        Objects.equals(this.timestamp, transferEvent.timestamp) &&
        Objects.equals(this.eventType, transferEvent.eventType) &&
        Objects.equals(this.accountId, transferEvent.accountId) &&
        Objects.equals(this.fundingAccountId, transferEvent.fundingAccountId) &&
        Objects.equals(this.ledgerId, transferEvent.ledgerId) &&
        Objects.equals(this.transferId, transferEvent.transferId) &&
        Objects.equals(this.originationAccountId, transferEvent.originationAccountId) &&
        Objects.equals(this.transferType, transferEvent.transferType) &&
        Objects.equals(this.transferAmount, transferEvent.transferAmount) &&
        Objects.equals(this.failureReason, transferEvent.failureReason) &&
        Objects.equals(this.sweepId, transferEvent.sweepId) &&
        Objects.equals(this.sweepAmount, transferEvent.sweepAmount) &&
        Objects.equals(this.refundId, transferEvent.refundId) &&
        Objects.equals(this.originatorClientId, transferEvent.originatorClientId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, timestamp, eventType, accountId, fundingAccountId, ledgerId, transferId, originationAccountId, transferType, transferAmount, failureReason, sweepId, sweepAmount, refundId, originatorClientId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferEvent {\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    fundingAccountId: ").append(toIndentedString(fundingAccountId)).append("\n");
    sb.append("    ledgerId: ").append(toIndentedString(ledgerId)).append("\n");
    sb.append("    transferId: ").append(toIndentedString(transferId)).append("\n");
    sb.append("    originationAccountId: ").append(toIndentedString(originationAccountId)).append("\n");
    sb.append("    transferType: ").append(toIndentedString(transferType)).append("\n");
    sb.append("    transferAmount: ").append(toIndentedString(transferAmount)).append("\n");
    sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
    sb.append("    sweepId: ").append(toIndentedString(sweepId)).append("\n");
    sb.append("    sweepAmount: ").append(toIndentedString(sweepAmount)).append("\n");
    sb.append("    refundId: ").append(toIndentedString(refundId)).append("\n");
    sb.append("    originatorClientId: ").append(toIndentedString(originatorClientId)).append("\n");
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

