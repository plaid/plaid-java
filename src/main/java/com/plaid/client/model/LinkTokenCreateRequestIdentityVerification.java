/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.470.1
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
 * Specifies option for initializing Link for use with the Identity Verification product.
 */
@ApiModel(description = "Specifies option for initializing Link for use with the Identity Verification product.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-17T20:03:54.421530Z[Etc/UTC]")
public class LinkTokenCreateRequestIdentityVerification {
  public static final String SERIALIZED_NAME_TEMPLATE_ID = "template_id";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_ID)
  private String templateId;

  public static final String SERIALIZED_NAME_CONSENT = "consent";
  @SerializedName(SERIALIZED_NAME_CONSENT)
  private Boolean consent;

  public static final String SERIALIZED_NAME_GAVE_CONSENT = "gave_consent";
  @SerializedName(SERIALIZED_NAME_GAVE_CONSENT)
  private Boolean gaveConsent = false;


  public LinkTokenCreateRequestIdentityVerification templateId(String templateId) {
    
    this.templateId = templateId;
    return this;
  }

   /**
   * ID of the associated Identity Verification template.
   * @return templateId
  **/
  @ApiModelProperty(example = "idvtmp_4FrXJvfQU3zGUR", required = true, value = "ID of the associated Identity Verification template.")

  public String getTemplateId() {
    return templateId;
  }


  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }


  public LinkTokenCreateRequestIdentityVerification consent(Boolean consent) {
    
    this.consent = consent;
    return this;
  }

   /**
   * Get consent
   * @return consent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getConsent() {
    return consent;
  }


  public void setConsent(Boolean consent) {
    this.consent = consent;
  }


  public LinkTokenCreateRequestIdentityVerification gaveConsent(Boolean gaveConsent) {
    
    this.gaveConsent = gaveConsent;
    return this;
  }

   /**
   * A flag specifying whether the end user has already agreed to a privacy policy specifying that their data will be shared with Plaid for verification purposes.  If &#x60;gave_consent&#x60; is set to &#x60;true&#x60;, the &#x60;accept_tos&#x60; step will be marked as &#x60;skipped&#x60; and the end user&#39;s session will start at the next step requirement.
   * @return gaveConsent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "A flag specifying whether the end user has already agreed to a privacy policy specifying that their data will be shared with Plaid for verification purposes.  If `gave_consent` is set to `true`, the `accept_tos` step will be marked as `skipped` and the end user's session will start at the next step requirement.")

  public Boolean getGaveConsent() {
    return gaveConsent;
  }


  public void setGaveConsent(Boolean gaveConsent) {
    this.gaveConsent = gaveConsent;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkTokenCreateRequestIdentityVerification linkTokenCreateRequestIdentityVerification = (LinkTokenCreateRequestIdentityVerification) o;
    return Objects.equals(this.templateId, linkTokenCreateRequestIdentityVerification.templateId) &&
        Objects.equals(this.consent, linkTokenCreateRequestIdentityVerification.consent) &&
        Objects.equals(this.gaveConsent, linkTokenCreateRequestIdentityVerification.gaveConsent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(templateId, consent, gaveConsent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkTokenCreateRequestIdentityVerification {\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    consent: ").append(toIndentedString(consent)).append("\n");
    sb.append("    gaveConsent: ").append(toIndentedString(gaveConsent)).append("\n");
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

