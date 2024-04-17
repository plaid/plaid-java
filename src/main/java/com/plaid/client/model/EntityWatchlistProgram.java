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
import com.plaid.client.model.EntityWatchlistCode;
import com.plaid.client.model.ProgramNameSensitivity;
import com.plaid.client.model.WatchlistScreeningAuditTrail;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * A program that configures the active lists, search parameters, and other behavior for initial and ongoing screening of entities.
 */
@ApiModel(description = "A program that configures the active lists, search parameters, and other behavior for initial and ongoing screening of entities.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-17T20:52:19.180696Z[Etc/UTC]")
public class EntityWatchlistProgram {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private java.sql.Timestamp createdAt;

  public static final String SERIALIZED_NAME_IS_RESCANNING_ENABLED = "is_rescanning_enabled";
  @SerializedName(SERIALIZED_NAME_IS_RESCANNING_ENABLED)
  private Boolean isRescanningEnabled;

  public static final String SERIALIZED_NAME_LISTS_ENABLED = "lists_enabled";
  @SerializedName(SERIALIZED_NAME_LISTS_ENABLED)
  private Set<EntityWatchlistCode> listsEnabled = new LinkedHashSet<>();

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NAME_SENSITIVITY = "name_sensitivity";
  @SerializedName(SERIALIZED_NAME_NAME_SENSITIVITY)
  private ProgramNameSensitivity nameSensitivity;

  public static final String SERIALIZED_NAME_AUDIT_TRAIL = "audit_trail";
  @SerializedName(SERIALIZED_NAME_AUDIT_TRAIL)
  private WatchlistScreeningAuditTrail auditTrail;

  public static final String SERIALIZED_NAME_IS_ARCHIVED = "is_archived";
  @SerializedName(SERIALIZED_NAME_IS_ARCHIVED)
  private Boolean isArchived;


  public EntityWatchlistProgram id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * ID of the associated entity program.
   * @return id
  **/
  @ApiModelProperty(example = "entprg_2eRPsDnL66rZ7H", required = true, value = "ID of the associated entity program.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public EntityWatchlistProgram createdAt(java.sql.Timestamp createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(required = true, value = "")

  public java.sql.Timestamp getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(java.sql.Timestamp createdAt) {
    this.createdAt = createdAt;
  }


  public EntityWatchlistProgram isRescanningEnabled(Boolean isRescanningEnabled) {
    
    this.isRescanningEnabled = isRescanningEnabled;
    return this;
  }

   /**
   * Indicator specifying whether the program is enabled and will perform daily rescans.
   * @return isRescanningEnabled
  **/
  @ApiModelProperty(example = "true", required = true, value = "Indicator specifying whether the program is enabled and will perform daily rescans.")

  public Boolean getIsRescanningEnabled() {
    return isRescanningEnabled;
  }


  public void setIsRescanningEnabled(Boolean isRescanningEnabled) {
    this.isRescanningEnabled = isRescanningEnabled;
  }


  public EntityWatchlistProgram listsEnabled(Set<EntityWatchlistCode> listsEnabled) {
    
    this.listsEnabled = listsEnabled;
    return this;
  }

  public EntityWatchlistProgram addListsEnabledItem(EntityWatchlistCode listsEnabledItem) {
    this.listsEnabled.add(listsEnabledItem);
    return this;
  }

   /**
   * Watchlists enabled for the associated program
   * @return listsEnabled
  **/
  @ApiModelProperty(example = "[\"EU_CON\"]", required = true, value = "Watchlists enabled for the associated program")

  public Set<EntityWatchlistCode> getListsEnabled() {
    return listsEnabled;
  }


  public void setListsEnabled(Set<EntityWatchlistCode> listsEnabled) {
    this.listsEnabled = listsEnabled;
  }


  public EntityWatchlistProgram name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * A name for the entity program to define its purpose. For example, \&quot;High Risk Organizations\&quot; or \&quot;Applicants\&quot;.
   * @return name
  **/
  @ApiModelProperty(example = "Sample Program", required = true, value = "A name for the entity program to define its purpose. For example, \"High Risk Organizations\" or \"Applicants\".")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public EntityWatchlistProgram nameSensitivity(ProgramNameSensitivity nameSensitivity) {
    
    this.nameSensitivity = nameSensitivity;
    return this;
  }

   /**
   * Get nameSensitivity
   * @return nameSensitivity
  **/
  @ApiModelProperty(required = true, value = "")

  public ProgramNameSensitivity getNameSensitivity() {
    return nameSensitivity;
  }


  public void setNameSensitivity(ProgramNameSensitivity nameSensitivity) {
    this.nameSensitivity = nameSensitivity;
  }


  public EntityWatchlistProgram auditTrail(WatchlistScreeningAuditTrail auditTrail) {
    
    this.auditTrail = auditTrail;
    return this;
  }

   /**
   * Get auditTrail
   * @return auditTrail
  **/
  @ApiModelProperty(required = true, value = "")

  public WatchlistScreeningAuditTrail getAuditTrail() {
    return auditTrail;
  }


  public void setAuditTrail(WatchlistScreeningAuditTrail auditTrail) {
    this.auditTrail = auditTrail;
  }


  public EntityWatchlistProgram isArchived(Boolean isArchived) {
    
    this.isArchived = isArchived;
    return this;
  }

   /**
   * Archived programs are read-only and cannot screen new customers nor participate in ongoing monitoring.
   * @return isArchived
  **/
  @ApiModelProperty(example = "false", required = true, value = "Archived programs are read-only and cannot screen new customers nor participate in ongoing monitoring.")

  public Boolean getIsArchived() {
    return isArchived;
  }


  public void setIsArchived(Boolean isArchived) {
    this.isArchived = isArchived;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityWatchlistProgram entityWatchlistProgram = (EntityWatchlistProgram) o;
    return Objects.equals(this.id, entityWatchlistProgram.id) &&
        Objects.equals(this.createdAt, entityWatchlistProgram.createdAt) &&
        Objects.equals(this.isRescanningEnabled, entityWatchlistProgram.isRescanningEnabled) &&
        Objects.equals(this.listsEnabled, entityWatchlistProgram.listsEnabled) &&
        Objects.equals(this.name, entityWatchlistProgram.name) &&
        Objects.equals(this.nameSensitivity, entityWatchlistProgram.nameSensitivity) &&
        Objects.equals(this.auditTrail, entityWatchlistProgram.auditTrail) &&
        Objects.equals(this.isArchived, entityWatchlistProgram.isArchived);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, isRescanningEnabled, listsEnabled, name, nameSensitivity, auditTrail, isArchived);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityWatchlistProgram {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    isRescanningEnabled: ").append(toIndentedString(isRescanningEnabled)).append("\n");
    sb.append("    listsEnabled: ").append(toIndentedString(listsEnabled)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nameSensitivity: ").append(toIndentedString(nameSensitivity)).append("\n");
    sb.append("    auditTrail: ").append(toIndentedString(auditTrail)).append("\n");
    sb.append("    isArchived: ").append(toIndentedString(isArchived)).append("\n");
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

