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
import com.plaid.client.model.BankTransferDirection;
import com.plaid.client.model.BankTransferEventType;
import com.plaid.client.model.BankTransferFailure;
import com.plaid.client.model.BankTransferType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * Represents an event in the Bank Transfers API.
 */
@ApiModel(description = "Represents an event in the Bank Transfers API.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-09T17:51:17.896278Z[Etc/UTC]")
public class BankTransferEvent {
  public static final String SERIALIZED_NAME_EVENT_ID = "event_id";
  @SerializedName(SERIALIZED_NAME_EVENT_ID)
  private Integer eventId;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private OffsetDateTime timestamp;

  public static final String SERIALIZED_NAME_EVENT_TYPE = "event_type";
  @SerializedName(SERIALIZED_NAME_EVENT_TYPE)
  private BankTransferEventType eventType;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_BANK_TRANSFER_ID = "bank_transfer_id";
  @SerializedName(SERIALIZED_NAME_BANK_TRANSFER_ID)
  private String bankTransferId;

  public static final String SERIALIZED_NAME_ORIGINATION_ACCOUNT_ID = "origination_account_id";
  @SerializedName(SERIALIZED_NAME_ORIGINATION_ACCOUNT_ID)
  private String originationAccountId;

  public static final String SERIALIZED_NAME_BANK_TRANSFER_TYPE = "bank_transfer_type";
  @SerializedName(SERIALIZED_NAME_BANK_TRANSFER_TYPE)
  private BankTransferType bankTransferType;

  public static final String SERIALIZED_NAME_BANK_TRANSFER_AMOUNT = "bank_transfer_amount";
  @SerializedName(SERIALIZED_NAME_BANK_TRANSFER_AMOUNT)
  private String bankTransferAmount;

  public static final String SERIALIZED_NAME_BANK_TRANSFER_ISO_CURRENCY_CODE = "bank_transfer_iso_currency_code";
  @SerializedName(SERIALIZED_NAME_BANK_TRANSFER_ISO_CURRENCY_CODE)
  private String bankTransferIsoCurrencyCode;

  public static final String SERIALIZED_NAME_FAILURE_REASON = "failure_reason";
  @SerializedName(SERIALIZED_NAME_FAILURE_REASON)
  private BankTransferFailure failureReason;

  public static final String SERIALIZED_NAME_DIRECTION = "direction";
  @SerializedName(SERIALIZED_NAME_DIRECTION)
  private BankTransferDirection direction;


