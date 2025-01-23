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
import java.net.URI;

/**
 * Search terms associated with an entity used for searching against watchlists
 */
@ApiModel(description = "Search terms associated with an entity used for searching against watchlists")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-23T20:55:58.809242Z[Etc/UTC]")
public class EntityWatchlistScreeningSearchTerms {
  public static final String SERIALIZED_NAME_ENTITY_WATCHLIST_PROGRAM_ID = "entity_watchlist_program_id";
  @SerializedName(SERIALIZED_NAME_ENTITY_WATCHLIST_PROGRAM_ID)
  private String entityWatchlistProgramId;

  public static final String SERIALIZED_NAME_LEGAL_NAME = "legal_name";
  @SerializedName(SERIALIZED_NAME_LEGAL_NAME)
  private String legalName;

  public static final String SERIALIZED_NAME_DOCUMENT_NUMBER = "document_number";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_NUMBER)
  private String documentNumber;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESS = "email_address";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS)
  private String emailAddress;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phone_number";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private URI url;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Integer version;


  public EntityWatchlistScreeningSearchTerms entityWatchlistProgramId(String entityWatchlistProgramId) {
    
    this.entityWatchlistProgramId = entityWatchlistProgramId;
    return this;
  }

   /**
   * ID of the associated entity program.
   * @return entityWatchlistProgramId
  **/
  @ApiModelProperty(example = "entprg_2eRPsDnL66rZ7H", required = true, value = "ID of the associated entity program.")

  public String getEntityWatchlistProgramId() {
    return entityWatchlistProgramId;
  }


  public void setEntityWatchlistProgramId(String entityWatchlistProgramId) {
    this.entityWatchlistProgramId = entityWatchlistProgramId;
  }


  public EntityWatchlistScreeningSearchTerms legalName(String legalName) {
    
    this.legalName = legalName;
    return this;
  }

   /**
   * The name of the organization being screened. Must have at least one alphabetical character, have a maximum length of 100 characters, and not include leading or trailing spaces.
   * @return legalName
  **/
  @ApiModelProperty(example = "Al-Qaida", required = true, value = "The name of the organization being screened. Must have at least one alphabetical character, have a maximum length of 100 characters, and not include leading or trailing spaces.")

  public String getLegalName() {
    return legalName;
  }


  public void setLegalName(String legalName) {
    this.legalName = legalName;
  }


  public EntityWatchlistScreeningSearchTerms documentNumber(String documentNumber) {
    
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


  public EntityWatchlistScreeningSearchTerms emailAddress(String emailAddress) {
    
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * A valid email address. Must not have leading or trailing spaces and address must be RFC compliant. For more information, see [RFC 3696](https://datatracker.ietf.org/doc/html/rfc3696).
   * @return emailAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "user@example.com", required = true, value = "A valid email address. Must not have leading or trailing spaces and address must be RFC compliant. For more information, see [RFC 3696](https://datatracker.ietf.org/doc/html/rfc3696).")

  public String getEmailAddress() {
    return emailAddress;
  }


  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }


  public EntityWatchlistScreeningSearchTerms country(String country) {
    
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


  public EntityWatchlistScreeningSearchTerms phoneNumber(String phoneNumber) {
    
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * A phone number in E.164 format.
   * @return phoneNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "+14025671234", required = true, value = "A phone number in E.164 format.")

  public String getPhoneNumber() {
    return phoneNumber;
  }


  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public EntityWatchlistScreeningSearchTerms url(URI url) {
    
    this.url = url;
    return this;
  }

   /**
   * An &#39;http&#39; or &#39;https&#39; URL (must begin with either of those).
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://example.com", required = true, value = "An 'http' or 'https' URL (must begin with either of those).")

  public URI getUrl() {
    return url;
  }


  public void setUrl(URI url) {
    this.url = url;
  }


  public EntityWatchlistScreeningSearchTerms version(Integer version) {
    
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
    EntityWatchlistScreeningSearchTerms entityWatchlistScreeningSearchTerms = (EntityWatchlistScreeningSearchTerms) o;
    return Objects.equals(this.entityWatchlistProgramId, entityWatchlistScreeningSearchTerms.entityWatchlistProgramId) &&
        Objects.equals(this.legalName, entityWatchlistScreeningSearchTerms.legalName) &&
        Objects.equals(this.documentNumber, entityWatchlistScreeningSearchTerms.documentNumber) &&
        Objects.equals(this.emailAddress, entityWatchlistScreeningSearchTerms.emailAddress) &&
        Objects.equals(this.country, entityWatchlistScreeningSearchTerms.country) &&
        Objects.equals(this.phoneNumber, entityWatchlistScreeningSearchTerms.phoneNumber) &&
        Objects.equals(this.url, entityWatchlistScreeningSearchTerms.url) &&
        Objects.equals(this.version, entityWatchlistScreeningSearchTerms.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityWatchlistProgramId, legalName, documentNumber, emailAddress, country, phoneNumber, url, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityWatchlistScreeningSearchTerms {\n");
    sb.append("    entityWatchlistProgramId: ").append(toIndentedString(entityWatchlistProgramId)).append("\n");
    sb.append("    legalName: ").append(toIndentedString(legalName)).append("\n");
    sb.append("    documentNumber: ").append(toIndentedString(documentNumber)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

