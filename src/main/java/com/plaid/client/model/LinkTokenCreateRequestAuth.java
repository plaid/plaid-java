/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.20.6
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
 * Specifies options for initializing Link for use with the Auth product. This field is currently only required if using the Flexible Auth product (currently in closed beta).
 */
@ApiModel(description = "Specifies options for initializing Link for use with the Auth product. This field is currently only required if using the Flexible Auth product (currently in closed beta).")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-13T06:10:09.571Z[GMT]")
public class LinkTokenCreateRequestAuth {
  /**
   * The optional Auth flow to use. Currently only used to enable Flexible Auth.
   */
  @JsonAdapter(FlowTypeEnum.Adapter.class)
  public enum FlowTypeEnum {
    FLEXIBLE_AUTH("FLEXIBLE_AUTH");

    private String value;

    FlowTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FlowTypeEnum fromValue(String value) {
      for (FlowTypeEnum b : FlowTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<FlowTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FlowTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FlowTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FlowTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_FLOW_TYPE = "flow_type";
  @SerializedName(SERIALIZED_NAME_FLOW_TYPE)
  private FlowTypeEnum flowType;


  public LinkTokenCreateRequestAuth flowType(FlowTypeEnum flowType) {
    
    this.flowType = flowType;
    return this;
  }

   /**
   * The optional Auth flow to use. Currently only used to enable Flexible Auth.
   * @return flowType
  **/
  @ApiModelProperty(required = true, value = "The optional Auth flow to use. Currently only used to enable Flexible Auth.")

  public FlowTypeEnum getFlowType() {
    return flowType;
  }


  public void setFlowType(FlowTypeEnum flowType) {
    this.flowType = flowType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkTokenCreateRequestAuth linkTokenCreateRequestAuth = (LinkTokenCreateRequestAuth) o;
    return Objects.equals(this.flowType, linkTokenCreateRequestAuth.flowType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flowType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkTokenCreateRequestAuth {\n");
    sb.append("    flowType: ").append(toIndentedString(flowType)).append("\n");
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

