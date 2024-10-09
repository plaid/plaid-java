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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Recipient metadata fields that are defined by FDX
 */
@ApiModel(description = "Recipient metadata fields that are defined by FDX")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-09T17:51:17.896278Z[Etc/UTC]")
public class FDXRecipientMetadata {
  public static final String SERIALIZED_NAME_RECIPIENT_ID = "recipient_id";
  @SerializedName(SERIALIZED_NAME_RECIPIENT_ID)
  private String recipientId;

  public static final String SERIALIZED_NAME_CLIENT_NAME = "client_name";
  @SerializedName(SERIALIZED_NAME_CLIENT_NAME)
  private String clientName;

  public static final String SERIALIZED_NAME_LOGO_URI = "logo_uri";
  @SerializedName(SERIALIZED_NAME_LOGO_URI)
  private String logoUri;

  public static final String SERIALIZED_NAME_THIRD_PARTY_LEGAL_NAME = "third_party_legal_name";
  @SerializedName(SERIALIZED_NAME_THIRD_PARTY_LEGAL_NAME)
  private String thirdPartyLegalName;


  public FDXRecipientMetadata recipientId(String recipientId) {
    
    this.recipientId = recipientId;
    return this;
  }

   /**
   * The recipient identifier
   * @return recipientId
  **/
  @ApiModelProperty(required = true, value = "The recipient identifier")

  public String getRecipientId() {
    return recipientId;
  }


  public void setRecipientId(String recipientId) {
    this.recipientId = recipientId;
  }


  public FDXRecipientMetadata clientName(String clientName) {
    
    this.clientName = clientName;
    return this;
  }

   /**
   * The recipient name displayed by the Data Provider during the consent flow
   * @return clientName
  **/
  @ApiModelProperty(required = true, value = "The recipient name displayed by the Data Provider during the consent flow")

  public String getClientName() {
    return clientName;
  }


  public void setClientName(String clientName) {
    this.clientName = clientName;
  }


  public FDXRecipientMetadata logoUri(String logoUri) {
    
    this.logoUri = logoUri;
    return this;
  }

   /**
   * Data Recipient Logo URL location
   * @return logoUri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Data Recipient Logo URL location")

  public String getLogoUri() {
    return logoUri;
  }


  public void setLogoUri(String logoUri) {
    this.logoUri = logoUri;
  }


  public FDXRecipientMetadata thirdPartyLegalName(String thirdPartyLegalName) {
    
    this.thirdPartyLegalName = thirdPartyLegalName;
    return this;
  }

   /**
   * The legal name of the recipient
   * @return thirdPartyLegalName
  **/
  @ApiModelProperty(required = true, value = "The legal name of the recipient")

  public String getThirdPartyLegalName() {
    return thirdPartyLegalName;
  }


  public void setThirdPartyLegalName(String thirdPartyLegalName) {
    this.thirdPartyLegalName = thirdPartyLegalName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FDXRecipientMetadata fdXRecipientMetadata = (FDXRecipientMetadata) o;
    return Objects.equals(this.recipientId, fdXRecipientMetadata.recipientId) &&
        Objects.equals(this.clientName, fdXRecipientMetadata.clientName) &&
        Objects.equals(this.logoUri, fdXRecipientMetadata.logoUri) &&
        Objects.equals(this.thirdPartyLegalName, fdXRecipientMetadata.thirdPartyLegalName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recipientId, clientName, logoUri, thirdPartyLegalName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FDXRecipientMetadata {\n");
    sb.append("    recipientId: ").append(toIndentedString(recipientId)).append("\n");
    sb.append("    clientName: ").append(toIndentedString(clientName)).append("\n");
    sb.append("    logoUri: ").append(toIndentedString(logoUri)).append("\n");
    sb.append("    thirdPartyLegalName: ").append(toIndentedString(thirdPartyLegalName)).append("\n");
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

