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
 * The type of bonus that this transaction represents, if it is a bonus. &#x60;BONUS_INCLUDED&#x60;: Bonus is included in this transaction along with the normal pay &#x60;BONUS_ONLY&#x60;: This transaction is a standalone bonus
 */
@JsonAdapter(CraBankIncomeBonusType.Adapter.class)
public enum CraBankIncomeBonusType {
  
  BONUS_INCLUDED("BONUS_INCLUDED"),
  
  BONUS_ONLY("BONUS_ONLY"),
  
  NULL("null"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  CraBankIncomeBonusType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CraBankIncomeBonusType fromValue(String value) {
    for (CraBankIncomeBonusType b : CraBankIncomeBonusType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;  }

  public static class Adapter extends TypeAdapter<CraBankIncomeBonusType> {
    @Override
    public void write(final JsonWriter jsonWriter, final CraBankIncomeBonusType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CraBankIncomeBonusType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CraBankIncomeBonusType.fromValue(value);
    }
  }
}

