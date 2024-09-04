/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.556.0
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
import com.plaid.client.model.KYCCheckAddressSummary;
import com.plaid.client.model.KYCCheckDateOfBirthSummary;
import com.plaid.client.model.KYCCheckIDNumberSummary;
import com.plaid.client.model.KYCCheckNameSummary;
import com.plaid.client.model.KYCCheckPhoneSummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Additional information for the &#x60;kyc_check&#x60; step. This field will be &#x60;null&#x60; unless &#x60;steps.kyc_check&#x60; has reached a terminal state of either &#x60;success&#x60; or &#x60;failed&#x60;.
 */
@ApiModel(description = "Additional information for the `kyc_check` step. This field will be `null` unless `steps.kyc_check` has reached a terminal state of either `success` or `failed`.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-04T20:03:42.500463Z[Etc/UTC]")
public class KYCCheckDetails {
  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private KYCCheckAddressSummary address;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private KYCCheckNameSummary name;

  public static final String SERIALIZED_NAME_DATE_OF_BIRTH = "date_of_birth";
  @SerializedName(SERIALIZED_NAME_DATE_OF_BIRTH)
  private KYCCheckDateOfBirthSummary dateOfBirth;

  public static final String SERIALIZED_NAME_ID_NUMBER = "id_number";
  @SerializedName(SERIALIZED_NAME_ID_NUMBER)
  private KYCCheckIDNumberSummary idNumber;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phone_number";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private KYCCheckPhoneSummary phoneNumber;


  public KYCCheckDetails status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * The outcome status for the associated Identity Verification attempt&#39;s &#x60;kyc_check&#x60; step. This field will always have the same value as &#x60;steps.kyc_check&#x60;.
   * @return status
  **/
  @ApiModelProperty(example = "success", required = true, value = "The outcome status for the associated Identity Verification attempt's `kyc_check` step. This field will always have the same value as `steps.kyc_check`.")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public KYCCheckDetails address(KYCCheckAddressSummary address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(required = true, value = "")

  public KYCCheckAddressSummary getAddress() {
    return address;
  }


  public void setAddress(KYCCheckAddressSummary address) {
    this.address = address;
  }


  public KYCCheckDetails name(KYCCheckNameSummary name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")

  public KYCCheckNameSummary getName() {
    return name;
  }


  public void setName(KYCCheckNameSummary name) {
    this.name = name;
  }


  public KYCCheckDetails dateOfBirth(KYCCheckDateOfBirthSummary dateOfBirth) {
    
    this.dateOfBirth = dateOfBirth;
    return this;
  }

   /**
   * Get dateOfBirth
   * @return dateOfBirth
  **/
  @ApiModelProperty(required = true, value = "")

  public KYCCheckDateOfBirthSummary getDateOfBirth() {
    return dateOfBirth;
  }


  public void setDateOfBirth(KYCCheckDateOfBirthSummary dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }


  public KYCCheckDetails idNumber(KYCCheckIDNumberSummary idNumber) {
    
    this.idNumber = idNumber;
    return this;
  }

   /**
   * Get idNumber
   * @return idNumber
  **/
  @ApiModelProperty(required = true, value = "")

  public KYCCheckIDNumberSummary getIdNumber() {
    return idNumber;
  }


  public void setIdNumber(KYCCheckIDNumberSummary idNumber) {
    this.idNumber = idNumber;
  }


  public KYCCheckDetails phoneNumber(KYCCheckPhoneSummary phoneNumber) {
    
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Get phoneNumber
   * @return phoneNumber
  **/
  @ApiModelProperty(required = true, value = "")

  public KYCCheckPhoneSummary getPhoneNumber() {
    return phoneNumber;
  }


  public void setPhoneNumber(KYCCheckPhoneSummary phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KYCCheckDetails kyCCheckDetails = (KYCCheckDetails) o;
    return Objects.equals(this.status, kyCCheckDetails.status) &&
        Objects.equals(this.address, kyCCheckDetails.address) &&
        Objects.equals(this.name, kyCCheckDetails.name) &&
        Objects.equals(this.dateOfBirth, kyCCheckDetails.dateOfBirth) &&
        Objects.equals(this.idNumber, kyCCheckDetails.idNumber) &&
        Objects.equals(this.phoneNumber, kyCCheckDetails.phoneNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, address, name, dateOfBirth, idNumber, phoneNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KYCCheckDetails {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    idNumber: ").append(toIndentedString(idNumber)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
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

