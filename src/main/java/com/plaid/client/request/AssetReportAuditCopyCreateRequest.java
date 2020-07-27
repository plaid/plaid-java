package com.plaid.client.request;

import com.plaid.client.request.common.BaseClientRequest;

public class AssetReportAuditCopyCreateRequest extends BaseClientRequest {
  private String assetReportToken;
  private String auditorId;

  public AssetReportAuditCopyCreateRequest(String assetReportToken, String auditorId) {
    this.assetReportToken = assetReportToken;
    this.auditorId = auditorId;
  }
}
