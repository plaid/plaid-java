package com.plaid.client.response;

public class AssetReportCreateResponse extends BaseResponse {
  private String assetReportToken;
  private String assetReportId;

  public String getAssetReportToken() {
    return assetReportToken;
  }

  public String getAssetReportId() {
    return assetReportId;
  }
}
