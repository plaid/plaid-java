package com.plaid.client.response;

public class Security {
  private String securityId;
  private String cusip;
  private String sedol;
  private String isin;
  private String institutionSecurityId;
  private String institutionId;
  private String proxySecurityId;
  private String name;
  private String tickerSymbol;
  private Boolean isCashEquivalent;
  private String type;
  private Double closePrice;
  private String closePriceAsOf;
  private String isoCurrencyCode;
  private String unofficialCurrencyCode;

  public String getSecurityId() {
    return securityId;
  }

  public String getCusip() {
    return cusip;
  }

  public String getSedol() {
    return sedol;
  }

  public String getIsin() {
    return isin;
  }

  public String getInstitutionSecurityId() {
    return institutionSecurityId;
  }

  public String getInstitutionId() {
    return institutionId;
  }

  public String getProxySecurityId() {
    return proxySecurityId;
  }

  public String getName() {
    return name;
  }

  public String getTickerSymbol() {
    return tickerSymbol;
  }

  public Boolean getIsCashEquivalent() {
    return isCashEquivalent;
  }

  public String getType() {
    return type;
  }

  public Double getClosePrice() {
    return closePrice;
  }

  public String getClosePriceAsOf() {
    return closePriceAsOf;
  }

  public String getIsoCurrencyCode() {
    return isoCurrencyCode;
  }

  public String getUnofficialCurrencyCode() {
    return unofficialCurrencyCode;
  }
}
