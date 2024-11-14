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
 * Reason why the item is about to be disconnected. &#x60;INSTITUTION_MIGRATION&#x60;: The institution is moving to API or to a different integration. For example, this can occur when an institution moves from a non-OAuth integration to an OAuth integration. &#x60;INSTITUTION_TOKEN_EXPIRATION&#x60;: The consent on an Item associated with a US or CA institution is about to expire.
 */
@JsonAdapter(PendingDisconnectWebhookReason.Adapter.class)
public enum PendingDisconnectWebhookReason {
  
  MIGRATION("INSTITUTION_MIGRATION"),
  
  TOKEN_EXPIRATION("INSTITUTION_TOKEN_EXPIRATION"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  PendingDisconnectWebhookReason(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PendingDisconnectWebhookReason fromValue(String value) {
    for (PendingDisconnectWebhookReason b : PendingDisconnectWebhookReason.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return PendingDisconnectWebhookReason.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<PendingDisconnectWebhookReason> {
    @Override
    public void write(final JsonWriter jsonWriter, final PendingDisconnectWebhookReason enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PendingDisconnectWebhookReason read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PendingDisconnectWebhookReason.fromValue(value);
    }
  }
}

