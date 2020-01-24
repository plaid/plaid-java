package com.plaid.client.integration;

import com.plaid.client.PlaidClient;
import com.plaid.client.integration.util.PlaidSandboxApiService;
import com.plaid.client.response.BaseResponse;
import com.plaid.client.response.ErrorResponse;
import com.plaid.client.response.ItemStatus;
import okhttp3.logging.HttpLoggingInterceptor;
import org.junit.Before;
import retrofit2.Response;

import static org.junit.Assert.*;

/**
 * Abstract base class for integration tests which gets configuration from the
 * environment.
 *
 * PLAID_PUBLIC_KEY, PLAID_CLIENT_ID, PLAID_SECRET, and PLAID_BASE_URL must be
 * defined or errors will be thrown.
 */
public abstract class AbstractIntegrationTest {

  /**
   * Sandbox-specific institution IDs used for testing. See sandbox documentation
   * for more information.
   */
  public static final String FIRST_PLATYPUS_BANK_INSTITUTION_ID = "ins_109508";
  public static final String FIRST_GINGHAM_CREDIT_UNION_INSTITION_ID = "ins_109509";
  public static final String TATTERSALL_FEDERAL_CREDIT_UNION_INSTITUTION_ID = "ins_109510";
  public static final String TARTAN_BANK_INSTITUTION_ID = "ins_109511";
  public static final String HOUNDSTOOTH_BANK_INSTITUTION_ID = "ins_109512";

  private PlaidClient plaidClient;
  private PlaidSandboxApiService sandboxApiService;

  @Before
  public void setUpClient() throws Exception {
    String plaidPublicKey = System.getenv("PLAID_PUBLIC_KEY");
    String plaidClientId = System.getenv("PLAID_CLIENT_ID");
    String plaidSecret = System.getenv("PLAID_SECRET");

    assertNotNull("PLAID_PUBLIC_KEY environment variable is required", plaidPublicKey);
    assertNotNull("PLAID_CLIENT_ID environment variable is required", plaidClientId);
    assertNotNull("PLAID_SECRET environment variable is required", plaidSecret);

    plaidClient = PlaidClient.newBuilder().publicKey(plaidPublicKey).clientIdAndSecret(plaidClientId, plaidSecret)
        .sandboxBaseUrl().logLevel(HttpLoggingInterceptor.Level.BODY).build();

    sandboxApiService = client().getRetrofit().create(PlaidSandboxApiService.class);

  }

  protected PlaidClient client() {
    return plaidClient;
  }

  protected static void assertSuccessResponse(Response<? extends BaseResponse> response) {
    assertTrue(response.isSuccessful());
    assertNotNull(response.body().getRequestId());
  }

  void assertErrorResponse(Response<? extends BaseResponse> response, ErrorResponse.ErrorType expectedErrorType,
      String expectedErrorCode) {
    assertFalse(response.isSuccessful());
    assertNotNull(response.errorBody());

    ErrorResponse errorResponse = client().parseError(response);
    assertNotNull(errorResponse);
    assertNotNull(errorResponse.getRequestId());
    assertEquals(expectedErrorType, errorResponse.getErrorType());
    assertEquals(expectedErrorCode, errorResponse.getErrorCode());
  }

  protected static void assertItemEquals(ItemStatus expectedItem, ItemStatus actualItem) {
    assertEquals(expectedItem.getError(), actualItem.getError());
    assertEquals(expectedItem.getAvailableProducts(), actualItem.getAvailableProducts());
    assertEquals(expectedItem.getBilledProducts(), actualItem.getBilledProducts());
    assertEquals(expectedItem.getInstitutionId(), actualItem.getInstitutionId());
    assertEquals(expectedItem.getItemId(), actualItem.getItemId());
    assertEquals(expectedItem.getWebhook(), actualItem.getWebhook());
    assertEquals(expectedItem.getConsentExpirationTime(), actualItem.getConsentExpirationTime());
  }

  protected PlaidSandboxApiService sandboxApiService() {
    return sandboxApiService;
  }
}
