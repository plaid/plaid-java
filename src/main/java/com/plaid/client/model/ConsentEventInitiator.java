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
 * The entity that initiated collection of consent.
 */
@JsonAdapter(ConsentEventInitiator.Adapter.class)
public enum ConsentEventInitiator {
  
  PLAID("PLAID"),
  
  DATA_PROVIDER("DATA_PROVIDER"),
  
  CUSTOMER("CUSTOMER"),
  
  END_USER("END_USER"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  ConsentEventInitiator(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ConsentEventInitiator fromValue(String value) {
    for (ConsentEventInitiator b : ConsentEventInitiator.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return ConsentEventInitiator.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<ConsentEventInitiator> {
    @Override
    public void write(final JsonWriter jsonWriter, final ConsentEventInitiator enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ConsentEventInitiator read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ConsentEventInitiator.fromValue(value);
    }
  }
}

