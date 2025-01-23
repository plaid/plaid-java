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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CreditAuditCopyTokenRemoveResponse defines the response schema for &#x60;/credit/audit_copy_token/remove&#x60;
 */
@ApiModel(description = "CreditAuditCopyTokenRemoveResponse defines the response schema for `/credit/audit_copy_token/remove`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-23T18:11:57.813484Z[Etc/UTC]")
public class CreditAuditCopyTokenRemoveResponse {
  public static final String SERIALIZED_NAME_REMOVED = "removed";
  @SerializedName(SERIALIZED_NAME_REMOVED)
  private Boolean removed;

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;


  public CreditAuditCopyTokenRemoveResponse removed(Boolean removed) {
    
    this.removed = removed;
    return this;
  }

   /**
   * &#x60;true&#x60; if the Audit Copy was successfully removed.
   * @return removed
  **/
  @ApiModelProperty(required = true, value = "`true` if the Audit Copy was successfully removed.")

  public Boolean getRemoved() {
    return removed;
  }


  public void setRemoved(Boolean removed) {
    this.removed = removed;
  }


  public CreditAuditCopyTokenRemoveResponse requestId(String requestId) {
    
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
    CreditAuditCopyTokenRemoveResponse creditAuditCopyTokenRemoveResponse = (CreditAuditCopyTokenRemoveResponse) o;
    return Objects.equals(this.removed, creditAuditCopyTokenRemoveResponse.removed) &&
        Objects.equals(this.requestId, creditAuditCopyTokenRemoveResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(removed, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditAuditCopyTokenRemoveResponse {\n");
    sb.append("    removed: ").append(toIndentedString(removed)).append("\n");
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

