/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.556.0
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
import com.plaid.client.model.CraBankIncomeItem;
import com.plaid.client.model.CraBankIncomeSummary;
import com.plaid.client.model.CraBankIncomeWarning;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * The Check Income Insights Report for an end user.
 */
@ApiModel(description = "The Check Income Insights Report for an end user.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-04T20:03:42.500463Z[Etc/UTC]")
public class CraIncomeInsights {
  public static final String SERIALIZED_NAME_REPORT_ID = "report_id";
  @SerializedName(SERIALIZED_NAME_REPORT_ID)
  private String reportId;

  public static final String SERIALIZED_NAME_GENERATED_TIME = "generated_time";
  @SerializedName(SERIALIZED_NAME_GENERATED_TIME)
  private OffsetDateTime generatedTime;

  public static final String SERIALIZED_NAME_DAYS_REQUESTED = "days_requested";
  @SerializedName(SERIALIZED_NAME_DAYS_REQUESTED)
  private Integer daysRequested;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<CraBankIncomeItem> items = null;

  public static final String SERIALIZED_NAME_BANK_INCOME_SUMMARY = "bank_income_summary";
  @SerializedName(SERIALIZED_NAME_BANK_INCOME_SUMMARY)
  private CraBankIncomeSummary bankIncomeSummary;

  public static final String SERIALIZED_NAME_WARNINGS = "warnings";
  @SerializedName(SERIALIZED_NAME_WARNINGS)
  private List<CraBankIncomeWarning> warnings = null;


  public CraIncomeInsights reportId(String reportId) {
    
    this.reportId = reportId;
    return this;
  }

   /**
   * The unique identifier associated with the Check Income Insights Report.
   * @return reportId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique identifier associated with the Check Income Insights Report.")

  public String getReportId() {
    return reportId;
  }


  public void setReportId(String reportId) {
    this.reportId = reportId;
  }


  public CraIncomeInsights generatedTime(OffsetDateTime generatedTime) {
    
    this.generatedTime = generatedTime;
    return this;
  }

   /**
   * The time when the Check Income Insights Report was generated.
   * @return generatedTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The time when the Check Income Insights Report was generated.")

  public OffsetDateTime getGeneratedTime() {
    return generatedTime;
  }


  public void setGeneratedTime(OffsetDateTime generatedTime) {
    this.generatedTime = generatedTime;
  }


  public CraIncomeInsights daysRequested(Integer daysRequested) {
    
    this.daysRequested = daysRequested;
    return this;
  }

   /**
   * The number of days requested by the customer for the Check Income Insights Report.
   * @return daysRequested
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of days requested by the customer for the Check Income Insights Report.")

  public Integer getDaysRequested() {
    return daysRequested;
  }


  public void setDaysRequested(Integer daysRequested) {
    this.daysRequested = daysRequested;
  }


  public CraIncomeInsights items(List<CraBankIncomeItem> items) {
    
    this.items = items;
    return this;
  }

  public CraIncomeInsights addItemsItem(CraBankIncomeItem itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * The list of Items in the report along with the associated metadata about the Item.
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list of Items in the report along with the associated metadata about the Item.")

  public List<CraBankIncomeItem> getItems() {
    return items;
  }


  public void setItems(List<CraBankIncomeItem> items) {
    this.items = items;
  }


  public CraIncomeInsights bankIncomeSummary(CraBankIncomeSummary bankIncomeSummary) {
    
    this.bankIncomeSummary = bankIncomeSummary;
    return this;
  }

   /**
   * Get bankIncomeSummary
   * @return bankIncomeSummary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CraBankIncomeSummary getBankIncomeSummary() {
    return bankIncomeSummary;
  }


  public void setBankIncomeSummary(CraBankIncomeSummary bankIncomeSummary) {
    this.bankIncomeSummary = bankIncomeSummary;
  }


  public CraIncomeInsights warnings(List<CraBankIncomeWarning> warnings) {
    
    this.warnings = warnings;
    return this;
  }

  public CraIncomeInsights addWarningsItem(CraBankIncomeWarning warningsItem) {
    if (this.warnings == null) {
      this.warnings = new ArrayList<>();
    }
    this.warnings.add(warningsItem);
    return this;
  }

   /**
   * If data from the report was unable to be retrieved, the warnings object will contain information about the error that caused the data to be incomplete.
   * @return warnings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If data from the report was unable to be retrieved, the warnings object will contain information about the error that caused the data to be incomplete.")

  public List<CraBankIncomeWarning> getWarnings() {
    return warnings;
  }


  public void setWarnings(List<CraBankIncomeWarning> warnings) {
    this.warnings = warnings;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CraIncomeInsights craIncomeInsights = (CraIncomeInsights) o;
    return Objects.equals(this.reportId, craIncomeInsights.reportId) &&
        Objects.equals(this.generatedTime, craIncomeInsights.generatedTime) &&
        Objects.equals(this.daysRequested, craIncomeInsights.daysRequested) &&
        Objects.equals(this.items, craIncomeInsights.items) &&
        Objects.equals(this.bankIncomeSummary, craIncomeInsights.bankIncomeSummary) &&
        Objects.equals(this.warnings, craIncomeInsights.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportId, generatedTime, daysRequested, items, bankIncomeSummary, warnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CraIncomeInsights {\n");
    sb.append("    reportId: ").append(toIndentedString(reportId)).append("\n");
    sb.append("    generatedTime: ").append(toIndentedString(generatedTime)).append("\n");
    sb.append("    daysRequested: ").append(toIndentedString(daysRequested)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    bankIncomeSummary: ").append(toIndentedString(bankIncomeSummary)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
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

