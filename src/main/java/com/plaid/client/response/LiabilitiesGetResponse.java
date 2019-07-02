package com.plaid.client.response;

import java.util.List;

public final class LiabilitiesGetResponse extends BaseResponse {
  private ItemStatus item;
  private List<Account> accounts;
  private Liabilities liabilities;

  public ItemStatus getItem() {
    return item;
  }

  public List<Account> getAccounts() {
    return accounts;
  }

  public Liabilities getLiabilities() {
    return liabilities;
  }

  public static final class Liabilities {
    private List<StudentLoanLiability> student;

    public List<StudentLoanLiability> getStudent() {
      return student;
    }
  }

  public static final class StudentLoanLiability {
    private String accountId;
    private String accountNumber;
    private List<String> disbursementDates;
    private String expectedPayoffDate;
    private String guarantor;
    private Double interestRatePercentage;
    private Boolean isFederal;
    private Boolean isOverdue;
    private Double lastPaymentAmount;
    private String lastPaymentDate;
    private Double lastStatementBalance;
    private String lastStatementDate;
    private String loanStatusDescription;
    private LoanStatus loanStatus;
    private String loanTypeDescription;
    private Double minimumPaymentAmount;
    private String nextBillDueDate;
    private String originationDate;
    private Double originationPrincipalAmount;
    private Double outstandingInterestAmount;
    private String paymentReferenceNumber;
    private PslfStatus pslfStatus;
    private String repaymentPlanType;
    private String sequenceNumber;
    private ServicerAddress servicerAddress;
    private Double ytdInterestPaid;
    private Double ytdPrincipalPaid;

    public String getAccountId() {
      return accountId;
    }

    public String getAccountNumber() {
      return accountNumber;
    }
    
    public List<String> getDisbursementDates() {
      return disbursementDates;
    }
    
    public String getExpectedPayoffDate() {
      return expectedPayoffDate;
    }
    
    public String getGuarantor() {
      return guarantor;
    }
    
    public Double getInterestRatePercentage() {
      return interestRatePercentage;
    }
    
    public Boolean getIsFederal() {
      return isFederal;
    }
    
    public Boolean getIsOverdue() {
      return isOverdue;
    }
    
    public Double getLastPaymentAmount() {
      return lastPaymentAmount;
    }
    
    public String getLastPaymentDate() {
      return lastPaymentDate;
    }
    
    public Double getLastStatementBalance() {
      return lastStatementBalance;
    }
    
    public String getLastStatementDate() {
      return lastStatementDate;
    }
    
    public String getLoanStatusDescription() {
      return loanStatusDescription;
    }
    
    public LoanStatus getLoanStatus() {
      return loanStatus;
    }
    
    public String getLoanTypeDescription() {
      return loanTypeDescription;
    }
    
    public Double getMinimumPaymentAmount() {
      return minimumPaymentAmount;
    }
    
    public String getNextBillDueDate() {
      return nextBillDueDate;
    }
    
    public String getOriginationDate() {
      return originationDate;
    }
    
    public Double getOriginationPrincipalAmount() {
      return originationPrincipalAmount;
    }
    
    public Double getOutstandingInterestAmount() {
      return outstandingInterestAmount;
    }
    
    public String getPaymentReferenceNumber() {
      return paymentReferenceNumber;
    }
    
    public PslfStatus getPslfStatus() {
      return pslfStatus;
    }
    
    public String getRepaymentPlanType() {
      return repaymentPlanType;
    }
    
    public String getSequenceNumber() {
      return sequenceNumber;
    }
    
    public ServicerAddress getServicerAddress() {
      return servicerAddress;
    }
    
    public Double getYtdInterestPaid() {
      return ytdInterestPaid;
    }
    
    public Double getYtdPrincipalPaid() {
      return ytdPrincipalPaid;
    }
  }

  public static final class PslfStatus {
    private String estimatedEligibilityDate;
    private Integer paymentsMade;
    private Integer paymentsRemaining;

    public String getEstimatedEligibilityDate() {
      return estimatedEligibilityDate;
    }
    
    public Integer getPaymentsMade() {
      return paymentsMade;
    }
    
    public Integer getPaymentsRemaining() {
      return paymentsRemaining;
    }
  }

  public static final class ServicerAddress {
    private String city;
    private String country;
    private String region;
    private String street;
    private String zip;

    public String getCity() {
      return city;
    }

    public String getCountry() {
      return country;
    }

    public String getRegion() {
      return region;
    }

    public String getStreet() {
      return street;
    }

    public String getZip() {
      return zip;
    }
  }

  public static final class LoanStatus {
    private String type;
    private String endDate;

    public String getType() {
      return type;
    }

    public String getEndDate() {
      return endDate;
    }
  }
}
