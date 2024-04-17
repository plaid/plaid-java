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
import com.plaid.client.model.RecurringTransferNullable;
import com.plaid.client.model.TransferAuthorizationDecision;
import com.plaid.client.model.TransferAuthorizationDecisionRationale;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Defines the response schema for &#x60;/transfer/recurring/create&#x60;
 */
@ApiModel(description = "Defines the response schema for `/transfer/recurring/create`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-17T20:52:19.180696Z[Etc/UTC]")
public class TransferRecurringCreateResponse {
  public static final String SERIALIZED_NAME_RECURRING_TRANSFER = "recurring_transfer";
  @SerializedName(SERIALIZED_NAME_RECURRING_TRANSFER)
  private RecurringTransferNullable recurringTransfer;

  public static final String SERIALIZED_NAME_DECISION = "decision";
  @SerializedName(SERIALIZED_NAME_DECISION)
  private TransferAuthorizationDecision decision;

  public static final String SERIALIZED_NAME_DECISION_RATIONALE = "decision_rationale";
  @SerializedName(SERIALIZED_NAME_DECISION_RATIONALE)
  private TransferAuthorizationDecisionRationale decisionRationale;

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;


  public TransferRecurringCreateResponse recurringTransfer(RecurringTransferNullable recurringTransfer) {
    
    this.recurringTransfer = recurringTransfer;
    return this;
  }

   /**
   * Get recurringTransfer
   * @return recurringTransfer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RecurringTransferNullable getRecurringTransfer() {
    return recurringTransfer;
  }


  public void setRecurringTransfer(RecurringTransferNullable recurringTransfer) {
    this.recurringTransfer = recurringTransfer;
  }


  public TransferRecurringCreateResponse decision(TransferAuthorizationDecision decision) {
    
    this.decision = decision;
    return this;
  }

   /**
   * Get decision
   * @return decision
  **/
  @ApiModelProperty(required = true, value = "")

  public TransferAuthorizationDecision getDecision() {
    return decision;
  }


  public void setDecision(TransferAuthorizationDecision decision) {
    this.decision = decision;
  }


  public TransferRecurringCreateResponse decisionRationale(TransferAuthorizationDecisionRationale decisionRationale) {
    
    this.decisionRationale = decisionRationale;
    return this;
  }

   /**
   * Get decisionRationale
   * @return decisionRationale
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TransferAuthorizationDecisionRationale getDecisionRationale() {
    return decisionRationale;
  }


  public void setDecisionRationale(TransferAuthorizationDecisionRationale decisionRationale) {
    this.decisionRationale = decisionRationale;
  }


  public TransferRecurringCreateResponse requestId(String requestId) {
    
    this.requestId = requestId;
    return this;
  }

   /**
   * A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive.
   * @return requestId
  **/
  @ApiModelProperty(required = true, value = "A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive.")

  public String getRequestId() {
    return requestId;
  }


  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferRecurringCreateResponse transferRecurringCreateResponse = (TransferRecurringCreateResponse) o;
    return Objects.equals(this.recurringTransfer, transferRecurringCreateResponse.recurringTransfer) &&
        Objects.equals(this.decision, transferRecurringCreateResponse.decision) &&
        Objects.equals(this.decisionRationale, transferRecurringCreateResponse.decisionRationale) &&
        Objects.equals(this.requestId, transferRecurringCreateResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recurringTransfer, decision, decisionRationale, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferRecurringCreateResponse {\n");
    sb.append("    recurringTransfer: ").append(toIndentedString(recurringTransfer)).append("\n");
    sb.append("    decision: ").append(toIndentedString(decision)).append("\n");
    sb.append("    decisionRationale: ").append(toIndentedString(decisionRationale)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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

