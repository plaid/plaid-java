/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.5.3
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
import com.plaid.client.model.LinkTokenCreateRequestAccountSubtypesCredit;
import com.plaid.client.model.LinkTokenCreateRequestAccountSubtypesDepository;
import com.plaid.client.model.LinkTokenCreateRequestAccountSubtypesInvestment;
import com.plaid.client.model.LinkTokenCreateRequestAccountSubtypesLoan;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * By default, Link will only display account types that are compatible with all products supplied in the &#x60;products&#x60; parameter of &#x60;/link/token/create&#x60;. You can further limit the accounts shown in Link by using &#x60;account_filters&#x60; to specify the account subtypes to be shown in Link. Only the specified subtypes will be shown. This filtering applies to both the Account Select view (if enabled) and the Institution Select view. Institutions that do not support the selected subtypes will be omitted from Link. To indicate that all subtypes should be shown, use the value &#x60;\&quot;all\&quot;&#x60;. If the &#x60;account_filters&#x60; filter is used, any account type for which a filter is not specified will be entirely omitted from Link.  For a full list of valid types and subtypes, see the [Account schema](/docs/api/accounts#accounts-schema).  For institutions using OAuth, the filter will not affect the list of institutions or accounts shown by the bank in the OAuth window. 
 */
@ApiModel(description = "By default, Link will only display account types that are compatible with all products supplied in the `products` parameter of `/link/token/create`. You can further limit the accounts shown in Link by using `account_filters` to specify the account subtypes to be shown in Link. Only the specified subtypes will be shown. This filtering applies to both the Account Select view (if enabled) and the Institution Select view. Institutions that do not support the selected subtypes will be omitted from Link. To indicate that all subtypes should be shown, use the value `\"all\"`. If the `account_filters` filter is used, any account type for which a filter is not specified will be entirely omitted from Link.  For a full list of valid types and subtypes, see the [Account schema](/docs/api/accounts#accounts-schema).  For institutions using OAuth, the filter will not affect the list of institutions or accounts shown by the bank in the OAuth window. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-17T07:10:53.900Z[GMT]")
public class LinkTokenCreateRequestAccountSubtypes {
  public static final String SERIALIZED_NAME_DEPOSITORY = "depository";
  @SerializedName(SERIALIZED_NAME_DEPOSITORY)
  private LinkTokenCreateRequestAccountSubtypesDepository depository;

  public static final String SERIALIZED_NAME_CREDIT = "credit";
  @SerializedName(SERIALIZED_NAME_CREDIT)
  private LinkTokenCreateRequestAccountSubtypesCredit credit;

  public static final String SERIALIZED_NAME_LOAN = "loan";
  @SerializedName(SERIALIZED_NAME_LOAN)
  private LinkTokenCreateRequestAccountSubtypesLoan loan;

  public static final String SERIALIZED_NAME_INVESTMENT = "investment";
  @SerializedName(SERIALIZED_NAME_INVESTMENT)
  private LinkTokenCreateRequestAccountSubtypesInvestment investment;


  public LinkTokenCreateRequestAccountSubtypes depository(LinkTokenCreateRequestAccountSubtypesDepository depository) {
    
    this.depository = depository;
    return this;
  }

   /**
   * Get depository
   * @return depository
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LinkTokenCreateRequestAccountSubtypesDepository getDepository() {
    return depository;
  }


  public void setDepository(LinkTokenCreateRequestAccountSubtypesDepository depository) {
    this.depository = depository;
  }


  public LinkTokenCreateRequestAccountSubtypes credit(LinkTokenCreateRequestAccountSubtypesCredit credit) {
    
    this.credit = credit;
    return this;
  }

   /**
   * Get credit
   * @return credit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LinkTokenCreateRequestAccountSubtypesCredit getCredit() {
    return credit;
  }


  public void setCredit(LinkTokenCreateRequestAccountSubtypesCredit credit) {
    this.credit = credit;
  }


  public LinkTokenCreateRequestAccountSubtypes loan(LinkTokenCreateRequestAccountSubtypesLoan loan) {
    
    this.loan = loan;
    return this;
  }

   /**
   * Get loan
   * @return loan
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LinkTokenCreateRequestAccountSubtypesLoan getLoan() {
    return loan;
  }


  public void setLoan(LinkTokenCreateRequestAccountSubtypesLoan loan) {
    this.loan = loan;
  }


  public LinkTokenCreateRequestAccountSubtypes investment(LinkTokenCreateRequestAccountSubtypesInvestment investment) {
    
    this.investment = investment;
    return this;
  }

   /**
   * Get investment
   * @return investment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LinkTokenCreateRequestAccountSubtypesInvestment getInvestment() {
    return investment;
  }


  public void setInvestment(LinkTokenCreateRequestAccountSubtypesInvestment investment) {
    this.investment = investment;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkTokenCreateRequestAccountSubtypes linkTokenCreateRequestAccountSubtypes = (LinkTokenCreateRequestAccountSubtypes) o;
    return Objects.equals(this.depository, linkTokenCreateRequestAccountSubtypes.depository) &&
        Objects.equals(this.credit, linkTokenCreateRequestAccountSubtypes.credit) &&
        Objects.equals(this.loan, linkTokenCreateRequestAccountSubtypes.loan) &&
        Objects.equals(this.investment, linkTokenCreateRequestAccountSubtypes.investment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(depository, credit, loan, investment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkTokenCreateRequestAccountSubtypes {\n");
    sb.append("    depository: ").append(toIndentedString(depository)).append("\n");
    sb.append("    credit: ").append(toIndentedString(credit)).append("\n");
    sb.append("    loan: ").append(toIndentedString(loan)).append("\n");
    sb.append("    investment: ").append(toIndentedString(investment)).append("\n");
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

