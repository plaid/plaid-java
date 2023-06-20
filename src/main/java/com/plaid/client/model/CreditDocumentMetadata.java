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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Object representing metadata pertaining to the document.
 */
@ApiModel(description = "Object representing metadata pertaining to the document.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-20T21:31:59.039638Z[Etc/UTC]")
public class CreditDocumentMetadata {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DOCUMENT_TYPE = "document_type";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_TYPE)
  private String documentType;

  public static final String SERIALIZED_NAME_DOWNLOAD_URL = "download_url";
  @SerializedName(SERIALIZED_NAME_DOWNLOAD_URL)
  private String downloadUrl;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_PAGE_COUNT = "page_count";
  @SerializedName(SERIALIZED_NAME_PAGE_COUNT)
  private Integer pageCount;


  public CreditDocumentMetadata name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the document.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the document.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CreditDocumentMetadata documentType(String documentType) {
    
    this.documentType = documentType;
    return this;
  }

   /**
   * The type of document.  &#x60;PAYSTUB&#x60;: A paystub.  &#x60;BANK_STATEMENT&#x60;: A bank statement.  &#x60;US_TAX_W2&#x60;: A W-2 wage and tax statement provided by a US employer reflecting wages earned by the employee.  &#x60;US_MILITARY_ERAS&#x60;: An electronic Retirement Account Statement (eRAS) issued by the US military.  &#x60;US_MILITARY_LES&#x60;: A Leave and Earnings Statement (LES) issued by the US military.  &#x60;US_MILITARY_CLES&#x60;: A Civilian Leave and Earnings Statment (CLES) issued by the US military.  &#x60;GIG&#x60;: Used to indicate that the income is related to gig work. Does not necessarily correspond to a specific document type.  &#x60;PLAID_GENERATED_PAYSTUB_PDF&#x60;: Used to indicate that the PDF for the paystub was generated by Plaid.  &#x60;NONE&#x60;: Used to indicate that there is no underlying document for the data.  &#x60;UNKNOWN&#x60;: Document type could not be determined.
   * @return documentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The type of document.  `PAYSTUB`: A paystub.  `BANK_STATEMENT`: A bank statement.  `US_TAX_W2`: A W-2 wage and tax statement provided by a US employer reflecting wages earned by the employee.  `US_MILITARY_ERAS`: An electronic Retirement Account Statement (eRAS) issued by the US military.  `US_MILITARY_LES`: A Leave and Earnings Statement (LES) issued by the US military.  `US_MILITARY_CLES`: A Civilian Leave and Earnings Statment (CLES) issued by the US military.  `GIG`: Used to indicate that the income is related to gig work. Does not necessarily correspond to a specific document type.  `PLAID_GENERATED_PAYSTUB_PDF`: Used to indicate that the PDF for the paystub was generated by Plaid.  `NONE`: Used to indicate that there is no underlying document for the data.  `UNKNOWN`: Document type could not be determined.")

  public String getDocumentType() {
    return documentType;
  }


  public void setDocumentType(String documentType) {
    this.documentType = documentType;
  }


  public CreditDocumentMetadata downloadUrl(String downloadUrl) {
    
    this.downloadUrl = downloadUrl;
    return this;
  }

   /**
   * Signed URL to retrieve the underlying file. This download URL can only be used once. To generate a new download URL, call &#x60;/credit/payroll_income/get&#x60; again.
   * @return downloadUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Signed URL to retrieve the underlying file. This download URL can only be used once. To generate a new download URL, call `/credit/payroll_income/get` again.")

  public String getDownloadUrl() {
    return downloadUrl;
  }


  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }


  public CreditDocumentMetadata status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * The processing status of the document.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The processing status of the document.")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public CreditDocumentMetadata pageCount(Integer pageCount) {
    
    this.pageCount = pageCount;
    return this;
  }

   /**
   * The number of pages of the uploaded document (if available).
   * @return pageCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of pages of the uploaded document (if available).")

  public Integer getPageCount() {
    return pageCount;
  }


  public void setPageCount(Integer pageCount) {
    this.pageCount = pageCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditDocumentMetadata creditDocumentMetadata = (CreditDocumentMetadata) o;
    return Objects.equals(this.name, creditDocumentMetadata.name) &&
        Objects.equals(this.documentType, creditDocumentMetadata.documentType) &&
        Objects.equals(this.downloadUrl, creditDocumentMetadata.downloadUrl) &&
        Objects.equals(this.status, creditDocumentMetadata.status) &&
        Objects.equals(this.pageCount, creditDocumentMetadata.pageCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, documentType, downloadUrl, status, pageCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditDocumentMetadata {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
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

