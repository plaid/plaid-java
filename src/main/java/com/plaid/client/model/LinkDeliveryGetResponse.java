/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.565.0
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
import com.plaid.client.model.LinkDeliverySessionStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * LinkDeliveryGetRequest defines the response schema for &#x60;/link_delivery/get&#x60;
 */
@ApiModel(description = "LinkDeliveryGetRequest defines the response schema for `/link_delivery/get`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-17T16:42:02.150702Z[Etc/UTC]")
public class LinkDeliveryGetResponse {
  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private LinkDeliverySessionStatus status;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_COMPLETED_AT = "completed_at";
  @SerializedName(SERIALIZED_NAME_COMPLETED_AT)
  private OffsetDateTime completedAt;

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;

  public static final String SERIALIZED_NAME_ACCESS_TOKENS = "access_tokens";
  @SerializedName(SERIALIZED_NAME_ACCESS_TOKENS)
  private List<String> accessTokens = null;

  public static final String SERIALIZED_NAME_ITEM_IDS = "item_ids";
  @SerializedName(SERIALIZED_NAME_ITEM_IDS)
  private List<String> itemIds = null;


  public LinkDeliveryGetResponse status(LinkDeliverySessionStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")

  public LinkDeliverySessionStatus getStatus() {
    return status;
  }


  public void setStatus(LinkDeliverySessionStatus status) {
    this.status = status;
  }


  public LinkDeliveryGetResponse createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Timestamp in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (&#x60;YYYY-MM-DDTHH:mm:ssZ&#x60;) indicating the time the given Hosted Link session was created at.
   * @return createdAt
  **/
  @ApiModelProperty(required = true, value = "Timestamp in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (`YYYY-MM-DDTHH:mm:ssZ`) indicating the time the given Hosted Link session was created at.")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public LinkDeliveryGetResponse completedAt(OffsetDateTime completedAt) {
    
    this.completedAt = completedAt;
    return this;
  }

   /**
   * Timestamp in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (&#x60;YYYY-MM-DDTHH:mm:ssZ&#x60;) indicating the time the given Hosted Link session was completed at.
   * @return completedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Timestamp in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (`YYYY-MM-DDTHH:mm:ssZ`) indicating the time the given Hosted Link session was completed at.")

  public OffsetDateTime getCompletedAt() {
    return completedAt;
  }


  public void setCompletedAt(OffsetDateTime completedAt) {
    this.completedAt = completedAt;
  }


  public LinkDeliveryGetResponse requestId(String requestId) {
    
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


  public LinkDeliveryGetResponse accessTokens(List<String> accessTokens) {
    
    this.accessTokens = accessTokens;
    return this;
  }

  public LinkDeliveryGetResponse addAccessTokensItem(String accessTokensItem) {
    if (this.accessTokens == null) {
      this.accessTokens = new ArrayList<>();
    }
    this.accessTokens.add(accessTokensItem);
    return this;
  }

   /**
   * An array of access tokens associated with the Hosted Link session.
   * @return accessTokens
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of access tokens associated with the Hosted Link session.")

  public List<String> getAccessTokens() {
    return accessTokens;
  }


  public void setAccessTokens(List<String> accessTokens) {
    this.accessTokens = accessTokens;
  }


  public LinkDeliveryGetResponse itemIds(List<String> itemIds) {
    
    this.itemIds = itemIds;
    return this;
  }

  public LinkDeliveryGetResponse addItemIdsItem(String itemIdsItem) {
    if (this.itemIds == null) {
      this.itemIds = new ArrayList<>();
    }
    this.itemIds.add(itemIdsItem);
    return this;
  }

   /**
   * An array of &#x60;item_id&#x60;s associated with the Hosted Link session.
   * @return itemIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of `item_id`s associated with the Hosted Link session.")

  public List<String> getItemIds() {
    return itemIds;
  }


  public void setItemIds(List<String> itemIds) {
    this.itemIds = itemIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkDeliveryGetResponse linkDeliveryGetResponse = (LinkDeliveryGetResponse) o;
    return Objects.equals(this.status, linkDeliveryGetResponse.status) &&
        Objects.equals(this.createdAt, linkDeliveryGetResponse.createdAt) &&
        Objects.equals(this.completedAt, linkDeliveryGetResponse.completedAt) &&
        Objects.equals(this.requestId, linkDeliveryGetResponse.requestId) &&
        Objects.equals(this.accessTokens, linkDeliveryGetResponse.accessTokens) &&
        Objects.equals(this.itemIds, linkDeliveryGetResponse.itemIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, createdAt, completedAt, requestId, accessTokens, itemIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkDeliveryGetResponse {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    accessTokens: ").append(toIndentedString(accessTokens)).append("\n");
    sb.append("    itemIds: ").append(toIndentedString(itemIds)).append("\n");
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

