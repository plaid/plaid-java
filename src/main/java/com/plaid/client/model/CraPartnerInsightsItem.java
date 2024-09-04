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
import com.plaid.client.model.CraPartnerInsightsItemAccount;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * The details and metadata for an end user&#39;s Item.
 */
@ApiModel(description = "The details and metadata for an end user's Item.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-04T15:13:56.933796Z[Etc/UTC]")
public class CraPartnerInsightsItem {
  public static final String SERIALIZED_NAME_INSTITUTION_ID = "institution_id";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_ID)
  private String institutionId;

  public static final String SERIALIZED_NAME_INSTITUTION_NAME = "institution_name";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_NAME)
  private String institutionName;

  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private String itemId;

  public static final String SERIALIZED_NAME_ACCOUNTS = "accounts";
  @SerializedName(SERIALIZED_NAME_ACCOUNTS)
  private List<CraPartnerInsightsItemAccount> accounts = null;


  public CraPartnerInsightsItem institutionId(String institutionId) {
    
    this.institutionId = institutionId;
    return this;
  }

   /**
   * The ID for the institution that the user linked.
   * @return institutionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID for the institution that the user linked.")

  public String getInstitutionId() {
    return institutionId;
  }


  public void setInstitutionId(String institutionId) {
    this.institutionId = institutionId;
  }


  public CraPartnerInsightsItem institutionName(String institutionName) {
    
    this.institutionName = institutionName;
    return this;
  }

   /**
   * The name of the institution the user linked.
   * @return institutionName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the institution the user linked.")

  public String getInstitutionName() {
    return institutionName;
  }


  public void setInstitutionName(String institutionName) {
    this.institutionName = institutionName;
  }


  public CraPartnerInsightsItem itemId(String itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * The identifier for the item.
   * @return itemId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The identifier for the item.")

  public String getItemId() {
    return itemId;
  }


  public void setItemId(String itemId) {
    this.itemId = itemId;
  }


  public CraPartnerInsightsItem accounts(List<CraPartnerInsightsItemAccount> accounts) {
    
    this.accounts = accounts;
    return this;
  }

  public CraPartnerInsightsItem addAccountsItem(CraPartnerInsightsItemAccount accountsItem) {
    if (this.accounts == null) {
      this.accounts = new ArrayList<>();
    }
    this.accounts.add(accountsItem);
    return this;
  }

   /**
   * A list of accounts in the item
   * @return accounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of accounts in the item")

  public List<CraPartnerInsightsItemAccount> getAccounts() {
    return accounts;
  }


  public void setAccounts(List<CraPartnerInsightsItemAccount> accounts) {
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
    CraPartnerInsightsItem craPartnerInsightsItem = (CraPartnerInsightsItem) o;
    return Objects.equals(this.institutionId, craPartnerInsightsItem.institutionId) &&
        Objects.equals(this.institutionName, craPartnerInsightsItem.institutionName) &&
        Objects.equals(this.itemId, craPartnerInsightsItem.itemId) &&
        Objects.equals(this.accounts, craPartnerInsightsItem.accounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(institutionId, institutionName, itemId, accounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CraPartnerInsightsItem {\n");
    sb.append("    institutionId: ").append(toIndentedString(institutionId)).append("\n");
    sb.append("    institutionName: ").append(toIndentedString(institutionName)).append("\n");
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

