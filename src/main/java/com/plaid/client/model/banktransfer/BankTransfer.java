package com.plaid.client.model.banktransfer;

import java.util.Map;

import okhttp3.internal.platform.Platform;

public class BankTransfer {
  private String id;
  private String achClass;
  private String accountId;
  private String type;
  private BankTransferUser user;
  private String amount;
  private String isoCurrencyCode;
  private String description;
  private String created;
  private String status;
  private String network;
  private boolean cancellable;
  private BankTransferFailure failureReason;
  private String customTag;
  private Map<String, String> metadata;
  private String originationAccountId;
  private String direction;

  public String getId() {
    return id;
  }

  public String getAchClass() {
    return achClass;
  }

  public String getAccountId() {
    return accountId;
  }

  public String getType() {
    return type;
  }

  public BankTransferUser getUser() {
    return user;
  }

  public String getAmount() {
    return amount;
  }

  public String getIsoCurrencyCode() {
    return isoCurrencyCode;
  }

  public String getDescription() {
    return description;
  }

  public String getCreated() {
    return created;
  }

  public String getStatus() {
    return status;
  }

  public String getNetwork() {
    return network;
  }

  public boolean getCancellable() {
    return cancellable;
  }

  public BankTransferFailure getFailureReason() {
    return failureReason;
  }

  public String getCustomTag() {
    return customTag;
  }

  public Map<String, String> getMetadata() {
    return metadata;
  }

  public String getOriginationAccountId() {
    return originationAccountId;
  }

  public String getDirection() {
    return direction;
  }

  @Override public boolean equals(Object other) {
    if (this == other) {
      return true;
    }
    if (other == null || getClass() != other.getClass()) {
      return false;
    }
    BankTransfer that = (BankTransfer) other;
    return this.getId().equals(that.getId()) &&
      this.getAccountId().equals(that.getAccountId()) &&
      this.getAchClass().equals(that.getAchClass()) &&
      this.getAmount().equals(that.getAmount()) &&
      this.getCreated().equals(that.getCreated()) &&
      this.getCustomTag().equals(that.getCustomTag()) &&
      this.getDescription().equals(that.getDescription()) &&
      this.getFailureReason().equals(that.getFailureReason()) &&
      this.getIsoCurrencyCode().equals(that.getIsoCurrencyCode()) &&
      this.getNetwork().equals(that.getNetwork()) &&
      this.getOriginationAccountId().equals(that.getOriginationAccountId()) &&
      this.getStatus().equals(that.getStatus()) &&
      this.getType().equals(that.getType()) &&
      this.getUser().equals(that.getUser()) &&
      this.getCancellable() == that.getCancellable();
  }
}
