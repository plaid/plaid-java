/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.610.1
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
 * A match summary describing the cross comparison between the subject&#39;s name, extracted from the document image, and the name they separately provided to identity verification attempt.
 */
@JsonAdapter(DocumentNameMatchCode.Adapter.class)
public enum DocumentNameMatchCode {
  
  MATCH("match"),
  
  PARTIAL_MATCH("partial_match"),
  
  NO_MATCH("no_match"),
  
  NO_DATA("no_data"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  DocumentNameMatchCode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DocumentNameMatchCode fromValue(String value) {
    for (DocumentNameMatchCode b : DocumentNameMatchCode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return DocumentNameMatchCode.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<DocumentNameMatchCode> {
    @Override
    public void write(final JsonWriter jsonWriter, final DocumentNameMatchCode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DocumentNameMatchCode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DocumentNameMatchCode.fromValue(value);
    }
  }
}

