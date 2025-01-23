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
 * The status of the loan.
 */
@JsonAdapter(CraLoanStatus.Adapter.class)
public enum CraLoanStatus {
  
  APPROVED("APPROVED"),
  
  DECLINED("DECLINED"),
  
  BOOKED("BOOKED"),
  
  CURRENT("CURRENT"),
  
  DELINQUENT("DELINQUENT"),
  
  DEFAULT("DEFAULT"),
  
  CHARGED_OFF("CHARGED_OFF"),
  
  TRANSFERRED("TRANSFERRED"),
  
  PAID_OFF("PAID_OFF"),
  
  OTHER("OTHER"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  CraLoanStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CraLoanStatus fromValue(String value) {
    for (CraLoanStatus b : CraLoanStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return CraLoanStatus.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<CraLoanStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final CraLoanStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CraLoanStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CraLoanStatus.fromValue(value);
    }
  }
}

