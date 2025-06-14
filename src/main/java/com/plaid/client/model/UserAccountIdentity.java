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
import com.plaid.client.model.UserAccountIdentityAddress;
import com.plaid.client.model.UserAccountIdentityName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The identity data permissioned by the end user during the authorization flow.
 */
@ApiModel(description = "The identity data permissioned by the end user during the authorization flow.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-12T21:24:48.076128Z[Etc/UTC]")
public class UserAccountIdentity {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private UserAccountIdentityName name;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private UserAccountIdentityAddress address;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phone_number";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_DATE_OF_BIRTH = "date_of_birth";
  @SerializedName(SERIALIZED_NAME_DATE_OF_BIRTH)
  private String dateOfBirth;

  public static final String SERIALIZED_NAME_SSN = "ssn";
  @SerializedName(SERIALIZED_NAME_SSN)
  private String ssn;

  public static final String SERIALIZED_NAME_SSN_LAST4 = "ssn_last_4";
  @SerializedName(SERIALIZED_NAME_SSN_LAST4)
  private String ssnLast4;


  public UserAccountIdentity name(UserAccountIdentityName name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UserAccountIdentityName getName() {
    return name;
  }


  public void setName(UserAccountIdentityName name) {
    this.name = name;
  }


  public UserAccountIdentity address(UserAccountIdentityAddress address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UserAccountIdentityAddress getAddress() {
    return address;
  }


  public void setAddress(UserAccountIdentityAddress address) {
    this.address = address;
  }


  public UserAccountIdentity phoneNumber(String phoneNumber) {
    
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * The user&#39;s phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format
   * @return phoneNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The user's phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format")

  public String getPhoneNumber() {
    return phoneNumber;
  }


  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public UserAccountIdentity email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * The user&#39;s email address.  Note: email is currently not returned for users, and will be added later in 2025.
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The user's email address.  Note: email is currently not returned for users, and will be added later in 2025.")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public UserAccountIdentity dateOfBirth(String dateOfBirth) {
    
    this.dateOfBirth = dateOfBirth;
    return this;
  }

   /**
   * The user&#39;s date of birth.
   * @return dateOfBirth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The user's date of birth.")

  public String getDateOfBirth() {
    return dateOfBirth;
  }


  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }


  public UserAccountIdentity ssn(String ssn) {
    
    this.ssn = ssn;
    return this;
  }

   /**
   * The user&#39;s social security number.
   * @return ssn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The user's social security number.")

  public String getSsn() {
    return ssn;
  }


  public void setSsn(String ssn) {
    this.ssn = ssn;
  }


  public UserAccountIdentity ssnLast4(String ssnLast4) {
    
    this.ssnLast4 = ssnLast4;
    return this;
  }

   /**
   * The last 4 digits of the user&#39;s social security number.
   * @return ssnLast4
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The last 4 digits of the user's social security number.")

  public String getSsnLast4() {
    return ssnLast4;
  }


  public void setSsnLast4(String ssnLast4) {
    this.ssnLast4 = ssnLast4;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserAccountIdentity userAccountIdentity = (UserAccountIdentity) o;
    return Objects.equals(this.name, userAccountIdentity.name) &&
        Objects.equals(this.address, userAccountIdentity.address) &&
        Objects.equals(this.phoneNumber, userAccountIdentity.phoneNumber) &&
        Objects.equals(this.email, userAccountIdentity.email) &&
        Objects.equals(this.dateOfBirth, userAccountIdentity.dateOfBirth) &&
        Objects.equals(this.ssn, userAccountIdentity.ssn) &&
        Objects.equals(this.ssnLast4, userAccountIdentity.ssnLast4);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, address, phoneNumber, email, dateOfBirth, ssn, ssnLast4);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAccountIdentity {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    ssn: ").append(toIndentedString(ssn)).append("\n");
    sb.append("    ssnLast4: ").append(toIndentedString(ssnLast4)).append("\n");
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

