/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.586.4
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
import java.util.ArrayList;
import java.util.List;

/**
 * TransactionsRecurringCreateInput defines a single input to the &#x60;/transactions/recurring/streams/create&#x60; endpoint.
 */
@ApiModel(description = "TransactionsRecurringCreateInput defines a single input to the `/transactions/recurring/streams/create` endpoint.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-14T16:41:31.650700Z[Etc/UTC]")
public class TransactionsRecurringCreateInput {
  public static final String SERIALIZED_NAME_TRANSACTION_IDS = "transaction_ids";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_IDS)
  private List<String> transactionIds = null;


  public TransactionsRecurringCreateInput transactionIds(List<String> transactionIds) {
    
    this.transactionIds = transactionIds;
    return this;
  }

  public TransactionsRecurringCreateInput addTransactionIdsItem(String transactionIdsItem) {
    if (this.transactionIds == null) {
      this.transactionIds = new ArrayList<>();
    }
    this.transactionIds.add(transactionIdsItem);
    return this;
  }

   /**
   * IDs of all the transactions that will be merged into one stream. If any transaction currently exists in another stream, it will be removed from the other stream.
   * @return transactionIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "IDs of all the transactions that will be merged into one stream. If any transaction currently exists in another stream, it will be removed from the other stream.")

  public List<String> getTransactionIds() {
    return transactionIds;
  }


  public void setTransactionIds(List<String> transactionIds) {
    this.transactionIds = transactionIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionsRecurringCreateInput transactionsRecurringCreateInput = (TransactionsRecurringCreateInput) o;
    return Objects.equals(this.transactionIds, transactionsRecurringCreateInput.transactionIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionsRecurringCreateInput {\n");
    sb.append("    transactionIds: ").append(toIndentedString(transactionIds)).append("\n");
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

