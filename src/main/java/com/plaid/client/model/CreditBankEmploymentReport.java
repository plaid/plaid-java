/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.379.0
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
import com.plaid.client.model.CreditBankEmploymentItem;
import com.plaid.client.model.CreditBankEmploymentWarning;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * The report of the Bank Employment data for an end user.
 */
@ApiModel(description = "The report of the Bank Employment data for an end user.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-20T21:31:59.039638Z[Etc/UTC]")
public class CreditBankEmploymentReport {
  public static final String SERIALIZED_NAME_BANK_EMPLOYMENT_REPORT_ID = "bank_employment_report_id";
  @SerializedName(SERIALIZED_NAME_BANK_EMPLOYMENT_REPORT_ID)
  private String bankEmploymentReportId;

  public static final String SERIALIZED_NAME_GENERATED_TIME = "generated_time";
  @SerializedName(SERIALIZED_NAME_GENERATED_TIME)
  private OffsetDateTime generatedTime;

  public static final String SERIALIZED_NAME_DAYS_REQUESTED = "days_requested";
  @SerializedName(SERIALIZED_NAME_DAYS_REQUESTED)
  private Integer daysRequested;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<CreditBankEmploymentItem> items = new ArrayList<>();

  public static final String SERIALIZED_NAME_WARNINGS = "warnings";
  @SerializedName(SERIALIZED_NAME_WARNINGS)
  private List<CreditBankEmploymentWarning> warnings = new ArrayList<>();


  public CreditBankEmploymentReport bankEmploymentReportId(String bankEmploymentReportId) {
    
    this.bankEmploymentReportId = bankEmploymentReportId;
    return this;
  }

   /**
   * The unique identifier associated with the Bank Employment Report.
   * @return bankEmploymentReportId
  **/
  @ApiModelProperty(required = true, value = "The unique identifier associated with the Bank Employment Report.")

  public String getBankEmploymentReportId() {
    return bankEmploymentReportId;
  }


  public void setBankEmploymentReportId(String bankEmploymentReportId) {
    this.bankEmploymentReportId = bankEmploymentReportId;
  }


  public CreditBankEmploymentReport generatedTime(OffsetDateTime generatedTime) {
    
    this.generatedTime = generatedTime;
    return this;
  }

   /**
   * The time when the Bank Employment Report was generated, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (e.g. \&quot;2018-04-12T03:32:11Z\&quot;).
   * @return generatedTime
  **/
  @ApiModelProperty(required = true, value = "The time when the Bank Employment Report was generated, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (e.g. \"2018-04-12T03:32:11Z\").")

  public OffsetDateTime getGeneratedTime() {
    return generatedTime;
  }


  public void setGeneratedTime(OffsetDateTime generatedTime) {
    this.generatedTime = generatedTime;
  }


  public CreditBankEmploymentReport daysRequested(Integer daysRequested) {
    
    this.daysRequested = daysRequested;
    return this;
  }

   /**
   * The number of days requested by the customer for the Bank Employment Report.
   * @return daysRequested
  **/
  @ApiModelProperty(required = true, value = "The number of days requested by the customer for the Bank Employment Report.")

  public Integer getDaysRequested() {
    return daysRequested;
  }


  public void setDaysRequested(Integer daysRequested) {
    this.daysRequested = daysRequested;
  }


  public CreditBankEmploymentReport items(List<CreditBankEmploymentItem> items) {
    
    this.items = items;
    return this;
  }

  public CreditBankEmploymentReport addItemsItem(CreditBankEmploymentItem itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * The list of Items in the report along with the associated metadata about the Item.
   * @return items
  **/
  @ApiModelProperty(required = true, value = "The list of Items in the report along with the associated metadata about the Item.")

  public List<CreditBankEmploymentItem> getItems() {
    return items;
  }


  public void setItems(List<CreditBankEmploymentItem> items) {
    this.items = items;
  }


  public CreditBankEmploymentReport warnings(List<CreditBankEmploymentWarning> warnings) {
    
    this.warnings = warnings;
    return this;
  }

  public CreditBankEmploymentReport addWarningsItem(CreditBankEmploymentWarning warningsItem) {
    this.warnings.add(warningsItem);
    return this;
  }

   /**
   * If data from the Bank Employment report was unable to be retrieved, the warnings will contain information about the error that caused the data to be incomplete.
   * @return warnings
  **/
  @ApiModelProperty(required = true, value = "If data from the Bank Employment report was unable to be retrieved, the warnings will contain information about the error that caused the data to be incomplete.")

  public List<CreditBankEmploymentWarning> getWarnings() {
    return warnings;
  }


  public void setWarnings(List<CreditBankEmploymentWarning> warnings) {
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
    CreditBankEmploymentReport creditBankEmploymentReport = (CreditBankEmploymentReport) o;
    return Objects.equals(this.bankEmploymentReportId, creditBankEmploymentReport.bankEmploymentReportId) &&
        Objects.equals(this.generatedTime, creditBankEmploymentReport.generatedTime) &&
        Objects.equals(this.daysRequested, creditBankEmploymentReport.daysRequested) &&
        Objects.equals(this.items, creditBankEmploymentReport.items) &&
        Objects.equals(this.warnings, creditBankEmploymentReport.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankEmploymentReportId, generatedTime, daysRequested, items, warnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditBankEmploymentReport {\n");
    sb.append("    bankEmploymentReportId: ").append(toIndentedString(bankEmploymentReportId)).append("\n");
    sb.append("    generatedTime: ").append(toIndentedString(generatedTime)).append("\n");
    sb.append("    daysRequested: ").append(toIndentedString(daysRequested)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

