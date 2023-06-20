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
import com.plaid.client.model.TransferTestClock;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Defines the response schema for &#x60;/sandbox/transfer/test_clock/list&#x60;
 */
@ApiModel(description = "Defines the response schema for `/sandbox/transfer/test_clock/list`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-20T21:31:59.039638Z[Etc/UTC]")
public class SandboxTransferTestClockListResponse {
  public static final String SERIALIZED_NAME_TEST_CLOCKS = "test_clocks";
  @SerializedName(SERIALIZED_NAME_TEST_CLOCKS)
  private List<TransferTestClock> testClocks = new ArrayList<>();

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;


  public SandboxTransferTestClockListResponse testClocks(List<TransferTestClock> testClocks) {
    
    this.testClocks = testClocks;
    return this;
  }

  public SandboxTransferTestClockListResponse addTestClocksItem(TransferTestClock testClocksItem) {
    this.testClocks.add(testClocksItem);
    return this;
  }

   /**
   * Get testClocks
   * @return testClocks
  **/
  @ApiModelProperty(required = true, value = "")

  public List<TransferTestClock> getTestClocks() {
    return testClocks;
  }


  public void setTestClocks(List<TransferTestClock> testClocks) {
    this.testClocks = testClocks;
  }


  public SandboxTransferTestClockListResponse requestId(String requestId) {
    
    this.requestId = requestId;
    return this;
  }

   /**
   * A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive.
   * @return requestId
  **/
  @ApiModelProperty(required = true, value = "A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive.")

  public String getRequestId() {
    return requestId;
  }


  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SandboxTransferTestClockListResponse sandboxTransferTestClockListResponse = (SandboxTransferTestClockListResponse) o;
    return Objects.equals(this.testClocks, sandboxTransferTestClockListResponse.testClocks) &&
        Objects.equals(this.requestId, sandboxTransferTestClockListResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(testClocks, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SandboxTransferTestClockListResponse {\n");
    sb.append("    testClocks: ").append(toIndentedString(testClocks)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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

