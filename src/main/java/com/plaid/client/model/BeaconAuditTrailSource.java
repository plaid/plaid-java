/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.620.0
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
 * A type indicating what caused a resource to be changed or updated.   &#x60;dashboard&#x60; - The resource was created or updated by a member of your team via the Plaid dashboard.  &#x60;api&#x60; - The resource was created or updated via the Plaid API.  &#x60;system&#x60; - The resource was created or updated automatically by a part of the Plaid Beacon system. For example, if another business using Plaid Beacon created a fraud report that matched one of your users, your matching user&#39;s status would automatically be updated and the audit trail source would be &#x60;system&#x60;.  &#x60;bulk_import&#x60; - The resource was created or updated as part of a bulk import process. For example, if your company provided a CSV of user data as part of your initial onboarding, the audit trail source would be &#x60;bulk_import&#x60;.
 */
@JsonAdapter(BeaconAuditTrailSource.Adapter.class)
public enum BeaconAuditTrailSource {
  
  DASHBOARD("dashboard"),
  
  API("api"),
  
  SYSTEM("system"),
  
  BULK_IMPORT("bulk_import"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  BeaconAuditTrailSource(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BeaconAuditTrailSource fromValue(String value) {
    for (BeaconAuditTrailSource b : BeaconAuditTrailSource.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return BeaconAuditTrailSource.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<BeaconAuditTrailSource> {
    @Override
    public void write(final JsonWriter jsonWriter, final BeaconAuditTrailSource enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BeaconAuditTrailSource read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return BeaconAuditTrailSource.fromValue(value);
    }
  }
}

