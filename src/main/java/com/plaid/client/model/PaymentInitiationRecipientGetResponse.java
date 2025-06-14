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
import com.plaid.client.model.PaymentInitiationAddress;
import com.plaid.client.model.PaymentInitiationRecipient;
import com.plaid.client.model.PaymentInitiationRecipientGetResponseAllOf;
import com.plaid.client.model.RecipientBACSNullable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PaymentInitiationRecipientGetResponse defines the response schema for &#x60;/payment_initiation/recipient/get&#x60;
 */
@ApiModel(description = "PaymentInitiationRecipientGetResponse defines the response schema for `/payment_initiation/recipient/get`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-12T21:24:48.076128Z[Etc/UTC]")
public class PaymentInitiationRecipientGetResponse {
  public static final String SERIALIZED_NAME_RECIPIENT_ID = "recipient_id";
  @SerializedName(SERIALIZED_NAME_RECIPIENT_ID)
  private String recipientId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private PaymentInitiationAddress address;

  public static final String SERIALIZED_NAME_IBAN = "iban";
  @SerializedName(SERIALIZED_NAME_IBAN)
  private String iban;

  public static final String SERIALIZED_NAME_BACS = "bacs";
  @SerializedName(SERIALIZED_NAME_BACS)
  private RecipientBACSNullable bacs;

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;


  public PaymentInitiationRecipientGetResponse recipientId(String recipientId) {
    
    this.recipientId = recipientId;
    return this;
  }

   /**
   * The ID of the recipient.
   * @return recipientId
  **/
  @ApiModelProperty(required = true, value = "The ID of the recipient.")

  public String getRecipientId() {
    return recipientId;
  }


  public void setRecipientId(String recipientId) {
    this.recipientId = recipientId;
  }


  public PaymentInitiationRecipientGetResponse name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the recipient.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the recipient.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public PaymentInitiationRecipientGetResponse address(PaymentInitiationAddress address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentInitiationAddress getAddress() {
    return address;
  }


  public void setAddress(PaymentInitiationAddress address) {
    this.address = address;
  }


  public PaymentInitiationRecipientGetResponse iban(String iban) {
    
    this.iban = iban;
    return this;
  }

   /**
   * The International Bank Account Number (IBAN) for the recipient.
   * @return iban
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The International Bank Account Number (IBAN) for the recipient.")

  public String getIban() {
    return iban;
  }


  public void setIban(String iban) {
    this.iban = iban;
  }


  public PaymentInitiationRecipientGetResponse bacs(RecipientBACSNullable bacs) {
    
    this.bacs = bacs;
    return this;
  }

   /**
   * Get bacs
   * @return bacs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RecipientBACSNullable getBacs() {
    return bacs;
  }


  public void setBacs(RecipientBACSNullable bacs) {
    this.bacs = bacs;
  }


  public PaymentInitiationRecipientGetResponse requestId(String requestId) {
    
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
    PaymentInitiationRecipientGetResponse paymentInitiationRecipientGetResponse = (PaymentInitiationRecipientGetResponse) o;
    return Objects.equals(this.recipientId, paymentInitiationRecipientGetResponse.recipientId) &&
        Objects.equals(this.name, paymentInitiationRecipientGetResponse.name) &&
        Objects.equals(this.address, paymentInitiationRecipientGetResponse.address) &&
        Objects.equals(this.iban, paymentInitiationRecipientGetResponse.iban) &&
        Objects.equals(this.bacs, paymentInitiationRecipientGetResponse.bacs) &&
        Objects.equals(this.requestId, paymentInitiationRecipientGetResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recipientId, name, address, iban, bacs, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentInitiationRecipientGetResponse {\n");
    sb.append("    recipientId: ").append(toIndentedString(recipientId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    bacs: ").append(toIndentedString(bacs)).append("\n");
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

