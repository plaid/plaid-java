package com.plaid.client.response;

import java.util.List;

/**
 * Response for /accounts/balance/get api call.
 */
public class AccountsBalanceGetResponse extends BaseResponse {
  private ItemStatus item;
  private List<Account> accounts;

  public ItemStatus getItem() {
    return item;
  }

  public List<Account> getAccounts() {
    if (accounts == null) {
      return null;
    }
    return accounts;
  }

}
