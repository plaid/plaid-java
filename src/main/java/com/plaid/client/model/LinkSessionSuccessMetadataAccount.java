/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.617.1
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
 * An account attached to the connected Item.
 */
@ApiModel(description = "An account attached to the connected Item.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-07T19:05:33.763924Z[Etc/UTC]")
public class LinkSessionSuccessMetadataAccount {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_MASK = "mask";
  @SerializedName(SERIALIZED_NAME_MASK)
  private String mask;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_SUBTYPE = "subtype";
  @SerializedName(SERIALIZED_NAME_SUBTYPE)
  private String subtype;

  public static final String SERIALIZED_NAME_VERIFICATION_STATUS = "verification_status";
  @SerializedName(SERIALIZED_NAME_VERIFICATION_STATUS)
  private String verificationStatus;

  public static final String SERIALIZED_NAME_CLASS_TYPE = "class_type";
  @SerializedName(SERIALIZED_NAME_CLASS_TYPE)
  private String classType;


  public LinkSessionSuccessMetadataAccount id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The Plaid &#x60;account_id&#x60; 
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Plaid `account_id` ")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public LinkSessionSuccessMetadataAccount name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The official account name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The official account name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public LinkSessionSuccessMetadataAccount mask(String mask) {
    
    this.mask = mask;
    return this;
  }

   /**
   * The last 2-4 alphanumeric characters of an account&#39;s official account number. Note that the mask may be non-unique between an Item&#39;s accounts. It may also not match the mask that the bank displays to the user.
   * @return mask
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The last 2-4 alphanumeric characters of an account's official account number. Note that the mask may be non-unique between an Item's accounts. It may also not match the mask that the bank displays to the user.")

  public String getMask() {
    return mask;
  }


  public void setMask(String mask) {
    this.mask = mask;
  }


  public LinkSessionSuccessMetadataAccount type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The account type. See the [Account schema](/docs/api/accounts#account-type-schema) for a full list of possible values
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The account type. See the [Account schema](/docs/api/accounts#account-type-schema) for a full list of possible values")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public LinkSessionSuccessMetadataAccount subtype(String subtype) {
    
    this.subtype = subtype;
    return this;
  }

   /**
   * The account subtype. See the [Account schema](/docs/api/accounts#account-type-schema) for a full list of possible values
   * @return subtype
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The account subtype. See the [Account schema](/docs/api/accounts#account-type-schema) for a full list of possible values")

  public String getSubtype() {
    return subtype;
  }


  public void setSubtype(String subtype) {
    this.subtype = subtype;
  }


  public LinkSessionSuccessMetadataAccount verificationStatus(String verificationStatus) {
    
    this.verificationStatus = verificationStatus;
    return this;
  }

   /**
   * Indicates an Item&#39;s micro-deposit-based verification or database verification status. Possible values are:  &#x60;pending_automatic_verification&#x60;: The Item is pending automatic verification  &#x60;pending_manual_verification&#x60;: The Item is pending manual micro-deposit verification. Items remain in this state until the user successfully verifies the code.  &#x60;automatically_verified&#x60;: The Item has successfully been automatically verified  &#x60;manually_verified&#x60;: The Item has successfully been manually verified  &#x60;verification_expired&#x60;: Plaid was unable to automatically verify the deposit within 7 calendar days and will no longer attempt to validate the Item. Users may retry by submitting their information again through Link.  &#x60;verification_failed&#x60;: The Item failed manual micro-deposit verification because the user exhausted all 3 verification attempts. Users may retry by submitting their information again through Link.  &#x60;database_matched&#x60;: The Item has successfully been verified using Plaid&#39;s data sources.  &#x60;database_insights_pending&#x60;: The Database Insights result is pending and will be available upon Auth request. Note: Database Insights is currently a beta feature, please contact your account manager for more information.  &#x60;null&#x60;: Neither micro-deposit-based verification nor database verification are being used for the Item. 
   * @return verificationStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates an Item's micro-deposit-based verification or database verification status. Possible values are:  `pending_automatic_verification`: The Item is pending automatic verification  `pending_manual_verification`: The Item is pending manual micro-deposit verification. Items remain in this state until the user successfully verifies the code.  `automatically_verified`: The Item has successfully been automatically verified  `manually_verified`: The Item has successfully been manually verified  `verification_expired`: Plaid was unable to automatically verify the deposit within 7 calendar days and will no longer attempt to validate the Item. Users may retry by submitting their information again through Link.  `verification_failed`: The Item failed manual micro-deposit verification because the user exhausted all 3 verification attempts. Users may retry by submitting their information again through Link.  `database_matched`: The Item has successfully been verified using Plaid's data sources.  `database_insights_pending`: The Database Insights result is pending and will be available upon Auth request. Note: Database Insights is currently a beta feature, please contact your account manager for more information.  `null`: Neither micro-deposit-based verification nor database verification are being used for the Item. ")

  public String getVerificationStatus() {
    return verificationStatus;
  }


  public void setVerificationStatus(String verificationStatus) {
    this.verificationStatus = verificationStatus;
  }


  public LinkSessionSuccessMetadataAccount classType(String classType) {
    
    this.classType = classType;
    return this;
  }

   /**
   * If micro-deposit verification was being used, indicates the user&#39;s selection when asked if the account being verified is a &#x60;business&#x60; or &#x60;personal&#x60; account. This field is deprecated as Plaid no longer collects this information during the micro-deposit flow. To see whether an account is business or personal, use the &#x60;holder_category&#x60; field instead.
   * @return classType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If micro-deposit verification was being used, indicates the user's selection when asked if the account being verified is a `business` or `personal` account. This field is deprecated as Plaid no longer collects this information during the micro-deposit flow. To see whether an account is business or personal, use the `holder_category` field instead.")

  public String getClassType() {
    return classType;
  }


  public void setClassType(String classType) {
    this.classType = classType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkSessionSuccessMetadataAccount linkSessionSuccessMetadataAccount = (LinkSessionSuccessMetadataAccount) o;
    return Objects.equals(this.id, linkSessionSuccessMetadataAccount.id) &&
        Objects.equals(this.name, linkSessionSuccessMetadataAccount.name) &&
        Objects.equals(this.mask, linkSessionSuccessMetadataAccount.mask) &&
        Objects.equals(this.type, linkSessionSuccessMetadataAccount.type) &&
        Objects.equals(this.subtype, linkSessionSuccessMetadataAccount.subtype) &&
        Objects.equals(this.verificationStatus, linkSessionSuccessMetadataAccount.verificationStatus) &&
        Objects.equals(this.classType, linkSessionSuccessMetadataAccount.classType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, mask, type, subtype, verificationStatus, classType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkSessionSuccessMetadataAccount {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    mask: ").append(toIndentedString(mask)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    subtype: ").append(toIndentedString(subtype)).append("\n");
    sb.append("    verificationStatus: ").append(toIndentedString(verificationStatus)).append("\n");
    sb.append("    classType: ").append(toIndentedString(classType)).append("\n");
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

