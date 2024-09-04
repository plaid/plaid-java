/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.555.0
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
 * The error code of a failed transaction. Error codes include: &#x60;EXTERNAL_SYSTEM&#x60;: The transaction was declined by an external system. &#x60;EXPIRED&#x60;: The transaction request has expired. &#x60;CANCELLED&#x60;: The transaction request was rescinded. &#x60;INVALID&#x60;: The transaction did not meet certain criteria, such as an inactive account or no valid counterparty, etc. &#x60;UNKNOWN&#x60;: The transaction was unsuccessful, but the exact cause is unknown.
 */
@JsonAdapter(WalletTransactionFailureReason.Adapter.class)
public enum WalletTransactionFailureReason {
  
  EXTERNAL_SYSTEM("EXTERNAL_SYSTEM"),
  
  EXPIRED("EXPIRED"),
  
  CANCELLED("CANCELLED"),
  
  INVALID("INVALID"),
  
  UNKNOWN("UNKNOWN"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  WalletTransactionFailureReason(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static WalletTransactionFailureReason fromValue(String value) {
    for (WalletTransactionFailureReason b : WalletTransactionFailureReason.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;  }

  public static class Adapter extends TypeAdapter<WalletTransactionFailureReason> {
    @Override
    public void write(final JsonWriter jsonWriter, final WalletTransactionFailureReason enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public WalletTransactionFailureReason read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return WalletTransactionFailureReason.fromValue(value);
    }
  }
}

