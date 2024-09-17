/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.565.0
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
 * The type of Beacon Report.  &#x60;first_party&#x60;: If this is the same individual as the one who submitted the KYC.  &#x60;stolen&#x60;: If this is a different individual from the one who submitted the KYC.  &#x60;synthetic&#x60;: If this is an individual using fabricated information.  &#x60;account_takeover&#x60;: If this individual&#39;s account was compromised.  &#x60;unknown&#x60;: If you aren&#39;t sure who committed the fraud.
 */
@JsonAdapter(BeaconReportCreateType.Adapter.class)
public enum BeaconReportCreateType {
  
  FIRST_PARTY("first_party"),
  
  STOLEN("stolen"),
  
  SYNTHETIC("synthetic"),
  
  ACCOUNT_TAKEOVER("account_takeover"),
  
  DATA_BREACH("data_breach"),
  
  UNKNOWN("unknown"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  BeaconReportCreateType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BeaconReportCreateType fromValue(String value) {
    for (BeaconReportCreateType b : BeaconReportCreateType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return BeaconReportCreateType.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<BeaconReportCreateType> {
    @Override
    public void write(final JsonWriter jsonWriter, final BeaconReportCreateType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BeaconReportCreateType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return BeaconReportCreateType.fromValue(value);
    }
  }
}

