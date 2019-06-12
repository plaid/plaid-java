package com.plaid.client.response;

import java.util.List;

public final class IdentityGetResponse extends BaseResponse {
  private ItemStatus item;
  private List<AccountWithOwners> accounts;

  public ItemStatus getItem() {
    return item;
  }

  public List<AccountWithOwners> getAccounts() {
    return accounts;
  }

  public static final class AccountWithOwners extends Account {
    private List<Identity> owners;

    public List<Identity> getOwners() {
      return owners;
    }
  }

  public static final class Identity {
    private List<Address> addresses;
    private List<Email> emails;
    private List<String> names;
    private List<PhoneNumber> phoneNumbers;

    public List<Address> getAddresses() {
      return addresses;
    }

    public List<Email> getEmails() {
      return emails;
    }

    public List<String> getNames() {
      return names;
    }

    public List<PhoneNumber> getPhoneNumbers() {
      return phoneNumbers;
    }
  }

  public static final class Address {
    private Boolean primary;
    private AddressData data;

    public Boolean isPrimary() {
      return primary;
    }

    public AddressData getData() {
      return data;
    }
  }

  public static final class AddressData {
    private String street;
    private String city;
    private String region;
    private String postalCode;
    private String country;

    public String getStreet() {
      return street;
    }

    public String getCity() {
      return city;
    }

    public String getRegion() {
      return region;
    }

    public String getPostalCode() {
      return postalCode;
    }

    public String getCountry() {
      return country;
    }
  }

  public static final class Email {
    private Boolean primary;
    private String data;
    private String type;

    public Boolean isPrimary() {
      return primary;
    }

    public String getData() {
      return data;
    }

    public String getType() {
      return type;
    }
  }

  public static final class PhoneNumber {
    private Boolean primary;
    private String data;
    private String type;

    public Boolean isPrimary() {
      return primary;
    }

    public String getData() {
      return data;
    }

    public String getType() {
      return type;
    }
  }
}
