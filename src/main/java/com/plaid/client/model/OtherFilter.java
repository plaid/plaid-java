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
import com.plaid.client.model.OtherAccountSubtype;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * A filter to apply to &#x60;other&#x60;-type accounts
 */
@ApiModel(description = "A filter to apply to `other`-type accounts")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-12T21:24:48.076128Z[Etc/UTC]")
public class OtherFilter {
  public static final String SERIALIZED_NAME_ACCOUNT_SUBTYPES = "account_subtypes";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_SUBTYPES)
  private List<OtherAccountSubtype> accountSubtypes = new ArrayList<>();


  public OtherFilter accountSubtypes(List<OtherAccountSubtype> accountSubtypes) {
    
    this.accountSubtypes = accountSubtypes;
    return this;
  }

  public OtherFilter addAccountSubtypesItem(OtherAccountSubtype accountSubtypesItem) {
    this.accountSubtypes.add(accountSubtypesItem);
    return this;
  }

   /**
   * An array of account subtypes to display in Link. If not specified, all account subtypes will be shown. For a full list of valid types and subtypes, see the [Account schema](https://plaid.com/docs/api/accounts#account-type-schema). 
   * @return accountSubtypes
  **/
  @ApiModelProperty(required = true, value = "An array of account subtypes to display in Link. If not specified, all account subtypes will be shown. For a full list of valid types and subtypes, see the [Account schema](https://plaid.com/docs/api/accounts#account-type-schema). ")

  public List<OtherAccountSubtype> getAccountSubtypes() {
    return accountSubtypes;
  }


  public void setAccountSubtypes(List<OtherAccountSubtype> accountSubtypes) {
    this.accountSubtypes = accountSubtypes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OtherFilter otherFilter = (OtherFilter) o;
    return Objects.equals(this.accountSubtypes, otherFilter.accountSubtypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountSubtypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OtherFilter {\n");
    sb.append("    accountSubtypes: ").append(toIndentedString(accountSubtypes)).append("\n");
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

