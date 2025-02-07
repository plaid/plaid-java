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
import com.plaid.client.model.LinkSessionSuccessMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * An object representing an [onSuccess](https://plaid.com/docs/link/web/#onsuccess) callback from Link. This object has been deprecated in favor of the newer [&#x60;results.item_add_result&#x60;](https://plaid.com/docs/api/link/#link-token-get-response-link-sessions-results-item-add-results), which can support multiple public tokens in a single Link session.
 */
@ApiModel(description = "An object representing an [onSuccess](https://plaid.com/docs/link/web/#onsuccess) callback from Link. This object has been deprecated in favor of the newer [`results.item_add_result`](https://plaid.com/docs/api/link/#link-token-get-response-link-sessions-results-item-add-results), which can support multiple public tokens in a single Link session.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-07T19:05:33.763924Z[Etc/UTC]")
public class LinkSessionSuccess {
  public static final String SERIALIZED_NAME_PUBLIC_TOKEN = "public_token";
  @SerializedName(SERIALIZED_NAME_PUBLIC_TOKEN)
  private String publicToken;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private LinkSessionSuccessMetadata metadata;


  public LinkSessionSuccess publicToken(String publicToken) {
    
    this.publicToken = publicToken;
    return this;
  }

   /**
   * Displayed once a user has successfully linked their Item.
   * @return publicToken
  **/
  @ApiModelProperty(required = true, value = "Displayed once a user has successfully linked their Item.")

  public String getPublicToken() {
    return publicToken;
  }


  public void setPublicToken(String publicToken) {
    this.publicToken = publicToken;
  }


  public LinkSessionSuccess metadata(LinkSessionSuccessMetadata metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public LinkSessionSuccessMetadata getMetadata() {
    return metadata;
  }


  public void setMetadata(LinkSessionSuccessMetadata metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkSessionSuccess linkSessionSuccess = (LinkSessionSuccess) o;
    return Objects.equals(this.publicToken, linkSessionSuccess.publicToken) &&
        Objects.equals(this.metadata, linkSessionSuccess.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(publicToken, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkSessionSuccess {\n");
    sb.append("    publicToken: ").append(toIndentedString(publicToken)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

