/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.556.0
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
 * Type of a document for risk signal analysis
 */
@JsonAdapter(RiskSignalDocumentType.Adapter.class)
public enum RiskSignalDocumentType {
  
  UNKNOWN("UNKNOWN"),
  
  BANK_STATEMENT("BANK_STATEMENT"),
  
  BENEFITS_STATEMENT("BENEFITS_STATEMENT"),
  
  BUSINESS_FILING("BUSINESS_FILING"),
  
  CHECK("CHECK"),
  
  DRIVING_LICENSE("DRIVING_LICENSE"),
  
  FINANCIAL_STATEMENT("FINANCIAL_STATEMENT"),
  
  INVOICE("INVOICE"),
  
  PAYSLIP("PAYSLIP"),
  
  SOCIAL_SECURITY_CARD("SOCIAL_SECURITY_CARD"),
  
  TAX_FORM("TAX_FORM"),
  
  UTILITY_BILL("UTILITY_BILL"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  RiskSignalDocumentType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static RiskSignalDocumentType fromValue(String value) {
    for (RiskSignalDocumentType b : RiskSignalDocumentType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;  }

  public static class Adapter extends TypeAdapter<RiskSignalDocumentType> {
    @Override
    public void write(final JsonWriter jsonWriter, final RiskSignalDocumentType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public RiskSignalDocumentType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return RiskSignalDocumentType.fromValue(value);
    }
  }
}

