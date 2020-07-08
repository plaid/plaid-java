package com.plaid.client.integration;

import com.plaid.client.internal.gson.Optional;
import com.plaid.client.request.ItemAddTokenCreateRequest;
import com.plaid.client.request.LinkTokenCreateRequest;
import com.plaid.client.request.common.Product;
import com.plaid.client.response.ItemAddTokenCreateResponse;
import com.plaid.client.response.LinkTokenCreateResponse;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Test;
import retrofit2.Response;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class LinkTokenCreateTest extends AbstractItemIntegrationTest {
  @Override
  protected List<Product> setupItemProducts() {
    return Collections.singletonList(Product.AUTH);
  }

  @Override
  protected String setupItemInstitutionId() {
    return TARTAN_BANK_INSTITUTION_ID;
  }

  @Test
  public void testSuccess() throws Exception {
    String clientUserId = Long.toString((new Date()).getTime());
    LinkTokenCreateRequest.User user = new LinkTokenCreateRequest.User(clientUserId);
    Response<LinkTokenCreateResponse> response =
      client().service().linkTokenCreate(
        new LinkTokenCreateRequest(
          user,
          "very nice client name",
          Collections.singletonList("auth"))).execute();

    assertSuccessResponse(response);
    assertNotNull(response.body().getToken());
    assertTrue(response.body().getExpiration().after(new Date()));
  }

  @Test
  public void testSuccess_full() throws Exception {
    String clientUserId = Long.toString((new Date()).getTime());

    LinkTokenCreateRequest.User user = new LinkTokenCreateRequest.User(clientUserId)
      .withLegalName("Legal name")
      .withPhoneNumber("4155558888")
      .withEmailAddress("email@address.com")
      .withPhoneNumberVerifiedTime(new Date())
      .withEmailAddressVerifiedTime(new Date());
    Map<String, LinkTokenCreateRequest.SubtypeFilters> accountFilters = new HashMap<>();
    accountFilters.put("depository",
      new LinkTokenCreateRequest.SubtypeFilters(Collections.singletonList("checking")));
    LinkTokenCreateRequest request = new LinkTokenCreateRequest(
      user,
      "very nice client name",
      Collections.singletonList("auth"))
      .withCountryCodes(Collections.singletonList("US"))
      .withLanguage("en")
      .withWebhook("https://example.com/webhook")
      .withLinkCustomizationName("default")
      .withAccountFilters(accountFilters);

    Response<LinkTokenCreateResponse> response =
      client().service().linkTokenCreate(
        request).execute();

    assertSuccessResponse(response);
    assertNotNull(response.body().getToken());
    assertTrue(response.body().getExpiration().after(new Date()));
  }
}
