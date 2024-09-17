/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.565.0
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
import com.plaid.client.model.ConsumerReportPermissiblePurpose;
import com.plaid.client.model.CraCheckReportProduct;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * CraCheckReportCreateRequest defines the request schema for &#x60;/cra/check_report/create&#x60;.
 */
@ApiModel(description = "CraCheckReportCreateRequest defines the request schema for `/cra/check_report/create`.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-17T16:42:02.150702Z[Etc/UTC]")
public class CraCheckReportCreateRequest {
  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_USER_TOKEN = "user_token";
  @SerializedName(SERIALIZED_NAME_USER_TOKEN)
  private String userToken;

  public static final String SERIALIZED_NAME_WEBHOOK = "webhook";
  @SerializedName(SERIALIZED_NAME_WEBHOOK)
  private String webhook;

  public static final String SERIALIZED_NAME_DAYS_REQUESTED = "days_requested";
  @SerializedName(SERIALIZED_NAME_DAYS_REQUESTED)
  private Integer daysRequested;

  public static final String SERIALIZED_NAME_PRODUCTS = "products";
  @SerializedName(SERIALIZED_NAME_PRODUCTS)
  private List<CraCheckReportProduct> products = null;

  public static final String SERIALIZED_NAME_CONSUMER_REPORT_PERMISSIBLE_PURPOSE = "consumer_report_permissible_purpose";
  @SerializedName(SERIALIZED_NAME_CONSUMER_REPORT_PERMISSIBLE_PURPOSE)
  private ConsumerReportPermissiblePurpose consumerReportPermissiblePurpose;


  public CraCheckReportCreateRequest clientId(String clientId) {
    
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


  public CraCheckReportCreateRequest secret(String secret) {
    
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


  public CraCheckReportCreateRequest userToken(String userToken) {
    
    this.userToken = userToken;
    return this;
  }

   /**
   * The user token associated with the User data is being requested for.
   * @return userToken
  **/
  @ApiModelProperty(required = true, value = "The user token associated with the User data is being requested for.")

  public String getUserToken() {
    return userToken;
  }


  public void setUserToken(String userToken) {
    this.userToken = userToken;
  }


  public CraCheckReportCreateRequest webhook(String webhook) {
    
    this.webhook = webhook;
    return this;
  }

   /**
   * The destination URL to which webhooks will be sent 
   * @return webhook
  **/
  @ApiModelProperty(required = true, value = "The destination URL to which webhooks will be sent ")

  public String getWebhook() {
    return webhook;
  }


  public void setWebhook(String webhook) {
    this.webhook = webhook;
  }


  public CraCheckReportCreateRequest daysRequested(Integer daysRequested) {
    
    this.daysRequested = daysRequested;
    return this;
  }

   /**
   * The number of days of data to request for the report. If requesting Income Insights, a minimum of 90 days is recommended in order to receive both historical and forecasted income.
   * minimum: 1
   * maximum: 731
   * @return daysRequested
  **/
  @ApiModelProperty(required = true, value = "The number of days of data to request for the report. If requesting Income Insights, a minimum of 90 days is recommended in order to receive both historical and forecasted income.")

  public Integer getDaysRequested() {
    return daysRequested;
  }


  public void setDaysRequested(Integer daysRequested) {
    this.daysRequested = daysRequested;
  }


  public CraCheckReportCreateRequest products(List<CraCheckReportProduct> products) {
    
    this.products = products;
    return this;
  }

  public CraCheckReportCreateRequest addProductsItem(CraCheckReportProduct productsItem) {
    if (this.products == null) {
      this.products = new ArrayList<>();
    }
    this.products.add(productsItem);
    return this;
  }

   /**
   * Products that will be retrieved in this report. This configuration will determine what data types to fetch from the user&#39;s financial institution. If omitted, the data types needed to support all products will be fetched.
   * @return products
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Products that will be retrieved in this report. This configuration will determine what data types to fetch from the user's financial institution. If omitted, the data types needed to support all products will be fetched.")

  public List<CraCheckReportProduct> getProducts() {
    return products;
  }


  public void setProducts(List<CraCheckReportProduct> products) {
    this.products = products;
  }


  public CraCheckReportCreateRequest consumerReportPermissiblePurpose(ConsumerReportPermissiblePurpose consumerReportPermissiblePurpose) {
    
    this.consumerReportPermissiblePurpose = consumerReportPermissiblePurpose;
    return this;
  }

   /**
   * Get consumerReportPermissiblePurpose
   * @return consumerReportPermissiblePurpose
  **/
  @ApiModelProperty(required = true, value = "")

  public ConsumerReportPermissiblePurpose getConsumerReportPermissiblePurpose() {
    return consumerReportPermissiblePurpose;
  }


  public void setConsumerReportPermissiblePurpose(ConsumerReportPermissiblePurpose consumerReportPermissiblePurpose) {
    this.consumerReportPermissiblePurpose = consumerReportPermissiblePurpose;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CraCheckReportCreateRequest craCheckReportCreateRequest = (CraCheckReportCreateRequest) o;
    return Objects.equals(this.clientId, craCheckReportCreateRequest.clientId) &&
        Objects.equals(this.secret, craCheckReportCreateRequest.secret) &&
        Objects.equals(this.userToken, craCheckReportCreateRequest.userToken) &&
        Objects.equals(this.webhook, craCheckReportCreateRequest.webhook) &&
        Objects.equals(this.daysRequested, craCheckReportCreateRequest.daysRequested) &&
        Objects.equals(this.products, craCheckReportCreateRequest.products) &&
        Objects.equals(this.consumerReportPermissiblePurpose, craCheckReportCreateRequest.consumerReportPermissiblePurpose);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, secret, userToken, webhook, daysRequested, products, consumerReportPermissiblePurpose);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CraCheckReportCreateRequest {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    userToken: ").append(toIndentedString(userToken)).append("\n");
    sb.append("    webhook: ").append(toIndentedString(webhook)).append("\n");
    sb.append("    daysRequested: ").append(toIndentedString(daysRequested)).append("\n");
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
    sb.append("    consumerReportPermissiblePurpose: ").append(toIndentedString(consumerReportPermissiblePurpose)).append("\n");
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

