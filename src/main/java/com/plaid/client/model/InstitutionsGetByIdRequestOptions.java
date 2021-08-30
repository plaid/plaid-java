/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.26.1
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
 * Specifies optional parameters for &#x60;/institutions/get_by_id&#x60;. If provided, must not be &#x60;null&#x60;.
 */
@ApiModel(description = "Specifies optional parameters for `/institutions/get_by_id`. If provided, must not be `null`.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-30T20:20:54.674Z[GMT]")
public class InstitutionsGetByIdRequestOptions {
  public static final String SERIALIZED_NAME_INCLUDE_OPTIONAL_METADATA = "include_optional_metadata";
  @SerializedName(SERIALIZED_NAME_INCLUDE_OPTIONAL_METADATA)
  private Boolean includeOptionalMetadata = false;

  public static final String SERIALIZED_NAME_INCLUDE_STATUS = "include_status";
  @SerializedName(SERIALIZED_NAME_INCLUDE_STATUS)
  private Boolean includeStatus = false;

  public static final String SERIALIZED_NAME_INCLUDE_PAYMENT_INITIATION_METADATA = "include_payment_initiation_metadata";
  @SerializedName(SERIALIZED_NAME_INCLUDE_PAYMENT_INITIATION_METADATA)
  private Boolean includePaymentInitiationMetadata = false;


  public InstitutionsGetByIdRequestOptions includeOptionalMetadata(Boolean includeOptionalMetadata) {
    
    this.includeOptionalMetadata = includeOptionalMetadata;
    return this;
  }

   /**
   * When &#x60;true&#x60;, return an institution&#39;s logo, brand color, and URL. When available, the bank&#39;s logo is returned as a base64 encoded 152x152 PNG, the brand color is in hexadecimal format. The default value is &#x60;false&#x60;.  Note that Plaid does not own any of the logos shared by the API and that by accessing or using these logos, you agree that you are doing so at your own risk and will, if necessary, obtain all required permissions from the appropriate rights holders and adhere to any applicable usage guidelines. Plaid disclaims all express or implied warranties with respect to the logos.
   * @return includeOptionalMetadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When `true`, return an institution's logo, brand color, and URL. When available, the bank's logo is returned as a base64 encoded 152x152 PNG, the brand color is in hexadecimal format. The default value is `false`.  Note that Plaid does not own any of the logos shared by the API and that by accessing or using these logos, you agree that you are doing so at your own risk and will, if necessary, obtain all required permissions from the appropriate rights holders and adhere to any applicable usage guidelines. Plaid disclaims all express or implied warranties with respect to the logos.")

  public Boolean getIncludeOptionalMetadata() {
    return includeOptionalMetadata;
  }


  public void setIncludeOptionalMetadata(Boolean includeOptionalMetadata) {
    this.includeOptionalMetadata = includeOptionalMetadata;
  }


  public InstitutionsGetByIdRequestOptions includeStatus(Boolean includeStatus) {
    
    this.includeStatus = includeStatus;
    return this;
  }

   /**
   * If &#x60;true&#x60;, the response will include status information about the institution. Default value is &#x60;false&#x60;.
   * @return includeStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If `true`, the response will include status information about the institution. Default value is `false`.")

  public Boolean getIncludeStatus() {
    return includeStatus;
  }


  public void setIncludeStatus(Boolean includeStatus) {
    this.includeStatus = includeStatus;
  }


  public InstitutionsGetByIdRequestOptions includePaymentInitiationMetadata(Boolean includePaymentInitiationMetadata) {
    
    this.includePaymentInitiationMetadata = includePaymentInitiationMetadata;
    return this;
  }

   /**
   * When &#x60;true&#x60;, returns metadata related to the Payment Initiation product indicating which payment configurations are supported.
   * @return includePaymentInitiationMetadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When `true`, returns metadata related to the Payment Initiation product indicating which payment configurations are supported.")

  public Boolean getIncludePaymentInitiationMetadata() {
    return includePaymentInitiationMetadata;
  }


  public void setIncludePaymentInitiationMetadata(Boolean includePaymentInitiationMetadata) {
    this.includePaymentInitiationMetadata = includePaymentInitiationMetadata;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstitutionsGetByIdRequestOptions institutionsGetByIdRequestOptions = (InstitutionsGetByIdRequestOptions) o;
    return Objects.equals(this.includeOptionalMetadata, institutionsGetByIdRequestOptions.includeOptionalMetadata) &&
        Objects.equals(this.includeStatus, institutionsGetByIdRequestOptions.includeStatus) &&
        Objects.equals(this.includePaymentInitiationMetadata, institutionsGetByIdRequestOptions.includePaymentInitiationMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeOptionalMetadata, includeStatus, includePaymentInitiationMetadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstitutionsGetByIdRequestOptions {\n");
    sb.append("    includeOptionalMetadata: ").append(toIndentedString(includeOptionalMetadata)).append("\n");
    sb.append("    includeStatus: ").append(toIndentedString(includeStatus)).append("\n");
    sb.append("    includePaymentInitiationMetadata: ").append(toIndentedString(includePaymentInitiationMetadata)).append("\n");
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

