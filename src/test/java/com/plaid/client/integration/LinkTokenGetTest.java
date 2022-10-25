package com.plaid.client.integration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.plaid.client.model.AccountFiltersResponse;
import com.plaid.client.model.DepositoryAccountSubtype;
import com.plaid.client.model.CountryCode;
import com.plaid.client.model.DepositoryFilter;
import com.plaid.client.model.PlaidError;
import com.plaid.client.model.PlaidErrorType;
import com.plaid.client.model.LinkTokenAccountFilters;
import com.plaid.client.model.LinkTokenCreateRequest;
import com.plaid.client.model.LinkTokenCreateRequestUser;
import com.plaid.client.model.LinkTokenCreateResponse;
import com.plaid.client.model.LinkTokenGetRequest;
import com.plaid.client.model.LinkTokenGetResponse;
import com.plaid.client.model.Products;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Test;
import retrofit2.Response;

public class LinkTokenGetTest extends AbstractItemIntegrationTest {

  @Override
  protected List<Products> setupItemProducts() {
    return Arrays.asList(Products.AUTH);
  }

  @Override
  protected String setupItemInstitutionId() {
    return TARTAN_BANK_INSTITUTION_ID;
  }

  @Test
  public void testInvalidToken() throws Exception {
    LinkTokenGetRequest request = new LinkTokenGetRequest()
      .linkToken("bad token");

    Response<LinkTokenGetResponse> response = client()
      .linkTokenGet(request)
      .execute();

    assertErrorResponse(
      response,
      PlaidErrorType.INVALID_REQUEST,
      "INVALID_FIELD"
    );
  }

  @Test
  public void testSuccess() throws Exception {
    String clientName = "very nice client name";
    String clientUserId = Long.toString((new Date()).getTime());

    LinkTokenCreateRequestUser user = new LinkTokenCreateRequestUser()
    .clientUserId(clientUserId);

    DepositoryFilter types = new DepositoryFilter()
    .accountSubtypes(Arrays.asList(DepositoryAccountSubtype.SAVINGS));

    LinkTokenAccountFilters accountFilters = new LinkTokenAccountFilters()
    .depository(types);

    LinkTokenCreateRequest request = new LinkTokenCreateRequest()
      .user(user)
      .clientName(clientName)
      .products(Arrays.asList(Products.AUTH))
      .countryCodes(Arrays.asList(CountryCode.US))
      .language("en")
      .accountFilters(accountFilters);

    Response<LinkTokenCreateResponse> createResponse = client()
      .linkTokenCreate(request)
      .execute();

    assertSuccessResponse(createResponse);

    String linkToken = createResponse.body().getLinkToken();
    assertNotNull(linkToken);

    LinkTokenGetRequest getRequest = new LinkTokenGetRequest()
      .linkToken(linkToken);

    Response<LinkTokenGetResponse> getResponse = client()
      .linkTokenGet(getRequest)
      .execute();

    assertSuccessResponse(getResponse);
    assertEquals(clientName, getResponse.body().getMetadata().getClientName());
    assertEquals(
      Arrays.asList(Products.AUTH),
      getResponse.body().getMetadata().getInitialProducts()
    );
    assertEquals(
      Arrays.asList(CountryCode.US),
      getResponse.body().getMetadata().getCountryCodes()
    );
    // TODO: Fix when AccountFilters object is condensed.

    DepositoryFilter depositoryType = new DepositoryFilter()
    .accountSubtypes(Arrays.asList(DepositoryAccountSubtype.SAVINGS));

    AccountFiltersResponse filters = new AccountFiltersResponse()
    .depository(depositoryType);

    assertEquals(filters, getResponse.body().getMetadata().getAccountFilters());
  }
}
