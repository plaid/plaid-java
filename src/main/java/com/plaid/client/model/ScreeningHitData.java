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
import com.plaid.client.model.GenericScreeningHitLocationItems;
import com.plaid.client.model.ScreeningHitDateOfBirthItem;
import com.plaid.client.model.ScreeningHitDocumentsItems;
import com.plaid.client.model.ScreeningHitNamesItems;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Information associated with the watchlist hit
 */
@ApiModel(description = "Information associated with the watchlist hit")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-12T21:24:48.076128Z[Etc/UTC]")
public class ScreeningHitData {
  public static final String SERIALIZED_NAME_DATES_OF_BIRTH = "dates_of_birth";
  @SerializedName(SERIALIZED_NAME_DATES_OF_BIRTH)
  private List<ScreeningHitDateOfBirthItem> datesOfBirth = null;

  public static final String SERIALIZED_NAME_DOCUMENTS = "documents";
  @SerializedName(SERIALIZED_NAME_DOCUMENTS)
  private List<ScreeningHitDocumentsItems> documents = null;

  public static final String SERIALIZED_NAME_LOCATIONS = "locations";
  @SerializedName(SERIALIZED_NAME_LOCATIONS)
  private List<GenericScreeningHitLocationItems> locations = null;

  public static final String SERIALIZED_NAME_NAMES = "names";
  @SerializedName(SERIALIZED_NAME_NAMES)
  private List<ScreeningHitNamesItems> names = null;


  public ScreeningHitData datesOfBirth(List<ScreeningHitDateOfBirthItem> datesOfBirth) {
    
    this.datesOfBirth = datesOfBirth;
    return this;
  }

  public ScreeningHitData addDatesOfBirthItem(ScreeningHitDateOfBirthItem datesOfBirthItem) {
    if (this.datesOfBirth == null) {
      this.datesOfBirth = new ArrayList<>();
    }
    this.datesOfBirth.add(datesOfBirthItem);
    return this;
  }

   /**
   * Dates of birth associated with the watchlist hit
   * @return datesOfBirth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Dates of birth associated with the watchlist hit")

  public List<ScreeningHitDateOfBirthItem> getDatesOfBirth() {
    return datesOfBirth;
  }


  public void setDatesOfBirth(List<ScreeningHitDateOfBirthItem> datesOfBirth) {
    this.datesOfBirth = datesOfBirth;
  }


  public ScreeningHitData documents(List<ScreeningHitDocumentsItems> documents) {
    
    this.documents = documents;
    return this;
  }

  public ScreeningHitData addDocumentsItem(ScreeningHitDocumentsItems documentsItem) {
    if (this.documents == null) {
      this.documents = new ArrayList<>();
    }
    this.documents.add(documentsItem);
    return this;
  }

   /**
   * Documents associated with the watchlist hit
   * @return documents
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Documents associated with the watchlist hit")

  public List<ScreeningHitDocumentsItems> getDocuments() {
    return documents;
  }


  public void setDocuments(List<ScreeningHitDocumentsItems> documents) {
    this.documents = documents;
  }


  public ScreeningHitData locations(List<GenericScreeningHitLocationItems> locations) {
    
    this.locations = locations;
    return this;
  }

  public ScreeningHitData addLocationsItem(GenericScreeningHitLocationItems locationsItem) {
    if (this.locations == null) {
      this.locations = new ArrayList<>();
    }
    this.locations.add(locationsItem);
    return this;
  }

   /**
   * Locations associated with the watchlist hit
   * @return locations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Locations associated with the watchlist hit")

  public List<GenericScreeningHitLocationItems> getLocations() {
    return locations;
  }


  public void setLocations(List<GenericScreeningHitLocationItems> locations) {
    this.locations = locations;
  }


  public ScreeningHitData names(List<ScreeningHitNamesItems> names) {
    
    this.names = names;
    return this;
  }

  public ScreeningHitData addNamesItem(ScreeningHitNamesItems namesItem) {
    if (this.names == null) {
      this.names = new ArrayList<>();
    }
    this.names.add(namesItem);
    return this;
  }

   /**
   * Names associated with the watchlist hit
   * @return names
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Names associated with the watchlist hit")

  public List<ScreeningHitNamesItems> getNames() {
    return names;
  }


  public void setNames(List<ScreeningHitNamesItems> names) {
    this.names = names;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScreeningHitData screeningHitData = (ScreeningHitData) o;
    return Objects.equals(this.datesOfBirth, screeningHitData.datesOfBirth) &&
        Objects.equals(this.documents, screeningHitData.documents) &&
        Objects.equals(this.locations, screeningHitData.locations) &&
        Objects.equals(this.names, screeningHitData.names);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datesOfBirth, documents, locations, names);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScreeningHitData {\n");
    sb.append("    datesOfBirth: ").append(toIndentedString(datesOfBirth)).append("\n");
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
    sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
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

