package com.plaid.client.response;

import java.util.List;

public class LiabilitiesGetResponse extends BaseResponse {
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

  public static class Liabilities {
    private List<CreditCardLiability> credit;
    private List<StudentLoanLiability> student;
    private  List<MortgageLiability> mortgage;

    public List<CreditCardLiability> getCredit() {
      return credit;
    }

    public List<StudentLoanLiability> getStudent() {
      return student;
    }

    public List<MortgageLiability> getMortgage() {
      return mortgage;
    }
  }

  // CreditCardLiability contains credit card liability data.
  public static class CreditCardLiability {
    private List<Apr> aprs;
    private String accountId;
    private Boolean isOverdue;
    private Double lastPaymentAmount;
    private String lastPaymentDate;
    private Double lastStatementBalance;
    private String lastStatementIssueDate;
    private Double minimumPaymentAmount;
    private String nextPaymentDueDate;

    public List<Apr> getAprs() {
      return aprs;
    }

    public String getAccountId() {
      return accountId;
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

    public String getLastStatementIssueDate() {
      return lastStatementIssueDate;
    }

    public Double getMinimumPaymentAmount() {
      return minimumPaymentAmount;
    }

    public String getNextPaymentDueDate() {
      return nextPaymentDueDate;
    }
  }

  // Apr contains APR data related to credit card liability.
  public static class Apr {
    private Double aprPercentage;
    private String aprType;
    private Double balanceSubjectToApr;
    private Double interestChargeAmount;

    public Double getAprPercentage() {
      return aprPercentage;
    }

    public String getAprType() {
      return aprType;
    }

    public Double getBalanceSubjectToApr() {
      return balanceSubjectToApr;
    }

    public Double getInterestChargeAmount() {
      return interestChargeAmount;
    }
  }

  // MortgageLiability contains mortgage liability data.
  public static class MortgageLiability {
    private String accountId;
    private String accountNumber;
    private Double currentLateFee;
    private Double escrowBalance;
    private Boolean hasPmi;
    private Boolean hasPrepaymentPenalty;
    private InterestRate interestRate;
    private Double lastPaymentAmount;
    private String lastPaymentDate;
    private String loanTypeDescription;
    private String loanTerm;
    private String maturityDate;
    private Double nextMonthlyPayment;
    private String nextPaymentDueDate;
    private String originationDate;
    private Double originationPrincipalAmount;
    private Double pastDueAmount;
    private PropertyAddress propertyAddress;
    private Double ytdInterestPaid;
    private Double ytdPrincipalPaid;

    public String getAccountId() {
      return accountId;
    }

    public String getAccountNumber() {
      return accountNumber;
    }

    public Double getCurrentLateFee() {
      return currentLateFee;
    }

    public Double getEscrowBalance() {
      return escrowBalance;
    }

    public Boolean getHasPmi() {
      return hasPmi;
    }

    public Boolean getHasPrepaymentPenalty() {
      return hasPrepaymentPenalty;
    }

    public InterestRate getInterestRate() {
      return interestRate;
    }

    public Double getLastPaymentAmount() {
      return lastPaymentAmount;
    }

    public String getLastPaymentDate() {
      return lastPaymentDate;
    }

    public String getLoanTypeDescription() {
      return loanTypeDescription;
    }

    public String getLoanTerm() {
      return loanTerm;
    }

    public String getMaturityDate() {
      return maturityDate;
    }

    public Double getNextMonthlyPayment() {
      return nextMonthlyPayment;
    }

    public String getNextPaymentDueDate() {
      return nextPaymentDueDate;
    }

    public String getOriginationDate() {
      return originationDate;
    }

    public Double getOriginationPrincipalAmount() {
      return originationPrincipalAmount;
    }

    public Double getPastDueAmount() {
      return pastDueAmount;
    }

    public PropertyAddress getPropertyAddress() {
      return propertyAddress;
    }

    public Double getYtdInterestPaid() {
      return ytdInterestPaid;
    }

    public Double getYtdPrincipalPaid() {
      return ytdPrincipalPaid;
    }
  }

  // InterestRate contains interest data related to mortgage liability.
  public static class InterestRate {
    private Double percentage;
    private String type;

    public Double getPercentage() {
      return percentage;
    }

    public String getType() {
      return type;
    }
  }

  // PropertyAddress contains the address associated to mortgage liability.
  public static class PropertyAddress {
    private String city;
    private String country;
    private String postalCode;
    private String region;
    private String street;

    public String getCity() {
      return city;
    }

    public String getCountry() {
      return country;
    }

    public String getPostalCode() {
      return postalCode;
    }

    public String getRegion() {
      return region;
    }

    public String getStreet() {
      return street;
    }
  }

  // StudentLoanLiability contains student loan liability data.
  public static class StudentLoanLiability {
    private String accountId;
    private String accountNumber;
    private List<String> disbursementDates;
    private String expectedPayoffDate;
    private String guarantor;
    private Double interestRatePercentage;
    private Boolean isOverdue;
    private Double lastPaymentAmount;
    private String lastPaymentDate;
    private Double lastStatementBalance;
    private String lastStatementIssueDate;
    private String loanName;
    private StudentLoanStatus loanStatus;
    private Double minimumPaymentAmount;
    private String nextPaymentDueDate;
    private String originationDate;
    private Double originationPrincipalAmount;
    private Double outstandingInterestAmount;
    private String paymentReferenceNumber;
    private PslfStatus pslfStatus;
    private StudentLoanRepaymentPlan repaymentPlan;
    private String sequenceNumber;
    private StudentLoanServicerAddress servicerAddress;
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

    public String getLastStatementIssueDate() {
      return lastStatementIssueDate;
    }

    public String getLoanName() {
      return loanName;
    }

    public StudentLoanStatus getLoanStatus() {
      return loanStatus;
    }

    public Double getMinimumPaymentAmount() {
      return minimumPaymentAmount;
    }

    public String getNextPaymentDueDate() {
      return nextPaymentDueDate;
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

    public StudentLoanRepaymentPlan getRepaymentPlan() {
      return repaymentPlan;
    }

    public String getSequenceNumber() {
      return sequenceNumber;
    }

    public StudentLoanServicerAddress getServicerAddress() {
      return servicerAddress;
    }

    public Double getYtdInterestPaid() {
      return ytdInterestPaid;
    }

    public Double getYtdPrincipalPaid() {
      return ytdPrincipalPaid;
    }
  }

  // PslfStatus contains information about the student's eligibility in the
  // Public Service Loan Forgiveness program.
  public static class PslfStatus {
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

  // StudentLoanServicerAddress is the address of the servicer.
  public static class StudentLoanServicerAddress {
    private String city;
    private String country;
    private String postalCode;
    private String region;
    private String street;

    public String getCity() {
      return city;
    }

    public String getCountry() {
      return country;
    }

    public String getPostalCode() {
      return postalCode;
    }

    public String getRegion() {
      return region;
    }

    public String getStreet() {
      return street;
    }
  }

  // StudentLoanStatus contains details about the status of the student loan.
  public static class StudentLoanStatus {
    private String type;
    private String endDate;

    public String getType() {
      return type;
    }

    public String getEndDate() {
      return endDate;
    }
  }

  // StudentLoanRepaymentPlan contains details about the repayment plan of the
  // loan.
  public static class StudentLoanRepaymentPlan {
    private String type;
    private String description;

    public String getType() {
      return type;
    }

    public String getDescription() {
      return description;
    }
  }
}
