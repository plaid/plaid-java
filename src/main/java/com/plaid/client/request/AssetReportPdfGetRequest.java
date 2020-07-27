package com.plaid.client.request;

import com.plaid.client.request.common.BaseClientRequest;

public class AssetReportPdfGetRequest extends BaseClientRequest {
  private String assetReportToken;

  public AssetReportPdfGetRequest(String assetReportToken) {
    this.assetReportToken = assetReportToken;
  }
}
