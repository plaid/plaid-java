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
 * The income category for a specified income source
 */
@JsonAdapter(UserStatedIncomeSourceCategory.Adapter.class)
public enum UserStatedIncomeSourceCategory {
  
  OTHER("OTHER"),
  
  SALARY("SALARY"),
  
  UNEMPLOYMENT("UNEMPLOYMENT"),
  
  CASH("CASH"),
  
  GIG_ECONOMY("GIG_ECONOMY"),
  
  RENTAL("RENTAL"),
  
  CHILD_SUPPORT("CHILD_SUPPORT"),
  
  MILITARY("MILITARY"),
  
  RETIREMENT("RETIREMENT"),
  
  LONG_TERM_DISABILITY("LONG_TERM_DISABILITY"),
  
  BANK_INTEREST("BANK_INTEREST"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  UserStatedIncomeSourceCategory(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static UserStatedIncomeSourceCategory fromValue(String value) {
    for (UserStatedIncomeSourceCategory b : UserStatedIncomeSourceCategory.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return UserStatedIncomeSourceCategory.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<UserStatedIncomeSourceCategory> {
    @Override
    public void write(final JsonWriter jsonWriter, final UserStatedIncomeSourceCategory enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public UserStatedIncomeSourceCategory read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return UserStatedIncomeSourceCategory.fromValue(value);
    }
  }
}

