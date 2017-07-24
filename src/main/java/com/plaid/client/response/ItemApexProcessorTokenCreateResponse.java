package com.plaid.client.response;

/**
 * Response from /processor/apex/processor_token/create endpoint.
 */
public final class ItemApexProcessorTokenCreateResponse extends BaseResponse {
  private String apexProcessorToken;

  public String getApexProcessorToken() {
    return apexProcessorToken;
  }
}
