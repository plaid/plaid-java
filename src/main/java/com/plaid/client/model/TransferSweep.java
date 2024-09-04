/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.555.0
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
import com.plaid.client.model.SweepStatus;
import com.plaid.client.model.SweepTrigger;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;
import java.time.OffsetDateTime;

/**
 * Describes a sweep of funds to / from the sweep account.  A sweep is associated with many sweep events (events of type &#x60;swept&#x60; or &#x60;return_swept&#x60;) which can be retrieved by invoking the &#x60;/transfer/event/list&#x60; endpoint with the corresponding &#x60;sweep_id&#x60;.  &#x60;swept&#x60; events occur when the transfer amount is credited or debited from your sweep account, depending on the &#x60;type&#x60; of the transfer. &#x60;return_swept&#x60; events occur when a transfer is returned and Plaid undoes the credit or debit.  The total sum of the &#x60;swept&#x60; and &#x60;return_swept&#x60; events is equal to the &#x60;amount&#x60; of the sweep Plaid creates and matches the amount of the entry on your sweep account ledger.
 */
@ApiModel(description = "Describes a sweep of funds to / from the sweep account.  A sweep is associated with many sweep events (events of type `swept` or `return_swept`) which can be retrieved by invoking the `/transfer/event/list` endpoint with the corresponding `sweep_id`.  `swept` events occur when the transfer amount is credited or debited from your sweep account, depending on the `type` of the transfer. `return_swept` events occur when a transfer is returned and Plaid undoes the credit or debit.  The total sum of the `swept` and `return_swept` events is equal to the `amount` of the sweep Plaid creates and matches the amount of the entry on your sweep account ledger.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-04T15:13:56.933796Z[Etc/UTC]")
public class TransferSweep {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_FUNDING_ACCOUNT_ID = "funding_account_id";
  @SerializedName(SERIALIZED_NAME_FUNDING_ACCOUNT_ID)
  private String fundingAccountId;

  public static final String SERIALIZED_NAME_LEDGER_ID = "ledger_id";
  @SerializedName(SERIALIZED_NAME_LEDGER_ID)
  private String ledgerId;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_ISO_CURRENCY_CODE = "iso_currency_code";
  @SerializedName(SERIALIZED_NAME_ISO_CURRENCY_CODE)
  private String isoCurrencyCode;

  public static final String SERIALIZED_NAME_SETTLED = "settled";
  @SerializedName(SERIALIZED_NAME_SETTLED)
  private LocalDate settled;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private SweepStatus status;

  public static final String SERIALIZED_NAME_TRIGGER = "trigger";
  @SerializedName(SERIALIZED_NAME_TRIGGER)
  private SweepTrigger trigger;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_NETWORK_TRACE_ID = "network_trace_id";
  @SerializedName(SERIALIZED_NAME_NETWORK_TRACE_ID)
  private String networkTraceId;


  public TransferSweep id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Identifier of the sweep.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Identifier of the sweep.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public TransferSweep fundingAccountId(String fundingAccountId) {
    
    this.fundingAccountId = fundingAccountId;
    return this;
  }

   /**
   * The id of the funding account to use, available in the Plaid Dashboard. This determines which of your business checking accounts will be credited or debited.
   * @return fundingAccountId
  **/
  @ApiModelProperty(required = true, value = "The id of the funding account to use, available in the Plaid Dashboard. This determines which of your business checking accounts will be credited or debited.")

  public String getFundingAccountId() {
    return fundingAccountId;
  }


  public void setFundingAccountId(String fundingAccountId) {
    this.fundingAccountId = fundingAccountId;
  }


  public TransferSweep ledgerId(String ledgerId) {
    
    this.ledgerId = ledgerId;
    return this;
  }

   /**
   * Plaid’s unique identifier for a Plaid Ledger Balance.
   * @return ledgerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Plaid’s unique identifier for a Plaid Ledger Balance.")

  public String getLedgerId() {
    return ledgerId;
  }


  public void setLedgerId(String ledgerId) {
    this.ledgerId = ledgerId;
  }


  public TransferSweep created(OffsetDateTime created) {
    
    this.created = created;
    return this;
  }

   /**
   * The datetime when the sweep occurred, in RFC 3339 format.
   * @return created
  **/
  @ApiModelProperty(required = true, value = "The datetime when the sweep occurred, in RFC 3339 format.")