  public BankTransferEvent eventId(Integer eventId) {
    
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


  public BankTransferEvent timestamp(OffsetDateTime timestamp) {
    
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


  public BankTransferEvent eventType(BankTransferEventType eventType) {
    
    this.eventType = eventType;
    return this;
  }

   /**
   * Get eventType
   * @return eventType
  **/
  @ApiModelProperty(required = true, value = "")

  public BankTransferEventType getEventType() {
    return eventType;
  }


  public void setEventType(BankTransferEventType eventType) {
    this.eventType = eventType;
  }


  public BankTransferEvent accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * The account ID associated with the bank transfer.
   * @return accountId
  **/
  @ApiModelProperty(required = true, value = "The account ID associated with the bank transfer.")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public BankTransferEvent bankTransferId(String bankTransferId) {
    
    this.bankTransferId = bankTransferId;
    return this;
  }

   /**
   * Plaid’s unique identifier for a bank transfer.
   * @return bankTransferId
  **/
  @ApiModelProperty(required = true, value = "Plaid’s unique identifier for a bank transfer.")

  public String getBankTransferId() {
    return bankTransferId;
  }


  public void setBankTransferId(String bankTransferId) {
    this.bankTransferId = bankTransferId;
  }


  public BankTransferEvent originationAccountId(String originationAccountId) {
    
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


  public BankTransferEvent bankTransferType(BankTransferType bankTransferType) {
    
    this.bankTransferType = bankTransferType;
    return this;
  }

   /**
   * Get bankTransferType
   * @return bankTransferType
  **/
  @ApiModelProperty(required = true, value = "")

  public BankTransferType getBankTransferType() {
    return bankTransferType;
  }


  public void setBankTransferType(BankTransferType bankTransferType) {
    this.bankTransferType = bankTransferType;
  }


  public BankTransferEvent bankTransferAmount(String bankTransferAmount) {
    
    this.bankTransferAmount = bankTransferAmount;
    return this;
  }

   /**
   * The bank transfer amount.
   * @return bankTransferAmount
  **/
  @ApiModelProperty(required = true, value = "The bank transfer amount.")

  public String getBankTransferAmount() {
    return bankTransferAmount;
  }


  public void setBankTransferAmount(String bankTransferAmount) {
    this.bankTransferAmount = bankTransferAmount;
  }


  public BankTransferEvent bankTransferIsoCurrencyCode(String bankTransferIsoCurrencyCode) {
    
    this.bankTransferIsoCurrencyCode = bankTransferIsoCurrencyCode;
    return this;
  }

   /**
   * The currency of the bank transfer amount.
   * @return bankTransferIsoCurrencyCode
  **/
  @ApiModelProperty(required = true, value = "The currency of the bank transfer amount.")

  public String getBankTransferIsoCurrencyCode() {
    return bankTransferIsoCurrencyCode;
  }


  public void setBankTransferIsoCurrencyCode(String bankTransferIsoCurrencyCode) {
    this.bankTransferIsoCurrencyCode = bankTransferIsoCurrencyCode;
  }


  public BankTransferEvent failureReason(BankTransferFailure failureReason) {
    
    this.failureReason = failureReason;
    return this;
  }

   /**
   * Get failureReason
   * @return failureReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public BankTransferFailure getFailureReason() {
    return failureReason;
  }


  public void setFailureReason(BankTransferFailure failureReason) {
    this.failureReason = failureReason;
  }


  public BankTransferEvent direction(BankTransferDirection direction) {
    
    this.direction = direction;
    return this;
  }

   /**
   * Get direction
   * @return direction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public BankTransferDirection getDirection() {
    return direction;
  }


  public void setDirection(BankTransferDirection direction) {
    this.direction = direction;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankTransferEvent bankTransferEvent = (BankTransferEvent) o;
    return Objects.equals(this.eventId, bankTransferEvent.eventId) &&
        Objects.equals(this.timestamp, bankTransferEvent.timestamp) &&
        Objects.equals(this.eventType, bankTransferEvent.eventType) &&
        Objects.equals(this.accountId, bankTransferEvent.accountId) &&
        Objects.equals(this.bankTransferId, bankTransferEvent.bankTransferId) &&
        Objects.equals(this.originationAccountId, bankTransferEvent.originationAccountId) &&
        Objects.equals(this.bankTransferType, bankTransferEvent.bankTransferType) &&
        Objects.equals(this.bankTransferAmount, bankTransferEvent.bankTransferAmount) &&
        Objects.equals(this.bankTransferIsoCurrencyCode, bankTransferEvent.bankTransferIsoCurrencyCode) &&
        Objects.equals(this.failureReason, bankTransferEvent.failureReason) &&
        Objects.equals(this.direction, bankTransferEvent.direction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, timestamp, eventType, accountId, bankTransferId, originationAccountId, bankTransferType, bankTransferAmount, bankTransferIsoCurrencyCode, failureReason, direction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankTransferEvent {\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    bankTransferId: ").append(toIndentedString(bankTransferId)).append("\n");
    sb.append("    originationAccountId: ").append(toIndentedString(originationAccountId)).append("\n");
    sb.append("    bankTransferType: ").append(toIndentedString(bankTransferType)).append("\n");
    sb.append("    bankTransferAmount: ").append(toIndentedString(bankTransferAmount)).append("\n");
    sb.append("    bankTransferIsoCurrencyCode: ").append(toIndentedString(bankTransferIsoCurrencyCode)).append("\n");
    sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
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

