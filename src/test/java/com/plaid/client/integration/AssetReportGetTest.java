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
  public void testAssetReportGetSuccess() throws Exception {
    // Create asset report to get an asset report token
    List<String> accessTokens = Arrays.asList(getItemPublicTokenExchangeResponse().getAccessToken());
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

    // Retrieve the report as an Asset Report with Insights.
    AssetReportGetRequest assetReportGet =
      new AssetReportGetRequest(assetReportToken)
        .withIncludeInsights(true);
    response = client().service().assetReportGet(assetReportGet).execute();

    respBody = response.body();
    assertSuccessResponse(response);

    assertNotNull(respBody.getReport());

    // An Asset Report with Insights should include a name (when available).
    assertTrue(containsTransactionWithName(respBody.getReport()));
  }

  private boolean containsTransactionWithName(AssetReportGetResponse.AssetReport assetReport) {
    List<AssetReportGetResponse.Account> accounts = assetReport.getItems().get(0).getAccounts();
    for (AssetReportGetResponse.Account account : accounts) {
      if (account.getTransactions().size() > 0) {
        return account.getTransactions().get(0).getName() != null;
      }
    }
    return false;
  }

  /**
   * Utility function that polls Plaid till we see the Asset Report is ready
   */
  public static Response<AssetReportGetResponse> waitTillReady(
          PlaidClient client, String assetReportToken) throws Exception {
    int NUM_RETRIES = 20;
    int INTER_REQUEST_SLEEP = 1000; // millis
    int attempt = 0;
    Response<AssetReportGetResponse> response;
    do {
      AssetReportGetRequest assetReportGet =
        new AssetReportGetRequest(assetReportToken);
      response = client.service().assetReportGet(assetReportGet).execute();
      attempt++;
      Thread.sleep(INTER_REQUEST_SLEEP);
    } while (
        !response.isSuccessful() &&
         response.errorBody() != null &&
         client.parseError(response).getErrorCode().equals(PRODUCT_NOT_READY) &&
         attempt < NUM_RETRIES
      );
    if (!response.isSuccessful()) {
      throw new Exception(
        String.format("Could not get asset report. Failed with %s", client.parseError(response).getErrorMessage()
      ));
    }
    return response;
  }
}
