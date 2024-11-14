/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.586.4
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
 * The status of the refund.  &#x60;pending&#x60;: A new refund was created; it is in the pending state. &#x60;posted&#x60;: The refund has been successfully submitted to the payment network. &#x60;settled&#x60;: Credits have been refunded to the Plaid linked account. &#x60;cancelled&#x60;: The refund was cancelled by the client. &#x60;failed&#x60;: The refund has failed. &#x60;returned&#x60;: The refund was returned.
 */
@JsonAdapter(TransferRefundStatus.Adapter.class)
public enum TransferRefundStatus {
  
  PENDING("pending"),
  
  POSTED("posted"),
  
  CANCELLED("cancelled"),
  
  FAILED("failed"),
  
  SETTLED("settled"),
  
  RETURNED("returned"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  TransferRefundStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TransferRefundStatus fromValue(String value) {
    for (TransferRefundStatus b : TransferRefundStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return TransferRefundStatus.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<TransferRefundStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final TransferRefundStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TransferRefundStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return TransferRefundStatus.fromValue(value);
    }
  }
}

