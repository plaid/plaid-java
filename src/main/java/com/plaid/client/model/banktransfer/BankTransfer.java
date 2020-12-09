package com.plaid.client.model.banktransfer;

import java.util.Map;
import java.util.Objects;


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
    return Objects.equals(id, that.getId()) &&
      Objects.equals(accountId, that.getAccountId()) &&
      Objects.equals(achClass, that.getAchClass()) &&
      Objects.equals(amount, that.getAmount()) &&
      Objects.equals(created, that.getCreated()) &&
      Objects.equals(customTag, that.getCustomTag()) &&
      Objects.equals(description, that.getDescription()) &&
      Objects.equals(failureReason, that.getFailureReason()) &&
      Objects.equals(isoCurrencyCode, that.getIsoCurrencyCode()) &&
      Objects.equals(network, that.getNetwork()) &&
      Objects.equals(originationAccountId, that.getOriginationAccountId()) &&
      Objects.equals(status, that.getStatus()) &&
      Objects.equals(type, that.getType()) &&
      Objects.equals(user, that.getUser()) &&
      cancellable == that.getCancellable();
  }
}
