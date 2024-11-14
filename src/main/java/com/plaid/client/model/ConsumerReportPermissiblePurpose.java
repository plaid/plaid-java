/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.586.4
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
 * Describes the reason you are generating a Consumer Report for this user.   &#x60;ACCOUNT_REVIEW_CREDIT&#x60;: In connection with a consumer credit transaction for the review or collection of an account pursuant to FCRA Section 604(a)(3)(A).  &#x60;ACCOUNT_REVIEW_NON_CREDIT&#x60;: For a legitimate business need of the information to review a non-credit account provided primarily for personal, family, or household purposes to determine whether the consumer continues to meet the terms of the account pursuant to FCRA Section 604(a)(3)(F)(2).  &#x60;EMPLOYMENT&#x60;: For employment purposes pursuant to FCRA 604(a)(3)(B), including hiring, retention and promotion purposes.  &#x60;EXTENSION_OF_CREDIT&#x60;: In connection with a credit transaction initiated by and involving the consumer pursuant to FCRA Section 604(a)(3)(A).  &#x60;LEGITIMATE_BUSINESS_NEED_TENANT_SCREENING&#x60;: For a legitimate business need in connection with a business transaction initiated by the consumer primarily for personal, family, or household purposes in connection with a property rental assessment pursuant to FCRA Section 604(a)(3)(F)(i).  &#x60;LEGITIMATE_BUSINESS_NEED_OTHER&#x60;: For a legitimate business need in connection with a business transaction made primarily for personal, family, or household initiated by the consumer pursuant to FCRA Section 604(a)(3)(F)(i).  &#x60;WRITTEN_INSTRUCTION_PREQUALIFICATION&#x60;: In accordance with the written instructions of the consumer pursuant to FCRA Section 604(a)(2), to evaluate an application’s profile to make an offer to the consumer.  &#x60;WRITTEN_INSTRUCTION_OTHER&#x60;: In accordance with the written instructions of the consumer pursuant to FCRA Section 604(a)(2), such as when an individual agrees to act as a guarantor or assumes personal liability for a consumer, business, or commercial loan.
 */
@JsonAdapter(ConsumerReportPermissiblePurpose.Adapter.class)
public enum ConsumerReportPermissiblePurpose {
  
  ACCOUNT_REVIEW_CREDIT("ACCOUNT_REVIEW_CREDIT"),
  
  ACCOUNT_REVIEW_NON_CREDIT("ACCOUNT_REVIEW_NON_CREDIT"),
  
  EMPLOYMENT("EMPLOYMENT"),
  
  EXTENSION_OF_CREDIT("EXTENSION_OF_CREDIT"),
  
  LEGITIMATE_BUSINESS_NEED_TENANT_SCREENING("LEGITIMATE_BUSINESS_NEED_TENANT_SCREENING"),
  
  LEGITIMATE_BUSINESS_NEED_OTHER("LEGITIMATE_BUSINESS_NEED_OTHER"),
  
  WRITTEN_INSTRUCTION_PREQUALIFICATION("WRITTEN_INSTRUCTION_PREQUALIFICATION"),
  
  WRITTEN_INSTRUCTION_OTHER("WRITTEN_INSTRUCTION_OTHER"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  ConsumerReportPermissiblePurpose(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ConsumerReportPermissiblePurpose fromValue(String value) {
    for (ConsumerReportPermissiblePurpose b : ConsumerReportPermissiblePurpose.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return ConsumerReportPermissiblePurpose.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<ConsumerReportPermissiblePurpose> {
    @Override
    public void write(final JsonWriter jsonWriter, final ConsumerReportPermissiblePurpose enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ConsumerReportPermissiblePurpose read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ConsumerReportPermissiblePurpose.fromValue(value);
    }
  }
}

