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
import com.plaid.client.model.CraLoanOpenedStatus;
import com.plaid.client.model.CraLoanPaymentSchedule;
import com.plaid.client.model.CraLoanRegisterApplication;
import com.plaid.client.model.CraLoanType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Contains loan data to register.
 */
@ApiModel(description = "Contains loan data to register.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-14T16:41:31.650700Z[Etc/UTC]")
public class CraLoanRegister {
  public static final String SERIALIZED_NAME_USER_TOKEN = "user_token";
  @SerializedName(SERIALIZED_NAME_USER_TOKEN)
  private String userToken;

  public static final String SERIALIZED_NAME_LOAN_ID = "loan_id";
  @SerializedName(SERIALIZED_NAME_LOAN_ID)
  private String loanId;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private CraLoanType type;

  public static final String SERIALIZED_NAME_PAYMENT_SCHEDULE = "payment_schedule";
  @SerializedName(SERIALIZED_NAME_PAYMENT_SCHEDULE)
  private CraLoanPaymentSchedule paymentSchedule;

  public static final String SERIALIZED_NAME_OPENED_DATE = "opened_date";
  @SerializedName(SERIALIZED_NAME_OPENED_DATE)
  private LocalDate openedDate;

  public static final String SERIALIZED_NAME_OPENED_WITH_STATUS = "opened_with_status";
  @SerializedName(SERIALIZED_NAME_OPENED_WITH_STATUS)
  private CraLoanOpenedStatus openedWithStatus;

  public static final String SERIALIZED_NAME_LOAN_AMOUNT = "loan_amount";
  @SerializedName(SERIALIZED_NAME_LOAN_AMOUNT)
  private Double loanAmount;

  public static final String SERIALIZED_NAME_APPLICATION = "application";
  @SerializedName(SERIALIZED_NAME_APPLICATION)
  private CraLoanRegisterApplication application;


  public CraLoanRegister userToken(String userToken) {
    
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


  public CraLoanRegister loanId(String loanId) {
    
    this.loanId = loanId;
    return this;
  }

   /**
   * A unique identifier for the loan.  Personally identifiable information, such as an email address or phone number, should not be used in the &#x60;loan_id&#x60;.
   * @return loanId
  **/
  @ApiModelProperty(required = true, value = "A unique identifier for the loan.  Personally identifiable information, such as an email address or phone number, should not be used in the `loan_id`.")

  public String getLoanId() {
    return loanId;
  }


  public void setLoanId(String loanId) {
    this.loanId = loanId;
  }


  public CraLoanRegister type(CraLoanType type) {
    
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


  public CraLoanRegister paymentSchedule(CraLoanPaymentSchedule paymentSchedule) {
    
    this.paymentSchedule = paymentSchedule;
    return this;
  }

   /**
   * Get paymentSchedule
   * @return paymentSchedule
  **/
  @ApiModelProperty(required = true, value = "")

  public CraLoanPaymentSchedule getPaymentSchedule() {
    return paymentSchedule;
  }


  public void setPaymentSchedule(CraLoanPaymentSchedule paymentSchedule) {
    this.paymentSchedule = paymentSchedule;
  }


  public CraLoanRegister openedDate(LocalDate openedDate) {
    
    this.openedDate = openedDate;
    return this;
  }

   /**
   * The date the loan account was opened. The date should be in ISO 8601 format (YYYY-MM-DD).
   * @return openedDate
  **/
  @ApiModelProperty(required = true, value = "The date the loan account was opened. The date should be in ISO 8601 format (YYYY-MM-DD).")

  public LocalDate getOpenedDate() {
    return openedDate;
  }


  public void setOpenedDate(LocalDate openedDate) {
    this.openedDate = openedDate;
  }


  public CraLoanRegister openedWithStatus(CraLoanOpenedStatus openedWithStatus) {
    
    this.openedWithStatus = openedWithStatus;
    return this;
  }

   /**
   * Get openedWithStatus
   * @return openedWithStatus
  **/
  @ApiModelProperty(required = true, value = "")

  public CraLoanOpenedStatus getOpenedWithStatus() {
    return openedWithStatus;
  }


  public void setOpenedWithStatus(CraLoanOpenedStatus openedWithStatus) {
    this.openedWithStatus = openedWithStatus;
  }


  public CraLoanRegister loanAmount(Double loanAmount) {
    
    this.loanAmount = loanAmount;
    return this;
  }

   /**
   * The total amount of the approved loan.
   * @return loanAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The total amount of the approved loan.")

  public Double getLoanAmount() {
    return loanAmount;
  }


  public void setLoanAmount(Double loanAmount) {
    this.loanAmount = loanAmount;
  }


  public CraLoanRegister application(CraLoanRegisterApplication application) {
    
    this.application = application;
    return this;
  }

   /**
   * Get application
   * @return application
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CraLoanRegisterApplication getApplication() {
    return application;
  }


  public void setApplication(CraLoanRegisterApplication application) {
    this.application = application;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CraLoanRegister craLoanRegister = (CraLoanRegister) o;
    return Objects.equals(this.userToken, craLoanRegister.userToken) &&
        Objects.equals(this.loanId, craLoanRegister.loanId) &&
        Objects.equals(this.type, craLoanRegister.type) &&
        Objects.equals(this.paymentSchedule, craLoanRegister.paymentSchedule) &&
        Objects.equals(this.openedDate, craLoanRegister.openedDate) &&
        Objects.equals(this.openedWithStatus, craLoanRegister.openedWithStatus) &&
        Objects.equals(this.loanAmount, craLoanRegister.loanAmount) &&
        Objects.equals(this.application, craLoanRegister.application);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userToken, loanId, type, paymentSchedule, openedDate, openedWithStatus, loanAmount, application);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CraLoanRegister {\n");
    sb.append("    userToken: ").append(toIndentedString(userToken)).append("\n");
    sb.append("    loanId: ").append(toIndentedString(loanId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    paymentSchedule: ").append(toIndentedString(paymentSchedule)).append("\n");
    sb.append("    openedDate: ").append(toIndentedString(openedDate)).append("\n");
    sb.append("    openedWithStatus: ").append(toIndentedString(openedWithStatus)).append("\n");
    sb.append("    loanAmount: ").append(toIndentedString(loanAmount)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
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

