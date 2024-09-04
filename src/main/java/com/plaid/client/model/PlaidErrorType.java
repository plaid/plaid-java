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
 * A broad categorization of the error. Safe for programmatic use.
 */
@JsonAdapter(PlaidErrorType.Adapter.class)
public enum PlaidErrorType {
  
  INVALID_REQUEST("INVALID_REQUEST"),
  
  INVALID_RESULT("INVALID_RESULT"),
  
  INVALID_INPUT("INVALID_INPUT"),
  
  INSTITUTION_ERROR("INSTITUTION_ERROR"),
  
  RATE_LIMIT_EXCEEDED("RATE_LIMIT_EXCEEDED"),
  
  API_ERROR("API_ERROR"),
  
  ITEM_ERROR("ITEM_ERROR"),
  
  ASSET_REPORT_ERROR("ASSET_REPORT_ERROR"),
  
  RECAPTCHA_ERROR("RECAPTCHA_ERROR"),
  
  OAUTH_ERROR("OAUTH_ERROR"),
  
  PAYMENT_ERROR("PAYMENT_ERROR"),
  
  BANK_TRANSFER_ERROR("BANK_TRANSFER_ERROR"),
  
  INCOME_VERIFICATION_ERROR("INCOME_VERIFICATION_ERROR"),
  
  MICRODEPOSITS_ERROR("MICRODEPOSITS_ERROR"),
  
  SANDBOX_ERROR("SANDBOX_ERROR"),
  
  PARTNER_ERROR("PARTNER_ERROR"),
  
  TRANSACTIONS_ERROR("TRANSACTIONS_ERROR"),
  
  TRANSACTION_ERROR("TRANSACTION_ERROR"),
  
  TRANSFER_ERROR("TRANSFER_ERROR"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  PlaidErrorType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PlaidErrorType fromValue(String value) {
    for (PlaidErrorType b : PlaidErrorType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return PlaidErrorType.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<PlaidErrorType> {
    @Override
    public void write(final JsonWriter jsonWriter, final PlaidErrorType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PlaidErrorType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PlaidErrorType.fromValue(value);
    }
  }
}

