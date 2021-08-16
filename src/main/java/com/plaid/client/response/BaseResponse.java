package com.plaid.client.response;

public abstract class BaseResponse {
  private String requestId;

  public String getRequestId() {
    return requestId;
  }
}
