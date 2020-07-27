package com.plaid.client.response;

/**
 * Response from /item/remove endpoint.
 */
public class ItemRemoveResponse extends BaseResponse {
  private Boolean removed;

  public Boolean getRemoved() {
    return removed;
  }
}
