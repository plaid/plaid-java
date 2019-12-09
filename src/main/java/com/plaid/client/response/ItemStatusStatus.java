package com.plaid.client.response;

import java.util.Date;

public final class ItemStatusStatus {
  private ItemStatusHealth transactions;
  private ItemStatusHealth investments;
  private ItemStatusLastWebhook lastWebhook;

  public ItemStatusHealth getTransactions() {
    return transactions;
  }

  public ItemStatusHealth getInvestments() {
    return investments;
  }

  public ItemStatusLastWebhook getLastWebhook() {
    return lastWebhook;
  }

  public static class ItemStatusHealth extends ItemStatusTransactions {}

  public static class ItemStatusTransactions {
    private Date lastSuccessfulUpdate;
    private Date lastFailedUpdate;

    public Date getLastSuccessfulUpdate() {
      return lastSuccessfulUpdate;
    }

    public Date getLastFailedUpdate() {
      return lastFailedUpdate;
    }
  }

  public static final class ItemStatusLastWebhook {
    private Date sentAt;
    private String codeSent;

    public Date getSentAt() {
      return sentAt;
    }

    public String getCodeSent() {
      return codeSent;
    }
  }
}
