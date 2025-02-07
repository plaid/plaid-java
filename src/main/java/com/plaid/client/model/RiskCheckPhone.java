/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.617.1
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
import com.plaid.client.model.RiskCheckLinkedService;
import com.plaid.client.model.RiskLevel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * Result summary object specifying values for &#x60;phone&#x60; attributes of risk check.
 */
@ApiModel(description = "Result summary object specifying values for `phone` attributes of risk check.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-07T19:05:33.763924Z[Etc/UTC]")
public class RiskCheckPhone {
  public static final String SERIALIZED_NAME_LINKED_SERVICES = "linked_services";
  @SerializedName(SERIALIZED_NAME_LINKED_SERVICES)
  private Set<RiskCheckLinkedService> linkedServices = new LinkedHashSet<>();

  public static final String SERIALIZED_NAME_RISK_LEVEL = "risk_level";
  @SerializedName(SERIALIZED_NAME_RISK_LEVEL)
  private RiskLevel riskLevel;

  public static final String SERIALIZED_NAME_FACTORS = "factors";
  @SerializedName(SERIALIZED_NAME_FACTORS)
  private List<String> factors = null;


  public RiskCheckPhone linkedServices(Set<RiskCheckLinkedService> linkedServices) {
    
    this.linkedServices = linkedServices;
    return this;
  }

  public RiskCheckPhone addLinkedServicesItem(RiskCheckLinkedService linkedServicesItem) {
    this.linkedServices.add(linkedServicesItem);
    return this;
  }

   /**
   * A list of online services where this phone number has been detected to have accounts or other activity.
   * @return linkedServices
  **/
  @ApiModelProperty(example = "[\"facebook\"]", required = true, value = "A list of online services where this phone number has been detected to have accounts or other activity.")

  public Set<RiskCheckLinkedService> getLinkedServices() {
    return linkedServices;
  }


  public void setLinkedServices(Set<RiskCheckLinkedService> linkedServices) {
    this.linkedServices = linkedServices;
  }


  public RiskCheckPhone riskLevel(RiskLevel riskLevel) {
    
    this.riskLevel = riskLevel;
    return this;
  }

   /**
   * Get riskLevel
   * @return riskLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RiskLevel getRiskLevel() {
    return riskLevel;
  }


  public void setRiskLevel(RiskLevel riskLevel) {
    this.riskLevel = riskLevel;
  }


  public RiskCheckPhone factors(List<String> factors) {
    
    this.factors = factors;
    return this;
  }

  public RiskCheckPhone addFactorsItem(String factorsItem) {
    if (this.factors == null) {
      this.factors = new ArrayList<>();
    }
    this.factors.add(factorsItem);
    return this;
  }

   /**
   * List of factors, when available, that contribute towards the risk level of the given risk check type.
   * @return factors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of factors, when available, that contribute towards the risk level of the given risk check type.")

  public List<String> getFactors() {
    return factors;
  }


  public void setFactors(List<String> factors) {
    this.factors = factors;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiskCheckPhone riskCheckPhone = (RiskCheckPhone) o;
    return Objects.equals(this.linkedServices, riskCheckPhone.linkedServices) &&
        Objects.equals(this.riskLevel, riskCheckPhone.riskLevel) &&
        Objects.equals(this.factors, riskCheckPhone.factors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(linkedServices, riskLevel, factors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskCheckPhone {\n");
    sb.append("    linkedServices: ").append(toIndentedString(linkedServices)).append("\n");
    sb.append("    riskLevel: ").append(toIndentedString(riskLevel)).append("\n");
    sb.append("    factors: ").append(toIndentedString(factors)).append("\n");
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

