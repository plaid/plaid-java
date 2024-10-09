/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.575.0
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
import com.plaid.client.model.AddressPurposeLabel;
import com.plaid.client.model.HiddenMatchSummaryCode;
import com.plaid.client.model.KYCCheckDetailsInternationalAddress;
import com.plaid.client.model.MatchSummaryCode;
import com.plaid.client.model.POBoxStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Result summary object specifying how the &#x60;address&#x60; field matched.
 */
@ApiModel(description = "Result summary object specifying how the `address` field matched.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-09T17:51:17.896278Z[Etc/UTC]")
public class KYCCheckAddressSummary {
  public static final String SERIALIZED_NAME_SUMMARY = "summary";
  @SerializedName(SERIALIZED_NAME_SUMMARY)
  private MatchSummaryCode summary;

  public static final String SERIALIZED_NAME_PO_BOX = "po_box";
  @SerializedName(SERIALIZED_NAME_PO_BOX)
  private POBoxStatus poBox;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private AddressPurposeLabel type;

  public static final String SERIALIZED_NAME_STREET = "street";
  @SerializedName(SERIALIZED_NAME_STREET)
  private HiddenMatchSummaryCode street;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private HiddenMatchSummaryCode city;

  public static final String SERIALIZED_NAME_REGION = "region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private HiddenMatchSummaryCode region;

  public static final String SERIALIZED_NAME_POSTAL_CODE = "postal_code";
  @SerializedName(SERIALIZED_NAME_POSTAL_CODE)
  private HiddenMatchSummaryCode postalCode;

  public static final String SERIALIZED_NAME_INTERNATIONAL_DETAILS = "international_details";
  @SerializedName(SERIALIZED_NAME_INTERNATIONAL_DETAILS)
  private KYCCheckDetailsInternationalAddress internationalDetails;


  public KYCCheckAddressSummary summary(MatchSummaryCode summary) {
    
    this.summary = summary;
    return this;
  }

   /**
   * Get summary
   * @return summary
  **/
  @ApiModelProperty(required = true, value = "")

  public MatchSummaryCode getSummary() {
    return summary;
  }


  public void setSummary(MatchSummaryCode summary) {
    this.summary = summary;
  }


  public KYCCheckAddressSummary poBox(POBoxStatus poBox) {
    
    this.poBox = poBox;
    return this;
  }

   /**
   * Get poBox
   * @return poBox
  **/
  @ApiModelProperty(required = true, value = "")

  public POBoxStatus getPoBox() {
    return poBox;
  }


  public void setPoBox(POBoxStatus poBox) {
    this.poBox = poBox;
  }


  public KYCCheckAddressSummary type(AddressPurposeLabel type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")

  public AddressPurposeLabel getType() {
    return type;
  }


  public void setType(AddressPurposeLabel type) {
    this.type = type;
  }


  public KYCCheckAddressSummary street(HiddenMatchSummaryCode street) {
    
    this.street = street;
    return this;
  }

   /**
   * Get street
   * @return street
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HiddenMatchSummaryCode getStreet() {
    return street;
  }


  public void setStreet(HiddenMatchSummaryCode street) {
    this.street = street;
  }


  public KYCCheckAddressSummary city(HiddenMatchSummaryCode city) {
    
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HiddenMatchSummaryCode getCity() {
    return city;
  }


  public void setCity(HiddenMatchSummaryCode city) {
    this.city = city;
  }


  public KYCCheckAddressSummary region(HiddenMatchSummaryCode region) {
    
    this.region = region;
    return this;
  }

   /**
   * Get region
   * @return region
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HiddenMatchSummaryCode getRegion() {
    return region;
  }


  public void setRegion(HiddenMatchSummaryCode region) {
    this.region = region;
  }


  public KYCCheckAddressSummary postalCode(HiddenMatchSummaryCode postalCode) {
    
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Get postalCode
   * @return postalCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HiddenMatchSummaryCode getPostalCode() {
    return postalCode;
  }


  public void setPostalCode(HiddenMatchSummaryCode postalCode) {
    this.postalCode = postalCode;
  }


  public KYCCheckAddressSummary internationalDetails(KYCCheckDetailsInternationalAddress internationalDetails) {
    
    this.internationalDetails = internationalDetails;
    return this;
  }

   /**
   * Get internationalDetails
   * @return internationalDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public KYCCheckDetailsInternationalAddress getInternationalDetails() {
    return internationalDetails;
  }


  public void setInternationalDetails(KYCCheckDetailsInternationalAddress internationalDetails) {
    this.internationalDetails = internationalDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KYCCheckAddressSummary kyCCheckAddressSummary = (KYCCheckAddressSummary) o;
    return Objects.equals(this.summary, kyCCheckAddressSummary.summary) &&
        Objects.equals(this.poBox, kyCCheckAddressSummary.poBox) &&
        Objects.equals(this.type, kyCCheckAddressSummary.type) &&
        Objects.equals(this.street, kyCCheckAddressSummary.street) &&
        Objects.equals(this.city, kyCCheckAddressSummary.city) &&
        Objects.equals(this.region, kyCCheckAddressSummary.region) &&
        Objects.equals(this.postalCode, kyCCheckAddressSummary.postalCode) &&
        Objects.equals(this.internationalDetails, kyCCheckAddressSummary.internationalDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(summary, poBox, type, street, city, region, postalCode, internationalDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KYCCheckAddressSummary {\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    poBox: ").append(toIndentedString(poBox)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    internationalDetails: ").append(toIndentedString(internationalDetails)).append("\n");
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

