/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.508.0
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
import com.plaid.client.model.WalletTransaction;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * WalletTransactionListResponse defines the response schema for &#x60;/wallet/transaction/list&#x60;
 */
@ApiModel(description = "WalletTransactionListResponse defines the response schema for `/wallet/transaction/list`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-17T20:52:19.180696Z[Etc/UTC]")
public class WalletTransactionListResponse {
  public static final String SERIALIZED_NAME_TRANSACTIONS = "transactions";
  @SerializedName(SERIALIZED_NAME_TRANSACTIONS)
  private List<WalletTransaction> transactions = new ArrayList<>();

  public static final String SERIALIZED_NAME_NEXT_CURSOR = "next_cursor";
  @SerializedName(SERIALIZED_NAME_NEXT_CURSOR)
  private String nextCursor;

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;


  public WalletTransactionListResponse transactions(List<WalletTransaction> transactions) {
    
    this.transactions = transactions;
    return this;
  }

  public WalletTransactionListResponse addTransactionsItem(WalletTransaction transactionsItem) {
    this.transactions.add(transactionsItem);
    return this;
  }

   /**
   * An array of transactions of an e-wallet, associated with the given &#x60;wallet_id&#x60;
   * @return transactions
  **/
  @ApiModelProperty(required = true, value = "An array of transactions of an e-wallet, associated with the given `wallet_id`")

  public List<WalletTransaction> getTransactions() {
    return transactions;
  }


  public void setTransactions(List<WalletTransaction> transactions) {
    this.transactions = transactions;
  }


  public WalletTransactionListResponse nextCursor(String nextCursor) {
    
    this.nextCursor = nextCursor;
    return this;
  }

   /**
   * Cursor used for fetching transactions created before the latest transaction provided in this response
   * @return nextCursor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Cursor used for fetching transactions created before the latest transaction provided in this response")

  public String getNextCursor() {
    return nextCursor;
  }


  public void setNextCursor(String nextCursor) {
    this.nextCursor = nextCursor;
  }


  public WalletTransactionListResponse requestId(String requestId) {
    
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
    WalletTransactionListResponse walletTransactionListResponse = (WalletTransactionListResponse) o;
    return Objects.equals(this.transactions, walletTransactionListResponse.transactions) &&
        Objects.equals(this.nextCursor, walletTransactionListResponse.nextCursor) &&
        Objects.equals(this.requestId, walletTransactionListResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactions, nextCursor, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WalletTransactionListResponse {\n");
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
    sb.append("    nextCursor: ").append(toIndentedString(nextCursor)).append("\n");
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

