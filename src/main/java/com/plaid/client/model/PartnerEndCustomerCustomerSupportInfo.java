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

/**
 * This information is public. Users of your app will see this information when managing connections between your app and their bank accounts in Plaid Portal. Defaults to partner&#39;s customer support info if omitted. This field is mandatory for partners whose Plaid accounts were created after November 26, 2024 and will be mandatory for all partners by the 1033 compliance deadline.
 */
@ApiModel(description = "This information is public. Users of your app will see this information when managing connections between your app and their bank accounts in Plaid Portal. Defaults to partner's customer support info if omitted. This field is mandatory for partners whose Plaid accounts were created after November 26, 2024 and will be mandatory for all partners by the 1033 compliance deadline.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-12T21:24:48.076128Z[Etc/UTC]")
public class PartnerEndCustomerCustomerSupportInfo {
  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phone_number";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber;

  public static final String SERIALIZED_NAME_CONTACT_URL = "contact_url";
  @SerializedName(SERIALIZED_NAME_CONTACT_URL)
  private String contactUrl;

  public static final String SERIALIZED_NAME_LINK_UPDATE_URL = "link_update_url";
  @SerializedName(SERIALIZED_NAME_LINK_UPDATE_URL)
  private String linkUpdateUrl;


  public PartnerEndCustomerCustomerSupportInfo email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * This field is mandatory for partners whose Plaid accounts were created after November 26, 2024 and will be mandatory for all partners by the 1033 compliance deadline.
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This field is mandatory for partners whose Plaid accounts were created after November 26, 2024 and will be mandatory for all partners by the 1033 compliance deadline.")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public PartnerEndCustomerCustomerSupportInfo phoneNumber(String phoneNumber) {
    
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Get phoneNumber
   * @return phoneNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPhoneNumber() {
    return phoneNumber;
  }


  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public PartnerEndCustomerCustomerSupportInfo contactUrl(String contactUrl) {
    
    this.contactUrl = contactUrl;
    return this;
  }

   /**
   * Get contactUrl
   * @return contactUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getContactUrl() {
    return contactUrl;
  }


  public void setContactUrl(String contactUrl) {
    this.contactUrl = contactUrl;
  }


  public PartnerEndCustomerCustomerSupportInfo linkUpdateUrl(String linkUpdateUrl) {
    
    this.linkUpdateUrl = linkUpdateUrl;
    return this;
  }

   /**
   * Get linkUpdateUrl
   * @return linkUpdateUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLinkUpdateUrl() {
    return linkUpdateUrl;
  }


  public void setLinkUpdateUrl(String linkUpdateUrl) {
    this.linkUpdateUrl = linkUpdateUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartnerEndCustomerCustomerSupportInfo partnerEndCustomerCustomerSupportInfo = (PartnerEndCustomerCustomerSupportInfo) o;
    return Objects.equals(this.email, partnerEndCustomerCustomerSupportInfo.email) &&
        Objects.equals(this.phoneNumber, partnerEndCustomerCustomerSupportInfo.phoneNumber) &&
        Objects.equals(this.contactUrl, partnerEndCustomerCustomerSupportInfo.contactUrl) &&
        Objects.equals(this.linkUpdateUrl, partnerEndCustomerCustomerSupportInfo.linkUpdateUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, phoneNumber, contactUrl, linkUpdateUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartnerEndCustomerCustomerSupportInfo {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    contactUrl: ").append(toIndentedString(contactUrl)).append("\n");
    sb.append("    linkUpdateUrl: ").append(toIndentedString(linkUpdateUrl)).append("\n");
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

