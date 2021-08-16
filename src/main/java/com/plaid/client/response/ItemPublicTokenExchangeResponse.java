package com.plaid.client.response;

public class ItemPublicTokenExchangeResponse extends BaseResponse {
  private String accessToken;
  private String itemId;

  public String getAccessToken() {
    return accessToken;
  }

  public String getItemId() {
    return itemId;
  }
}
