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
 * Form 1099 Type
 */
@JsonAdapter(Form1099Type.Adapter.class)
public enum Form1099Type {
  
  UNKNOWN("FORM_1099_TYPE_UNKNOWN"),
  
  MISC("FORM_1099_TYPE_MISC"),
  
  K("FORM_1099_TYPE_K"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  Form1099Type(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Form1099Type fromValue(String value) {
    for (Form1099Type b : Form1099Type.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return Form1099Type.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<Form1099Type> {
    @Override
    public void write(final JsonWriter jsonWriter, final Form1099Type enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Form1099Type read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Form1099Type.fromValue(value);
    }
  }
}

