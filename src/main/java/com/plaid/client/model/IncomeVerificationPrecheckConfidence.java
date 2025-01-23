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
 * The confidence that Plaid can support the user in the digital income verification flow instead of requiring a manual paystub upload. One of the following:  &#x60;\&quot;HIGH\&quot;&#x60;: It is very likely that this user can use the digital income verification flow.  \&quot;&#x60;LOW&#x60;\&quot;: It is unlikely that this user can use the digital income verification flow.  &#x60;\&quot;UNKNOWN\&quot;&#x60;: It was not possible to determine if the user is supportable with the information passed.
 */
@JsonAdapter(IncomeVerificationPrecheckConfidence.Adapter.class)
public enum IncomeVerificationPrecheckConfidence {
  
  HIGH("HIGH"),
  
  LOW("LOW"),
  
  UNKNOWN("UNKNOWN"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  IncomeVerificationPrecheckConfidence(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static IncomeVerificationPrecheckConfidence fromValue(String value) {
    for (IncomeVerificationPrecheckConfidence b : IncomeVerificationPrecheckConfidence.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return IncomeVerificationPrecheckConfidence.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<IncomeVerificationPrecheckConfidence> {
    @Override
    public void write(final JsonWriter jsonWriter, final IncomeVerificationPrecheckConfidence enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public IncomeVerificationPrecheckConfidence read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return IncomeVerificationPrecheckConfidence.fromValue(value);
    }
  }
}

