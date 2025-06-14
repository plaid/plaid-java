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
 * Types of consent activities
 */
@JsonAdapter(ActivityType.Adapter.class)
public enum ActivityType {
  
  UNKNOWN("UNKNOWN"),
  
  ITEM_CREATE("ITEM_CREATE"),
  
  ITEM_IMPORT("ITEM_IMPORT"),
  
  ITEM_UPDATE("ITEM_UPDATE"),
  
  ITEM_UNLINK("ITEM_UNLINK"),
  
  PORTAL_UNLINK("PORTAL_UNLINK"),
  
  PORTAL_ITEMS_DELETE("PORTAL_ITEMS_DELETE"),
  
  ITEM_REMOVE("ITEM_REMOVE"),
  
  INVARIANT_CHECKER_DELETION("INVARIANT_CHECKER_DELETION"),
  
  SCOPES_UPDATE("SCOPES_UPDATE"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  ActivityType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ActivityType fromValue(String value) {
    for (ActivityType b : ActivityType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return ActivityType.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<ActivityType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ActivityType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ActivityType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ActivityType.fromValue(value);
    }
  }
}

