/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.503.5
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
 * Represents a return on a Guaranteed ACH transfer that is included in the specified repayment.
 */
@ApiModel(description = "Represents a return on a Guaranteed ACH transfer that is included in the specified repayment.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-28T19:43:00.996446Z[Etc/UTC]")
public class TransferRepaymentReturn {
  public static final String SERIALIZED_NAME_TRANSFER_ID = "transfer_id";
  @SerializedName(SERIALIZED_NAME_TRANSFER_ID)
  private String transferId;

  public static final String SERIALIZED_NAME_EVENT_ID = "event_id";
  @SerializedName(SERIALIZED_NAME_EVENT_ID)
  private Integer eventId;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_ISO_CURRENCY_CODE = "iso_currency_code";
  @SerializedName(SERIALIZED_NAME_ISO_CURRENCY_CODE)
  private String isoCurrencyCode;


  public TransferRepaymentReturn transferId(String transferId) {
    
    this.transferId = transferId;
    return this;
  }

   /**
   * The unique identifier of the guaranteed transfer that was returned.
   * @return transferId
  **/
  @ApiModelProperty(required = true, value = "The unique identifier of the guaranteed transfer that was returned.")

  public String getTransferId() {
    return transferId;
  }


  public void setTransferId(String transferId) {
    this.transferId = transferId;
  }


  public TransferRepaymentReturn eventId(Integer eventId) {
    
    this.eventId = eventId;
    return this;
  }

   /**
   * The unique identifier of the corresponding &#x60;returned&#x60; transfer event.
   * minimum: 0
   * @return eventId
  **/
  @ApiModelProperty(required = true, value = "The unique identifier of the corresponding `returned` transfer event.")

  public Integer getEventId() {
    return eventId;
  }


  public void setEventId(Integer eventId) {
    this.eventId = eventId;
  }


  public TransferRepaymentReturn amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The value of the returned transfer.
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "The value of the returned transfer.")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public TransferRepaymentReturn isoCurrencyCode(String isoCurrencyCode) {
    
    this.isoCurrencyCode = isoCurrencyCode;
    return this;
  }

   /**
   * The currency of the repayment, e.g. \&quot;USD\&quot;.
   * @return isoCurrencyCode
  **/
  @ApiModelProperty(required = true, value = "The currency of the repayment, e.g. \"USD\".")

  public String getIsoCurrencyCode() {
    return isoCurrencyCode;
  }


  public void setIsoCurrencyCode(String isoCurrencyCode) {
    this.isoCurrencyCode = isoCurrencyCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferRepaymentReturn transferRepaymentReturn = (TransferRepaymentReturn) o;
    return Objects.equals(this.transferId, transferRepaymentReturn.transferId) &&
        Objects.equals(this.eventId, transferRepaymentReturn.eventId) &&
        Objects.equals(this.amount, transferRepaymentReturn.amount) &&
        Objects.equals(this.isoCurrencyCode, transferRepaymentReturn.isoCurrencyCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transferId, eventId, amount, isoCurrencyCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferRepaymentReturn {\n");
    sb.append("    transferId: ").append(toIndentedString(transferId)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    isoCurrencyCode: ").append(toIndentedString(isoCurrencyCode)).append("\n");
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

