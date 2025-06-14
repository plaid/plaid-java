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
import com.plaid.client.model.PaymentAmountToRefund;
import com.plaid.client.model.PaymentInitiationAddress;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;

/**
 * PaymentInitiationPaymentReverseRequest defines the request schema for &#x60;/payment_initiation/payment/reverse&#x60;
 */
@ApiModel(description = "PaymentInitiationPaymentReverseRequest defines the request schema for `/payment_initiation/payment/reverse`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-12T21:24:48.076128Z[Etc/UTC]")
public class PaymentInitiationPaymentReverseRequest {
  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_PAYMENT_ID = "payment_id";
  @SerializedName(SERIALIZED_NAME_PAYMENT_ID)
  private String paymentId;

  public static final String SERIALIZED_NAME_IDEMPOTENCY_KEY = "idempotency_key";
  @SerializedName(SERIALIZED_NAME_IDEMPOTENCY_KEY)
  private String idempotencyKey;

  public static final String SERIALIZED_NAME_REFERENCE = "reference";
  @SerializedName(SERIALIZED_NAME_REFERENCE)
  private String reference;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private PaymentAmountToRefund amount;

  public static final String SERIALIZED_NAME_COUNTERPARTY_DATE_OF_BIRTH = "counterparty_date_of_birth";
  @SerializedName(SERIALIZED_NAME_COUNTERPARTY_DATE_OF_BIRTH)
  private LocalDate counterpartyDateOfBirth;

  public static final String SERIALIZED_NAME_COUNTERPARTY_ADDRESS = "counterparty_address";
  @SerializedName(SERIALIZED_NAME_COUNTERPARTY_ADDRESS)
  private PaymentInitiationAddress counterpartyAddress;


  public PaymentInitiationPaymentReverseRequest clientId(String clientId) {
    
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


  public PaymentInitiationPaymentReverseRequest secret(String secret) {
    
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


  public PaymentInitiationPaymentReverseRequest paymentId(String paymentId) {
    
    this.paymentId = paymentId;
    return this;
  }

   /**
   * The ID of the payment to reverse
   * @return paymentId
  **/
  @ApiModelProperty(required = true, value = "The ID of the payment to reverse")

  public String getPaymentId() {
    return paymentId;
  }


  public void setPaymentId(String paymentId) {
    this.paymentId = paymentId;
  }


  public PaymentInitiationPaymentReverseRequest idempotencyKey(String idempotencyKey) {
    
    this.idempotencyKey = idempotencyKey;
    return this;
  }

   /**
   * A random key provided by the client, per unique wallet transaction. Maximum of 128 characters.  The API supports idempotency for safely retrying requests without accidentally performing the same operation twice. If a request to execute a wallet transaction fails due to a network connection error, then after a minimum delay of one minute, you can retry the request with the same idempotency key to guarantee that only a single wallet transaction is created. If the request was successfully processed, it will prevent any transaction that uses the same idempotency key, and was received within 24 hours of the first request, from being processed.
   * @return idempotencyKey
  **/
  @ApiModelProperty(required = true, value = "A random key provided by the client, per unique wallet transaction. Maximum of 128 characters.  The API supports idempotency for safely retrying requests without accidentally performing the same operation twice. If a request to execute a wallet transaction fails due to a network connection error, then after a minimum delay of one minute, you can retry the request with the same idempotency key to guarantee that only a single wallet transaction is created. If the request was successfully processed, it will prevent any transaction that uses the same idempotency key, and was received within 24 hours of the first request, from being processed.")

  public String getIdempotencyKey() {
    return idempotencyKey;
  }


  public void setIdempotencyKey(String idempotencyKey) {
    this.idempotencyKey = idempotencyKey;
  }


  public PaymentInitiationPaymentReverseRequest reference(String reference) {
    
    this.reference = reference;
    return this;
  }

   /**
   * A reference for the refund. This must be an alphanumeric string with 6 to 18 characters and must not contain any special characters or spaces.
   * @return reference
  **/
  @ApiModelProperty(required = true, value = "A reference for the refund. This must be an alphanumeric string with 6 to 18 characters and must not contain any special characters or spaces.")

  public String getReference() {
    return reference;
  }


  public void setReference(String reference) {
    this.reference = reference;
  }


  public PaymentInitiationPaymentReverseRequest amount(PaymentAmountToRefund amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentAmountToRefund getAmount() {
    return amount;
  }


  public void setAmount(PaymentAmountToRefund amount) {
    this.amount = amount;
  }


  public PaymentInitiationPaymentReverseRequest counterpartyDateOfBirth(LocalDate counterpartyDateOfBirth) {
    
    this.counterpartyDateOfBirth = counterpartyDateOfBirth;
    return this;
  }

   /**
   * The counterparty&#39;s birthdate, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) (YYYY-MM-DD) format.
   * @return counterpartyDateOfBirth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The counterparty's birthdate, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) (YYYY-MM-DD) format.")

  public LocalDate getCounterpartyDateOfBirth() {
    return counterpartyDateOfBirth;
  }


  public void setCounterpartyDateOfBirth(LocalDate counterpartyDateOfBirth) {
    this.counterpartyDateOfBirth = counterpartyDateOfBirth;
  }


  public PaymentInitiationPaymentReverseRequest counterpartyAddress(PaymentInitiationAddress counterpartyAddress) {
    
    this.counterpartyAddress = counterpartyAddress;
    return this;
  }

   /**
   * Get counterpartyAddress
   * @return counterpartyAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentInitiationAddress getCounterpartyAddress() {
    return counterpartyAddress;
  }


  public void setCounterpartyAddress(PaymentInitiationAddress counterpartyAddress) {
    this.counterpartyAddress = counterpartyAddress;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentInitiationPaymentReverseRequest paymentInitiationPaymentReverseRequest = (PaymentInitiationPaymentReverseRequest) o;
    return Objects.equals(this.clientId, paymentInitiationPaymentReverseRequest.clientId) &&
        Objects.equals(this.secret, paymentInitiationPaymentReverseRequest.secret) &&
        Objects.equals(this.paymentId, paymentInitiationPaymentReverseRequest.paymentId) &&
        Objects.equals(this.idempotencyKey, paymentInitiationPaymentReverseRequest.idempotencyKey) &&
        Objects.equals(this.reference, paymentInitiationPaymentReverseRequest.reference) &&
        Objects.equals(this.amount, paymentInitiationPaymentReverseRequest.amount) &&
        Objects.equals(this.counterpartyDateOfBirth, paymentInitiationPaymentReverseRequest.counterpartyDateOfBirth) &&
        Objects.equals(this.counterpartyAddress, paymentInitiationPaymentReverseRequest.counterpartyAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, secret, paymentId, idempotencyKey, reference, amount, counterpartyDateOfBirth, counterpartyAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentInitiationPaymentReverseRequest {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
    sb.append("    idempotencyKey: ").append(toIndentedString(idempotencyKey)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    counterpartyDateOfBirth: ").append(toIndentedString(counterpartyDateOfBirth)).append("\n");
    sb.append("    counterpartyAddress: ").append(toIndentedString(counterpartyAddress)).append("\n");
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

