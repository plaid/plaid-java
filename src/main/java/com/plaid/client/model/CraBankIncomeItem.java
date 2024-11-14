/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.586.4
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
import com.plaid.client.model.CraBankIncomeAccount;
import com.plaid.client.model.CraBankIncomeSource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * The details and metadata for an end user&#39;s Item.
 */
@ApiModel(description = "The details and metadata for an end user's Item.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-14T16:41:31.650700Z[Etc/UTC]")
public class CraBankIncomeItem {
  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private String itemId;

  public static final String SERIALIZED_NAME_BANK_INCOME_ACCOUNTS = "bank_income_accounts";
  @SerializedName(SERIALIZED_NAME_BANK_INCOME_ACCOUNTS)
  private List<CraBankIncomeAccount> bankIncomeAccounts = new ArrayList<>();

  public static final String SERIALIZED_NAME_BANK_INCOME_SOURCES = "bank_income_sources";
  @SerializedName(SERIALIZED_NAME_BANK_INCOME_SOURCES)
  private List<CraBankIncomeSource> bankIncomeSources = new ArrayList<>();

  public static final String SERIALIZED_NAME_LAST_UPDATED_TIME = "last_updated_time";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATED_TIME)
  private OffsetDateTime lastUpdatedTime;

  public static final String SERIALIZED_NAME_INSTITUTION_ID = "institution_id";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_ID)
  private String institutionId;

  public static final String SERIALIZED_NAME_INSTITUTION_NAME = "institution_name";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_NAME)
  private String institutionName;


  public CraBankIncomeItem itemId(String itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * The &#x60;item_id&#x60; of the Item associated with this webhook, warning, or error
   * @return itemId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The `item_id` of the Item associated with this webhook, warning, or error")

  public String getItemId() {
    return itemId;
  }


  public void setItemId(String itemId) {
    this.itemId = itemId;
  }


  public CraBankIncomeItem bankIncomeAccounts(List<CraBankIncomeAccount> bankIncomeAccounts) {
    
    this.bankIncomeAccounts = bankIncomeAccounts;
    return this;
  }

  public CraBankIncomeItem addBankIncomeAccountsItem(CraBankIncomeAccount bankIncomeAccountsItem) {
    this.bankIncomeAccounts.add(bankIncomeAccountsItem);
    return this;
  }

   /**
   * The Item&#39;s accounts that have bank income data.
   * @return bankIncomeAccounts
  **/
  @ApiModelProperty(required = true, value = "The Item's accounts that have bank income data.")

  public List<CraBankIncomeAccount> getBankIncomeAccounts() {
    return bankIncomeAccounts;
  }


  public void setBankIncomeAccounts(List<CraBankIncomeAccount> bankIncomeAccounts) {
    this.bankIncomeAccounts = bankIncomeAccounts;
  }


  public CraBankIncomeItem bankIncomeSources(List<CraBankIncomeSource> bankIncomeSources) {
    
    this.bankIncomeSources = bankIncomeSources;
    return this;
  }

  public CraBankIncomeItem addBankIncomeSourcesItem(CraBankIncomeSource bankIncomeSourcesItem) {
    this.bankIncomeSources.add(bankIncomeSourcesItem);
    return this;
  }

   /**
   * The income sources for this Item. Each entry in the array is a single income source.
   * @return bankIncomeSources
  **/
  @ApiModelProperty(required = true, value = "The income sources for this Item. Each entry in the array is a single income source.")

  public List<CraBankIncomeSource> getBankIncomeSources() {
    return bankIncomeSources;
  }


  public void setBankIncomeSources(List<CraBankIncomeSource> bankIncomeSources) {
    this.bankIncomeSources = bankIncomeSources;
  }


  public CraBankIncomeItem lastUpdatedTime(OffsetDateTime lastUpdatedTime) {
    
    this.lastUpdatedTime = lastUpdatedTime;
    return this;
  }

   /**
   * The time when this Item&#39;s data was last retrieved from the financial institution.
   * @return lastUpdatedTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The time when this Item's data was last retrieved from the financial institution.")

  public OffsetDateTime getLastUpdatedTime() {
    return lastUpdatedTime;
  }


  public void setLastUpdatedTime(OffsetDateTime lastUpdatedTime) {
    this.lastUpdatedTime = lastUpdatedTime;
  }


  public CraBankIncomeItem institutionId(String institutionId) {
    
    this.institutionId = institutionId;
    return this;
  }

   /**
   * The unique identifier of the institution associated with the Item.
   * @return institutionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique identifier of the institution associated with the Item.")

  public String getInstitutionId() {
    return institutionId;
  }


  public void setInstitutionId(String institutionId) {
    this.institutionId = institutionId;
  }


  public CraBankIncomeItem institutionName(String institutionName) {
    
    this.institutionName = institutionName;
    return this;
  }

   /**
   * The name of the institution associated with the Item.
   * @return institutionName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the institution associated with the Item.")

  public String getInstitutionName() {
    return institutionName;
  }


  public void setInstitutionName(String institutionName) {
    this.institutionName = institutionName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CraBankIncomeItem craBankIncomeItem = (CraBankIncomeItem) o;
    return Objects.equals(this.itemId, craBankIncomeItem.itemId) &&
        Objects.equals(this.bankIncomeAccounts, craBankIncomeItem.bankIncomeAccounts) &&
        Objects.equals(this.bankIncomeSources, craBankIncomeItem.bankIncomeSources) &&
        Objects.equals(this.lastUpdatedTime, craBankIncomeItem.lastUpdatedTime) &&
        Objects.equals(this.institutionId, craBankIncomeItem.institutionId) &&
        Objects.equals(this.institutionName, craBankIncomeItem.institutionName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemId, bankIncomeAccounts, bankIncomeSources, lastUpdatedTime, institutionId, institutionName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CraBankIncomeItem {\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    bankIncomeAccounts: ").append(toIndentedString(bankIncomeAccounts)).append("\n");
    sb.append("    bankIncomeSources: ").append(toIndentedString(bankIncomeSources)).append("\n");
    sb.append("    lastUpdatedTime: ").append(toIndentedString(lastUpdatedTime)).append("\n");
    sb.append("    institutionId: ").append(toIndentedString(institutionId)).append("\n");
    sb.append("    institutionName: ").append(toIndentedString(institutionName)).append("\n");
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

