package com.plaid.client.integration;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.plaid.client.model.ClientProvidedEnrichedTransaction;
import com.plaid.client.model.ClientProvidedTransaction;
import com.plaid.client.model.ClientProvidedTransactionLocation;
import com.plaid.client.model.EnrichTransactionDirection;
import com.plaid.client.model.TransactionsEnrichGetRequest;
import com.plaid.client.model.TransactionsEnrichGetResponse;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import retrofit2.Response;

public class TransactionsEnrichGetTest extends AbstractIntegrationTest {

  @Test
  public void testTransactionsEnrichSuccess() throws Exception {
    List<ClientProvidedTransaction> transactionsToEnrich = Arrays.asList(
      new ClientProvidedTransaction()
        .id("1")
        .direction(EnrichTransactionDirection.OUTFLOW)
        .isoCurrencyCode("USD")
        .amount(123.00)
        .location(
          new ClientProvidedTransactionLocation().city("Philadelphia").region("PA")
        )
        .description("DDA PURCHASE *XXXX XXXXXXXX FAMILY DOLLAR"),
      new ClientProvidedTransaction()
        .id("2")
        .direction(EnrichTransactionDirection.OUTFLOW)
        .isoCurrencyCode("USD")
        .amount(123.00)
        .description("PURCHASE JUNIATA SUPE PHILADELPHIA PA CARDXXXX"),
      new ClientProvidedTransaction()
        .id("3")
        .direction(EnrichTransactionDirection.OUTFLOW)
        .isoCurrencyCode("USD")
        .amount(123.00)
        .description("DEBIT CARD PURCHASE"),
      new ClientProvidedTransaction()
        .id("4")
        .direction(EnrichTransactionDirection.INFLOW)
        .isoCurrencyCode("USD")
        .amount(123.00)
        .description("DIRECT DEP* UBER.COM")
    );

    TransactionsEnrichGetRequest transactionsEnrichRequest = new TransactionsEnrichGetRequest()
      .accountType("depository").transactions(transactionsToEnrich);

    Response<TransactionsEnrichGetResponse> response = client()
        .transactionsEnrich(transactionsEnrichRequest)
        .execute();

    assertSuccessResponse(response);

    List<ClientProvidedEnrichedTransaction> enrichedTransactions = response.body().getEnrichedTransactions();

    assertTrue(enrichedTransactions.size() == transactionsToEnrich.size());

    for (ClientProvidedEnrichedTransaction item : enrichedTransactions) {
      assertNotNull(item.getAmount());
      assertNotNull(item.getDescription());
      assertNotNull(item.getDirection());
      assertNotNull(item.getEnrichments());
      assertNotNull(item.getId());
    }
  }
}
