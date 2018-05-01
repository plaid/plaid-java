package com.plaid.client;

import com.plaid.client.request.TransactionsGetRequest;
import java.util.Date;
import org.junit.Test;

public class TransactionsGetRequestTest {
  @Test(expected = IllegalArgumentException.class)
  public void testFailsWithNegativeOffset() {
    new TransactionsGetRequest("abc", new Date(), new Date()).withOffset(-1);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testFailsWithNegativeCount() {
    new TransactionsGetRequest("abc", new Date(), new Date()).withCount(-1);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testFailsWithLargeCount() {
    new TransactionsGetRequest("abc", new Date(), new Date()).withCount(501);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testFailsWithNullOptions() {
    new TransactionsGetRequest("abc", new Date(), new Date()).withOptions(null);
  }

  @Test
  public void testSucceedsWithNormalValues() {
    new TransactionsGetRequest("abc", new Date(), new Date()).withCount(0);
    new TransactionsGetRequest("abc", new Date(), new Date()).withCount(500);
    new TransactionsGetRequest("abc", new Date(), new Date()).withCount(1);
    new TransactionsGetRequest("abc", new Date(), new Date()).withCount(200);

    new TransactionsGetRequest("abc", new Date(), new Date()).withOffset(0);
    new TransactionsGetRequest("abc", new Date(), new Date()).withOffset(1);
    new TransactionsGetRequest("abc", new Date(), new Date()).withOffset(100);
  }
}
