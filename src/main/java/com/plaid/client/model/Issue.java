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
import com.plaid.client.model.IssuesStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Information on an issue encountered with financial institutions interactions with financial institutions during Linking.
 */
@ApiModel(description = "Information on an issue encountered with financial institutions interactions with financial institutions during Linking.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-12T21:24:48.076128Z[Etc/UTC]")
public class Issue {
  public static final String SERIALIZED_NAME_ISSUE_ID = "issue_id";
  @SerializedName(SERIALIZED_NAME_ISSUE_ID)
  private String issueId;

  public static final String SERIALIZED_NAME_INSTITUTION_NAMES = "institution_names";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_NAMES)
  private List<String> institutionNames = null;

  public static final String SERIALIZED_NAME_INSTITUTION_IDS = "institution_ids";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_IDS)
  private List<String> institutionIds = null;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_SUMMARY = "summary";
  @SerializedName(SERIALIZED_NAME_SUMMARY)
  private String summary;

  public static final String SERIALIZED_NAME_DETAILED_DESCRIPTION = "detailed_description";
  @SerializedName(SERIALIZED_NAME_DETAILED_DESCRIPTION)
  private String detailedDescription;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private IssuesStatus status;


  public Issue issueId(String issueId) {
    
    this.issueId = issueId;
    return this;
  }

   /**
   * The unique identifier of the issue.
   * @return issueId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique identifier of the issue.")

  public String getIssueId() {
    return issueId;
  }


  public void setIssueId(String issueId) {
    this.issueId = issueId;
  }


  public Issue institutionNames(List<String> institutionNames) {
    
    this.institutionNames = institutionNames;
    return this;
  }

  public Issue addInstitutionNamesItem(String institutionNamesItem) {
    if (this.institutionNames == null) {
      this.institutionNames = new ArrayList<>();
    }
    this.institutionNames.add(institutionNamesItem);
    return this;
  }

   /**
   * A list of names of the financial institutions affected.
   * @return institutionNames
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of names of the financial institutions affected.")

  public List<String> getInstitutionNames() {
    return institutionNames;
  }


  public void setInstitutionNames(List<String> institutionNames) {
    this.institutionNames = institutionNames;
  }


  public Issue institutionIds(List<String> institutionIds) {
    
    this.institutionIds = institutionIds;
    return this;
  }

  public Issue addInstitutionIdsItem(String institutionIdsItem) {
    if (this.institutionIds == null) {
      this.institutionIds = new ArrayList<>();
    }
    this.institutionIds.add(institutionIdsItem);
    return this;
  }

   /**
   * A list of ids of the financial institutions affected.
   * @return institutionIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of ids of the financial institutions affected.")

  public List<String> getInstitutionIds() {
    return institutionIds;
  }


  public void setInstitutionIds(List<String> institutionIds) {
    this.institutionIds = institutionIds;
  }


  public Issue createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The creation time of the record tracking this issue.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The creation time of the record tracking this issue.")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public Issue summary(String summary) {
    
    this.summary = summary;
    return this;
  }

   /**
   * A simple summary of the error for the end user.
   * @return summary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A simple summary of the error for the end user.")

  public String getSummary() {
    return summary;
  }


  public void setSummary(String summary) {
    this.summary = summary;
  }


  public Issue detailedDescription(String detailedDescription) {
    
    this.detailedDescription = detailedDescription;
    return this;
  }

   /**
   * A more detailed description for the customer.
   * @return detailedDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A more detailed description for the customer.")

  public String getDetailedDescription() {
    return detailedDescription;
  }


  public void setDetailedDescription(String detailedDescription) {
    this.detailedDescription = detailedDescription;
  }


  public Issue status(IssuesStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IssuesStatus getStatus() {
    return status;
  }


  public void setStatus(IssuesStatus status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Issue issue = (Issue) o;
    return Objects.equals(this.issueId, issue.issueId) &&
        Objects.equals(this.institutionNames, issue.institutionNames) &&
        Objects.equals(this.institutionIds, issue.institutionIds) &&
        Objects.equals(this.createdAt, issue.createdAt) &&
        Objects.equals(this.summary, issue.summary) &&
        Objects.equals(this.detailedDescription, issue.detailedDescription) &&
        Objects.equals(this.status, issue.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issueId, institutionNames, institutionIds, createdAt, summary, detailedDescription, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Issue {\n");
    sb.append("    issueId: ").append(toIndentedString(issueId)).append("\n");
    sb.append("    institutionNames: ").append(toIndentedString(institutionNames)).append("\n");
    sb.append("    institutionIds: ").append(toIndentedString(institutionIds)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    detailedDescription: ").append(toIndentedString(detailedDescription)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

