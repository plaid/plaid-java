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
import java.util.ArrayList;
import java.util.List;

/**
 * Defines the request schema for &#x60;sandbox/oauth/select_accounts&#x60;
 */
@ApiModel(description = "Defines the request schema for `sandbox/oauth/select_accounts`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-12T21:24:48.076128Z[Etc/UTC]")
public class SandboxOauthSelectAccountsRequest {
  public static final String SERIALIZED_NAME_OAUTH_STATE_ID = "oauth_state_id";
  @SerializedName(SERIALIZED_NAME_OAUTH_STATE_ID)
  private String oauthStateId;

  public static final String SERIALIZED_NAME_ACCOUNTS = "accounts";
  @SerializedName(SERIALIZED_NAME_ACCOUNTS)
  private List<String> accounts = new ArrayList<>();


  public SandboxOauthSelectAccountsRequest oauthStateId(String oauthStateId) {
    
    this.oauthStateId = oauthStateId;
    return this;
  }

   /**
   * Get oauthStateId
   * @return oauthStateId
  **/
  @ApiModelProperty(required = true, value = "")

  public String getOauthStateId() {
    return oauthStateId;
  }


  public void setOauthStateId(String oauthStateId) {
    this.oauthStateId = oauthStateId;
  }


  public SandboxOauthSelectAccountsRequest accounts(List<String> accounts) {
    
    this.accounts = accounts;
    return this;
  }

  public SandboxOauthSelectAccountsRequest addAccountsItem(String accountsItem) {
    this.accounts.add(accountsItem);
    return this;
  }

   /**
   * Get accounts
   * @return accounts
  **/
  @ApiModelProperty(required = true, value = "")

  public List<String> getAccounts() {
    return accounts;
  }


  public void setAccounts(List<String> accounts) {
    this.accounts = accounts;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SandboxOauthSelectAccountsRequest sandboxOauthSelectAccountsRequest = (SandboxOauthSelectAccountsRequest) o;
    return Objects.equals(this.oauthStateId, sandboxOauthSelectAccountsRequest.oauthStateId) &&
        Objects.equals(this.accounts, sandboxOauthSelectAccountsRequest.accounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oauthStateId, accounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SandboxOauthSelectAccountsRequest {\n");
    sb.append("    oauthStateId: ").append(toIndentedString(oauthStateId)).append("\n");
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
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

