package com.plaid.client.response;

import java.util.Date;
import java.util.List;
import java.util.Objects;

import com.plaid.client.response.TransactionsGetResponse.Transaction.Location;
import com.plaid.client.response.TransactionsGetResponse.Transaction.PaymentMeta;
import com.plaid.client.response.IdentityGetResponse.Address;
import com.plaid.client.response.IdentityGetResponse.Email;
import com.plaid.client.response.IdentityGetResponse.PhoneNumber;

/**
 * See https://plaid.com/docs/#assets for more detail into the returned schema.
 **/
public class AssetReportGetResponse extends BaseResponse {
  private AssetReport report;
  private List<Warning> warnings;

  public AssetReport getReport() {
    return this.report;
  }

  public List<Warning> getWarnings() {
    return this.warnings;
  }

  public static final class AssetReport {
    private String assetReportId;
    private String clientReportId;
    private Date dateGenerated;
    private Integer daysRequested;
    private User user;
    private List<Item> items;

    public String getAssetReportId() {
      return assetReportId;
    }

    public String getClientReportId() {
      return clientReportId;
    }

    public Date getDateGenerated() {
      return dateGenerated;
    }

    public Integer getDaysRequested() {
      return daysRequested;
    }

    public User getUser() {
      return user;
    }

    public List<Item> getItems() {
      return items;
    }
  }

  public static final class User {
    private String clientUserId;
    private String firstName;
    private String middleName;
    private String lastName;
    private String ssn;
    private String phoneNumber;
    private String email;

    public String getClientUserId() {
      return clientUserId;
    }

    public String getFirstName() {
      return firstName;
    }

    public String getMiddleName() {
      return middleName;
    }

    public String getLastName() {
      return lastName;
    }

    public String getSsn() {
      return ssn;
    }

    public String getPhoneNumber() {
      return phoneNumber;
    }

