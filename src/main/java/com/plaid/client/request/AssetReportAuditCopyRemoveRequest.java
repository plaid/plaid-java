package com.plaid.client.request;

import com.plaid.client.request.common.BaseClientRequest;

public class AssetReportAuditCopyRemoveRequest extends BaseClientRequest {
  private String auditCopyToken;

  public AssetReportAuditCopyRemoveRequest(String auditCopyToken) {
    this.auditCopyToken = auditCopyToken;
  }
}
