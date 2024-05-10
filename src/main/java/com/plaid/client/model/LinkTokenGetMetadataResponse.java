/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.503.5
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
import com.plaid.client.model.AccountFiltersResponse;
import com.plaid.client.model.CountryCode;
import com.plaid.client.model.LinkTokenCreateInstitutionData;
import com.plaid.client.model.Products;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * An object specifying the arguments originally provided to the &#x60;/link/token/create&#x60; call.
 */
@ApiModel(description = "An object specifying the arguments originally provided to the `/link/token/create` call.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-28T21:00:55.745394Z[Etc/UTC]")
public class LinkTokenGetMetadataResponse {
  public static final String SERIALIZED_NAME_INITIAL_PRODUCTS = "initial_products";
  @SerializedName(SERIALIZED_NAME_INITIAL_PRODUCTS)
  private List<Products> initialProducts = new ArrayList<>();

  public static final String SERIALIZED_NAME_WEBHOOK = "webhook";
  @SerializedName(SERIALIZED_NAME_WEBHOOK)
  private String webhook;

  public static final String SERIALIZED_NAME_COUNTRY_CODES = "country_codes";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODES)
  private List<CountryCode> countryCodes = new ArrayList<>();

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private String language;

  public static final String SERIALIZED_NAME_INSTITUTION_DATA = "institution_data";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_DATA)
  private LinkTokenCreateInstitutionData institutionData;

  public static final String SERIALIZED_NAME_ACCOUNT_FILTERS = "account_filters";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_FILTERS)
  private AccountFiltersResponse accountFilters;

  public static final String SERIALIZED_NAME_REDIRECT_URI = "redirect_uri";
  @SerializedName(SERIALIZED_NAME_REDIRECT_URI)
  private String redirectUri;

  public static final String SERIALIZED_NAME_CLIENT_NAME = "client_name";
  @SerializedName(SERIALIZED_NAME_CLIENT_NAME)
  private String clientName;


  public LinkTokenGetMetadataResponse initialProducts(List<Products> initialProducts) {
    
    this.initialProducts = initialProducts;
    return this;
  }

  public LinkTokenGetMetadataResponse addInitialProductsItem(Products initialProductsItem) {
    this.initialProducts.add(initialProductsItem);
    return this;
  }

   /**
   * The &#x60;products&#x60; specified in the &#x60;/link/token/create&#x60; call.
   * @return initialProducts
  **/
  @ApiModelProperty(required = true, value = "The `products` specified in the `/link/token/create` call.")

  public List<Products> getInitialProducts() {
    return initialProducts;
  }


  public void setInitialProducts(List<Products> initialProducts) {
    this.initialProducts = initialProducts;
  }


  public LinkTokenGetMetadataResponse webhook(String webhook) {
    
    this.webhook = webhook;
    return this;
  }

   /**
   * The &#x60;webhook&#x60; specified in the &#x60;/link/token/create&#x60; call.
   * @return webhook
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The `webhook` specified in the `/link/token/create` call.")

  public String getWebhook() {
    return webhook;
  }


  public void setWebhook(String webhook) {
    this.webhook = webhook;
  }


  public LinkTokenGetMetadataResponse countryCodes(List<CountryCode> countryCodes) {
    
    this.countryCodes = countryCodes;
    return this;
  }

  public LinkTokenGetMetadataResponse addCountryCodesItem(CountryCode countryCodesItem) {
    this.countryCodes.add(countryCodesItem);
    return this;
  }

   /**
   * The &#x60;country_codes&#x60; specified in the &#x60;/link/token/create&#x60; call.
   * @return countryCodes
  **/
  @ApiModelProperty(required = true, value = "The `country_codes` specified in the `/link/token/create` call.")

  public List<CountryCode> getCountryCodes() {
    return countryCodes;
  }


  public void setCountryCodes(List<CountryCode> countryCodes) {
    this.countryCodes = countryCodes;
  }


  public LinkTokenGetMetadataResponse language(String language) {
    
    this.language = language;
    return this;
  }

   /**
   * The &#x60;language&#x60; specified in the &#x60;/link/token/create&#x60; call.
   * @return language
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The `language` specified in the `/link/token/create` call.")

  public String getLanguage() {
    return language;
  }


  public void setLanguage(String language) {
    this.language = language;
  }


  public LinkTokenGetMetadataResponse institutionData(LinkTokenCreateInstitutionData institutionData) {
    
    this.institutionData = institutionData;
    return this;
  }

   /**
   * Get institutionData
   * @return institutionData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LinkTokenCreateInstitutionData getInstitutionData() {
    return institutionData;
  }


  public void setInstitutionData(LinkTokenCreateInstitutionData institutionData) {
    this.institutionData = institutionData;
  }


  public LinkTokenGetMetadataResponse accountFilters(AccountFiltersResponse accountFilters) {
    
    this.accountFilters = accountFilters;
    return this;
  }

   /**
   * Get accountFilters
   * @return accountFilters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AccountFiltersResponse getAccountFilters() {
    return accountFilters;
  }


  public void setAccountFilters(AccountFiltersResponse accountFilters) {
    this.accountFilters = accountFilters;
  }


  public LinkTokenGetMetadataResponse redirectUri(String redirectUri) {
    
    this.redirectUri = redirectUri;
    return this;
  }

   /**
   * The &#x60;redirect_uri&#x60; specified in the &#x60;/link/token/create&#x60; call.
   * @return redirectUri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The `redirect_uri` specified in the `/link/token/create` call.")

  public String getRedirectUri() {
    return redirectUri;
  }


  public void setRedirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
  }


  public LinkTokenGetMetadataResponse clientName(String clientName) {
    
    this.clientName = clientName;
    return this;
  }

   /**
   * The &#x60;client_name&#x60; specified in the &#x60;/link/token/create&#x60; call.
   * @return clientName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The `client_name` specified in the `/link/token/create` call.")

  public String getClientName() {
    return clientName;
  }


  public void setClientName(String clientName) {
    this.clientName = clientName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkTokenGetMetadataResponse linkTokenGetMetadataResponse = (LinkTokenGetMetadataResponse) o;
    return Objects.equals(this.initialProducts, linkTokenGetMetadataResponse.initialProducts) &&
        Objects.equals(this.webhook, linkTokenGetMetadataResponse.webhook) &&
        Objects.equals(this.countryCodes, linkTokenGetMetadataResponse.countryCodes) &&
        Objects.equals(this.language, linkTokenGetMetadataResponse.language) &&
        Objects.equals(this.institutionData, linkTokenGetMetadataResponse.institutionData) &&
        Objects.equals(this.accountFilters, linkTokenGetMetadataResponse.accountFilters) &&
        Objects.equals(this.redirectUri, linkTokenGetMetadataResponse.redirectUri) &&
        Objects.equals(this.clientName, linkTokenGetMetadataResponse.clientName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(initialProducts, webhook, countryCodes, language, institutionData, accountFilters, redirectUri, clientName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkTokenGetMetadataResponse {\n");
    sb.append("    initialProducts: ").append(toIndentedString(initialProducts)).append("\n");
    sb.append("    webhook: ").append(toIndentedString(webhook)).append("\n");
    sb.append("    countryCodes: ").append(toIndentedString(countryCodes)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    institutionData: ").append(toIndentedString(institutionData)).append("\n");
    sb.append("    accountFilters: ").append(toIndentedString(accountFilters)).append("\n");
    sb.append("    redirectUri: ").append(toIndentedString(redirectUri)).append("\n");
    sb.append("    clientName: ").append(toIndentedString(clientName)).append("\n");
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

