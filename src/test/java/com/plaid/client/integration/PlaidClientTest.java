package com.plaid.client.integration;

import static org.junit.Assert.*;

import com.plaid.client.model.CountryCode;
import com.plaid.client.model.Error;
import com.plaid.client.model.InstitutionsSearchRequest;
import com.plaid.client.model.InstitutionsSearchResponse;
import com.plaid.client.model.Products;

import java.util.Arrays;
import org.junit.Test;
import retrofit2.Response;

public class PlaidClientTest extends AbstractIntegrationTest {

  @Test
  public void testFailedRequest() throws Exception {
    InstitutionsSearchRequest request = new InstitutionsSearchRequest()
      .products(Arrays.asList(Products.ASSETS))
      .countryCodes(Arrays.asList(CountryCode.US))
      .query("");

    Response<InstitutionsSearchResponse> response = client()
      .institutionsSearch(request)
      .execute();

    assertErrorResponse(response, Error.ErrorTypeEnum.INVALID_REQUEST, "INVALID_FIELD");
  }
}
