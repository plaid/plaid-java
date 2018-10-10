package com.plaid.client.integration;

import com.plaid.client.PlaidClient;
import com.plaid.client.request.AssetReportCreateRequest;
import com.plaid.client.request.AssetReportFilterRequest;
import com.plaid.client.request.common.Product;
import com.plaid.client.response.AssetReportCreateResponse;
import com.plaid.client.response.AssetReportGetResponse;
import org.junit.Test;
import retrofit2.Response;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.plaid.client.integration.AssetReportCreateTest.createAssetReport;
import static com.plaid.client.integration.AssetReportGetTest.waitTillReady;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

public class AssetReportFilterTest extends AbstractItemIntegrationTest {

  @Override
  protected List<Product> setupItemProducts() {
    return Arrays.asList(Product.ASSETS);
  }

  private Response<AssetReportCreateResponse> filterAssetReport(
      AssetReportFilterRequest assetReportFilterRequest) throws Exception {
    PlaidClient client = client();
    Response<AssetReportCreateResponse> response =
        client
            .service()
            .assetReportFilter(assetReportFilterRequest)
            .execute();

    return response;
  }

  @Override
  protected String setupItemInstitutionId() {
    return TARTAN_BANK_INSTITUTION_ID;
  }

  @Test
  public void testAssetReportFilterSuccess() throws Exception {
    // Create asset report to get an asset report token
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

    List<String> accountIdsToExclude = new ArrayList<>();
    accountIdsToExclude.add(respBody.getReport().getItems().get(0).getAccounts().get(0).getAccountId());

    // create a filtered report
    AssetReportFilterRequest assetReportFilterRequest = new AssetReportFilterRequest(assetReportToken, accountIdsToExclude);

    Response<AssetReportCreateResponse> assetReportFilterResponse = filterAssetReport(assetReportFilterRequest);

    String assetReportFilterToken = assetReportFilterResponse.body().getAssetReportToken();

    // wait till the filtered asset reponse is ready
    Response<AssetReportGetResponse> filteredReportResponse = waitTillReady(client(), assetReportFilterToken);

    assertEquals(getAssetReportAccountIds(respBody.getReport()).size() - 1,
        getAssetReportAccountIds(filteredReportResponse.body().getReport()).size());
  }

  private List<String> getAssetReportAccountIds(AssetReportGetResponse.AssetReport assetReport) {
    List<String> assetReportAccounts = new ArrayList<>();

    for (AssetReportGetResponse.Item item : assetReport.getItems()) {
      for (AssetReportGetResponse.Account account : item.getAccounts()) {
        assetReportAccounts.add(account.getAccountId());
      }
    }
    return assetReportAccounts;
  }
}

