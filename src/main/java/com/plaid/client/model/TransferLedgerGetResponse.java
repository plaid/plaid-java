/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.620.0
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
import com.plaid.client.model.TransferLedgerBalance;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Defines the response schema for &#x60;/transfer/ledger/get&#x60;
 */
@ApiModel(description = "Defines the response schema for `/transfer/ledger/get`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-21T16:44:11.345889Z[Etc/UTC]")
public class TransferLedgerGetResponse {
  public static final String SERIALIZED_NAME_LEDGER_ID = "ledger_id";
  @SerializedName(SERIALIZED_NAME_LEDGER_ID)
  private String ledgerId;

  public static final String SERIALIZED_NAME_BALANCE = "balance";
  @SerializedName(SERIALIZED_NAME_BALANCE)
  private TransferLedgerBalance balance;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_IS_DEFAULT = "is_default";
  @SerializedName(SERIALIZED_NAME_IS_DEFAULT)
  private Boolean isDefault;

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;


  public TransferLedgerGetResponse ledgerId(String ledgerId) {
    
    this.ledgerId = ledgerId;
    return this;
  }

   /**
   * The unique identifier of the Ledger that was returned.
   * @return ledgerId
  **/
  @ApiModelProperty(required = true, value = "The unique identifier of the Ledger that was returned.")

  public String getLedgerId() {
    return ledgerId;
  }


  public void setLedgerId(String ledgerId) {
    this.ledgerId = ledgerId;
  }


  public TransferLedgerGetResponse balance(TransferLedgerBalance balance) {
    
    this.balance = balance;
    return this;
  }

   /**
   * Get balance
   * @return balance
  **/
  @ApiModelProperty(required = true, value = "")

  public TransferLedgerBalance getBalance() {
    return balance;
  }


  public void setBalance(TransferLedgerBalance balance) {
    this.balance = balance;
  }


  public TransferLedgerGetResponse name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the Ledger
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the Ledger")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public TransferLedgerGetResponse isDefault(Boolean isDefault) {
    
    this.isDefault = isDefault;
    return this;
  }

   /**
   * Whether this Ledger is the client&#39;s default ledger.
   * @return isDefault
  **/
  @ApiModelProperty(required = true, value = "Whether this Ledger is the client's default ledger.")

  public Boolean getIsDefault() {
    return isDefault;
  }


  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }


  public TransferLedgerGetResponse requestId(String requestId) {
    
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
    TransferLedgerGetResponse transferLedgerGetResponse = (TransferLedgerGetResponse) o;
    return Objects.equals(this.ledgerId, transferLedgerGetResponse.ledgerId) &&
        Objects.equals(this.balance, transferLedgerGetResponse.balance) &&
        Objects.equals(this.name, transferLedgerGetResponse.name) &&
        Objects.equals(this.isDefault, transferLedgerGetResponse.isDefault) &&
        Objects.equals(this.requestId, transferLedgerGetResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ledgerId, balance, name, isDefault, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferLedgerGetResponse {\n");
    sb.append("    ledgerId: ").append(toIndentedString(ledgerId)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
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

