package com.plaid.client;

import com.plaid.client.request.TransactionsGetRequest;
import org.junit.Test;

import java.util.Date;

public class TransactionsGetRequestTest {
  @Test(expected = IllegalArgumentException.class)
  public void testFailsWithNegativeOffset() throws Exception {
    new TransactionsGetRequest("abc", new Date(), new Date()).withOffset(-1);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testFailsWithNegativeCount() throws Exception {
    new TransactionsGetRequest("abc", new Date(), new Date()).withCount(-1);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testFailsWithLargeCount() throws Exception {
    new TransactionsGetRequest("abc", new Date(), new Date()).withCount(501);
  }

  @Test
  public void testSucceedsWithNormalValues() throws Exception {
    new TransactionsGetRequest("abc", new Date(), new Date()).withCount(0);
    new TransactionsGetRequest("abc", new Date(), new Date()).withCount(500);
    new TransactionsGetRequest("abc", new Date(), new Date()).withCount(1);
    new TransactionsGetRequest("abc", new Date(), new Date()).withCount(200);

    new TransactionsGetRequest("abc", new Date(), new Date()).withOffset(0);
    new TransactionsGetRequest("abc", new Date(), new Date()).withOffset(1);
    new TransactionsGetRequest("abc", new Date(), new Date()).withOffset(100);
  }
}
