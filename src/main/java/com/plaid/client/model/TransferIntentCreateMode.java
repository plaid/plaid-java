/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.197.3
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
 * The direction of the flow of transfer funds.  - &#x60;PAYMENT&#x60; – Transfers funds from an end user&#39;s account to your business account.  - &#x60;DISBURSEMENT&#x60; – Transfers funds from your business account to an end user&#39;s account.
 */
@JsonAdapter(TransferIntentCreateMode.Adapter.class)
public enum TransferIntentCreateMode {
  
  PAYMENT("PAYMENT"),
  
  DISBURSEMENT("DISBURSEMENT"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  TransferIntentCreateMode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TransferIntentCreateMode fromValue(String value) {
    for (TransferIntentCreateMode b : TransferIntentCreateMode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return TransferIntentCreateMode.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<TransferIntentCreateMode> {
    @Override
    public void write(final JsonWriter jsonWriter, final TransferIntentCreateMode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TransferIntentCreateMode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return TransferIntentCreateMode.fromValue(value);
    }
  }
}

