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
import com.plaid.client.model.TransactionStream;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * TransactionsRecurringUpdateResponse defines the response schema for the &#x60;/transactions/recurring/streams/update&#x60; endpoint.
 */
@ApiModel(description = "TransactionsRecurringUpdateResponse defines the response schema for the `/transactions/recurring/streams/update` endpoint.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-04T15:13:56.933796Z[Etc/UTC]")
public class TransactionsRecurringUpdateResponse {
  public static final String SERIALIZED_NAME_MODIFIED_STREAMS = "modified_streams";
  @SerializedName(SERIALIZED_NAME_MODIFIED_STREAMS)
  private List<TransactionStream> modifiedStreams = new ArrayList<>();

  public static final String SERIALIZED_NAME_REMOVED_STREAM_IDS = "removed_stream_ids";
  @SerializedName(SERIALIZED_NAME_REMOVED_STREAM_IDS)
  private List<String> removedStreamIds = null;


  public TransactionsRecurringUpdateResponse modifiedStreams(List<TransactionStream> modifiedStreams) {
    
    this.modifiedStreams = modifiedStreams;
    return this;
  }

  public TransactionsRecurringUpdateResponse addModifiedStreamsItem(TransactionStream modifiedStreamsItem) {
    this.modifiedStreams.add(modifiedStreamsItem);
    return this;
  }

   /**
   * Directly modified stream, along with other streams with transactions removed from them as a result of the operation (in no particular order).
   * @return modifiedStreams
  **/
  @ApiModelProperty(required = true, value = "Directly modified stream, along with other streams with transactions removed from them as a result of the operation (in no particular order).")

  public List<TransactionStream> getModifiedStreams() {
    return modifiedStreams;
  }


  public void setModifiedStreams(List<TransactionStream> modifiedStreams) {
    this.modifiedStreams = modifiedStreams;
  }


  public TransactionsRecurringUpdateResponse removedStreamIds(List<String> removedStreamIds) {
    
    this.removedStreamIds = removedStreamIds;
    return this;
  }

  public TransactionsRecurringUpdateResponse addRemovedStreamIdsItem(String removedStreamIdsItem) {
    if (this.removedStreamIds == null) {
      this.removedStreamIds = new ArrayList<>();
    }
    this.removedStreamIds.add(removedStreamIdsItem);
    return this;
  }

   /**
   * The ids of streams that are no longer qualified as recurring transaction streams (in no particular order).
   * @return removedStreamIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ids of streams that are no longer qualified as recurring transaction streams (in no particular order).")

  public List<String> getRemovedStreamIds() {
    return removedStreamIds;
  }


  public void setRemovedStreamIds(List<String> removedStreamIds) {
    this.removedStreamIds = removedStreamIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionsRecurringUpdateResponse transactionsRecurringUpdateResponse = (TransactionsRecurringUpdateResponse) o;
    return Objects.equals(this.modifiedStreams, transactionsRecurringUpdateResponse.modifiedStreams) &&
        Objects.equals(this.removedStreamIds, transactionsRecurringUpdateResponse.removedStreamIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modifiedStreams, removedStreamIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionsRecurringUpdateResponse {\n");
    sb.append("    modifiedStreams: ").append(toIndentedString(modifiedStreams)).append("\n");
    sb.append("    removedStreamIds: ").append(toIndentedString(removedStreamIds)).append("\n");
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

