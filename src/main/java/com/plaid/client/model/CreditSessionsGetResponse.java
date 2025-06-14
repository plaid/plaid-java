/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.645.0
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
import com.plaid.client.model.CreditSession;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * CreditSessionsGetResponse defines the response schema for &#x60;/credit/sessions/get&#x60;
 */
@ApiModel(description = "CreditSessionsGetResponse defines the response schema for `/credit/sessions/get`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-12T21:24:48.076128Z[Etc/UTC]")
public class CreditSessionsGetResponse {
  public static final String SERIALIZED_NAME_SESSIONS = "sessions";
  @SerializedName(SERIALIZED_NAME_SESSIONS)
  private List<CreditSession> sessions = null;

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;


  public CreditSessionsGetResponse sessions(List<CreditSession> sessions) {
    
    this.sessions = sessions;
    return this;
  }

  public CreditSessionsGetResponse addSessionsItem(CreditSession sessionsItem) {
    if (this.sessions == null) {
      this.sessions = new ArrayList<>();
    }
    this.sessions.add(sessionsItem);
    return this;
  }

   /**
   * A list of Link sessions for the user. Sessions will be sorted in reverse chronological order.
   * @return sessions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of Link sessions for the user. Sessions will be sorted in reverse chronological order.")

  public List<CreditSession> getSessions() {
    return sessions;
  }


  public void setSessions(List<CreditSession> sessions) {
    this.sessions = sessions;
  }


  public CreditSessionsGetResponse requestId(String requestId) {
    
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
    CreditSessionsGetResponse creditSessionsGetResponse = (CreditSessionsGetResponse) o;
    return Objects.equals(this.sessions, creditSessionsGetResponse.sessions) &&
        Objects.equals(this.requestId, creditSessionsGetResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sessions, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditSessionsGetResponse {\n");
    sb.append("    sessions: ").append(toIndentedString(sessions)).append("\n");
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

