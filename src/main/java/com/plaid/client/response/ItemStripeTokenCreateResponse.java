package com.plaid.client.response;

/**
 * Response from /processor/stripe/bank_account_token/create endpoint.
 */
public final class ItemStripeTokenCreateResponse extends BaseResponse {
  private String stripeBankAccountToken;

  public String getStripeBankAccountToken() {
    return stripeBankAccountToken;
  }
}
