package com.plaid.client.model.paymentinitiation;

import java.util.List;

public class Address {
  private List<String> street;
  private String city;
  private String postalCode;
  private String country;

  public Address(List<String> street, String city, String postalCode, String country) {
    this.street = street;
    this.city = city;
    this.postalCode = postalCode;
    this.country = country;
  }

  public List<String> getStreet() {
    return street;
  }

  public String getCity() {
    return city;
  }

  public String getPostalCode() {
    return postalCode;
  }

  public String getCountry() {
    return country;
  }
}
