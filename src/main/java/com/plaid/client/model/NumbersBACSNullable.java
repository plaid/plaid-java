/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.46.1
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
import com.plaid.client.model.NumbersBACS;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * NumbersBACSNullable
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-10T01:11:28.812Z[GMT]")
public class NumbersBACSNullable {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_ACCOUNT = "account";
  @SerializedName(SERIALIZED_NAME_ACCOUNT)
  private String account;

  public static final String SERIALIZED_NAME_SORT_CODE = "sort_code";
  @SerializedName(SERIALIZED_NAME_SORT_CODE)
  private String sortCode;


  public NumbersBACSNullable accountId(String accountId) {
    
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


  public NumbersBACSNullable account(String account) {
    
    this.account = account;
    return this;
  }

   /**
   * The BACS account number for the account
   * @return account
  **/
  @ApiModelProperty(required = true, value = "The BACS account number for the account")

  public String getAccount() {
    return account;
  }


  public void setAccount(String account) {
    this.account = account;
  }


  public NumbersBACSNullable sortCode(String sortCode) {
    
    this.sortCode = sortCode;
    return this;
  }

   /**
   * The BACS sort code for the account
   * @return sortCode
  **/
  @ApiModelProperty(required = true, value = "The BACS sort code for the account")

  public String getSortCode() {
    return sortCode;
  }


  public void setSortCode(String sortCode) {
    this.sortCode = sortCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NumbersBACSNullable numbersBACSNullable = (NumbersBACSNullable) o;
    return Objects.equals(this.accountId, numbersBACSNullable.accountId) &&
        Objects.equals(this.account, numbersBACSNullable.account) &&
        Objects.equals(this.sortCode, numbersBACSNullable.sortCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, account, sortCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NumbersBACSNullable {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    sortCode: ").append(toIndentedString(sortCode)).append("\n");
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

