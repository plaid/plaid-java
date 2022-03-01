/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.78.2
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
import com.plaid.client.model.AccountAssets;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * A representation of an Item within an Asset Report.
 */
@ApiModel(description = "A representation of an Item within an Asset Report.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-01T22:12:31.879Z[GMT]")
public class AssetReportItem {
  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private String itemId;

  public static final String SERIALIZED_NAME_INSTITUTION_NAME = "institution_name";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_NAME)
  private String institutionName;

  public static final String SERIALIZED_NAME_INSTITUTION_ID = "institution_id";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_ID)
  private String institutionId;

  public static final String SERIALIZED_NAME_DATE_LAST_UPDATED = "date_last_updated";
  @SerializedName(SERIALIZED_NAME_DATE_LAST_UPDATED)
  private OffsetDateTime dateLastUpdated;

  public static final String SERIALIZED_NAME_ACCOUNTS = "accounts";
  @SerializedName(SERIALIZED_NAME_ACCOUNTS)
  private List<AccountAssets> accounts = new ArrayList<>();


  public AssetReportItem itemId(String itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * The &#x60;item_id&#x60; of the Item associated with this webhook, warning, or error
   * @return itemId
  **/
  @ApiModelProperty(required = true, value = "The `item_id` of the Item associated with this webhook, warning, or error")

  public String getItemId() {
    return itemId;
  }


  public void setItemId(String itemId) {
    this.itemId = itemId;
  }


  public AssetReportItem institutionName(String institutionName) {
    
    this.institutionName = institutionName;
    return this;
  }

   /**
   * The full financial institution name associated with the Item.
   * @return institutionName
  **/
  @ApiModelProperty(required = true, value = "The full financial institution name associated with the Item.")

  public String getInstitutionName() {
    return institutionName;
  }


  public void setInstitutionName(String institutionName) {
    this.institutionName = institutionName;
  }


  public AssetReportItem institutionId(String institutionId) {
    
    this.institutionId = institutionId;
    return this;
  }

   /**
   * The id of the financial institution associated with the Item.
   * @return institutionId
  **/
  @ApiModelProperty(required = true, value = "The id of the financial institution associated with the Item.")

  public String getInstitutionId() {
    return institutionId;
  }


  public void setInstitutionId(String institutionId) {
    this.institutionId = institutionId;
  }


  public AssetReportItem dateLastUpdated(OffsetDateTime dateLastUpdated) {
    
    this.dateLastUpdated = dateLastUpdated;
    return this;
  }

   /**
   * The date and time when this Item’s data was last retrieved from the financial institution, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format.
   * @return dateLastUpdated
  **/
  @ApiModelProperty(required = true, value = "The date and time when this Item’s data was last retrieved from the financial institution, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format.")

  public OffsetDateTime getDateLastUpdated() {
    return dateLastUpdated;
  }


  public void setDateLastUpdated(OffsetDateTime dateLastUpdated) {
    this.dateLastUpdated = dateLastUpdated;
  }


  public AssetReportItem accounts(List<AccountAssets> accounts) {
    
    this.accounts = accounts;
    return this;
  }

  public AssetReportItem addAccountsItem(AccountAssets accountsItem) {
    this.accounts.add(accountsItem);
    return this;
  }

   /**
   * Data about each of the accounts open on the Item.
   * @return accounts
  **/
  @ApiModelProperty(required = true, value = "Data about each of the accounts open on the Item.")

  public List<AccountAssets> getAccounts() {
    return accounts;
  }


  public void setAccounts(List<AccountAssets> accounts) {
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
    AssetReportItem assetReportItem = (AssetReportItem) o;
    return Objects.equals(this.itemId, assetReportItem.itemId) &&
        Objects.equals(this.institutionName, assetReportItem.institutionName) &&
        Objects.equals(this.institutionId, assetReportItem.institutionId) &&
        Objects.equals(this.dateLastUpdated, assetReportItem.dateLastUpdated) &&
        Objects.equals(this.accounts, assetReportItem.accounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemId, institutionName, institutionId, dateLastUpdated, accounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetReportItem {\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    institutionName: ").append(toIndentedString(institutionName)).append("\n");
    sb.append("    institutionId: ").append(toIndentedString(institutionId)).append("\n");
    sb.append("    dateLastUpdated: ").append(toIndentedString(dateLastUpdated)).append("\n");
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

