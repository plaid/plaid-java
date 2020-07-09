package com.plaid.client.response;

import java.util.Date;

public class LinkTokenCreateResponse extends BaseResponse {
  private String linkToken;
  private Date expiration;

  public String getLinkToken() {
    return linkToken;
  }

  public Date getExpiration() {
    return expiration;
  }
}
