/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.5.3
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
import java.math.BigDecimal;

/**
 * Data to populate as test transaction data. If not specified, random transactions will be generated instead.
 */
@ApiModel(description = "Data to populate as test transaction data. If not specified, random transactions will be generated instead.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-17T22:11:20.181Z[GMT]")
public class TransactionOverride {
  public static final String SERIALIZED_NAME_TRANSACTION_DATE = "transaction_date";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_DATE)
  private String transactionDate;

  public static final String SERIALIZED_NAME_POSTED_DATE = "posted_date";
  @SerializedName(SERIALIZED_NAME_POSTED_DATE)
  private String postedDate;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Double amount;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;


  public TransactionOverride transactionDate(String transactionDate) {
    
    this.transactionDate = transactionDate;
    return this;
  }

   /**
   * The date of the transaction, in ISO8601 (YYYY-MM-DD) format. Transaction dates in the past or present will result in posted transactions; transaction dates in the future will result in pending transactions. Transactions in Sandbox will move from pending to posted once their transaction date has been reached.
   * @return transactionDate
  **/
  @ApiModelProperty(required = true, value = "The date of the transaction, in ISO8601 (YYYY-MM-DD) format. Transaction dates in the past or present will result in posted transactions; transaction dates in the future will result in pending transactions. Transactions in Sandbox will move from pending to posted once their transaction date has been reached.")

  public String getTransactionDate() {
    return transactionDate;
  }


  public void setTransactionDate(String transactionDate) {
    this.transactionDate = transactionDate;
  }


  public TransactionOverride postedDate(String postedDate) {
    
    this.postedDate = postedDate;
    return this;
  }

   /**
   * The date the transaction posted, in ISO8601 (YYYY-MM-DD) format
   * @return postedDate
  **/
  @ApiModelProperty(required = true, value = "The date the transaction posted, in ISO8601 (YYYY-MM-DD) format")

  public String getPostedDate() {
    return postedDate;
  }


  public void setPostedDate(String postedDate) {
    this.postedDate = postedDate;
  }


  public TransactionOverride amount(Double amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The transaction amount. Can be negative.
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "The transaction amount. Can be negative.")

  public Double getAmount() {
    return amount;
  }


  public void setAmount(Double amount) {
    this.amount = amount;
  }


  public TransactionOverride description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The transaction description.
   * @return description
  **/
  @ApiModelProperty(required = true, value = "The transaction description.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public TransactionOverride currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * The ISO-4217 format currency code for the transaction.
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ISO-4217 format currency code for the transaction.")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    this.currency = currency;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionOverride transactionOverride = (TransactionOverride) o;
    return Objects.equals(this.transactionDate, transactionOverride.transactionDate) &&
        Objects.equals(this.postedDate, transactionOverride.postedDate) &&
        Objects.equals(this.amount, transactionOverride.amount) &&
        Objects.equals(this.description, transactionOverride.description) &&
        Objects.equals(this.currency, transactionOverride.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionDate, postedDate, amount, description, currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionOverride {\n");
    sb.append("    transactionDate: ").append(toIndentedString(transactionDate)).append("\n");
    sb.append("    postedDate: ").append(toIndentedString(postedDate)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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

