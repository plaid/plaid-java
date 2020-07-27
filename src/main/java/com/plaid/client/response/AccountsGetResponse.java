package com.plaid.client.response;

import java.util.List;

public class AccountsGetResponse extends BaseResponse {
  private ItemStatus item;
  private List<Account> accounts;

  public ItemStatus getItem() {
    return item;
  }

  public List<Account> getAccounts() {
    return accounts;
  }

}
