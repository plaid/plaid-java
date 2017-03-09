package com.plaid.client.integration;

import com.plaid.client.request.ItemAccessTokenUpdateVersionRequest;
import com.plaid.client.response.ErrorResponse;
import com.plaid.client.response.ItemAccessTokenUpdateVersionResponse;
import org.junit.Test;
import retrofit2.Response;

public class ItemAccessTokenUpdateVersionTest extends AbstractIntegrationTest {
  @Test
  public void testInvalidAccessToken() throws Exception {
    Response<ItemAccessTokenUpdateVersionResponse> response = client().service().itemAccessTokenUpdateVersion(
      new ItemAccessTokenUpdateVersionRequest("not-real"))
      .execute();

    assertErrorResponse(response, ErrorResponse.ErrorType.INVALID_REQUEST, "INVALID_FIELD");
  }
}
