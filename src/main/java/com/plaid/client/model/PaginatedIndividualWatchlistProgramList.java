/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.115.2
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
import com.plaid.client.model.IndividualWatchlistProgram;
import com.plaid.client.model.IndividualWatchlistProgramList;
import com.plaid.client.model.ListPagination;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Paginated list of individual watchlist screening programs
 */
@ApiModel(description = "Paginated list of individual watchlist screening programs")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-19T05:25:50.453080Z[Etc/UTC]")
public class PaginatedIndividualWatchlistProgramList {
  public static final String SERIALIZED_NAME_INDIVIDUAL_WATCHLIST_PROGRAMS = "individual_watchlist_programs";
  @SerializedName(SERIALIZED_NAME_INDIVIDUAL_WATCHLIST_PROGRAMS)
  private List<IndividualWatchlistProgram> individualWatchlistPrograms = new ArrayList<>();

  public static final String SERIALIZED_NAME_NEXT_CURSOR = "next_cursor";
  @SerializedName(SERIALIZED_NAME_NEXT_CURSOR)
  private String nextCursor;


  public PaginatedIndividualWatchlistProgramList individualWatchlistPrograms(List<IndividualWatchlistProgram> individualWatchlistPrograms) {
    
    this.individualWatchlistPrograms = individualWatchlistPrograms;
    return this;
  }

  public PaginatedIndividualWatchlistProgramList addIndividualWatchlistProgramsItem(IndividualWatchlistProgram individualWatchlistProgramsItem) {
    this.individualWatchlistPrograms.add(individualWatchlistProgramsItem);
    return this;
  }

   /**
   * List of individual watchlist screening programs
   * @return individualWatchlistPrograms
  **/
  @ApiModelProperty(required = true, value = "List of individual watchlist screening programs")

  public List<IndividualWatchlistProgram> getIndividualWatchlistPrograms() {
    return individualWatchlistPrograms;
  }


  public void setIndividualWatchlistPrograms(List<IndividualWatchlistProgram> individualWatchlistPrograms) {
    this.individualWatchlistPrograms = individualWatchlistPrograms;
  }


  public PaginatedIndividualWatchlistProgramList nextCursor(String nextCursor) {
    
    this.nextCursor = nextCursor;
    return this;
  }

   /**
   * An identifier that determines which page of results you receive.
   * @return nextCursor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "eyJkaXJlY3Rpb24iOiJuZXh0Iiwib2Zmc2V0IjoiMTU5NDM", required = true, value = "An identifier that determines which page of results you receive.")

  public String getNextCursor() {
    return nextCursor;
  }


  public void setNextCursor(String nextCursor) {
    this.nextCursor = nextCursor;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaginatedIndividualWatchlistProgramList paginatedIndividualWatchlistProgramList = (PaginatedIndividualWatchlistProgramList) o;
    return Objects.equals(this.individualWatchlistPrograms, paginatedIndividualWatchlistProgramList.individualWatchlistPrograms) &&
        Objects.equals(this.nextCursor, paginatedIndividualWatchlistProgramList.nextCursor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(individualWatchlistPrograms, nextCursor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginatedIndividualWatchlistProgramList {\n");
    sb.append("    individualWatchlistPrograms: ").append(toIndentedString(individualWatchlistPrograms)).append("\n");
    sb.append("    nextCursor: ").append(toIndentedString(nextCursor)).append("\n");
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

