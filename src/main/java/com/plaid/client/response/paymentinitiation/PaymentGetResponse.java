package com.plaid.client.response.paymentinitiation;

import com.plaid.client.model.paymentinitiation.Amount;
import com.plaid.client.response.BaseResponse;

import java.util.Date;

public class PaymentGetResponse extends BaseResponse {
  private String paymentId;
  private String reference;
  private Amount amount;
  private String status;
  private String lastStatusUpdate;
  private String recipientId;

  public String getPaymentId() {
    return paymentId;
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

  public String getRecipientId() {
    return recipientId;
  }
}
