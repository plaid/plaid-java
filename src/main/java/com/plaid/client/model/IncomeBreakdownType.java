/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.78.2
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
 * The type of income. Possible values include:   &#x60;\&quot;regular\&quot;&#x60;: regular income   &#x60;\&quot;overtime\&quot;&#x60;: overtime income   &#x60;\&quot;bonus\&quot;&#x60;: bonus income
 */
@JsonAdapter(IncomeBreakdownType.Adapter.class)
public enum IncomeBreakdownType {
  
  BONUS("bonus"),
  
  OVERTIME("overtime"),
  
  REGULAR("regular"),
  
  NULL("null"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  IncomeBreakdownType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static IncomeBreakdownType fromValue(String value) {
    for (IncomeBreakdownType b : IncomeBreakdownType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;  }

  public static class Adapter extends TypeAdapter<IncomeBreakdownType> {
    @Override
    public void write(final JsonWriter jsonWriter, final IncomeBreakdownType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public IncomeBreakdownType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return IncomeBreakdownType.fromValue(value);
    }
  }
}

