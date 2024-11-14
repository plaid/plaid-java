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
 * TransactionsRecurringUpdateInput defines a single operation to the &#x60;/transactions/recurring/streams/update&#x60; endpoint.
 */
@ApiModel(description = "TransactionsRecurringUpdateInput defines a single operation to the `/transactions/recurring/streams/update` endpoint.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-14T16:41:31.650700Z[Etc/UTC]")
public class TransactionsRecurringUpdateInput {
  public static final String SERIALIZED_NAME_STREAM_ID = "stream_id";
  @SerializedName(SERIALIZED_NAME_STREAM_ID)
  private String streamId;

  public static final String SERIALIZED_NAME_TRANSACTION_IDS = "transaction_ids";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_IDS)
  private List<String> transactionIds = new ArrayList<>();


  public TransactionsRecurringUpdateInput streamId(String streamId) {
    
    this.streamId = streamId;
    return this;
  }

   /**
   * ID of the stream that all the transactions will be added in to.
   * @return streamId
  **/
  @ApiModelProperty(required = true, value = "ID of the stream that all the transactions will be added in to.")

  public String getStreamId() {
    return streamId;
  }


  public void setStreamId(String streamId) {
    this.streamId = streamId;
  }


  public TransactionsRecurringUpdateInput transactionIds(List<String> transactionIds) {
    
    this.transactionIds = transactionIds;
    return this;
  }

  public TransactionsRecurringUpdateInput addTransactionIdsItem(String transactionIdsItem) {
    this.transactionIds.add(transactionIdsItem);
    return this;
  }

   /**
   * IDs of all the transactions that will be added into the stream. If any transaction currently exist in another stream, it will be removed from the other stream.
   * @return transactionIds
  **/
  @ApiModelProperty(required = true, value = "IDs of all the transactions that will be added into the stream. If any transaction currently exist in another stream, it will be removed from the other stream.")

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
    TransactionsRecurringUpdateInput transactionsRecurringUpdateInput = (TransactionsRecurringUpdateInput) o;
    return Objects.equals(this.streamId, transactionsRecurringUpdateInput.streamId) &&
        Objects.equals(this.transactionIds, transactionsRecurringUpdateInput.transactionIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(streamId, transactionIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionsRecurringUpdateInput {\n");
    sb.append("    streamId: ").append(toIndentedString(streamId)).append("\n");
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

