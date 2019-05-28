package com.plaid.client.response;

import java.util.List;

public final class AuthGetResponse extends BaseResponse {
  private ItemStatus item;
  private List<Account> accounts;
  private Numbers numbers;

  public ItemStatus getItem() {
    return item;
  }

  public List<Account> getAccounts() {
    return accounts;
  }

  public Numbers getNumbers() {
    return numbers;
  }

  public static class NumberACH {
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

  public static class NumberEFT {
    private String accountId;
    private String account;
    private String institution;
    private String branch;

    public String getAccountId() {
      return accountId;
    }

    public String getAccount() {
      return account;
    }

    public String getInstitution() {
      return institution;
    }

    public String getBranch() {
      return branch;
    }
  }

  public static class NumberInternational {
    private String accountId;
    private String iban;
    private String bic;

    public String getAccountId() {
      return accountId;
    }

    public String getIBAN() {
      return iban;
    }

    public String getBIC() {
      return bic;
    }
  }

  public static class NumberBACS {
    private String accountId;
    private String account;
    private String sortCode;

    public String getAccountId() {
      return accountId;
    }

    public String getAccount() {
      return account;
    }

    public String getSortCode() {
      return sortCode;
    }
  }

  public static final class Numbers {
    private List<NumberACH> ach;
    private List<NumberEFT> eft;
    private List<NumberInternational> international;
    private List<NumberBACS> bacs;

    public List<NumberACH> getACH() {
      return ach;
    }

    public List<NumberEFT> getEFT() {
      return eft;
    }

    public List<NumberInternational> getInternational() {
      return international;
    }

    public List<NumberBACS> getBACS() {
      return bacs;
    }
  }
}
