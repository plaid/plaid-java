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
 * The verification status. One of the following:  &#x60;\&quot;VERIFIED\&quot;&#x60;: The information was successfully verified.  &#x60;\&quot;UNVERIFIED\&quot;&#x60;: The verification has not yet been performed.  &#x60;\&quot;NEEDS_INFO\&quot;&#x60;: The verification was attempted but could not be completed due to missing information.  \&quot;&#x60;UNABLE_TO_VERIFY&#x60;\&quot;: The verification was performed and the information could not be verified.  &#x60;\&quot;UNKNOWN\&quot;&#x60;: The verification status is unknown.
 */
@JsonAdapter(VerificationStatus.Adapter.class)
public enum VerificationStatus {
  
  VERIFIED("VERIFIED"),
  
  UNVERIFIED("UNVERIFIED"),
  
  NEEDS_INFO("NEEDS_INFO"),
  
  UNABLE_TO_VERIFY("UNABLE_TO_VERIFY"),
  
  UNKNOWN("UNKNOWN"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  VerificationStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static VerificationStatus fromValue(String value) {
    for (VerificationStatus b : VerificationStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return VerificationStatus.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<VerificationStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final VerificationStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public VerificationStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return VerificationStatus.fromValue(value);
    }
  }
}

