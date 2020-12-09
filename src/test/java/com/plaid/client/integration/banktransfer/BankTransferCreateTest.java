package com.plaid.client.integration.banktransfer;

import static org.junit.Assert.assertNotNull;

public class BankTransferCreateTest extends AbstractBankTransferTest {
  @Override
  protected void bankTransferTest() throws AssertionError {
    assertNotNull(getBankTransfer().getId());
  }
};