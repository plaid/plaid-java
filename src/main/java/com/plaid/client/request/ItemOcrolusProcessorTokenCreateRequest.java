package com.plaid.client.request;

import com.plaid.client.request.common.BaseAccessTokenRequest;

/**
 * Request for  /processor/ocrolus/processor_token/create endpoint.
 */
public final class ItemOcrolusProcessorTokenCreateRequest extends BaseAccessTokenRequest {
  private String accountId;

  public ItemOcrolusProcessorTokenCreateRequest(String accessToken, String accountId) {
    super(accessToken);
    this.accountId = accountId;
  }
}
