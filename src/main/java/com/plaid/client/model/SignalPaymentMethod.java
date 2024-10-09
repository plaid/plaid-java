/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.575.0
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
 * The payment method to complete the transaction after the risk assessment. It may be different from the default payment method.  &#x60;SAME_DAY_ACH&#x60;: Same Day ACH by NACHA. The debit transaction is processed and settled on the same day  &#x60;NEXT_DAY_ACH&#x60;: Next Day ACH settlement for debit transactions, offered by some payment processors  &#x60;STANDARD_ACH&#x60;: standard ACH by NACHA  &#x60;REAL_TIME_PAYMENTS&#x60;: real-time payments such as RTP and FedNow  &#x60;DEBIT_CARD&#x60;: if the default payment is over debit card networks  &#x60;MULTIPLE_PAYMENT_METHODS&#x60;: if there is no default debit rail or there are multiple payment methods  Possible values: &#x60;SAME_DAY_ACH&#x60;, &#x60;NEXT_DAY_ACH&#x60;, &#x60;STANDARD_ACH&#x60;, &#x60;REAL_TIME_PAYMENTS&#x60;, &#x60;DEBIT_CARD&#x60;, &#x60;MULTIPLE_PAYMENT_METHODS&#x60; 
 */
@JsonAdapter(SignalPaymentMethod.Adapter.class)
public enum SignalPaymentMethod {
  
  SAME_DAY_ACH("SAME_DAY_ACH"),
  
  NEXT_DAY_ACH("NEXT_DAY_ACH"),
  
  STANDARD_ACH("STANDARD_ACH"),
  
  REAL_TIME_PAYMENTS("REAL_TIME_PAYMENTS"),
  
  DEBIT_CARD("DEBIT_CARD"),
  
  MULTIPLE_PAYMENT_METHODS("MULTIPLE_PAYMENT_METHODS"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  SignalPaymentMethod(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SignalPaymentMethod fromValue(String value) {
    for (SignalPaymentMethod b : SignalPaymentMethod.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;  }

  public static class Adapter extends TypeAdapter<SignalPaymentMethod> {
    @Override
    public void write(final JsonWriter jsonWriter, final SignalPaymentMethod enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public SignalPaymentMethod read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return SignalPaymentMethod.fromValue(value);
    }
  }
}

