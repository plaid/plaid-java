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
import com.plaid.client.model.IndividualWatchlistCode;
import com.plaid.client.model.ScreeningHitAnalysis;
import com.plaid.client.model.ScreeningHitData;
import com.plaid.client.model.WatchlistScreeningHitStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * Data from a government watchlist or PEP list that has been attached to the screening.
 */
@ApiModel(description = "Data from a government watchlist or PEP list that has been attached to the screening.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-12T21:24:48.076128Z[Etc/UTC]")
public class WatchlistScreeningHit {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_REVIEW_STATUS = "review_status";
  @SerializedName(SERIALIZED_NAME_REVIEW_STATUS)
  private WatchlistScreeningHitStatus reviewStatus;

  public static final String SERIALIZED_NAME_FIRST_ACTIVE = "first_active";
  @SerializedName(SERIALIZED_NAME_FIRST_ACTIVE)
  private java.sql.Timestamp firstActive;

  public static final String SERIALIZED_NAME_INACTIVE_SINCE = "inactive_since";
  @SerializedName(SERIALIZED_NAME_INACTIVE_SINCE)
  private OffsetDateTime inactiveSince;

  public static final String SERIALIZED_NAME_HISTORICAL_SINCE = "historical_since";
  @SerializedName(SERIALIZED_NAME_HISTORICAL_SINCE)
  private OffsetDateTime historicalSince;

  public static final String SERIALIZED_NAME_LIST_CODE = "list_code";
  @SerializedName(SERIALIZED_NAME_LIST_CODE)
  private IndividualWatchlistCode listCode;

  public static final String SERIALIZED_NAME_PLAID_UID = "plaid_uid";
  @SerializedName(SERIALIZED_NAME_PLAID_UID)
  private String plaidUid;

  public static final String SERIALIZED_NAME_SOURCE_UID = "source_uid";
  @SerializedName(SERIALIZED_NAME_SOURCE_UID)
  private String sourceUid;

  public static final String SERIALIZED_NAME_ANALYSIS = "analysis";
  @SerializedName(SERIALIZED_NAME_ANALYSIS)
  private ScreeningHitAnalysis analysis;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private ScreeningHitData data;


  public WatchlistScreeningHit id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * ID of the associated screening hit.
   * @return id
  **/
  @ApiModelProperty(example = "scrhit_52xR9LKo77r1Np", required = true, value = "ID of the associated screening hit.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public WatchlistScreeningHit reviewStatus(WatchlistScreeningHitStatus reviewStatus) {
    
    this.reviewStatus = reviewStatus;
    return this;
  }

   /**
   * Get reviewStatus
   * @return reviewStatus
  **/
  @ApiModelProperty(required = true, value = "")

  public WatchlistScreeningHitStatus getReviewStatus() {
    return reviewStatus;
  }


  public void setReviewStatus(WatchlistScreeningHitStatus reviewStatus) {
    this.reviewStatus = reviewStatus;
  }


  public WatchlistScreeningHit firstActive(java.sql.Timestamp firstActive) {
    
    this.firstActive = firstActive;
    return this;
  }

   /**
   * Get firstActive
   * @return firstActive
  **/
  @ApiModelProperty(required = true, value = "")

  public java.sql.Timestamp getFirstActive() {
    return firstActive;
  }


  public void setFirstActive(java.sql.Timestamp firstActive) {
    this.firstActive = firstActive;
  }


  public WatchlistScreeningHit inactiveSince(OffsetDateTime inactiveSince) {
    
    this.inactiveSince = inactiveSince;
    return this;
  }

   /**
   * An ISO8601 formatted timestamp.
   * @return inactiveSince
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-07-24T03:26:02Z", required = true, value = "An ISO8601 formatted timestamp.")

  public OffsetDateTime getInactiveSince() {
    return inactiveSince;
  }


  public void setInactiveSince(OffsetDateTime inactiveSince) {
    this.inactiveSince = inactiveSince;
  }


  public WatchlistScreeningHit historicalSince(OffsetDateTime historicalSince) {
    
    this.historicalSince = historicalSince;
    return this;
  }

   /**
   * An ISO8601 formatted timestamp.
   * @return historicalSince
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-07-24T03:26:02Z", required = true, value = "An ISO8601 formatted timestamp.")

  public OffsetDateTime getHistoricalSince() {
    return historicalSince;
  }


  public void setHistoricalSince(OffsetDateTime historicalSince) {
    this.historicalSince = historicalSince;
  }


  public WatchlistScreeningHit listCode(IndividualWatchlistCode listCode) {
    
    this.listCode = listCode;
    return this;
  }

   /**
   * Get listCode
   * @return listCode
  **/
  @ApiModelProperty(required = true, value = "")

