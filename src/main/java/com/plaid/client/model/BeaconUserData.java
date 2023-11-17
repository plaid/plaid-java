/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.470.1
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
import com.plaid.client.model.BeaconUserAddress;
import com.plaid.client.model.BeaconUserIDNumber;
import com.plaid.client.model.BeaconUserName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;

/**
 * A Beacon User&#39;s data and resulting analysis when checked against duplicate records and the Beacon Fraud Network.
 */
@ApiModel(description = "A Beacon User's data and resulting analysis when checked against duplicate records and the Beacon Fraud Network.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-17T20:03:54.421530Z[Etc/UTC]")
public class BeaconUserData {
  public static final String SERIALIZED_NAME_DATE_OF_BIRTH = "date_of_birth";
  @SerializedName(SERIALIZED_NAME_DATE_OF_BIRTH)
  private LocalDate dateOfBirth;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private BeaconUserName name;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private BeaconUserAddress address;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESS = "email_address";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS)
  private String emailAddress;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phone_number";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber;

  public static final String SERIALIZED_NAME_ID_NUMBER = "id_number";
  @SerializedName(SERIALIZED_NAME_ID_NUMBER)
  private BeaconUserIDNumber idNumber;

  public static final String SERIALIZED_NAME_IP_ADDRESS = "ip_address";
  @SerializedName(SERIALIZED_NAME_IP_ADDRESS)
  private String ipAddress;


  public BeaconUserData dateOfBirth(LocalDate dateOfBirth) {
    
    this.dateOfBirth = dateOfBirth;
    return this;
  }

   /**
   * A date in the format YYYY-MM-DD (RFC 3339 Section 5.6).
   * @return dateOfBirth
  **/
  @ApiModelProperty(example = "Tue May 29 00:00:00 UTC 1990", required = true, value = "A date in the format YYYY-MM-DD (RFC 3339 Section 5.6).")

  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }


  public void setDateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }


  public BeaconUserData name(BeaconUserName name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")

  public BeaconUserName getName() {
    return name;
  }


  public void setName(BeaconUserName name) {
    this.name = name;
  }


  public BeaconUserData address(BeaconUserAddress address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(required = true, value = "")

  public BeaconUserAddress getAddress() {
    return address;
  }


  public void setAddress(BeaconUserAddress address) {
    this.address = address;
  }


  public BeaconUserData emailAddress(String emailAddress) {
    
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * A valid email address.
   * @return emailAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "user@example.com", required = true, value = "A valid email address.")

  public String getEmailAddress() {
    return emailAddress;
  }


  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }


  public BeaconUserData phoneNumber(String phoneNumber) {
    
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * A phone number in E.164 format.
   * @return phoneNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "+19876543212", required = true, value = "A phone number in E.164 format.")

  public String getPhoneNumber() {
    return phoneNumber;
  }


  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public BeaconUserData idNumber(BeaconUserIDNumber idNumber) {
    
    this.idNumber = idNumber;
    return this;
  }

   /**
   * Get idNumber
   * @return idNumber
  **/
  @ApiModelProperty(required = true, value = "")

  public BeaconUserIDNumber getIdNumber() {
    return idNumber;
  }


  public void setIdNumber(BeaconUserIDNumber idNumber) {
    this.idNumber = idNumber;
  }


  public BeaconUserData ipAddress(String ipAddress) {
    
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * An IPv4 or IPV6 address.
   * @return ipAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "192.0.2.42", required = true, value = "An IPv4 or IPV6 address.")

  public String getIpAddress() {
    return ipAddress;
  }


  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BeaconUserData beaconUserData = (BeaconUserData) o;
    return Objects.equals(this.dateOfBirth, beaconUserData.dateOfBirth) &&
        Objects.equals(this.name, beaconUserData.name) &&
        Objects.equals(this.address, beaconUserData.address) &&
        Objects.equals(this.emailAddress, beaconUserData.emailAddress) &&
        Objects.equals(this.phoneNumber, beaconUserData.phoneNumber) &&
        Objects.equals(this.idNumber, beaconUserData.idNumber) &&
        Objects.equals(this.ipAddress, beaconUserData.ipAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateOfBirth, name, address, emailAddress, phoneNumber, idNumber, ipAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BeaconUserData {\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    idNumber: ").append(toIndentedString(idNumber)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
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

