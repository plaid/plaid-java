package com.plaid.client.integration;

import com.plaid.client.request.SandboxItemResetLoginRequest;
import com.plaid.client.request.common.Product;
import com.plaid.client.response.ErrorResponse;
import com.plaid.client.response.SandboxItemResetLoginResponse;
import org.junit.Test;
import retrofit2.Response;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class SandboxItemResetLoginTest extends AbstractItemIntegrationTest {
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
    Response<SandboxItemResetLoginResponse> response =
      client().service().sandboxItemResetLogin(new SandboxItemResetLoginRequest(getItemPublicTokenExchangeResponse().getAccessToken())).execute();

    assertSuccessResponse(response);
    assertTrue(response.body().getResetLogin());
  }
}
