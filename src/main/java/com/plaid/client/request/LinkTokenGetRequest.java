package com.plaid.client.request;

import com.google.gson.annotations.JsonAdapter;
import com.plaid.client.internal.gson.Optional;
import com.plaid.client.internal.gson.OptionalDateTypeAdapterFactory;
import com.plaid.client.request.common.BaseClientRequest;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class LinkTokenGetRequest extends BaseClientRequest {
  private String linkToken;

  public LinkTokenGetRequest(String linkToken) {
    this.linkToken = linkToken;
  }
}
