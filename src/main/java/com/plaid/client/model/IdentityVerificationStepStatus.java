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
 * The status of a step in the Identity Verification process.
 */
@JsonAdapter(IdentityVerificationStepStatus.Adapter.class)
public enum IdentityVerificationStepStatus {
  
  SUCCESS("success"),
  
  ACTIVE("active"),
  
  FAILED("failed"),
  
  WAITING_FOR_PREREQUISITE("waiting_for_prerequisite"),
  
  NOT_APPLICABLE("not_applicable"),
  
  SKIPPED("skipped"),
  
  EXPIRED("expired"),
  
  CANCELED("canceled"),
  
  PENDING_REVIEW("pending_review"),
  
  MANUALLY_APPROVED("manually_approved"),
  
  MANUALLY_REJECTED("manually_rejected"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  IdentityVerificationStepStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static IdentityVerificationStepStatus fromValue(String value) {
    for (IdentityVerificationStepStatus b : IdentityVerificationStepStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return IdentityVerificationStepStatus.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<IdentityVerificationStepStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final IdentityVerificationStepStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public IdentityVerificationStepStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return IdentityVerificationStepStatus.fromValue(value);
    }
  }
}

