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
 * The status of a sweep transfer  &#x60;\&quot;pending\&quot;&#x60; - The sweep is currently pending &#x60;\&quot;posted\&quot;&#x60; - The sweep has been posted &#x60;\&quot;settled\&quot;&#x60; - The sweep has settled &#x60;\&quot;returned\&quot;&#x60; - The sweep has been returned &#x60;\&quot;failed\&quot;&#x60; - The sweep has failed
 */
@JsonAdapter(SweepStatus.Adapter.class)
public enum SweepStatus {
  
  PENDING("pending"),
  
  POSTED("posted"),
  
  SETTLED("settled"),
  
  RETURNED("returned"),
  
  FAILED("failed"),
  
  NULL("null"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  SweepStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SweepStatus fromValue(String value) {
    for (SweepStatus b : SweepStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;  }

  public static class Adapter extends TypeAdapter<SweepStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final SweepStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public SweepStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return SweepStatus.fromValue(value);
    }
  }
}

