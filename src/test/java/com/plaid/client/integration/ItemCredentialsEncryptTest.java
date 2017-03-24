package com.plaid.client.integration;

import com.plaid.client.request.ItemCredentialsEncryptRequest;
import com.plaid.client.response.ItemCredentialsEncryptResponse;
import org.junit.Test;
import retrofit2.Response;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class ItemCredentialsEncryptTest extends AbstractIntegrationTest {
  @Test
  public void testSuccess() throws Exception {
    Response<ItemCredentialsEncryptResponse> response =
      client().service().itemCredentialsEncrypt(new ItemCredentialsEncryptRequest("username", "user_good", "password", "pass_good")).execute();

    assertSuccessResponse(response);
    assertNotNull(response.body().getCredentialsToken());
    assertTrue(response.body().getExpiration().after(new Date()));

    // use both constructors
    Map<String, String> creds = new HashMap<>();
    creds.put("username", "user_good");
    creds.put("password", "pass_good");
    response =
      client().service().itemCredentialsEncrypt(new ItemCredentialsEncryptRequest(creds)).execute();

    assertSuccessResponse(response);
    assertNotNull(response.body().getCredentialsToken());
    assertTrue(response.body().getExpiration().after(new Date()));
  }
}
