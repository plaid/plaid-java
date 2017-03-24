package com.plaid.client.response;

import java.util.List;

/**
 * Response object for /transactions/get endpoint.
 */
public final class TransactionsGetResponse extends BaseResponse {
  private ItemStatus item;
  private List<Account> accounts;
  private List<Transaction> transactions;
  private Integer totalTransactions;

  public ItemStatus getItem() {
    return item;
  }

  public List<Account> getAccounts() {
    return accounts;
  }

  public List<Transaction> getTransactions() {
    return transactions;
  }

  public Integer getTotalTransactions() {
    return totalTransactions;
  }

  public final class Transaction {
    private String accountId;
    private Double amount;
    private List<String> category;
    private String categoryId;
    private String date;
    private Location location;
    private String name;
    private String originalDescription;
    private PaymentMeta paymentMeta;
    private Boolean pending;
    private String pendingTransactionId;
    private String transactionId;
    private String transactionType;

    public String getTransactionId() {
      return transactionId;
    }

    public String getAccountId() {
      return accountId;
    }

    public Boolean getPending() {
      return pending;
    }

    public String getPendingTransactionId() {
      return pendingTransactionId;
    }

    public String getTransactionType() {
      return transactionType;
    }

    public PaymentMeta getPaymentMeta() {
      return paymentMeta;
    }

    public String getDate() {
      return date;
    }

    public String getName() {
      return name;
    }

    public Double getAmount() {
      return amount;
    }

    public List<String> getCategory() {
      return category;
    }

    public String getCategoryId() {
      return categoryId;
    }

    public Location getLocation() {
      return location;
    }

    public String getOriginalDescription() {
      return originalDescription;
    }

    public final class PaymentMeta {
      private String byOrderOf;
      private String payee;
      private String payer;
      private String paymentMethod;
      private String paymentProcessor;
      private String ppdId;
      private String reason;
      private String referenceNumber;

      public String getByOrderOf() {
        return byOrderOf;
      }

      public String getPayee() {
        return payee;
      }

      public String getPayer() {
        return payer;
      }

      public String getPaymentMethod() {
        return paymentMethod;
      }

      public String getPaymentProcessor() {
        return paymentProcessor;
      }

      public String getPpdId() {
        return ppdId;
      }

      public String getReason() {
        return reason;
      }

      public String getReferenceNumber() {
        return referenceNumber;
      }
    }

    public final class Location {
      private String address;
      private String city;
      private String state;
      private String zip;
      private Double lat;
      private Double lon;
      private String storeNumber;

      public String getAddress() {
        return address;
      }

      public String getCity() {
        return city;
      }

      public String getState() {
        return state;
      }

      public String getZip() {
        return zip;
      }

      public Double getLat() {
        return lat;
      }

      public Double getLon() {
        return lon;
      }

      public String getStoreNumber() {
        return storeNumber;
      }
    }
  }
}
