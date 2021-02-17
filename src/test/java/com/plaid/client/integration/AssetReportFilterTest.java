package com.plaid.client.integration;

import static com.plaid.client.integration.AssetReportCreateTest.createAssetReport;
import static com.plaid.client.integration.AssetReportGetTest.waitTillReady;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import com.plaid.client.model.AccountAssets;
import com.plaid.client.model.AssetReport;
import com.plaid.client.model.AssetReportCreateRequest;
import com.plaid.client.model.AssetReportCreateResponse;
import com.plaid.client.model.AssetReportFilterRequest;
import com.plaid.client.model.AssetReportFilterResponse;
import com.plaid.client.model.AssetReportGetResponse;
import com.plaid.client.model.AssetReportItem;
import com.plaid.client.model.Products;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.Test;
import retrofit2.Response;

public class AssetReportFilterTest extends AbstractItemIntegrationTest {

  @Override
  protected List<Products> setupItemProducts() {
    return Arrays.asList(Products.ASSETS);
  }

  private Response<AssetReportFilterResponse> filterAssetReport(
    AssetReportFilterRequest assetReportFilterRequest
  )
    throws Exception {
    Response<AssetReportFilterResponse> response = client()
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

    // To test filtering, we exclude an account id
    List<String> accountIdsToExclude = new ArrayList<>();
    accountIdsToExclude.add(
      respBody.getReport().getItems().get(0).getAccounts().get(0).getAccountId()
    );

    // create a filtered report
    AssetReportFilterRequest assetReportFilterRequest = new AssetReportFilterRequest()
      .assetReportToken(assetReportToken)
      .accountIdsToExclude(accountIdsToExclude);

    Response<AssetReportFilterResponse> assetReportFilterResponse = filterAssetReport(
      assetReportFilterRequest
    );

    String assetReportFilterToken = assetReportFilterResponse
      .body()
      .getAssetReportToken();

    // wait till the filtered asset reponse is ready
    Response<AssetReportGetResponse> filteredReportResponse = waitTillReady(
      client(),
      assetReportFilterToken
    );

    Set<String> filteredAssetReportIds = getAssetReportAccountIds(
      filteredReportResponse.body().getReport()
    );
    Set<String> unfilteredAssetReportIds = getAssetReportAccountIds(
      respBody.getReport()
    );

    assertEquals(
      unfilteredAssetReportIds.size() - 1,
      filteredAssetReportIds.size()
    );

    // add back the account id we excluded and ensure the sets are equal
    filteredAssetReportIds.add(accountIdsToExclude.get(0));
    assertEquals(unfilteredAssetReportIds, filteredAssetReportIds);
  }

  private Set<String> getAssetReportAccountIds(AssetReport assetReport) {
    Set<String> assetReportAccounts = new HashSet<>();

    for (AssetReportItem item : assetReport.getItems()) {
      for (AccountAssets account : item.getAccounts()) {
        assetReportAccounts.add(account.getAccountId());
      }
    }
    return assetReportAccounts;
  }
}
