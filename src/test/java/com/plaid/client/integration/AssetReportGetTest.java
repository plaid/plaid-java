package com.plaid.client.integration;

import static org.junit.Assert.*;

import com.google.gson.Gson;
import com.plaid.client.model.AccountAssets;
import com.plaid.client.model.AssetReport;
import com.plaid.client.model.AssetReportCreateResponse;
import com.plaid.client.model.AssetReportGetRequest;
import com.plaid.client.model.AssetReportGetResponse;
import com.plaid.client.model.Error;
import com.plaid.client.model.Products;
import com.plaid.client.request.PlaidApi;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;
import org.junit.Test;
import retrofit2.Response;

public class AssetReportGetTest extends AbstractItemIntegrationTest {

  private static final String PRODUCT_NOT_READY = "PRODUCT_NOT_READY";

  @Override
  protected List<Products> setupItemProducts() {
    return Arrays.asList(Products.ASSETS);
  }

  @Override
  protected String setupItemInstitutionId() {
    return TARTAN_BANK_INSTITUTION_ID;
  }

  @Test
  public void testAssetReportGetSuccess() throws Exception {
    // Create asset report to get an asset report token
    List<String> accessTokens = Arrays.asList(
      getItemPublicTokenExchangeResponse().getAccessToken()
    );
    Response<AssetReportCreateResponse> createResponse = AssetReportCreateTest.createAssetReport(
      client(),
      accessTokens
    );
    String assetReportToken = createResponse.body().getAssetReportToken();

    // Wait till asset report is ready
    Response<AssetReportGetResponse> response = waitTillReady(
      client(),
      assetReportToken
    );

    // Validate the responses
    AssetReportGetResponse respBody = response.body();
    assertSuccessResponse(response);

    assertNotNull(respBody.getReport());
    assertNotNull(respBody.getReport().getUser());
    assertFalse(respBody.getReport().getItems().isEmpty());

    assertNotNull(respBody.getReport().getAssetReportId());

    // Retrieve the report as an Asset Report with Insights.
    AssetReportGetRequest assetReportGetRequest = new AssetReportGetRequest()
      .includeInsights(true)
      .assetReportToken(assetReportToken);

    response = client().assetReportGet(assetReportGetRequest).execute();

    respBody = response.body();
    assertSuccessResponse(response);

    assertNotNull(respBody.getReport());

    // An Asset Report with Insights should include a name (when available).
    assertTrue(containsTransactionWithName(respBody.getReport()));
  }

  private boolean containsTransactionWithName(AssetReport assetReport) {
    List<AccountAssets> accounts = assetReport.getItems().get(0).getAccounts();
    for (AccountAssets account : accounts) {
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
    PlaidApi client,
    String assetReportToken
  )
    throws Exception {
    int NUM_RETRIES = 20;
    int INTER_REQUEST_SLEEP = 2000; // millis
    int attempt = 0;
    Response<AssetReportGetResponse> response;
    JSONObject errorResponse = new JSONObject();
    Error error = new Error();

    do {
      AssetReportGetRequest assetReportGetRequest = new AssetReportGetRequest()
        .assetReportToken(assetReportToken);

      response = client.assetReportGet(assetReportGetRequest).execute();

      try {
        Gson gson = new Gson();
        error = gson.fromJson(response.errorBody().string(), Error.class);
      } catch (Exception e) {
        // Dont' want to throw here.
      }

      attempt++;
      Thread.sleep(INTER_REQUEST_SLEEP);
    } while (
      !response.isSuccessful() &&
      response.errorBody() != null &&
      error.getErrorType().equals(Error.ErrorTypeEnum.ASSET_REPORT_ERROR) &&
      attempt < NUM_RETRIES
    );
    if (!response.isSuccessful()) {
      throw new Exception(
        String.format(
          "Could not get asset report. Failed with %s",
          errorResponse.getJSONObject("error").getString("error_message")
        )
      );
    }
    return response;
  }
}
