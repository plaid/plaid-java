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
 * Indicator of account number format validity for institution.  &#x60;valid&#x60;: indicates that the account number has a correct format for the institution.  &#x60;invalid&#x60;: indicates that the account number has an incorrect format for the institution.  &#x60;unknown&#x60;: indicates that there was not enough information to determine whether the format is correct for the institution.
 */
@JsonAdapter(AccountVerificationInsightsAccountNumberFormat.Adapter.class)
public enum AccountVerificationInsightsAccountNumberFormat {
  
  VALID("valid"),
  
  INVALID("invalid"),
  
  UNKNOWN("unknown"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  AccountVerificationInsightsAccountNumberFormat(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AccountVerificationInsightsAccountNumberFormat fromValue(String value) {
    for (AccountVerificationInsightsAccountNumberFormat b : AccountVerificationInsightsAccountNumberFormat.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return AccountVerificationInsightsAccountNumberFormat.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<AccountVerificationInsightsAccountNumberFormat> {
    @Override
    public void write(final JsonWriter jsonWriter, final AccountVerificationInsightsAccountNumberFormat enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AccountVerificationInsightsAccountNumberFormat read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AccountVerificationInsightsAccountNumberFormat.fromValue(value);
    }
  }
}

