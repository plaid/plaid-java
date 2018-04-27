package com.plaid.client.integration;

import com.plaid.client.request.ItemCreateRequest;
import com.plaid.client.request.ItemCredentialsEncryptRequest;
import com.plaid.client.request.common.MfaType;
import com.plaid.client.request.common.Product;
import com.plaid.client.response.ItemCreateResponse;
import com.plaid.client.response.ItemCredentialsEncryptResponse;
import com.plaid.client.response.MfaSelection;
import org.junit.Test;
import retrofit2.Response;

import java.util.*;

import static org.junit.Assert.*;

public class ItemCreateTest extends AbstractIntegrationTest {

  @Test
  public void testItemCreateFullyLoadedRequestSuccess() throws Exception {
    Calendar startDate = Calendar.getInstance();
    startDate.add(Calendar.DATE, -2);

    Calendar endDate = Calendar.getInstance();
    startDate.add(Calendar.DATE, -1);

    String webhookUrl = "https://some.webook.example.com";
    ItemCreateRequest request = new ItemCreateRequest(
      TARTAN_BANK_INSTITUTION_ID,
      Collections.singletonList(Product.TRANSACTIONS))
      .withCredentials("username", "user_good")
      .withCredentials("password", "pass_good")
      .withOptionWebhook(webhookUrl)
      .withOptionAwaitResults(false)
      .withOptionStartDate(startDate.getTime())
      .withOptionEndDate(endDate.getTime());

    Response<ItemCreateResponse> response = client().service().itemCreate(request).execute();

    assertSuccessResponse(response);
    assertNotNull(response.body().getAccessToken());

    assertTrue(response.body().isItemResponse());
    assertFalse(response.body().isMfaResponse());

    assertEquals(Arrays.asList(Product.ASSETS, Product.AUTH, Product.BALANCE, Product.CREDIT_DETAILS, Product.IDENTITY, Product.INCOME),
      response.body().getItem().getAvailableProducts());
    assertEquals(1, response.body().getItem().getBilledProducts().size());
    assertEquals(Arrays.asList(Product.TRANSACTIONS), response.body().getItem().getBilledProducts());
    assertNull(response.body().getItem().getError());
    assertEquals(TARTAN_BANK_INSTITUTION_ID, response.body().getItem().getInstitutionId());
    assertNotNull(response.body().getItem().getItemId());
    assertEquals(webhookUrl, response.body().getItem().getWebhook());
  }

  @Test
  public void testItemCreateDevicesMfa() throws Exception {
    ItemCreateRequest request = new ItemCreateRequest(
      TARTAN_BANK_INSTITUTION_ID,
      Collections.singletonList(Product.AUTH))
      .withCredentials("username", "user_good")
      .withCredentials("password", "mfa_device");

    Response<ItemCreateResponse> response = client().service().itemCreate(request).execute();

    assertSuccessResponse(response);
    assertNotNull(response.body().getAccessToken());

    assertTrue(response.body().isMfaResponse());
    assertFalse(response.body().isItemResponse());

    assertEquals(MfaType.DEVICE_LIST, response.body().getMfaType());
    assertNull(response.body().getDevice());
    assertNull(response.body().getQuestions());
    assertNull(response.body().getSelections());
    for (ItemCreateResponse.MfaDevice m : response.body().getDeviceList()) {
      assertNotNull(m.getDeviceId());
      assertNotNull(m.getMask());
      assertNotNull(m.getType());
    }
  }

  @Test
  public void testItemCreateQuestionsMfa() throws Exception {
    ItemCreateRequest request = new ItemCreateRequest(
      TARTAN_BANK_INSTITUTION_ID,
      Collections.singletonList(Product.AUTH))
      .withCredentials("username", "user_good")
      .withCredentials("password", "mfa_questions_1_3");

    Response<ItemCreateResponse> response = client().service().itemCreate(request).execute();

    assertSuccessResponse(response);
    assertNotNull(response.body().getAccessToken());

    assertTrue(response.body().isMfaResponse());
    assertFalse(response.body().isItemResponse());

    assertEquals(MfaType.QUESTIONS, response.body().getMfaType());
    assertNull(response.body().getDevice());
    assertNull(response.body().getDeviceList());
    assertNull(response.body().getSelections());
    assertEquals(Arrays.asList("What is the answer to question_0_0?",
      "What is the answer to question_0_1?",
      "What is the answer to question_0_2?"),
      response.body().getQuestions());
  }

  @Test
  public void testItemCreateSelectionsMfa() throws Exception {
    Map<String, String> credentials = new HashMap<>();
    credentials.put("username", "user_good");
    credentials.put("password", "mfa_selections");
    ItemCreateRequest request = new ItemCreateRequest(
      TARTAN_BANK_INSTITUTION_ID,
      Collections.singletonList(Product.AUTH))
      .withCredentials(credentials);

    Response<ItemCreateResponse> response = client().service().itemCreate(request).execute();

    assertSuccessResponse(response);
    assertNotNull(response.body().getAccessToken());

    assertTrue(response.body().isMfaResponse());
    assertFalse(response.body().isItemResponse());

    assertEquals(MfaType.SELECTIONS, response.body().getMfaType());
    assertNull(response.body().getDevice());
    assertNull(response.body().getDeviceList());
    assertNull(response.body().getQuestions());
    assertFalse(response.body().getSelections().isEmpty());
    for (MfaSelection m : response.body().getSelections()) {
      assertNotNull(m.getQuestion());
      assertNotNull(m.getAnswers());
      assertFalse(m.getAnswers().isEmpty());
    }
  }

  @Test
  public void testItemCreateWithCredentialsToken() throws Exception {
    // first encrypt credentials
    Response<ItemCredentialsEncryptResponse> itemCredentialsEncryptResponse =
      client().service().itemCredentialsEncrypt(new ItemCredentialsEncryptRequest("username", "user_good", "password", "pass_good")).execute();
    assertSuccessResponse(itemCredentialsEncryptResponse);

    ItemCreateRequest request = new ItemCreateRequest(
      TARTAN_BANK_INSTITUTION_ID,
      Collections.singletonList(Product.TRANSACTIONS))
      .withOptionAwaitResults(false)
      .withOptionCredentialsToken(itemCredentialsEncryptResponse.body().getCredentialsToken());

    Response<ItemCreateResponse> response = client().service().itemCreate(request).execute();

    assertSuccessResponse(response);
    assertNotNull(response.body().getAccessToken());

    assertTrue(response.body().isItemResponse());
    assertFalse(response.body().isMfaResponse());

    assertEquals(6, response.body().getItem().getAvailableProducts().size());
    assertEquals(Arrays.asList(Product.ASSETS, Product.AUTH, Product.BALANCE, Product.CREDIT_DETAILS, Product.IDENTITY, Product.INCOME),
      response.body().getItem().getAvailableProducts());
    assertEquals(1, response.body().getItem().getBilledProducts().size());
    assertEquals(Arrays.asList(Product.TRANSACTIONS), response.body().getItem().getBilledProducts());
    assertNull(response.body().getItem().getError());
    assertEquals(TARTAN_BANK_INSTITUTION_ID, response.body().getItem().getInstitutionId());
    assertNotNull(response.body().getItem().getItemId());
  }
}
