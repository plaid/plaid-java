/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.617.1
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
 * The status of the sweep for the transfer.  &#x60;unswept&#x60;: The transfer hasn&#39;t been swept yet. &#x60;swept&#x60;: The transfer was swept to the sweep account. &#x60;swept_settled&#x60;: Credits are available to be withdrawn or debits have been deducted from the customer’s business checking account. &#x60;return_swept&#x60;: The transfer was returned, funds were pulled back or pushed back to the sweep account. &#x60;funds_available&#x60;: Funds from the transfer have been released from hold and applied to the ledger&#39;s available balance. This is only applicable to debits. &#x60;null&#x60;: The transfer will never be swept (e.g. if the transfer is cancelled or returned before being swept)
 */
@JsonAdapter(TransferSweepStatus.Adapter.class)
public enum TransferSweepStatus {
  
  NULL("null"),
  
  UNSWEPT("unswept"),
  
  SWEPT("swept"),
  
  SWEPT_SETTLED("swept_settled"),
  
  RETURN_SWEPT("return_swept"),
  
  FUNDS_AVAILABLE("funds_available"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  TransferSweepStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TransferSweepStatus fromValue(String value) {
    for (TransferSweepStatus b : TransferSweepStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;  }

  public static class Adapter extends TypeAdapter<TransferSweepStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final TransferSweepStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TransferSweepStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return TransferSweepStatus.fromValue(value);
    }
  }
}

