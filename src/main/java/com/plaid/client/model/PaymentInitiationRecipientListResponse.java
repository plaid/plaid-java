/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.161.5
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
import com.plaid.client.model.PaymentInitiationRecipient;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * PaymentInitiationRecipientListResponse defines the response schema for &#x60;/payment_initiation/recipient/list&#x60;
 */
@ApiModel(description = "PaymentInitiationRecipientListResponse defines the response schema for `/payment_initiation/recipient/list`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-29T20:00:26.713837Z[Etc/UTC]")
public class PaymentInitiationRecipientListResponse {
  public static final String SERIALIZED_NAME_RECIPIENTS = "recipients";
  @SerializedName(SERIALIZED_NAME_RECIPIENTS)
  private List<PaymentInitiationRecipient> recipients = new ArrayList<>();

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;


  public PaymentInitiationRecipientListResponse recipients(List<PaymentInitiationRecipient> recipients) {
    
    this.recipients = recipients;
    return this;
  }

  public PaymentInitiationRecipientListResponse addRecipientsItem(PaymentInitiationRecipient recipientsItem) {
    this.recipients.add(recipientsItem);
    return this;
  }

   /**
   * An array of payment recipients created for Payment Initiation
   * @return recipients
  **/
  @ApiModelProperty(required = true, value = "An array of payment recipients created for Payment Initiation")

  public List<PaymentInitiationRecipient> getRecipients() {
    return recipients;
  }


  public void setRecipients(List<PaymentInitiationRecipient> recipients) {
    this.recipients = recipients;
  }


  public PaymentInitiationRecipientListResponse requestId(String requestId) {
    
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
    PaymentInitiationRecipientListResponse paymentInitiationRecipientListResponse = (PaymentInitiationRecipientListResponse) o;
    return Objects.equals(this.recipients, paymentInitiationRecipientListResponse.recipients) &&
        Objects.equals(this.requestId, paymentInitiationRecipientListResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recipients, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentInitiationRecipientListResponse {\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
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

