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
 * An optional set of options to be used when configuring the Item. If specified, must not be &#x60;null&#x60;.
 */
@ApiModel(description = "An optional set of options to be used when configuring the Item. If specified, must not be `null`.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-12T21:24:48.076128Z[Etc/UTC]")
public class SandboxProcessorTokenCreateRequestOptions {
  public static final String SERIALIZED_NAME_OVERRIDE_USERNAME = "override_username";
  @SerializedName(SERIALIZED_NAME_OVERRIDE_USERNAME)
  private String overrideUsername = "user_good";

  public static final String SERIALIZED_NAME_OVERRIDE_PASSWORD = "override_password";
  @SerializedName(SERIALIZED_NAME_OVERRIDE_PASSWORD)
  private String overridePassword = "pass_good";


  public SandboxProcessorTokenCreateRequestOptions overrideUsername(String overrideUsername) {
    
    this.overrideUsername = overrideUsername;
    return this;
  }

   /**
   * Test username to use for the creation of the Sandbox Item. Default value is &#x60;user_good&#x60;.
   * @return overrideUsername
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Test username to use for the creation of the Sandbox Item. Default value is `user_good`.")

  public String getOverrideUsername() {
    return overrideUsername;
  }


  public void setOverrideUsername(String overrideUsername) {
    this.overrideUsername = overrideUsername;
  }


  public SandboxProcessorTokenCreateRequestOptions overridePassword(String overridePassword) {
    
    this.overridePassword = overridePassword;
    return this;
  }

   /**
   * Test password to use for the creation of the Sandbox Item. Default value is &#x60;pass_good&#x60;.
   * @return overridePassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Test password to use for the creation of the Sandbox Item. Default value is `pass_good`.")

  public String getOverridePassword() {
    return overridePassword;
  }


  public void setOverridePassword(String overridePassword) {
    this.overridePassword = overridePassword;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SandboxProcessorTokenCreateRequestOptions sandboxProcessorTokenCreateRequestOptions = (SandboxProcessorTokenCreateRequestOptions) o;
    return Objects.equals(this.overrideUsername, sandboxProcessorTokenCreateRequestOptions.overrideUsername) &&
        Objects.equals(this.overridePassword, sandboxProcessorTokenCreateRequestOptions.overridePassword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(overrideUsername, overridePassword);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SandboxProcessorTokenCreateRequestOptions {\n");
    sb.append("    overrideUsername: ").append(toIndentedString(overrideUsername)).append("\n");
    sb.append("    overridePassword: ").append(toIndentedString(overridePassword)).append("\n");
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

