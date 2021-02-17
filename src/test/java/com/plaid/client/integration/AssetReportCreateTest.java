package com.plaid.client.integration;

import static org.junit.Assert.assertNotNull;

import com.plaid.client.model.AssetReportCreateRequest;
import com.plaid.client.model.AssetReportCreateRequestOptions;
import com.plaid.client.model.AssetReportCreateResponse;
import com.plaid.client.model.AssetReportUser;
import com.plaid.client.model.Products;
import com.plaid.client.request.PlaidApi;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import retrofit2.Response;

public class AssetReportCreateTest extends AbstractItemIntegrationTest {

  /**
   * Utility method that creates an asset report given a client and a list of
   * access tokens. Used by other integration tests (ex.
   * {@link AssetReportGetTest}) to set up.
   */
  public static Response<AssetReportCreateResponse> createAssetReport(
    PlaidApi client,
    List<String> accessTokens
  )
    throws Exception {
    String webhookUrl = "https://some.webook.example.com";
    AssetReportCreateRequest assetReportCreateRequest = new AssetReportCreateRequest()
      .accessTokens(accessTokens)
      .daysRequested(365);

    AssetReportUser assetReportUser = new AssetReportUser()
      .firstName("Alberta")
      .middleName("Bobbeth")
      .lastName("Charleson");

    AssetReportCreateRequestOptions assetReportCreateOptions = new AssetReportCreateRequestOptions()
      .user(assetReportUser)
      .webhook(webhookUrl);

    assetReportCreateRequest.options(assetReportCreateOptions);

    Response<AssetReportCreateResponse> response = client
      .assetReportCreate(assetReportCreateRequest)
      .execute();

    return response;
  }

  @Override
  protected List<Products> setupItemProducts() {
    return Arrays.asList(Products.ASSETS);
  }

  @Override
  protected String setupItemInstitutionId() {
    return TARTAN_BANK_INSTITUTION_ID;
  }

  @Test
  public void testAssetReportCreateSuccess() throws Exception {
    List<String> accessTokens = Arrays.asList(
      getItemPublicTokenExchangeResponse().getAccessToken()
    );
    Response<AssetReportCreateResponse> response = createAssetReport(
      client(),
      accessTokens
    );
    assertSuccessResponse(response);
    assertNotNull(response.body().getAssetReportId());
    assertNotNull(response.body().getAssetReportToken());
  }
}
