/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.379.0
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
 * Names that are explicitly marked as low quality either by their &#x60;source&#x60; list, or by &#x60;plaid&#x60; by a series of additional checks done by Plaid. Plaid does not ever surface a hit as a result of a weak name alone. If a name has no quality issues, this value will be &#x60;none&#x60;.
 */
@JsonAdapter(WeakAliasDetermination.Adapter.class)
public enum WeakAliasDetermination {
  
  NONE("none"),
  
  SOURCE("source"),
  
  PLAID("plaid"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  WeakAliasDetermination(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static WeakAliasDetermination fromValue(String value) {
    for (WeakAliasDetermination b : WeakAliasDetermination.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return WeakAliasDetermination.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<WeakAliasDetermination> {
    @Override
    public void write(final JsonWriter jsonWriter, final WeakAliasDetermination enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public WeakAliasDetermination read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return WeakAliasDetermination.fromValue(value);
    }
  }
}

