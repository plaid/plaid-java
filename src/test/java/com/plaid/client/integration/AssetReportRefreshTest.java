package com.plaid.client.integration;

import com.plaid.client.PlaidClient;
import com.plaid.client.internal.gson.Optional;
import com.plaid.client.request.AssetReportCreateRequest;
import com.plaid.client.request.AssetReportFilterRequest;
import com.plaid.client.request.AssetReportRefreshRequest;
import com.plaid.client.request.common.Product;
import com.plaid.client.response.AssetReportCreateResponse;
import com.plaid.client.response.AssetReportGetResponse;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.Test;
import retrofit2.Response;

import static com.plaid.client.integration.AssetReportGetTest.waitTillReady;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

public class AssetReportRefreshTest extends AbstractItemIntegrationTest {

  @Override
  protected List<Product> setupItemProducts() {
    return Arrays.asList(Product.ASSETS);
  }

  @Override
  protected String setupItemInstitutionId() {
    return TARTAN_BANK_INSTITUTION_ID;
  }

  private Response<AssetReportCreateResponse> assetReportRefresh(
      AssetReportRefreshRequest assetReportRefreshRequest) throws Exception {
    PlaidClient client = client();
    Response<AssetReportCreateResponse> response =
        client
            .service()
            .assetReportRefresh(assetReportRefreshRequest)
            .execute();

    return response;
  }

  @Test
  public void testAssetReportRefreshSuccessNoOverrideOptions() throws Exception {
    // Create asset report to get an asset report token
    List<String> accessTokens = Arrays.asList(getItemPublicTokenExchangeResponse().getAccessToken());
    Response<AssetReportCreateResponse> createResponse =
        AssetReportCreateTest.createAssetReport(client(), accessTokens);
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

    AssetReportRefreshRequest assetReportRefreshRequest =
        new AssetReportRefreshRequest(assetReportToken);

    Response<AssetReportCreateResponse> assetReportCreateRefreshResponse =
        assetReportRefresh(assetReportRefreshRequest);

    Response<AssetReportGetResponse> assetReportRefreshGetResponse =
        waitTillReady(client(), assetReportCreateRefreshResponse.body().getAssetReportToken());

    assertEquals(response.body().getReport().getUser(), assetReportRefreshGetResponse.body().getReport().getUser());

    Set<AssetReportGetResponse.Item> originalItems = new HashSet<>(response.body().getReport().getItems());
    Set<AssetReportGetResponse.Item> refreshItems = new HashSet<>(assetReportRefreshGetResponse.body().getReport().getItems());

    assertEquals(originalItems, refreshItems);
  }

  @Test
  public void testAssetReportRefreshSuccessWithOverride() throws Exception {
    // Create asset report to get an asset report token
    List<String> accessTokens = Arrays.asList(getItemPublicTokenExchangeResponse().getAccessToken());
    Response<AssetReportCreateResponse> createResponse =
        AssetReportCreateTest.createAssetReport(client(), accessTokens);
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

    AssetReportCreateRequest.Options options = new AssetReportCreateRequest.Options();
    Optional<AssetReportCreateRequest.Options.UserOptions> user = Optional.empty();
    user = user.orElse(new AssetReportCreateRequest.Options.UserOptions());

    String newLastName = "newLastName";

    user.get().setLastName(newLastName);
    options.setUser(user);

    AssetReportRefreshRequest assetReportRefreshRequest = new AssetReportRefreshRequest(assetReportToken, options);

    Response<AssetReportCreateResponse> assetReportCreateRefreshResponse =
        assetReportRefresh(assetReportRefreshRequest);

    Response<AssetReportGetResponse> assetReportRefreshGetResponse =
        waitTillReady(client(), assetReportCreateRefreshResponse.body().getAssetReportToken());

    Set<AssetReportGetResponse.Item> originalItems = new HashSet<>(response.body().getReport().getItems());
    Set<AssetReportGetResponse.Item> refreshItems = new HashSet<>(assetReportRefreshGetResponse.body().getReport().getItems());

    assertEquals(originalItems, refreshItems);

    AssetReportGetResponse.User originalUser = response.body().getReport().getUser();
    AssetReportGetResponse.User refreshedUser = assetReportRefreshGetResponse.body().getReport().getUser();

    assertEquals(originalUser.getClientUserId(), refreshedUser.getClientUserId());
    assertEquals(originalUser.getEmail(), refreshedUser.getEmail());
    assertEquals(originalUser.getFirstName(), refreshedUser.getFirstName());
    assertEquals(originalUser.getMiddleName(), refreshedUser.getMiddleName());
    assertEquals(originalUser.getPhoneNumber(), refreshedUser.getPhoneNumber());
    assertEquals(originalUser.getSsn(), refreshedUser.getSsn());
    assertEquals(newLastName, refreshedUser.getLastName());
  }
}

