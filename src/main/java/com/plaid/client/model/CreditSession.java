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
import com.plaid.client.model.CreditSessionError;
import com.plaid.client.model.CreditSessionResults;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Metadata and results for a Link session
 */
@ApiModel(description = "Metadata and results for a Link session")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-12T21:24:48.076128Z[Etc/UTC]")
public class CreditSession {
  public static final String SERIALIZED_NAME_LINK_SESSION_ID = "link_session_id";
  @SerializedName(SERIALIZED_NAME_LINK_SESSION_ID)
  private String linkSessionId;

  public static final String SERIALIZED_NAME_SESSION_START_TIME = "session_start_time";
  @SerializedName(SERIALIZED_NAME_SESSION_START_TIME)
  private OffsetDateTime sessionStartTime;

  public static final String SERIALIZED_NAME_RESULTS = "results";
  @SerializedName(SERIALIZED_NAME_RESULTS)
  private CreditSessionResults results;

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<CreditSessionError> errors = null;


  public CreditSession linkSessionId(String linkSessionId) {
    
    this.linkSessionId = linkSessionId;
    return this;
  }

   /**
   * The unique identifier associated with the Link session. This identifier matches the &#x60;link_session_id&#x60; returned in the onSuccess/onExit callbacks.
   * @return linkSessionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique identifier associated with the Link session. This identifier matches the `link_session_id` returned in the onSuccess/onExit callbacks.")

  public String getLinkSessionId() {
    return linkSessionId;
  }


  public void setLinkSessionId(String linkSessionId) {
    this.linkSessionId = linkSessionId;
  }


  public CreditSession sessionStartTime(OffsetDateTime sessionStartTime) {
    
    this.sessionStartTime = sessionStartTime;
    return this;
  }

   /**
   * The time when the Link session started
   * @return sessionStartTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The time when the Link session started")

  public OffsetDateTime getSessionStartTime() {
    return sessionStartTime;
  }


  public void setSessionStartTime(OffsetDateTime sessionStartTime) {
    this.sessionStartTime = sessionStartTime;
  }


  public CreditSession results(CreditSessionResults results) {
    
    this.results = results;
    return this;
  }

   /**
   * Get results
   * @return results
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CreditSessionResults getResults() {
    return results;
  }


  public void setResults(CreditSessionResults results) {
    this.results = results;
  }


  public CreditSession errors(List<CreditSessionError> errors) {
    
    this.errors = errors;
    return this;
  }

  public CreditSession addErrorsItem(CreditSessionError errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * The set of errors that occurred during the Link session.
   * @return errors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The set of errors that occurred during the Link session.")

  public List<CreditSessionError> getErrors() {
    return errors;
  }


  public void setErrors(List<CreditSessionError> errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditSession creditSession = (CreditSession) o;
    return Objects.equals(this.linkSessionId, creditSession.linkSessionId) &&
        Objects.equals(this.sessionStartTime, creditSession.sessionStartTime) &&
        Objects.equals(this.results, creditSession.results) &&
        Objects.equals(this.errors, creditSession.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(linkSessionId, sessionStartTime, results, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditSession {\n");
    sb.append("    linkSessionId: ").append(toIndentedString(linkSessionId)).append("\n");
    sb.append("    sessionStartTime: ").append(toIndentedString(sessionStartTime)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

