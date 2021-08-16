package com.plaid.client.integration;

import com.plaid.client.PlaidClient;
import com.plaid.client.request.AssetReportAuditCopyCreateRequest;
import com.plaid.client.request.AssetReportAuditCopyRemoveRequest;
import com.plaid.client.request.common.Product;
import com.plaid.client.response.AssetReportAuditCopyCreateResponse;
import com.plaid.client.response.AssetReportAuditCopyRemoveResponse;
import com.plaid.client.response.AssetReportCreateResponse;
import org.junit.Test;
import retrofit2.Response;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class AssetReportAuditCopyRemoveTest extends AbstractItemIntegrationTest {

  @Override
  protected List<Product> setupItemProducts() {
    return Arrays.asList(Product.ASSETS);
  }

  @Override
  protected String setupItemInstitutionId() {
    return TARTAN_BANK_INSTITUTION_ID;
  }

  @Test
  public void testAssetReportAuditCopyRemoveSuccess() throws Exception {
    // Create asset report to get an asset report token
    PlaidClient client = client();
    List<String> accessTokens = Arrays.asList(getItemPublicTokenExchangeResponse().getAccessToken());
    Response<AssetReportCreateResponse> createResponse = AssetReportCreateTest.createAssetReport(client, accessTokens);
    String assetReportToken = createResponse.body().getAssetReportToken();

    AssetReportGetTest.waitTillReady(client, assetReportToken);

    AssetReportAuditCopyCreateRequest auditCopyCreateRequest = new AssetReportAuditCopyCreateRequest(assetReportToken, "fannie_mae");
    Response<AssetReportAuditCopyCreateResponse> auditCopyCreateResponse = client.service().assetReportAuditCopyCreate(auditCopyCreateRequest).execute();

    String auditCopyToken = auditCopyCreateResponse.body().getAuditCopyToken();
    AssetReportAuditCopyRemoveRequest request = new AssetReportAuditCopyRemoveRequest(auditCopyToken);
    Response<AssetReportAuditCopyRemoveResponse> response = client.service().assetReportAuditCopyRemove(request).execute();
    assertTrue(response.body().getRemoved());
  }
}
