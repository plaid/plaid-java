package com.plaid.client.model.paymentinitiation;

public class Bacs {
  private String account;
  private String sortCode;

  public Bacs(String account, String sortCode) {
    this.account = account;
    this.sortCode = sortCode;
  }

  public String getAccount() {
    return account;
  }

  public String getSortCode() {
    return sortCode;
  }

}
