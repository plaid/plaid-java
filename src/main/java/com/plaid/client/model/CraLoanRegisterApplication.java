/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.610.1
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
import java.time.LocalDate;

/**
 * Contains loan application data to register.
 */
@ApiModel(description = "Contains loan application data to register.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-23T20:55:58.809242Z[Etc/UTC]")
public class CraLoanRegisterApplication {
  public static final String SERIALIZED_NAME_APPLICATION_ID = "application_id";
  @SerializedName(SERIALIZED_NAME_APPLICATION_ID)
  private String applicationId;

  public static final String SERIALIZED_NAME_APPLICATION_DATE = "application_date";
  @SerializedName(SERIALIZED_NAME_APPLICATION_DATE)
  private LocalDate applicationDate;


  public CraLoanRegisterApplication applicationId(String applicationId) {
    
    this.applicationId = applicationId;
    return this;
  }

   /**
   * A unique identifier for the loan application.  Personally identifiable information, such as an email address or phone number, should not be used in the &#x60;application_id&#x60;.
   * @return applicationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A unique identifier for the loan application.  Personally identifiable information, such as an email address or phone number, should not be used in the `application_id`.")

  public String getApplicationId() {
    return applicationId;
  }


  public void setApplicationId(String applicationId) {
    this.applicationId = applicationId;
  }


  public CraLoanRegisterApplication applicationDate(LocalDate applicationDate) {
    
    this.applicationDate = applicationDate;
    return this;
  }

   /**
   * The date the user applied for the loan. The date should be in ISO 8601 format (YYYY-MM-DD).
   * @return applicationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date the user applied for the loan. The date should be in ISO 8601 format (YYYY-MM-DD).")

  public LocalDate getApplicationDate() {
    return applicationDate;
  }


  public void setApplicationDate(LocalDate applicationDate) {
    this.applicationDate = applicationDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CraLoanRegisterApplication craLoanRegisterApplication = (CraLoanRegisterApplication) o;
    return Objects.equals(this.applicationId, craLoanRegisterApplication.applicationId) &&
        Objects.equals(this.applicationDate, craLoanRegisterApplication.applicationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationId, applicationDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CraLoanRegisterApplication {\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    applicationDate: ").append(toIndentedString(applicationDate)).append("\n");
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

