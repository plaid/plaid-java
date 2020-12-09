package com.plaid.client.model.banktransfer;

import java.sql.Timestamp;
import java.util.Objects;

public class BankTransferEvent {
  private String eventId;
  private Timestamp timestamp;
  private String eventType;
  private String accountId;
  private String bankTransferId;
  private String bankTransferType;
  private String bankTransferAmount;
  private String bankTransferIsoCurrencyCode;
  private BankTransferFailure failureReason;
  private String direction;
  private BankTransferReceiverDetails receiverDetails;

  public String getEventId() {
    return eventId;
  }

  public Timestamp getTimestamp() {
    return timestamp;
  }

  public String getEventType() {
    return eventType;
  }

  public String getAccountId() {
    return accountId;
  }

  public String getBankTransferId() {
    return bankTransferId;
  }

  public String getBankTransferType() {
    return bankTransferType;
  }

  public String getBankTransferAmount() {
    return bankTransferAmount;
  }

  public String getBankTransferIsoCurrencyCode() {
    return bankTransferIsoCurrencyCode;
  }

  public BankTransferFailure getFailureReason() {
    return failureReason;
  }

  public String getDirection() {
    return direction;
  }

  public BankTransferReceiverDetails getReceiverDetails() {
    return receiverDetails;
  }

  @Override public boolean equals(Object other) {
    if (this == other) {
      return true;
    }
    if (other == null || getClass() != other.getClass()) {
      return false;
    }
    BankTransferEvent that = (BankTransferEvent) other;
    return Objects.equals(eventId, that.getEventId()) &&
      Objects.equals(accountId, that.getAccountId()) &&
      Objects.equals(bankTransferAmount, that.getBankTransferAmount()) &&
      Objects.equals(bankTransferId, that.getBankTransferId()) &&
      Objects.equals(bankTransferIsoCurrencyCode, that.getBankTransferIsoCurrencyCode()) &&
      Objects.equals(bankTransferType, that.getBankTransferType()) &&
      Objects.equals(direction, that.getDirection()) &&
      Objects.equals(eventType, that.getEventType()) &&
      Objects.equals(failureReason, that.getFailureReason()) &&
      Objects.equals(receiverDetails, that.getReceiverDetails()) &&
      Objects.equals(timestamp, that.getTimestamp());
  }
}
