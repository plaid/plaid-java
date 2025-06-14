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
 * A binary match indicator specifying whether the country that issued the provided document matches the country that the user separately provided to Plaid.  Note: You can configure whether a &#x60;no_match&#x60; on &#x60;issuing_country&#x60; fails the &#x60;documentary_verification&#x60; by editing your Plaid Template.
 */
@JsonAdapter(IssuingCountry.Adapter.class)
public enum IssuingCountry {
  
  MATCH("match"),
  
  NO_MATCH("no_match"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  IssuingCountry(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static IssuingCountry fromValue(String value) {
    for (IssuingCountry b : IssuingCountry.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return IssuingCountry.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<IssuingCountry> {
    @Override
    public void write(final JsonWriter jsonWriter, final IssuingCountry enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public IssuingCountry read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return IssuingCountry.fromValue(value);
    }
  }
}

