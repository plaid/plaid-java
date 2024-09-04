/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.556.0
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
 * An enum indicating the type of a linked service. Note that &#x60;adult_sites&#x60; refers&#39; to explicit video content, and includes a number of related services.
 */
@JsonAdapter(RiskCheckLinkedService.Adapter.class)
public enum RiskCheckLinkedService {
  
  ABOUTME("aboutme"),
  
  ADOBE("adobe"),
  
  ADULT_SITES("adult_sites"),
  
  AIRBNB("airbnb"),
  
  ALTBALAJI("altbalaji"),
  
  AMAZON("amazon"),
  
  APPLE("apple"),
  
  ARCHIVEORG("archiveorg"),
  
  ATLASSIAN("atlassian"),
  
  BITMOJI("bitmoji"),
  
  BODYBUILDING("bodybuilding"),
  
  BOOKING("booking"),
  
  BUKALAPAK("bukalapak"),
  
  CODECADEMY("codecademy"),
  
  DELIVEROO("deliveroo"),
  
  DIIGO("diigo"),
  
  DISCORD("discord"),
  
  DISNEYPLUS("disneyplus"),
  
  DUOLINGO("duolingo"),
  
  EBAY("ebay"),
  
  ENVATO("envato"),
  
  EVENTBRITE("eventbrite"),
  
  EVERNOTE("evernote"),
  
  FACEBOOK("facebook"),
  
  FIREFOX("firefox"),
  
  FLICKR("flickr"),
  
  FLIPKART("flipkart"),
  
  FOURSQUARE("foursquare"),
  
  FREELANCER("freelancer"),
  
  GAANA("gaana"),
  
  GIPHY("giphy"),
  
  GITHUB("github"),
  
  GOOGLE("google"),
  
  GRAVATAR("gravatar"),
  
  HUBSPOT("hubspot"),
  
  IMGUR("imgur"),
  
  INSTAGRAM("instagram"),
  
  JDID("jdid"),
  
  KAKAO("kakao"),
  
  KOMMO("kommo"),
  
  KOMOOT("komoot"),
  
  LASTFM("lastfm"),
  
  LAZADA("lazada"),
  
  LINE("line"),
  
  LINKEDIN("linkedin"),
  
  MAILRU("mailru"),
  
  MICROSOFT("microsoft"),
  
  MYSPACE("myspace"),
  
  NETFLIX("netflix"),
  
  NIKE("nike"),
  
  OK("ok"),
  
  PATREON("patreon"),
  
  PINTEREST("pinterest"),
  
  PLURK("plurk"),
  
  QUORA("quora"),
  
  QZONE("qzone"),
  
  RAMBLER("rambler"),
  
  RAPPI("rappi"),
  
  REPLIT("replit"),
  
  SAMSUNG("samsung"),
  
  SEOCLERKS("seoclerks"),
  
  SHOPCLUES("shopclues"),
  
  SKYPE("skype"),
  
  SNAPCHAT("snapchat"),
  
  SNAPDEAL("snapdeal"),
  
  SOUNDCLOUD("soundcloud"),
  
  SPOTIFY("spotify"),
  
  STARZ("starz"),
  
  STRAVA("strava"),
  
  TARINGA("taringa"),
  
  TELEGRAM("telegram"),
  
  TIKI("tiki"),
  
  TOKOPEDIA("tokopedia"),
  
  TREEHOUSE("treehouse"),
  
  TUMBLR("tumblr"),
  
  TWITTER("twitter"),
  
  VENMO("venmo"),
  
  VIBER("viber"),
  
  VIMEO("vimeo"),
  
  VIVINO("vivino"),
  
  VKONTAKTE("vkontakte"),
  
  WATTPAD("wattpad"),
  
  WEIBO("weibo"),
  
  WHATSAPP("whatsapp"),
  
  WORDPRESS("wordpress"),
  
  XING("xing"),
  
  YAHOO("yahoo"),
  
  YANDEX("yandex"),
  
  ZALO("zalo"),
  
  ZOHO("zoho"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  RiskCheckLinkedService(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static RiskCheckLinkedService fromValue(String value) {
    for (RiskCheckLinkedService b : RiskCheckLinkedService.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return RiskCheckLinkedService.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<RiskCheckLinkedService> {
    @Override
    public void write(final JsonWriter jsonWriter, final RiskCheckLinkedService enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public RiskCheckLinkedService read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return RiskCheckLinkedService.fromValue(value);
    }
  }
}

