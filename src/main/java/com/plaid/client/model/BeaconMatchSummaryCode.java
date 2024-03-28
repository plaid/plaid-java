/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.503.5
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
 * An enum indicating the match type between two Beacon Users.   &#x60;match&#x60; indicates that the provided input data was a strong match against the other Beacon User.  &#x60;partial_match&#x60; indicates the data approximately matched the other Beacon User. For example, \&quot;Knope\&quot; vs. \&quot;Knope-Wyatt\&quot; for last name.  &#x60;no_match&#x60; indicates that Plaid was able to compare this field against the other Beacon User and it did not match the provided input data.  &#x60;no_data&#x60; indicates that Plaid was unable to compare this field against the original Beacon User because the field was not present in one of the Beacon Users.
 */
@JsonAdapter(BeaconMatchSummaryCode.Adapter.class)
public enum BeaconMatchSummaryCode {
  
  MATCH("match"),
  
  PARTIAL_MATCH("partial_match"),
  
  NO_MATCH("no_match"),
  
  NO_DATA("no_data"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  BeaconMatchSummaryCode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BeaconMatchSummaryCode fromValue(String value) {
    for (BeaconMatchSummaryCode b : BeaconMatchSummaryCode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return BeaconMatchSummaryCode.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<BeaconMatchSummaryCode> {
    @Override
    public void write(final JsonWriter jsonWriter, final BeaconMatchSummaryCode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BeaconMatchSummaryCode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return BeaconMatchSummaryCode.fromValue(value);
    }
  }
}

