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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.plaid.client.model.DeviceId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Trusted Device data associated with the previous Link session.
 */
@ApiModel(description = "Trusted Device data associated with the previous Link session.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-12T21:24:48.076128Z[Etc/UTC]")
public class TrustedDeviceData {
  public static final String SERIALIZED_NAME_TRUST_LEVEL = "trust_level";
  @SerializedName(SERIALIZED_NAME_TRUST_LEVEL)
  private Integer trustLevel;

  public static final String SERIALIZED_NAME_DEVICE_ID = "device_id";
  @SerializedName(SERIALIZED_NAME_DEVICE_ID)
  private DeviceId deviceId;


  public TrustedDeviceData trustLevel(Integer trustLevel) {
    
    this.trustLevel = trustLevel;
    return this;
  }

   /**
   * Get trustLevel
   * @return trustLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTrustLevel() {
    return trustLevel;
  }


  public void setTrustLevel(Integer trustLevel) {
    this.trustLevel = trustLevel;
  }


  public TrustedDeviceData deviceId(DeviceId deviceId) {
    
    this.deviceId = deviceId;
    return this;
  }

   /**
   * Get deviceId
   * @return deviceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DeviceId getDeviceId() {
    return deviceId;
  }


  public void setDeviceId(DeviceId deviceId) {
    this.deviceId = deviceId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrustedDeviceData trustedDeviceData = (TrustedDeviceData) o;
    return Objects.equals(this.trustLevel, trustedDeviceData.trustLevel) &&
        Objects.equals(this.deviceId, trustedDeviceData.deviceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trustLevel, deviceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrustedDeviceData {\n");
    sb.append("    trustLevel: ").append(toIndentedString(trustLevel)).append("\n");
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
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

