package com.plaid.client.request.banktransfer;

import com.plaid.client.request.common.BaseClientRequest;

/**
 * Request for the /bank_transfer/balance/get endpoint.
 *
 * @see <a href="https://plaid.com/docs/api/">https://plaid.com/docs/api</a>
 */
public class BankTransferBalanceGetRequest extends BaseClientRequest {
  private String originationAccountId;

  public BankTransferBalanceGetRequest withOriginationAccountId(String originationAccountId) {
    this.originationAccountId = originationAccountId;
    return this;
  }
}
