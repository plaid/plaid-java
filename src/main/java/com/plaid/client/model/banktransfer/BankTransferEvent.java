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
}
