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
 * The payment method specified in the &#x60;default_payment_method&#x60; field directly impacts the timing recommendations provided by the API for submitting the debit entry to your processor or ODFI. If unspecified, Signal defaults to &#x60;STANDARD_ACH&#x60;.  &#x60;SAME_DAY_ACH&#x60;: Same Day ACH (as defined by Nacha). The Signal API assumes the settlement will occur on the same business day if the &#x60;/signal/schedule&#x60; request is submitted by 6:00 PM UTC. Note: The actual cutoff time can vary depending on your payment processor or ODFI. NACHA has established three processing windows for Same Day ACH (UTC): 2:30 PM, 6:45 PM, and 8:45 PM.  &#x60;STANDARD_ACH&#x60;: Standard ACH (as defined by Nacha), typically settled one to three business days after submission.  &#x60;MULTIPLE_PAYMENT_METHODS&#x60;: Indicates that there is no default debit rail or multiple payment methods are available, and the transaction could use any of them based on customer policy or availability.
 */
@JsonAdapter(SignalScheduleDefaultPaymentMethod.Adapter.class)
public enum SignalScheduleDefaultPaymentMethod {
  
  SAME_DAY_ACH("SAME_DAY_ACH"),
  
  STANDARD_ACH("STANDARD_ACH"),
  
  MULTIPLE_PAYMENT_METHODS("MULTIPLE_PAYMENT_METHODS"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  SignalScheduleDefaultPaymentMethod(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SignalScheduleDefaultPaymentMethod fromValue(String value) {
    for (SignalScheduleDefaultPaymentMethod b : SignalScheduleDefaultPaymentMethod.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return SignalScheduleDefaultPaymentMethod.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<SignalScheduleDefaultPaymentMethod> {
    @Override
    public void write(final JsonWriter jsonWriter, final SignalScheduleDefaultPaymentMethod enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public SignalScheduleDefaultPaymentMethod read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return SignalScheduleDefaultPaymentMethod.fromValue(value);
    }
  }
}

