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
import com.plaid.client.model.Enhancements;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A client-provided transaction that Plaid has enhanced.
 */
@ApiModel(description = "A client-provided transaction that Plaid has enhanced.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-12T21:24:48.076128Z[Etc/UTC]")
public class ClientProvidedEnhancedTransaction {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Double amount;

  public static final String SERIALIZED_NAME_ISO_CURRENCY_CODE = "iso_currency_code";
  @SerializedName(SERIALIZED_NAME_ISO_CURRENCY_CODE)
  private String isoCurrencyCode;

  public static final String SERIALIZED_NAME_ENHANCEMENTS = "enhancements";
  @SerializedName(SERIALIZED_NAME_ENHANCEMENTS)
  private Enhancements enhancements;


  public ClientProvidedEnhancedTransaction id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique transaction identifier to tie transactions back to clients&#39; systems.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Unique transaction identifier to tie transactions back to clients' systems.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ClientProvidedEnhancedTransaction description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The raw description of the transaction.
   * @return description
  **/
  @ApiModelProperty(required = true, value = "The raw description of the transaction.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public ClientProvidedEnhancedTransaction amount(Double amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The value of the transaction, denominated in the account&#39;s currency, as stated in &#x60;iso_currency_code&#x60;. Positive values when money moves out of the account; negative values when money moves in. For example, debit card purchases are positive; credit card payments, direct deposits, and refunds are negative.
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "The value of the transaction, denominated in the account's currency, as stated in `iso_currency_code`. Positive values when money moves out of the account; negative values when money moves in. For example, debit card purchases are positive; credit card payments, direct deposits, and refunds are negative.")

  public Double getAmount() {
    return amount;
  }


  public void setAmount(Double amount) {
    this.amount = amount;
  }


  public ClientProvidedEnhancedTransaction isoCurrencyCode(String isoCurrencyCode) {
    
    this.isoCurrencyCode = isoCurrencyCode;
    return this;
  }

   /**
   * The ISO-4217 currency code of the transaction.
   * @return isoCurrencyCode
  **/
  @ApiModelProperty(required = true, value = "The ISO-4217 currency code of the transaction.")

  public String getIsoCurrencyCode() {
    return isoCurrencyCode;
  }


  public void setIsoCurrencyCode(String isoCurrencyCode) {
    this.isoCurrencyCode = isoCurrencyCode;
  }


  public ClientProvidedEnhancedTransaction enhancements(Enhancements enhancements) {
    
    this.enhancements = enhancements;
    return this;
  }

   /**
   * Get enhancements
   * @return enhancements
  **/
  @ApiModelProperty(required = true, value = "")

  public Enhancements getEnhancements() {
    return enhancements;
  }


  public void setEnhancements(Enhancements enhancements) {
    this.enhancements = enhancements;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientProvidedEnhancedTransaction clientProvidedEnhancedTransaction = (ClientProvidedEnhancedTransaction) o;
    return Objects.equals(this.id, clientProvidedEnhancedTransaction.id) &&
        Objects.equals(this.description, clientProvidedEnhancedTransaction.description) &&
        Objects.equals(this.amount, clientProvidedEnhancedTransaction.amount) &&
        Objects.equals(this.isoCurrencyCode, clientProvidedEnhancedTransaction.isoCurrencyCode) &&
        Objects.equals(this.enhancements, clientProvidedEnhancedTransaction.enhancements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, description, amount, isoCurrencyCode, enhancements);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientProvidedEnhancedTransaction {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    isoCurrencyCode: ").append(toIndentedString(isoCurrencyCode)).append("\n");
    sb.append("    enhancements: ").append(toIndentedString(enhancements)).append("\n");
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

