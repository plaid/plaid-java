/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.565.0
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
import com.plaid.client.model.LinkDeliveryVerificationStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Information related to account attached to the connected Item
 */
@ApiModel(description = "Information related to account attached to the connected Item")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-17T16:42:02.150702Z[Etc/UTC]")
public class LinkDeliveryAccount {
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
  private LinkDeliveryVerificationStatus verificationStatus;

  public static final String SERIALIZED_NAME_CLASS_TYPE = "class_type";
  @SerializedName(SERIALIZED_NAME_CLASS_TYPE)
  private String classType;


  public LinkDeliveryAccount id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The Plaid &#x60;account_id&#x60;
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Plaid `account_id`")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public LinkDeliveryAccount name(String name) {
    
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


  public LinkDeliveryAccount mask(String mask) {
    
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


  public LinkDeliveryAccount type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The account type. See the [Account schema](https://plaid.com/docs/api/accounts/#account-type-schema) for a full list of possible values
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The account type. See the [Account schema](https://plaid.com/docs/api/accounts/#account-type-schema) for a full list of possible values")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public LinkDeliveryAccount subtype(String subtype) {
    
    this.subtype = subtype;
    return this;
  }

   /**
   * The account subtype. See the [Account schema](https://plaid.com/docs/api/accounts/#account-type-schema) for a full list of possible values
   * @return subtype
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The account subtype. See the [Account schema](https://plaid.com/docs/api/accounts/#account-type-schema) for a full list of possible values")

  public String getSubtype() {
    return subtype;
  }


  public void setSubtype(String subtype) {
    this.subtype = subtype;
  }


  public LinkDeliveryAccount verificationStatus(LinkDeliveryVerificationStatus verificationStatus) {
    
    this.verificationStatus = verificationStatus;
    return this;
  }

   /**
   * Get verificationStatus
   * @return verificationStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LinkDeliveryVerificationStatus getVerificationStatus() {
    return verificationStatus;
  }


  public void setVerificationStatus(LinkDeliveryVerificationStatus verificationStatus) {
    this.verificationStatus = verificationStatus;
  }


  public LinkDeliveryAccount classType(String classType) {
    
    this.classType = classType;
    return this;
  }

   /**
   * If micro-deposit verification is being used, indicates whether the account being verified is a &#x60;business&#x60; or &#x60;personal&#x60; account.
   * @return classType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If micro-deposit verification is being used, indicates whether the account being verified is a `business` or `personal` account.")

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
    LinkDeliveryAccount linkDeliveryAccount = (LinkDeliveryAccount) o;
    return Objects.equals(this.id, linkDeliveryAccount.id) &&
        Objects.equals(this.name, linkDeliveryAccount.name) &&
        Objects.equals(this.mask, linkDeliveryAccount.mask) &&
        Objects.equals(this.type, linkDeliveryAccount.type) &&
        Objects.equals(this.subtype, linkDeliveryAccount.subtype) &&
        Objects.equals(this.verificationStatus, linkDeliveryAccount.verificationStatus) &&
        Objects.equals(this.classType, linkDeliveryAccount.classType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, mask, type, subtype, verificationStatus, classType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkDeliveryAccount {\n");
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

