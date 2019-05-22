package com.plaid.client.response;

public final class ItemGetResponse extends BaseResponse {
  private ItemStatus item;
  private ItemStatusStatus status;

  public ItemStatus getItem() {
    return item;
  }

  public ItemStatusStatus getStatus() {
    return status;
  }
}
