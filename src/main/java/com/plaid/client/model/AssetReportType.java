/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.555.0
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
 * Indicates either a Fast Asset Report, which will contain only current identity and balance information, or a Full Asset Report, which will also contain historical balance information and transaction data.
 */
@JsonAdapter(AssetReportType.Adapter.class)
public enum AssetReportType {
  
  FULL("FULL"),
  
  FAST("FAST"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  AssetReportType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AssetReportType fromValue(String value) {
    for (AssetReportType b : AssetReportType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return AssetReportType.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<AssetReportType> {
    @Override
    public void write(final JsonWriter jsonWriter, final AssetReportType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AssetReportType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AssetReportType.fromValue(value);
    }
  }
}

