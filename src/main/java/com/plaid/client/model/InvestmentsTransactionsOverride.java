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
import com.plaid.client.model.SecurityOverride;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;

/**
 * Specify the list of investments transactions on the account.
 */
@ApiModel(description = "Specify the list of investments transactions on the account.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-12T21:24:48.076128Z[Etc/UTC]")
public class InvestmentsTransactionsOverride {
  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private LocalDate date;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Double quantity;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private Double price;

  public static final String SERIALIZED_NAME_FEES = "fees";
  @SerializedName(SERIALIZED_NAME_FEES)
  private Double fees;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_SECURITY = "security";
  @SerializedName(SERIALIZED_NAME_SECURITY)
  private SecurityOverride security;


  public InvestmentsTransactionsOverride date(LocalDate date) {
    
    this.date = date;
    return this;
  }

   /**
   * Posting date for the transaction. Must be formatted as an [ISO 8601](https://wikipedia.org/wiki/ISO_8601) date.
   * @return date
  **/
  @ApiModelProperty(required = true, value = "Posting date for the transaction. Must be formatted as an [ISO 8601](https://wikipedia.org/wiki/ISO_8601) date.")

  public LocalDate getDate() {
    return date;
  }


  public void setDate(LocalDate date) {
    this.date = date;
  }


  public InvestmentsTransactionsOverride name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The institution&#39;s description of the transaction.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The institution's description of the transaction.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public InvestmentsTransactionsOverride quantity(Double quantity) {
    
    this.quantity = quantity;
    return this;
  }

   /**
   * The number of units of the security involved in this transaction. Must be positive if the type is a buy and negative if the type is a sell.
   * @return quantity
  **/
  @ApiModelProperty(required = true, value = "The number of units of the security involved in this transaction. Must be positive if the type is a buy and negative if the type is a sell.")

  public Double getQuantity() {
    return quantity;
  }


  public void setQuantity(Double quantity) {
    this.quantity = quantity;
  }


  public InvestmentsTransactionsOverride price(Double price) {
    
    this.price = price;
    return this;
  }

   /**
   * The price of the security at which this transaction occurred.
   * @return price
  **/
  @ApiModelProperty(required = true, value = "The price of the security at which this transaction occurred.")

  public Double getPrice() {
    return price;
  }


  public void setPrice(Double price) {
    this.price = price;
  }


  public InvestmentsTransactionsOverride fees(Double fees) {
    
    this.fees = fees;
    return this;
  }

   /**
   * The combined value of all fees applied to this transaction.
   * @return fees
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The combined value of all fees applied to this transaction.")

  public Double getFees() {
    return fees;
  }


  public void setFees(Double fees) {
    this.fees = fees;
  }


  public InvestmentsTransactionsOverride type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of the investment transaction. Possible values are: &#x60;buy&#x60;: Buying an investment &#x60;sell&#x60;: Selling an investment &#x60;cash&#x60;: Activity that modifies a cash position &#x60;fee&#x60;: A fee on the account &#x60;transfer&#x60;: Activity that modifies a position, but not through buy/sell activity e.g. options exercise, portfolio transfer
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The type of the investment transaction. Possible values are: `buy`: Buying an investment `sell`: Selling an investment `cash`: Activity that modifies a cash position `fee`: A fee on the account `transfer`: Activity that modifies a position, but not through buy/sell activity e.g. options exercise, portfolio transfer")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public InvestmentsTransactionsOverride currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * Either a valid &#x60;iso_currency_code&#x60; or &#x60;unofficial_currency_code&#x60;
   * @return currency
  **/
  @ApiModelProperty(required = true, value = "Either a valid `iso_currency_code` or `unofficial_currency_code`")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public InvestmentsTransactionsOverride security(SecurityOverride security) {
    
    this.security = security;
    return this;
  }

   /**
   * Get security
   * @return security
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SecurityOverride getSecurity() {
    return security;
  }


  public void setSecurity(SecurityOverride security) {
    this.security = security;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvestmentsTransactionsOverride investmentsTransactionsOverride = (InvestmentsTransactionsOverride) o;
    return Objects.equals(this.date, investmentsTransactionsOverride.date) &&
        Objects.equals(this.name, investmentsTransactionsOverride.name) &&
        Objects.equals(this.quantity, investmentsTransactionsOverride.quantity) &&
        Objects.equals(this.price, investmentsTransactionsOverride.price) &&
        Objects.equals(this.fees, investmentsTransactionsOverride.fees) &&
        Objects.equals(this.type, investmentsTransactionsOverride.type) &&
        Objects.equals(this.currency, investmentsTransactionsOverride.currency) &&
        Objects.equals(this.security, investmentsTransactionsOverride.security);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, name, quantity, price, fees, type, currency, security);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvestmentsTransactionsOverride {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    fees: ").append(toIndentedString(fees)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    security: ").append(toIndentedString(security)).append("\n");
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

