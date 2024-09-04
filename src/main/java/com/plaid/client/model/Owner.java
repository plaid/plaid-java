/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.555.0
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
import com.plaid.client.model.Address;
import com.plaid.client.model.Email;
import com.plaid.client.model.PhoneNumber;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Data returned from the financial institution about the owner or owners of an account. Only the &#x60;names&#x60; array must be non-empty.
 */
@ApiModel(description = "Data returned from the financial institution about the owner or owners of an account. Only the `names` array must be non-empty.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-04T15:13:56.933796Z[Etc/UTC]")
public class Owner {
  public static final String SERIALIZED_NAME_NAMES = "names";
  @SerializedName(SERIALIZED_NAME_NAMES)
  private List<String> names = new ArrayList<>();

  public static final String SERIALIZED_NAME_PHONE_NUMBERS = "phone_numbers";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBERS)
  private List<PhoneNumber> phoneNumbers = new ArrayList<>();

  public static final String SERIALIZED_NAME_EMAILS = "emails";
  @SerializedName(SERIALIZED_NAME_EMAILS)
  private List<Email> emails = new ArrayList<>();

  public static final String SERIALIZED_NAME_ADDRESSES = "addresses";
  @SerializedName(SERIALIZED_NAME_ADDRESSES)
  private List<Address> addresses = new ArrayList<>();


  public Owner names(List<String> names) {
    
    this.names = names;
    return this;
  }

  public Owner addNamesItem(String namesItem) {
    this.names.add(namesItem);
    return this;
  }

   /**
   * A list of names associated with the account by the financial institution. In the case of a joint account, Plaid will make a best effort to report the names of all account holders.  If an Item contains multiple accounts with different owner names, some institutions will report all names associated with the Item in each account&#39;s &#x60;names&#x60; array.
   * @return names
  **/
  @ApiModelProperty(required = true, value = "A list of names associated with the account by the financial institution. In the case of a joint account, Plaid will make a best effort to report the names of all account holders.  If an Item contains multiple accounts with different owner names, some institutions will report all names associated with the Item in each account's `names` array.")

  public List<String> getNames() {
    return names;
  }


  public void setNames(List<String> names) {
    this.names = names;
  }


  public Owner phoneNumbers(List<PhoneNumber> phoneNumbers) {
    
    this.phoneNumbers = phoneNumbers;
    return this;
  }

  public Owner addPhoneNumbersItem(PhoneNumber phoneNumbersItem) {
    this.phoneNumbers.add(phoneNumbersItem);
    return this;
  }

   /**
   * A list of phone numbers associated with the account by the financial institution. May be an empty array if no relevant information is returned from the financial institution.
   * @return phoneNumbers
  **/
  @ApiModelProperty(required = true, value = "A list of phone numbers associated with the account by the financial institution. May be an empty array if no relevant information is returned from the financial institution.")

  public List<PhoneNumber> getPhoneNumbers() {
    return phoneNumbers;
  }


  public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
  }


  public Owner emails(List<Email> emails) {
    
    this.emails = emails;
    return this;
  }

  public Owner addEmailsItem(Email emailsItem) {
    this.emails.add(emailsItem);
    return this;
  }

   /**
   * A list of email addresses associated with the account by the financial institution. May be an empty array if no relevant information is returned from the financial institution.
   * @return emails
  **/
  @ApiModelProperty(required = true, value = "A list of email addresses associated with the account by the financial institution. May be an empty array if no relevant information is returned from the financial institution.")

  public List<Email> getEmails() {
    return emails;
  }


  public void setEmails(List<Email> emails) {
    this.emails = emails;
  }


  public Owner addresses(List<Address> addresses) {
    
    this.addresses = addresses;
    return this;
  }

  public Owner addAddressesItem(Address addressesItem) {
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * Data about the various addresses associated with the account by the financial institution. May be an empty array if no relevant information is returned from the financial institution.
   * @return addresses
  **/
  @ApiModelProperty(required = true, value = "Data about the various addresses associated with the account by the financial institution. May be an empty array if no relevant information is returned from the financial institution.")

  public List<Address> getAddresses() {
    return addresses;
  }


  public void setAddresses(List<Address> addresses) {
    this.addresses = addresses;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Owner owner = (Owner) o;
    return Objects.equals(this.names, owner.names) &&
        Objects.equals(this.phoneNumbers, owner.phoneNumbers) &&
        Objects.equals(this.emails, owner.emails) &&
        Objects.equals(this.addresses, owner.addresses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(names, phoneNumbers, emails, addresses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Owner {\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    phoneNumbers: ").append(toIndentedString(phoneNumbers)).append("\n");
    sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
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

