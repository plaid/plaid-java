package com.plaid.client.response;

import java.util.List;

public final class IdentityGetResponse extends BaseResponse {
  private List<Account> accounts;
  private ItemStatus item;
  private Identity identity;

  public ItemStatus getItem() {
    return item;
  }

  public Identity getIdentity() {
    return identity;
  }

  public List<Account> getAccounts() {
    return accounts;
  }

  public final static class Identity {
    private List<String> names;
    private List<Email> emails;
    private List<Address> addresses;

    public List<String> getNames() {
      return names;
    }

    public List<Email> getEmails() {
      return emails;
    }


    public List<Address> getAddresses() {
      return addresses;
    }
  }

  public final static class Email {
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

  public final static class Address {
    private List<String> accounts;
    private Boolean primary;
    private AddressData data;

    public Boolean isPrimary() {
      return primary;
    }

    public List<String> getAccounts() {
      return accounts;
    }

    public AddressData getData() {
      return data;
    }
  }

  public final static class AddressData {
    private String street;
    private String city;
    private String state;
    private String zip;

    public String getStreet() {
      return street;
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
  }
}
