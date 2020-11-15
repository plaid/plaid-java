package com.plaid.client.response;	

import java.util.Date;	

/**	
 * Response from /item/public_token/create endpoint.	
 */	
public class ItemPublicTokenCreateResponse extends BaseResponse {	
  private Date expiration;	
  private String publicToken;	

  public Date getExpiration() {	
    return expiration;	
  }	

  public String getPublicToken() {	
    return publicToken;	
  }	
}
