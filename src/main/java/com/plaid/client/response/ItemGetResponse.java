package com.plaid.client.response;

public final class ItemGetResponse extends BaseResponse {
  private ItemStatus item;

  public ItemStatus getItem() {
    return item;
  }
}
