/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.586.4
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
 * A piece of information that is outstanding for the scaled platform onboarding process.
 */
@ApiModel(description = "A piece of information that is outstanding for the scaled platform onboarding process.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-14T16:41:31.650700Z[Etc/UTC]")
public class TransferPlatformRequirement {
  public static final String SERIALIZED_NAME_REQUIREMENT_TYPE = "requirement_type";
  @SerializedName(SERIALIZED_NAME_REQUIREMENT_TYPE)
  private String requirementType;

  public static final String SERIALIZED_NAME_PERSON_ID = "person_id";
  @SerializedName(SERIALIZED_NAME_PERSON_ID)
  private String personId;


  public TransferPlatformRequirement requirementType(String requirementType) {
    
    this.requirementType = requirementType;
    return this;
  }

   /**
   * The type of requirement.
   * @return requirementType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of requirement.")

  public String getRequirementType() {
    return requirementType;
  }


  public void setRequirementType(String requirementType) {
    this.requirementType = requirementType;
  }


  public TransferPlatformRequirement personId(String personId) {
    
    this.personId = personId;
    return this;
  }

   /**
   * UUID of the person associated with the requirement. Only present for individual-scoped requirements.
   * @return personId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "UUID of the person associated with the requirement. Only present for individual-scoped requirements.")

  public String getPersonId() {
    return personId;
  }


  public void setPersonId(String personId) {
    this.personId = personId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferPlatformRequirement transferPlatformRequirement = (TransferPlatformRequirement) o;
    return Objects.equals(this.requirementType, transferPlatformRequirement.requirementType) &&
        Objects.equals(this.personId, transferPlatformRequirement.personId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requirementType, personId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferPlatformRequirement {\n");
    sb.append("    requirementType: ").append(toIndentedString(requirementType)).append("\n");
    sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
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

