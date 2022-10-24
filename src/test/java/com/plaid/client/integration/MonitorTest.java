package com.plaid.client.integration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import com.plaid.client.model.AccountIdentity;
import com.plaid.client.model.Address;
import com.plaid.client.model.Email;
import com.plaid.client.model.PlaidError;
import com.plaid.client.model.WatchlistScreeningRequestSearchTerms;
import com.plaid.client.model.WatchlistScreeningIndividualCreateRequest;
import com.plaid.client.model.WatchlistScreeningIndividualCreateResponse;
import com.plaid.client.model.WatchlistScreeningIndividualUpdateRequest;
import com.plaid.client.model.WatchlistScreeningIndividualUpdateResponse;
import com.plaid.client.model.WatchlistScreeningIndividualGetRequest;
import com.plaid.client.model.WatchlistScreeningIndividualGetResponse;
import com.plaid.client.model.WatchlistScreeningIndividualListRequest;
import com.plaid.client.model.WatchlistScreeningIndividualListResponse;
import com.plaid.client.model.WatchlistScreeningIndividualHistoryListRequest;
import com.plaid.client.model.WatchlistScreeningIndividualHistoryListResponse;
import com.plaid.client.model.WatchlistScreeningStatus;
import java.time.Instant;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import retrofit2.Response;
import java.time.LocalDate;

public class MonitorTest extends AbstractIntegrationTest {
    private static final String WATCHLIST_PROGRAM_ID = "prg_egdF5fGjY8fWqk";

    @Test
    public void testSuccess() throws Exception {
        String customerReference = "monitor-user-" + Instant.now();

        // Create
        WatchlistScreeningRequestSearchTerms searchTerms = new WatchlistScreeningRequestSearchTerms();
        searchTerms.setWatchlistProgramId(WATCHLIST_PROGRAM_ID);
        searchTerms.setLegalName("Domingo Huang");
        searchTerms.setDocumentNumber("123456789");
        searchTerms.setDateOfBirth(LocalDate.of(1990, 1, 1));
        searchTerms.setCountry("US");
        WatchlistScreeningIndividualCreateRequest watchlistScreeningIndividualCreateRequest =
          new WatchlistScreeningIndividualCreateRequest();
        watchlistScreeningIndividualCreateRequest.setClientUserId(customerReference);
        watchlistScreeningIndividualCreateRequest.setSearchTerms(searchTerms);

        Response<WatchlistScreeningIndividualCreateResponse> watchlistScreeningIndividualCreateResponse = client()
          .watchlistScreeningIndividualCreate(watchlistScreeningIndividualCreateRequest)
          .execute();
        assertSuccessResponse(watchlistScreeningIndividualCreateResponse);
        assertEquals(WatchlistScreeningStatus.CLEARED, watchlistScreeningIndividualCreateResponse.body().getStatus());

        // Get
        WatchlistScreeningIndividualGetRequest watchlistScreeningIndividualGetRequest =
          new WatchlistScreeningIndividualGetRequest();
        watchlistScreeningIndividualGetRequest
          .setWatchlistScreeningId(watchlistScreeningIndividualCreateResponse.body().getId());
        Response<WatchlistScreeningIndividualGetResponse> watchlistScreeningIndividualGetResponse = client()
          .watchlistScreeningIndividualGet(watchlistScreeningIndividualGetRequest)
          .execute();
        assertEquals(
          watchlistScreeningIndividualCreateResponse.body().getClientUserId(),
          watchlistScreeningIndividualGetResponse.body().getClientUserId()
        );

        // Update
        WatchlistScreeningIndividualUpdateRequest watchlistScreeningIndividualUpdateRequest =
          new WatchlistScreeningIndividualUpdateRequest();
        watchlistScreeningIndividualUpdateRequest
          .setWatchlistScreeningId(watchlistScreeningIndividualCreateResponse.body().getId());
        watchlistScreeningIndividualUpdateRequest.setStatus(WatchlistScreeningStatus.PENDING_REVIEW);

        Response<WatchlistScreeningIndividualUpdateResponse> watchlistScreeningIndividualUpdateResponse = client()
          .watchlistScreeningIndividualUpdate(watchlistScreeningIndividualUpdateRequest)
          .execute();
        assertSuccessResponse(watchlistScreeningIndividualUpdateResponse);
        assertEquals(
          watchlistScreeningIndividualCreateResponse.body().getId(),
          watchlistScreeningIndividualUpdateResponse.body().getId()
        );
        assertEquals(
          WatchlistScreeningStatus.PENDING_REVIEW,
          watchlistScreeningIndividualUpdateResponse.body().getStatus()
        );

        // List
        WatchlistScreeningIndividualListRequest watchlistScreeningIndividualListRequest =
          new WatchlistScreeningIndividualListRequest();
        watchlistScreeningIndividualListRequest.setWatchlistProgramId(WATCHLIST_PROGRAM_ID);
        watchlistScreeningIndividualListRequest.setStatus(WatchlistScreeningStatus.CLEARED);

        Response<WatchlistScreeningIndividualListResponse> watchlistScreeningIndividualListResponse = client()
          .watchlistScreeningIndividualList(watchlistScreeningIndividualListRequest)
          .execute();
        assertSuccessResponse(watchlistScreeningIndividualListResponse);
        assertFalse(watchlistScreeningIndividualListResponse.body().getWatchlistScreenings().isEmpty());

        // List History
        WatchlistScreeningIndividualHistoryListRequest watchlistScreeningIndividualHistoryListRequest =
          new WatchlistScreeningIndividualHistoryListRequest();
        watchlistScreeningIndividualHistoryListRequest
          .setWatchlistScreeningId(watchlistScreeningIndividualCreateResponse.body().getId());

        Response<WatchlistScreeningIndividualHistoryListResponse> watchlistScreeningIndividualHistoryListResponse =
          client().watchlistScreeningIndividualHistoryList(watchlistScreeningIndividualHistoryListRequest).execute();
        assertEquals(2, watchlistScreeningIndividualHistoryListResponse.body().getWatchlistScreenings().size());
    }
}
