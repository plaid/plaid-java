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
import com.plaid.client.model.ExtendedRecipientMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * GetRecipientsResponse defines the response schema for &#x60;/fdx/recipients&#x60;
 */
@ApiModel(description = "GetRecipientsResponse defines the response schema for `/fdx/recipients`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-21T16:44:11.345889Z[Etc/UTC]")
public class GetRecipientsResponse {
  public static final String SERIALIZED_NAME_RECIPIENTS = "recipients";
  @SerializedName(SERIALIZED_NAME_RECIPIENTS)
  private List<ExtendedRecipientMetadata> recipients = new ArrayList<>();


  public GetRecipientsResponse recipients(List<ExtendedRecipientMetadata> recipients) {
    
    this.recipients = recipients;
    return this;
  }

  public GetRecipientsResponse addRecipientsItem(ExtendedRecipientMetadata recipientsItem) {
    this.recipients.add(recipientsItem);
    return this;
  }

   /**
   * Get recipients
   * @return recipients
  **/
  @ApiModelProperty(required = true, value = "")

  public List<ExtendedRecipientMetadata> getRecipients() {
    return recipients;
  }


  public void setRecipients(List<ExtendedRecipientMetadata> recipients) {
    this.recipients = recipients;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetRecipientsResponse getRecipientsResponse = (GetRecipientsResponse) o;
    return Objects.equals(this.recipients, getRecipientsResponse.recipients);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recipients);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRecipientsResponse {\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
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

