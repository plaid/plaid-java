package com.plaid.client.integration;

import static org.junit.Assert.assertTrue;

import com.plaid.client.model.Error;
import com.plaid.client.model.Products;
import com.plaid.client.model.SandboxItemResetLoginRequest;
import com.plaid.client.model.SandboxItemResetLoginResponse;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import retrofit2.Response;

public class SandboxItemResetLoginTest extends AbstractItemIntegrationTest {

  @Override
  protected List<Products> setupItemProducts() {
    return Arrays.asList(Products.AUTH);
  }

  @Override
  protected String setupItemInstitutionId() {
    return TARTAN_BANK_INSTITUTION_ID;
  }

  @Test
  public void testSuccess() throws Exception {
    SandboxItemResetLoginRequest request = new SandboxItemResetLoginRequest()
      .accessToken(getItemPublicTokenExchangeResponse().getAccessToken());

    Response<SandboxItemResetLoginResponse> response = client()
      .sandboxItemResetLogin(request)
      .execute();

    assertSuccessResponse(response);
    assertTrue(response.body().getResetLogin());
  }
}
