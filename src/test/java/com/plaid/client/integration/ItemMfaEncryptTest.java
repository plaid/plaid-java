package com.plaid.client.integration;

import com.plaid.client.request.ItemMfaEncryptRequest;
import com.plaid.client.response.ErrorResponse;
import com.plaid.client.response.ItemMfaEncryptResponse;
import org.junit.Test;
import retrofit2.Response;

import java.util.Arrays;
import java.util.Date;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class ItemMfaEncryptTest extends AbstractIntegrationTest {
  @Test
  public void testListConstructorSuccess() throws Exception {
    Response<ItemMfaEncryptResponse> response =
      client().service().itemMfaEncrypt(new ItemMfaEncryptRequest(Arrays.asList("foo", "bar"))).execute();

    assertSuccessResponse(response);
    assertNotNull(response.body().getResponsesToken());
    assertTrue(response.body().getExpiration().after(new Date()));
  }

  @Test
  public void testVarArgsConstructorSuccess() throws Exception {
    Response<ItemMfaEncryptResponse> response =
      client().service().itemMfaEncrypt(new ItemMfaEncryptRequest("ice cream", "1234")).execute();

    assertSuccessResponse(response);
    assertNotNull(response.body().getResponsesToken());
    assertTrue(response.body().getExpiration().after(new Date()));
  }
}
