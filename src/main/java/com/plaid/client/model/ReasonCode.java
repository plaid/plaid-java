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
 * Specifies the reason for cancelling transfer. This is required for RfP transfers, and will be ignored for other networks.  &#x60;\&quot;AC03\&quot;&#x60; - Invalid Creditor Account Number  &#x60;\&quot;AM09\&quot;&#x60; - Incorrect Amount  &#x60;\&quot;CUST\&quot;&#x60; - Requested By Customer - Cancellation requested  &#x60;\&quot;DUPL\&quot;&#x60; - Duplicate Payment  &#x60;\&quot;FRAD\&quot;&#x60; - Fraudulent Payment - Unauthorized or fraudulently induced  &#x60;\&quot;TECH\&quot;&#x60; - Technical Problem - Cancellation due to system issues  &#x60;\&quot;UPAY\&quot;&#x60; - Undue Payment - Payment was made through another channel  &#x60;\&quot;AC14\&quot;&#x60; - Invalid or Missing Creditor Account Type  &#x60;\&quot;AM06\&quot;&#x60; - Amount Too Low  &#x60;\&quot;BE05\&quot;&#x60; - Unrecognized Initiating Party  &#x60;\&quot;FOCR\&quot;&#x60; - Following Refund Request  &#x60;\&quot;MS02\&quot;&#x60; - No Specified Reason - Customer  &#x60;\&quot;MS03\&quot;&#x60; - No Specified Reason - Agent  &#x60;\&quot;RR04\&quot;&#x60; - Regulatory Reason  &#x60;\&quot;RUTA\&quot;&#x60; - Return Upon Unable To Apply
 */
@JsonAdapter(ReasonCode.Adapter.class)
public enum ReasonCode {
  
  AC03("AC03"),
  
  AM09("AM09"),
  
  CUST("CUST"),
  
  DUPL("DUPL"),
  
  FRAD("FRAD"),
  
  TECH("TECH"),
  
  UPAY("UPAY"),
  
  AC14("AC14"),
  
  AM06("AM06"),
  
  BE05("BE05"),
  
  FOCR("FOCR"),
  
  MS02("MS02"),
  
  MS03("MS03"),
  
  RR04("RR04"),
  
  RUTA("RUTA"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  ReasonCode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReasonCode fromValue(String value) {
    for (ReasonCode b : ReasonCode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return ReasonCode.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<ReasonCode> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReasonCode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReasonCode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ReasonCode.fromValue(value);
    }
  }
}

