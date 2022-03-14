/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.84.5
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
import java.time.LocalDate;

/**
 * Metadata about the application
 */
@ApiModel(description = "Metadata about the application")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-14T20:57:51.039Z[GMT]")
public class Application {
  public static final String SERIALIZED_NAME_APPLICATION_ID = "application_id";
  @SerializedName(SERIALIZED_NAME_APPLICATION_ID)
  private String applicationId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private LocalDate createdAt;

  public static final String SERIALIZED_NAME_JOIN_DATE = "join_date";
  @SerializedName(SERIALIZED_NAME_JOIN_DATE)
  private LocalDate joinDate;

  public static final String SERIALIZED_NAME_LOGO_URL = "logo_url";
  @SerializedName(SERIALIZED_NAME_LOGO_URL)
  private String logoUrl;

  public static final String SERIALIZED_NAME_APPLICATION_URL = "application_url";
  @SerializedName(SERIALIZED_NAME_APPLICATION_URL)
  private String applicationUrl;

  public static final String SERIALIZED_NAME_REASON_FOR_ACCESS = "reason_for_access";
  @SerializedName(SERIALIZED_NAME_REASON_FOR_ACCESS)
  private String reasonForAccess;


  public Application applicationId(String applicationId) {
    
    this.applicationId = applicationId;
    return this;
  }

   /**
   * This field will map to the application ID that is returned from /item/applications/list, or provided to the institution in an oauth redirect.
   * @return applicationId
  **/
  @ApiModelProperty(required = true, value = "This field will map to the application ID that is returned from /item/applications/list, or provided to the institution in an oauth redirect.")

  public String getApplicationId() {
    return applicationId;
  }


  public void setApplicationId(String applicationId) {
    this.applicationId = applicationId;
  }


  public Application name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the application
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the application")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Application createdAt(LocalDate createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The date this application was linked in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) (YYYY-MM-DD) format in UTC.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Wed Jan 01 00:00:00 GMT 2020", value = "The date this application was linked in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) (YYYY-MM-DD) format in UTC.")

  public LocalDate getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(LocalDate createdAt) {
    this.createdAt = createdAt;
  }


  public Application joinDate(LocalDate joinDate) {
    
    this.joinDate = joinDate;
    return this;
  }

   /**
   * The date this application was granted production access at Plaid in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) (YYYY-MM-DD) format in UTC.
   * @return joinDate
  **/
  @ApiModelProperty(required = true, value = "The date this application was granted production access at Plaid in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) (YYYY-MM-DD) format in UTC.")

  public LocalDate getJoinDate() {
    return joinDate;
  }


  public void setJoinDate(LocalDate joinDate) {
    this.joinDate = joinDate;
  }


  public Application logoUrl(String logoUrl) {
    
    this.logoUrl = logoUrl;
    return this;
  }

   /**
   * A URL that links to the application logo image.
   * @return logoUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "A URL that links to the application logo image.")

  public String getLogoUrl() {
    return logoUrl;
  }


  public void setLogoUrl(String logoUrl) {
    this.logoUrl = logoUrl;
  }


  public Application applicationUrl(String applicationUrl) {
    
    this.applicationUrl = applicationUrl;
    return this;
  }

   /**
   * The URL for the application&#39;s website
   * @return applicationUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The URL for the application's website")

  public String getApplicationUrl() {
    return applicationUrl;
  }


  public void setApplicationUrl(String applicationUrl) {
    this.applicationUrl = applicationUrl;
  }


  public Application reasonForAccess(String reasonForAccess) {
    
    this.reasonForAccess = reasonForAccess;
    return this;
  }

   /**
   * A string provided by the connected app stating why they use their respective enabled products.
   * @return reasonForAccess
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "A string provided by the connected app stating why they use their respective enabled products.")

  public String getReasonForAccess() {
    return reasonForAccess;
  }


  public void setReasonForAccess(String reasonForAccess) {
    this.reasonForAccess = reasonForAccess;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Application application = (Application) o;
    return Objects.equals(this.applicationId, application.applicationId) &&
        Objects.equals(this.name, application.name) &&
        Objects.equals(this.createdAt, application.createdAt) &&
        Objects.equals(this.joinDate, application.joinDate) &&
        Objects.equals(this.logoUrl, application.logoUrl) &&
        Objects.equals(this.applicationUrl, application.applicationUrl) &&
        Objects.equals(this.reasonForAccess, application.reasonForAccess);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationId, name, createdAt, joinDate, logoUrl, applicationUrl, reasonForAccess);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Application {\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    joinDate: ").append(toIndentedString(joinDate)).append("\n");
    sb.append("    logoUrl: ").append(toIndentedString(logoUrl)).append("\n");
    sb.append("    applicationUrl: ").append(toIndentedString(applicationUrl)).append("\n");
    sb.append("    reasonForAccess: ").append(toIndentedString(reasonForAccess)).append("\n");
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

