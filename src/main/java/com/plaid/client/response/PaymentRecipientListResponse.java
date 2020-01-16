package com.plaid.client.response;

import com.plaid.client.model.payment.Address;
import com.plaid.client.model.payment.Recipient;
import com.plaid.client.response.PaymentRecipientGetResponse;

import java.util.List;

public final class PaymentRecipientListResponse extends BaseResponse {
  private List<Recipient> recipients;

  public List<Recipient> getRecipients() {
    return recipients;
  }
}
