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
import com.plaid.client.model.CreditCardLiability;
import com.plaid.client.model.MortgageLiability;
import com.plaid.client.model.StudentLoan;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * An object containing liability accounts
 */
@ApiModel(description = "An object containing liability accounts")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-21T16:44:11.345889Z[Etc/UTC]")
public class LiabilitiesObject {
  public static final String SERIALIZED_NAME_CREDIT = "credit";
  @SerializedName(SERIALIZED_NAME_CREDIT)
  private List<CreditCardLiability> credit = new ArrayList<>();

  public static final String SERIALIZED_NAME_MORTGAGE = "mortgage";
  @SerializedName(SERIALIZED_NAME_MORTGAGE)
  private List<MortgageLiability> mortgage = new ArrayList<>();

  public static final String SERIALIZED_NAME_STUDENT = "student";
  @SerializedName(SERIALIZED_NAME_STUDENT)
  private List<StudentLoan> student = new ArrayList<>();


  public LiabilitiesObject credit(List<CreditCardLiability> credit) {
    
    this.credit = credit;
    return this;
  }

  public LiabilitiesObject addCreditItem(CreditCardLiability creditItem) {
    this.credit.add(creditItem);
    return this;
  }

   /**
   * The credit accounts returned.
   * @return credit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The credit accounts returned.")

  public List<CreditCardLiability> getCredit() {
    return credit;
  }


  public void setCredit(List<CreditCardLiability> credit) {
    this.credit = credit;
  }


  public LiabilitiesObject mortgage(List<MortgageLiability> mortgage) {
    
    this.mortgage = mortgage;
    return this;
  }

  public LiabilitiesObject addMortgageItem(MortgageLiability mortgageItem) {
    this.mortgage.add(mortgageItem);
    return this;
  }

   /**
   * The mortgage accounts returned.
   * @return mortgage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The mortgage accounts returned.")

  public List<MortgageLiability> getMortgage() {
    return mortgage;
  }


  public void setMortgage(List<MortgageLiability> mortgage) {
    this.mortgage = mortgage;
  }


  public LiabilitiesObject student(List<StudentLoan> student) {
    
    this.student = student;
    return this;
  }

  public LiabilitiesObject addStudentItem(StudentLoan studentItem) {
    this.student.add(studentItem);
    return this;
  }

   /**
   * The student loan accounts returned.
   * @return student
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The student loan accounts returned.")

  public List<StudentLoan> getStudent() {
    return student;
  }


  public void setStudent(List<StudentLoan> student) {
    this.student = student;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiabilitiesObject liabilitiesObject = (LiabilitiesObject) o;
    return Objects.equals(this.credit, liabilitiesObject.credit) &&
        Objects.equals(this.mortgage, liabilitiesObject.mortgage) &&
        Objects.equals(this.student, liabilitiesObject.student);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credit, mortgage, student);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiabilitiesObject {\n");
    sb.append("    credit: ").append(toIndentedString(credit)).append("\n");
    sb.append("    mortgage: ").append(toIndentedString(mortgage)).append("\n");
    sb.append("    student: ").append(toIndentedString(student)).append("\n");
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

