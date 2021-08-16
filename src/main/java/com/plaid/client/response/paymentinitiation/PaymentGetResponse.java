package com.plaid.client.response.paymentinitiation;

import com.plaid.client.model.paymentinitiation.Amount;
import com.plaid.client.model.paymentinitiation.Bacs;
import com.plaid.client.model.paymentinitiation.RefundDetails;
import com.plaid.client.model.paymentinitiation.Schedule;
import com.plaid.client.response.BaseResponse;

public class PaymentGetResponse extends BaseResponse {
  private String paymentId;
  private String reference;
  private Amount amount;
  private Schedule schedule;
  private String status;
  private String lastStatusUpdate;
  private String recipientId;
  private RefundDetails refundDetails;
  private Bacs bacs;
  private String iban;

  public String getPaymentId() {
    return paymentId;
  }

  public String getReference() {
    return reference;
  }

  public Amount getAmount() {
    return amount;
  }

  public Schedule getSchedule() {
    return schedule;
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

  public RefundDetails getRefundDetails() {
    return refundDetails;
  }

  public Bacs getBacs() {
    return bacs;
  }

  public String getIban() {
    return iban;
  }
}
