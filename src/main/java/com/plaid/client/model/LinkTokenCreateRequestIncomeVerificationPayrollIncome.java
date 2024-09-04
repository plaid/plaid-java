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
import com.plaid.client.model.IncomeVerificationDocParsingConfig;
import com.plaid.client.model.IncomeVerificationPayrollFlowType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Specifies options for initializing Link for use with Payroll Income (including Document Income). Further customization options for Document Income, such as customizing which document types may be uploaded, are also available via the [Link Customization pane](https://dashboard.plaid.com/link) in the Dashboard. (Requires Production enablement.)
 */
@ApiModel(description = "Specifies options for initializing Link for use with Payroll Income (including Document Income). Further customization options for Document Income, such as customizing which document types may be uploaded, are also available via the [Link Customization pane](https://dashboard.plaid.com/link) in the Dashboard. (Requires Production enablement.)")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-04T15:13:56.933796Z[Etc/UTC]")
public class LinkTokenCreateRequestIncomeVerificationPayrollIncome {
  public static final String SERIALIZED_NAME_FLOW_TYPES = "flow_types";
  @SerializedName(SERIALIZED_NAME_FLOW_TYPES)
  private List<IncomeVerificationPayrollFlowType> flowTypes = null;

  public static final String SERIALIZED_NAME_IS_UPDATE_MODE = "is_update_mode";
  @SerializedName(SERIALIZED_NAME_IS_UPDATE_MODE)
  private Boolean isUpdateMode = false;

  public static final String SERIALIZED_NAME_ITEM_ID_TO_UPDATE = "item_id_to_update";
  @SerializedName(SERIALIZED_NAME_ITEM_ID_TO_UPDATE)
  private String itemIdToUpdate;

  public static final String SERIALIZED_NAME_PARSING_CONFIG = "parsing_config";
  @SerializedName(SERIALIZED_NAME_PARSING_CONFIG)
  private List<IncomeVerificationDocParsingConfig> parsingConfig = null;


  public LinkTokenCreateRequestIncomeVerificationPayrollIncome flowTypes(List<IncomeVerificationPayrollFlowType> flowTypes) {
    
    this.flowTypes = flowTypes;
    return this;
  }

  public LinkTokenCreateRequestIncomeVerificationPayrollIncome addFlowTypesItem(IncomeVerificationPayrollFlowType flowTypesItem) {
    if (this.flowTypes == null) {
      this.flowTypes = new ArrayList<>();
    }
    this.flowTypes.add(flowTypesItem);
    return this;
  }

   /**
   * The types of payroll income verification to enable for the Link session. If none are specified, then users will see both document and digital payroll income.
   * @return flowTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The types of payroll income verification to enable for the Link session. If none are specified, then users will see both document and digital payroll income.")

  public List<IncomeVerificationPayrollFlowType> getFlowTypes() {
    return flowTypes;
  }


  public void setFlowTypes(List<IncomeVerificationPayrollFlowType> flowTypes) {
    this.flowTypes = flowTypes;
  }


  public LinkTokenCreateRequestIncomeVerificationPayrollIncome isUpdateMode(Boolean isUpdateMode) {
    
    this.isUpdateMode = isUpdateMode;
    return this;
  }

   /**
   * An identifier to indicate whether the income verification Link token will be used for update mode. This field is only relevant for participants in the Payroll Income Refresh beta.
   * @return isUpdateMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An identifier to indicate whether the income verification Link token will be used for update mode. This field is only relevant for participants in the Payroll Income Refresh beta.")

  public Boolean getIsUpdateMode() {
    return isUpdateMode;
  }


  public void setIsUpdateMode(Boolean isUpdateMode) {
    this.isUpdateMode = isUpdateMode;
  }


  public LinkTokenCreateRequestIncomeVerificationPayrollIncome itemIdToUpdate(String itemIdToUpdate) {
    
    this.itemIdToUpdate = itemIdToUpdate;
    return this;
  }

   /**
   * Uniquely identify a payroll income Item to update with.  This field is only relevant for participants in the Payroll Income Refresh beta.
   * @return itemIdToUpdate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Uniquely identify a payroll income Item to update with.  This field is only relevant for participants in the Payroll Income Refresh beta.")

  public String getItemIdToUpdate() {
    return itemIdToUpdate;
  }


  public void setItemIdToUpdate(String itemIdToUpdate) {
    this.itemIdToUpdate = itemIdToUpdate;
  }


  public LinkTokenCreateRequestIncomeVerificationPayrollIncome parsingConfig(List<IncomeVerificationDocParsingConfig> parsingConfig) {
    
    this.parsingConfig = parsingConfig;
    return this;
  }

  public LinkTokenCreateRequestIncomeVerificationPayrollIncome addParsingConfigItem(IncomeVerificationDocParsingConfig parsingConfigItem) {
    if (this.parsingConfig == null) {
      this.parsingConfig = new ArrayList<>();
    }
    this.parsingConfig.add(parsingConfigItem);
    return this;
  }

   /**
   * The types of analysis to enable for document uploads. If this field is not provided, then docs will undergo OCR parsing only.
   * @return parsingConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The types of analysis to enable for document uploads. If this field is not provided, then docs will undergo OCR parsing only.")

  public List<IncomeVerificationDocParsingConfig> getParsingConfig() {
    return parsingConfig;
  }


  public void setParsingConfig(List<IncomeVerificationDocParsingConfig> parsingConfig) {
    this.parsingConfig = parsingConfig;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkTokenCreateRequestIncomeVerificationPayrollIncome linkTokenCreateRequestIncomeVerificationPayrollIncome = (LinkTokenCreateRequestIncomeVerificationPayrollIncome) o;
    return Objects.equals(this.flowTypes, linkTokenCreateRequestIncomeVerificationPayrollIncome.flowTypes) &&
        Objects.equals(this.isUpdateMode, linkTokenCreateRequestIncomeVerificationPayrollIncome.isUpdateMode) &&
        Objects.equals(this.itemIdToUpdate, linkTokenCreateRequestIncomeVerificationPayrollIncome.itemIdToUpdate) &&
        Objects.equals(this.parsingConfig, linkTokenCreateRequestIncomeVerificationPayrollIncome.parsingConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flowTypes, isUpdateMode, itemIdToUpdate, parsingConfig);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkTokenCreateRequestIncomeVerificationPayrollIncome {\n");
    sb.append("    flowTypes: ").append(toIndentedString(flowTypes)).append("\n");
    sb.append("    isUpdateMode: ").append(toIndentedString(isUpdateMode)).append("\n");
    sb.append("    itemIdToUpdate: ").append(toIndentedString(itemIdToUpdate)).append("\n");
    sb.append("    parsingConfig: ").append(toIndentedString(parsingConfig)).append("\n");
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

