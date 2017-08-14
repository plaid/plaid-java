package com.plaid.client.request;

import com.plaid.client.request.common.BaseAccessTokenRequest;

/**
 * Request for  /processor/apex/processor_token/create endpoint.
 */
public final class ItemApexProcessorTokenCreateRequest extends BaseAccessTokenRequest {
  private String accountId;

  public ItemApexProcessorTokenCreateRequest(String accessToken, String accountId) {
    super(accessToken);
    this.accountId = accountId;
  }
}
