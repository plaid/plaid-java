package com.plaid.client.integration;

import static org.junit.Assert.assertTrue;

import com.plaid.client.model.AssetReportCreateResponse;
import com.plaid.client.model.AssetReportPDFGetRequest;
import com.plaid.client.model.Products;
import java.util.Arrays;
import java.util.List;
import okhttp3.ResponseBody;
import org.junit.Test;
import retrofit2.Response;

public class AssetReportPdfGetTest extends AbstractItemIntegrationTest {

  @Override
  protected List<Products> setupItemProducts() {
    return Arrays.asList(Products.ASSETS);
  }

  @Override
  protected String setupItemInstitutionId() {
    return TARTAN_BANK_INSTITUTION_ID;
  }

  @Test
  public void testAssetReportPdfGetSuccess() throws Exception {
    // Create asset report to get an asset report token
    List<String> accessTokens = Arrays.asList(
      getItemPublicTokenExchangeResponse().getAccessToken()
    );
    Response<AssetReportCreateResponse> createResponse = AssetReportCreateTest.createAssetReport(
      client(),
      accessTokens
    );
    String assetReportToken = createResponse.body().getAssetReportToken();

    AssetReportGetTest.waitTillReady(client(), assetReportToken);

    AssetReportPDFGetRequest assetReportPdfGet = new AssetReportPDFGetRequest()
      .assetReportToken(assetReportToken);

    Response<ResponseBody> response = client()
      .assetReportPdfGet(assetReportPdfGet)
      .execute();
    assertTrue(response.body().bytes().length > 0);
  }
}