  public IndividualWatchlistCode getListCode() {
    return listCode;
  }


  public void setListCode(IndividualWatchlistCode listCode) {
    this.listCode = listCode;
  }


  public WatchlistScreeningHit plaidUid(String plaidUid) {
    
    this.plaidUid = plaidUid;
    return this;
  }

   /**
   * A universal identifier for a watchlist individual that is stable across searches and updates.
   * @return plaidUid
  **/
  @ApiModelProperty(example = "uid_3NggckTimGSJHS", required = true, value = "A universal identifier for a watchlist individual that is stable across searches and updates.")

  public String getPlaidUid() {
    return plaidUid;
  }


  public void setPlaidUid(String plaidUid) {
    this.plaidUid = plaidUid;
  }


  public WatchlistScreeningHit sourceUid(String sourceUid) {
    
    this.sourceUid = sourceUid;
    return this;
  }

   /**
   * The identifier provided by the source sanction or watchlist. When one is not provided by the source, this is &#x60;null&#x60;.
   * @return sourceUid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "26192ABC", required = true, value = "The identifier provided by the source sanction or watchlist. When one is not provided by the source, this is `null`.")

  public String getSourceUid() {
    return sourceUid;
  }


  public void setSourceUid(String sourceUid) {
    this.sourceUid = sourceUid;
  }


  public WatchlistScreeningHit analysis(ScreeningHitAnalysis analysis) {
    
    this.analysis = analysis;
    return this;
  }

   /**
   * Get analysis
   * @return analysis
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ScreeningHitAnalysis getAnalysis() {
    return analysis;
  }


  public void setAnalysis(ScreeningHitAnalysis analysis) {
    this.analysis = analysis;
  }


  public WatchlistScreeningHit data(ScreeningHitData data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ScreeningHitData getData() {
    return data;
  }


  public void setData(ScreeningHitData data) {
    this.data = data;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WatchlistScreeningHit watchlistScreeningHit = (WatchlistScreeningHit) o;
    return Objects.equals(this.id, watchlistScreeningHit.id) &&
        Objects.equals(this.reviewStatus, watchlistScreeningHit.reviewStatus) &&
        Objects.equals(this.firstActive, watchlistScreeningHit.firstActive) &&
        Objects.equals(this.inactiveSince, watchlistScreeningHit.inactiveSince) &&
        Objects.equals(this.historicalSince, watchlistScreeningHit.historicalSince) &&
        Objects.equals(this.listCode, watchlistScreeningHit.listCode) &&
        Objects.equals(this.plaidUid, watchlistScreeningHit.plaidUid) &&
        Objects.equals(this.sourceUid, watchlistScreeningHit.sourceUid) &&
        Objects.equals(this.analysis, watchlistScreeningHit.analysis) &&
        Objects.equals(this.data, watchlistScreeningHit.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, reviewStatus, firstActive, inactiveSince, historicalSince, listCode, plaidUid, sourceUid, analysis, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WatchlistScreeningHit {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    reviewStatus: ").append(toIndentedString(reviewStatus)).append("\n");
    sb.append("    firstActive: ").append(toIndentedString(firstActive)).append("\n");
    sb.append("    inactiveSince: ").append(toIndentedString(inactiveSince)).append("\n");
    sb.append("    historicalSince: ").append(toIndentedString(historicalSince)).append("\n");
    sb.append("    listCode: ").append(toIndentedString(listCode)).append("\n");
    sb.append("    plaidUid: ").append(toIndentedString(plaidUid)).append("\n");
    sb.append("    sourceUid: ").append(toIndentedString(sourceUid)).append("\n");
    sb.append("    analysis: ").append(toIndentedString(analysis)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

