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
 * The network or rails used for the transfer. Valid options are &#x60;ach&#x60;, &#x60;same-day-ach&#x60;, or &#x60;wire&#x60;.
 */
@JsonAdapter(BankTransferNetwork.Adapter.class)
public enum BankTransferNetwork {
  
  ACH("ach"),
  
  SAME_DAY_ACH("same-day-ach"),
  
  WIRE("wire"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  BankTransferNetwork(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BankTransferNetwork fromValue(String value) {
    for (BankTransferNetwork b : BankTransferNetwork.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return BankTransferNetwork.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<BankTransferNetwork> {
    @Override
    public void write(final JsonWriter jsonWriter, final BankTransferNetwork enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BankTransferNetwork read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return BankTransferNetwork.fromValue(value);
    }
  }
}

