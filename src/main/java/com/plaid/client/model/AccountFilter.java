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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Enumerates the account subtypes that the application wishes for the user to be able to select from. For more details refer to Plaid documentation on account filters.
 */
@ApiModel(description = "Enumerates the account subtypes that the application wishes for the user to be able to select from. For more details refer to Plaid documentation on account filters.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-07T19:05:33.763924Z[Etc/UTC]")
public class AccountFilter {
  public static final String SERIALIZED_NAME_DEPOSITORY = "depository";
  @SerializedName(SERIALIZED_NAME_DEPOSITORY)
  private List<String> depository = null;

  public static final String SERIALIZED_NAME_CREDIT = "credit";
  @SerializedName(SERIALIZED_NAME_CREDIT)
  private List<String> credit = null;

  public static final String SERIALIZED_NAME_LOAN = "loan";
  @SerializedName(SERIALIZED_NAME_LOAN)
  private List<String> loan = null;

  public static final String SERIALIZED_NAME_INVESTMENT = "investment";
  @SerializedName(SERIALIZED_NAME_INVESTMENT)
  private List<String> investment = null;


  public AccountFilter depository(List<String> depository) {
    
    this.depository = depository;
    return this;
  }

  public AccountFilter addDepositoryItem(String depositoryItem) {
    if (this.depository == null) {
      this.depository = new ArrayList<>();
    }
    this.depository.add(depositoryItem);
    return this;
  }

   /**
   * A list of account subtypes to be filtered.
   * @return depository
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of account subtypes to be filtered.")

  public List<String> getDepository() {
    return depository;
  }


  public void setDepository(List<String> depository) {
    this.depository = depository;
  }


  public AccountFilter credit(List<String> credit) {
    
    this.credit = credit;
    return this;
  }

  public AccountFilter addCreditItem(String creditItem) {
    if (this.credit == null) {
      this.credit = new ArrayList<>();
    }
    this.credit.add(creditItem);
    return this;
  }

   /**
   * A list of account subtypes to be filtered.
   * @return credit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of account subtypes to be filtered.")

  public List<String> getCredit() {
    return credit;
  }


  public void setCredit(List<String> credit) {
    this.credit = credit;
  }


  public AccountFilter loan(List<String> loan) {
    
    this.loan = loan;
    return this;
  }

  public AccountFilter addLoanItem(String loanItem) {
    if (this.loan == null) {
      this.loan = new ArrayList<>();
    }
    this.loan.add(loanItem);
    return this;
  }

   /**
   * A list of account subtypes to be filtered.
   * @return loan
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of account subtypes to be filtered.")

  public List<String> getLoan() {
    return loan;
  }


  public void setLoan(List<String> loan) {
    this.loan = loan;
  }


  public AccountFilter investment(List<String> investment) {
    
    this.investment = investment;
    return this;
  }

  public AccountFilter addInvestmentItem(String investmentItem) {
    if (this.investment == null) {
      this.investment = new ArrayList<>();
    }
    this.investment.add(investmentItem);
    return this;
  }

   /**
   * A list of account subtypes to be filtered.
   * @return investment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of account subtypes to be filtered.")

  public List<String> getInvestment() {
    return investment;
  }


  public void setInvestment(List<String> investment) {
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
    AccountFilter accountFilter = (AccountFilter) o;
    return Objects.equals(this.depository, accountFilter.depository) &&
        Objects.equals(this.credit, accountFilter.credit) &&
        Objects.equals(this.loan, accountFilter.loan) &&
        Objects.equals(this.investment, accountFilter.investment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(depository, credit, loan, investment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountFilter {\n");
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

