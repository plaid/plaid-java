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
 * The status of the recurring transfer.  &#x60;active&#x60;: The recurring transfer is currently active. &#x60;cancelled&#x60;: The recurring transfer was cancelled by the client or Plaid. &#x60;expired&#x60;: The recurring transfer has completed all originations according to its recurring schedule.
 */
@JsonAdapter(TransferRecurringStatus.Adapter.class)
public enum TransferRecurringStatus {
  
  ACTIVE("active"),
  
  CANCELLED("cancelled"),
  
  EXPIRED("expired"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  TransferRecurringStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TransferRecurringStatus fromValue(String value) {
    for (TransferRecurringStatus b : TransferRecurringStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return TransferRecurringStatus.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<TransferRecurringStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final TransferRecurringStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TransferRecurringStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return TransferRecurringStatus.fromValue(value);
    }
  }
}

