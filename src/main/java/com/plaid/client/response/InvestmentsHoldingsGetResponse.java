package com.plaid.client.response;

import java.util.List;

public final class InvestmentsHoldingsGetResponse extends BaseResponse {
  private ItemStatus item;
  private List<Account> accounts;
  private List<Holding> holdings;
  private List<Security> securities;

  public ItemStatus getItem() {
    return item;
  }

  public List<Account> getAccounts() {
    return accounts;
  }

  public List<Holding> getHoldings() {
    return holdings;
  }

  public List<Security> getSecurities() {
    return securities;
  }

  public static final class Holding {
    private String accountId;
    private String securityId;
    private Double institutionValue;
    private Double institutionPrice;
    private Double quantity;
    private String institutionPriceAsOf;
    private Double costBasis;
    private String isoCurrencyCode;
    private String unofficialCurrencyCode;

    public String getAccountId() {
      return accountId;
    }

    public String getSecurityId() {
      return securityId;
    }

    public Double getInstitutionValue() {
      return institutionValue;
    }

    public Double getInstitutionPrice() {
      return institutionPrice;
    }

    public Double getQuantity() {
      return quantity;
    }

    public String getInstitutionPriceAsOf() {
      return institutionPriceAsOf;
    }

    public Double getCostBasis() {
      return costBasis;
    }

    public String getIsoCurrencyCode() {
      return isoCurrencyCode;
    }

    public String getUnofficialCurrencyCode() {
      return unofficialCurrencyCode;
    }
  }
}
