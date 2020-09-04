package com.plaid.client.integration;

import com.plaid.client.request.LinkTokenCreateRequest;
import com.plaid.client.request.LinkTokenGetRequest;
import com.plaid.client.request.common.Product;
import com.plaid.client.response.ErrorResponse;
import com.plaid.client.response.LinkTokenCreateResponse;
import com.plaid.client.response.LinkTokenGetResponse;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Test;
import retrofit2.Response;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class LinkTokenGetTest extends AbstractItemIntegrationTest {
  @Override
  protected List<Product> setupItemProducts() {
    return Collections.singletonList(Product.AUTH);
  }

  @Override
  protected String setupItemInstitutionId() {
    return TARTAN_BANK_INSTITUTION_ID;
  }

  @Test
  public void testInvalidToken() throws Exception {
    Response<LinkTokenGetResponse> response =
      client().service().linkTokenGet(
        new LinkTokenGetRequest("bad token")).execute();

    assertErrorResponse(response, ErrorResponse.ErrorType.INVALID_REQUEST, "INVALID_FIELD");
  }

  @Test
  public void testSuccess() throws Exception {
    String clientUserId = Long.toString((new Date()).getTime());
    LinkTokenCreateRequest.User user = new LinkTokenCreateRequest.User(clientUserId);
    String clientName = "very nice client name";
    Map<String, LinkTokenCreateRequest.SubtypeFilters> accountFilters =
      new HashMap<>();
    accountFilters.put("depository",
      new LinkTokenCreateRequest.SubtypeFilters(Arrays.asList("savings")));

    LinkTokenCreateRequest request = new LinkTokenCreateRequest(
      user,
      clientName,
      Collections.singletonList("auth"),
      Collections.singletonList("US"),
      "en").withAccountFilters(accountFilters);
    Response<LinkTokenCreateResponse> createResponse =
      client().service().linkTokenCreate(
        request).execute();

    assertSuccessResponse(createResponse);
    String linkToken = createResponse.body().getLinkToken();
    assertNotNull(linkToken);
    Response<LinkTokenGetResponse> getResponse =
      client().service().linkTokenGet(
        new LinkTokenGetRequest(linkToken)).execute();

    assertSuccessResponse(getResponse);
    assertEquals(clientName, getResponse.body().getMetadata().getClientName());
    assertEquals(Arrays.asList("auth"), getResponse.body().getMetadata().getInitialProducts());
    assertEquals(Arrays.asList("US"), getResponse.body().getMetadata().getCountryCodes());
    assertEquals(accountFilters, getResponse.body().getMetadata().getAccountFilters());
  }
}
