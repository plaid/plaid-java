package com.plaid.client.response;

/**
 * Response from /processor/dwolla/processor_token/create endpoint.
 */
public final class ItemDwollaProcessorTokenCreateResponse extends BaseResponse {
  private String dwollaProcessorToken;

  public String getDwollaProcessorToken() {
    return dwollaProcessorToken;
  }
}
