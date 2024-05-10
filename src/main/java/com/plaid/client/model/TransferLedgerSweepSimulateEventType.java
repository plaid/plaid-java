/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.503.5
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
 * The asynchronous event to be simulated. May be: &#x60;posted&#x60;, &#x60;settled&#x60;, &#x60;failed&#x60;, or &#x60;returned&#x60;.  An error will be returned if the event type is incompatible with the current ledger sweep status. Compatible status --&gt; event type transitions include:  &#x60;sweep.pending&#x60; --&gt; &#x60;sweep.posted&#x60;  &#x60;sweep.pending&#x60; --&gt; &#x60;sweep.failed&#x60;  &#x60;sweep.posted&#x60; --&gt; &#x60;sweep.settled&#x60;  &#x60;sweep.posted&#x60; --&gt; &#x60;sweep.returned&#x60;  &#x60;sweep.settled&#x60; --&gt; &#x60;sweep.returned&#x60; 
 */
@JsonAdapter(TransferLedgerSweepSimulateEventType.Adapter.class)
public enum TransferLedgerSweepSimulateEventType {
  
  POSTED("sweep.posted"),
  
  SETTLED("sweep.settled"),
  
  RETURNED("sweep.returned"),
  
  FAILED("sweep.failed"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  TransferLedgerSweepSimulateEventType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TransferLedgerSweepSimulateEventType fromValue(String value) {
    for (TransferLedgerSweepSimulateEventType b : TransferLedgerSweepSimulateEventType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return TransferLedgerSweepSimulateEventType.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<TransferLedgerSweepSimulateEventType> {
    @Override
    public void write(final JsonWriter jsonWriter, final TransferLedgerSweepSimulateEventType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TransferLedgerSweepSimulateEventType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return TransferLedgerSweepSimulateEventType.fromValue(value);
    }
  }
}

