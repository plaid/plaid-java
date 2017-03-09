package com.plaid.client.response;

import java.util.Date;

public final class ItemCredentialsEncryptResponse extends BaseResponse {
  private String credentialsToken;
  private Date expiration;

  public String getCredentialsToken() {
    return credentialsToken;
  }

  public Date getExpiration() {
    return expiration;
  }
}
