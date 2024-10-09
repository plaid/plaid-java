/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.575.0
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
 * How an asset is owned.  &#x60;association&#x60;: Ownership by a corporation, partnership, or unincorporated association, including for-profit and not-for-profit organizations. &#x60;individual&#x60;: Ownership by an individual. &#x60;joint&#x60;: Joint ownership by multiple parties. &#x60;trust&#x60;: Ownership by a revocable or irrevocable trust.
 */
@JsonAdapter(OwnershipType.Adapter.class)
public enum OwnershipType {
  
  NULL("null"),
  
  INDIVIDUAL("individual"),
  
  JOINT("joint"),
  
  ASSOCIATION("association"),
  
  TRUST("trust"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  OwnershipType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OwnershipType fromValue(String value) {
    for (OwnershipType b : OwnershipType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;  }

  public static class Adapter extends TypeAdapter<OwnershipType> {
    @Override
    public void write(final JsonWriter jsonWriter, final OwnershipType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public OwnershipType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return OwnershipType.fromValue(value);
    }
  }
}

