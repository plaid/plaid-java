package com.plaid.client.response;

import java.util.Date;
import java.util.List;

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
  }

  public static final class PhoneNumber {
    private String data;
    private boolean primary;
    private String type;

    public String getData() {
      return data;
    }

    public boolean isPrimary() {
      return primary;
    }

    public String getType() {
      return type;
    }
  }

  public static final class Email {
    private String data;
    private boolean primary;
    private String type;

    public String getData() {
      return data;
    }

    public boolean isPrimary() {
      return primary;
    }

    public String getType() {
      return type;
    }
  }

  public static final class Address {
    private AddressData data;
    private boolean primary;

    public AddressData getData() {
      return data;
    }

    public boolean isPrimary() {
      return primary;
    }
  }

  public static final class AddressData {
    private String city;
    private String state;
    private String street;
    private String zip;

    public String getCity() {
      return city;
    }

    public String getState() {
      return state;
    }

    public String getStreet() {
      return street;
    }

    public String getZip() {
      return zip;
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
