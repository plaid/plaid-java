/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.645.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.plaid.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * The optional address of the payment recipient&#39;s bank account. Required by most institutions outside of the UK.
 */
@ApiModel(description = "The optional address of the payment recipient's bank account. Required by most institutions outside of the UK.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-12T21:24:48.076128Z[Etc/UTC]")
public class PaymentInitiationAddress {
  public static final String SERIALIZED_NAME_STREET = "street";
  @SerializedName(SERIALIZED_NAME_STREET)
  private List<String> street = new ArrayList<>();

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_POSTAL_CODE = "postal_code";
  @SerializedName(SERIALIZED_NAME_POSTAL_CODE)
  private String postalCode;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;


  public PaymentInitiationAddress street(List<String> street) {
    
    this.street = street;
    return this;
  }

  public PaymentInitiationAddress addStreetItem(String streetItem) {
    this.street.add(streetItem);
    return this;
  }

   /**
   * An array of length 1-2 representing the street address where the recipient is located. Maximum of 70 characters.
   * @return street
  **/
  @ApiModelProperty(required = true, value = "An array of length 1-2 representing the street address where the recipient is located. Maximum of 70 characters.")

  public List<String> getStreet() {
    return street;
  }


  public void setStreet(List<String> street) {
    this.street = street;
  }


  public PaymentInitiationAddress city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * The city where the recipient is located. Maximum of 35 characters.
   * @return city
  **/
  @ApiModelProperty(required = true, value = "The city where the recipient is located. Maximum of 35 characters.")

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public PaymentInitiationAddress postalCode(String postalCode) {
    
    this.postalCode = postalCode;
    return this;
  }

   /**
   * The postal code where the recipient is located. Maximum of 16 characters.
   * @return postalCode
  **/
  @ApiModelProperty(required = true, value = "The postal code where the recipient is located. Maximum of 16 characters.")

  public String getPostalCode() {
    return postalCode;
  }


  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  public PaymentInitiationAddress country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * The ISO 3166-1 alpha-2 country code where the recipient is located.
   * @return country
  **/
  @ApiModelProperty(required = true, value = "The ISO 3166-1 alpha-2 country code where the recipient is located.")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentInitiationAddress paymentInitiationAddress = (PaymentInitiationAddress) o;
    return Objects.equals(this.street, paymentInitiationAddress.street) &&
        Objects.equals(this.city, paymentInitiationAddress.city) &&
        Objects.equals(this.postalCode, paymentInitiationAddress.postalCode) &&
        Objects.equals(this.country, paymentInitiationAddress.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(street, city, postalCode, country);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentInitiationAddress {\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

