/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.517.0
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
 * The network or rails used for the transfer. Defaults to &#x60;same-day-ach&#x60;.  For transfers submitted as &#x60;ach&#x60;, the next-day cutoff is 5:30 PM Eastern Time.  For transfers submitted as &#x60;same-day-ach&#x60;, the same-day cutoff is 3:30 PM Eastern Time. If the transfer is submitted after this cutoff but before the next-day cutoff, it will be sent over next-day rails and will not incur same-day charges; this will apply to both legs of the transfer if applicable.
 */
@JsonAdapter(TransferIntentCreateNetwork.Adapter.class)
public enum TransferIntentCreateNetwork {
  
  ACH("ach"),
  
  SAME_DAY_ACH("same-day-ach"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  TransferIntentCreateNetwork(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TransferIntentCreateNetwork fromValue(String value) {
    for (TransferIntentCreateNetwork b : TransferIntentCreateNetwork.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return TransferIntentCreateNetwork.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<TransferIntentCreateNetwork> {
    @Override
    public void write(final JsonWriter jsonWriter, final TransferIntentCreateNetwork enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TransferIntentCreateNetwork read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return TransferIntentCreateNetwork.fromValue(value);
    }
  }
}

