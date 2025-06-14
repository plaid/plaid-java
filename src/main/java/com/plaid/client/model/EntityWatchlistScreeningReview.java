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
import com.plaid.client.model.WatchlistScreeningAuditTrail;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * A review submitted by a team member for an entity watchlist screening. A review can be either a comment on the current screening state, actions taken against hits attached to the watchlist screening, or both.
 */
@ApiModel(description = "A review submitted by a team member for an entity watchlist screening. A review can be either a comment on the current screening state, actions taken against hits attached to the watchlist screening, or both.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-12T21:24:48.076128Z[Etc/UTC]")
public class EntityWatchlistScreeningReview {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CONFIRMED_HITS = "confirmed_hits";
  @SerializedName(SERIALIZED_NAME_CONFIRMED_HITS)
  private List<String> confirmedHits = new ArrayList<>();

  public static final String SERIALIZED_NAME_DISMISSED_HITS = "dismissed_hits";
  @SerializedName(SERIALIZED_NAME_DISMISSED_HITS)
  private List<String> dismissedHits = new ArrayList<>();

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  public static final String SERIALIZED_NAME_AUDIT_TRAIL = "audit_trail";
  @SerializedName(SERIALIZED_NAME_AUDIT_TRAIL)
  private WatchlistScreeningAuditTrail auditTrail;


  public EntityWatchlistScreeningReview id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * ID of the associated entity review.
   * @return id
  **/
  @ApiModelProperty(example = "entrev_aCLNRxK3UVzn2r", required = true, value = "ID of the associated entity review.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public EntityWatchlistScreeningReview confirmedHits(List<String> confirmedHits) {
    
    this.confirmedHits = confirmedHits;
    return this;
  }

  public EntityWatchlistScreeningReview addConfirmedHitsItem(String confirmedHitsItem) {
    this.confirmedHits.add(confirmedHitsItem);
    return this;
  }

   /**
   * Hits marked as a true positive after thorough manual review. These hits will never recur or be updated once dismissed. In most cases, confirmed hits indicate that the customer should be rejected.
   * @return confirmedHits
  **/
  @ApiModelProperty(required = true, value = "Hits marked as a true positive after thorough manual review. These hits will never recur or be updated once dismissed. In most cases, confirmed hits indicate that the customer should be rejected.")

  public List<String> getConfirmedHits() {
    return confirmedHits;
  }


  public void setConfirmedHits(List<String> confirmedHits) {
    this.confirmedHits = confirmedHits;
  }


  public EntityWatchlistScreeningReview dismissedHits(List<String> dismissedHits) {
    
    this.dismissedHits = dismissedHits;
    return this;
  }

  public EntityWatchlistScreeningReview addDismissedHitsItem(String dismissedHitsItem) {
    this.dismissedHits.add(dismissedHitsItem);
    return this;
  }

   /**
   * Hits marked as a false positive after thorough manual review. These hits will never recur or be updated once dismissed.
   * @return dismissedHits
  **/
  @ApiModelProperty(required = true, value = "Hits marked as a false positive after thorough manual review. These hits will never recur or be updated once dismissed.")

  public List<String> getDismissedHits() {
    return dismissedHits;
  }


  public void setDismissedHits(List<String> dismissedHits) {
    this.dismissedHits = dismissedHits;
  }


  public EntityWatchlistScreeningReview comment(String comment) {
    
    this.comment = comment;
    return this;
  }

   /**
   * A comment submitted by a team member as part of reviewing a watchlist screening.
   * @return comment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "These look like legitimate matches, rejecting the customer.", required = true, value = "A comment submitted by a team member as part of reviewing a watchlist screening.")

  public String getComment() {
    return comment;
  }


  public void setComment(String comment) {
    this.comment = comment;
  }


  public EntityWatchlistScreeningReview auditTrail(WatchlistScreeningAuditTrail auditTrail) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityWatchlistScreeningReview entityWatchlistScreeningReview = (EntityWatchlistScreeningReview) o;
    return Objects.equals(this.id, entityWatchlistScreeningReview.id) &&
        Objects.equals(this.confirmedHits, entityWatchlistScreeningReview.confirmedHits) &&
        Objects.equals(this.dismissedHits, entityWatchlistScreeningReview.dismissedHits) &&
        Objects.equals(this.comment, entityWatchlistScreeningReview.comment) &&
        Objects.equals(this.auditTrail, entityWatchlistScreeningReview.auditTrail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, confirmedHits, dismissedHits, comment, auditTrail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityWatchlistScreeningReview {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    confirmedHits: ").append(toIndentedString(confirmedHits)).append("\n");
    sb.append("    dismissedHits: ").append(toIndentedString(dismissedHits)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    auditTrail: ").append(toIndentedString(auditTrail)).append("\n");
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

