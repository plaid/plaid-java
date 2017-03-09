package com.plaid.client.response;

/**
 * /item/credentials/update response.
 */
public final class ItemCredentialsUpdateResponse extends BaseResponse {
  private ItemStatus item;

  public ItemStatus getItem() {
    return item;
  }
}
