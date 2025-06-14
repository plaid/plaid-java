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
import com.plaid.client.model.CreditPayStubAddress;
import com.plaid.client.model.PayStubTaxpayerID;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Data about the employee.
 */
@ApiModel(description = "Data about the employee.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-12T21:24:48.076128Z[Etc/UTC]")
public class CreditPayStubEmployee {
  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private CreditPayStubAddress address;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_MARITAL_STATUS = "marital_status";
  @SerializedName(SERIALIZED_NAME_MARITAL_STATUS)
  private String maritalStatus;

  public static final String SERIALIZED_NAME_TAXPAYER_ID = "taxpayer_id";
  @SerializedName(SERIALIZED_NAME_TAXPAYER_ID)
  private PayStubTaxpayerID taxpayerId;


  public CreditPayStubEmployee address(CreditPayStubAddress address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(required = true, value = "")

  public CreditPayStubAddress getAddress() {
    return address;
  }


  public void setAddress(CreditPayStubAddress address) {
    this.address = address;
  }


  public CreditPayStubEmployee name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the employee.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The name of the employee.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CreditPayStubEmployee maritalStatus(String maritalStatus) {
    
    this.maritalStatus = maritalStatus;
    return this;
  }

   /**
   * Marital status of the employee - either &#x60;SINGLE&#x60; or &#x60;MARRIED&#x60; or &#x60;NOT LISTED&#x60;.
   * @return maritalStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Marital status of the employee - either `SINGLE` or `MARRIED` or `NOT LISTED`.")

  public String getMaritalStatus() {
    return maritalStatus;
  }


  public void setMaritalStatus(String maritalStatus) {
    this.maritalStatus = maritalStatus;
  }


  public CreditPayStubEmployee taxpayerId(PayStubTaxpayerID taxpayerId) {
    
    this.taxpayerId = taxpayerId;
    return this;
  }

   /**
   * Get taxpayerId
   * @return taxpayerId
  **/
  @ApiModelProperty(required = true, value = "")

  public PayStubTaxpayerID getTaxpayerId() {
    return taxpayerId;
  }


  public void setTaxpayerId(PayStubTaxpayerID taxpayerId) {
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
    CreditPayStubEmployee creditPayStubEmployee = (CreditPayStubEmployee) o;
    return Objects.equals(this.address, creditPayStubEmployee.address) &&
        Objects.equals(this.name, creditPayStubEmployee.name) &&
        Objects.equals(this.maritalStatus, creditPayStubEmployee.maritalStatus) &&
        Objects.equals(this.taxpayerId, creditPayStubEmployee.taxpayerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, name, maritalStatus, taxpayerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditPayStubEmployee {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

