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

/**
 * Defines the request schema for &#x60;/transfer/ledger/get&#x60;
 */
@ApiModel(description = "Defines the request schema for `/transfer/ledger/get`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-14T16:41:31.650700Z[Etc/UTC]")
public class TransferLedgerGetRequest {
  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_LEDGER_ID = "ledger_id";
  @SerializedName(SERIALIZED_NAME_LEDGER_ID)
  private String ledgerId;

  public static final String SERIALIZED_NAME_ORIGINATOR_CLIENT_ID = "originator_client_id";
  @SerializedName(SERIALIZED_NAME_ORIGINATOR_CLIENT_ID)
  private String originatorClientId;


  public TransferLedgerGetRequest clientId(String clientId) {
    
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


  public TransferLedgerGetRequest secret(String secret) {
    
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


  public TransferLedgerGetRequest ledgerId(String ledgerId) {
    
    this.ledgerId = ledgerId;
    return this;
  }

   /**
   * Specify which ledger balance to get. Customers can find a list of &#x60;ledger_id&#x60;s in the Accounts page of your Plaid Dashboard. If this field is left blank, this will default to id of the default ledger balance.
   * @return ledgerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specify which ledger balance to get. Customers can find a list of `ledger_id`s in the Accounts page of your Plaid Dashboard. If this field is left blank, this will default to id of the default ledger balance.")

  public String getLedgerId() {
    return ledgerId;
  }


  public void setLedgerId(String ledgerId) {
    this.ledgerId = ledgerId;
  }


  public TransferLedgerGetRequest originatorClientId(String originatorClientId) {
    
    this.originatorClientId = originatorClientId;
    return this;
  }

   /**
   * Client ID of the end customer.
   * @return originatorClientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Client ID of the end customer.")

  public String getOriginatorClientId() {
    return originatorClientId;
  }


  public void setOriginatorClientId(String originatorClientId) {
    this.originatorClientId = originatorClientId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferLedgerGetRequest transferLedgerGetRequest = (TransferLedgerGetRequest) o;
    return Objects.equals(this.clientId, transferLedgerGetRequest.clientId) &&
        Objects.equals(this.secret, transferLedgerGetRequest.secret) &&
        Objects.equals(this.ledgerId, transferLedgerGetRequest.ledgerId) &&
        Objects.equals(this.originatorClientId, transferLedgerGetRequest.originatorClientId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, secret, ledgerId, originatorClientId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferLedgerGetRequest {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    ledgerId: ").append(toIndentedString(ledgerId)).append("\n");
    sb.append("    originatorClientId: ").append(toIndentedString(originatorClientId)).append("\n");
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

