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
import com.plaid.client.model.AccountBase;
import com.plaid.client.model.Holding;
import com.plaid.client.model.Item;
import com.plaid.client.model.Security;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * InvestmentsHoldingsGetResponse defines the response schema for &#x60;/investments/holdings/get&#x60;
 */
@ApiModel(description = "InvestmentsHoldingsGetResponse defines the response schema for `/investments/holdings/get`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-12T21:24:48.076128Z[Etc/UTC]")
public class InvestmentsHoldingsGetResponse {
  public static final String SERIALIZED_NAME_ACCOUNTS = "accounts";
  @SerializedName(SERIALIZED_NAME_ACCOUNTS)
  private List<AccountBase> accounts = new ArrayList<>();

  public static final String SERIALIZED_NAME_HOLDINGS = "holdings";
  @SerializedName(SERIALIZED_NAME_HOLDINGS)
  private List<Holding> holdings = new ArrayList<>();

  public static final String SERIALIZED_NAME_SECURITIES = "securities";
  @SerializedName(SERIALIZED_NAME_SECURITIES)
  private List<Security> securities = new ArrayList<>();

  public static final String SERIALIZED_NAME_ITEM = "item";
  @SerializedName(SERIALIZED_NAME_ITEM)
  private Item item;

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;

  public static final String SERIALIZED_NAME_IS_INVESTMENTS_FALLBACK_ITEM = "is_investments_fallback_item";
  @SerializedName(SERIALIZED_NAME_IS_INVESTMENTS_FALLBACK_ITEM)
  private Boolean isInvestmentsFallbackItem;


  public InvestmentsHoldingsGetResponse accounts(List<AccountBase> accounts) {
    
    this.accounts = accounts;
    return this;
  }

  public InvestmentsHoldingsGetResponse addAccountsItem(AccountBase accountsItem) {
    this.accounts.add(accountsItem);
    return this;
  }

   /**
   * The accounts associated with the Item
   * @return accounts
  **/
  @ApiModelProperty(required = true, value = "The accounts associated with the Item")

  public List<AccountBase> getAccounts() {
    return accounts;
  }


  public void setAccounts(List<AccountBase> accounts) {
    this.accounts = accounts;
  }


  public InvestmentsHoldingsGetResponse holdings(List<Holding> holdings) {
    
    this.holdings = holdings;
    return this;
  }

  public InvestmentsHoldingsGetResponse addHoldingsItem(Holding holdingsItem) {
    this.holdings.add(holdingsItem);
    return this;
  }

   /**
   * The holdings belonging to investment accounts associated with the Item. Details of the securities in the holdings are provided in the &#x60;securities&#x60; field. 
   * @return holdings
  **/
  @ApiModelProperty(required = true, value = "The holdings belonging to investment accounts associated with the Item. Details of the securities in the holdings are provided in the `securities` field. ")

  public List<Holding> getHoldings() {
    return holdings;
  }


  public void setHoldings(List<Holding> holdings) {
    this.holdings = holdings;
  }


  public InvestmentsHoldingsGetResponse securities(List<Security> securities) {
    
    this.securities = securities;
    return this;
  }

  public InvestmentsHoldingsGetResponse addSecuritiesItem(Security securitiesItem) {
    this.securities.add(securitiesItem);
    return this;
  }

   /**
   * Objects describing the securities held in the accounts associated with the Item. 
   * @return securities
  **/
  @ApiModelProperty(required = true, value = "Objects describing the securities held in the accounts associated with the Item. ")

  public List<Security> getSecurities() {
    return securities;
  }


  public void setSecurities(List<Security> securities) {
    this.securities = securities;
  }


  public InvestmentsHoldingsGetResponse item(Item item) {
    
    this.item = item;
    return this;
  }

   /**
   * Get item
   * @return item
  **/
  @ApiModelProperty(required = true, value = "")

  public Item getItem() {
    return item;
  }


  public void setItem(Item item) {
    this.item = item;
  }


  public InvestmentsHoldingsGetResponse requestId(String requestId) {
    
    this.requestId = requestId;
    return this;
  }

   /**
   * A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive.
   * @return requestId
  **/
  @ApiModelProperty(required = true, value = "A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive.")

  public String getRequestId() {
    return requestId;
  }


  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  public InvestmentsHoldingsGetResponse isInvestmentsFallbackItem(Boolean isInvestmentsFallbackItem) {
    
    this.isInvestmentsFallbackItem = isInvestmentsFallbackItem;
    return this;
  }

   /**
   * When true, this field indicates that the Item&#39;s portfolio was manually created with the Investments Fallback flow.
   * @return isInvestmentsFallbackItem
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When true, this field indicates that the Item's portfolio was manually created with the Investments Fallback flow.")

  public Boolean getIsInvestmentsFallbackItem() {
    return isInvestmentsFallbackItem;
  }


  public void setIsInvestmentsFallbackItem(Boolean isInvestmentsFallbackItem) {
    this.isInvestmentsFallbackItem = isInvestmentsFallbackItem;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvestmentsHoldingsGetResponse investmentsHoldingsGetResponse = (InvestmentsHoldingsGetResponse) o;
    return Objects.equals(this.accounts, investmentsHoldingsGetResponse.accounts) &&
        Objects.equals(this.holdings, investmentsHoldingsGetResponse.holdings) &&
        Objects.equals(this.securities, investmentsHoldingsGetResponse.securities) &&
        Objects.equals(this.item, investmentsHoldingsGetResponse.item) &&
        Objects.equals(this.requestId, investmentsHoldingsGetResponse.requestId) &&
        Objects.equals(this.isInvestmentsFallbackItem, investmentsHoldingsGetResponse.isInvestmentsFallbackItem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accounts, holdings, securities, item, requestId, isInvestmentsFallbackItem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvestmentsHoldingsGetResponse {\n");
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
    sb.append("    holdings: ").append(toIndentedString(holdings)).append("\n");
    sb.append("    securities: ").append(toIndentedString(securities)).append("\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    isInvestmentsFallbackItem: ").append(toIndentedString(isInvestmentsFallbackItem)).append("\n");
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

