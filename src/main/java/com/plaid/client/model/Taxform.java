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
import com.plaid.client.model.W2;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Data about an official document used to report the user&#39;s income to the IRS.
 */
@ApiModel(description = "Data about an official document used to report the user's income to the IRS.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-04T15:13:56.933796Z[Etc/UTC]")
public class Taxform {
  public static final String SERIALIZED_NAME_DOC_ID = "doc_id";
  @SerializedName(SERIALIZED_NAME_DOC_ID)
  private String docId;

  public static final String SERIALIZED_NAME_DOCUMENT_TYPE = "document_type";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_TYPE)
  private String documentType;

  public static final String SERIALIZED_NAME_W2 = "w2";
  @SerializedName(SERIALIZED_NAME_W2)
  private W2 w2;


  public Taxform docId(String docId) {
    
    this.docId = docId;
    return this;
  }

   /**
   * An identifier of the document referenced by the document metadata.
   * @return docId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An identifier of the document referenced by the document metadata.")

  public String getDocId() {
    return docId;
  }


  public void setDocId(String docId) {
    this.docId = docId;
  }


  public Taxform documentType(String documentType) {
    
    this.documentType = documentType;
    return this;
  }

   /**
   * The type of tax document. Currently, the only supported value is &#x60;w2&#x60;.
   * @return documentType
  **/
  @ApiModelProperty(required = true, value = "The type of tax document. Currently, the only supported value is `w2`.")

  public String getDocumentType() {
    return documentType;
  }


  public void setDocumentType(String documentType) {
    this.documentType = documentType;
  }


  public Taxform w2(W2 w2) {
    
    this.w2 = w2;
    return this;
  }

   /**
   * Get w2
   * @return w2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public W2 getW2() {
    return w2;
  }


  public void setW2(W2 w2) {
    this.w2 = w2;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Taxform taxform = (Taxform) o;
    return Objects.equals(this.docId, taxform.docId) &&
        Objects.equals(this.documentType, taxform.documentType) &&
        Objects.equals(this.w2, taxform.w2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docId, documentType, w2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Taxform {\n");
    sb.append("    docId: ").append(toIndentedString(docId)).append("\n");
    sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
    sb.append("    w2: ").append(toIndentedString(w2)).append("\n");
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

