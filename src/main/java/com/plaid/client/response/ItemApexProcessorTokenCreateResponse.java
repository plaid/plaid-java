package com.plaid.client.response;

/**
 * Response from /processor/apex/processor_token/create endpoint.
 */
public class ItemApexProcessorTokenCreateResponse extends BaseResponse {
  private String processorToken;

  public String getProcessorToken() {
    return processorToken;
  }
}
