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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.plaid.client.model.PaystubOverrideEmployeeAddress;
import com.plaid.client.model.PaystubOverrideTaxpayerID;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The employee on the paystub.
 */
@ApiModel(description = "The employee on the paystub.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-14T16:41:31.650700Z[Etc/UTC]")
public class PaystubOverrideEmployee {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private PaystubOverrideEmployeeAddress address;

  public static final String SERIALIZED_NAME_MARITAL_STATUS = "marital_status";
  @SerializedName(SERIALIZED_NAME_MARITAL_STATUS)
  private String maritalStatus;

  public static final String SERIALIZED_NAME_TAXPAYER_ID = "taxpayer_id";
  @SerializedName(SERIALIZED_NAME_TAXPAYER_ID)
  private PaystubOverrideTaxpayerID taxpayerId;


  public PaystubOverrideEmployee name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the employee.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the employee.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public PaystubOverrideEmployee address(PaystubOverrideEmployeeAddress address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaystubOverrideEmployeeAddress getAddress() {
    return address;
  }


  public void setAddress(PaystubOverrideEmployeeAddress address) {
    this.address = address;
  }


  public PaystubOverrideEmployee maritalStatus(String maritalStatus) {
    
    this.maritalStatus = maritalStatus;
    return this;
  }

   /**
   * Marital status of the employee - either &#x60;single&#x60; or &#x60;married&#x60;.
   * @return maritalStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Marital status of the employee - either `single` or `married`.")

  public String getMaritalStatus() {
    return maritalStatus;
  }


  public void setMaritalStatus(String maritalStatus) {
    this.maritalStatus = maritalStatus;
  }


  public PaystubOverrideEmployee taxpayerId(PaystubOverrideTaxpayerID taxpayerId) {
    
    this.taxpayerId = taxpayerId;
    return this;
  }

   /**
   * Get taxpayerId
   * @return taxpayerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaystubOverrideTaxpayerID getTaxpayerId() {
    return taxpayerId;
  }


  public void setTaxpayerId(PaystubOverrideTaxpayerID taxpayerId) {
    this.taxpayerId = taxpayerId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaystubOverrideEmployee paystubOverrideEmployee = (PaystubOverrideEmployee) o;
    return Objects.equals(this.name, paystubOverrideEmployee.name) &&
        Objects.equals(this.address, paystubOverrideEmployee.address) &&
        Objects.equals(this.maritalStatus, paystubOverrideEmployee.maritalStatus) &&
        Objects.equals(this.taxpayerId, paystubOverrideEmployee.taxpayerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, address, maritalStatus, taxpayerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaystubOverrideEmployee {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    maritalStatus: ").append(toIndentedString(maritalStatus)).append("\n");
    sb.append("    taxpayerId: ").append(toIndentedString(taxpayerId)).append("\n");
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

