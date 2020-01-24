package com.plaid.client.integration;

import com.plaid.client.request.ItemImportRequest;
import com.plaid.client.response.ItemImportResponse;
import org.junit.Test;
import retrofit2.Response;

import java.util.Arrays;
import java.util.HashMap;

import static org.junit.Assert.*;

public class ItemImportTest extends AbstractIntegrationTest {

  @Test
  public void testSuccess() throws Exception {
    HashMap<String, String> userAuth = new HashMap<>();
    userAuth.put("user_id", "user_good");
    userAuth.put("auth_token", "pass_good");

    Response<ItemImportResponse> response = client().service()
        .itemImport(new ItemImportRequest(Arrays.asList("identity", "auth"), userAuth)
            .withWebhook("https://some.webhook.example.com"))
        .execute();
    assertSuccessResponse(response);
    assertNotNull(response.body().getAccessToken());
  }
}
