package com.plaid.client.response;

/**
 * Response object for /item/access_token/update_version endpoint.
 */
public final class ItemAccessTokenUpdateVersionResponse extends BaseResponse {
  private String accessToken;
  private String itemId;

  public String getAccessToken() {
    return accessToken;
  }

  public String getItemId() {
    return itemId;
  }
}
