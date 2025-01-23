/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.610.1
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
import com.plaid.client.model.PaymentInitiationAddress;
import com.plaid.client.model.PaymentInitiationConsentPayerNumbers;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * An object representing the payment consent payer details.  Payer &#x60;name&#x60; and account &#x60;numbers&#x60; are required to lock the account to which the consent can be created.
 */
@ApiModel(description = "An object representing the payment consent payer details.  Payer `name` and account `numbers` are required to lock the account to which the consent can be created.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-23T20:55:58.809242Z[Etc/UTC]")
public class PaymentInitiationConsentPayerDetails {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NUMBERS = "numbers";
  @SerializedName(SERIALIZED_NAME_NUMBERS)
  private PaymentInitiationConsentPayerNumbers numbers;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private PaymentInitiationAddress address;

  public static final String SERIALIZED_NAME_DATE_OF_BIRTH = "date_of_birth";
  @SerializedName(SERIALIZED_NAME_DATE_OF_BIRTH)
  private LocalDate dateOfBirth;

  public static final String SERIALIZED_NAME_PHONE_NUMBERS = "phone_numbers";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBERS)
  private List<String> phoneNumbers = null;

  public static final String SERIALIZED_NAME_EMAILS = "emails";
  @SerializedName(SERIALIZED_NAME_EMAILS)
  private List<String> emails = null;


  public PaymentInitiationConsentPayerDetails name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the payer as it appears in their bank account
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the payer as it appears in their bank account")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public PaymentInitiationConsentPayerDetails numbers(PaymentInitiationConsentPayerNumbers numbers) {
    
    this.numbers = numbers;
    return this;
  }

   /**
   * Get numbers
   * @return numbers
  **/
  @ApiModelProperty(required = true, value = "")

  public PaymentInitiationConsentPayerNumbers getNumbers() {
    return numbers;
  }


  public void setNumbers(PaymentInitiationConsentPayerNumbers numbers) {
    this.numbers = numbers;
  }


  public PaymentInitiationConsentPayerDetails address(PaymentInitiationAddress address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentInitiationAddress getAddress() {
    return address;
  }


  public void setAddress(PaymentInitiationAddress address) {
    this.address = address;
  }


  public PaymentInitiationConsentPayerDetails dateOfBirth(LocalDate dateOfBirth) {
    
    this.dateOfBirth = dateOfBirth;
    return this;
  }

   /**
   * The payer&#39;s birthdate, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) (YYYY-MM-DD) format.
   * @return dateOfBirth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The payer's birthdate, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) (YYYY-MM-DD) format.")

  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }


  public void setDateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }


  public PaymentInitiationConsentPayerDetails phoneNumbers(List<String> phoneNumbers) {
    
    this.phoneNumbers = phoneNumbers;
    return this;
  }

  public PaymentInitiationConsentPayerDetails addPhoneNumbersItem(String phoneNumbersItem) {
    if (this.phoneNumbers == null) {
      this.phoneNumbers = new ArrayList<>();
    }
    this.phoneNumbers.add(phoneNumbersItem);
    return this;
  }

   /**
   * The payer&#39;s phone numbers in E.164 format: +{countrycode}{number}
   * @return phoneNumbers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The payer's phone numbers in E.164 format: +{countrycode}{number}")

  public List<String> getPhoneNumbers() {
    return phoneNumbers;
  }


  public void setPhoneNumbers(List<String> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
  }


  public PaymentInitiationConsentPayerDetails emails(List<String> emails) {
    
    this.emails = emails;
    return this;
  }

  public PaymentInitiationConsentPayerDetails addEmailsItem(String emailsItem) {
    if (this.emails == null) {
      this.emails = new ArrayList<>();
    }
    this.emails.add(emailsItem);
    return this;
  }

   /**
   * The payer&#39;s emails
   * @return emails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The payer's emails")

  public List<String> getEmails() {
    return emails;
  }


  public void setEmails(List<String> emails) {
    this.emails = emails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentInitiationConsentPayerDetails paymentInitiationConsentPayerDetails = (PaymentInitiationConsentPayerDetails) o;
    return Objects.equals(this.name, paymentInitiationConsentPayerDetails.name) &&
        Objects.equals(this.numbers, paymentInitiationConsentPayerDetails.numbers) &&
        Objects.equals(this.address, paymentInitiationConsentPayerDetails.address) &&
        Objects.equals(this.dateOfBirth, paymentInitiationConsentPayerDetails.dateOfBirth) &&
        Objects.equals(this.phoneNumbers, paymentInitiationConsentPayerDetails.phoneNumbers) &&
        Objects.equals(this.emails, paymentInitiationConsentPayerDetails.emails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, numbers, address, dateOfBirth, phoneNumbers, emails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentInitiationConsentPayerDetails {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    numbers: ").append(toIndentedString(numbers)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    phoneNumbers: ").append(toIndentedString(phoneNumbers)).append("\n");
    sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
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

