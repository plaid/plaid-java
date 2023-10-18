/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.457.0
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
import com.plaid.client.model.CraBankIncomeCause;
import com.plaid.client.model.CraBankIncomeWarningCode;
import com.plaid.client.model.CreditBankIncomeWarningType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The warning associated with the data that was unavailable for the Bank Income Report.
 */
@ApiModel(description = "The warning associated with the data that was unavailable for the Bank Income Report.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-17T22:44:09.100608Z[Etc/UTC]")
public class CraBankIncomeWarning {
  public static final String SERIALIZED_NAME_WARNING_TYPE = "warning_type";
  @SerializedName(SERIALIZED_NAME_WARNING_TYPE)
  private CreditBankIncomeWarningType warningType;

  public static final String SERIALIZED_NAME_WARNING_CODE = "warning_code";
  @SerializedName(SERIALIZED_NAME_WARNING_CODE)
  private CraBankIncomeWarningCode warningCode;

  public static final String SERIALIZED_NAME_CAUSE = "cause";
  @SerializedName(SERIALIZED_NAME_CAUSE)
  private CraBankIncomeCause cause;


  public CraBankIncomeWarning warningType(CreditBankIncomeWarningType warningType) {
    
    this.warningType = warningType;
    return this;
  }

   /**
   * Get warningType
   * @return warningType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CreditBankIncomeWarningType getWarningType() {
    return warningType;
  }


  public void setWarningType(CreditBankIncomeWarningType warningType) {
    this.warningType = warningType;
  }


  public CraBankIncomeWarning warningCode(CraBankIncomeWarningCode warningCode) {
    
    this.warningCode = warningCode;
    return this;
  }

   /**
   * Get warningCode
   * @return warningCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CraBankIncomeWarningCode getWarningCode() {
    return warningCode;
  }


  public void setWarningCode(CraBankIncomeWarningCode warningCode) {
    this.warningCode = warningCode;
  }


  public CraBankIncomeWarning cause(CraBankIncomeCause cause) {
    
    this.cause = cause;
    return this;
  }

   /**
   * Get cause
   * @return cause
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CraBankIncomeCause getCause() {
    return cause;
  }


  public void setCause(CraBankIncomeCause cause) {
    this.cause = cause;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CraBankIncomeWarning craBankIncomeWarning = (CraBankIncomeWarning) o;
    return Objects.equals(this.warningType, craBankIncomeWarning.warningType) &&
        Objects.equals(this.warningCode, craBankIncomeWarning.warningCode) &&
        Objects.equals(this.cause, craBankIncomeWarning.cause);
  }

  @Override
  public int hashCode() {
    return Objects.hash(warningType, warningCode, cause);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CraBankIncomeWarning {\n");
    sb.append("    warningType: ").append(toIndentedString(warningType)).append("\n");
    sb.append("    warningCode: ").append(toIndentedString(warningCode)).append("\n");
    sb.append("    cause: ").append(toIndentedString(cause)).append("\n");
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
