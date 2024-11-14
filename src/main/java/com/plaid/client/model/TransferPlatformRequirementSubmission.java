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
import java.util.UUID;

/**
 * A single requirement submission
 */
@ApiModel(description = "A single requirement submission")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-14T16:41:31.650700Z[Etc/UTC]")
public class TransferPlatformRequirementSubmission {
  public static final String SERIALIZED_NAME_REQUIREMENT_TYPE = "requirement_type";
  @SerializedName(SERIALIZED_NAME_REQUIREMENT_TYPE)
  private String requirementType;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_PERSON_ID = "person_id";
  @SerializedName(SERIALIZED_NAME_PERSON_ID)
  private UUID personId;


  public TransferPlatformRequirementSubmission requirementType(String requirementType) {
    
    this.requirementType = requirementType;
    return this;
  }

   /**
   * The type of requirement being submitted
   * @return requirementType
  **/
  @ApiModelProperty(required = true, value = "The type of requirement being submitted")

  public String getRequirementType() {
    return requirementType;
  }


  public void setRequirementType(String requirementType) {
    this.requirementType = requirementType;
  }


  public TransferPlatformRequirementSubmission value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * The value of the requirement, which can be a string or an object depending on the &#x60;requirement_type&#x60;. If it is an object, the object should be JSON marshaled into a string. See the documentation on this endpoint for more information and examples.
   * @return value
  **/
  @ApiModelProperty(required = true, value = "The value of the requirement, which can be a string or an object depending on the `requirement_type`. If it is an object, the object should be JSON marshaled into a string. See the documentation on this endpoint for more information and examples.")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  public TransferPlatformRequirementSubmission personId(UUID personId) {
    
    this.personId = personId;
    return this;
  }

   /**
   * The &#x60;person_id&#x60; of the person the requirement submission is related to. A &#x60;person_id&#x60; is returned by &#x60;/transfer/platform/person/create&#x60;. This field should not be included for requirements that are not related to a person.
   * @return personId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The `person_id` of the person the requirement submission is related to. A `person_id` is returned by `/transfer/platform/person/create`. This field should not be included for requirements that are not related to a person.")

  public UUID getPersonId() {
    return personId;
  }


  public void setPersonId(UUID personId) {
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
    TransferPlatformRequirementSubmission transferPlatformRequirementSubmission = (TransferPlatformRequirementSubmission) o;
    return Objects.equals(this.requirementType, transferPlatformRequirementSubmission.requirementType) &&
        Objects.equals(this.value, transferPlatformRequirementSubmission.value) &&
        Objects.equals(this.personId, transferPlatformRequirementSubmission.personId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requirementType, value, personId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferPlatformRequirementSubmission {\n");
    sb.append("    requirementType: ").append(toIndentedString(requirementType)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

