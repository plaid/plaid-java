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
import com.plaid.client.model.InvestmentsAuthAccountDetails401k;
import com.plaid.client.model.InvestmentsAuthDataSources;
import com.plaid.client.model.InvestmentsAuthGetNumbers;
import com.plaid.client.model.InvestmentsAuthOwner;
import com.plaid.client.model.Item;
import com.plaid.client.model.Security;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * InvestmentsAuthGetResponse defines the response schema for &#x60;/investments/auth/get&#x60;
 */
@ApiModel(description = "InvestmentsAuthGetResponse defines the response schema for `/investments/auth/get`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-12T21:24:48.076128Z[Etc/UTC]")
public class InvestmentsAuthGetResponse {
  public static final String SERIALIZED_NAME_ACCOUNTS = "accounts";
  @SerializedName(SERIALIZED_NAME_ACCOUNTS)
  private List<AccountBase> accounts = new ArrayList<>();

  public static final String SERIALIZED_NAME_HOLDINGS = "holdings";
  @SerializedName(SERIALIZED_NAME_HOLDINGS)
  private List<Holding> holdings = new ArrayList<>();

  public static final String SERIALIZED_NAME_SECURITIES = "securities";
  @SerializedName(SERIALIZED_NAME_SECURITIES)
  private List<Security> securities = new ArrayList<>();

  public static final String SERIALIZED_NAME_OWNERS = "owners";
  @SerializedName(SERIALIZED_NAME_OWNERS)
  private List<InvestmentsAuthOwner> owners = new ArrayList<>();

  public static final String SERIALIZED_NAME_NUMBERS = "numbers";
  @SerializedName(SERIALIZED_NAME_NUMBERS)
  private InvestmentsAuthGetNumbers numbers;

  public static final String SERIALIZED_NAME_DATA_SOURCES = "data_sources";
  @SerializedName(SERIALIZED_NAME_DATA_SOURCES)
  private InvestmentsAuthDataSources dataSources;

  public static final String SERIALIZED_NAME_ACCOUNT_DETAILS401K = "account_details_401k";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_DETAILS401K)
  private List<InvestmentsAuthAccountDetails401k> accountDetails401k = null;

  public static final String SERIALIZED_NAME_ITEM = "item";
  @SerializedName(SERIALIZED_NAME_ITEM)
  private Item item;

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;


  public InvestmentsAuthGetResponse accounts(List<AccountBase> accounts) {
    
    this.accounts = accounts;
    return this;
  }

  public InvestmentsAuthGetResponse addAccountsItem(AccountBase accountsItem) {
    this.accounts.add(accountsItem);
    return this;
  }

   /**
   * The accounts for which data is being retrieved
   * @return accounts
  **/
  @ApiModelProperty(required = true, value = "The accounts for which data is being retrieved")

  public List<AccountBase> getAccounts() {
    return accounts;
  }


  public void setAccounts(List<AccountBase> accounts) {
    this.accounts = accounts;
  }


  public InvestmentsAuthGetResponse holdings(List<Holding> holdings) {
    
    this.holdings = holdings;
    return this;
  }

  public InvestmentsAuthGetResponse addHoldingsItem(Holding holdingsItem) {
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


  public InvestmentsAuthGetResponse securities(List<Security> securities) {
    
    this.securities = securities;
    return this;
  }

  public InvestmentsAuthGetResponse addSecuritiesItem(Security securitiesItem) {
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


  public InvestmentsAuthGetResponse owners(List<InvestmentsAuthOwner> owners) {
    
    this.owners = owners;
    return this;
  }

  public InvestmentsAuthGetResponse addOwnersItem(InvestmentsAuthOwner ownersItem) {
    this.owners.add(ownersItem);
    return this;
  }

   /**
   * Information about the account owners for the accounts associated with the Item. 
   * @return owners
  **/
  @ApiModelProperty(required = true, value = "Information about the account owners for the accounts associated with the Item. ")

  public List<InvestmentsAuthOwner> getOwners() {
    return owners;
  }


  public void setOwners(List<InvestmentsAuthOwner> owners) {
    this.owners = owners;
  }


  public InvestmentsAuthGetResponse numbers(InvestmentsAuthGetNumbers numbers) {
    
    this.numbers = numbers;
    return this;
  }

   /**
   * Get numbers
   * @return numbers
  **/
  @ApiModelProperty(required = true, value = "")

  public InvestmentsAuthGetNumbers getNumbers() {
    return numbers;
  }


  public void setNumbers(InvestmentsAuthGetNumbers numbers) {
    this.numbers = numbers;
  }


  public InvestmentsAuthGetResponse dataSources(InvestmentsAuthDataSources dataSources) {
    
    this.dataSources = dataSources;
    return this;
  }

   /**
   * Get dataSources
   * @return dataSources
  **/
  @ApiModelProperty(required = true, value = "")

  public InvestmentsAuthDataSources getDataSources() {
    return dataSources;
  }


  public void setDataSources(InvestmentsAuthDataSources dataSources) {
    this.dataSources = dataSources;
  }


  public InvestmentsAuthGetResponse accountDetails401k(List<InvestmentsAuthAccountDetails401k> accountDetails401k) {
    
    this.accountDetails401k = accountDetails401k;
    return this;
  }

  public InvestmentsAuthGetResponse addAccountDetails401kItem(InvestmentsAuthAccountDetails401k accountDetails401kItem) {
    if (this.accountDetails401k == null) {
      this.accountDetails401k = new ArrayList<>();
    }
    this.accountDetails401k.add(accountDetails401kItem);
    return this;
  }

   /**
   * Additional information for accounts of 401k subtype.
   * @return accountDetails401k
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Additional information for accounts of 401k subtype.")

  public List<InvestmentsAuthAccountDetails401k> getAccountDetails401k() {
    return accountDetails401k;
  }


  public void setAccountDetails401k(List<InvestmentsAuthAccountDetails401k> accountDetails401k) {
    this.accountDetails401k = accountDetails401k;
  }


  public InvestmentsAuthGetResponse item(Item item) {
    
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


  public InvestmentsAuthGetResponse requestId(String requestId) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvestmentsAuthGetResponse investmentsAuthGetResponse = (InvestmentsAuthGetResponse) o;
    return Objects.equals(this.accounts, investmentsAuthGetResponse.accounts) &&
        Objects.equals(this.holdings, investmentsAuthGetResponse.holdings) &&
        Objects.equals(this.securities, investmentsAuthGetResponse.securities) &&
        Objects.equals(this.owners, investmentsAuthGetResponse.owners) &&
        Objects.equals(this.numbers, investmentsAuthGetResponse.numbers) &&
        Objects.equals(this.dataSources, investmentsAuthGetResponse.dataSources) &&
        Objects.equals(this.accountDetails401k, investmentsAuthGetResponse.accountDetails401k) &&
        Objects.equals(this.item, investmentsAuthGetResponse.item) &&
        Objects.equals(this.requestId, investmentsAuthGetResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accounts, holdings, securities, owners, numbers, dataSources, accountDetails401k, item, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvestmentsAuthGetResponse {\n");
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
    sb.append("    holdings: ").append(toIndentedString(holdings)).append("\n");
    sb.append("    securities: ").append(toIndentedString(securities)).append("\n");
    sb.append("    owners: ").append(toIndentedString(owners)).append("\n");
    sb.append("    numbers: ").append(toIndentedString(numbers)).append("\n");
    sb.append("    dataSources: ").append(toIndentedString(dataSources)).append("\n");
    sb.append("    accountDetails401k: ").append(toIndentedString(accountDetails401k)).append("\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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

