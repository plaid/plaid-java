package com.plaid.client.response;

/**
 * Response from /processor/ocrolus/processor_token/create endpoint.
 */
public final class ItemOcrolusProcessorTokenCreateResponse extends BaseResponse {
  private String processorToken;

  public String getProcessorToken() {
    return processorToken;
  }
}
