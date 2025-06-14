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
import java.time.LocalDate;

/**
 * Search terms for creating an individual watchlist screening
 */
@ApiModel(description = "Search terms for creating an individual watchlist screening")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-12T21:24:48.076128Z[Etc/UTC]")
public class WatchlistScreeningSearchTerms {
  public static final String SERIALIZED_NAME_WATCHLIST_PROGRAM_ID = "watchlist_program_id";
  @SerializedName(SERIALIZED_NAME_WATCHLIST_PROGRAM_ID)
  private String watchlistProgramId;

  public static final String SERIALIZED_NAME_LEGAL_NAME = "legal_name";
  @SerializedName(SERIALIZED_NAME_LEGAL_NAME)
  private String legalName;

  public static final String SERIALIZED_NAME_DATE_OF_BIRTH = "date_of_birth";
  @SerializedName(SERIALIZED_NAME_DATE_OF_BIRTH)
  private LocalDate dateOfBirth;

  public static final String SERIALIZED_NAME_DOCUMENT_NUMBER = "document_number";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_NUMBER)
  private String documentNumber;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Integer version;


  public WatchlistScreeningSearchTerms watchlistProgramId(String watchlistProgramId) {
    
    this.watchlistProgramId = watchlistProgramId;
    return this;
  }

   /**
   * ID of the associated program.
   * @return watchlistProgramId
  **/
  @ApiModelProperty(example = "prg_2eRPsDnL66rZ7H", required = true, value = "ID of the associated program.")

  public String getWatchlistProgramId() {
    return watchlistProgramId;
  }


  public void setWatchlistProgramId(String watchlistProgramId) {
    this.watchlistProgramId = watchlistProgramId;
  }


  public WatchlistScreeningSearchTerms legalName(String legalName) {
    
    this.legalName = legalName;
    return this;
  }

   /**
   * The legal name of the individual being screened. Must have at least one alphabetical character, have a maximum length of 100 characters, and not include leading or trailing spaces.
   * @return legalName
  **/
  @ApiModelProperty(example = "Aleksey Potemkin", required = true, value = "The legal name of the individual being screened. Must have at least one alphabetical character, have a maximum length of 100 characters, and not include leading or trailing spaces.")

  public String getLegalName() {
    return legalName;
  }


  public void setLegalName(String legalName) {
    this.legalName = legalName;
  }


  public WatchlistScreeningSearchTerms dateOfBirth(LocalDate dateOfBirth) {
    
    this.dateOfBirth = dateOfBirth;
    return this;
  }

   /**
   * A date in the format YYYY-MM-DD (RFC 3339 Section 5.6).
   * @return dateOfBirth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Tue May 29 00:00:00 UTC 1990", required = true, value = "A date in the format YYYY-MM-DD (RFC 3339 Section 5.6).")

  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }


  public void setDateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }


  public WatchlistScreeningSearchTerms documentNumber(String documentNumber) {
    
    this.documentNumber = documentNumber;
    return this;
  }

   /**
   * The numeric or alphanumeric identifier associated with this document. Must be between 4 and 32 characters long, and cannot have leading or trailing spaces.
   * @return documentNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "C31195855", required = true, value = "The numeric or alphanumeric identifier associated with this document. Must be between 4 and 32 characters long, and cannot have leading or trailing spaces.")

  public String getDocumentNumber() {
    return documentNumber;
  }


  public void setDocumentNumber(String documentNumber) {
    this.documentNumber = documentNumber;
  }


  public WatchlistScreeningSearchTerms country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * Valid, capitalized, two-letter ISO code representing the country of this object. Must be in ISO 3166-1 alpha-2 form.
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "US", required = true, value = "Valid, capitalized, two-letter ISO code representing the country of this object. Must be in ISO 3166-1 alpha-2 form.")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public WatchlistScreeningSearchTerms version(Integer version) {
    
    this.version = version;
    return this;
  }

   /**
   * The current version of the search terms. Starts at &#x60;1&#x60; and increments with each edit to &#x60;search_terms&#x60;.
   * @return version
  **/
  @ApiModelProperty(example = "1", required = true, value = "The current version of the search terms. Starts at `1` and increments with each edit to `search_terms`.")

  public Integer getVersion() {
    return version;
  }


  public void setVersion(Integer version) {
    this.version = version;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WatchlistScreeningSearchTerms watchlistScreeningSearchTerms = (WatchlistScreeningSearchTerms) o;
    return Objects.equals(this.watchlistProgramId, watchlistScreeningSearchTerms.watchlistProgramId) &&
        Objects.equals(this.legalName, watchlistScreeningSearchTerms.legalName) &&
        Objects.equals(this.dateOfBirth, watchlistScreeningSearchTerms.dateOfBirth) &&
        Objects.equals(this.documentNumber, watchlistScreeningSearchTerms.documentNumber) &&
        Objects.equals(this.country, watchlistScreeningSearchTerms.country) &&
        Objects.equals(this.version, watchlistScreeningSearchTerms.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(watchlistProgramId, legalName, dateOfBirth, documentNumber, country, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WatchlistScreeningSearchTerms {\n");
    sb.append("    watchlistProgramId: ").append(toIndentedString(watchlistProgramId)).append("\n");
    sb.append("    legalName: ").append(toIndentedString(legalName)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    documentNumber: ").append(toIndentedString(documentNumber)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

