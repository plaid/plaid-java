package com.plaid.client.request.paymentinitiation;

import com.plaid.client.request.common.BaseClientRequest;

/**
 * Request for the /payment_initiation/recipient/get endpoint.
 */
public class RecipientGetRequest extends BaseClientRequest {
  private String recipientId;

  public RecipientGetRequest(String recipientId) {
    this.recipientId = recipientId;
  }
}
