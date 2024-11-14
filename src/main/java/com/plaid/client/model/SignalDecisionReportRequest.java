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
import com.plaid.client.model.SignalDecisionOutcome;
import com.plaid.client.model.SignalPaymentMethod;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * SignalDecisionReportRequest defines the request schema for &#x60;/signal/decision/report&#x60;
 */
@ApiModel(description = "SignalDecisionReportRequest defines the request schema for `/signal/decision/report`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-14T16:41:31.650700Z[Etc/UTC]")
public class SignalDecisionReportRequest {
  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_CLIENT_TRANSACTION_ID = "client_transaction_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_TRANSACTION_ID)
  private String clientTransactionId;

  public static final String SERIALIZED_NAME_INITIATED = "initiated";
  @SerializedName(SERIALIZED_NAME_INITIATED)
  private Boolean initiated;

  public static final String SERIALIZED_NAME_DAYS_FUNDS_ON_HOLD = "days_funds_on_hold";
  @SerializedName(SERIALIZED_NAME_DAYS_FUNDS_ON_HOLD)
  private Integer daysFundsOnHold;

  public static final String SERIALIZED_NAME_DECISION_OUTCOME = "decision_outcome";
  @SerializedName(SERIALIZED_NAME_DECISION_OUTCOME)
  private SignalDecisionOutcome decisionOutcome;

  public static final String SERIALIZED_NAME_PAYMENT_METHOD = "payment_method";
  @SerializedName(SERIALIZED_NAME_PAYMENT_METHOD)
  private SignalPaymentMethod paymentMethod;

  public static final String SERIALIZED_NAME_AMOUNT_INSTANTLY_AVAILABLE = "amount_instantly_available";
  @SerializedName(SERIALIZED_NAME_AMOUNT_INSTANTLY_AVAILABLE)
  private Double amountInstantlyAvailable;


