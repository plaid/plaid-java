package com.plaid.client.request;

import com.plaid.client.request.common.BaseClientRequest;

public final class AssetReportGetRequest extends BaseClientRequest {
  private String assetReportToken;
  private boolean includeInsights = false;

  public AssetReportGetRequest(String assetReportToken)  {
    this.assetReportToken = assetReportToken;
  }

  public AssetReportGetRequest withIncludeInsights(boolean includeInsights) {
    this.includeInsights = includeInsights;
    return this;
  }
}
