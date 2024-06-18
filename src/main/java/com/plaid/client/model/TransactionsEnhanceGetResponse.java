/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.525.1
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
import com.plaid.client.model.ClientProvidedEnhancedTransaction;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * TransactionsEnhanceGetResponse defines the response schema for &#x60;/beta/transactions/v1/enhance&#x60;.
 */
@ApiModel(description = "TransactionsEnhanceGetResponse defines the response schema for `/beta/transactions/v1/enhance`.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-18T18:48:06.627309Z[Etc/UTC]")
public class TransactionsEnhanceGetResponse {
  public static final String SERIALIZED_NAME_ENHANCED_TRANSACTIONS = "enhanced_transactions";
  @SerializedName(SERIALIZED_NAME_ENHANCED_TRANSACTIONS)
  private List<ClientProvidedEnhancedTransaction> enhancedTransactions = new ArrayList<>();


  public TransactionsEnhanceGetResponse enhancedTransactions(List<ClientProvidedEnhancedTransaction> enhancedTransactions) {
    
    this.enhancedTransactions = enhancedTransactions;
    return this;
  }

  public TransactionsEnhanceGetResponse addEnhancedTransactionsItem(ClientProvidedEnhancedTransaction enhancedTransactionsItem) {
    this.enhancedTransactions.add(enhancedTransactionsItem);
    return this;
  }

   /**
   * An array of enhanced transactions.
   * @return enhancedTransactions
  **/
  @ApiModelProperty(required = true, value = "An array of enhanced transactions.")

  public List<ClientProvidedEnhancedTransaction> getEnhancedTransactions() {
    return enhancedTransactions;
  }


  public void setEnhancedTransactions(List<ClientProvidedEnhancedTransaction> enhancedTransactions) {
    this.enhancedTransactions = enhancedTransactions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionsEnhanceGetResponse transactionsEnhanceGetResponse = (TransactionsEnhanceGetResponse) o;
    return Objects.equals(this.enhancedTransactions, transactionsEnhanceGetResponse.enhancedTransactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enhancedTransactions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionsEnhanceGetResponse {\n");
    sb.append("    enhancedTransactions: ").append(toIndentedString(enhancedTransactions)).append("\n");
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

