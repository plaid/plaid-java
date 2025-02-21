/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.620.0
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
import com.plaid.client.model.AddressMatchScore;
import com.plaid.client.model.EmailAddressMatchScore;
import com.plaid.client.model.NameMatchScore;
import com.plaid.client.model.PhoneNumberMatchScore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * AccountIdentityMatchScoreAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-21T16:44:11.345889Z[Etc/UTC]")
public class AccountIdentityMatchScoreAllOf {
  public static final String SERIALIZED_NAME_LEGAL_NAME = "legal_name";
  @SerializedName(SERIALIZED_NAME_LEGAL_NAME)
  private NameMatchScore legalName;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phone_number";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private PhoneNumberMatchScore phoneNumber;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESS = "email_address";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS)
  private EmailAddressMatchScore emailAddress;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private AddressMatchScore address;


  public AccountIdentityMatchScoreAllOf legalName(NameMatchScore legalName) {
    
    this.legalName = legalName;
    return this;
  }

   /**
   * Get legalName
   * @return legalName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NameMatchScore getLegalName() {
    return legalName;
  }


  public void setLegalName(NameMatchScore legalName) {
    this.legalName = legalName;
  }


  public AccountIdentityMatchScoreAllOf phoneNumber(PhoneNumberMatchScore phoneNumber) {
    
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Get phoneNumber
   * @return phoneNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PhoneNumberMatchScore getPhoneNumber() {
    return phoneNumber;
  }


  public void setPhoneNumber(PhoneNumberMatchScore phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public AccountIdentityMatchScoreAllOf emailAddress(EmailAddressMatchScore emailAddress) {
    
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * Get emailAddress
   * @return emailAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EmailAddressMatchScore getEmailAddress() {
    return emailAddress;
  }


  public void setEmailAddress(EmailAddressMatchScore emailAddress) {
    this.emailAddress = emailAddress;
  }


  public AccountIdentityMatchScoreAllOf address(AddressMatchScore address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AddressMatchScore getAddress() {
    return address;
  }


  public void setAddress(AddressMatchScore address) {
    this.address = address;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountIdentityMatchScoreAllOf accountIdentityMatchScoreAllOf = (AccountIdentityMatchScoreAllOf) o;
    return Objects.equals(this.legalName, accountIdentityMatchScoreAllOf.legalName) &&
        Objects.equals(this.phoneNumber, accountIdentityMatchScoreAllOf.phoneNumber) &&
        Objects.equals(this.emailAddress, accountIdentityMatchScoreAllOf.emailAddress) &&
        Objects.equals(this.address, accountIdentityMatchScoreAllOf.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(legalName, phoneNumber, emailAddress, address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountIdentityMatchScoreAllOf {\n");
    sb.append("    legalName: ").append(toIndentedString(legalName)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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

