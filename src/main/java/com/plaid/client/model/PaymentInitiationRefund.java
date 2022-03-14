/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.84.5
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
import com.plaid.client.model.PaymentAmount;
import com.plaid.client.model.PaymentInitiationRefundStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * PaymentInitiationRefund defines a payment initiation refund
 */
@ApiModel(description = "PaymentInitiationRefund defines a payment initiation refund")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-14T20:57:51.039Z[GMT]")
public class PaymentInitiationRefund {
  public static final String SERIALIZED_NAME_REFUND_ID = "refund_id";
  @SerializedName(SERIALIZED_NAME_REFUND_ID)
  private String refundId;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private PaymentAmount amount;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private PaymentInitiationRefundStatus status;

  public static final String SERIALIZED_NAME_LAST_STATUS_UPDATE = "last_status_update";
  @SerializedName(SERIALIZED_NAME_LAST_STATUS_UPDATE)
  private OffsetDateTime lastStatusUpdate;


  public PaymentInitiationRefund refundId(String refundId) {
    
    this.refundId = refundId;
    return this;
  }

   /**
   * The ID of the refund. Like all Plaid identifiers, the &#x60;refund_id&#x60; is case sensitive.
   * @return refundId
  **/
  @ApiModelProperty(required = true, value = "The ID of the refund. Like all Plaid identifiers, the `refund_id` is case sensitive.")

  public String getRefundId() {
    return refundId;
  }


  public void setRefundId(String refundId) {
    this.refundId = refundId;
  }


  public PaymentInitiationRefund amount(PaymentAmount amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "")

  public PaymentAmount getAmount() {
    return amount;
  }


  public void setAmount(PaymentAmount amount) {
    this.amount = amount;
  }


  public PaymentInitiationRefund status(PaymentInitiationRefundStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")

  public PaymentInitiationRefundStatus getStatus() {
    return status;
  }


  public void setStatus(PaymentInitiationRefundStatus status) {
    this.status = status;
  }


  public PaymentInitiationRefund lastStatusUpdate(OffsetDateTime lastStatusUpdate) {
    
    this.lastStatusUpdate = lastStatusUpdate;
    return this;
  }

   /**
   * The date and time of the last time the &#x60;status&#x60; was updated, in IS0 8601 format
   * @return lastStatusUpdate
  **/
  @ApiModelProperty(required = true, value = "The date and time of the last time the `status` was updated, in IS0 8601 format")

  public OffsetDateTime getLastStatusUpdate() {
    return lastStatusUpdate;
  }


  public void setLastStatusUpdate(OffsetDateTime lastStatusUpdate) {
    this.lastStatusUpdate = lastStatusUpdate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentInitiationRefund paymentInitiationRefund = (PaymentInitiationRefund) o;
    return Objects.equals(this.refundId, paymentInitiationRefund.refundId) &&
        Objects.equals(this.amount, paymentInitiationRefund.amount) &&
        Objects.equals(this.status, paymentInitiationRefund.status) &&
        Objects.equals(this.lastStatusUpdate, paymentInitiationRefund.lastStatusUpdate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refundId, amount, status, lastStatusUpdate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentInitiationRefund {\n");
    sb.append("    refundId: ").append(toIndentedString(refundId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    lastStatusUpdate: ").append(toIndentedString(lastStatusUpdate)).append("\n");
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

