/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.645.0
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
import java.time.OffsetDateTime;

/**
 * A repayment is created automatically after one or more guaranteed transactions receive a return. If there are multiple eligible returns in a day, they are batched together into a single repayment.  Repayments are sent over ACH, with funds typically available on the next banking day.
 */
@ApiModel(description = "A repayment is created automatically after one or more guaranteed transactions receive a return. If there are multiple eligible returns in a day, they are batched together into a single repayment.  Repayments are sent over ACH, with funds typically available on the next banking day.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-12T21:24:48.076128Z[Etc/UTC]")
public class TransferRepayment {
  public static final String SERIALIZED_NAME_REPAYMENT_ID = "repayment_id";
  @SerializedName(SERIALIZED_NAME_REPAYMENT_ID)
  private String repaymentId;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_ISO_CURRENCY_CODE = "iso_currency_code";
  @SerializedName(SERIALIZED_NAME_ISO_CURRENCY_CODE)
  private String isoCurrencyCode;


  public TransferRepayment repaymentId(String repaymentId) {
    
    this.repaymentId = repaymentId;
    return this;
  }

   /**
   * Identifier of the repayment.
   * @return repaymentId
  **/
  @ApiModelProperty(required = true, value = "Identifier of the repayment.")

  public String getRepaymentId() {
    return repaymentId;
  }


  public void setRepaymentId(String repaymentId) {
    this.repaymentId = repaymentId;
  }


  public TransferRepayment created(OffsetDateTime created) {
    
    this.created = created;
    return this;
  }

   /**
   * The datetime when the repayment occurred, in RFC 3339 format.
   * @return created
  **/
  @ApiModelProperty(required = true, value = "The datetime when the repayment occurred, in RFC 3339 format.")

  public OffsetDateTime getCreated() {
    return created;
  }


  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  public TransferRepayment amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Decimal amount of the repayment as it appears on your account ledger.
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "Decimal amount of the repayment as it appears on your account ledger.")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public TransferRepayment isoCurrencyCode(String isoCurrencyCode) {
    
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
    TransferRepayment transferRepayment = (TransferRepayment) o;
    return Objects.equals(this.repaymentId, transferRepayment.repaymentId) &&
        Objects.equals(this.created, transferRepayment.created) &&
        Objects.equals(this.amount, transferRepayment.amount) &&
        Objects.equals(this.isoCurrencyCode, transferRepayment.isoCurrencyCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(repaymentId, created, amount, isoCurrencyCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferRepayment {\n");
    sb.append("    repaymentId: ").append(toIndentedString(repaymentId)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
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

