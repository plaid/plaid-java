package com.plaid.client.integration;

import static com.plaid.client.integration.AssetReportGetTest.waitTillReady;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import com.plaid.client.model.AssetReportCreateRequest;
import com.plaid.client.model.AssetReportCreateResponse;
import com.plaid.client.model.AssetReportFilterRequest;
import com.plaid.client.model.AssetReportGetResponse;
import com.plaid.client.model.AssetReportItem;
import com.plaid.client.model.AssetReportItem;
import com.plaid.client.model.AssetReportRefreshRequest;
import com.plaid.client.model.AssetReportRefreshRequestOptions;
import com.plaid.client.model.AssetReportRefreshResponse;
import com.plaid.client.model.AssetReportUser;
import com.plaid.client.model.Products;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.Test;
import retrofit2.Response;

public class AssetReportRefreshTest extends AbstractItemIntegrationTest {

  @Override
  protected List<Products> setupItemProducts() {
    return Arrays.asList(Products.ASSETS);
  }

  @Override
  protected String setupItemInstitutionId() {
    return TARTAN_BANK_INSTITUTION_ID;
  }

  private Response<AssetReportRefreshResponse> assetReportRefresh(
    AssetReportRefreshRequest assetReportRefreshRequest
  )
    throws Exception {
    Response<AssetReportRefreshResponse> response = client()
      .assetReportRefresh(assetReportRefreshRequest)
      .execute();

    return response;
  }

  @Test
  public void testAssetReportRefreshSuccessNoOverrideOptions()
    throws Exception {
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

    AssetReportRefreshRequest assetReportRefreshRequest = new AssetReportRefreshRequest()
      .assetReportToken(assetReportToken);

    Response<AssetReportRefreshResponse> assetReportRefreshResponse = assetReportRefresh(
      assetReportRefreshRequest
    );

    Response<AssetReportGetResponse> assetReportGetResponse = waitTillReady(
      client(),
      assetReportRefreshResponse.body().getAssetReportToken()
    );

    assertEquals(
      response.body().getReport().getUser(),
      assetReportGetResponse.body().getReport().getUser()
    );

    Set<AssetReportItem> originalItems = new HashSet<>(
      response.body().getReport().getItems()
    );
    Set<AssetReportItem> refreshItems = new HashSet<>(
      assetReportGetResponse.body().getReport().getItems()
    );

    assertEquals(originalItems.size(), refreshItems.size());
  }

  @Test
  public void testAssetReportRefreshSuccessWithOverride() throws Exception {
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

    AssetReportUser assetReportUser = new AssetReportUser()
    .lastName("newLastName");
    AssetReportRefreshRequestOptions options = new AssetReportRefreshRequestOptions()
    .user(assetReportUser);

    AssetReportRefreshRequest assetReportRefreshRequest = new AssetReportRefreshRequest()
      .options(options)
      .assetReportToken(assetReportToken);

    Response<AssetReportRefreshResponse> assetReportCreateRefreshResponse = assetReportRefresh(
      assetReportRefreshRequest
    );

    Response<AssetReportGetResponse> assetReportRefreshGetResponse = waitTillReady(
      client(),
      assetReportCreateRefreshResponse.body().getAssetReportToken()
    );

    Set<AssetReportItem> originalItems = new HashSet<>(
      response.body().getReport().getItems()
    );
    Set<AssetReportItem> refreshItems = new HashSet<>(
      assetReportRefreshGetResponse.body().getReport().getItems()
    );

    assertEquals(originalItems.size(), refreshItems.size());

    AssetReportUser originalUser = response.body().getReport().getUser();
    AssetReportUser refreshedUser = assetReportRefreshGetResponse
      .body()
      .getReport()
      .getUser();

    assertEquals(
      originalUser.getClientUserId(),
      refreshedUser.getClientUserId()
    );
    assertEquals(originalUser.getEmail(), refreshedUser.getEmail());
    assertEquals(originalUser.getFirstName(), refreshedUser.getFirstName());
    assertEquals(originalUser.getMiddleName(), refreshedUser.getMiddleName());
    assertEquals(originalUser.getPhoneNumber(), refreshedUser.getPhoneNumber());
    assertEquals(originalUser.getSsn(), refreshedUser.getSsn());
    assertEquals("newLastName", refreshedUser.getLastName());
  }
}
