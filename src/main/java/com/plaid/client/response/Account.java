package com.plaid.client.response;

public class Account {
  private String accountId;
  private String type;
  private String subtype;
  private Balances balances;
  private String name;
  private String mask;
  private String officialName;
  private String verificationStatus;

  public String getAccountId() {
    return accountId;
  }

  public String getType() {
    return type;
  }

  public String getSubtype() {
    return subtype;
  }

  public Balances getBalances() {
    return balances;
  }

  public String getName() {
    return name;
  }

  public String getMask() {
    return mask;
  }

  public String getOfficialName() {
    return officialName;
  }

  public String getVerificationStatus() {
    return verificationStatus;
  }

  public static class Balances {
    private Double available;
    private Double current;
    private Double limit;
    private String isoCurrencyCode;
    private String unofficialCurrencyCode;
    private String lastUpdatedDatetime;

    public Double getAvailable() {
      return available;
    }

    public Double getCurrent() {
      return current;
    }

    public Double getLimit() {
      return limit;
    }

    public String getIsoCurrencyCode() {
      return isoCurrencyCode;
    }

    public String getUnofficialCurrencyCode() {
      return unofficialCurrencyCode;
    }

    public String getLastUpdatedDatetime() {
      return lastUpdatedDatetime;
    }
  }
}
