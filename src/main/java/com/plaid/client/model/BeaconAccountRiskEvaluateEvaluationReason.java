/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.517.0
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
 * Description of the reason you want to evaluate risk. &#x60;ONBOARDING&#x60;: user links a first bank account as part of the onboarding flow of your platform. &#x60;NEW_ACCOUNT&#x60;: user links another bank account or replaces the currently linked bank account on your platform. &#x60;INFORMATION_CHANGE&#x60;: user changes their information on your platform, e.g., updating their phone number. &#x60;DORMANT_USER&#x60;:  you decide to re-evaluate a user that becomes active after a period of inactivity.   &#x60;OTHER&#x60;: any other reasons not listed here Possible values:  &#x60;ONBOARDING&#x60;, &#x60;NEW_ACCOUNT&#x60;, &#x60;INFORMATION_CHANGE&#x60;, &#x60;DORMANT_USER&#x60;, &#x60;OTHER&#x60; 
 */
@JsonAdapter(BeaconAccountRiskEvaluateEvaluationReason.Adapter.class)
public enum BeaconAccountRiskEvaluateEvaluationReason {
  
  ONBOARDING("ONBOARDING"),
  
  NEW_ACCOUNT("NEW_ACCOUNT"),
  
  INFORMATION_CHANGE("INFORMATION_CHANGE"),
  
  DORMANT_USER("DORMANT_USER"),
  
  OTHER("OTHER"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  BeaconAccountRiskEvaluateEvaluationReason(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BeaconAccountRiskEvaluateEvaluationReason fromValue(String value) {
    for (BeaconAccountRiskEvaluateEvaluationReason b : BeaconAccountRiskEvaluateEvaluationReason.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return BeaconAccountRiskEvaluateEvaluationReason.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<BeaconAccountRiskEvaluateEvaluationReason> {
    @Override
    public void write(final JsonWriter jsonWriter, final BeaconAccountRiskEvaluateEvaluationReason enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BeaconAccountRiskEvaluateEvaluationReason read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return BeaconAccountRiskEvaluateEvaluationReason.fromValue(value);
    }
  }
}

