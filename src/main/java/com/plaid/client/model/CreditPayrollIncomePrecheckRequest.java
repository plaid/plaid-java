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
import com.plaid.client.model.IncomeVerificationPrecheckEmployer;
import com.plaid.client.model.IncomeVerificationPrecheckMilitaryInfo;
import com.plaid.client.model.IncomeVerificationPrecheckPayrollInstitution;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Defines the request schema for &#x60;/credit/payroll_income/precheck&#x60;.
 */
@ApiModel(description = "Defines the request schema for `/credit/payroll_income/precheck`.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-12T21:24:48.076128Z[Etc/UTC]")
public class CreditPayrollIncomePrecheckRequest {
  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_USER_TOKEN = "user_token";
  @SerializedName(SERIALIZED_NAME_USER_TOKEN)
  private String userToken;

  public static final String SERIALIZED_NAME_ACCESS_TOKENS = "access_tokens";
  @SerializedName(SERIALIZED_NAME_ACCESS_TOKENS)
  private List<String> accessTokens = null;

  public static final String SERIALIZED_NAME_EMPLOYER = "employer";
  @SerializedName(SERIALIZED_NAME_EMPLOYER)
  private IncomeVerificationPrecheckEmployer employer;

  public static final String SERIALIZED_NAME_US_MILITARY_INFO = "us_military_info";
  @SerializedName(SERIALIZED_NAME_US_MILITARY_INFO)
  private IncomeVerificationPrecheckMilitaryInfo usMilitaryInfo;

  public static final String SERIALIZED_NAME_PAYROLL_INSTITUTION = "payroll_institution";
  @SerializedName(SERIALIZED_NAME_PAYROLL_INSTITUTION)
  private IncomeVerificationPrecheckPayrollInstitution payrollInstitution;


  public CreditPayrollIncomePrecheckRequest clientId(String clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * Your Plaid API &#x60;client_id&#x60;. The &#x60;client_id&#x60; is required and may be provided either in the &#x60;PLAID-CLIENT-ID&#x60; header or as part of a request body.
   * @return clientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Your Plaid API `client_id`. The `client_id` is required and may be provided either in the `PLAID-CLIENT-ID` header or as part of a request body.")

  public String getClientId() {
    return clientId;
  }


  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public CreditPayrollIncomePrecheckRequest secret(String secret) {
    
    this.secret = secret;
    return this;
  }

   /**
   * Your Plaid API &#x60;secret&#x60;. The &#x60;secret&#x60; is required and may be provided either in the &#x60;PLAID-SECRET&#x60; header or as part of a request body.
   * @return secret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Your Plaid API `secret`. The `secret` is required and may be provided either in the `PLAID-SECRET` header or as part of a request body.")

  public String getSecret() {
    return secret;
  }


  public void setSecret(String secret) {
    this.secret = secret;
  }


  public CreditPayrollIncomePrecheckRequest userToken(String userToken) {
    
    this.userToken = userToken;
    return this;
  }

   /**
   * The user token associated with the User data is being requested for.
   * @return userToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The user token associated with the User data is being requested for.")

  public String getUserToken() {
    return userToken;
  }


  public void setUserToken(String userToken) {
    this.userToken = userToken;
  }


  public CreditPayrollIncomePrecheckRequest accessTokens(List<String> accessTokens) {
    
    this.accessTokens = accessTokens;
    return this;
  }

  public CreditPayrollIncomePrecheckRequest addAccessTokensItem(String accessTokensItem) {
    if (this.accessTokens == null) {
      this.accessTokens = new ArrayList<>();
    }
    this.accessTokens.add(accessTokensItem);
    return this;
  }

   /**
   * An array of access tokens corresponding to Items belonging to the user whose eligibility is being checked. Note that if the Items specified here are not already initialized with &#x60;transactions&#x60;, providing them in this field will cause these Items to be initialized with (and billed for) the Transactions product.
   * @return accessTokens
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of access tokens corresponding to Items belonging to the user whose eligibility is being checked. Note that if the Items specified here are not already initialized with `transactions`, providing them in this field will cause these Items to be initialized with (and billed for) the Transactions product.")

  public List<String> getAccessTokens() {
    return accessTokens;
  }


  public void setAccessTokens(List<String> accessTokens) {
    this.accessTokens = accessTokens;
  }


  public CreditPayrollIncomePrecheckRequest employer(IncomeVerificationPrecheckEmployer employer) {
    
    this.employer = employer;
    return this;
  }

   /**
   * Get employer
   * @return employer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IncomeVerificationPrecheckEmployer getEmployer() {
    return employer;
  }


  public void setEmployer(IncomeVerificationPrecheckEmployer employer) {
    this.employer = employer;
  }


  public CreditPayrollIncomePrecheckRequest usMilitaryInfo(IncomeVerificationPrecheckMilitaryInfo usMilitaryInfo) {
    
    this.usMilitaryInfo = usMilitaryInfo;
    return this;
  }

   /**
   * Get usMilitaryInfo
   * @return usMilitaryInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IncomeVerificationPrecheckMilitaryInfo getUsMilitaryInfo() {
    return usMilitaryInfo;
  }


  public void setUsMilitaryInfo(IncomeVerificationPrecheckMilitaryInfo usMilitaryInfo) {
    this.usMilitaryInfo = usMilitaryInfo;
  }


  public CreditPayrollIncomePrecheckRequest payrollInstitution(IncomeVerificationPrecheckPayrollInstitution payrollInstitution) {
    
    this.payrollInstitution = payrollInstitution;
    return this;
  }

   /**
   * Get payrollInstitution
   * @return payrollInstitution
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IncomeVerificationPrecheckPayrollInstitution getPayrollInstitution() {
    return payrollInstitution;
  }


  public void setPayrollInstitution(IncomeVerificationPrecheckPayrollInstitution payrollInstitution) {
    this.payrollInstitution = payrollInstitution;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditPayrollIncomePrecheckRequest creditPayrollIncomePrecheckRequest = (CreditPayrollIncomePrecheckRequest) o;
    return Objects.equals(this.clientId, creditPayrollIncomePrecheckRequest.clientId) &&
        Objects.equals(this.secret, creditPayrollIncomePrecheckRequest.secret) &&
        Objects.equals(this.userToken, creditPayrollIncomePrecheckRequest.userToken) &&
        Objects.equals(this.accessTokens, creditPayrollIncomePrecheckRequest.accessTokens) &&
        Objects.equals(this.employer, creditPayrollIncomePrecheckRequest.employer) &&
        Objects.equals(this.usMilitaryInfo, creditPayrollIncomePrecheckRequest.usMilitaryInfo) &&
        Objects.equals(this.payrollInstitution, creditPayrollIncomePrecheckRequest.payrollInstitution);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, secret, userToken, accessTokens, employer, usMilitaryInfo, payrollInstitution);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditPayrollIncomePrecheckRequest {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    userToken: ").append(toIndentedString(userToken)).append("\n");
    sb.append("    accessTokens: ").append(toIndentedString(accessTokens)).append("\n");
    sb.append("    employer: ").append(toIndentedString(employer)).append("\n");
    sb.append("    usMilitaryInfo: ").append(toIndentedString(usMilitaryInfo)).append("\n");
    sb.append("    payrollInstitution: ").append(toIndentedString(payrollInstitution)).append("\n");
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

