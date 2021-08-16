package com.plaid.client;

import com.plaid.client.request.InvestmentsTransactionsGetRequest;
import java.util.Date;
import org.junit.Test;

public class InvestmentsTransactionsGetRequestTest {
  @Test(expected = IllegalArgumentException.class)
  public void testFailsWithNegativeOffset() {
    new InvestmentsTransactionsGetRequest("abc", new Date(), new Date()).withOffset(-1);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testFailsWithNegativeCount() {
    new InvestmentsTransactionsGetRequest("abc", new Date(), new Date()).withCount(-1);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testFailsWithLargeCount() {
    new InvestmentsTransactionsGetRequest("abc", new Date(), new Date()).withCount(501);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testFailsWithNullOptions() {
    new InvestmentsTransactionsGetRequest("abc", new Date(), new Date()).withOptions(null);
  }

  @Test
  public void testSucceedsWithNormalValues() {
    new InvestmentsTransactionsGetRequest("abc", new Date(), new Date()).withCount(0);
    new InvestmentsTransactionsGetRequest("abc", new Date(), new Date()).withCount(500);
    new InvestmentsTransactionsGetRequest("abc", new Date(), new Date()).withCount(1);
    new InvestmentsTransactionsGetRequest("abc", new Date(), new Date()).withCount(200);

    new InvestmentsTransactionsGetRequest("abc", new Date(), new Date()).withOffset(0);
    new InvestmentsTransactionsGetRequest("abc", new Date(), new Date()).withOffset(1);
    new InvestmentsTransactionsGetRequest("abc", new Date(), new Date()).withOffset(100);
  }
}
