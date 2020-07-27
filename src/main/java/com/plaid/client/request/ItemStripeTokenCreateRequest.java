package com.plaid.client.request;

import com.plaid.client.request.common.BaseAccessTokenRequest;

/**
 * Request for  /processor/stripe/bank_account_token/create endpoint.
 */
public class ItemStripeTokenCreateRequest extends BaseAccessTokenRequest {
  private String accountId;

  public ItemStripeTokenCreateRequest(String accessToken, String accountId) {
    super(accessToken);
    this.accountId = accountId;
  }
}
