package com.plaid.client.integration;

import static org.junit.Assert.assertTrue;

// import com.plaid.client.PlaidClient;
import com.plaid.client.model.AssetReportAuditCopyCreateRequest;
import com.plaid.client.model.AssetReportAuditCopyCreateResponse;
import com.plaid.client.model.AssetReportAuditCopyRemoveRequest;
import com.plaid.client.model.AssetReportAuditCopyRemoveResponse;
import com.plaid.client.model.AssetReportCreateResponse;
import com.plaid.client.model.Products;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import retrofit2.Response;

public class AssetReportAuditCopyRemoveTest
  extends AbstractItemIntegrationTest {

  @Override
  protected List<Products> setupItemProducts() {
    return Arrays.asList(Products.ASSETS);
  }

  @Override
  protected String setupItemInstitutionId() {
    return TARTAN_BANK_INSTITUTION_ID;
  }

  @Test
  public void testAssetReportAuditCopyRemoveSuccess() throws Exception {
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

    AssetReportAuditCopyCreateRequest auditCopyCreateRequest = new AssetReportAuditCopyCreateRequest()
      .assetReportToken(assetReportToken)
      .auditorId("fannie_mae");

    Response<AssetReportAuditCopyCreateResponse> auditCopyCreateResponse = client()
      .assetReportAuditCopyCreate(auditCopyCreateRequest)
      .execute();
    String auditCopyToken = auditCopyCreateResponse.body().getAuditCopyToken();

    AssetReportAuditCopyRemoveRequest request = new AssetReportAuditCopyRemoveRequest()
      .auditCopyToken(auditCopyToken);

    Response<AssetReportAuditCopyRemoveResponse> response = client()
      .assetReportAuditCopyRemove(request)
      .execute();
    assertTrue(response.body().getRemoved());
  }
}
