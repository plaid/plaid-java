/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.54.0
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
import com.plaid.client.model.CountryCode;
import com.plaid.client.model.LinkTokenAccountFilters;
import com.plaid.client.model.LinkTokenCreateRequestAuth;
import com.plaid.client.model.LinkTokenCreateRequestDepositSwitch;
import com.plaid.client.model.LinkTokenCreateRequestIncomeVerification;
import com.plaid.client.model.LinkTokenCreateRequestPaymentInitiation;
import com.plaid.client.model.LinkTokenCreateRequestTransfer;
import com.plaid.client.model.LinkTokenCreateRequestUpdate;
import com.plaid.client.model.LinkTokenCreateRequestUser;
import com.plaid.client.model.LinkTokenEUConfig;
import com.plaid.client.model.Products;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * LinkTokenCreateRequest defines the request schema for &#x60;/link/token/create&#x60;
 */
@ApiModel(description = "LinkTokenCreateRequest defines the request schema for `/link/token/create`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-30T23:52:40.867Z[GMT]")
public class LinkTokenCreateRequest {
  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_CLIENT_NAME = "client_name";
  @SerializedName(SERIALIZED_NAME_CLIENT_NAME)
  private String clientName;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private String language;

  public static final String SERIALIZED_NAME_COUNTRY_CODES = "country_codes";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODES)
  private List<CountryCode> countryCodes = new ArrayList<>();

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private LinkTokenCreateRequestUser user;

  public static final String SERIALIZED_NAME_PRODUCTS = "products";
  @SerializedName(SERIALIZED_NAME_PRODUCTS)
  private List<Products> products = null;

  public static final String SERIALIZED_NAME_WEBHOOK = "webhook";
  @SerializedName(SERIALIZED_NAME_WEBHOOK)
  private String webhook;

  public static final String SERIALIZED_NAME_ACCESS_TOKEN = "access_token";
  @SerializedName(SERIALIZED_NAME_ACCESS_TOKEN)
  private String accessToken;

  public static final String SERIALIZED_NAME_LINK_CUSTOMIZATION_NAME = "link_customization_name";
  @SerializedName(SERIALIZED_NAME_LINK_CUSTOMIZATION_NAME)
  private String linkCustomizationName;

  public static final String SERIALIZED_NAME_REDIRECT_URI = "redirect_uri";
  @SerializedName(SERIALIZED_NAME_REDIRECT_URI)
  private String redirectUri;

  public static final String SERIALIZED_NAME_ANDROID_PACKAGE_NAME = "android_package_name";
  @SerializedName(SERIALIZED_NAME_ANDROID_PACKAGE_NAME)
  private String androidPackageName;

  public static final String SERIALIZED_NAME_ACCOUNT_FILTERS = "account_filters";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_FILTERS)
  private LinkTokenAccountFilters accountFilters;

  public static final String SERIALIZED_NAME_EU_CONFIG = "eu_config";
  @SerializedName(SERIALIZED_NAME_EU_CONFIG)
  private LinkTokenEUConfig euConfig;

  public static final String SERIALIZED_NAME_INSTITUTION_ID = "institution_id";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_ID)
  private String institutionId;

  public static final String SERIALIZED_NAME_PAYMENT_INITIATION = "payment_initiation";
  @SerializedName(SERIALIZED_NAME_PAYMENT_INITIATION)
  private LinkTokenCreateRequestPaymentInitiation paymentInitiation;

  public static final String SERIALIZED_NAME_DEPOSIT_SWITCH = "deposit_switch";
  @SerializedName(SERIALIZED_NAME_DEPOSIT_SWITCH)
  private LinkTokenCreateRequestDepositSwitch depositSwitch;

  public static final String SERIALIZED_NAME_INCOME_VERIFICATION = "income_verification";
  @SerializedName(SERIALIZED_NAME_INCOME_VERIFICATION)
  private LinkTokenCreateRequestIncomeVerification incomeVerification;

  public static final String SERIALIZED_NAME_AUTH = "auth";
  @SerializedName(SERIALIZED_NAME_AUTH)
  private LinkTokenCreateRequestAuth auth;

  public static final String SERIALIZED_NAME_TRANSFER = "transfer";
  @SerializedName(SERIALIZED_NAME_TRANSFER)
  private LinkTokenCreateRequestTransfer transfer;

  public static final String SERIALIZED_NAME_UPDATE = "update";
  @SerializedName(SERIALIZED_NAME_UPDATE)
  private LinkTokenCreateRequestUpdate update;


  public LinkTokenCreateRequest clientId(String clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * Your Plaid API &#x60;client_id&#x60;. The &#x60;client_id&#x60; is required and may be provided either in the &#x60;PLAID-CLIENT-ID&#x60; header or as part of a request body.
   * @return clientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Your Plaid API `client_id`. The `client_id` is required and may be provided either in the `PLAID-CLIENT-ID` header or as part of a request body.")

  public String getClientId() {
    return clientId;
  }


  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public LinkTokenCreateRequest secret(String secret) {
    
    this.secret = secret;
    return this;
  }

   /**
   * Your Plaid API &#x60;secret&#x60;. The &#x60;secret&#x60; is required and may be provided either in the &#x60;PLAID-SECRET&#x60; header or as part of a request body.
   * @return secret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Your Plaid API `secret`. The `secret` is required and may be provided either in the `PLAID-SECRET` header or as part of a request body.")

  public String getSecret() {
    return secret;
  }


  public void setSecret(String secret) {
    this.secret = secret;
  }


  public LinkTokenCreateRequest clientName(String clientName) {
    
    this.clientName = clientName;
    return this;
  }

   /**
   * The name of your application, as it should be displayed in Link. Maximum length of 30 characters. If a value longer than 30 characters is provided, Link will display \&quot;This Application\&quot; instead.
   * @return clientName
  **/
  @ApiModelProperty(required = true, value = "The name of your application, as it should be displayed in Link. Maximum length of 30 characters. If a value longer than 30 characters is provided, Link will display \"This Application\" instead.")

  public String getClientName() {
    return clientName;
  }


  public void setClientName(String clientName) {
    this.clientName = clientName;
  }


  public LinkTokenCreateRequest language(String language) {
    
    this.language = language;
    return this;
  }

   /**
   * The language that Link should be displayed in.  Supported languages are: - English (&#x60;&#39;en&#39;&#x60;) - French (&#x60;&#39;fr&#39;&#x60;) - Spanish (&#x60;&#39;es&#39;&#x60;) - Dutch (&#x60;&#39;nl&#39;&#x60;) - German(&#x60;&#39;de&#39;&#x60;)  When using a Link customization, the language configured here must match the setting in the customization, or the customization will not be applied.
   * @return language
  **/
  @ApiModelProperty(required = true, value = "The language that Link should be displayed in.  Supported languages are: - English (`'en'`) - French (`'fr'`) - Spanish (`'es'`) - Dutch (`'nl'`) - German(`'de'`)  When using a Link customization, the language configured here must match the setting in the customization, or the customization will not be applied.")

  public String getLanguage() {
    return language;
  }


  public void setLanguage(String language) {
    this.language = language;
  }


  public LinkTokenCreateRequest countryCodes(List<CountryCode> countryCodes) {
    
    this.countryCodes = countryCodes;
    return this;
  }

  public LinkTokenCreateRequest addCountryCodesItem(CountryCode countryCodesItem) {
    this.countryCodes.add(countryCodesItem);
    return this;
  }

   /**
   * Specify an array of Plaid-supported country codes using the ISO-3166-1 alpha-2 country code standard. Institutions from all listed countries will be shown.  Supported country codes are: &#x60;US&#x60;, &#x60;CA&#x60;, &#x60;DE&#x60;, &#x60;ES&#x60;, &#x60;FR&#x60;, &#x60;GB&#x60;, &#x60;IE&#x60;, &#x60;NL&#x60;. For a complete mapping of supported products by country, see https://plaid.com/global/.  If Link is launched with multiple country codes, only products that you are enabled for in all countries will be used by Link. Note that while all countries are enabled by default in Sandbox and Development, in Production only US and Canada are enabled by default. To gain access to European institutions in the Production environment, [file a product access Support ticket](https://dashboard.plaid.com/support/new/product-and-development/product-troubleshooting/request-product-access) via the Plaid dashboard. If you initialize with a European country code, your users will see the European consent panel during the Link flow.  If using a Link customization, make sure the country codes in the customization match those specified in &#x60;country_codes&#x60;. If both &#x60;country_codes&#x60; and a Link customization are used, the value in &#x60;country_codes&#x60; may override the value in the customization.  If using the Auth features Instant Match, Same-day Micro-deposits, or Automated Micro-deposits, &#x60;country_codes&#x60; must be set to &#x60;[&#39;US&#39;]&#x60;.
   * @return countryCodes
  **/
  @ApiModelProperty(required = true, value = "Specify an array of Plaid-supported country codes using the ISO-3166-1 alpha-2 country code standard. Institutions from all listed countries will be shown.  Supported country codes are: `US`, `CA`, `DE`, `ES`, `FR`, `GB`, `IE`, `NL`. For a complete mapping of supported products by country, see https://plaid.com/global/.  If Link is launched with multiple country codes, only products that you are enabled for in all countries will be used by Link. Note that while all countries are enabled by default in Sandbox and Development, in Production only US and Canada are enabled by default. To gain access to European institutions in the Production environment, [file a product access Support ticket](https://dashboard.plaid.com/support/new/product-and-development/product-troubleshooting/request-product-access) via the Plaid dashboard. If you initialize with a European country code, your users will see the European consent panel during the Link flow.  If using a Link customization, make sure the country codes in the customization match those specified in `country_codes`. If both `country_codes` and a Link customization are used, the value in `country_codes` may override the value in the customization.  If using the Auth features Instant Match, Same-day Micro-deposits, or Automated Micro-deposits, `country_codes` must be set to `['US']`.")

  public List<CountryCode> getCountryCodes() {
    return countryCodes;
  }


  public void setCountryCodes(List<CountryCode> countryCodes) {
    this.countryCodes = countryCodes;
  }


  public LinkTokenCreateRequest user(LinkTokenCreateRequestUser user) {
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @ApiModelProperty(required = true, value = "")

  public LinkTokenCreateRequestUser getUser() {
    return user;
  }


  public void setUser(LinkTokenCreateRequestUser user) {
    this.user = user;
  }


  public LinkTokenCreateRequest products(List<Products> products) {
    
    this.products = products;
    return this;
  }

  public LinkTokenCreateRequest addProductsItem(Products productsItem) {
    if (this.products == null) {
      this.products = new ArrayList<>();
    }
    this.products.add(productsItem);
    return this;
  }

   /**
   * List of Plaid product(s) you wish to use. If launching Link in update mode, should be omitted; required otherwise. Valid products are:  &#x60;transactions&#x60;, &#x60;auth&#x60;, &#x60;identity&#x60;, &#x60;assets&#x60;, &#x60;investments&#x60;, &#x60;liabilities&#x60;, &#x60;payment_initiation&#x60;, &#x60;deposit_switch&#x60;, &#x60;income_verification&#x60;, &#x60;transfer&#x60;  &#x60;balance&#x60; is *not* a valid value, the Balance product does not require explicit initalization and will automatically be initialized when any other product is initialized.  Only institutions that support *all* requested products will be shown in Link; to maximize the number of institutions listed, it is recommended to initialize Link with the minimal product set required for your use case. Additional products can be added after Link initialization by calling the relevant endpoints. For details and exceptions, see [Choosing when to initialize products](https://plaid.com/docs/link/best-practices/#choosing-when-to-initialize-products).  Note that, unless you have opted to disable Instant Match support, institutions that support Instant Match will also be shown in Link if &#x60;auth&#x60; is specified as a product, even though these institutions do not contain &#x60;auth&#x60; in their product array.  In Production, you will be billed for each product that you specify when initializing Link. Note that a product cannot be removed from an Item once the Item has been initialized with that product. To stop billing on an Item for subscription-based products, such as Liabilities, Investments, and Transactions, remove the Item via &#x60;/item/remove&#x60;.
   * @return products
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of Plaid product(s) you wish to use. If launching Link in update mode, should be omitted; required otherwise. Valid products are:  `transactions`, `auth`, `identity`, `assets`, `investments`, `liabilities`, `payment_initiation`, `deposit_switch`, `income_verification`, `transfer`  `balance` is *not* a valid value, the Balance product does not require explicit initalization and will automatically be initialized when any other product is initialized.  Only institutions that support *all* requested products will be shown in Link; to maximize the number of institutions listed, it is recommended to initialize Link with the minimal product set required for your use case. Additional products can be added after Link initialization by calling the relevant endpoints. For details and exceptions, see [Choosing when to initialize products](https://plaid.com/docs/link/best-practices/#choosing-when-to-initialize-products).  Note that, unless you have opted to disable Instant Match support, institutions that support Instant Match will also be shown in Link if `auth` is specified as a product, even though these institutions do not contain `auth` in their product array.  In Production, you will be billed for each product that you specify when initializing Link. Note that a product cannot be removed from an Item once the Item has been initialized with that product. To stop billing on an Item for subscription-based products, such as Liabilities, Investments, and Transactions, remove the Item via `/item/remove`.")

  public List<Products> getProducts() {
    return products;
  }


  public void setProducts(List<Products> products) {
    this.products = products;
  }


  public LinkTokenCreateRequest webhook(String webhook) {
    
    this.webhook = webhook;
    return this;
  }

   /**
   * The destination URL to which any webhooks should be sent.
   * @return webhook
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The destination URL to which any webhooks should be sent.")

  public String getWebhook() {
    return webhook;
  }


  public void setWebhook(String webhook) {
    this.webhook = webhook;
  }


  public LinkTokenCreateRequest accessToken(String accessToken) {
    
    this.accessToken = accessToken;
    return this;
  }

   /**
   * The &#x60;access_token&#x60; associated with the Item to update, used when updating or modifying an existing &#x60;access_token&#x60;. Used when launching Link in update mode, when completing the Same-day (manual) Micro-deposit flow, or (optionally) when initializing Link as part of the Payment Initiation (UK and Europe) flow.
   * @return accessToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The `access_token` associated with the Item to update, used when updating or modifying an existing `access_token`. Used when launching Link in update mode, when completing the Same-day (manual) Micro-deposit flow, or (optionally) when initializing Link as part of the Payment Initiation (UK and Europe) flow.")

  public String getAccessToken() {
    return accessToken;
  }


  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }


  public LinkTokenCreateRequest linkCustomizationName(String linkCustomizationName) {
    
    this.linkCustomizationName = linkCustomizationName;
    return this;
  }

   /**
   * The name of the Link customization from the Plaid Dashboard to be applied to Link. If not specified, the &#x60;default&#x60; customization will be used. When using a Link customization, the language in the customization must match the language selected via the &#x60;language&#x60; parameter, and the countries in the customization should match the country codes selected via &#x60;country_codes&#x60;.
   * @return linkCustomizationName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the Link customization from the Plaid Dashboard to be applied to Link. If not specified, the `default` customization will be used. When using a Link customization, the language in the customization must match the language selected via the `language` parameter, and the countries in the customization should match the country codes selected via `country_codes`.")

  public String getLinkCustomizationName() {
    return linkCustomizationName;
  }


  public void setLinkCustomizationName(String linkCustomizationName) {
    this.linkCustomizationName = linkCustomizationName;
  }


  public LinkTokenCreateRequest redirectUri(String redirectUri) {
    
    this.redirectUri = redirectUri;
    return this;
  }

   /**
   * A URI indicating the destination where a user should be forwarded after completing the Link flow; used to support OAuth authentication flows when launching Link in the browser or via a webview. The &#x60;redirect_uri&#x60; should not contain any query parameters. When used in Production or Development, must be an https URI. To specify any subdomain, use &#x60;*&#x60; as a wildcard character, e.g. &#x60;https://_*.example.com/oauth.html&#x60;. If &#x60;android_package_name&#x60; is specified, this field should be left blank.  Note that any redirect URI must also be added to the Allowed redirect URIs list in the [developer dashboard](https://dashboard.plaid.com/team/api).
   * @return redirectUri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A URI indicating the destination where a user should be forwarded after completing the Link flow; used to support OAuth authentication flows when launching Link in the browser or via a webview. The `redirect_uri` should not contain any query parameters. When used in Production or Development, must be an https URI. To specify any subdomain, use `*` as a wildcard character, e.g. `https://_*.example.com/oauth.html`. If `android_package_name` is specified, this field should be left blank.  Note that any redirect URI must also be added to the Allowed redirect URIs list in the [developer dashboard](https://dashboard.plaid.com/team/api).")

  public String getRedirectUri() {
    return redirectUri;
  }


  public void setRedirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
  }


  public LinkTokenCreateRequest androidPackageName(String androidPackageName) {
    
    this.androidPackageName = androidPackageName;
    return this;
  }

   /**
   * The name of your app&#39;s Android package. Required if using the &#x60;link_token&#x60; to initialize Link on Android. When creating a &#x60;link_token&#x60; for initializing Link on other platforms, this field must be left blank. Any package name specified here must also be added to the Allowed Android package names setting on the [developer dashboard](https://dashboard.plaid.com/team/api). 
   * @return androidPackageName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of your app's Android package. Required if using the `link_token` to initialize Link on Android. When creating a `link_token` for initializing Link on other platforms, this field must be left blank. Any package name specified here must also be added to the Allowed Android package names setting on the [developer dashboard](https://dashboard.plaid.com/team/api). ")

  public String getAndroidPackageName() {
    return androidPackageName;
  }


  public void setAndroidPackageName(String androidPackageName) {
    this.androidPackageName = androidPackageName;
  }


  public LinkTokenCreateRequest accountFilters(LinkTokenAccountFilters accountFilters) {
    
    this.accountFilters = accountFilters;
    return this;
  }

   /**
   * Get accountFilters
   * @return accountFilters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LinkTokenAccountFilters getAccountFilters() {
    return accountFilters;
  }


  public void setAccountFilters(LinkTokenAccountFilters accountFilters) {
    this.accountFilters = accountFilters;
  }


  public LinkTokenCreateRequest euConfig(LinkTokenEUConfig euConfig) {
    
    this.euConfig = euConfig;
    return this;
  }

   /**
   * Get euConfig
   * @return euConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LinkTokenEUConfig getEuConfig() {
    return euConfig;
  }


  public void setEuConfig(LinkTokenEUConfig euConfig) {
    this.euConfig = euConfig;
  }


  public LinkTokenCreateRequest institutionId(String institutionId) {
    
    this.institutionId = institutionId;
    return this;
  }

   /**
   * Used for certain Europe-only configurations, as well as certain legacy use cases in other regions.
   * @return institutionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Used for certain Europe-only configurations, as well as certain legacy use cases in other regions.")

  public String getInstitutionId() {
    return institutionId;
  }


  public void setInstitutionId(String institutionId) {
    this.institutionId = institutionId;
  }


  public LinkTokenCreateRequest paymentInitiation(LinkTokenCreateRequestPaymentInitiation paymentInitiation) {
    
    this.paymentInitiation = paymentInitiation;
    return this;
  }

   /**
   * Get paymentInitiation
   * @return paymentInitiation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LinkTokenCreateRequestPaymentInitiation getPaymentInitiation() {
    return paymentInitiation;
  }


  public void setPaymentInitiation(LinkTokenCreateRequestPaymentInitiation paymentInitiation) {
    this.paymentInitiation = paymentInitiation;
  }


  public LinkTokenCreateRequest depositSwitch(LinkTokenCreateRequestDepositSwitch depositSwitch) {
    
    this.depositSwitch = depositSwitch;
    return this;
  }

   /**
   * Get depositSwitch
   * @return depositSwitch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LinkTokenCreateRequestDepositSwitch getDepositSwitch() {
    return depositSwitch;
  }


  public void setDepositSwitch(LinkTokenCreateRequestDepositSwitch depositSwitch) {
    this.depositSwitch = depositSwitch;
  }


  public LinkTokenCreateRequest incomeVerification(LinkTokenCreateRequestIncomeVerification incomeVerification) {
    
    this.incomeVerification = incomeVerification;
    return this;
  }

   /**
   * Get incomeVerification
   * @return incomeVerification
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LinkTokenCreateRequestIncomeVerification getIncomeVerification() {
    return incomeVerification;
  }


  public void setIncomeVerification(LinkTokenCreateRequestIncomeVerification incomeVerification) {
    this.incomeVerification = incomeVerification;
  }


  public LinkTokenCreateRequest auth(LinkTokenCreateRequestAuth auth) {
    
    this.auth = auth;
    return this;
  }

   /**
   * Get auth
   * @return auth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LinkTokenCreateRequestAuth getAuth() {
    return auth;
  }


  public void setAuth(LinkTokenCreateRequestAuth auth) {
    this.auth = auth;
  }


  public LinkTokenCreateRequest transfer(LinkTokenCreateRequestTransfer transfer) {
    
    this.transfer = transfer;
    return this;
  }

   /**
   * Get transfer
   * @return transfer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LinkTokenCreateRequestTransfer getTransfer() {
    return transfer;
  }


  public void setTransfer(LinkTokenCreateRequestTransfer transfer) {
    this.transfer = transfer;
  }


  public LinkTokenCreateRequest update(LinkTokenCreateRequestUpdate update) {
    
    this.update = update;
    return this;
  }

   /**
   * Get update
   * @return update
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LinkTokenCreateRequestUpdate getUpdate() {
    return update;
  }


  public void setUpdate(LinkTokenCreateRequestUpdate update) {
    this.update = update;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkTokenCreateRequest linkTokenCreateRequest = (LinkTokenCreateRequest) o;
    return Objects.equals(this.clientId, linkTokenCreateRequest.clientId) &&
        Objects.equals(this.secret, linkTokenCreateRequest.secret) &&
        Objects.equals(this.clientName, linkTokenCreateRequest.clientName) &&
        Objects.equals(this.language, linkTokenCreateRequest.language) &&
        Objects.equals(this.countryCodes, linkTokenCreateRequest.countryCodes) &&
        Objects.equals(this.user, linkTokenCreateRequest.user) &&
        Objects.equals(this.products, linkTokenCreateRequest.products) &&
        Objects.equals(this.webhook, linkTokenCreateRequest.webhook) &&
        Objects.equals(this.accessToken, linkTokenCreateRequest.accessToken) &&
        Objects.equals(this.linkCustomizationName, linkTokenCreateRequest.linkCustomizationName) &&
        Objects.equals(this.redirectUri, linkTokenCreateRequest.redirectUri) &&
        Objects.equals(this.androidPackageName, linkTokenCreateRequest.androidPackageName) &&
        Objects.equals(this.accountFilters, linkTokenCreateRequest.accountFilters) &&
        Objects.equals(this.euConfig, linkTokenCreateRequest.euConfig) &&
        Objects.equals(this.institutionId, linkTokenCreateRequest.institutionId) &&
        Objects.equals(this.paymentInitiation, linkTokenCreateRequest.paymentInitiation) &&
        Objects.equals(this.depositSwitch, linkTokenCreateRequest.depositSwitch) &&
        Objects.equals(this.incomeVerification, linkTokenCreateRequest.incomeVerification) &&
        Objects.equals(this.auth, linkTokenCreateRequest.auth) &&
        Objects.equals(this.transfer, linkTokenCreateRequest.transfer) &&
        Objects.equals(this.update, linkTokenCreateRequest.update);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, secret, clientName, language, countryCodes, user, products, webhook, accessToken, linkCustomizationName, redirectUri, androidPackageName, accountFilters, euConfig, institutionId, paymentInitiation, depositSwitch, incomeVerification, auth, transfer, update);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkTokenCreateRequest {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    clientName: ").append(toIndentedString(clientName)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    countryCodes: ").append(toIndentedString(countryCodes)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
    sb.append("    webhook: ").append(toIndentedString(webhook)).append("\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    linkCustomizationName: ").append(toIndentedString(linkCustomizationName)).append("\n");
    sb.append("    redirectUri: ").append(toIndentedString(redirectUri)).append("\n");
    sb.append("    androidPackageName: ").append(toIndentedString(androidPackageName)).append("\n");
    sb.append("    accountFilters: ").append(toIndentedString(accountFilters)).append("\n");
    sb.append("    euConfig: ").append(toIndentedString(euConfig)).append("\n");
    sb.append("    institutionId: ").append(toIndentedString(institutionId)).append("\n");
    sb.append("    paymentInitiation: ").append(toIndentedString(paymentInitiation)).append("\n");
    sb.append("    depositSwitch: ").append(toIndentedString(depositSwitch)).append("\n");
    sb.append("    incomeVerification: ").append(toIndentedString(incomeVerification)).append("\n");
    sb.append("    auth: ").append(toIndentedString(auth)).append("\n");
    sb.append("    transfer: ").append(toIndentedString(transfer)).append("\n");
    sb.append("    update: ").append(toIndentedString(update)).append("\n");
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

