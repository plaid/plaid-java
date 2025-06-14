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
 * &#x60;digital:&#x60; transactions that took place online.  &#x60;place:&#x60; transactions that were made at a physical location.  &#x60;special:&#x60; transactions that relate to banks, e.g. fees or deposits.  &#x60;unresolved:&#x60; transactions that do not fit into the other three types. 
 */
@JsonAdapter(AssetReportTransactionType.Adapter.class)
public enum AssetReportTransactionType {
  
  DIGITAL("digital"),
  
  PLACE("place"),
  
  SPECIAL("special"),
  
  UNRESOLVED("unresolved"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  AssetReportTransactionType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AssetReportTransactionType fromValue(String value) {
    for (AssetReportTransactionType b : AssetReportTransactionType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return AssetReportTransactionType.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<AssetReportTransactionType> {
    @Override
    public void write(final JsonWriter jsonWriter, final AssetReportTransactionType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AssetReportTransactionType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AssetReportTransactionType.fromValue(value);
    }
  }
}

