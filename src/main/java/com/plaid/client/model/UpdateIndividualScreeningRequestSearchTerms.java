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
 * Search terms for editing an individual watchlist screening
 */
@ApiModel(description = "Search terms for editing an individual watchlist screening")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-23T20:55:58.809242Z[Etc/UTC]")
public class UpdateIndividualScreeningRequestSearchTerms {
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


  public UpdateIndividualScreeningRequestSearchTerms watchlistProgramId(String watchlistProgramId) {
    
    this.watchlistProgramId = watchlistProgramId;
    return this;
  }

   /**
   * ID of the associated program.
   * @return watchlistProgramId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "prg_2eRPsDnL66rZ7H", value = "ID of the associated program.")

  public String getWatchlistProgramId() {
    return watchlistProgramId;
  }


  public void setWatchlistProgramId(String watchlistProgramId) {
    this.watchlistProgramId = watchlistProgramId;
  }


  public UpdateIndividualScreeningRequestSearchTerms legalName(String legalName) {
    
    this.legalName = legalName;
    return this;
  }

   /**
   * The legal name of the individual being screened. Must have at least one alphabetical character, have a maximum length of 100 characters, and not include leading or trailing spaces.
   * @return legalName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Aleksey Potemkin", value = "The legal name of the individual being screened. Must have at least one alphabetical character, have a maximum length of 100 characters, and not include leading or trailing spaces.")

  public String getLegalName() {
    return legalName;
  }


  public void setLegalName(String legalName) {
    this.legalName = legalName;
  }


  public UpdateIndividualScreeningRequestSearchTerms dateOfBirth(LocalDate dateOfBirth) {
    
    this.dateOfBirth = dateOfBirth;
    return this;
  }

   /**
   * A date in the format YYYY-MM-DD (RFC 3339 Section 5.6).
   * @return dateOfBirth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Tue May 29 00:00:00 UTC 1990", value = "A date in the format YYYY-MM-DD (RFC 3339 Section 5.6).")

  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }


  public void setDateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }


  public UpdateIndividualScreeningRequestSearchTerms documentNumber(String documentNumber) {
    
    this.documentNumber = documentNumber;
    return this;
  }

   /**
   * The numeric or alphanumeric identifier associated with this document. Must be between 4 and 32 characters long, and cannot have leading or trailing spaces.
   * @return documentNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "C31195855", value = "The numeric or alphanumeric identifier associated with this document. Must be between 4 and 32 characters long, and cannot have leading or trailing spaces.")

  public String getDocumentNumber() {
    return documentNumber;
  }


  public void setDocumentNumber(String documentNumber) {
    this.documentNumber = documentNumber;
  }


  public UpdateIndividualScreeningRequestSearchTerms country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * Valid, capitalized, two-letter ISO code representing the country of this object. Must be in ISO 3166-1 alpha-2 form.
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "US", value = "Valid, capitalized, two-letter ISO code representing the country of this object. Must be in ISO 3166-1 alpha-2 form.")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateIndividualScreeningRequestSearchTerms updateIndividualScreeningRequestSearchTerms = (UpdateIndividualScreeningRequestSearchTerms) o;
    return Objects.equals(this.watchlistProgramId, updateIndividualScreeningRequestSearchTerms.watchlistProgramId) &&
        Objects.equals(this.legalName, updateIndividualScreeningRequestSearchTerms.legalName) &&
        Objects.equals(this.dateOfBirth, updateIndividualScreeningRequestSearchTerms.dateOfBirth) &&
        Objects.equals(this.documentNumber, updateIndividualScreeningRequestSearchTerms.documentNumber) &&
        Objects.equals(this.country, updateIndividualScreeningRequestSearchTerms.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(watchlistProgramId, legalName, dateOfBirth, documentNumber, country);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateIndividualScreeningRequestSearchTerms {\n");
    sb.append("    watchlistProgramId: ").append(toIndentedString(watchlistProgramId)).append("\n");
    sb.append("    legalName: ").append(toIndentedString(legalName)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    documentNumber: ").append(toIndentedString(documentNumber)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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

