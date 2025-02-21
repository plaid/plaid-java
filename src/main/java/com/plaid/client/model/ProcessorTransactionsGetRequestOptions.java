/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.620.0
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
 * An optional object to be used with the request. If specified, &#x60;options&#x60; must not be &#x60;null&#x60;.
 */
@ApiModel(description = "An optional object to be used with the request. If specified, `options` must not be `null`.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-21T16:44:11.345889Z[Etc/UTC]")
public class ProcessorTransactionsGetRequestOptions {
  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private Integer count = 100;

  public static final String SERIALIZED_NAME_OFFSET = "offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  private Integer offset = 0;

  public static final String SERIALIZED_NAME_INCLUDE_ORIGINAL_DESCRIPTION = "include_original_description";
  @SerializedName(SERIALIZED_NAME_INCLUDE_ORIGINAL_DESCRIPTION)
  private Boolean includeOriginalDescription = false;

  public static final String SERIALIZED_NAME_INCLUDE_PERSONAL_FINANCE_CATEGORY_BETA = "include_personal_finance_category_beta";
  @SerializedName(SERIALIZED_NAME_INCLUDE_PERSONAL_FINANCE_CATEGORY_BETA)
  private Boolean includePersonalFinanceCategoryBeta = false;

  public static final String SERIALIZED_NAME_INCLUDE_PERSONAL_FINANCE_CATEGORY = "include_personal_finance_category";
  @SerializedName(SERIALIZED_NAME_INCLUDE_PERSONAL_FINANCE_CATEGORY)
  private Boolean includePersonalFinanceCategory = false;

  public static final String SERIALIZED_NAME_INCLUDE_LOGO_AND_COUNTERPARTY_BETA = "include_logo_and_counterparty_beta";
  @SerializedName(SERIALIZED_NAME_INCLUDE_LOGO_AND_COUNTERPARTY_BETA)
  private Boolean includeLogoAndCounterpartyBeta = false;


  public ProcessorTransactionsGetRequestOptions count(Integer count) {
    
    this.count = count;
    return this;
  }

   /**
   * The number of transactions to fetch.
   * minimum: 1
   * maximum: 500
   * @return count
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of transactions to fetch.")

  public Integer getCount() {
    return count;
  }


  public void setCount(Integer count) {
    this.count = count;
  }


  public ProcessorTransactionsGetRequestOptions offset(Integer offset) {
    
    this.offset = offset;
    return this;
  }

   /**
   * The number of transactions to skip. The default value is 0.
   * minimum: 0
   * @return offset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of transactions to skip. The default value is 0.")

  public Integer getOffset() {
    return offset;
  }


  public void setOffset(Integer offset) {
    this.offset = offset;
  }


  public ProcessorTransactionsGetRequestOptions includeOriginalDescription(Boolean includeOriginalDescription) {
    
    this.includeOriginalDescription = includeOriginalDescription;
    return this;
  }

   /**
   * Include the raw unparsed transaction description from the financial institution.
   * @return includeOriginalDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Include the raw unparsed transaction description from the financial institution.")

  public Boolean getIncludeOriginalDescription() {
    return includeOriginalDescription;
  }


  public void setIncludeOriginalDescription(Boolean includeOriginalDescription) {
    this.includeOriginalDescription = includeOriginalDescription;
  }


  public ProcessorTransactionsGetRequestOptions includePersonalFinanceCategoryBeta(Boolean includePersonalFinanceCategoryBeta) {
    
    this.includePersonalFinanceCategoryBeta = includePersonalFinanceCategoryBeta;
    return this;
  }

   /**
   * Personal finance categories are now returned by default.
   * @return includePersonalFinanceCategoryBeta
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Personal finance categories are now returned by default.")

  public Boolean getIncludePersonalFinanceCategoryBeta() {
    return includePersonalFinanceCategoryBeta;
  }


  public void setIncludePersonalFinanceCategoryBeta(Boolean includePersonalFinanceCategoryBeta) {
    this.includePersonalFinanceCategoryBeta = includePersonalFinanceCategoryBeta;
  }


  public ProcessorTransactionsGetRequestOptions includePersonalFinanceCategory(Boolean includePersonalFinanceCategory) {
    
    this.includePersonalFinanceCategory = includePersonalFinanceCategory;
    return this;
  }

   /**
   * Personal finance categories are now returned by default.
   * @return includePersonalFinanceCategory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Personal finance categories are now returned by default.")

  public Boolean getIncludePersonalFinanceCategory() {
    return includePersonalFinanceCategory;
  }


  public void setIncludePersonalFinanceCategory(Boolean includePersonalFinanceCategory) {
    this.includePersonalFinanceCategory = includePersonalFinanceCategory;
  }


  public ProcessorTransactionsGetRequestOptions includeLogoAndCounterpartyBeta(Boolean includeLogoAndCounterpartyBeta) {
    
    this.includeLogoAndCounterpartyBeta = includeLogoAndCounterpartyBeta;
    return this;
  }

   /**
   * Counterparties and extra merchant fields are now returned by default.
   * @return includeLogoAndCounterpartyBeta
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Counterparties and extra merchant fields are now returned by default.")

  public Boolean getIncludeLogoAndCounterpartyBeta() {
    return includeLogoAndCounterpartyBeta;
  }


  public void setIncludeLogoAndCounterpartyBeta(Boolean includeLogoAndCounterpartyBeta) {
    this.includeLogoAndCounterpartyBeta = includeLogoAndCounterpartyBeta;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessorTransactionsGetRequestOptions processorTransactionsGetRequestOptions = (ProcessorTransactionsGetRequestOptions) o;
    return Objects.equals(this.count, processorTransactionsGetRequestOptions.count) &&
        Objects.equals(this.offset, processorTransactionsGetRequestOptions.offset) &&
        Objects.equals(this.includeOriginalDescription, processorTransactionsGetRequestOptions.includeOriginalDescription) &&
        Objects.equals(this.includePersonalFinanceCategoryBeta, processorTransactionsGetRequestOptions.includePersonalFinanceCategoryBeta) &&
        Objects.equals(this.includePersonalFinanceCategory, processorTransactionsGetRequestOptions.includePersonalFinanceCategory) &&
        Objects.equals(this.includeLogoAndCounterpartyBeta, processorTransactionsGetRequestOptions.includeLogoAndCounterpartyBeta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, offset, includeOriginalDescription, includePersonalFinanceCategoryBeta, includePersonalFinanceCategory, includeLogoAndCounterpartyBeta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessorTransactionsGetRequestOptions {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    includeOriginalDescription: ").append(toIndentedString(includeOriginalDescription)).append("\n");
    sb.append("    includePersonalFinanceCategoryBeta: ").append(toIndentedString(includePersonalFinanceCategoryBeta)).append("\n");
    sb.append("    includePersonalFinanceCategory: ").append(toIndentedString(includePersonalFinanceCategory)).append("\n");
    sb.append("    includeLogoAndCounterpartyBeta: ").append(toIndentedString(includeLogoAndCounterpartyBeta)).append("\n");
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

