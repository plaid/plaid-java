package com.plaid.client.response;

import java.util.List;

public final class AuthGetResponse extends BaseResponse {
  private ItemStatus item;
  private List<Account> accounts;
  private List<Numbers> numbers;

  public ItemStatus getItem() {
    return item;
  }

  public List<Account> getAccounts() {
    return accounts;
  }

  public List<Numbers> getNumbers() {
    return numbers;
  }

  public final class Numbers {
    private String accountId;
    private String account;
    private String routing;
    private String wireRouting;

    public String getAccountId() {
      return accountId;
    }

    public String getAccount() {
      return account;
    }

    public String getRouting() {
      return routing;
    }

    public String getWireRouting() {
      return wireRouting;
    }
  }
}
