package com.plaid.client.integration;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import com.plaid.client.model.AssetReportAuditCopyCreateRequest;
import com.plaid.client.model.AssetReportAuditCopyCreateResponse;
import com.plaid.client.model.AssetReportAuditCopyGetRequest;
import com.plaid.client.model.AssetReportCreateResponse;
import com.plaid.client.model.AssetReportGetResponse;
import com.plaid.client.model.Products;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import retrofit2.Response;

public class AssetReportAuditCopyGetTest extends AbstractItemIntegrationTest {

  @Override
  protected List<Products> setupItemProducts() {
    return Arrays.asList(Products.ASSETS);
  }

  @Override
  protected String setupItemInstitutionId() {
    return TARTAN_BANK_INSTITUTION_ID;
  }

  @Test
  public void testAssetReportAuditCopyGetSuccess() throws Exception {
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

    AssetReportAuditCopyCreateRequest request = new AssetReportAuditCopyCreateRequest()
      .assetReportToken(assetReportToken)
      .auditorId(System.getenv("PLAID_CLIENT_ID"));

    Response<AssetReportAuditCopyCreateResponse> response = client()
      .assetReportAuditCopyCreate(request)
      .execute();
    String auditCopyToken = response.body().getAuditCopyToken();
    assertNotNull(auditCopyToken);

    AssetReportAuditCopyGetRequest assetReportAuditCopyGetRequest = new AssetReportAuditCopyGetRequest()
      .auditCopyToken(auditCopyToken);

    Response<AssetReportGetResponse> auditCopyGetResponse = client()
      .assetReportAuditCopyGet(assetReportAuditCopyGetRequest)
      .execute();

    // Validate the responses
    AssetReportGetResponse respBody = auditCopyGetResponse.body();

    assertSuccessResponse(auditCopyGetResponse);

    assertNotNull(respBody.getReport());
    assertNotNull(respBody.getReport().getUser());
    assertFalse(respBody.getReport().getItems().isEmpty());

    assertNotNull(respBody.getReport().getAssetReportId());
  }
}
