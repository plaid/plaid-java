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
import com.plaid.client.model.RecurringTransactionFrequency;
import com.plaid.client.model.TransactionStreamAmount;
import com.plaid.client.model.TransactionStreamStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Insights object for recurring transactions streams.
 */
@ApiModel(description = "Insights object for recurring transactions streams.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-23T18:11:57.813484Z[Etc/UTC]")
public class RecurringInsightsStream {
  public static final String SERIALIZED_NAME_STREAM_ID = "stream_id";
  @SerializedName(SERIALIZED_NAME_STREAM_ID)
  private String streamId;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_MERCHANT_NAME = "merchant_name";
  @SerializedName(SERIALIZED_NAME_MERCHANT_NAME)
  private String merchantName;

  public static final String SERIALIZED_NAME_OLDEST_TRANSACTION_DATE = "oldest_transaction_date";
  @SerializedName(SERIALIZED_NAME_OLDEST_TRANSACTION_DATE)
  private LocalDate oldestTransactionDate;

  public static final String SERIALIZED_NAME_NEWEST_TRANSACTION_DATE = "newest_transaction_date";
  @SerializedName(SERIALIZED_NAME_NEWEST_TRANSACTION_DATE)
  private LocalDate newestTransactionDate;

  public static final String SERIALIZED_NAME_AVERAGE_DAYS_APART = "average_days_apart";
  @SerializedName(SERIALIZED_NAME_AVERAGE_DAYS_APART)
  private Double averageDaysApart;

  public static final String SERIALIZED_NAME_FREQUENCY = "frequency";
  @SerializedName(SERIALIZED_NAME_FREQUENCY)
  private RecurringTransactionFrequency frequency;

