package com.plaid.client.response;

import java.util.Objects;
import java.util.List;
import java.util.Objects;

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
    private AddressData data;
    private boolean primary;

    public AddressData getData() {
      return data;
    }

    public boolean isPrimary() {
      return primary;
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      }
      if (obj == null || getClass() != obj.getClass()) {
        return false;
      }
      Address address = (Address) obj;
      return primary == address.primary &&
          Objects.equals(data, address.data);
    }

    @Override
    public int hashCode() {
      return Objects.hash(data, primary);
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

    @Override
    public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      }
      if (obj == null || getClass() != obj.getClass()) {
        return false;
      }
      AddressData addressData = (AddressData) obj;
      return Objects.equals(street, addressData.street) &&
          Objects.equals(city, addressData.city) &&
          Objects.equals(region, addressData.region) &&
          Objects.equals(postalCode, addressData.postalCode) &&
          Objects.equals(country, addressData.country);
    }

    @Override
    public int hashCode() {
      return Objects.hash(street, city, region, postalCode, country);
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

    @Override
    public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      }
      if (obj == null || getClass() != obj.getClass()) {
        return false;
      }
      Email email = (Email) obj;
      return primary == email.primary &&
          Objects.equals(data, email.data) &&
          Objects.equals(type, email.type);
    }

    @Override
    public int hashCode() {
      return Objects.hash(data, primary, type);
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

    @Override
    public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      }
      if (obj == null || getClass() != obj.getClass()) {
        return false;
      }
      PhoneNumber that = (PhoneNumber) obj;
      return primary == that.primary &&
          Objects.equals(data, that.data) &&
          Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
      return Objects.hash(data, primary, type);
    }
  }

}
