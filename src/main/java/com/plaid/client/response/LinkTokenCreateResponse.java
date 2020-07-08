package com.plaid.client.response;

import java.util.Date;

public class LinkTokenCreateResponse extends BaseResponse {
  private String token;
  private Date expiration;

  public String getToken() {
    return token;
  }

  public Date getExpiration() {
    return expiration;
  }
}
