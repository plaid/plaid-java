package com.plaid.client.response;

import java.util.Date;

public final class ItemStatusStatus {
  private ItemStatusTransactions transactions;
  private ItemStatusLastWebhook lastWebhook;

  public ItemStatusTransactions getTransactions() {
    return transactions;
  }

  public ItemStatusLastWebhook getLastWebhook() {
    return lastWebhook;
  }

  public static final class ItemStatusTransactions {
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
