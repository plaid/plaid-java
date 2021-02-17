/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.5.3
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
 * The type of bank transfer. This will be either &#x60;debit&#x60; or &#x60;credit&#x60;.  A &#x60;debit&#x60; indicates a transfer of money into your origination account; a &#x60;credit&#x60; indicates a transfer of money out of your origination account.
 */
@JsonAdapter(BankTransferType.Adapter.class)
public enum BankTransferType {
  
  DEBIT("debit"),
  
  CREDIT("credit");

  private String value;

  BankTransferType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BankTransferType fromValue(String value) {
    for (BankTransferType b : BankTransferType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<BankTransferType> {
    @Override
    public void write(final JsonWriter jsonWriter, final BankTransferType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BankTransferType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return BankTransferType.fromValue(value);
    }
  }
}

