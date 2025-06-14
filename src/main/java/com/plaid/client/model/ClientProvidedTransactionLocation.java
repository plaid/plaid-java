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

/**
 * A representation of where a transaction took place.  Use this field to pass in structured location information you may have about your transactions. Providing location data is optional but can increase result quality. If you have unstructured location information, it may be appended to the &#x60;description&#x60; field.
 */
@ApiModel(description = "A representation of where a transaction took place.  Use this field to pass in structured location information you may have about your transactions. Providing location data is optional but can increase result quality. If you have unstructured location information, it may be appended to the `description` field.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-12T21:24:48.076128Z[Etc/UTC]")
public class ClientProvidedTransactionLocation {
  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_REGION = "region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private String region;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_POSTAL_CODE = "postal_code";
  @SerializedName(SERIALIZED_NAME_POSTAL_CODE)
  private String postalCode;


  public ClientProvidedTransactionLocation country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * The country where the transaction occurred.
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The country where the transaction occurred.")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public ClientProvidedTransactionLocation region(String region) {
    
    this.region = region;
    return this;
  }

   /**
   * The region or state where the transaction occurred.
   * @return region
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The region or state where the transaction occurred.")

  public String getRegion() {
    return region;
  }


  public void setRegion(String region) {
    this.region = region;
  }


  public ClientProvidedTransactionLocation city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * The city where the transaction occurred.
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The city where the transaction occurred.")

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public ClientProvidedTransactionLocation address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * The street address where the transaction occurred.
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The street address where the transaction occurred.")

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public ClientProvidedTransactionLocation postalCode(String postalCode) {
    
    this.postalCode = postalCode;
    return this;
  }

   /**
   * The postal code where the transaction occurred.
   * @return postalCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The postal code where the transaction occurred.")

  public String getPostalCode() {
    return postalCode;
  }


  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientProvidedTransactionLocation clientProvidedTransactionLocation = (ClientProvidedTransactionLocation) o;
    return Objects.equals(this.country, clientProvidedTransactionLocation.country) &&
        Objects.equals(this.region, clientProvidedTransactionLocation.region) &&
        Objects.equals(this.city, clientProvidedTransactionLocation.city) &&
        Objects.equals(this.address, clientProvidedTransactionLocation.address) &&
        Objects.equals(this.postalCode, clientProvidedTransactionLocation.postalCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, region, city, address, postalCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientProvidedTransactionLocation {\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
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

