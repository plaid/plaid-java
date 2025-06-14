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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Decides the mode under which the payment processing should be performed, using &#x60;IMMEDIATE&#x60; as default.  &#x60;IMMEDIATE&#x60;: Will immediately execute the payment, waiting for a response from the ASPSP before returning the result of the payment initiation. This is ideal for user-present flows.   &#x60;ASYNC&#x60;: Will accept a payment execution request and schedule it for processing, immediately returning the new &#x60;payment_id&#x60;. Listen for webhooks or use the [&#x60;/payment_initiation/payment/get&#x60;](https://plaid.com/docs/api/products/payment-initiation/#payment_initiationpaymentget) endpoint to obtain updates on the payment status. This is ideal for non user-present flows.
 */
@JsonAdapter(PaymentInitiationConsentProcessingMode.Adapter.class)
public enum PaymentInitiationConsentProcessingMode {
  
  ASYNC("ASYNC"),
  
  IMMEDIATE("IMMEDIATE"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  PaymentInitiationConsentProcessingMode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PaymentInitiationConsentProcessingMode fromValue(String value) {
    for (PaymentInitiationConsentProcessingMode b : PaymentInitiationConsentProcessingMode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return PaymentInitiationConsentProcessingMode.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<PaymentInitiationConsentProcessingMode> {
    @Override
    public void write(final JsonWriter jsonWriter, final PaymentInitiationConsentProcessingMode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PaymentInitiationConsentProcessingMode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PaymentInitiationConsentProcessingMode.fromValue(value);
    }
  }
}

