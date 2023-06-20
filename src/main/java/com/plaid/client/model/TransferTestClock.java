/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.379.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.plaid.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * Defines the test clock for a transfer.
 */
@ApiModel(description = "Defines the test clock for a transfer.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-20T21:31:59.039638Z[Etc/UTC]")
public class TransferTestClock {
  public static final String SERIALIZED_NAME_TEST_CLOCK_ID = "test_clock_id";
  @SerializedName(SERIALIZED_NAME_TEST_CLOCK_ID)
  private String testClockId;

  public static final String SERIALIZED_NAME_VIRTUAL_TIME = "virtual_time";
  @SerializedName(SERIALIZED_NAME_VIRTUAL_TIME)
  private OffsetDateTime virtualTime;


  public TransferTestClock testClockId(String testClockId) {
    
    this.testClockId = testClockId;
    return this;
  }

   /**
   * Plaid’s unique identifier for a test clock.
   * @return testClockId
  **/
  @ApiModelProperty(required = true, value = "Plaid’s unique identifier for a test clock.")

  public String getTestClockId() {
    return testClockId;
  }


  public void setTestClockId(String testClockId) {
    this.testClockId = testClockId;
  }


  public TransferTestClock virtualTime(OffsetDateTime virtualTime) {
    
    this.virtualTime = virtualTime;
    return this;
  }

   /**
   * The virtual timestamp on the test clock. This will be of the form &#x60;2006-01-02T15:04:05Z&#x60;.
   * @return virtualTime
  **/
  @ApiModelProperty(required = true, value = "The virtual timestamp on the test clock. This will be of the form `2006-01-02T15:04:05Z`.")

  public OffsetDateTime getVirtualTime() {
    return virtualTime;
  }


  public void setVirtualTime(OffsetDateTime virtualTime) {
    this.virtualTime = virtualTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferTestClock transferTestClock = (TransferTestClock) o;
    return Objects.equals(this.testClockId, transferTestClock.testClockId) &&
        Objects.equals(this.virtualTime, transferTestClock.virtualTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(testClockId, virtualTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferTestClock {\n");
    sb.append("    testClockId: ").append(toIndentedString(testClockId)).append("\n");
    sb.append("    virtualTime: ").append(toIndentedString(virtualTime)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

