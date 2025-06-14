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
 * The warning code identifies a specific kind of warning. &#x60;IDENTITY_UNAVAILABLE&#x60;: Unable to extract identity for the Item &#x60;TRANSACTIONS_UNAVAILABLE&#x60;: Unable to extract transactions for the Item &#x60;REPORT_DELETED&#x60;: Report deleted due to customer or consumer request &#x60;DATA_UNAVAILABLE&#x60;: No relevant data was found for the Item
 */
@JsonAdapter(CraBankIncomeWarningCode.Adapter.class)
public enum CraBankIncomeWarningCode {
  
  IDENTITY_UNAVAILABLE("IDENTITY_UNAVAILABLE"),
  
  TRANSACTIONS_UNAVAILABLE("TRANSACTIONS_UNAVAILABLE"),
  
  REPORT_DELETED("REPORT_DELETED"),
  
  DATA_UNAVAILABLE("DATA_UNAVAILABLE"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  CraBankIncomeWarningCode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CraBankIncomeWarningCode fromValue(String value) {
    for (CraBankIncomeWarningCode b : CraBankIncomeWarningCode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return CraBankIncomeWarningCode.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<CraBankIncomeWarningCode> {
    @Override
    public void write(final JsonWriter jsonWriter, final CraBankIncomeWarningCode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CraBankIncomeWarningCode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CraBankIncomeWarningCode.fromValue(value);
    }
  }
}

