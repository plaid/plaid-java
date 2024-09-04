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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;

/**
 * Details about the option security.  For the Sandbox environment, this data is currently only available if the item is using a custom configuration object, and the &#x60;ticker&#x60; field of the custom security follows the [OCC Option Symbol](https://en.wikipedia.org/wiki/Option_symbol#The_OCC_Option_Symbol) standard with no spaces.
 */
@ApiModel(description = "Details about the option security.  For the Sandbox environment, this data is currently only available if the item is using a custom configuration object, and the `ticker` field of the custom security follows the [OCC Option Symbol](https://en.wikipedia.org/wiki/Option_symbol#The_OCC_Option_Symbol) standard with no spaces.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-04T15:13:56.933796Z[Etc/UTC]")
public class OptionContract {
  public static final String SERIALIZED_NAME_CONTRACT_TYPE = "contract_type";
  @SerializedName(SERIALIZED_NAME_CONTRACT_TYPE)
  private String contractType;

  public static final String SERIALIZED_NAME_EXPIRATION_DATE = "expiration_date";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_DATE)
  private LocalDate expirationDate;

  public static final String SERIALIZED_NAME_STRIKE_PRICE = "strike_price";
  @SerializedName(SERIALIZED_NAME_STRIKE_PRICE)
  private Double strikePrice;

  public static final String SERIALIZED_NAME_UNDERLYING_SECURITY_TICKER = "underlying_security_ticker";
  @SerializedName(SERIALIZED_NAME_UNDERLYING_SECURITY_TICKER)
  private String underlyingSecurityTicker;


  public OptionContract contractType(String contractType) {
    
    this.contractType = contractType;
    return this;
  }

   /**
   * The type of this option contract. It is one of:  &#x60;put&#x60;: for Put option contracts  &#x60;call&#x60;: for Call option contracts
   * @return contractType
  **/
  @ApiModelProperty(required = true, value = "The type of this option contract. It is one of:  `put`: for Put option contracts  `call`: for Call option contracts")

  public String getContractType() {
    return contractType;
  }


  public void setContractType(String contractType) {
    this.contractType = contractType;
  }


  public OptionContract expirationDate(LocalDate expirationDate) {
    
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * The expiration date for this option contract, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format.
   * @return expirationDate
  **/
  @ApiModelProperty(required = true, value = "The expiration date for this option contract, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format.")

  public LocalDate getExpirationDate() {
    return expirationDate;
  }


  public void setExpirationDate(LocalDate expirationDate) {
    this.expirationDate = expirationDate;
  }


  public OptionContract strikePrice(Double strikePrice) {
    
    this.strikePrice = strikePrice;
    return this;
  }

   /**
   * The strike price for this option contract, per share of security.
   * @return strikePrice
  **/
  @ApiModelProperty(required = true, value = "The strike price for this option contract, per share of security.")

  public Double getStrikePrice() {
    return strikePrice;
  }


  public void setStrikePrice(Double strikePrice) {
    this.strikePrice = strikePrice;
  }


  public OptionContract underlyingSecurityTicker(String underlyingSecurityTicker) {
    
    this.underlyingSecurityTicker = underlyingSecurityTicker;
    return this;
  }

   /**
   * The ticker of the underlying security for this option contract.
   * @return underlyingSecurityTicker
  **/
  @ApiModelProperty(required = true, value = "The ticker of the underlying security for this option contract.")

  public String getUnderlyingSecurityTicker() {
    return underlyingSecurityTicker;
  }


  public void setUnderlyingSecurityTicker(String underlyingSecurityTicker) {
    this.underlyingSecurityTicker = underlyingSecurityTicker;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptionContract optionContract = (OptionContract) o;
    return Objects.equals(this.contractType, optionContract.contractType) &&
        Objects.equals(this.expirationDate, optionContract.expirationDate) &&
        Objects.equals(this.strikePrice, optionContract.strikePrice) &&
        Objects.equals(this.underlyingSecurityTicker, optionContract.underlyingSecurityTicker);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contractType, expirationDate, strikePrice, underlyingSecurityTicker);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptionContract {\n");
    sb.append("    contractType: ").append(toIndentedString(contractType)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    strikePrice: ").append(toIndentedString(strikePrice)).append("\n");
    sb.append("    underlyingSecurityTicker: ").append(toIndentedString(underlyingSecurityTicker)).append("\n");
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

