/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.565.0
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
import com.plaid.client.model.BeaconBankAccountInsights;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * A collection of Bank Accounts linked to an Item that is associated with this Beacon User.
 */
@ApiModel(description = "A collection of Bank Accounts linked to an Item that is associated with this Beacon User.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-17T16:42:02.150702Z[Etc/UTC]")
public class BeaconBankAccounts {
  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private String itemId;

  public static final String SERIALIZED_NAME_ACCOUNTS = "accounts";
  @SerializedName(SERIALIZED_NAME_ACCOUNTS)
  private List<BeaconBankAccountInsights> accounts = new ArrayList<>();


  public BeaconBankAccounts itemId(String itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * The Plaid Item ID the Bank Accounts belong to.
   * @return itemId
  **/
  @ApiModelProperty(example = "515cd85321d3649aecddc015", required = true, value = "The Plaid Item ID the Bank Accounts belong to.")

  public String getItemId() {
    return itemId;
  }


  public void setItemId(String itemId) {
    this.itemId = itemId;
  }


  public BeaconBankAccounts accounts(List<BeaconBankAccountInsights> accounts) {
    
    this.accounts = accounts;
    return this;
  }

  public BeaconBankAccounts addAccountsItem(BeaconBankAccountInsights accountsItem) {
    this.accounts.add(accountsItem);
    return this;
  }

   /**
   * Get accounts
   * @return accounts
  **/
  @ApiModelProperty(required = true, value = "")

  public List<BeaconBankAccountInsights> getAccounts() {
    return accounts;
  }


  public void setAccounts(List<BeaconBankAccountInsights> accounts) {
    this.accounts = accounts;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BeaconBankAccounts beaconBankAccounts = (BeaconBankAccounts) o;
    return Objects.equals(this.itemId, beaconBankAccounts.itemId) &&
        Objects.equals(this.accounts, beaconBankAccounts.accounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemId, accounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BeaconBankAccounts {\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
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

