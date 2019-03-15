package com.plaid.client.integration;

import com.plaid.client.PlaidClient;
import com.plaid.client.request.AssetReportAuditCopyCreateRequest;
import com.plaid.client.request.AssetReportAuditCopyGetRequest;
import com.plaid.client.request.common.Product;
import com.plaid.client.response.AssetReportAuditCopyCreateResponse;
import com.plaid.client.response.AssetReportCreateResponse;
import com.plaid.client.response.AssetReportGetResponse;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import retrofit2.Response;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

public class AssetReportAuditCopyGetTest extends AbstractItemIntegrationTest {

  private final static String PRODUCT_NOT_READY = "PRODUCT_NOT_READY";

  @Override
  protected List<Product> setupItemProducts() {
    return Arrays.asList(Product.ASSETS);
  }

  @Override
  protected String setupItemInstitutionId() {
    return TARTAN_BANK_INSTITUTION_ID;
  }

  @Test
  public void testAssetReportAuditCopyGetSuccess() throws Exception {
    // Create asset report to get an asset report token
    PlaidClient client = client();
    List<String> accessTokens = Arrays.asList(getItemPublicTokenExchangeResponse().getAccessToken());
    Response<AssetReportCreateResponse> createResponse =
        AssetReportCreateTest.createAssetReport(client, accessTokens);
    String assetReportToken = createResponse.body().getAssetReportToken();

    AssetReportGetTest.waitTillReady(client, assetReportToken);

    String clientId = System.getenv("PLAID_CLIENT_ID");

    AssetReportAuditCopyCreateRequest
        request = new AssetReportAuditCopyCreateRequest(assetReportToken, clientId);
    Response<AssetReportAuditCopyCreateResponse> response =
        client.service().assetReportAuditCopyCreate(request).execute();
    String auditCopyToken = response.body().getAuditCopyToken();
    assertNotNull(auditCopyToken);

    AssetReportAuditCopyGetRequest assetReportAuditCopyGetRequest =
        new AssetReportAuditCopyGetRequest(auditCopyToken);

    Response<AssetReportGetResponse> auditCopyGetResponse =
        client
            .service()
            .assetReportAuditCopyGet(assetReportAuditCopyGetRequest
            )
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

