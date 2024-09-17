/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.565.0
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
 * Codes describing the object of a consent event.
 */
@JsonAdapter(ConsentEventCode.Adapter.class)
public enum ConsentEventCode {
  
  PLAID_END_USER_PRIVACY_POLICY("PLAID_END_USER_PRIVACY_POLICY"),
  
  USE_CASES("USE_CASES"),
  
  DATA_SCOPES("DATA_SCOPES"),
  
  ACCOUNT_SCOPES("ACCOUNT_SCOPES"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  ConsentEventCode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ConsentEventCode fromValue(String value) {
    for (ConsentEventCode b : ConsentEventCode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return ConsentEventCode.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<ConsentEventCode> {
    @Override
    public void write(final JsonWriter jsonWriter, final ConsentEventCode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ConsentEventCode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ConsentEventCode.fromValue(value);
    }
  }
}

