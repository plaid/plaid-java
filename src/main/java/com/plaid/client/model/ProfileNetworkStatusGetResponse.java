/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.556.0
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
import com.plaid.client.model.ProfileNetworkStatusGetNetworkStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ProfileNetworkStatusGetResponse defines the response schema for &#x60;/profile/network_status/get&#x60;
 */
@ApiModel(description = "ProfileNetworkStatusGetResponse defines the response schema for `/profile/network_status/get`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-04T20:03:42.500463Z[Etc/UTC]")
public class ProfileNetworkStatusGetResponse {
  public static final String SERIALIZED_NAME_NETWORK_STATUS = "network_status";
  @SerializedName(SERIALIZED_NAME_NETWORK_STATUS)
  private ProfileNetworkStatusGetNetworkStatus networkStatus;

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;


  public ProfileNetworkStatusGetResponse networkStatus(ProfileNetworkStatusGetNetworkStatus networkStatus) {
    
    this.networkStatus = networkStatus;
    return this;
  }

   /**
   * Get networkStatus
   * @return networkStatus
  **/
  @ApiModelProperty(required = true, value = "")

  public ProfileNetworkStatusGetNetworkStatus getNetworkStatus() {
    return networkStatus;
  }


  public void setNetworkStatus(ProfileNetworkStatusGetNetworkStatus networkStatus) {
    this.networkStatus = networkStatus;
  }


  public ProfileNetworkStatusGetResponse requestId(String requestId) {
    
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
    ProfileNetworkStatusGetResponse profileNetworkStatusGetResponse = (ProfileNetworkStatusGetResponse) o;
    return Objects.equals(this.networkStatus, profileNetworkStatusGetResponse.networkStatus) &&
        Objects.equals(this.requestId, profileNetworkStatusGetResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkStatus, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfileNetworkStatusGetResponse {\n");
    sb.append("    networkStatus: ").append(toIndentedString(networkStatus)).append("\n");
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

