/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.508.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.plaid.client.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Shorthand identifier for a specific screening list for entities.  &#x60;AU_CON&#x60;: Australia Department of Foreign Affairs and Trade Consolidated List  &#x60;CA_CON&#x60;: Government of Canada Consolidated List of Sanctions  &#x60;EU_CON&#x60;: European External Action Service Consolidated List  &#x60;IZ_SOE&#x60;: State Owned Enterprise List  &#x60;IZ_UNC&#x60;: United Nations Consolidated Sanctions  &#x60;IZ_WBK&#x60;: World Bank Listing of Ineligible Firms and Individuals  &#x60;US_CAP&#x60;: US OFAC Correspondent Account or Payable-Through Account Sanctions  &#x60;US_FSE&#x60;: US OFAC Foreign Sanctions Evaders  &#x60;US_MBS&#x60;: US Non-SDN Menu-Based Sanctions  &#x60;US_SDN&#x60;: US Specially Designated Nationals List  &#x60;US_SSI&#x60;: US OFAC Sectoral Sanctions Identifications  &#x60;US_CMC&#x60;: US OFAC Non-SDN Chinese Military-Industrial Complex List  &#x60;US_UVL&#x60;: Bureau of Industry and Security Unverified List  &#x60;UK_HMC&#x60;: UK HM Treasury Consolidated List
 */
@JsonAdapter(EntityWatchlistCode.Adapter.class)
public enum EntityWatchlistCode {
  
  CA_CON("CA_CON"),
  
  EU_CON("EU_CON"),
  
  IZ_SOE("IZ_SOE"),
  
  IZ_UNC("IZ_UNC"),
  
  IZ_WBK("IZ_WBK"),
  
  US_CAP("US_CAP"),
  
  US_FSE("US_FSE"),
  
  US_MBS("US_MBS"),
  
  US_SDN("US_SDN"),
  
  US_SSI("US_SSI"),
  
  US_CMC("US_CMC"),
  
  US_UVL("US_UVL"),
  
  AU_CON("AU_CON"),
  
  UK_HMC("UK_HMC"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  EntityWatchlistCode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EntityWatchlistCode fromValue(String value) {
    for (EntityWatchlistCode b : EntityWatchlistCode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return EntityWatchlistCode.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<EntityWatchlistCode> {
    @Override
    public void write(final JsonWriter jsonWriter, final EntityWatchlistCode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EntityWatchlistCode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EntityWatchlistCode.fromValue(value);
    }
  }
}

