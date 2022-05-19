/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.115.2
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
import java.time.LocalDate;

/**
 * Contains details about a security
 */
@ApiModel(description = "Contains details about a security")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-19T05:25:50.453080Z[Etc/UTC]")
public class Security {
  public static final String SERIALIZED_NAME_SECURITY_ID = "security_id";
  @SerializedName(SERIALIZED_NAME_SECURITY_ID)
  private String securityId;

  public static final String SERIALIZED_NAME_ISIN = "isin";
  @SerializedName(SERIALIZED_NAME_ISIN)
  private String isin;

  public static final String SERIALIZED_NAME_CUSIP = "cusip";
  @SerializedName(SERIALIZED_NAME_CUSIP)
  private String cusip;

  public static final String SERIALIZED_NAME_SEDOL = "sedol";
  @SerializedName(SERIALIZED_NAME_SEDOL)
  private String sedol;

  public static final String SERIALIZED_NAME_INSTITUTION_SECURITY_ID = "institution_security_id";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_SECURITY_ID)
  private String institutionSecurityId;

  public static final String SERIALIZED_NAME_INSTITUTION_ID = "institution_id";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_ID)
  private String institutionId;

  public static final String SERIALIZED_NAME_PROXY_SECURITY_ID = "proxy_security_id";
  @SerializedName(SERIALIZED_NAME_PROXY_SECURITY_ID)
  private String proxySecurityId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TICKER_SYMBOL = "ticker_symbol";
  @SerializedName(SERIALIZED_NAME_TICKER_SYMBOL)
  private String tickerSymbol;

  public static final String SERIALIZED_NAME_IS_CASH_EQUIVALENT = "is_cash_equivalent";
  @SerializedName(SERIALIZED_NAME_IS_CASH_EQUIVALENT)
  private Boolean isCashEquivalent;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_CLOSE_PRICE = "close_price";
  @SerializedName(SERIALIZED_NAME_CLOSE_PRICE)
  private Double closePrice;

  public static final String SERIALIZED_NAME_CLOSE_PRICE_AS_OF = "close_price_as_of";
  @SerializedName(SERIALIZED_NAME_CLOSE_PRICE_AS_OF)
  private LocalDate closePriceAsOf;

  public static final String SERIALIZED_NAME_ISO_CURRENCY_CODE = "iso_currency_code";
  @SerializedName(SERIALIZED_NAME_ISO_CURRENCY_CODE)
  private String isoCurrencyCode;

  public static final String SERIALIZED_NAME_UNOFFICIAL_CURRENCY_CODE = "unofficial_currency_code";
  @SerializedName(SERIALIZED_NAME_UNOFFICIAL_CURRENCY_CODE)
  private String unofficialCurrencyCode;


  public Security securityId(String securityId) {
    
    this.securityId = securityId;
    return this;
  }

   /**
   * A unique, Plaid-specific identifier for the security, used to associate securities with holdings. Like all Plaid identifiers, the &#x60;security_id&#x60; is case sensitive.
   * @return securityId
  **/
  @ApiModelProperty(required = true, value = "A unique, Plaid-specific identifier for the security, used to associate securities with holdings. Like all Plaid identifiers, the `security_id` is case sensitive.")

  public String getSecurityId() {
    return securityId;
  }


  public void setSecurityId(String securityId) {
    this.securityId = securityId;
  }


  public Security isin(String isin) {
    
    this.isin = isin;
    return this;
  }

   /**
   * 12-character ISIN, a globally unique securities identifier.
   * @return isin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "12-character ISIN, a globally unique securities identifier.")

  public String getIsin() {
    return isin;
  }


  public void setIsin(String isin) {
    this.isin = isin;
  }


  public Security cusip(String cusip) {
    
    this.cusip = cusip;
    return this;
  }

   /**
   * 9-character CUSIP, an identifier assigned to North American securities.
   * @return cusip
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "9-character CUSIP, an identifier assigned to North American securities.")

  public String getCusip() {
    return cusip;
  }


  public void setCusip(String cusip) {
    this.cusip = cusip;
  }


  public Security sedol(String sedol) {
    
    this.sedol = sedol;
    return this;
  }

   /**
   * 7-character SEDOL, an identifier assigned to securities in the UK.
   * @return sedol
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "7-character SEDOL, an identifier assigned to securities in the UK.")

  public String getSedol() {
    return sedol;
  }


  public void setSedol(String sedol) {
    this.sedol = sedol;
  }


  public Security institutionSecurityId(String institutionSecurityId) {
    
    this.institutionSecurityId = institutionSecurityId;
    return this;
  }

   /**
   * An identifier given to the security by the institution
   * @return institutionSecurityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "An identifier given to the security by the institution")

  public String getInstitutionSecurityId() {
    return institutionSecurityId;
  }


  public void setInstitutionSecurityId(String institutionSecurityId) {
    this.institutionSecurityId = institutionSecurityId;
  }


  public Security institutionId(String institutionId) {
    
    this.institutionId = institutionId;
    return this;
  }

   /**
   * If &#x60;institution_security_id&#x60; is present, this field indicates the Plaid &#x60;institution_id&#x60; of the institution to whom the identifier belongs.
   * @return institutionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "If `institution_security_id` is present, this field indicates the Plaid `institution_id` of the institution to whom the identifier belongs.")

  public String getInstitutionId() {
    return institutionId;
  }


  public void setInstitutionId(String institutionId) {
    this.institutionId = institutionId;
  }


  public Security proxySecurityId(String proxySecurityId) {
    
    this.proxySecurityId = proxySecurityId;
    return this;
  }

   /**
   * In certain cases, Plaid will provide the ID of another security whose performance resembles this security, typically when the original security has low volume, or when a private security can be modeled with a publicly traded security.
   * @return proxySecurityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "In certain cases, Plaid will provide the ID of another security whose performance resembles this security, typically when the original security has low volume, or when a private security can be modeled with a publicly traded security.")

  public String getProxySecurityId() {
    return proxySecurityId;
  }


  public void setProxySecurityId(String proxySecurityId) {
    this.proxySecurityId = proxySecurityId;
  }


  public Security name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * A descriptive name for the security, suitable for display.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "A descriptive name for the security, suitable for display.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Security tickerSymbol(String tickerSymbol) {
    
    this.tickerSymbol = tickerSymbol;
    return this;
  }

   /**
   * The security’s trading symbol for publicly traded securities, and otherwise a short identifier if available.
   * @return tickerSymbol
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The security’s trading symbol for publicly traded securities, and otherwise a short identifier if available.")

  public String getTickerSymbol() {
    return tickerSymbol;
  }


  public void setTickerSymbol(String tickerSymbol) {
    this.tickerSymbol = tickerSymbol;
  }


  public Security isCashEquivalent(Boolean isCashEquivalent) {
    
    this.isCashEquivalent = isCashEquivalent;
    return this;
  }

   /**
   * Indicates that a security is a highly liquid asset and can be treated like cash.
   * @return isCashEquivalent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Indicates that a security is a highly liquid asset and can be treated like cash.")

  public Boolean getIsCashEquivalent() {
    return isCashEquivalent;
  }


  public void setIsCashEquivalent(Boolean isCashEquivalent) {
    this.isCashEquivalent = isCashEquivalent;
  }


  public Security type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The security type of the holding. Valid security types are:  &#x60;cash&#x60;: Cash, currency, and money market funds  &#x60;derivative&#x60;: Options, warrants, and other derivative instruments  &#x60;equity&#x60;: Domestic and foreign equities  &#x60;etf&#x60;: Multi-asset exchange-traded investment funds  &#x60;fixed income&#x60;: Bonds and certificates of deposit (CDs)  &#x60;loan&#x60;: Loans and loan receivables.  &#x60;mutual fund&#x60;: Open- and closed-end vehicles pooling funds of multiple investors.  &#x60;other&#x60;: Unknown or other investment types
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The security type of the holding. Valid security types are:  `cash`: Cash, currency, and money market funds  `derivative`: Options, warrants, and other derivative instruments  `equity`: Domestic and foreign equities  `etf`: Multi-asset exchange-traded investment funds  `fixed income`: Bonds and certificates of deposit (CDs)  `loan`: Loans and loan receivables.  `mutual fund`: Open- and closed-end vehicles pooling funds of multiple investors.  `other`: Unknown or other investment types")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public Security closePrice(Double closePrice) {
    
    this.closePrice = closePrice;
    return this;
  }

   /**
   * Price of the security at the close of the previous trading session. &#x60;null&#x60; for non-public securities. If the security is a foreign currency or a cryptocurrency this field will be updated daily and will be priced in USD.
   * @return closePrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Price of the security at the close of the previous trading session. `null` for non-public securities. If the security is a foreign currency or a cryptocurrency this field will be updated daily and will be priced in USD.")

  public Double getClosePrice() {
    return closePrice;
  }


  public void setClosePrice(Double closePrice) {
    this.closePrice = closePrice;
  }


  public Security closePriceAsOf(LocalDate closePriceAsOf) {
    
    this.closePriceAsOf = closePriceAsOf;
    return this;
  }

   /**
   * Date for which &#x60;close_price&#x60; is accurate. Always &#x60;null&#x60; if &#x60;close_price&#x60; is &#x60;null&#x60;.
   * @return closePriceAsOf
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Date for which `close_price` is accurate. Always `null` if `close_price` is `null`.")

  public LocalDate getClosePriceAsOf() {
    return closePriceAsOf;
  }


  public void setClosePriceAsOf(LocalDate closePriceAsOf) {
    this.closePriceAsOf = closePriceAsOf;
  }


  public Security isoCurrencyCode(String isoCurrencyCode) {
    
    this.isoCurrencyCode = isoCurrencyCode;
    return this;
  }

   /**
   * The ISO-4217 currency code of the price given. Always &#x60;null&#x60; if &#x60;unofficial_currency_code&#x60; is non-&#x60;null&#x60;.
   * @return isoCurrencyCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The ISO-4217 currency code of the price given. Always `null` if `unofficial_currency_code` is non-`null`.")

  public String getIsoCurrencyCode() {
    return isoCurrencyCode;
  }


  public void setIsoCurrencyCode(String isoCurrencyCode) {
    this.isoCurrencyCode = isoCurrencyCode;
  }


  public Security unofficialCurrencyCode(String unofficialCurrencyCode) {
    
    this.unofficialCurrencyCode = unofficialCurrencyCode;
    return this;
  }

   /**
   * The unofficial currency code associated with the security. Always &#x60;null&#x60; if &#x60;iso_currency_code&#x60; is non-&#x60;null&#x60;. Unofficial currency codes are used for currencies that do not have official ISO currency codes, such as cryptocurrencies and the currencies of certain countries.  See the [currency code schema](https://plaid.com/docs/api/accounts#currency-code-schema) for a full listing of supported &#x60;iso_currency_code&#x60;s.
   * @return unofficialCurrencyCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The unofficial currency code associated with the security. Always `null` if `iso_currency_code` is non-`null`. Unofficial currency codes are used for currencies that do not have official ISO currency codes, such as cryptocurrencies and the currencies of certain countries.  See the [currency code schema](https://plaid.com/docs/api/accounts#currency-code-schema) for a full listing of supported `iso_currency_code`s.")

  public String getUnofficialCurrencyCode() {
    return unofficialCurrencyCode;
  }


  public void setUnofficialCurrencyCode(String unofficialCurrencyCode) {
    this.unofficialCurrencyCode = unofficialCurrencyCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Security security = (Security) o;
    return Objects.equals(this.securityId, security.securityId) &&
        Objects.equals(this.isin, security.isin) &&
        Objects.equals(this.cusip, security.cusip) &&
        Objects.equals(this.sedol, security.sedol) &&
        Objects.equals(this.institutionSecurityId, security.institutionSecurityId) &&
        Objects.equals(this.institutionId, security.institutionId) &&
        Objects.equals(this.proxySecurityId, security.proxySecurityId) &&
        Objects.equals(this.name, security.name) &&
        Objects.equals(this.tickerSymbol, security.tickerSymbol) &&
        Objects.equals(this.isCashEquivalent, security.isCashEquivalent) &&
        Objects.equals(this.type, security.type) &&
        Objects.equals(this.closePrice, security.closePrice) &&
        Objects.equals(this.closePriceAsOf, security.closePriceAsOf) &&
        Objects.equals(this.isoCurrencyCode, security.isoCurrencyCode) &&
        Objects.equals(this.unofficialCurrencyCode, security.unofficialCurrencyCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(securityId, isin, cusip, sedol, institutionSecurityId, institutionId, proxySecurityId, name, tickerSymbol, isCashEquivalent, type, closePrice, closePriceAsOf, isoCurrencyCode, unofficialCurrencyCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Security {\n");
    sb.append("    securityId: ").append(toIndentedString(securityId)).append("\n");
    sb.append("    isin: ").append(toIndentedString(isin)).append("\n");
    sb.append("    cusip: ").append(toIndentedString(cusip)).append("\n");
    sb.append("    sedol: ").append(toIndentedString(sedol)).append("\n");
    sb.append("    institutionSecurityId: ").append(toIndentedString(institutionSecurityId)).append("\n");
    sb.append("    institutionId: ").append(toIndentedString(institutionId)).append("\n");
    sb.append("    proxySecurityId: ").append(toIndentedString(proxySecurityId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tickerSymbol: ").append(toIndentedString(tickerSymbol)).append("\n");
    sb.append("    isCashEquivalent: ").append(toIndentedString(isCashEquivalent)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    closePrice: ").append(toIndentedString(closePrice)).append("\n");
    sb.append("    closePriceAsOf: ").append(toIndentedString(closePriceAsOf)).append("\n");
    sb.append("    isoCurrencyCode: ").append(toIndentedString(isoCurrencyCode)).append("\n");
    sb.append("    unofficialCurrencyCode: ").append(toIndentedString(unofficialCurrencyCode)).append("\n");
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

