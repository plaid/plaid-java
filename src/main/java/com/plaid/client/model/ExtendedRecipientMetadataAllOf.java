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
import java.time.LocalDate;

/**
 * ExtendedRecipientMetadataAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-23T18:11:57.813484Z[Etc/UTC]")
public class ExtendedRecipientMetadataAllOf {
  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public static final String SERIALIZED_NAME_JOINED_DATE = "joined_date";
  @SerializedName(SERIALIZED_NAME_JOINED_DATE)
  private LocalDate joinedDate;

  public static final String SERIALIZED_NAME_CONNECTION_COUNT = "connection_count";
  @SerializedName(SERIALIZED_NAME_CONNECTION_COUNT)
  private Integer connectionCount;


  public ExtendedRecipientMetadataAllOf category(String category) {
    
    this.category = category;
    return this;
  }

   /**
   * The category that the recipient falls under
   * @return category
  **/
  @ApiModelProperty(required = true, value = "The category that the recipient falls under")

  public String getCategory() {
    return category;
  }


  public void setCategory(String category) {
    this.category = category;
  }


  public ExtendedRecipientMetadataAllOf joinedDate(LocalDate joinedDate) {
    
    this.joinedDate = joinedDate;
    return this;
  }

   /**
   * The date at which the recipient gained production access to Plaid
   * @return joinedDate
  **/
  @ApiModelProperty(example = "Thu Jul 15 00:00:00 UTC 2021", required = true, value = "The date at which the recipient gained production access to Plaid")

  public LocalDate getJoinedDate() {
    return joinedDate;
  }


  public void setJoinedDate(LocalDate joinedDate) {
    this.joinedDate = joinedDate;
  }


  public ExtendedRecipientMetadataAllOf connectionCount(Integer connectionCount) {
    
    this.connectionCount = connectionCount;
    return this;
  }

   /**
   * The number of Data Partner consumers that are connected to the recipient for the specific Data Partner
   * @return connectionCount
  **/
  @ApiModelProperty(required = true, value = "The number of Data Partner consumers that are connected to the recipient for the specific Data Partner")

  public Integer getConnectionCount() {
    return connectionCount;
  }


  public void setConnectionCount(Integer connectionCount) {
    this.connectionCount = connectionCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtendedRecipientMetadataAllOf extendedRecipientMetadataAllOf = (ExtendedRecipientMetadataAllOf) o;
    return Objects.equals(this.category, extendedRecipientMetadataAllOf.category) &&
        Objects.equals(this.joinedDate, extendedRecipientMetadataAllOf.joinedDate) &&
        Objects.equals(this.connectionCount, extendedRecipientMetadataAllOf.connectionCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, joinedDate, connectionCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtendedRecipientMetadataAllOf {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    joinedDate: ").append(toIndentedString(joinedDate)).append("\n");
    sb.append("    connectionCount: ").append(toIndentedString(connectionCount)).append("\n");
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

