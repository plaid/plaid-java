/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.620.0
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
import com.plaid.client.model.CraLoanApplicationDecision;
import com.plaid.client.model.CraLoanType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;

/**
 * Contains loan application data.
 */
@ApiModel(description = "Contains loan application data.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-21T16:44:11.345889Z[Etc/UTC]")
public class CraLoanApplication {
  public static final String SERIALIZED_NAME_USER_TOKEN = "user_token";
  @SerializedName(SERIALIZED_NAME_USER_TOKEN)
  private String userToken;

  public static final String SERIALIZED_NAME_APPLICATION_ID = "application_id";
  @SerializedName(SERIALIZED_NAME_APPLICATION_ID)
  private String applicationId;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private CraLoanType type;

  public static final String SERIALIZED_NAME_DECISION = "decision";
  @SerializedName(SERIALIZED_NAME_DECISION)
  private CraLoanApplicationDecision decision;

  public static final String SERIALIZED_NAME_APPLICATION_DATE = "application_date";
  @SerializedName(SERIALIZED_NAME_APPLICATION_DATE)
  private LocalDate applicationDate;

  public static final String SERIALIZED_NAME_DECISION_DATE = "decision_date";
  @SerializedName(SERIALIZED_NAME_DECISION_DATE)
  private LocalDate decisionDate;


  public CraLoanApplication userToken(String userToken) {
    
    this.userToken = userToken;
    return this;
  }

   /**
   * The user token for the user associated with the loan.
   * @return userToken
  **/
  @ApiModelProperty(required = true, value = "The user token for the user associated with the loan.")

  public String getUserToken() {
    return userToken;
  }


  public void setUserToken(String userToken) {
    this.userToken = userToken;
  }


  public CraLoanApplication applicationId(String applicationId) {
    
    this.applicationId = applicationId;
    return this;
  }

   /**
   * A unique identifier for the loan application.  Personally identifiable information, such as an email address or phone number, should not be used in the &#x60;application_id&#x60;.
   * @return applicationId
  **/
  @ApiModelProperty(required = true, value = "A unique identifier for the loan application.  Personally identifiable information, such as an email address or phone number, should not be used in the `application_id`.")

  public String getApplicationId() {
    return applicationId;
  }


  public void setApplicationId(String applicationId) {
    this.applicationId = applicationId;
  }


  public CraLoanApplication type(CraLoanType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")

  public CraLoanType getType() {
    return type;
  }


  public void setType(CraLoanType type) {
    this.type = type;
  }


  public CraLoanApplication decision(CraLoanApplicationDecision decision) {
    
    this.decision = decision;
    return this;
  }

   /**
   * Get decision
   * @return decision
  **/
  @ApiModelProperty(required = true, value = "")

  public CraLoanApplicationDecision getDecision() {
    return decision;
  }


  public void setDecision(CraLoanApplicationDecision decision) {
    this.decision = decision;
  }


  public CraLoanApplication applicationDate(LocalDate applicationDate) {
    
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


  public CraLoanApplication decisionDate(LocalDate decisionDate) {
    
    this.decisionDate = decisionDate;
    return this;
  }

   /**
   * The date when the loan application&#39;s decision was made. The date should be in ISO 8601 format (YYYY-MM-DD).
   * @return decisionDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date when the loan application's decision was made. The date should be in ISO 8601 format (YYYY-MM-DD).")

  public LocalDate getDecisionDate() {
    return decisionDate;
  }


  public void setDecisionDate(LocalDate decisionDate) {
    this.decisionDate = decisionDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CraLoanApplication craLoanApplication = (CraLoanApplication) o;
    return Objects.equals(this.userToken, craLoanApplication.userToken) &&
        Objects.equals(this.applicationId, craLoanApplication.applicationId) &&
        Objects.equals(this.type, craLoanApplication.type) &&
        Objects.equals(this.decision, craLoanApplication.decision) &&
        Objects.equals(this.applicationDate, craLoanApplication.applicationDate) &&
        Objects.equals(this.decisionDate, craLoanApplication.decisionDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userToken, applicationId, type, decision, applicationDate, decisionDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CraLoanApplication {\n");
    sb.append("    userToken: ").append(toIndentedString(userToken)).append("\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    decision: ").append(toIndentedString(decision)).append("\n");
    sb.append("    applicationDate: ").append(toIndentedString(applicationDate)).append("\n");
    sb.append("    decisionDate: ").append(toIndentedString(decisionDate)).append("\n");
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

