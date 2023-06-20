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
import com.plaid.client.model.IdentityVerificationStepStatus;
import com.plaid.client.model.RiskCheckBehavior;
import com.plaid.client.model.RiskCheckDevice;
import com.plaid.client.model.RiskCheckEmail;
import com.plaid.client.model.RiskCheckPhone;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Additional information for the &#x60;risk_check&#x60; step.
 */
@ApiModel(description = "Additional information for the `risk_check` step.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-20T21:31:59.039638Z[Etc/UTC]")
public class RiskCheckDetails {
  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private IdentityVerificationStepStatus status;

  public static final String SERIALIZED_NAME_BEHAVIOR = "behavior";
  @SerializedName(SERIALIZED_NAME_BEHAVIOR)
  private RiskCheckBehavior behavior;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private RiskCheckEmail email;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private RiskCheckPhone phone;

  public static final String SERIALIZED_NAME_DEVICES = "devices";
  @SerializedName(SERIALIZED_NAME_DEVICES)
  private List<RiskCheckDevice> devices = new ArrayList<>();


  public RiskCheckDetails status(IdentityVerificationStepStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")

  public IdentityVerificationStepStatus getStatus() {
    return status;
  }


  public void setStatus(IdentityVerificationStepStatus status) {
    this.status = status;
  }


  public RiskCheckDetails behavior(RiskCheckBehavior behavior) {
    
    this.behavior = behavior;
    return this;
  }

   /**
   * Get behavior
   * @return behavior
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public RiskCheckBehavior getBehavior() {
    return behavior;
  }


  public void setBehavior(RiskCheckBehavior behavior) {
    this.behavior = behavior;
  }


  public RiskCheckDetails email(RiskCheckEmail email) {
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public RiskCheckEmail getEmail() {
    return email;
  }


  public void setEmail(RiskCheckEmail email) {
    this.email = email;
  }


  public RiskCheckDetails phone(RiskCheckPhone phone) {
    
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public RiskCheckPhone getPhone() {
    return phone;
  }


  public void setPhone(RiskCheckPhone phone) {
    this.phone = phone;
  }


  public RiskCheckDetails devices(List<RiskCheckDevice> devices) {
    
    this.devices = devices;
    return this;
  }

  public RiskCheckDetails addDevicesItem(RiskCheckDevice devicesItem) {
    this.devices.add(devicesItem);
    return this;
  }

   /**
   * Array of result summary objects specifying values for &#x60;device&#x60; attributes of risk check.
   * @return devices
  **/
  @ApiModelProperty(required = true, value = "Array of result summary objects specifying values for `device` attributes of risk check.")

  public List<RiskCheckDevice> getDevices() {
    return devices;
  }


  public void setDevices(List<RiskCheckDevice> devices) {
    this.devices = devices;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiskCheckDetails riskCheckDetails = (RiskCheckDetails) o;
    return Objects.equals(this.status, riskCheckDetails.status) &&
        Objects.equals(this.behavior, riskCheckDetails.behavior) &&
        Objects.equals(this.email, riskCheckDetails.email) &&
        Objects.equals(this.phone, riskCheckDetails.phone) &&
        Objects.equals(this.devices, riskCheckDetails.devices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, behavior, email, phone, devices);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskCheckDetails {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    behavior: ").append(toIndentedString(behavior)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    devices: ").append(toIndentedString(devices)).append("\n");
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

