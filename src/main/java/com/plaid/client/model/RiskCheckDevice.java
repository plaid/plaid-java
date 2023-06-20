/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.379.0
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
import com.plaid.client.model.ProxyType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Result summary object specifying values for &#x60;device&#x60; attributes of risk check.
 */
@ApiModel(description = "Result summary object specifying values for `device` attributes of risk check.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-20T21:31:59.039638Z[Etc/UTC]")
public class RiskCheckDevice {
  public static final String SERIALIZED_NAME_IP_PROXY_TYPE = "ip_proxy_type";
  @SerializedName(SERIALIZED_NAME_IP_PROXY_TYPE)
  private ProxyType ipProxyType;

  public static final String SERIALIZED_NAME_IP_SPAM_LIST_COUNT = "ip_spam_list_count";
  @SerializedName(SERIALIZED_NAME_IP_SPAM_LIST_COUNT)
  private Integer ipSpamListCount;

  public static final String SERIALIZED_NAME_IP_TIMEZONE_OFFSET = "ip_timezone_offset";
  @SerializedName(SERIALIZED_NAME_IP_TIMEZONE_OFFSET)
  private String ipTimezoneOffset;


  public RiskCheckDevice ipProxyType(ProxyType ipProxyType) {
    
    this.ipProxyType = ipProxyType;
    return this;
  }

   /**
   * Get ipProxyType
   * @return ipProxyType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public ProxyType getIpProxyType() {
    return ipProxyType;
  }


  public void setIpProxyType(ProxyType ipProxyType) {
    this.ipProxyType = ipProxyType;
  }


  public RiskCheckDevice ipSpamListCount(Integer ipSpamListCount) {
    
    this.ipSpamListCount = ipSpamListCount;
    return this;
  }

   /**
   * Count of spam lists the IP address is associated with if known.
   * @return ipSpamListCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", required = true, value = "Count of spam lists the IP address is associated with if known.")

  public Integer getIpSpamListCount() {
    return ipSpamListCount;
  }


  public void setIpSpamListCount(Integer ipSpamListCount) {
    this.ipSpamListCount = ipSpamListCount;
  }


  public RiskCheckDevice ipTimezoneOffset(String ipTimezoneOffset) {
    
    this.ipTimezoneOffset = ipTimezoneOffset;
    return this;
  }

   /**
   * UTC offset of the timezone associated with the IP address.
   * @return ipTimezoneOffset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "+06:00:00", required = true, value = "UTC offset of the timezone associated with the IP address.")

  public String getIpTimezoneOffset() {
    return ipTimezoneOffset;
  }


  public void setIpTimezoneOffset(String ipTimezoneOffset) {
    this.ipTimezoneOffset = ipTimezoneOffset;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiskCheckDevice riskCheckDevice = (RiskCheckDevice) o;
    return Objects.equals(this.ipProxyType, riskCheckDevice.ipProxyType) &&
        Objects.equals(this.ipSpamListCount, riskCheckDevice.ipSpamListCount) &&
        Objects.equals(this.ipTimezoneOffset, riskCheckDevice.ipTimezoneOffset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipProxyType, ipSpamListCount, ipTimezoneOffset);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskCheckDevice {\n");
    sb.append("    ipProxyType: ").append(toIndentedString(ipProxyType)).append("\n");
    sb.append("    ipSpamListCount: ").append(toIndentedString(ipSpamListCount)).append("\n");
    sb.append("    ipTimezoneOffset: ").append(toIndentedString(ipTimezoneOffset)).append("\n");
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

