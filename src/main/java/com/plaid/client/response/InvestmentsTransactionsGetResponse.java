package com.plaid.client.response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Response object for /investments/transactions/get endpoint.
 */
public final class InvestmentsTransactionsGetResponse extends BaseResponse {
  private ItemStatus item;
  private List<Account> accounts;
  private List<InvestmentTransaction> investmentTransactions;
  private List<Security> securities;
  private Integer totalInvestmentTransactions;

  public ItemStatus getItem() {
    return item;
  }

  public List<Account> getAccounts() {
    return accounts;
  }

  public List<InvestmentTransaction> getInvestmentTransactions() {
    return investmentTransactions;
  }

  public List<Security> getSecurities() {
    return securities;
  }

  public Integer getTotalInvestmentTransactions() {
    return totalInvestmentTransactions;
  }

  public static final class InvestmentTransaction {
    private String investmentTransactionId;
    private String accountId;
    private String securityId;
    private String date;
    private String name;
    private Double quantity;
    private Double amount;
    private Double price;
    private Double fees;
    private String type;
    private String isoCurrencyCode;
    private String unofficialCurrencyCode;
    private String cancelTransactionId;

    public String getInvestmentTransactionId() {
      return investmentTransactionId;
    }

    public String getAccountId() {
      return accountId;
    }

    public String getSecurityId() {
      return securityId;
    }

    public String getDate() {
      return date;
    }

    public String getName() {
      return name;
    }

    public Double getQuantity() {
      return quantity;
    }

    public Double getAmount() {
      return amount;
    }

    public Double getPrice() {
      return price;
    }

    public Double getFees() {
      return fees;
    }

    public String getType() {
      return type;
    }

    public String getIsoCurrencyCode() {
      return isoCurrencyCode;
    }

    public String getUnofficialCurrencyCode() {
      return unofficialCurrencyCode;
    }

    public String getCancelTransactionId() {
      return cancelTransactionId;
    }
  }
}
