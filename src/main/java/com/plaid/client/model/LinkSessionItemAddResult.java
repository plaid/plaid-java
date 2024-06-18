/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.525.1
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
import com.plaid.client.model.LinkSessionSuccessMetadataAccount;
import com.plaid.client.model.LinkSessionSuccessMetadataInstitution;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * The details of an Item add in Link.
 */
@ApiModel(description = "The details of an Item add in Link.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-18T18:48:06.627309Z[Etc/UTC]")
public class LinkSessionItemAddResult {
  public static final String SERIALIZED_NAME_PUBLIC_TOKEN = "public_token";
  @SerializedName(SERIALIZED_NAME_PUBLIC_TOKEN)
  private String publicToken;

  public static final String SERIALIZED_NAME_ACCOUNTS = "accounts";
  @SerializedName(SERIALIZED_NAME_ACCOUNTS)
  private List<LinkSessionSuccessMetadataAccount> accounts = new ArrayList<>();

  public static final String SERIALIZED_NAME_INSTITUTION = "institution";
  @SerializedName(SERIALIZED_NAME_INSTITUTION)
  private LinkSessionSuccessMetadataInstitution institution;


  public LinkSessionItemAddResult publicToken(String publicToken) {
    
    this.publicToken = publicToken;
    return this;
  }

   /**
   * Returned once a user has successfully linked their Item.
   * @return publicToken
  **/
  @ApiModelProperty(required = true, value = "Returned once a user has successfully linked their Item.")

  public String getPublicToken() {
    return publicToken;
  }


  public void setPublicToken(String publicToken) {
    this.publicToken = publicToken;
  }


  public LinkSessionItemAddResult accounts(List<LinkSessionSuccessMetadataAccount> accounts) {
    
    this.accounts = accounts;
    return this;
  }

  public LinkSessionItemAddResult addAccountsItem(LinkSessionSuccessMetadataAccount accountsItem) {
    this.accounts.add(accountsItem);
    return this;
  }

   /**
   * A list of accounts attached to the connected Item. If Account Select is enabled via the developer dashboard, &#x60;accounts&#x60; will only include selected accounts.
   * @return accounts
  **/
  @ApiModelProperty(required = true, value = "A list of accounts attached to the connected Item. If Account Select is enabled via the developer dashboard, `accounts` will only include selected accounts.")

  public List<LinkSessionSuccessMetadataAccount> getAccounts() {
    return accounts;
  }


  public void setAccounts(List<LinkSessionSuccessMetadataAccount> accounts) {
    this.accounts = accounts;
  }


  public LinkSessionItemAddResult institution(LinkSessionSuccessMetadataInstitution institution) {
    
    this.institution = institution;
    return this;
  }

   /**
   * Get institution
   * @return institution
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public LinkSessionSuccessMetadataInstitution getInstitution() {
    return institution;
  }


  public void setInstitution(LinkSessionSuccessMetadataInstitution institution) {
    this.institution = institution;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkSessionItemAddResult linkSessionItemAddResult = (LinkSessionItemAddResult) o;
    return Objects.equals(this.publicToken, linkSessionItemAddResult.publicToken) &&
        Objects.equals(this.accounts, linkSessionItemAddResult.accounts) &&
        Objects.equals(this.institution, linkSessionItemAddResult.institution);
  }

  @Override
  public int hashCode() {
    return Objects.hash(publicToken, accounts, institution);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkSessionItemAddResult {\n");
    sb.append("    publicToken: ").append(toIndentedString(publicToken)).append("\n");
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
    sb.append("    institution: ").append(toIndentedString(institution)).append("\n");
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

