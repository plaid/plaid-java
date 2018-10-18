package com.plaid.client.request;

import com.plaid.client.request.common.BaseClientRequest;

public class AssetReportRefreshRequest extends BaseClientRequest {
  private String assetReportToken;
  private AssetReportCreateRequest.Options options;

  public AssetReportRefreshRequest(String assetReportToken, AssetReportCreateRequest.Options options) {
    this.assetReportToken = assetReportToken;
    this.options = options;
  }

  public AssetReportRefreshRequest(String assetReportToken) {
    this.assetReportToken = assetReportToken;
    this.options = new AssetReportCreateRequest.Options();
  }
}
