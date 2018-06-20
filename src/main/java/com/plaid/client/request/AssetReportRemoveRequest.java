package com.plaid.client.request;

import com.plaid.client.request.common.BaseClientRequest;

public final class AssetReportRemoveRequest extends BaseClientRequest {
  private String assetReportToken;

  public AssetReportRemoveRequest(String assetReportToken) {
    this.assetReportToken = assetReportToken;
  }
}