  public OffsetDateTime getCreated() {
    return created;
  }


  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  public TransferSweep amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Signed decimal amount of the sweep as it appears on your sweep account ledger (e.g. \&quot;-10.00\&quot;)  If amount is not present, the sweep was net-settled to zero and outstanding debits and credits between the sweep account and Plaid are balanced.
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "Signed decimal amount of the sweep as it appears on your sweep account ledger (e.g. \"-10.00\")  If amount is not present, the sweep was net-settled to zero and outstanding debits and credits between the sweep account and Plaid are balanced.")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public TransferSweep isoCurrencyCode(String isoCurrencyCode) {
    
    this.isoCurrencyCode = isoCurrencyCode;
    return this;
  }

   /**
   * The currency of the sweep, e.g. \&quot;USD\&quot;.
   * @return isoCurrencyCode
  **/
  @ApiModelProperty(required = true, value = "The currency of the sweep, e.g. \"USD\".")

  public String getIsoCurrencyCode() {
    return isoCurrencyCode;
  }


  public void setIsoCurrencyCode(String isoCurrencyCode) {
    this.isoCurrencyCode = isoCurrencyCode;
  }


  public TransferSweep settled(LocalDate settled) {
    
    this.settled = settled;
    return this;
  }

   /**
   * The date when the sweep settled, in the YYYY-MM-DD format.
   * @return settled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The date when the sweep settled, in the YYYY-MM-DD format.")

  public LocalDate getSettled() {
    return settled;
  }


  public void setSettled(LocalDate settled) {
    this.settled = settled;
  }


  public TransferSweep status(SweepStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SweepStatus getStatus() {
    return status;
  }


  public void setStatus(SweepStatus status) {
    this.status = status;
  }


  public TransferSweep trigger(SweepTrigger trigger) {
    
    this.trigger = trigger;
    return this;
  }

   /**
   * Get trigger
   * @return trigger
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SweepTrigger getTrigger() {
    return trigger;
  }


  public void setTrigger(SweepTrigger trigger) {
    this.trigger = trigger;
  }


  public TransferSweep description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The description of the deposit that will be passed to the receiving bank (up to 10 characters). Note that banks utilize this field differently, and may or may not show it on the bank statement.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The description of the deposit that will be passed to the receiving bank (up to 10 characters). Note that banks utilize this field differently, and may or may not show it on the bank statement.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public TransferSweep networkTraceId(String networkTraceId) {
    
    this.networkTraceId = networkTraceId;
    return this;
  }

   /**
   * The trace identifier for the transfer based on its network. This will only be set after the transfer has posted.  For &#x60;ach&#x60; or &#x60;same-day-ach&#x60; transfers, this is the ACH trace number. For &#x60;rtp&#x60; transfers, this is the Transaction Identification number. For &#x60;wire&#x60; transfers, this is the IMAD (Input Message Accountability Data) number.
   * @return networkTraceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The trace identifier for the transfer based on its network. This will only be set after the transfer has posted.  For `ach` or `same-day-ach` transfers, this is the ACH trace number. For `rtp` transfers, this is the Transaction Identification number. For `wire` transfers, this is the IMAD (Input Message Accountability Data) number.")

  public String getNetworkTraceId() {
    return networkTraceId;
  }


  public void setNetworkTraceId(String networkTraceId) {
    this.networkTraceId = networkTraceId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferSweep transferSweep = (TransferSweep) o;
    return Objects.equals(this.id, transferSweep.id) &&
        Objects.equals(this.fundingAccountId, transferSweep.fundingAccountId) &&
        Objects.equals(this.ledgerId, transferSweep.ledgerId) &&
        Objects.equals(this.created, transferSweep.created) &&
        Objects.equals(this.amount, transferSweep.amount) &&
        Objects.equals(this.isoCurrencyCode, transferSweep.isoCurrencyCode) &&
        Objects.equals(this.settled, transferSweep.settled) &&
        Objects.equals(this.status, transferSweep.status) &&
        Objects.equals(this.trigger, transferSweep.trigger) &&
        Objects.equals(this.description, transferSweep.description) &&
        Objects.equals(this.networkTraceId, transferSweep.networkTraceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, fundingAccountId, ledgerId, created, amount, isoCurrencyCode, settled, status, trigger, description, networkTraceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferSweep {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    fundingAccountId: ").append(toIndentedString(fundingAccountId)).append("\n");
    sb.append("    ledgerId: ").append(toIndentedString(ledgerId)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    isoCurrencyCode: ").append(toIndentedString(isoCurrencyCode)).append("\n");
    sb.append("    settled: ").append(toIndentedString(settled)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    trigger: ").append(toIndentedString(trigger)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    networkTraceId: ").append(toIndentedString(networkTraceId)).append("\n");
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

