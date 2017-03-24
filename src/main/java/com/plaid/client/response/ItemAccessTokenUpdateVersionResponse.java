package com.plaid.client.response;

/**
 * Response object for /item/access_token/update_version endpoint.
 */
public final class ItemAccessTokenUpdateVersionResponse extends BaseResponse {
  private String accessToken;

  public String getAccessToken() {
    return accessToken;
  }
}
