package com.plaid.client.request;

import com.plaid.client.request.common.BaseClientRequest;

public final class AssetReportGetRequest extends BaseClientRequest {
  private String assetReportToken;

  public AssetReportGetRequest(String assetReportToken)  {
    this.assetReportToken = assetReportToken;
  }

}

