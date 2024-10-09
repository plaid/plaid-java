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
 * A broad categorization of the error. Safe for programmatic use.
 */
@JsonAdapter(CreditBankIncomeErrorType.Adapter.class)
public enum CreditBankIncomeErrorType {
  
  INTERNAL_SERVER_ERROR("INTERNAL_SERVER_ERROR"),
  
  INSUFFICIENT_CREDENTIALS("INSUFFICIENT_CREDENTIALS"),
  
  ITEM_LOCKED("ITEM_LOCKED"),
  
  USER_SETUP_REQUIRED("USER_SETUP_REQUIRED"),
  
  COUNTRY_NOT_SUPPORTED("COUNTRY_NOT_SUPPORTED"),
  
  INSTITUTION_DOWN("INSTITUTION_DOWN"),
  
  INSTITUTION_NO_LONGER_SUPPORTED("INSTITUTION_NO_LONGER_SUPPORTED"),
  
  INSTITUTION_NOT_RESPONDING("INSTITUTION_NOT_RESPONDING"),
  
  INVALID_CREDENTIALS("INVALID_CREDENTIALS"),
  
  INVALID_MFA("INVALID_MFA"),
  
  INVALID_SEND_METHOD("INVALID_SEND_METHOD"),
  
  ITEM_LOGIN_REQUIRED("ITEM_LOGIN_REQUIRED"),
  
  MFA_NOT_SUPPORTED("MFA_NOT_SUPPORTED"),
  
  NO_ACCOUNTS("NO_ACCOUNTS"),
  
  ITEM_NOT_SUPPORTED("ITEM_NOT_SUPPORTED"),
  
  ACCESS_NOT_GRANTED("ACCESS_NOT_GRANTED"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  CreditBankIncomeErrorType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CreditBankIncomeErrorType fromValue(String value) {
    for (CreditBankIncomeErrorType b : CreditBankIncomeErrorType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return CreditBankIncomeErrorType.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<CreditBankIncomeErrorType> {
    @Override
    public void write(final JsonWriter jsonWriter, final CreditBankIncomeErrorType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CreditBankIncomeErrorType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CreditBankIncomeErrorType.fromValue(value);
    }
  }
}

