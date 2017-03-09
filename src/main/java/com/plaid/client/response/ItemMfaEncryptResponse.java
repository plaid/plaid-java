package com.plaid.client.response;

import java.util.Date;

public final class ItemMfaEncryptResponse extends BaseResponse {
  private String responsesToken;
  private Date expiration;

  public String getResponsesToken() {
    return responsesToken;
  }

  public Date getExpiration() {
    return expiration;
  }
}
