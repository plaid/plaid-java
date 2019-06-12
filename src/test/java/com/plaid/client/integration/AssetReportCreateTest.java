package com.plaid.client.integration;

import com.plaid.client.PlaidClient;
import com.plaid.client.request.AssetReportCreateRequest;
import com.plaid.client.request.common.Product;
import com.plaid.client.response.AssetReportCreateResponse;
import org.junit.Test;
import retrofit2.Response;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertNotNull;

public class AssetReportCreateTest extends AbstractItemIntegrationTest {

  /**
   * Utility method that creates an asset report given a client and a list of access tokens.
   * Used by other integration tests (ex. {@link AssetReportGetTest}) to set up.
   */
  public static Response<AssetReportCreateResponse> createAssetReport(
          PlaidClient client, List<String> accessTokens) throws Exception {
    String webhookUrl = "https://some.webook.example.com";
    AssetReportCreateRequest assetReportCreate =
      new AssetReportCreateRequest(accessTokens, 365)
        .withFirstName("Alberta")
        .withMiddleName("Bobbeth")
        .withLastName("Charleson")
        .withWebhook(webhookUrl);

    Response<AssetReportCreateResponse> response =
      client
        .service()
        .assetReportCreate(assetReportCreate)
        .execute();

    return response;
  }

  @Override
  protected List<Product> setupItemProducts() {
    return Arrays.asList(Product.ASSETS);
  }

  @Override
  protected String setupItemInstitutionId() {
    return TARTAN_BANK_INSTITUTION_ID;
  }

  @Test
  public void testAssetReportCreateSuccess() throws Exception {
    List<String> accessTokens = Arrays.asList(getItemPublicTokenExchangeResponse().getAccessToken());
    Response<AssetReportCreateResponse> response = createAssetReport(client(), accessTokens);
    assertSuccessResponse(response);
    assertNotNull(response.body().getAssetReportId());
    assertNotNull(response.body().getAssetReportToken());
  }
}
