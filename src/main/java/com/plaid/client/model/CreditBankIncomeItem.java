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
import com.plaid.client.model.CreditBankIncomeAccount;
import com.plaid.client.model.CreditBankIncomeSource;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-12T21:24:48.076128Z[Etc/UTC]")
public class CreditBankIncomeItem {
  public static final String SERIALIZED_NAME_BANK_INCOME_ACCOUNTS = "bank_income_accounts";
  @SerializedName(SERIALIZED_NAME_BANK_INCOME_ACCOUNTS)
  private List<CreditBankIncomeAccount> bankIncomeAccounts = null;

  public static final String SERIALIZED_NAME_BANK_INCOME_SOURCES = "bank_income_sources";
  @SerializedName(SERIALIZED_NAME_BANK_INCOME_SOURCES)
  private List<CreditBankIncomeSource> bankIncomeSources = null;

  public static final String SERIALIZED_NAME_LAST_UPDATED_TIME = "last_updated_time";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATED_TIME)
  private OffsetDateTime lastUpdatedTime;

  public static final String SERIALIZED_NAME_INSTITUTION_ID = "institution_id";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_ID)
  private String institutionId;

  public static final String SERIALIZED_NAME_INSTITUTION_NAME = "institution_name";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_NAME)
  private String institutionName;

  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private String itemId;


  public CreditBankIncomeItem bankIncomeAccounts(List<CreditBankIncomeAccount> bankIncomeAccounts) {
    
    this.bankIncomeAccounts = bankIncomeAccounts;
    return this;
  }

  public CreditBankIncomeItem addBankIncomeAccountsItem(CreditBankIncomeAccount bankIncomeAccountsItem) {
    if (this.bankIncomeAccounts == null) {
      this.bankIncomeAccounts = new ArrayList<>();
    }
    this.bankIncomeAccounts.add(bankIncomeAccountsItem);
    return this;
  }

   /**
   * The Item&#39;s accounts that have Bank Income data.
   * @return bankIncomeAccounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Item's accounts that have Bank Income data.")

  public List<CreditBankIncomeAccount> getBankIncomeAccounts() {
    return bankIncomeAccounts;
  }


  public void setBankIncomeAccounts(List<CreditBankIncomeAccount> bankIncomeAccounts) {
    this.bankIncomeAccounts = bankIncomeAccounts;
  }


  public CreditBankIncomeItem bankIncomeSources(List<CreditBankIncomeSource> bankIncomeSources) {
    
    this.bankIncomeSources = bankIncomeSources;
    return this;
  }

  public CreditBankIncomeItem addBankIncomeSourcesItem(CreditBankIncomeSource bankIncomeSourcesItem) {
    if (this.bankIncomeSources == null) {
      this.bankIncomeSources = new ArrayList<>();
    }
    this.bankIncomeSources.add(bankIncomeSourcesItem);
    return this;
  }

   /**
   * The income sources for this Item. Each entry in the array is a single income source.
   * @return bankIncomeSources
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The income sources for this Item. Each entry in the array is a single income source.")

  public List<CreditBankIncomeSource> getBankIncomeSources() {
    return bankIncomeSources;
  }


  public void setBankIncomeSources(List<CreditBankIncomeSource> bankIncomeSources) {
    this.bankIncomeSources = bankIncomeSources;
  }


  public CreditBankIncomeItem lastUpdatedTime(OffsetDateTime lastUpdatedTime) {
    
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


  public CreditBankIncomeItem institutionId(String institutionId) {
    
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


  public CreditBankIncomeItem institutionName(String institutionName) {
    
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


  public CreditBankIncomeItem itemId(String itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * The unique identifier for the Item.
   * @return itemId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique identifier for the Item.")

  public String getItemId() {
    return itemId;
  }


  public void setItemId(String itemId) {
    this.itemId = itemId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditBankIncomeItem creditBankIncomeItem = (CreditBankIncomeItem) o;
    return Objects.equals(this.bankIncomeAccounts, creditBankIncomeItem.bankIncomeAccounts) &&
        Objects.equals(this.bankIncomeSources, creditBankIncomeItem.bankIncomeSources) &&
        Objects.equals(this.lastUpdatedTime, creditBankIncomeItem.lastUpdatedTime) &&
        Objects.equals(this.institutionId, creditBankIncomeItem.institutionId) &&
        Objects.equals(this.institutionName, creditBankIncomeItem.institutionName) &&
        Objects.equals(this.itemId, creditBankIncomeItem.itemId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankIncomeAccounts, bankIncomeSources, lastUpdatedTime, institutionId, institutionName, itemId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditBankIncomeItem {\n");
    sb.append("    bankIncomeAccounts: ").append(toIndentedString(bankIncomeAccounts)).append("\n");
    sb.append("    bankIncomeSources: ").append(toIndentedString(bankIncomeSources)).append("\n");
    sb.append("    lastUpdatedTime: ").append(toIndentedString(lastUpdatedTime)).append("\n");
    sb.append("    institutionId: ").append(toIndentedString(institutionId)).append("\n");
    sb.append("    institutionName: ").append(toIndentedString(institutionName)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
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

