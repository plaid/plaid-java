package com.plaid.client.integration;

import com.plaid.client.model.AssetReportAuditCopyCreateRequest;
import com.plaid.client.model.Products;
import com.plaid.client.model.AssetReportAuditCopyCreateResponse;
import com.plaid.client.model.AssetReportCreateResponse;
import org.junit.Test;
import retrofit2.Response;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertNotNull;

public class AssetReportAuditCopyCreateTest extends AbstractItemIntegrationTest {

  @Override
  protected List<Products> setupItemProducts() {
    return Arrays.asList(Products.ASSETS);
  }

  @Override
  protected String setupItemInstitutionId() {
    return TARTAN_BANK_INSTITUTION_ID;
  }

  @Test
  public void testAssetReportAuditCopyCreateSuccess() throws Exception {
    // Create asset report to get an asset report token
    List<String> accessTokens = Arrays.asList(getItemPublicTokenExchangeResponse().getAccessToken());
    Response<AssetReportCreateResponse> createResponse = AssetReportCreateTest.createAssetReport(client(), accessTokens);
    String assetReportToken = createResponse.body().getAssetReportToken();

    AssetReportGetTest.waitTillReady(client(), assetReportToken);

    AssetReportAuditCopyCreateRequest request = new AssetReportAuditCopyCreateRequest()
    .assetReportToken(assetReportToken)
    .auditorId("fannie_mae");

    Response<AssetReportAuditCopyCreateResponse> response = client().assetReportAuditCopyCreate(request).execute();
    assertNotNull(response.body().getAuditCopyToken());
  }
}
