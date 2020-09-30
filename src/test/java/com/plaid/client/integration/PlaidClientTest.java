package com.plaid.client.integration;

import com.plaid.client.request.InstitutionsSearchRequest;
import com.plaid.client.response.ErrorResponse;
import com.plaid.client.response.InstitutionsSearchResponse;
import org.junit.Test;
import retrofit2.Response;

import java.util.Arrays;

import static org.junit.Assert.*;

public class PlaidClientTest extends AbstractIntegrationTest {

  @Test
  public void testFailedRequest() throws Exception {
    Response<InstitutionsSearchResponse> resp = client().service().institutionsSearch(new InstitutionsSearchRequest("", Arrays.asList("US"))).execute();

    assertFalse(resp.isSuccessful());

    ErrorResponse errorResponse = client().parseError(resp);

    assertNull(errorResponse.getDisplayMessage());
    assertEquals("INVALID_FIELD", errorResponse.getErrorCode());
    assertEquals("query must be a non-empty string", errorResponse.getErrorMessage());
    assertEquals(ErrorResponse.ErrorType.INVALID_REQUEST, errorResponse.getErrorType());
    assertNotNull(errorResponse.getRequestId());
  }
}
