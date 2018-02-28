package com.plaid.client.response;

import java.util.Date;
import java.util.List;

/**
 * Response object for /credit_details/get endpoint.
 */
public final class CreditDetailsGetResponse extends BaseResponse {
  private ItemStatus item;
  private List<Account> accounts;
  private List<CreditDetail> creditDetails;

  public ItemStatus getItem() {
    return item;
  }

  public List<Account> getAccounts() {
    return accounts;
  }

  public List<CreditDetail> getCreditDetails() {
    return creditDetails;
  }

  public static final class CreditDetail {
    private String accountId;
    private Aprs aprs;
    private Double lastPaymentAmount;
    private Date lastPaymentDate;
    private Double lastStatementBalance;
    private Date lastStatementDate;
    private Double minimumPaymentAmount;
    private Date nextBillDueDate;

    public String getAccountId() {
      return accountId;
    }

    public Aprs getAprs() {
      return aprs;
    }

    public Double getLastPaymentAmount() {
      return lastPaymentAmount;
    }

    public Date getLastPaymentDate() {
      return lastPaymentDate;
    }

    public Double getLastStatementBalance() {
      return lastStatementBalance;
    }

    public Date getLastStatementDate() {
      return lastStatementDate;
    }

    public Double getMinimumPaymentAmount() {
      return minimumPaymentAmount;
    }

    public Date getNextBillDueDate() {
      return nextBillDueDate;
    }
  }

  public static final class Aprs {
    private Apr balanceTransfers;
    private Apr cashAdvances;
    private Apr purchases;


    public Apr getBalanceTransfers() {
      return balanceTransfers;
    }

    public Apr getCashAdvances() {
      return cashAdvances;
    }

    public Apr getPurchases() {
      return purchases;
    }
  }

  public static final class Apr {
    private Double apr;
    private Double balanceSubjectToApr;
    private Double interestChargeAmount;

    public Double getApr() {
      return apr;
    }

    public Double getBalanceSubjectToApr() {
      return balanceSubjectToApr;
    }

    public Double getInterestChargeAmount() {
      return interestChargeAmount;
    }
  }
}
