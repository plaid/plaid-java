/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.575.0
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
import com.plaid.client.model.WalletTransactionCounterpartyNumbers;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;

/**
 * An object representing the e-wallet transaction&#39;s counterparty
 */
@ApiModel(description = "An object representing the e-wallet transaction's counterparty")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-09T17:51:17.896278Z[Etc/UTC]")
public class WalletTransactionCounterparty {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NUMBERS = "numbers";
  @SerializedName(SERIALIZED_NAME_NUMBERS)
  private WalletTransactionCounterpartyNumbers numbers;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private PaymentInitiationAddress address;

  public static final String SERIALIZED_NAME_DATE_OF_BIRTH = "date_of_birth";
  @SerializedName(SERIALIZED_NAME_DATE_OF_BIRTH)
  private LocalDate dateOfBirth;


  public WalletTransactionCounterparty name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the counterparty
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the counterparty")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public WalletTransactionCounterparty numbers(WalletTransactionCounterpartyNumbers numbers) {
    
    this.numbers = numbers;
    return this;
  }

   /**
   * Get numbers
   * @return numbers
  **/
  @ApiModelProperty(required = true, value = "")

  public WalletTransactionCounterpartyNumbers getNumbers() {
    return numbers;
  }


  public void setNumbers(WalletTransactionCounterpartyNumbers numbers) {
    this.numbers = numbers;
  }


  public WalletTransactionCounterparty address(PaymentInitiationAddress address) {
    
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


  public WalletTransactionCounterparty dateOfBirth(LocalDate dateOfBirth) {
    
    this.dateOfBirth = dateOfBirth;
    return this;
  }

   /**
   * The counterparty&#39;s birthdate, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) (YYYY-MM-DD) format.
   * @return dateOfBirth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The counterparty's birthdate, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) (YYYY-MM-DD) format.")

  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }


  public void setDateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WalletTransactionCounterparty walletTransactionCounterparty = (WalletTransactionCounterparty) o;
    return Objects.equals(this.name, walletTransactionCounterparty.name) &&
        Objects.equals(this.numbers, walletTransactionCounterparty.numbers) &&
        Objects.equals(this.address, walletTransactionCounterparty.address) &&
        Objects.equals(this.dateOfBirth, walletTransactionCounterparty.dateOfBirth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, numbers, address, dateOfBirth);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WalletTransactionCounterparty {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    numbers: ").append(toIndentedString(numbers)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
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

