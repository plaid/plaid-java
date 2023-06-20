/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.379.0
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

/**
 * Defines the request schema for &#x60;/bank_transfer/event/sync&#x60;
 */
@ApiModel(description = "Defines the request schema for `/bank_transfer/event/sync`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-20T21:31:59.039638Z[Etc/UTC]")
public class BankTransferEventSyncRequest {
  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_AFTER_ID = "after_id";
  @SerializedName(SERIALIZED_NAME_AFTER_ID)
  private Integer afterId;

  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private Integer count = 25;


  public BankTransferEventSyncRequest clientId(String clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * Your Plaid API &#x60;client_id&#x60;. The &#x60;client_id&#x60; is required and may be provided either in the &#x60;PLAID-CLIENT-ID&#x60; header or as part of a request body.
   * @return clientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Your Plaid API `client_id`. The `client_id` is required and may be provided either in the `PLAID-CLIENT-ID` header or as part of a request body.")

  public String getClientId() {
    return clientId;
  }


  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public BankTransferEventSyncRequest secret(String secret) {
    
    this.secret = secret;
    return this;
  }

   /**
   * Your Plaid API &#x60;secret&#x60;. The &#x60;secret&#x60; is required and may be provided either in the &#x60;PLAID-SECRET&#x60; header or as part of a request body.
   * @return secret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Your Plaid API `secret`. The `secret` is required and may be provided either in the `PLAID-SECRET` header or as part of a request body.")

  public String getSecret() {
    return secret;
  }


  public void setSecret(String secret) {
    this.secret = secret;
  }


  public BankTransferEventSyncRequest afterId(Integer afterId) {
    
    this.afterId = afterId;
    return this;
  }

   /**
   * The latest (largest) &#x60;event_id&#x60; fetched via the sync endpoint, or 0 initially.
   * minimum: 0
   * @return afterId
  **/
  @ApiModelProperty(required = true, value = "The latest (largest) `event_id` fetched via the sync endpoint, or 0 initially.")

  public Integer getAfterId() {
    return afterId;
  }


  public void setAfterId(Integer afterId) {
    this.afterId = afterId;
  }


  public BankTransferEventSyncRequest count(Integer count) {
    
    this.count = count;
    return this;
  }

   /**
   * The maximum number of bank transfer events to return.
   * minimum: 1
   * maximum: 25
   * @return count
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The maximum number of bank transfer events to return.")

  public Integer getCount() {
    return count;
  }


  public void setCount(Integer count) {
    this.count = count;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankTransferEventSyncRequest bankTransferEventSyncRequest = (BankTransferEventSyncRequest) o;
    return Objects.equals(this.clientId, bankTransferEventSyncRequest.clientId) &&
        Objects.equals(this.secret, bankTransferEventSyncRequest.secret) &&
        Objects.equals(this.afterId, bankTransferEventSyncRequest.afterId) &&
        Objects.equals(this.count, bankTransferEventSyncRequest.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, secret, afterId, count);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankTransferEventSyncRequest {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    afterId: ").append(toIndentedString(afterId)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

