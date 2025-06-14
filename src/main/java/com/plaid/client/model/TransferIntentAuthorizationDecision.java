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
 *  A decision regarding the proposed transfer.  &#x60;APPROVED&#x60; – The proposed transfer has received the end user&#39;s consent and has been approved for processing by Plaid. The &#x60;decision_rationale&#x60; field is set if Plaid was unable to fetch the account information. You may proceed with the transfer, but further review is recommended (i.e., use Link in update mode to re-authenticate your user when &#x60;decision_rationale.code&#x60; is &#x60;ITEM_LOGIN_REQUIRED&#x60;). Refer to the &#x60;code&#x60; field in the &#x60;decision_rationale&#x60; object for details.  &#x60;DECLINED&#x60; – Plaid reviewed the proposed transfer and declined processing. Refer to the &#x60;code&#x60; field in the &#x60;decision_rationale&#x60; object for details.
 */
@JsonAdapter(TransferIntentAuthorizationDecision.Adapter.class)
public enum TransferIntentAuthorizationDecision {
  
  APPROVED("APPROVED"),
  
  DECLINED("DECLINED"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  TransferIntentAuthorizationDecision(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TransferIntentAuthorizationDecision fromValue(String value) {
    for (TransferIntentAuthorizationDecision b : TransferIntentAuthorizationDecision.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;  }

  public static class Adapter extends TypeAdapter<TransferIntentAuthorizationDecision> {
    @Override
    public void write(final JsonWriter jsonWriter, final TransferIntentAuthorizationDecision enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TransferIntentAuthorizationDecision read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return TransferIntentAuthorizationDecision.fromValue(value);
    }
  }
}

