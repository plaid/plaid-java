package com.plaid.client.model.paymentinitiation;

import com.plaid.client.model.paymentinitiation.Amount;

import java.util.Date;

public class Payment {
  private String paymentId;
  private String paymentToken;
  private String reference;
  private Amount amount;
  private String status;
  private String lastStatusUpdate;
  private Date paymentTokenExpirationTime;
  private String recipientId;
  private Options options;

  public String getPaymentId() {
    return paymentId;
  }

  public String getPaymentToken() {
    return paymentToken;
  }

  public String getReference() {
    return reference;
  }

  public Amount getAmount() {
    return amount;
  }

  public String getStatus() {
    return status;
  }

  public String getLastStatusUpdate() {
    return lastStatusUpdate;
  }

  public Date getPaymentTokenExpirationTime() {
    return paymentTokenExpirationTime;
  }

  public String getRecipientId() {
    return recipientId;
  }

  public Options getOptions() {
    return options;
  }
}
