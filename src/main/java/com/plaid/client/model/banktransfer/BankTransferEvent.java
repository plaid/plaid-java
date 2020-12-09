package com.plaid.client.model.banktransfer;

import java.sql.Timestamp;

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
    return this.getEventId().equals(that.getEventId()) &&
      this.getAccountId().equals(that.getAccountId()) &&
      this.getBankTransferAmount().equals(that.getBankTransferAmount()) &&
      this.getBankTransferId().equals(that.getBankTransferId()) &&
      this.getBankTransferIsoCurrencyCode().equals(that.getBankTransferIsoCurrencyCode()) &&
      this.getBankTransferType().equals(that.getBankTransferType()) &&
      this.getDirection().equals(that.getDirection()) &&
      this.getEventType().equals(that.getEventType()) &&
      this.getFailureReason().equals(that.getFailureReason()) &&
      this.getReceiverDetails().equals(that.getReceiverDetails()) &&
      this.getTimestamp().equals(that.getTimestamp());
  }
}
