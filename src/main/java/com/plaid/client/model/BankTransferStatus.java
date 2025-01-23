/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.610.1
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
 * The status of the transfer.
 */
@JsonAdapter(BankTransferStatus.Adapter.class)
public enum BankTransferStatus {
  
  PENDING("pending"),
  
  POSTED("posted"),
  
  CANCELLED("cancelled"),
  
  FAILED("failed"),
  
  REVERSED("reversed"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  BankTransferStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BankTransferStatus fromValue(String value) {
    for (BankTransferStatus b : BankTransferStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return BankTransferStatus.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<BankTransferStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final BankTransferStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BankTransferStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return BankTransferStatus.fromValue(value);
    }
  }
}