    public String getEmail() {
      return email;
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      }
      if (obj == null || getClass() != obj.getClass()) {
        return false;
      }
      User user = (User) obj;
      return Objects.equals(clientUserId, user.clientUserId) &&
          Objects.equals(firstName, user.firstName) &&
          Objects.equals(middleName, user.middleName) &&
          Objects.equals(lastName, user.lastName) &&
          Objects.equals(ssn, user.ssn) &&
          Objects.equals(phoneNumber, user.phoneNumber) &&
          Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
      return Objects.hash(clientUserId, firstName, middleName, lastName, ssn, phoneNumber, email);
    }
  }

  // The item object returned in an asset report
  public static final class Item {
    private String itemId;
    private String institutionName;
    private String institutionId;
    private Date dateLastUpdated;
    private List<Account> accounts;

    public String getItemId() {
      return itemId;
    }

    public String getInstitutionName() {
      return institutionName;
    }

    public String getInstitutionId() {
      return institutionId;
    }

    public Date getDateLastUpdated() {
      return dateLastUpdated;
    }

    public List<Account> getAccounts() {
      return accounts;
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      }
      if (obj == null || getClass() != obj.getClass()) {
        return false;
      }
      Item item = (Item) obj;
      return Objects.equals(itemId, item.itemId) &&
          Objects.equals(institutionName, item.institutionName) &&
          Objects.equals(institutionId, item.institutionId) &&
          Objects.equals(accounts, item.accounts);
    }

    @Override
    public int hashCode() {
      return Objects.hash(itemId, institutionName, institutionId, accounts);
    }
  }

  public static final class Account {
    private String accountId;
    private String mask;
    private String name;
    private String officialName;
    private String type;
    private String subtype;
    private List<Owner> owners;
    private Balance balances;
    private List<HistoricalBalance> historicalBalances;
    private List<Transaction> transactions;
    private Integer daysAvailable;

    public String getAccountId() {
      return accountId;
    }

    public String getMask() {
      return mask;
    }

    public String getName() {
      return name;
    }

    public String getOfficialName() {
      return officialName;
    }

    public String getType() {
      return type;
    }

    public String getSubtype() {
      return subtype;
    }

    public List<Owner> getOwners() {
      return owners;
    }

    public Balance getBalances() {
      return balances;
    }

    public List<HistoricalBalance> getHistoricalBalances() {
      return historicalBalances;
    }

    public List<Transaction> getTransactions() {
      return transactions;
    }

    public Integer getDaysAvailable() {
      return daysAvailable;
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      }
      if (obj == null || getClass() != obj.getClass()) {
        return false;
      }
      Account account = (Account) obj;
      return Objects.equals(accountId, account.accountId) &&
          Objects.equals(mask, account.mask) &&
          Objects.equals(name, account.name) &&
          Objects.equals(officialName, account.officialName) &&
          Objects.equals(type, account.type) &&
          Objects.equals(subtype, account.subtype) &&
          Objects.equals(owners, account.owners) &&
          Objects.equals(balances, account.balances) &&
          Objects.equals(historicalBalances, account.historicalBalances) &&
          Objects.equals(transactions, account.transactions) &&
          Objects.equals(daysAvailable, account.daysAvailable);
    }

    @Override
    public int hashCode() {
      return Objects.hash(accountId, mask, name, officialName, type, subtype, owners, balances,
          historicalBalances, transactions, daysAvailable);
    }
  }

  public static final class Owner {
    private List<String> names;
    private List<PhoneNumber> phoneNumbers;
    private List<Email> emails;
    private List<Address> addresses;

    public List<String> getNames() {
      return names;
    }

    public List<PhoneNumber> getPhoneNumbers() {
      return phoneNumbers;
    }

    public List<Email> getEmails() {
      return emails;
    }

    public List<Address> getAddresses() {
      return addresses;
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      }
      if (obj == null || getClass() != obj.getClass()) {
        return false;
      }
      Owner owner = (Owner) obj;
      return Objects.equals(names, owner.names) &&
          Objects.equals(phoneNumbers, owner.phoneNumbers) &&
          Objects.equals(emails, owner.emails) &&
          Objects.equals(addresses, owner.addresses);
    }

    @Override
    public int hashCode() {
      return Objects.hash(names, phoneNumbers, emails, addresses);
    }
  }

  public static final class Balance {
    private Double avaliable;
    private Double current;
    private String unofficialCurrencyCode;
    private String isoCurrencyCode;

    public Double getAvaliable() {
      return avaliable;
    }

    public Double getCurrent() {
      return current;
    }

    public String getUnofficialCurrencyCode() {
      return unofficialCurrencyCode;
    }

    public String getIsoCurrencyCode() {
      return isoCurrencyCode;
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      }
      if (obj == null || getClass() != obj.getClass()) {
        return false;
      }
      Balance balance = (Balance) obj;
      return Objects.equals(avaliable, balance.avaliable) &&
          Objects.equals(current, balance.current) &&
          Objects.equals(unofficialCurrencyCode, balance.unofficialCurrencyCode) &&
          Objects.equals(isoCurrencyCode, balance.isoCurrencyCode);
    }

    @Override
    public int hashCode() {
      return Objects.hash(avaliable, current, unofficialCurrencyCode, isoCurrencyCode);
    }
  }

  public static final class HistoricalBalance {
    private Date date;
    private Double current;
    private String unofficialCurrencyCode;
    private String isoCurrencyCode;

    public Date getDate() {
      return date;
    }

    public Double getCurrent() {
      return current;
    }

    public String getUnofficialCurrencyCode() {
      return unofficialCurrencyCode;
    }

    public String getIsoCurrencyCode() {
      return isoCurrencyCode;
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      }
      if (obj == null || getClass() != obj.getClass()) {
        return false;
      }
      HistoricalBalance that = (HistoricalBalance) obj;
      return Objects.equals(date, that.date) &&
          Objects.equals(current, that.current) &&
          Objects.equals(unofficialCurrencyCode, that.unofficialCurrencyCode) &&
          Objects.equals(isoCurrencyCode, that.isoCurrencyCode);
    }

    @Override
    public int hashCode() {
      return Objects.hash(date, current, unofficialCurrencyCode, isoCurrencyCode);
    }
  }

  public static final class Transaction {
    private String accountId;
    private String transactionId;
    private Date date;
    private String originalDescription;
    private String pending;
    private Double amount;
    private String unofficialCurrencyCode;
    private String isoCurrencyCode;

    // The following fields are only included in an Asset Report with Insights.
    // For more information, see
    // https://plaid.com/docs/#retrieve-json-report-request.
    private String accountOwner;
    private List<String> category;
    private String categoryId;
    private String dateTransacted;
    private Location location;
    private String name;
    private PaymentMeta paymentMeta;
    private String pendingTransactionId;
    private String transactionType;

    public String getAccountId() {
      return accountId;
    }

    public String getTransactionId() {
      return transactionId;
    }

    public Date getDate() {
      return date;
    }

    public String getOriginalDescription() {
      return originalDescription;
    }

    public String getPending() {
      return pending;
    }

    public Double getAmount() {
      return amount;
    }

    public String getUnofficialCurrencyCode() {
      return unofficialCurrencyCode;
    }

    public String getIsoCurrencyCode() {
      return isoCurrencyCode;
    }

    public String getAccountOwner() {
      return accountOwner;
    }

    public List<String> getCategory() {
      return category;
    }

    public String getCategoryId() {
      return categoryId;
    }

    public String getDateTransacted() {
      return dateTransacted;
    }

    public Location getLocation() {
      return location;
    }

    public String getName() {
      return name;
    }

    public PaymentMeta getPaymentMeta() {
      return paymentMeta;
    }

    public String getPendingTransactionId() {
      return pendingTransactionId;
    }

    public String getTransactionType() {
      return transactionType;
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      }
      if (obj == null || getClass() != obj.getClass()) {
        return false;
      }
      Transaction that = (Transaction) obj;
      return Objects.equals(accountId, that.accountId) &&
          Objects.equals(transactionId, that.transactionId) &&
          Objects.equals(date, that.date) &&
          Objects.equals(originalDescription, that.originalDescription) &&
          Objects.equals(pending, that.pending) &&
          Objects.equals(amount, that.amount) &&
          Objects.equals(unofficialCurrencyCode, that.unofficialCurrencyCode) &&
          Objects.equals(isoCurrencyCode, that.isoCurrencyCode) &&
          Objects.equals(accountOwner, that.accountOwner) &&
          Objects.equals(category, that.category) &&
          Objects.equals(categoryId, that.categoryId) &&
          Objects.equals(dateTransacted, that.dateTransacted) &&
          Objects.equals(location, that.location) &&
          Objects.equals(name, that.name) &&
          Objects.equals(paymentMeta, that.paymentMeta) &&
          Objects.equals(pendingTransactionId, that.pendingTransactionId) &&
          Objects.equals(transactionType, that.transactionType);
    }

    @Override
    public int hashCode() {
      return Objects.hash(accountId, transactionId, date, originalDescription, pending, amount,
          unofficialCurrencyCode, isoCurrencyCode, accountOwner, category, categoryId,
          dateTransacted, location, name, paymentMeta, pendingTransactionId, transactionType);
    }
  }

  public static final class Warning {
    private String warningType;
    private String warningCode;
    private Cause cause;

    public String getWarningType() {
      return warningType;
    }

    public String getWarningCode() {
      return warningCode;
    }

    public Cause getCause() {
      return cause;
    }
  }

  public static final class Cause {
    private Error error;
    private String itemId;

    public Error getError() {
      return error;
    }

    public String getItemId() {
      return itemId;
    }
  }

  public static final class Error {
    private String errorType;
    private String errorCode;
    private String errorMessage;
    private String displayMessage;
    private Integer status;
    private List<Cause> causes;

    public String getErrorType() {
      return errorType;
    }

    public String getErrorCode() {
      return errorCode;
    }

    public String getErrorMessage() {
      return errorMessage;
    }

    public String getDisplayMessage() {
      return displayMessage;
    }

    public Integer getStatus() {
      return status;
    }

    public List<Cause> getCauses() {
      return causes;
    }
  }
}
