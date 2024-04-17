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
import com.plaid.client.model.CreditSessionBankEmploymentResult;
import com.plaid.client.model.CreditSessionBankIncomeResult;
import com.plaid.client.model.CreditSessionDocumentIncomeResult;
import com.plaid.client.model.CreditSessionItemAddResult;
import com.plaid.client.model.CreditSessionPayrollIncomeResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * The set of results for a Link session.
 */
@ApiModel(description = "The set of results for a Link session.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-17T19:36:14.619905Z[Etc/UTC]")
public class CreditSessionResults {
  public static final String SERIALIZED_NAME_ITEM_ADD_RESULTS = "item_add_results";
  @SerializedName(SERIALIZED_NAME_ITEM_ADD_RESULTS)
  private List<CreditSessionItemAddResult> itemAddResults = null;

  public static final String SERIALIZED_NAME_BANK_INCOME_RESULTS = "bank_income_results";
  @SerializedName(SERIALIZED_NAME_BANK_INCOME_RESULTS)
  private List<CreditSessionBankIncomeResult> bankIncomeResults = null;

  public static final String SERIALIZED_NAME_BANK_EMPLOYMENT_RESULTS = "bank_employment_results";
  @SerializedName(SERIALIZED_NAME_BANK_EMPLOYMENT_RESULTS)
  private List<CreditSessionBankEmploymentResult> bankEmploymentResults = null;

  public static final String SERIALIZED_NAME_PAYROLL_INCOME_RESULTS = "payroll_income_results";
  @SerializedName(SERIALIZED_NAME_PAYROLL_INCOME_RESULTS)
  private List<CreditSessionPayrollIncomeResult> payrollIncomeResults = null;

  public static final String SERIALIZED_NAME_DOCUMENT_INCOME_RESULTS = "document_income_results";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_INCOME_RESULTS)
  private CreditSessionDocumentIncomeResult documentIncomeResults;


  public CreditSessionResults itemAddResults(List<CreditSessionItemAddResult> itemAddResults) {
    
    this.itemAddResults = itemAddResults;
    return this;
  }

  public CreditSessionResults addItemAddResultsItem(CreditSessionItemAddResult itemAddResultsItem) {
    if (this.itemAddResults == null) {
      this.itemAddResults = new ArrayList<>();
    }
    this.itemAddResults.add(itemAddResultsItem);
    return this;
  }

   /**
   * The set of Item adds for the Link session.
   * @return itemAddResults
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The set of Item adds for the Link session.")

  public List<CreditSessionItemAddResult> getItemAddResults() {
    return itemAddResults;
  }


  public void setItemAddResults(List<CreditSessionItemAddResult> itemAddResults) {
    this.itemAddResults = itemAddResults;
  }


  public CreditSessionResults bankIncomeResults(List<CreditSessionBankIncomeResult> bankIncomeResults) {
    
    this.bankIncomeResults = bankIncomeResults;
    return this;
  }

  public CreditSessionResults addBankIncomeResultsItem(CreditSessionBankIncomeResult bankIncomeResultsItem) {
    if (this.bankIncomeResults == null) {
      this.bankIncomeResults = new ArrayList<>();
    }
    this.bankIncomeResults.add(bankIncomeResultsItem);
    return this;
  }

   /**
   * The set of bank income verifications for the Link session.
   * @return bankIncomeResults
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The set of bank income verifications for the Link session.")

  public List<CreditSessionBankIncomeResult> getBankIncomeResults() {
    return bankIncomeResults;
  }


  public void setBankIncomeResults(List<CreditSessionBankIncomeResult> bankIncomeResults) {
    this.bankIncomeResults = bankIncomeResults;
  }


  public CreditSessionResults bankEmploymentResults(List<CreditSessionBankEmploymentResult> bankEmploymentResults) {
    
    this.bankEmploymentResults = bankEmploymentResults;
    return this;
  }

  public CreditSessionResults addBankEmploymentResultsItem(CreditSessionBankEmploymentResult bankEmploymentResultsItem) {
    if (this.bankEmploymentResults == null) {
      this.bankEmploymentResults = new ArrayList<>();
    }
    this.bankEmploymentResults.add(bankEmploymentResultsItem);
    return this;
  }

   /**
   * The set of bank employment verifications for the Link session.
   * @return bankEmploymentResults
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The set of bank employment verifications for the Link session.")

  public List<CreditSessionBankEmploymentResult> getBankEmploymentResults() {
    return bankEmploymentResults;
  }


  public void setBankEmploymentResults(List<CreditSessionBankEmploymentResult> bankEmploymentResults) {
    this.bankEmploymentResults = bankEmploymentResults;
  }


  public CreditSessionResults payrollIncomeResults(List<CreditSessionPayrollIncomeResult> payrollIncomeResults) {
    
    this.payrollIncomeResults = payrollIncomeResults;
    return this;
  }

  public CreditSessionResults addPayrollIncomeResultsItem(CreditSessionPayrollIncomeResult payrollIncomeResultsItem) {
    if (this.payrollIncomeResults == null) {
      this.payrollIncomeResults = new ArrayList<>();
    }
    this.payrollIncomeResults.add(payrollIncomeResultsItem);
    return this;
  }

   /**
   * The set of payroll income verifications for the Link session.
   * @return payrollIncomeResults
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The set of payroll income verifications for the Link session.")

  public List<CreditSessionPayrollIncomeResult> getPayrollIncomeResults() {
    return payrollIncomeResults;
  }


  public void setPayrollIncomeResults(List<CreditSessionPayrollIncomeResult> payrollIncomeResults) {
    this.payrollIncomeResults = payrollIncomeResults;
  }


  public CreditSessionResults documentIncomeResults(CreditSessionDocumentIncomeResult documentIncomeResults) {
    
    this.documentIncomeResults = documentIncomeResults;
    return this;
  }

   /**
   * Get documentIncomeResults
   * @return documentIncomeResults
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CreditSessionDocumentIncomeResult getDocumentIncomeResults() {
    return documentIncomeResults;
  }


  public void setDocumentIncomeResults(CreditSessionDocumentIncomeResult documentIncomeResults) {
    this.documentIncomeResults = documentIncomeResults;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditSessionResults creditSessionResults = (CreditSessionResults) o;
    return Objects.equals(this.itemAddResults, creditSessionResults.itemAddResults) &&
        Objects.equals(this.bankIncomeResults, creditSessionResults.bankIncomeResults) &&
        Objects.equals(this.bankEmploymentResults, creditSessionResults.bankEmploymentResults) &&
        Objects.equals(this.payrollIncomeResults, creditSessionResults.payrollIncomeResults) &&
        Objects.equals(this.documentIncomeResults, creditSessionResults.documentIncomeResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemAddResults, bankIncomeResults, bankEmploymentResults, payrollIncomeResults, documentIncomeResults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditSessionResults {\n");
    sb.append("    itemAddResults: ").append(toIndentedString(itemAddResults)).append("\n");
    sb.append("    bankIncomeResults: ").append(toIndentedString(bankIncomeResults)).append("\n");
    sb.append("    bankEmploymentResults: ").append(toIndentedString(bankEmploymentResults)).append("\n");
    sb.append("    payrollIncomeResults: ").append(toIndentedString(payrollIncomeResults)).append("\n");
    sb.append("    documentIncomeResults: ").append(toIndentedString(documentIncomeResults)).append("\n");
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

