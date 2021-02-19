package com.plaid.client.integration;

import static org.junit.Assert.assertTrue;

import com.plaid.client.model.AssetReportCreateResponse;
import com.plaid.client.model.AssetReportRemoveRequest;
import com.plaid.client.model.AssetReportRemoveResponse;
import com.plaid.client.model.Products;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import retrofit2.Response;

public class AssetReportRemoveTest extends AbstractItemIntegrationTest {

  @Override
  protected List<Products> setupItemProducts() {
    return Arrays.asList(Products.ASSETS);
  }

  @Override
  protected String setupItemInstitutionId() {
    return TARTAN_BANK_INSTITUTION_ID;
  }

  @Test
  public void testAssetReportRemoveSuccess() throws Exception {
    // Create asset report to get an asset report token
    List<String> accessTokens = Arrays.asList(
      getItemPublicTokenExchangeResponse().getAccessToken()
    );
    Response<AssetReportCreateResponse> createResponse = AssetReportCreateTest.createAssetReport(
      client(),
      accessTokens
    );
    String assetReportToken = createResponse.body().getAssetReportToken();

    // Poll Plaid till report is ready
    AssetReportGetTest.waitTillReady(client(), assetReportToken);
    AssetReportRemoveRequest assetReportRemoveRequest = new AssetReportRemoveRequest()
      .assetReportToken(assetReportToken);

    Response<AssetReportRemoveResponse> response = client()
      .assetReportRemove(assetReportRemoveRequest)
      .execute();

    assertTrue(response.body().getRemoved());
  }
}
