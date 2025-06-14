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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Request input for creating a review for an entity screening
 */
@ApiModel(description = "Request input for creating a review for an entity screening")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-12T21:24:48.076128Z[Etc/UTC]")
public class WatchlistScreeningEntityReviewCreateRequest {
  public static final String SERIALIZED_NAME_CONFIRMED_HITS = "confirmed_hits";
  @SerializedName(SERIALIZED_NAME_CONFIRMED_HITS)
  private List<String> confirmedHits = new ArrayList<>();

  public static final String SERIALIZED_NAME_DISMISSED_HITS = "dismissed_hits";
  @SerializedName(SERIALIZED_NAME_DISMISSED_HITS)
  private List<String> dismissedHits = new ArrayList<>();

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_ENTITY_WATCHLIST_SCREENING_ID = "entity_watchlist_screening_id";
  @SerializedName(SERIALIZED_NAME_ENTITY_WATCHLIST_SCREENING_ID)
  private String entityWatchlistScreeningId;


  public WatchlistScreeningEntityReviewCreateRequest confirmedHits(List<String> confirmedHits) {
    
    this.confirmedHits = confirmedHits;
    return this;
  }

  public WatchlistScreeningEntityReviewCreateRequest addConfirmedHitsItem(String confirmedHitsItem) {
    this.confirmedHits.add(confirmedHitsItem);
    return this;
  }

   /**
   * Hits to mark as a true positive after thorough manual review. These hits will never recur or be updated once dismissed. In most cases, confirmed hits indicate that the customer should be rejected.
   * @return confirmedHits
  **/
  @ApiModelProperty(required = true, value = "Hits to mark as a true positive after thorough manual review. These hits will never recur or be updated once dismissed. In most cases, confirmed hits indicate that the customer should be rejected.")

  public List<String> getConfirmedHits() {
    return confirmedHits;
  }


  public void setConfirmedHits(List<String> confirmedHits) {
    this.confirmedHits = confirmedHits;
  }


  public WatchlistScreeningEntityReviewCreateRequest dismissedHits(List<String> dismissedHits) {
    
    this.dismissedHits = dismissedHits;
    return this;
  }

  public WatchlistScreeningEntityReviewCreateRequest addDismissedHitsItem(String dismissedHitsItem) {
    this.dismissedHits.add(dismissedHitsItem);
    return this;
  }

   /**
   * Hits to mark as a false positive after thorough manual review. These hits will never recur or be updated once dismissed.
   * @return dismissedHits
  **/
  @ApiModelProperty(required = true, value = "Hits to mark as a false positive after thorough manual review. These hits will never recur or be updated once dismissed.")

  public List<String> getDismissedHits() {
    return dismissedHits;
  }


  public void setDismissedHits(List<String> dismissedHits) {
    this.dismissedHits = dismissedHits;
  }


  public WatchlistScreeningEntityReviewCreateRequest comment(String comment) {
    
    this.comment = comment;
    return this;
  }

   /**
   * A comment submitted by a team member as part of reviewing a watchlist screening.
   * @return comment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "These look like legitimate matches, rejecting the customer.", value = "A comment submitted by a team member as part of reviewing a watchlist screening.")

  public String getComment() {
    return comment;
  }


  public void setComment(String comment) {
    this.comment = comment;
  }


  public WatchlistScreeningEntityReviewCreateRequest clientId(String clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * Your Plaid API &#x60;client_id&#x60;. The &#x60;client_id&#x60; is required and may be provided either in the &#x60;PLAID-CLIENT-ID&#x60; header or as part of a request body.
   * @return clientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Your Plaid API `client_id`. The `client_id` is required and may be provided either in the `PLAID-CLIENT-ID` header or as part of a request body.")

  public String getClientId() {
    return clientId;
  }


  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public WatchlistScreeningEntityReviewCreateRequest secret(String secret) {
    
    this.secret = secret;
    return this;
  }

   /**
   * Your Plaid API &#x60;secret&#x60;. The &#x60;secret&#x60; is required and may be provided either in the &#x60;PLAID-SECRET&#x60; header or as part of a request body.
   * @return secret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Your Plaid API `secret`. The `secret` is required and may be provided either in the `PLAID-SECRET` header or as part of a request body.")

  public String getSecret() {
    return secret;
  }


  public void setSecret(String secret) {
    this.secret = secret;
  }


  public WatchlistScreeningEntityReviewCreateRequest entityWatchlistScreeningId(String entityWatchlistScreeningId) {
    
    this.entityWatchlistScreeningId = entityWatchlistScreeningId;
    return this;
  }

   /**
   * ID of the associated entity screening.
   * @return entityWatchlistScreeningId
  **/
  @ApiModelProperty(example = "entscr_52xR9LKo77r1Np", required = true, value = "ID of the associated entity screening.")

  public String getEntityWatchlistScreeningId() {
    return entityWatchlistScreeningId;
  }


  public void setEntityWatchlistScreeningId(String entityWatchlistScreeningId) {
    this.entityWatchlistScreeningId = entityWatchlistScreeningId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WatchlistScreeningEntityReviewCreateRequest watchlistScreeningEntityReviewCreateRequest = (WatchlistScreeningEntityReviewCreateRequest) o;
    return Objects.equals(this.confirmedHits, watchlistScreeningEntityReviewCreateRequest.confirmedHits) &&
        Objects.equals(this.dismissedHits, watchlistScreeningEntityReviewCreateRequest.dismissedHits) &&
        Objects.equals(this.comment, watchlistScreeningEntityReviewCreateRequest.comment) &&
        Objects.equals(this.clientId, watchlistScreeningEntityReviewCreateRequest.clientId) &&
        Objects.equals(this.secret, watchlistScreeningEntityReviewCreateRequest.secret) &&
        Objects.equals(this.entityWatchlistScreeningId, watchlistScreeningEntityReviewCreateRequest.entityWatchlistScreeningId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(confirmedHits, dismissedHits, comment, clientId, secret, entityWatchlistScreeningId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WatchlistScreeningEntityReviewCreateRequest {\n");
    sb.append("    confirmedHits: ").append(toIndentedString(confirmedHits)).append("\n");
    sb.append("    dismissedHits: ").append(toIndentedString(dismissedHits)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    entityWatchlistScreeningId: ").append(toIndentedString(entityWatchlistScreeningId)).append("\n");
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

