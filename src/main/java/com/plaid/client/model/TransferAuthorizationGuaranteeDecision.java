/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.617.1
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
 * Indicates whether the transfer is guaranteed by Plaid (Guarantee customers only). This field will contain either &#x60;GUARANTEED&#x60; or &#x60;NOT_GUARANTEED&#x60; indicating whether Plaid will guarantee the transfer. If the transfer is not guaranteed, additional information will be provided in the &#x60;guarantee_decision_rationale&#x60; field. Refer to the &#x60;code&#x60; field in &#x60;guarantee_decision_rationale&#x60; for details.
 */
@JsonAdapter(TransferAuthorizationGuaranteeDecision.Adapter.class)
public enum TransferAuthorizationGuaranteeDecision {
  
  GUARANTEED("GUARANTEED"),
  
  NOT_GUARANTEED("NOT_GUARANTEED"),
  
  NULL("null"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  TransferAuthorizationGuaranteeDecision(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TransferAuthorizationGuaranteeDecision fromValue(String value) {
    for (TransferAuthorizationGuaranteeDecision b : TransferAuthorizationGuaranteeDecision.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;  }

  public static class Adapter extends TypeAdapter<TransferAuthorizationGuaranteeDecision> {
    @Override
    public void write(final JsonWriter jsonWriter, final TransferAuthorizationGuaranteeDecision enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TransferAuthorizationGuaranteeDecision read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return TransferAuthorizationGuaranteeDecision.fromValue(value);
    }
  }
}

