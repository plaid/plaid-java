package com.plaid.client.request;

import com.plaid.client.request.common.BaseClientRequest;

public class AssetReportAuditCopyGetRequest extends BaseClientRequest {
  private String auditCopyToken;

  public AssetReportAuditCopyGetRequest(String auditCopyToken) {
    this.auditCopyToken = auditCopyToken;
  }
}
