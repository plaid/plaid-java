package com.plaid.client.integration;

import com.plaid.client.PlaidClient;
import com.plaid.client.request.AssetReportAuditCopyCreateRequest;
import com.plaid.client.request.common.Product;
import com.plaid.client.response.AssetReportAuditCopyCreateResponse;
import com.plaid.client.response.AssetReportCreateResponse;
import org.junit.Test;
import retrofit2.Response;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertNotNull;

public class AssetReportAuditCopyCreateTest extends AbstractItemIntegrationTest {

  @Override
  protected List<Product> setupItemProducts() {
    return Arrays.asList(Product.ASSETS);
  }

  @Override
  protected String setupItemInstitutionId() {
    return TARTAN_BANK_INSTITUTION_ID;
  }

  @Test
  public void testAssetReportAuditCopyCreateSuccess() throws Exception {
    // Create asset report to get an asset report token
    PlaidClient client = client();
    List<String> accessTokens = Arrays.asList(getItemPublicTokenExchangeResponse().getAccessToken());
    Response<AssetReportCreateResponse> createResponse = AssetReportCreateTest.createAssetReport(client, accessTokens);
    String assetReportToken = createResponse.body().getAssetReportToken();

    AssetReportGetTest.waitTillReady(client, assetReportToken);

    AssetReportAuditCopyCreateRequest request = new AssetReportAuditCopyCreateRequest(assetReportToken, "fannie_mae");
    Response<AssetReportAuditCopyCreateResponse> response = client.service().assetReportAuditCopyCreate(request).execute();
    assertNotNull(response.body().getAuditCopyToken());
  }
}
