package com.plaid.client.request;

import com.plaid.client.request.common.BaseAccessTokenRequest;

/**
 * Request for  /processor/dwolla/processor_token/create endpoint.
 */
public class ItemDwollaProcessorTokenCreateRequest extends BaseAccessTokenRequest {
  private String accountId;

  public ItemDwollaProcessorTokenCreateRequest(String accessToken, String accountId) {
    super(accessToken);
    this.accountId = accountId;
  }
}
