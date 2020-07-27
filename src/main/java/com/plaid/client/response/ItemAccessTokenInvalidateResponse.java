package com.plaid.client.response;

/**
 * Response object for /item/access_token/invalidate endpoint.
 */
public class ItemAccessTokenInvalidateResponse extends BaseResponse {
  private String newAccessToken;

  public String getNewAccessToken() {
    return newAccessToken;
  }
}
