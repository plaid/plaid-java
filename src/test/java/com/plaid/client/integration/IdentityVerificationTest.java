package com.plaid.client.integration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import com.plaid.client.model.AccountIdentity;
import com.plaid.client.model.Address;
import com.plaid.client.model.Email;
import com.plaid.client.model.PlaidError;
import com.plaid.client.model.PlaidErrorType;
import com.plaid.client.model.IdentityVerificationGetRequest;
import com.plaid.client.model.IdentityVerificationCreateRequest;
import com.plaid.client.model.IdentityVerificationGetResponse;
import com.plaid.client.model.IdentityVerificationCreateResponse;
import com.plaid.client.model.IdentityVerificationCreateRequestUser;
import com.plaid.client.model.IdentityVerificationRequestUser;
import com.plaid.client.model.IdentityVerificationRetryRequest;
import com.plaid.client.model.IdentityVerificationRetryResponse;
import com.plaid.client.model.IdentityVerificationListRequest;
import com.plaid.client.model.IdentityVerificationListResponse;
import com.plaid.client.model.IdentityVerification;
import com.plaid.client.model.Strategy;
import java.time.Instant;
import java.util.Arrays;
import java.util.List;
import org.junit.Ignore;
import org.junit.Test;
import retrofit2.Response;
import java.time.OffsetDateTime;

public class IdentityVerificationTest extends AbstractIntegrationTest {
  private static final String TEMPLATE_ID = "flwtmp_aWogUuKsL6NEHU";

  @Ignore
  @Test
  public void testSuccess() throws Exception {
    String customerReference = "idv-user-" + Instant.now();
    String email = customerReference + "@example.com";

    // POST /identity_verification/create
    IdentityVerificationCreateRequestUser user = new IdentityVerificationCreateRequestUser();
    user.setEmailAddress(email);

    IdentityVerificationCreateRequest identityVerificationCreateRequest = new IdentityVerificationCreateRequest();
    identityVerificationCreateRequest.setClientUserId(customerReference);
    identityVerificationCreateRequest.setIsShareable(true);
    identityVerificationCreateRequest.setTemplateId(TEMPLATE_ID);
    identityVerificationCreateRequest.setGaveConsent(true);
    identityVerificationCreateRequest.setClientId(customerReference);
    identityVerificationCreateRequest.setUser(user);

    Response<IdentityVerificationCreateResponse> identityVerificationCreateResponse = client()
      .identityVerificationCreate(identityVerificationCreateRequest)
      .execute();
    assertSuccessResponse(identityVerificationCreateResponse);

    // TODO: this string replace can be removed once COG-3394 is addressed.
    String clientId = identityVerificationCreateResponse.body().getId().replaceAll("flwses", "idv");

    // POST /identity_verification/retry
    IdentityVerificationRequestUser retryUser = new IdentityVerificationRequestUser();
    retryUser.setEmailAddress(email);
    IdentityVerificationRetryRequest identityVerificationRetryRequest = new IdentityVerificationRetryRequest();
    identityVerificationRetryRequest.setTemplateId(TEMPLATE_ID);
    identityVerificationRetryRequest.setClientUserId(customerReference);
    identityVerificationRetryRequest.setStrategy(Strategy.RESET);
    identityVerificationRetryRequest.setUser(retryUser);

    Response<IdentityVerificationRetryResponse> identityVerificationRetryResponse = client()
            .identityVerificationRetry(identityVerificationRetryRequest)
            .execute();
    assertSuccessResponse(identityVerificationRetryResponse);

    // TODO: this string replace can be removed once COG-3394 is addressed.
    String previousAttemptId =
      identityVerificationRetryResponse.body().getPreviousAttemptId().replaceAll("flwses", "idv");
    assertEquals(clientId, previousAttemptId);

    // POST /identity_verification/get
    IdentityVerificationGetRequest identityVerificationGetRequest = new IdentityVerificationGetRequest();
    identityVerificationGetRequest.setIdentityVerificationId(clientId);

    Response<IdentityVerificationGetResponse> identityVerificationGetResponse = client()
      .identityVerificationGet(identityVerificationGetRequest)
      .execute();

    assertSuccessResponse(identityVerificationGetResponse);
    assertEquals(customerReference, identityVerificationGetResponse.body().getClientUserId());

    // POST /identity_verification/list
    IdentityVerificationListRequest identityVerificationListRequest = new IdentityVerificationListRequest();
    identityVerificationListRequest.setTemplateId(TEMPLATE_ID);
    identityVerificationListRequest.setClientUserId(customerReference);

    Response<IdentityVerificationListResponse> identityVerificationListResponse = client()
            .identityVerificationList(identityVerificationListRequest)
            .execute();
    assertSuccessResponse(identityVerificationListResponse);
    assertEquals(2, identityVerificationListResponse.body().getIdentityVerifications().size());
    assertEquals(customerReference, identityVerificationListResponse.body().getIdentityVerifications().get(0).getClientUserId());
  }

  // This tests for a bug fixed in https://github.plaid.com/plaid/go/pull/52937
  @Test
  public void testStructIssue() throws Exception {
    String customerReference = "idv-user-" + Instant.now();

    // POST /identity_verification/create
    IdentityVerificationCreateRequestUser user = new IdentityVerificationCreateRequestUser();
    user.setEmailAddress(customerReference + "2@example.com");

    IdentityVerificationCreateRequest identityVerificationCreateRequest = new IdentityVerificationCreateRequest();
    identityVerificationCreateRequest.setClientUserId(customerReference);
    identityVerificationCreateRequest.setIsShareable(true);
    identityVerificationCreateRequest.setTemplateId(TEMPLATE_ID);
    identityVerificationCreateRequest.setGaveConsent(true);
    identityVerificationCreateRequest.setClientId(customerReference);
    identityVerificationCreateRequest.setUser(user);

    Response<IdentityVerificationCreateResponse> identityVerificationCreateResponse = client()
      .identityVerificationCreate(identityVerificationCreateRequest)
      .execute();
    assertSuccessResponse(identityVerificationCreateResponse);

    // TODO: this string replace can be removed once COG-3394 is addressed.
    String clientId = identityVerificationCreateResponse.body().getId().replaceAll("flwses", "idv");

    IdentityVerificationGetRequest identityVerificationGetRequest;
    for (int i = 0; i < 20; i++) {
      identityVerificationGetRequest = new IdentityVerificationGetRequest();
      identityVerificationGetRequest.setIdentityVerificationId(clientId);

      Response<IdentityVerificationGetResponse> identityVerificationGetResponse = client()
        .identityVerificationGet(identityVerificationGetRequest)
        .execute();
      assertSuccessResponse(identityVerificationGetResponse);
    }

    identityVerificationGetRequest = new IdentityVerificationGetRequest();
    Response<IdentityVerificationGetResponse> identityVerificationGetResponse = client()
      .identityVerificationGet(identityVerificationGetRequest)
      .execute();
    assertErrorResponse(identityVerificationGetResponse, PlaidErrorType.INVALID_REQUEST, "INVALID_FIELD");
  }
}
