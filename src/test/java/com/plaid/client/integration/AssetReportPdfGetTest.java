package com.plaid.client.integration;

import com.plaid.client.PlaidClient;
import com.plaid.client.request.AssetReportPdfGetRequest;
import com.plaid.client.request.common.Product;
import com.plaid.client.response.AssetReportCreateResponse;
import okhttp3.ResponseBody;
import org.junit.Test;
import retrofit2.Response;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class AssetReportPdfGetTest extends AbstractItemIntegrationTest {

  @Override
  protected List<Product> setupItemProducts() {
    return Arrays.asList(Product.ASSETS);
  }

  @Override
  protected String setupItemInstitutionId() {
    return TARTAN_BANK_INSTITUTION_ID;
  }

  @Test
  public void testAssetReportPdfGetSuccess() throws Exception {
    // Create asset report to get an asset report token
    PlaidClient client = client();
    List<String> accessTokens = Arrays.asList(getItemPublicTokenExchangeResponse().getAccessToken());
    Response<AssetReportCreateResponse> createResponse = AssetReportCreateTest.createAssetReport(client, accessTokens);
    String assetReportToken = createResponse.body().getAssetReportToken();

    AssetReportGetTest.waitTillReady(client, assetReportToken);

    AssetReportPdfGetRequest assetReportPdfGet = new AssetReportPdfGetRequest(assetReportToken);
    Response<ResponseBody> response = client.service().assetReportPdfGet(assetReportPdfGet).execute();
    assertTrue(response.body().bytes().length > 0);
  }
}
