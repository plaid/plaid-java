package com.plaid.client.response;

public final class Account {

  /**
   * The verification status
   */
  public enum VerificationStatus {
    pending_automatic_verification, pending_manual_verification, manually_verified
  }

  private String accountId;
  private String type;
  private String subtype;
  private VerificationStatus verificationStatus;
  private Balances balances;
  private String name;
  private String mask;
  private String officialName;

  public String getAccountId() {
    return accountId;
  }

  public String getType() {
    return type;
  }

  public String getSubtype() {
    return subtype;
  }

  public VerificationStatus getVerificationStatus() {
    return verificationStatus;
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

  public static final class Balances {
    private Double available;
    private Double current;
    private Double limit;
    private String isoCurrencyCode;
    private String unofficialCurrencyCode;

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
  }
}