  public SignalDecisionReportRequest clientId(String clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * Your Plaid API &#x60;client_id&#x60;. The &#x60;client_id&#x60; is required and may be provided either in the &#x60;PLAID-CLIENT-ID&#x60; header or as part of a request body.
   * @return clientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Your Plaid API `client_id`. The `client_id` is required and may be provided either in the `PLAID-CLIENT-ID` header or as part of a request body.")

  public String getClientId() {
    return clientId;
  }


  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public SignalDecisionReportRequest secret(String secret) {
    
    this.secret = secret;
    return this;
  }

   /**
   * Your Plaid API &#x60;secret&#x60;. The &#x60;secret&#x60; is required and may be provided either in the &#x60;PLAID-SECRET&#x60; header or as part of a request body.
   * @return secret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Your Plaid API `secret`. The `secret` is required and may be provided either in the `PLAID-SECRET` header or as part of a request body.")

  public String getSecret() {
    return secret;
  }


  public void setSecret(String secret) {
    this.secret = secret;
  }


  public SignalDecisionReportRequest clientTransactionId(String clientTransactionId) {
    
    this.clientTransactionId = clientTransactionId;
    return this;
  }

   /**
   * Must be the same as the &#x60;client_transaction_id&#x60; supplied when calling &#x60;/signal/evaluate&#x60;
   * @return clientTransactionId
  **/
  @ApiModelProperty(required = true, value = "Must be the same as the `client_transaction_id` supplied when calling `/signal/evaluate`")

  public String getClientTransactionId() {
    return clientTransactionId;
  }


  public void setClientTransactionId(String clientTransactionId) {
    this.clientTransactionId = clientTransactionId;
  }


  public SignalDecisionReportRequest initiated(Boolean initiated) {
    
    this.initiated = initiated;
    return this;
  }

   /**
   * &#x60;true&#x60; if the ACH transaction was initiated, &#x60;false&#x60; otherwise.  This field must be returned as a boolean. If formatted incorrectly, this will result in an [&#x60;INVALID_FIELD&#x60;](/docs/errors/invalid-request/#invalid_field) error.
   * @return initiated
  **/
  @ApiModelProperty(required = true, value = "`true` if the ACH transaction was initiated, `false` otherwise.  This field must be returned as a boolean. If formatted incorrectly, this will result in an [`INVALID_FIELD`](/docs/errors/invalid-request/#invalid_field) error.")

  public Boolean getInitiated() {
    return initiated;
  }


  public void setInitiated(Boolean initiated) {
    this.initiated = initiated;
  }


  public SignalDecisionReportRequest daysFundsOnHold(Integer daysFundsOnHold) {
    
    this.daysFundsOnHold = daysFundsOnHold;
    return this;
  }

   /**
   * The actual number of days (hold time) since the ACH debit transaction that you wait before making funds available to your customers. The holding time could affect the ACH return rate.  For example, use 0 if you make funds available to your customers instantly or the same day following the debit transaction, or 1 if you make funds available the next day following the debit initialization.
   * minimum: 0
   * @return daysFundsOnHold
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The actual number of days (hold time) since the ACH debit transaction that you wait before making funds available to your customers. The holding time could affect the ACH return rate.  For example, use 0 if you make funds available to your customers instantly or the same day following the debit transaction, or 1 if you make funds available the next day following the debit initialization.")

  public Integer getDaysFundsOnHold() {
    return daysFundsOnHold;
  }


  public void setDaysFundsOnHold(Integer daysFundsOnHold) {
    this.daysFundsOnHold = daysFundsOnHold;
  }


  public SignalDecisionReportRequest decisionOutcome(SignalDecisionOutcome decisionOutcome) {
    
    this.decisionOutcome = decisionOutcome;
    return this;
  }

   /**
   * Get decisionOutcome
   * @return decisionOutcome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SignalDecisionOutcome getDecisionOutcome() {
    return decisionOutcome;
  }


  public void setDecisionOutcome(SignalDecisionOutcome decisionOutcome) {
    this.decisionOutcome = decisionOutcome;
  }


  public SignalDecisionReportRequest paymentMethod(SignalPaymentMethod paymentMethod) {
    
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * Get paymentMethod
   * @return paymentMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SignalPaymentMethod getPaymentMethod() {
    return paymentMethod;
  }


  public void setPaymentMethod(SignalPaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
  }


  public SignalDecisionReportRequest amountInstantlyAvailable(Double amountInstantlyAvailable) {
    
    this.amountInstantlyAvailable = amountInstantlyAvailable;
    return this;
  }

   /**
   * The amount (in USD) made available to your customers instantly following the debit transaction. It could be a partial amount of the requested transaction (example: 102.05).
   * @return amountInstantlyAvailable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The amount (in USD) made available to your customers instantly following the debit transaction. It could be a partial amount of the requested transaction (example: 102.05).")

  public Double getAmountInstantlyAvailable() {
    return amountInstantlyAvailable;
  }


  public void setAmountInstantlyAvailable(Double amountInstantlyAvailable) {
    this.amountInstantlyAvailable = amountInstantlyAvailable;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignalDecisionReportRequest signalDecisionReportRequest = (SignalDecisionReportRequest) o;
    return Objects.equals(this.clientId, signalDecisionReportRequest.clientId) &&
        Objects.equals(this.secret, signalDecisionReportRequest.secret) &&
        Objects.equals(this.clientTransactionId, signalDecisionReportRequest.clientTransactionId) &&
        Objects.equals(this.initiated, signalDecisionReportRequest.initiated) &&
        Objects.equals(this.daysFundsOnHold, signalDecisionReportRequest.daysFundsOnHold) &&
        Objects.equals(this.decisionOutcome, signalDecisionReportRequest.decisionOutcome) &&
        Objects.equals(this.paymentMethod, signalDecisionReportRequest.paymentMethod) &&
        Objects.equals(this.amountInstantlyAvailable, signalDecisionReportRequest.amountInstantlyAvailable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, secret, clientTransactionId, initiated, daysFundsOnHold, decisionOutcome, paymentMethod, amountInstantlyAvailable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignalDecisionReportRequest {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    clientTransactionId: ").append(toIndentedString(clientTransactionId)).append("\n");
    sb.append("    initiated: ").append(toIndentedString(initiated)).append("\n");
    sb.append("    daysFundsOnHold: ").append(toIndentedString(daysFundsOnHold)).append("\n");
    sb.append("    decisionOutcome: ").append(toIndentedString(decisionOutcome)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    amountInstantlyAvailable: ").append(toIndentedString(amountInstantlyAvailable)).append("\n");
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

