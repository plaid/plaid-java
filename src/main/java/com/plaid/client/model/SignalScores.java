/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.20.6
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
import com.plaid.client.model.BankInitiatedReturnRisk;
import com.plaid.client.model.CustomerInitiatedReturnRisk;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * SignalScores
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-13T06:03:39.032Z[GMT]")
public class SignalScores {
  public static final String SERIALIZED_NAME_CUSTOMER_INITIATED_RETURN_RISK = "customer_initiated_return_risk";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_INITIATED_RETURN_RISK)
  private CustomerInitiatedReturnRisk customerInitiatedReturnRisk;

  public static final String SERIALIZED_NAME_BANK_INITIATED_RETURN_RISK = "bank_initiated_return_risk";
  @SerializedName(SERIALIZED_NAME_BANK_INITIATED_RETURN_RISK)
  private BankInitiatedReturnRisk bankInitiatedReturnRisk;


  public SignalScores customerInitiatedReturnRisk(CustomerInitiatedReturnRisk customerInitiatedReturnRisk) {
    
    this.customerInitiatedReturnRisk = customerInitiatedReturnRisk;
    return this;
  }

   /**
   * Get customerInitiatedReturnRisk
   * @return customerInitiatedReturnRisk
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CustomerInitiatedReturnRisk getCustomerInitiatedReturnRisk() {
    return customerInitiatedReturnRisk;
  }


  public void setCustomerInitiatedReturnRisk(CustomerInitiatedReturnRisk customerInitiatedReturnRisk) {
    this.customerInitiatedReturnRisk = customerInitiatedReturnRisk;
  }


  public SignalScores bankInitiatedReturnRisk(BankInitiatedReturnRisk bankInitiatedReturnRisk) {
    
    this.bankInitiatedReturnRisk = bankInitiatedReturnRisk;
    return this;
  }

   /**
   * Get bankInitiatedReturnRisk
   * @return bankInitiatedReturnRisk
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BankInitiatedReturnRisk getBankInitiatedReturnRisk() {
    return bankInitiatedReturnRisk;
  }


  public void setBankInitiatedReturnRisk(BankInitiatedReturnRisk bankInitiatedReturnRisk) {
    this.bankInitiatedReturnRisk = bankInitiatedReturnRisk;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignalScores signalScores = (SignalScores) o;
    return Objects.equals(this.customerInitiatedReturnRisk, signalScores.customerInitiatedReturnRisk) &&
        Objects.equals(this.bankInitiatedReturnRisk, signalScores.bankInitiatedReturnRisk);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerInitiatedReturnRisk, bankInitiatedReturnRisk);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignalScores {\n");
    sb.append("    customerInitiatedReturnRisk: ").append(toIndentedString(customerInitiatedReturnRisk)).append("\n");
    sb.append("    bankInitiatedReturnRisk: ").append(toIndentedString(bankInitiatedReturnRisk)).append("\n");
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

