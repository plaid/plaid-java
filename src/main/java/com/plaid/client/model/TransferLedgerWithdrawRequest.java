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
import com.plaid.client.model.TransferNetwork;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Defines the request schema for &#x60;/transfer/ledger/withdraw&#x60;
 */
@ApiModel(description = "Defines the request schema for `/transfer/ledger/withdraw`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-18T18:48:06.627309Z[Etc/UTC]")
public class TransferLedgerWithdrawRequest {
  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_ORIGINATOR_CLIENT_ID = "originator_client_id";
  @SerializedName(SERIALIZED_NAME_ORIGINATOR_CLIENT_ID)
  private String originatorClientId;

  public static final String SERIALIZED_NAME_FUNDING_ACCOUNT_ID = "funding_account_id";
  @SerializedName(SERIALIZED_NAME_FUNDING_ACCOUNT_ID)
  private String fundingAccountId;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_IDEMPOTENCY_KEY = "idempotency_key";
  @SerializedName(SERIALIZED_NAME_IDEMPOTENCY_KEY)
  private String idempotencyKey;

  public static final String SERIALIZED_NAME_NETWORK = "network";
  @SerializedName(SERIALIZED_NAME_NETWORK)
  private TransferNetwork network;


  public TransferLedgerWithdrawRequest clientId(String clientId) {
    
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


  public TransferLedgerWithdrawRequest secret(String secret) {
    
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


  public TransferLedgerWithdrawRequest originatorClientId(String originatorClientId) {
    
    this.originatorClientId = originatorClientId;
    return this;
  }

   /**
   * Client ID of the customer that owns the Ledger balance. This is so Plaid knows which of your customers to payout or collect funds. Only applicable for [Platform customers](https://plaid.com/docs/transfer/application/#originators-vs-platforms). Do not include if you’re paying out to yourself.
   * @return originatorClientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Client ID of the customer that owns the Ledger balance. This is so Plaid knows which of your customers to payout or collect funds. Only applicable for [Platform customers](https://plaid.com/docs/transfer/application/#originators-vs-platforms). Do not include if you’re paying out to yourself.")

  public String getOriginatorClientId() {
    return originatorClientId;
  }


  public void setOriginatorClientId(String originatorClientId) {
    this.originatorClientId = originatorClientId;
  }


  public TransferLedgerWithdrawRequest fundingAccountId(String fundingAccountId) {
    
    this.fundingAccountId = fundingAccountId;
    return this;
  }

   /**
   * Specify which funding account linked to this Plaid Ledger to use. Customers can find a list of &#x60;funding_account_id&#x60;s in the Accounts page of your Plaid Dashboard, under the \&quot;Account ID\&quot; column. If this field is left blank, this will default to the default &#x60;funding_account_id&#x60; specified during onboarding. If an &#x60;originator_client_id&#x60; is specified, the &#x60;funding_account_id&#x60; must belong to the specified originator, and if &#x60;funding_account_id&#x60; is left blank, the originator&#39;s default &#x60;funding_account_id&#x60; will be used.
   * @return fundingAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specify which funding account linked to this Plaid Ledger to use. Customers can find a list of `funding_account_id`s in the Accounts page of your Plaid Dashboard, under the \"Account ID\" column. If this field is left blank, this will default to the default `funding_account_id` specified during onboarding. If an `originator_client_id` is specified, the `funding_account_id` must belong to the specified originator, and if `funding_account_id` is left blank, the originator's default `funding_account_id` will be used.")

  public String getFundingAccountId() {
    return fundingAccountId;
  }


  public void setFundingAccountId(String fundingAccountId) {
    this.fundingAccountId = fundingAccountId;
  }


  public TransferLedgerWithdrawRequest amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * A positive amount of how much will be withdrawn from the ledger balance (decimal string with two digits of precision e.g. \&quot;5.50\&quot;).
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "A positive amount of how much will be withdrawn from the ledger balance (decimal string with two digits of precision e.g. \"5.50\").")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public TransferLedgerWithdrawRequest description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The description of the deposit that will be passed to the receiving bank (up to 10 characters). Note that banks utilize this field differently, and may or may not show it on the bank statement.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The description of the deposit that will be passed to the receiving bank (up to 10 characters). Note that banks utilize this field differently, and may or may not show it on the bank statement.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public TransferLedgerWithdrawRequest idempotencyKey(String idempotencyKey) {
    
    this.idempotencyKey = idempotencyKey;
    return this;
  }

   /**
   * A unique key provided by the client, per unique ledger withdraw. Maximum of 50 characters.  The API supports idempotency for safely retrying the request without accidentally performing the same operation twice. For example, if a request to create a ledger withdraw fails due to a network connection error, you can retry the request with the same idempotency key to guarantee that only a single withdraw is created.
   * @return idempotencyKey
  **/
  @ApiModelProperty(required = true, value = "A unique key provided by the client, per unique ledger withdraw. Maximum of 50 characters.  The API supports idempotency for safely retrying the request without accidentally performing the same operation twice. For example, if a request to create a ledger withdraw fails due to a network connection error, you can retry the request with the same idempotency key to guarantee that only a single withdraw is created.")

  public String getIdempotencyKey() {
    return idempotencyKey;
  }


  public void setIdempotencyKey(String idempotencyKey) {
    this.idempotencyKey = idempotencyKey;
  }


  public TransferLedgerWithdrawRequest network(TransferNetwork network) {
    
    this.network = network;
    return this;
  }

   /**
   * Get network
   * @return network
  **/
  @ApiModelProperty(required = true, value = "")

  public TransferNetwork getNetwork() {
    return network;
  }


  public void setNetwork(TransferNetwork network) {
    this.network = network;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferLedgerWithdrawRequest transferLedgerWithdrawRequest = (TransferLedgerWithdrawRequest) o;
    return Objects.equals(this.clientId, transferLedgerWithdrawRequest.clientId) &&
        Objects.equals(this.secret, transferLedgerWithdrawRequest.secret) &&
        Objects.equals(this.originatorClientId, transferLedgerWithdrawRequest.originatorClientId) &&
        Objects.equals(this.fundingAccountId, transferLedgerWithdrawRequest.fundingAccountId) &&
        Objects.equals(this.amount, transferLedgerWithdrawRequest.amount) &&
        Objects.equals(this.description, transferLedgerWithdrawRequest.description) &&
        Objects.equals(this.idempotencyKey, transferLedgerWithdrawRequest.idempotencyKey) &&
        Objects.equals(this.network, transferLedgerWithdrawRequest.network);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, secret, originatorClientId, fundingAccountId, amount, description, idempotencyKey, network);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferLedgerWithdrawRequest {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    originatorClientId: ").append(toIndentedString(originatorClientId)).append("\n");
    sb.append("    fundingAccountId: ").append(toIndentedString(fundingAccountId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    idempotencyKey: ").append(toIndentedString(idempotencyKey)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
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

