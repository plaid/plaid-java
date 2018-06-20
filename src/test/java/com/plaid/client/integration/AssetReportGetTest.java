package com.plaid.client.integration;

import com.plaid.client.PlaidClient;
import com.plaid.client.request.AssetReportGetRequest;
import com.plaid.client.request.common.Product;
import com.plaid.client.response.AssetReportCreateResponse;
import com.plaid.client.response.AssetReportGetResponse;
import org.junit.Test;
import retrofit2.Response;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class AssetReportGetTest extends AbstractItemIntegrationTest {

  @Override
  protected List<Product> setupItemProducts() {
    return Arrays.asList(Product.ASSETS);
  }

  @Override
  protected String setupItemInstitutionId() {
    return TARTAN_BANK_INSTITUTION_ID;
  }

  @Test
  public void testAssetReportGetSuccess() throws Exception {
    // Create asset report to get a asset report token
    List<String> accessTokens = Arrays.asList(getItemCreateResponse().getAccessToken());
    Response<AssetReportCreateResponse> createResponse = AssetReportCreateTest.createAssetReport(client(), accessTokens);
    String assetReportToken = createResponse.body().getAssetReportToken();

    // Wait till asset report is ready
    Response<AssetReportGetResponse> response = waitTillReady(client(), assetReportToken);

    // Validate the responses
    AssetReportGetResponse respBody = response.body();
    assertSuccessResponse(response);

    assertNotNull(respBody.getReport());
    assertNotNull(respBody.getReport().getUser());
    assertFalse(respBody.getReport().getItems().isEmpty());

    assertNotNull(respBody.getReport().getAssetReportId());
    assertEquals(new Integer(365), respBody.getReport().getDaysRequested());

    assertEquals("Alberta", respBody.getReport().getUser().getFirstName());
    assertEquals("Charleson", respBody.getReport().getUser().getLastName());
    assertEquals(1, respBody.getReport().getItems().size());

    AssetReportGetResponse.Item assetItem = respBody.getReport().getItems().get(0);
    assertEquals(4, assetItem.getAccounts().size());
    assertEquals("ins_109511", assetItem.getInstitutionId());
    assertEquals("Tartan Bank", assetItem.getInstitutionName());
  }

  /**
   * Utility function that polls Plaid till we see the Asset Report is ready
   */
  public static Response<AssetReportGetResponse> waitTillReady(
          PlaidClient client, String assetReportToken) throws Exception {
    int NUM_RETRIES = 20;
    int INTER_REQUEST_SLEEP = 1000; // millis
    int attempt = 1;
    Response<AssetReportGetResponse> response;
    do {
      AssetReportGetRequest assetReportGet = new AssetReportGetRequest(assetReportToken);
      response = client.service().assetReportGet(assetReportGet).execute();
      attempt++;
      Thread.sleep(INTER_REQUEST_SLEEP);
    } while (
        !response.isSuccessful() &&
         response.errorBody() != null &&
         client.parseError(response).getErrorCode().equals("PRODUCT_NOT_READY") &&
         attempt < NUM_RETRIES
      );
    return response;
  }
}
