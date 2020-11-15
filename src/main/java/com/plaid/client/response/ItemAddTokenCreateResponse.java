package com.plaid.client.response;	

import java.util.Date;	

/**	
 * Response from /item/add_token/create endpoint.	
 */	
public class ItemAddTokenCreateResponse extends BaseResponse {	
  private Date expiration;	
  private String addToken;	

  public Date getExpiration() {	
    return expiration;	
  }	

  public String getAddToken() {	
    return addToken;	
  }	
}	
