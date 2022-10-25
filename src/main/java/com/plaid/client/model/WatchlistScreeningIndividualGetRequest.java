/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.197.3
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
 * Request input for fetching an individual watchlist screening
 */
@ApiModel(description = "Request input for fetching an individual watchlist screening")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-25T17:51:05.669516Z[Etc/UTC]")
public class WatchlistScreeningIndividualGetRequest {
  public static final String SERIALIZED_NAME_WATCHLIST_SCREENING_ID = "watchlist_screening_id";
  @SerializedName(SERIALIZED_NAME_WATCHLIST_SCREENING_ID)
  private String watchlistScreeningId;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;


  public WatchlistScreeningIndividualGetRequest watchlistScreeningId(String watchlistScreeningId) {
    
    this.watchlistScreeningId = watchlistScreeningId;
    return this;
  }

   /**
   * ID of the associated screening.
   * @return watchlistScreeningId
  **/
  @ApiModelProperty(example = "scr_52xR9LKo77r1Np", required = true, value = "ID of the associated screening.")

  public String getWatchlistScreeningId() {
    return watchlistScreeningId;
  }


  public void setWatchlistScreeningId(String watchlistScreeningId) {
    this.watchlistScreeningId = watchlistScreeningId;
  }


  public WatchlistScreeningIndividualGetRequest secret(String secret) {
    
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


  public WatchlistScreeningIndividualGetRequest clientId(String clientId) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WatchlistScreeningIndividualGetRequest watchlistScreeningIndividualGetRequest = (WatchlistScreeningIndividualGetRequest) o;
    return Objects.equals(this.watchlistScreeningId, watchlistScreeningIndividualGetRequest.watchlistScreeningId) &&
        Objects.equals(this.secret, watchlistScreeningIndividualGetRequest.secret) &&
        Objects.equals(this.clientId, watchlistScreeningIndividualGetRequest.clientId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(watchlistScreeningId, secret, clientId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WatchlistScreeningIndividualGetRequest {\n");
    sb.append("    watchlistScreeningId: ").append(toIndentedString(watchlistScreeningId)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
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

