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
 * An object containing a BACS account number and sort code. If an IBAN is not provided or if you need to accept domestic GBP-denominated payments, BACS data is required.
 */
@ApiModel(description = "An object containing a BACS account number and sort code. If an IBAN is not provided or if you need to accept domestic GBP-denominated payments, BACS data is required.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-12T21:24:48.076128Z[Etc/UTC]")
public class RecipientBACS {
  public static final String SERIALIZED_NAME_ACCOUNT = "account";
  @SerializedName(SERIALIZED_NAME_ACCOUNT)
  private String account;

  public static final String SERIALIZED_NAME_SORT_CODE = "sort_code";
  @SerializedName(SERIALIZED_NAME_SORT_CODE)
  private String sortCode;


  public RecipientBACS account(String account) {
    
    this.account = account;
    return this;
  }

   /**
   * The account number of the account. Maximum of 10 characters.
   * @return account
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The account number of the account. Maximum of 10 characters.")

  public String getAccount() {
    return account;
  }


  public void setAccount(String account) {
    this.account = account;
  }


  public RecipientBACS sortCode(String sortCode) {
    
    this.sortCode = sortCode;
    return this;
  }

   /**
   * The 6-character sort code of the account.
   * @return sortCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The 6-character sort code of the account.")

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
    RecipientBACS recipientBACS = (RecipientBACS) o;
    return Objects.equals(this.account, recipientBACS.account) &&
        Objects.equals(this.sortCode, recipientBACS.sortCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, sortCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipientBACS {\n");
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

