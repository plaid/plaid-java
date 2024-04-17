/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.508.0
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

/**
 * W2 state and local wages
 */
@ApiModel(description = "W2 state and local wages")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-17T20:52:19.180696Z[Etc/UTC]")
public class W2StateAndLocalWagesOverride {
  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_EMPLOYER_STATE_ID_NUMBER = "employer_state_id_number";
  @SerializedName(SERIALIZED_NAME_EMPLOYER_STATE_ID_NUMBER)
  private String employerStateIdNumber;

  public static final String SERIALIZED_NAME_STATE_WAGES_TIPS = "state_wages_tips";
  @SerializedName(SERIALIZED_NAME_STATE_WAGES_TIPS)
  private String stateWagesTips;

  public static final String SERIALIZED_NAME_STATE_INCOME_TAX = "state_income_tax";
  @SerializedName(SERIALIZED_NAME_STATE_INCOME_TAX)
  private String stateIncomeTax;

  public static final String SERIALIZED_NAME_LOCAL_WAGES_TIPS = "local_wages_tips";
  @SerializedName(SERIALIZED_NAME_LOCAL_WAGES_TIPS)
  private String localWagesTips;

  public static final String SERIALIZED_NAME_LOCAL_INCOME_TAX = "local_income_tax";
  @SerializedName(SERIALIZED_NAME_LOCAL_INCOME_TAX)
  private String localIncomeTax;

  public static final String SERIALIZED_NAME_LOCALITY_NAME = "locality_name";
  @SerializedName(SERIALIZED_NAME_LOCALITY_NAME)
  private String localityName;


  public W2StateAndLocalWagesOverride state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * State associated with the wage.
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "State associated with the wage.")

  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }


  public W2StateAndLocalWagesOverride employerStateIdNumber(String employerStateIdNumber) {
    
    this.employerStateIdNumber = employerStateIdNumber;
    return this;
  }

   /**
   * State identification number of the employer.
   * @return employerStateIdNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "State identification number of the employer.")

  public String getEmployerStateIdNumber() {
    return employerStateIdNumber;
  }


  public void setEmployerStateIdNumber(String employerStateIdNumber) {
    this.employerStateIdNumber = employerStateIdNumber;
  }


  public W2StateAndLocalWagesOverride stateWagesTips(String stateWagesTips) {
    
    this.stateWagesTips = stateWagesTips;
    return this;
  }

   /**
   * Wages and tips from the specified state.
   * @return stateWagesTips
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Wages and tips from the specified state.")

  public String getStateWagesTips() {
    return stateWagesTips;
  }


  public void setStateWagesTips(String stateWagesTips) {
    this.stateWagesTips = stateWagesTips;
  }


  public W2StateAndLocalWagesOverride stateIncomeTax(String stateIncomeTax) {
    
    this.stateIncomeTax = stateIncomeTax;
    return this;
  }

   /**
   * Income tax from the specified state.
   * @return stateIncomeTax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Income tax from the specified state.")

  public String getStateIncomeTax() {
    return stateIncomeTax;
  }


  public void setStateIncomeTax(String stateIncomeTax) {
    this.stateIncomeTax = stateIncomeTax;
  }


  public W2StateAndLocalWagesOverride localWagesTips(String localWagesTips) {
    
    this.localWagesTips = localWagesTips;
    return this;
  }

   /**
   * Wages and tips from the locality.
   * @return localWagesTips
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Wages and tips from the locality.")

  public String getLocalWagesTips() {
    return localWagesTips;
  }


  public void setLocalWagesTips(String localWagesTips) {
    this.localWagesTips = localWagesTips;
  }


  public W2StateAndLocalWagesOverride localIncomeTax(String localIncomeTax) {
    
    this.localIncomeTax = localIncomeTax;
    return this;
  }

   /**
   * Income tax from the locality.
   * @return localIncomeTax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Income tax from the locality.")

  public String getLocalIncomeTax() {
    return localIncomeTax;
  }


  public void setLocalIncomeTax(String localIncomeTax) {
    this.localIncomeTax = localIncomeTax;
  }


  public W2StateAndLocalWagesOverride localityName(String localityName) {
    
    this.localityName = localityName;
    return this;
  }

   /**
   * Name of the locality.
   * @return localityName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the locality.")

  public String getLocalityName() {
    return localityName;
  }


  public void setLocalityName(String localityName) {
    this.localityName = localityName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    W2StateAndLocalWagesOverride w2StateAndLocalWagesOverride = (W2StateAndLocalWagesOverride) o;
    return Objects.equals(this.state, w2StateAndLocalWagesOverride.state) &&
        Objects.equals(this.employerStateIdNumber, w2StateAndLocalWagesOverride.employerStateIdNumber) &&
        Objects.equals(this.stateWagesTips, w2StateAndLocalWagesOverride.stateWagesTips) &&
        Objects.equals(this.stateIncomeTax, w2StateAndLocalWagesOverride.stateIncomeTax) &&
        Objects.equals(this.localWagesTips, w2StateAndLocalWagesOverride.localWagesTips) &&
        Objects.equals(this.localIncomeTax, w2StateAndLocalWagesOverride.localIncomeTax) &&
        Objects.equals(this.localityName, w2StateAndLocalWagesOverride.localityName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, employerStateIdNumber, stateWagesTips, stateIncomeTax, localWagesTips, localIncomeTax, localityName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class W2StateAndLocalWagesOverride {\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    employerStateIdNumber: ").append(toIndentedString(employerStateIdNumber)).append("\n");
    sb.append("    stateWagesTips: ").append(toIndentedString(stateWagesTips)).append("\n");
    sb.append("    stateIncomeTax: ").append(toIndentedString(stateIncomeTax)).append("\n");
    sb.append("    localWagesTips: ").append(toIndentedString(localWagesTips)).append("\n");
    sb.append("    localIncomeTax: ").append(toIndentedString(localIncomeTax)).append("\n");
    sb.append("    localityName: ").append(toIndentedString(localityName)).append("\n");
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

