package com.plaid.client.integration;

import com.plaid.client.request.ItemAddTokenCreateRequest;
import com.plaid.client.request.common.Product;
import com.plaid.client.response.ErrorResponse;
import com.plaid.client.response.ItemAddTokenCreateResponse;
import org.junit.Test;
import retrofit2.Response;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class ItemAddTokenCreateTest extends AbstractItemIntegrationTest {
  @Override
  protected List<Product> setupItemProducts() {
    return Arrays.asList(Product.AUTH);
  }

  @Override
  protected String setupItemInstitutionId() {
    return TARTAN_BANK_INSTITUTION_ID;
  }

  @Test
  public void testSuccess() throws Exception {
    String clientUserId = Long.toString((new Date()).getTime());
    Response<ItemAddTokenCreateResponse> response =
      client().service().itemAddTokenCreate(
        new ItemAddTokenCreateRequest(
          new ItemAddTokenCreateRequest.User(clientUserId))).execute();

    assertSuccessResponse(response);
    assertNotNull(response.body().getAddToken());
    assertTrue(response.body().getExpiration().after(new Date()));
  }

  @Test
  public void testSuccessWithUserOptions() throws Exception {
    String clientUserId = Long.toString((new Date()).getTime());
    String legalName = "John Doe";
    String phoneNumber = "+1 415 555 0123";
    String emailAddress = "example@plaid.com";
    ItemAddTokenCreateRequest.User user =  new ItemAddTokenCreateRequest
      .User(clientUserId)
      .withLegalName(legalName)
      .withPhoneNumber(phoneNumber)
      .withEmailAddress(emailAddress);
    Response<ItemAddTokenCreateResponse> response =
      client().service().itemAddTokenCreate(
        new ItemAddTokenCreateRequest(user)).execute();

    assertSuccessResponse(response);
    assertNotNull(response.body().getAddToken());
    assertTrue(response.body().getExpiration().after(new Date()));
  }

  @Test
  public void testSuccessWithVerifiedUserOptions() throws Exception {
    String clientUserId = Long.toString((new Date()).getTime());
    String phoneNumber = "+1 415 555 0123";
    Date verifiedTime = new Date(0);
    ItemAddTokenCreateRequest.User user =  new ItemAddTokenCreateRequest
      .User(clientUserId)
      .withLegalName("")
      .withVerifiedPhoneNumber("", verifiedTime);
    Response<ItemAddTokenCreateResponse> response =
      client().service().itemAddTokenCreate(
        new ItemAddTokenCreateRequest(user)).execute();

    assertSuccessResponse(response);
    assertNotNull(response.body().getAddToken());
    assertTrue(response.body().getExpiration().after(new Date(0)));
  }
}