  public static final String SERIALIZED_NAME_TRANSACTION_COUNT = "transaction_count";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_COUNT)
  private Integer transactionCount;

  public static final String SERIALIZED_NAME_TRANSACTION_IDS = "transaction_ids";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_IDS)
  private List<String> transactionIds = null;

  public static final String SERIALIZED_NAME_AVERAGE_AMOUNT = "average_amount";
  @SerializedName(SERIALIZED_NAME_AVERAGE_AMOUNT)
  private TransactionStreamAmount averageAmount;

  public static final String SERIALIZED_NAME_NEWEST_TRANSACTION_AMOUNT = "newest_transaction_amount";
  @SerializedName(SERIALIZED_NAME_NEWEST_TRANSACTION_AMOUNT)
  private TransactionStreamAmount newestTransactionAmount;

  public static final String SERIALIZED_NAME_IS_ACTIVE = "is_active";
  @SerializedName(SERIALIZED_NAME_IS_ACTIVE)
  private Boolean isActive;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private TransactionStreamStatus status;

  public static final String SERIALIZED_NAME_PERSONAL_FINANCE_CATEGORY_PRIMARY = "personal_finance_category_primary";
  @SerializedName(SERIALIZED_NAME_PERSONAL_FINANCE_CATEGORY_PRIMARY)
  private String personalFinanceCategoryPrimary;

  public static final String SERIALIZED_NAME_PERSONAL_FINANCE_CATEGORY_DETAILED = "personal_finance_category_detailed";
  @SerializedName(SERIALIZED_NAME_PERSONAL_FINANCE_CATEGORY_DETAILED)
  private String personalFinanceCategoryDetailed;


  public RecurringInsightsStream streamId(String streamId) {
    
    this.streamId = streamId;
    return this;
  }

   /**
   * A unique id for the stream.
   * @return streamId
  **/
  @ApiModelProperty(required = true, value = "A unique id for the stream.")

  public String getStreamId() {
    return streamId;
  }


  public void setStreamId(String streamId) {
    this.streamId = streamId;
  }


  public RecurringInsightsStream description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The client-provided raw description of the most recent transaction in the stream.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The client-provided raw description of the most recent transaction in the stream.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public RecurringInsightsStream merchantName(String merchantName) {
    
    this.merchantName = merchantName;
    return this;
  }

   /**
   * The merchant or primary counterparty associated with the transaction stream.
   * @return merchantName
  **/
  @ApiModelProperty(required = true, value = "The merchant or primary counterparty associated with the transaction stream.")

  public String getMerchantName() {
    return merchantName;
  }


  public void setMerchantName(String merchantName) {
    this.merchantName = merchantName;
  }


  public RecurringInsightsStream oldestTransactionDate(LocalDate oldestTransactionDate) {
    
    this.oldestTransactionDate = oldestTransactionDate;
    return this;
  }

   /**
   * The posted date of the earliest transaction in the stream.
   * @return oldestTransactionDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The posted date of the earliest transaction in the stream.")

  public LocalDate getOldestTransactionDate() {
    return oldestTransactionDate;
  }


  public void setOldestTransactionDate(LocalDate oldestTransactionDate) {
    this.oldestTransactionDate = oldestTransactionDate;
  }


  public RecurringInsightsStream newestTransactionDate(LocalDate newestTransactionDate) {
    
    this.newestTransactionDate = newestTransactionDate;
    return this;
  }

   /**
   * The posted date of the latest transaction in the stream.
   * @return newestTransactionDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The posted date of the latest transaction in the stream.")

  public LocalDate getNewestTransactionDate() {
    return newestTransactionDate;
  }


  public void setNewestTransactionDate(LocalDate newestTransactionDate) {
    this.newestTransactionDate = newestTransactionDate;
  }


  public RecurringInsightsStream averageDaysApart(Double averageDaysApart) {
    
    this.averageDaysApart = averageDaysApart;
    return this;
  }

   /**
   * The average number of days between each of the recurring transactions.
   * @return averageDaysApart
  **/
  @ApiModelProperty(required = true, value = "The average number of days between each of the recurring transactions.")

  public Double getAverageDaysApart() {
    return averageDaysApart;
  }


  public void setAverageDaysApart(Double averageDaysApart) {
    this.averageDaysApart = averageDaysApart;
  }


  public RecurringInsightsStream frequency(RecurringTransactionFrequency frequency) {
    
    this.frequency = frequency;
    return this;
  }

   /**
   * Get frequency
   * @return frequency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RecurringTransactionFrequency getFrequency() {
    return frequency;
  }


  public void setFrequency(RecurringTransactionFrequency frequency) {
    this.frequency = frequency;
  }


  public RecurringInsightsStream transactionCount(Integer transactionCount) {
    
    this.transactionCount = transactionCount;
    return this;
  }

   /**
   * The number of transactions in this stream.
   * @return transactionCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of transactions in this stream.")

  public Integer getTransactionCount() {
    return transactionCount;
  }


  public void setTransactionCount(Integer transactionCount) {
    this.transactionCount = transactionCount;
  }


  public RecurringInsightsStream transactionIds(List<String> transactionIds) {
    
    this.transactionIds = transactionIds;
    return this;
  }

  public RecurringInsightsStream addTransactionIdsItem(String transactionIdsItem) {
    if (this.transactionIds == null) {
      this.transactionIds = new ArrayList<>();
    }
    this.transactionIds.add(transactionIdsItem);
    return this;
  }

   /**
   * An array of Plaid transaction IDs belonging to the stream, sorted by posted date.
   * @return transactionIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of Plaid transaction IDs belonging to the stream, sorted by posted date.")

  public List<String> getTransactionIds() {
    return transactionIds;
  }


  public void setTransactionIds(List<String> transactionIds) {
    this.transactionIds = transactionIds;
  }


  public RecurringInsightsStream averageAmount(TransactionStreamAmount averageAmount) {
    
    this.averageAmount = averageAmount;
    return this;
  }

   /**
   * Get averageAmount
   * @return averageAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TransactionStreamAmount getAverageAmount() {
    return averageAmount;
  }


  public void setAverageAmount(TransactionStreamAmount averageAmount) {
    this.averageAmount = averageAmount;
  }


  public RecurringInsightsStream newestTransactionAmount(TransactionStreamAmount newestTransactionAmount) {
    
    this.newestTransactionAmount = newestTransactionAmount;
    return this;
  }

   /**
   * Get newestTransactionAmount
   * @return newestTransactionAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TransactionStreamAmount getNewestTransactionAmount() {
    return newestTransactionAmount;
  }


  public void setNewestTransactionAmount(TransactionStreamAmount newestTransactionAmount) {
    this.newestTransactionAmount = newestTransactionAmount;
  }


  public RecurringInsightsStream isActive(Boolean isActive) {
    
    this.isActive = isActive;
    return this;
  }

   /**
   * Indicates whether the transaction stream is still live.
   * @return isActive
  **/
  @ApiModelProperty(required = true, value = "Indicates whether the transaction stream is still live.")

  public Boolean getIsActive() {
    return isActive;
  }


  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }


  public RecurringInsightsStream status(TransactionStreamStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TransactionStreamStatus getStatus() {
    return status;
  }


  public void setStatus(TransactionStreamStatus status) {
    this.status = status;
  }


  public RecurringInsightsStream personalFinanceCategoryPrimary(String personalFinanceCategoryPrimary) {
    
    this.personalFinanceCategoryPrimary = personalFinanceCategoryPrimary;
    return this;
  }

   /**
   * The primary category associated with the transaction stream.
   * @return personalFinanceCategoryPrimary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The primary category associated with the transaction stream.")

  public String getPersonalFinanceCategoryPrimary() {
    return personalFinanceCategoryPrimary;
  }


  public void setPersonalFinanceCategoryPrimary(String personalFinanceCategoryPrimary) {
    this.personalFinanceCategoryPrimary = personalFinanceCategoryPrimary;
  }


  public RecurringInsightsStream personalFinanceCategoryDetailed(String personalFinanceCategoryDetailed) {
    
    this.personalFinanceCategoryDetailed = personalFinanceCategoryDetailed;
    return this;
  }

   /**
   * The detailed category associated with the transaction stream.
   * @return personalFinanceCategoryDetailed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The detailed category associated with the transaction stream.")

  public String getPersonalFinanceCategoryDetailed() {
    return personalFinanceCategoryDetailed;
  }


  public void setPersonalFinanceCategoryDetailed(String personalFinanceCategoryDetailed) {
    this.personalFinanceCategoryDetailed = personalFinanceCategoryDetailed;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecurringInsightsStream recurringInsightsStream = (RecurringInsightsStream) o;
    return Objects.equals(this.streamId, recurringInsightsStream.streamId) &&
        Objects.equals(this.description, recurringInsightsStream.description) &&
        Objects.equals(this.merchantName, recurringInsightsStream.merchantName) &&
        Objects.equals(this.oldestTransactionDate, recurringInsightsStream.oldestTransactionDate) &&
        Objects.equals(this.newestTransactionDate, recurringInsightsStream.newestTransactionDate) &&
        Objects.equals(this.averageDaysApart, recurringInsightsStream.averageDaysApart) &&
        Objects.equals(this.frequency, recurringInsightsStream.frequency) &&
        Objects.equals(this.transactionCount, recurringInsightsStream.transactionCount) &&
        Objects.equals(this.transactionIds, recurringInsightsStream.transactionIds) &&
        Objects.equals(this.averageAmount, recurringInsightsStream.averageAmount) &&
        Objects.equals(this.newestTransactionAmount, recurringInsightsStream.newestTransactionAmount) &&
        Objects.equals(this.isActive, recurringInsightsStream.isActive) &&
        Objects.equals(this.status, recurringInsightsStream.status) &&
        Objects.equals(this.personalFinanceCategoryPrimary, recurringInsightsStream.personalFinanceCategoryPrimary) &&
        Objects.equals(this.personalFinanceCategoryDetailed, recurringInsightsStream.personalFinanceCategoryDetailed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(streamId, description, merchantName, oldestTransactionDate, newestTransactionDate, averageDaysApart, frequency, transactionCount, transactionIds, averageAmount, newestTransactionAmount, isActive, status, personalFinanceCategoryPrimary, personalFinanceCategoryDetailed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecurringInsightsStream {\n");
    sb.append("    streamId: ").append(toIndentedString(streamId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    merchantName: ").append(toIndentedString(merchantName)).append("\n");
    sb.append("    oldestTransactionDate: ").append(toIndentedString(oldestTransactionDate)).append("\n");
    sb.append("    newestTransactionDate: ").append(toIndentedString(newestTransactionDate)).append("\n");
    sb.append("    averageDaysApart: ").append(toIndentedString(averageDaysApart)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    transactionCount: ").append(toIndentedString(transactionCount)).append("\n");
    sb.append("    transactionIds: ").append(toIndentedString(transactionIds)).append("\n");
    sb.append("    averageAmount: ").append(toIndentedString(averageAmount)).append("\n");
    sb.append("    newestTransactionAmount: ").append(toIndentedString(newestTransactionAmount)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    personalFinanceCategoryPrimary: ").append(toIndentedString(personalFinanceCategoryPrimary)).append("\n");
    sb.append("    personalFinanceCategoryDetailed: ").append(toIndentedString(personalFinanceCategoryDetailed)).append("\n");
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

