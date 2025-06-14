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
 * The user&#39;s address.
 */
@ApiModel(description = "The user's address.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-12T21:24:48.076128Z[Etc/UTC]")
public class UserAccountIdentityAddress {
  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_REGION = "region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private String region;

  public static final String SERIALIZED_NAME_STREET = "street";
  @SerializedName(SERIALIZED_NAME_STREET)
  private String street;

  public static final String SERIALIZED_NAME_STREET2 = "street2";
  @SerializedName(SERIALIZED_NAME_STREET2)
  private String street2;

  public static final String SERIALIZED_NAME_POSTAL_CODE = "postal_code";
  @SerializedName(SERIALIZED_NAME_POSTAL_CODE)
  private String postalCode;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;


  public UserAccountIdentityAddress city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * The full city name
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The full city name")

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public UserAccountIdentityAddress region(String region) {
    
    this.region = region;
    return this;
  }

   /**
   * The region or state. Example: &#x60;\&quot;NC\&quot;&#x60;
   * @return region
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The region or state. Example: `\"NC\"`")

  public String getRegion() {
    return region;
  }


  public void setRegion(String region) {
    this.region = region;
  }


  public UserAccountIdentityAddress street(String street) {
    
    this.street = street;
    return this;
  }

   /**
   * The full street address Example: &#x60;\&quot;564 Main Street, APT 15\&quot;&#x60;
   * @return street
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The full street address Example: `\"564 Main Street, APT 15\"`")

  public String getStreet() {
    return street;
  }


  public void setStreet(String street) {
    this.street = street;
  }


  public UserAccountIdentityAddress street2(String street2) {
    
    this.street2 = street2;
    return this;
  }

   /**
   * The second line street address
   * @return street2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The second line street address")

  public String getStreet2() {
    return street2;
  }


  public void setStreet2(String street2) {
    this.street2 = street2;
  }


  public UserAccountIdentityAddress postalCode(String postalCode) {
    
    this.postalCode = postalCode;
    return this;
  }

   /**
   * The postal code. In API versions 2018-05-22 and earlier, this field is called &#x60;zip&#x60;.
   * @return postalCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The postal code. In API versions 2018-05-22 and earlier, this field is called `zip`.")

  public String getPostalCode() {
    return postalCode;
  }


  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  public UserAccountIdentityAddress country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * The ISO 3166-1 alpha-2 country code
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ISO 3166-1 alpha-2 country code")

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
    UserAccountIdentityAddress userAccountIdentityAddress = (UserAccountIdentityAddress) o;
    return Objects.equals(this.city, userAccountIdentityAddress.city) &&
        Objects.equals(this.region, userAccountIdentityAddress.region) &&
        Objects.equals(this.street, userAccountIdentityAddress.street) &&
        Objects.equals(this.street2, userAccountIdentityAddress.street2) &&
        Objects.equals(this.postalCode, userAccountIdentityAddress.postalCode) &&
        Objects.equals(this.country, userAccountIdentityAddress.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, region, street, street2, postalCode, country);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAccountIdentityAddress {\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    street2: ").append(toIndentedString(street2)).append("\n");
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

