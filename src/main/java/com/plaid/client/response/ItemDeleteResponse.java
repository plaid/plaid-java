package com.plaid.client.response;

/**
 * Response from /item/delete endpoint.
 */
public final class ItemDeleteResponse extends BaseResponse {
  private Boolean deleted;

  public Boolean getDeleted() {
    return deleted;
  }
}
