/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.610.1
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
 * UserThirdPartyTokenCreateResponse defines the response schema for &#x60;/user/third_party_token/create&#x60;
 */
@ApiModel(description = "UserThirdPartyTokenCreateResponse defines the response schema for `/user/third_party_token/create`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-23T18:11:57.813484Z[Etc/UTC]")
public class UserThirdPartyTokenCreateResponse {
  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;

  public static final String SERIALIZED_NAME_THIRD_PARTY_USER_TOKEN = "third_party_user_token";
  @SerializedName(SERIALIZED_NAME_THIRD_PARTY_USER_TOKEN)
  private String thirdPartyUserToken;


  public UserThirdPartyTokenCreateResponse requestId(String requestId) {
    
    this.requestId = requestId;
    return this;
  }

   /**
   * A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive.
   * @return requestId
  **/
  @ApiModelProperty(required = true, value = "A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive.")

  public String getRequestId() {
    return requestId;
  }


  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  public UserThirdPartyTokenCreateResponse thirdPartyUserToken(String thirdPartyUserToken) {
    
    this.thirdPartyUserToken = thirdPartyUserToken;
    return this;
  }

   /**
   * The third-party user token associated with the requested User data.
   * @return thirdPartyUserToken
  **/
  @ApiModelProperty(required = true, value = "The third-party user token associated with the requested User data.")

  public String getThirdPartyUserToken() {
    return thirdPartyUserToken;
  }


  public void setThirdPartyUserToken(String thirdPartyUserToken) {
    this.thirdPartyUserToken = thirdPartyUserToken;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserThirdPartyTokenCreateResponse userThirdPartyTokenCreateResponse = (UserThirdPartyTokenCreateResponse) o;
    return Objects.equals(this.requestId, userThirdPartyTokenCreateResponse.requestId) &&
        Objects.equals(this.thirdPartyUserToken, userThirdPartyTokenCreateResponse.thirdPartyUserToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, thirdPartyUserToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserThirdPartyTokenCreateResponse {\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    thirdPartyUserToken: ").append(toIndentedString(thirdPartyUserToken)).append("\n");
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

