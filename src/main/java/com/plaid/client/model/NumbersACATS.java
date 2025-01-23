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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Identifying information for transferring holdings to an investments account via ACATS.
 */
@ApiModel(description = "Identifying information for transferring holdings to an investments account via ACATS.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-23T18:11:57.813484Z[Etc/UTC]")
public class NumbersACATS {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_ACCOUNT = "account";
  @SerializedName(SERIALIZED_NAME_ACCOUNT)
  private String account;

  public static final String SERIALIZED_NAME_DTC_NUMBERS = "dtc_numbers";
  @SerializedName(SERIALIZED_NAME_DTC_NUMBERS)
  private List<String> dtcNumbers = new ArrayList<>();


  public NumbersACATS accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * The Plaid account ID associated with the account numbers
   * @return accountId
  **/
  @ApiModelProperty(required = true, value = "The Plaid account ID associated with the account numbers")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public NumbersACATS account(String account) {
    
    this.account = account;
    return this;
  }

   /**
   * The full account number for the account
   * @return account
  **/
  @ApiModelProperty(required = true, value = "The full account number for the account")

  public String getAccount() {
    return account;
  }


  public void setAccount(String account) {
    this.account = account;
  }


  public NumbersACATS dtcNumbers(List<String> dtcNumbers) {
    
    this.dtcNumbers = dtcNumbers;
    return this;
  }

  public NumbersACATS addDtcNumbersItem(String dtcNumbersItem) {
    this.dtcNumbers.add(dtcNumbersItem);
    return this;
  }

   /**
   * Identifiers for the clearinghouses that are associated with the account in order of relevance. This array will be empty if we can&#39;t provide any account level data. Institution level data can be retrieved from the institutions/get endpoints.
   * @return dtcNumbers
  **/
  @ApiModelProperty(required = true, value = "Identifiers for the clearinghouses that are associated with the account in order of relevance. This array will be empty if we can't provide any account level data. Institution level data can be retrieved from the institutions/get endpoints.")

  public List<String> getDtcNumbers() {
    return dtcNumbers;
  }


  public void setDtcNumbers(List<String> dtcNumbers) {
    this.dtcNumbers = dtcNumbers;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NumbersACATS numbersACATS = (NumbersACATS) o;
    return Objects.equals(this.accountId, numbersACATS.accountId) &&
        Objects.equals(this.account, numbersACATS.account) &&
        Objects.equals(this.dtcNumbers, numbersACATS.dtcNumbers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, account, dtcNumbers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NumbersACATS {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    dtcNumbers: ").append(toIndentedString(dtcNumbers)).append("\n");
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

