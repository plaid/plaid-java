package com.plaid.client.request;

import com.plaid.client.internal.gson.Optional;
import com.plaid.client.request.common.BaseClientRequest;

public final class AssetReportGetRequest extends BaseClientRequest {
  private String assetReportToken;
  private Optional<Boolean> includeInsights = Optional.empty();

  public AssetReportGetRequest(String assetReportToken)  {
    this.assetReportToken = assetReportToken;
  }

  public AssetReportGetRequest withIncludeInsights(boolean includeInsights) {
    this.includeInsights = Optional.of(includeInsights);
    return this;
  }
}
