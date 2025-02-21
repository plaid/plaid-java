/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.620.0
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
import com.plaid.client.model.EntityScreeningHitDocumentsItems;
import com.plaid.client.model.EntityScreeningHitEmailsItems;
import com.plaid.client.model.EntityScreeningHitNamesItems;
import com.plaid.client.model.EntityScreeningHitUrlsItems;
import com.plaid.client.model.EntityScreeningHitsPhoneNumberItems;
import com.plaid.client.model.GenericScreeningHitLocationItems;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Information associated with the entity watchlist hit
 */
@ApiModel(description = "Information associated with the entity watchlist hit")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-21T16:44:11.345889Z[Etc/UTC]")
public class EntityScreeningHitData {
  public static final String SERIALIZED_NAME_DOCUMENTS = "documents";
  @SerializedName(SERIALIZED_NAME_DOCUMENTS)
  private List<EntityScreeningHitDocumentsItems> documents = null;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESSES = "email_addresses";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESSES)
  private List<EntityScreeningHitEmailsItems> emailAddresses = null;

  public static final String SERIALIZED_NAME_LOCATIONS = "locations";
  @SerializedName(SERIALIZED_NAME_LOCATIONS)
  private List<GenericScreeningHitLocationItems> locations = null;

  public static final String SERIALIZED_NAME_NAMES = "names";
  @SerializedName(SERIALIZED_NAME_NAMES)
  private List<EntityScreeningHitNamesItems> names = null;

  public static final String SERIALIZED_NAME_PHONE_NUMBERS = "phone_numbers";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBERS)
  private List<EntityScreeningHitsPhoneNumberItems> phoneNumbers = null;

  public static final String SERIALIZED_NAME_URLS = "urls";
  @SerializedName(SERIALIZED_NAME_URLS)
  private List<EntityScreeningHitUrlsItems> urls = null;


  public EntityScreeningHitData documents(List<EntityScreeningHitDocumentsItems> documents) {
    
    this.documents = documents;
    return this;
  }

  public EntityScreeningHitData addDocumentsItem(EntityScreeningHitDocumentsItems documentsItem) {
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

  public List<EntityScreeningHitDocumentsItems> getDocuments() {
    return documents;
  }


  public void setDocuments(List<EntityScreeningHitDocumentsItems> documents) {
    this.documents = documents;
  }


  public EntityScreeningHitData emailAddresses(List<EntityScreeningHitEmailsItems> emailAddresses) {
    
    this.emailAddresses = emailAddresses;
    return this;
  }

  public EntityScreeningHitData addEmailAddressesItem(EntityScreeningHitEmailsItems emailAddressesItem) {
    if (this.emailAddresses == null) {
      this.emailAddresses = new ArrayList<>();
    }
    this.emailAddresses.add(emailAddressesItem);
    return this;
  }

   /**
   * Email addresses associated with the watchlist hit
   * @return emailAddresses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Email addresses associated with the watchlist hit")

  public List<EntityScreeningHitEmailsItems> getEmailAddresses() {
    return emailAddresses;
  }


  public void setEmailAddresses(List<EntityScreeningHitEmailsItems> emailAddresses) {
    this.emailAddresses = emailAddresses;
  }


  public EntityScreeningHitData locations(List<GenericScreeningHitLocationItems> locations) {
    
    this.locations = locations;
    return this;
  }

  public EntityScreeningHitData addLocationsItem(GenericScreeningHitLocationItems locationsItem) {
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


  public EntityScreeningHitData names(List<EntityScreeningHitNamesItems> names) {
    
    this.names = names;
    return this;
  }

  public EntityScreeningHitData addNamesItem(EntityScreeningHitNamesItems namesItem) {
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

  public List<EntityScreeningHitNamesItems> getNames() {
    return names;
  }


  public void setNames(List<EntityScreeningHitNamesItems> names) {
    this.names = names;
  }


  public EntityScreeningHitData phoneNumbers(List<EntityScreeningHitsPhoneNumberItems> phoneNumbers) {
    
    this.phoneNumbers = phoneNumbers;
    return this;
  }

  public EntityScreeningHitData addPhoneNumbersItem(EntityScreeningHitsPhoneNumberItems phoneNumbersItem) {
    if (this.phoneNumbers == null) {
      this.phoneNumbers = new ArrayList<>();
    }
    this.phoneNumbers.add(phoneNumbersItem);
    return this;
  }

   /**
   * Phone numbers associated with the watchlist hit
   * @return phoneNumbers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Phone numbers associated with the watchlist hit")

  public List<EntityScreeningHitsPhoneNumberItems> getPhoneNumbers() {
    return phoneNumbers;
  }


  public void setPhoneNumbers(List<EntityScreeningHitsPhoneNumberItems> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
  }


  public EntityScreeningHitData urls(List<EntityScreeningHitUrlsItems> urls) {
    
    this.urls = urls;
    return this;
  }

  public EntityScreeningHitData addUrlsItem(EntityScreeningHitUrlsItems urlsItem) {
    if (this.urls == null) {
      this.urls = new ArrayList<>();
    }
    this.urls.add(urlsItem);
    return this;
  }

   /**
   * URLs associated with the watchlist hit
   * @return urls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "URLs associated with the watchlist hit")

  public List<EntityScreeningHitUrlsItems> getUrls() {
    return urls;
  }


  public void setUrls(List<EntityScreeningHitUrlsItems> urls) {
    this.urls = urls;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityScreeningHitData entityScreeningHitData = (EntityScreeningHitData) o;
    return Objects.equals(this.documents, entityScreeningHitData.documents) &&
        Objects.equals(this.emailAddresses, entityScreeningHitData.emailAddresses) &&
        Objects.equals(this.locations, entityScreeningHitData.locations) &&
        Objects.equals(this.names, entityScreeningHitData.names) &&
        Objects.equals(this.phoneNumbers, entityScreeningHitData.phoneNumbers) &&
        Objects.equals(this.urls, entityScreeningHitData.urls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documents, emailAddresses, locations, names, phoneNumbers, urls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityScreeningHitData {\n");
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
    sb.append("    emailAddresses: ").append(toIndentedString(emailAddresses)).append("\n");
    sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    phoneNumbers: ").append(toIndentedString(phoneNumbers)).append("\n");
    sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
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

