package com.plaid.client.response.banktransfer;

import com.plaid.client.response.BaseResponse;

public class BankTransferMigrateAccountResponse extends BaseResponse {
  private String accessToken;
  private String accountId;

  public String getAccessToken() {
    return accessToken;
  }

  public String getAccountId() {
    return accountId;
  }
}
