/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.565.0
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
import com.plaid.client.model.CreditBankIncomeCause;
import com.plaid.client.model.CreditBankIncomeWarningCode;
import com.plaid.client.model.CreditBankIncomeWarningType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The warning associated with the data that was unavailable for the Bank Income Report.
 */
@ApiModel(description = "The warning associated with the data that was unavailable for the Bank Income Report.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-17T16:42:02.150702Z[Etc/UTC]")
public class CreditBankIncomeWarning {
  public static final String SERIALIZED_NAME_WARNING_TYPE = "warning_type";
  @SerializedName(SERIALIZED_NAME_WARNING_TYPE)
  private CreditBankIncomeWarningType warningType;

  public static final String SERIALIZED_NAME_WARNING_CODE = "warning_code";
  @SerializedName(SERIALIZED_NAME_WARNING_CODE)
  private CreditBankIncomeWarningCode warningCode;

  public static final String SERIALIZED_NAME_CAUSE = "cause";
  @SerializedName(SERIALIZED_NAME_CAUSE)
  private CreditBankIncomeCause cause;


  public CreditBankIncomeWarning warningType(CreditBankIncomeWarningType warningType) {
    
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


  public CreditBankIncomeWarning warningCode(CreditBankIncomeWarningCode warningCode) {
    
    this.warningCode = warningCode;
    return this;
  }

   /**
   * Get warningCode
   * @return warningCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CreditBankIncomeWarningCode getWarningCode() {
    return warningCode;
  }


  public void setWarningCode(CreditBankIncomeWarningCode warningCode) {
    this.warningCode = warningCode;
  }


  public CreditBankIncomeWarning cause(CreditBankIncomeCause cause) {
    
    this.cause = cause;
    return this;
  }

   /**
   * Get cause
   * @return cause
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CreditBankIncomeCause getCause() {
    return cause;
  }


  public void setCause(CreditBankIncomeCause cause) {
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
    CreditBankIncomeWarning creditBankIncomeWarning = (CreditBankIncomeWarning) o;
    return Objects.equals(this.warningType, creditBankIncomeWarning.warningType) &&
        Objects.equals(this.warningCode, creditBankIncomeWarning.warningCode) &&
        Objects.equals(this.cause, creditBankIncomeWarning.cause);
  }

  @Override
  public int hashCode() {
    return Objects.hash(warningType, warningCode, cause);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditBankIncomeWarning {\n");
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

