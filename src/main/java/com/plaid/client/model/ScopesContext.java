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
 * An indicator for when scopes are being updated. When scopes are updated via enrollment (i.e. OAuth), the partner must send &#x60;ENROLLMENT&#x60;. When scopes are updated in a post-enrollment view, the partner must send &#x60;PORTAL&#x60;.
 */
@JsonAdapter(ScopesContext.Adapter.class)
public enum ScopesContext {
  
  ENROLLMENT("ENROLLMENT"),
  
  PORTAL("PORTAL"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  ScopesContext(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ScopesContext fromValue(String value) {
    for (ScopesContext b : ScopesContext.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return ScopesContext.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<ScopesContext> {
    @Override
    public void write(final JsonWriter jsonWriter, final ScopesContext enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ScopesContext read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ScopesContext.fromValue(value);
    }
  }
}

