package com.plaid.client.response;

/**
 * Response from /sandbox/public_token/create endpoint.
 */
public final class SandboxPublicTokenCreateResponse extends BaseResponse {
  private String publicToken;

  public String getPublicToken() {
    return publicToken;
  }
}
