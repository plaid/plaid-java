/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.517.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.plaid.client.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * The status of the payment.  &#x60;PAYMENT_STATUS_INPUT_NEEDED&#x60;: This is the initial state of all payments. It indicates that the payment is waiting on user input to continue processing. A payment may re-enter this state later on if further input is needed.  &#x60;PAYMENT_STATUS_INITIATED&#x60;: The payment has been successfully authorised and accepted by the financial institution. For successful payments, this is a potential terminal status. Further status transitions can be to REJECTED and, when supported by the institution, to EXECUTED.  &#x60;PAYMENT_STATUS_INSUFFICIENT_FUNDS&#x60;: The payment has failed due to insufficient funds.  &#x60;PAYMENT_STATUS_FAILED&#x60;: The payment has failed to be initiated. This error may be caused by transient system outages and is retryable once the root cause is resolved.  &#x60;PAYMENT_STATUS_BLOCKED&#x60;: The payment has been blocked by Plaid. This can occur, for example, due to Plaid flagging the payment as potentially risky. This is a retryable error.  &#x60;PAYMENT_STATUS_AUTHORISING&#x60;: The payment is currently being processed. The payment will automatically exit this state when the financial institution has authorised the transaction.  &#x60;PAYMENT_STATUS_CANCELLED&#x60;: The payment was cancelled (typically by the end user) during authorisation.  &#x60;PAYMENT_STATUS_EXECUTED&#x60;: The funds have successfully left the payer account and payment is considered complete. Not all institutions support this status: support is more common in the UK, and less common in the EU. For institutions where this status is not supported, the terminal status for a successful payment will be &#x60;PAYMENT_STATUS_INITIATED&#x60;.  &#x60;PAYMENT_STATUS_SETTLED&#x60;: The payment has settled and funds are available for use. A payment will typically settle within seconds to several days, depending on which payment rail is used. This status is only available to customers using [Plaid Virtual Accounts](https://plaid.com/docs/virtual-accounts/).  &#x60;PAYMENT_STATUS_ESTABLISHED&#x60;: Indicates that the standing order has been successfully established. This state is only used for standing orders.  &#x60;PAYMENT_STATUS_REJECTED&#x60;: The payment was rejected by the financial institution.  Deprecated: These statuses will be removed in a future release.  &#x60;PAYMENT_STATUS_UNKNOWN&#x60;: The payment status is unknown.  &#x60;PAYMENT_STATUS_PROCESSING&#x60;: The payment is currently being processed. The payment will automatically exit this state when processing is complete.  &#x60;PAYMENT_STATUS_COMPLETED&#x60;: Indicates that the standing order has been successfully established. This state is only used for standing orders.
 */
@JsonAdapter(PaymentInitiationPaymentStatus.Adapter.class)
public enum PaymentInitiationPaymentStatus {
  
  INPUT_NEEDED("PAYMENT_STATUS_INPUT_NEEDED"),
  
  PROCESSING("PAYMENT_STATUS_PROCESSING"),
  
  INITIATED("PAYMENT_STATUS_INITIATED"),
  
  COMPLETED("PAYMENT_STATUS_COMPLETED"),
  
  INSUFFICIENT_FUNDS("PAYMENT_STATUS_INSUFFICIENT_FUNDS"),
  
  FAILED("PAYMENT_STATUS_FAILED"),
  
  BLOCKED("PAYMENT_STATUS_BLOCKED"),
  
  UNKNOWN("PAYMENT_STATUS_UNKNOWN"),
  
  EXECUTED("PAYMENT_STATUS_EXECUTED"),
  
  SETTLED("PAYMENT_STATUS_SETTLED"),
  
  AUTHORISING("PAYMENT_STATUS_AUTHORISING"),
  
  CANCELLED("PAYMENT_STATUS_CANCELLED"),
  
  ESTABLISHED("PAYMENT_STATUS_ESTABLISHED"),
  
  REJECTED("PAYMENT_STATUS_REJECTED"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  PaymentInitiationPaymentStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PaymentInitiationPaymentStatus fromValue(String value) {
    for (PaymentInitiationPaymentStatus b : PaymentInitiationPaymentStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return PaymentInitiationPaymentStatus.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<PaymentInitiationPaymentStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final PaymentInitiationPaymentStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PaymentInitiationPaymentStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PaymentInitiationPaymentStatus.fromValue(value);
    }
  }
}

