package com.plaid.client.integration;

import static org.junit.Assert.*;

import com.google.gson.Gson;
import com.plaid.client.ApiClient;
import com.plaid.client.model.Error;
import com.plaid.client.model.Item;
import com.plaid.client.request.PlaidApi;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.util.HashMap;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.ResponseBody;
import org.junit.Before;
import retrofit2.Converter;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * Abstract base class for integration tests which gets configuration from the
 * environment.
 *
 * PLAID_CLIENT_ID, PLAID_SECRET, and PLAID_BASE_URL must be
 * defined or errors will be thrown.
 */
public abstract class AbstractIntegrationTest {

  /**
   * Sandbox-specific institution IDs used for testing. See sandbox documentation
   * for more information.
   */
  public static final String FIRST_PLATYPUS_BANK_INSTITUTION_ID = "ins_109508";
  public static final String FIRST_GINGHAM_CREDIT_UNION_INSTITION_ID =
    "ins_109509";
  public static final String TATTERSALL_FEDERAL_CREDIT_UNION_INSTITUTION_ID =
    "ins_109510";
  public static final String TARTAN_BANK_INSTITUTION_ID = "ins_109511";
  public static final String HOUNDSTOOTH_BANK_INSTITUTION_ID = "ins_109512";

  private PlaidApi plaidClient;
  private ApiClient apiClient;

  @Before
  public void setUpClient() throws Exception {
    String plaidClientId = System.getenv("PLAID_CLIENT_ID");
    String plaidSecret = System.getenv("PLAID_SECRET");

    assertNotNull(
      "PLAID_CLIENT_ID environment variable is required",
      plaidClientId
    );
    assertNotNull("PLAID_SECRET environment variable is required", plaidSecret);

    HashMap<String, String> apiKeys = new HashMap<String, String>();
    apiKeys.put("clientId", plaidClientId);
    apiKeys.put("secret", plaidSecret);
    apiKeys.put("plaidVersion", "2020-09-14");
    apiClient = new ApiClient(apiKeys);
    apiClient.setPlaidAdapter(ApiClient.Sandbox);

    plaidClient = apiClient.createService(PlaidApi.class);
  }

  protected PlaidApi client() {
    return plaidClient;
  }

  protected ApiClient apiClient() {
    return apiClient;
  }

  protected static void assertSuccessResponse(Response response) {
    assertTrue(response.isSuccessful());
  }

  void assertErrorResponse(
    Response response,
    Error.ErrorTypeEnum expectedErrorType,
    String expectedErrorCode
  )
    throws Exception {
    assertFalse(response.isSuccessful());
    assertNotNull(response.errorBody());

    try {
      Gson gson = new Gson();
      Error error = gson.fromJson(response.errorBody().string(), Error.class);
      assertNotNull(error);
      assertNotNull(error.getRequestId());
      assertEquals(expectedErrorType, error.getErrorType());
      assertEquals(expectedErrorCode, error.getErrorCode());
    } catch (Exception e) {
      throw new Exception(
        String.format(
          "Failed converting from API Response Error Body to Error %f",
          response.errorBody().string()
        )
      );
    }
  }

  protected static void assertItemEquals(Item expectedItem, Item actualItem) {
    assertEquals(expectedItem.getError(), actualItem.getError());
    assertEquals(
      expectedItem.getAvailableProducts(),
      actualItem.getAvailableProducts()
    );
    assertEquals(
      expectedItem.getBilledProducts(),
      actualItem.getBilledProducts()
    );
    assertEquals(
      expectedItem.getInstitutionId(),
      actualItem.getInstitutionId()
    );
    assertEquals(expectedItem.getItemId(), actualItem.getItemId());
    assertEquals(expectedItem.getWebhook(), actualItem.getWebhook());
    assertEquals(
      expectedItem.getConsentExpirationTime(),
      actualItem.getConsentExpirationTime()
    );
  }
}
