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
import com.plaid.client.model.PaymentInitiationRecipientGetResponseAllOf;
import com.plaid.client.model.Wallet;
import com.plaid.client.model.WalletBalance;
import com.plaid.client.model.WalletNumbers;
import com.plaid.client.model.WalletStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * WalletCreateResponse defines the response schema for &#x60;/wallet/create&#x60;
 */
@ApiModel(description = "WalletCreateResponse defines the response schema for `/wallet/create`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-12T21:24:48.076128Z[Etc/UTC]")
public class WalletCreateResponse {
  public static final String SERIALIZED_NAME_WALLET_ID = "wallet_id";
  @SerializedName(SERIALIZED_NAME_WALLET_ID)
  private String walletId;

  public static final String SERIALIZED_NAME_BALANCE = "balance";
  @SerializedName(SERIALIZED_NAME_BALANCE)
  private WalletBalance balance;

  public static final String SERIALIZED_NAME_NUMBERS = "numbers";
  @SerializedName(SERIALIZED_NAME_NUMBERS)
  private WalletNumbers numbers;

  public static final String SERIALIZED_NAME_RECIPIENT_ID = "recipient_id";
  @SerializedName(SERIALIZED_NAME_RECIPIENT_ID)
  private String recipientId;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private WalletStatus status;

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;


  public WalletCreateResponse walletId(String walletId) {
    
    this.walletId = walletId;
    return this;
  }

   /**
   * A unique ID identifying the e-wallet
   * @return walletId
  **/
  @ApiModelProperty(required = true, value = "A unique ID identifying the e-wallet")

  public String getWalletId() {
    return walletId;
  }


  public void setWalletId(String walletId) {
    this.walletId = walletId;
  }


  public WalletCreateResponse balance(WalletBalance balance) {
    
    this.balance = balance;
    return this;
  }

   /**
   * Get balance
   * @return balance
  **/
  @ApiModelProperty(required = true, value = "")

  public WalletBalance getBalance() {
    return balance;
  }


  public void setBalance(WalletBalance balance) {
    this.balance = balance;
  }


  public WalletCreateResponse numbers(WalletNumbers numbers) {
    
    this.numbers = numbers;
    return this;
  }

   /**
   * Get numbers
   * @return numbers
  **/
  @ApiModelProperty(required = true, value = "")

  public WalletNumbers getNumbers() {
    return numbers;
  }


  public void setNumbers(WalletNumbers numbers) {
    this.numbers = numbers;
  }


  public WalletCreateResponse recipientId(String recipientId) {
    
    this.recipientId = recipientId;
    return this;
  }

   /**
   * The ID of the recipient that corresponds to the e-wallet account numbers
   * @return recipientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the recipient that corresponds to the e-wallet account numbers")

  public String getRecipientId() {
    return recipientId;
  }


  public void setRecipientId(String recipientId) {
    this.recipientId = recipientId;
  }


  public WalletCreateResponse status(WalletStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")

  public WalletStatus getStatus() {
    return status;
  }


  public void setStatus(WalletStatus status) {
    this.status = status;
  }


  public WalletCreateResponse requestId(String requestId) {
    
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
    WalletCreateResponse walletCreateResponse = (WalletCreateResponse) o;
    return Objects.equals(this.walletId, walletCreateResponse.walletId) &&
        Objects.equals(this.balance, walletCreateResponse.balance) &&
        Objects.equals(this.numbers, walletCreateResponse.numbers) &&
        Objects.equals(this.recipientId, walletCreateResponse.recipientId) &&
        Objects.equals(this.status, walletCreateResponse.status) &&
        Objects.equals(this.requestId, walletCreateResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(walletId, balance, numbers, recipientId, status, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WalletCreateResponse {\n");
    sb.append("    walletId: ").append(toIndentedString(walletId)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    numbers: ").append(toIndentedString(numbers)).append("\n");
    sb.append("    recipientId: ").append(toIndentedString(recipientId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

