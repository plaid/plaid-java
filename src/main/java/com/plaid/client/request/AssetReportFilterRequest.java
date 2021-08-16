package com.plaid.client.request;

import com.plaid.client.request.common.BaseClientRequest;

import java.util.List;

public class AssetReportFilterRequest extends BaseClientRequest {
  private String assetReportToken;
  private List<String> accountIdsToExclude;

  public AssetReportFilterRequest(String assetReportToken, List<String> accountIdsToExclude) {
    this.assetReportToken = assetReportToken;
    this.accountIdsToExclude = accountIdsToExclude;
  }
}
