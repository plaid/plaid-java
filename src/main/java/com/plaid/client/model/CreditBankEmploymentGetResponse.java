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
import com.plaid.client.model.CreditBankEmploymentReport;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * CreditBankEmploymentGetResponse defines the response schema for &#x60;/beta/credit/v1/bank_employment/get&#x60;.
 */
@ApiModel(description = "CreditBankEmploymentGetResponse defines the response schema for `/beta/credit/v1/bank_employment/get`.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-28T19:43:00.996446Z[Etc/UTC]")
public class CreditBankEmploymentGetResponse {
  public static final String SERIALIZED_NAME_BANK_EMPLOYMENT_REPORTS = "bank_employment_reports";
  @SerializedName(SERIALIZED_NAME_BANK_EMPLOYMENT_REPORTS)
  private List<CreditBankEmploymentReport> bankEmploymentReports = new ArrayList<>();

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;


  public CreditBankEmploymentGetResponse bankEmploymentReports(List<CreditBankEmploymentReport> bankEmploymentReports) {
    
    this.bankEmploymentReports = bankEmploymentReports;
    return this;
  }

  public CreditBankEmploymentGetResponse addBankEmploymentReportsItem(CreditBankEmploymentReport bankEmploymentReportsItem) {
    this.bankEmploymentReports.add(bankEmploymentReportsItem);
    return this;
  }

   /**
   * Bank Employment data. Each entry in the array will be a distinct bank employment report.
   * @return bankEmploymentReports
  **/
  @ApiModelProperty(required = true, value = "Bank Employment data. Each entry in the array will be a distinct bank employment report.")

  public List<CreditBankEmploymentReport> getBankEmploymentReports() {
    return bankEmploymentReports;
  }


  public void setBankEmploymentReports(List<CreditBankEmploymentReport> bankEmploymentReports) {
    this.bankEmploymentReports = bankEmploymentReports;
  }


  public CreditBankEmploymentGetResponse requestId(String requestId) {
    
    this.requestId = requestId;
    return this;
  }

   /**
   * A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive.
   * @return requestId
  **/
  @ApiModelProperty(required = true, value = "A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive.")

  public String getRequestId() {
    return requestId;
  }


  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditBankEmploymentGetResponse creditBankEmploymentGetResponse = (CreditBankEmploymentGetResponse) o;
    return Objects.equals(this.bankEmploymentReports, creditBankEmploymentGetResponse.bankEmploymentReports) &&
        Objects.equals(this.requestId, creditBankEmploymentGetResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankEmploymentReports, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditBankEmploymentGetResponse {\n");
    sb.append("    bankEmploymentReports: ").append(toIndentedString(bankEmploymentReports)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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

