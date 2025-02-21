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
 * The details of a document upload CRA session in link
 */
@ApiModel(description = "The details of a document upload CRA session in link")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-21T16:44:11.345889Z[Etc/UTC]")
public class LinkSessionCraDocumentUploadResult {
  public static final String SERIALIZED_NAME_NUM_BANK_STATEMENTS_UPLOADED = "num_bank_statements_uploaded";
  @SerializedName(SERIALIZED_NAME_NUM_BANK_STATEMENTS_UPLOADED)
  private Integer numBankStatementsUploaded;


  public LinkSessionCraDocumentUploadResult numBankStatementsUploaded(Integer numBankStatementsUploaded) {
    
    this.numBankStatementsUploaded = numBankStatementsUploaded;
    return this;
  }

   /**
   * The number of bank statements uploaded by the user.
   * @return numBankStatementsUploaded
  **/
  @ApiModelProperty(required = true, value = "The number of bank statements uploaded by the user.")

  public Integer getNumBankStatementsUploaded() {
    return numBankStatementsUploaded;
  }


  public void setNumBankStatementsUploaded(Integer numBankStatementsUploaded) {
    this.numBankStatementsUploaded = numBankStatementsUploaded;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkSessionCraDocumentUploadResult linkSessionCraDocumentUploadResult = (LinkSessionCraDocumentUploadResult) o;
    return Objects.equals(this.numBankStatementsUploaded, linkSessionCraDocumentUploadResult.numBankStatementsUploaded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numBankStatementsUploaded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkSessionCraDocumentUploadResult {\n");
    sb.append("    numBankStatementsUploaded: ").append(toIndentedString(numBankStatementsUploaded)).append("\n");
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

