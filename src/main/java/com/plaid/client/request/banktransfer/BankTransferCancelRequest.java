package com.plaid.client.request.banktransfer;

import com.plaid.client.request.common.BaseClientRequest;

/**
 * Request for the /bank_transfer/cancel endpoint.
 *
 * @see <a href="https://plaid.com/docs/api/">https://plaid.com/docs/api</a>
 */
public class BankTransferCancelRequest extends BaseClientRequest {
  private String bankTransferId;

  public BankTransferCancelRequest(String bankTransferId) {
    this.bankTransferId = bankTransferId;
  }
}
