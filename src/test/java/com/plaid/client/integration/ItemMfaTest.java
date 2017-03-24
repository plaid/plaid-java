package com.plaid.client.integration;

import com.plaid.client.request.*;
import com.plaid.client.request.common.MfaType;
import com.plaid.client.request.common.Product;
import com.plaid.client.response.ErrorResponse;
import com.plaid.client.response.ItemCreateResponse;
import com.plaid.client.response.ItemMfaEncryptResponse;
import com.plaid.client.response.ItemMfaResponse;
import org.junit.Test;
import retrofit2.Response;

import java.util.Arrays;
import java.util.Collections;
import java.util.Date;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.junit.Assert.*;

public class ItemMfaTest extends AbstractIntegrationTest {

  @Test
  public void testMultipleRoundQuestionsSuccess() throws Exception {
    // first create an item which will need mfa
    Response<ItemCreateResponse> itemCreateResponse =
      client().service()
        .itemCreate(new ItemCreateRequest(
          TARTAN_BANK_INSTITUTION_ID,
          Collections.singletonList(Product.TRANSACTIONS))
          .withCredentials("username", "user_good")
          .withCredentials("password", "mfa_questions_3_1")).execute();
    assertSuccessResponse(itemCreateResponse);
    assertFalse(itemCreateResponse.body().isItemResponse());
    assertTrue(itemCreateResponse.body().isMfaResponse());
    assertEquals(MfaType.QUESTIONS, itemCreateResponse.body().getMfaType());
    assertEquals(Collections.singletonList("What is the answer to question_0_0?"), itemCreateResponse.body().getQuestions());
    String accessToken = itemCreateResponse.body().getAccessToken();

    // go through the rounds of answers
    Response<ItemMfaResponse> response =
      client().service().itemMfa(new ItemMfaRequest(accessToken, MfaType.QUESTIONS).withResponses("answer_0_0")).execute();
    assertSuccessResponse(response);
    assertTrue(response.body().isMfaResponse());
    assertFalse(response.body().isItemResponse());
    assertEquals(MfaType.QUESTIONS, response.body().getMfaType());
    assertEquals(Collections.singletonList("What is the answer to question_1_0?"), response.body().getQuestions());

    response =
      client().service().itemMfa(new ItemMfaRequest(accessToken, MfaType.QUESTIONS).withResponses("answer_1_0")).execute();
    assertSuccessResponse(response);
    assertTrue(response.body().isMfaResponse());
    assertFalse(response.body().isItemResponse());
    assertEquals(MfaType.QUESTIONS, response.body().getMfaType());
    assertEquals(Collections.singletonList("What is the answer to question_2_0?"), response.body().getQuestions());

    response =
      client().service().itemMfa(new ItemMfaRequest(accessToken, MfaType.QUESTIONS).withResponses("answer_2_0")).execute();
    assertItemResponse(itemCreateResponse, response);
  }


  @Test
  public void testDeviceSuccess() throws Exception {
    // first create an item which will need mfa
    Response<ItemCreateResponse> itemCreateResponse =
      client().service()
        .itemCreate(new ItemCreateRequest(
          TARTAN_BANK_INSTITUTION_ID,
          Collections.singletonList(Product.TRANSACTIONS))
          .withCredentials("username", "user_good")
          .withCredentials("password", "mfa_device")).execute();
    assertSuccessResponse(itemCreateResponse);
    assertTrue(itemCreateResponse.body().isMfaResponse());
    assertFalse(itemCreateResponse.body().isItemResponse());
    assertEquals(MfaType.DEVICE_LIST, itemCreateResponse.body().getMfaType());
    String accessToken = itemCreateResponse.body().getAccessToken();

    String device = itemCreateResponse.body().getDeviceList().get(0).getDeviceId();

    Response<ItemMfaResponse> mfaDeviceResponse =
    	      client().service().itemMfa(new ItemMfaRequest(accessToken, MfaType.DEVICE_LIST).withResponses(device)).execute();

    Response<ItemMfaResponse> response =
      client().service().itemMfa(new ItemMfaRequest(accessToken, MfaType.DEVICE).withResponses("1234")).execute();
    assertItemResponse(itemCreateResponse, response);
  }

  @Test
  public void testSelectionsSuccessAndListResponses() throws Exception {
    // first create an item which will need mfa
    Response<ItemCreateResponse> itemCreateResponse =
      client().service()
        .itemCreate(new ItemCreateRequest(
          TARTAN_BANK_INSTITUTION_ID,
          Collections.singletonList(Product.TRANSACTIONS))
          .withCredentials("username", "user_good")
          .withCredentials("password", "mfa_selections")).execute();
    assertSuccessResponse(itemCreateResponse);
    assertTrue(itemCreateResponse.body().isMfaResponse());
    assertFalse(itemCreateResponse.body().isItemResponse());
    assertEquals(MfaType.SELECTIONS, itemCreateResponse.body().getMfaType());
    String accessToken = itemCreateResponse.body().getAccessToken();

    Response<ItemMfaResponse> response =
      client().service().itemMfa(new ItemMfaRequest(accessToken, MfaType.SELECTIONS).withResponses(Arrays.asList("tomato", "ketchup"))).execute();
    assertItemResponse(itemCreateResponse, response);
  }

  @Test
  public void testEncryptedMfaSuccess() throws Exception {
    // first create an item which will need mfa
    Response<ItemCreateResponse> itemCreateResponse =
      client().service()
        .itemCreate(new ItemCreateRequest(
          TARTAN_BANK_INSTITUTION_ID,
          Collections.singletonList(Product.TRANSACTIONS))
          .withCredentials("username", "user_good")
          .withCredentials("password", "mfa_device")).execute();
    assertSuccessResponse(itemCreateResponse);
    assertTrue(itemCreateResponse.body().isMfaResponse());
    assertFalse(itemCreateResponse.body().isItemResponse());
    assertEquals(MfaType.DEVICE_LIST, itemCreateResponse.body().getMfaType());
    String accessToken = itemCreateResponse.body().getAccessToken();

    String deviceId = itemCreateResponse.body().getDeviceList().get(0).getDeviceId();

    Response<ItemMfaResponse> mfaDeviceResponse =
    		client().service().itemMfa(new ItemMfaRequest(accessToken, MfaType.DEVICE_LIST).withResponses(deviceId)).execute();

    Response<ItemMfaEncryptResponse> itemMfaEncryptResponse =
      client().service().itemMfaEncrypt(new ItemMfaEncryptRequest("1234")).execute();
    assertSuccessResponse(itemMfaEncryptResponse);
    assertNotNull(itemMfaEncryptResponse.body().getResponsesToken());
    assertTrue(itemMfaEncryptResponse.body().getExpiration().after(new Date()));

    Response<ItemMfaResponse> response =
      client().service().itemMfa(
        new ItemMfaRequest(accessToken, MfaType.DEVICE)
          .withResponsesToken(itemMfaEncryptResponse.body().getResponsesToken()))
        .execute();
    assertItemResponse(itemCreateResponse, response);
  }

  @Test
  public void testIncorrectMfa() throws Exception {
    // first create an item which will need mfa
    Response<ItemCreateResponse> itemCreateResponse =
      client().service()
        .itemCreate(new ItemCreateRequest(
          TARTAN_BANK_INSTITUTION_ID,
          Collections.singletonList(Product.TRANSACTIONS))
          .withCredentials("username", "user_good")
          .withCredentials("password", "mfa_device")).execute();
    assertSuccessResponse(itemCreateResponse);
    assertTrue(itemCreateResponse.body().isMfaResponse());
    assertFalse(itemCreateResponse.body().isItemResponse());
    assertEquals(MfaType.DEVICE_LIST, itemCreateResponse.body().getMfaType());
    String accessToken = itemCreateResponse.body().getAccessToken();

    String deviceId = itemCreateResponse.body().getDeviceList().get(0).getDeviceId();

    Response<ItemMfaResponse> mfaDeviceResponse =
    	      client().service().itemMfa(new ItemMfaRequest(accessToken, MfaType.DEVICE_LIST).withResponses(deviceId)).execute();
    Response<ItemMfaResponse> response =
      client().service().itemMfa(new ItemMfaRequest(accessToken, MfaType.DEVICE).withResponses("9876")).execute();
    assertErrorResponse(response, ErrorResponse.ErrorType.ITEM_ERROR, "INVALID_MFA");
  }

  private static void assertItemResponse(Response<ItemCreateResponse> itemCreateResponse, Response<ItemMfaResponse> response) {
    assertSuccessResponse(response);
    assertTrue(response.body().isItemResponse());
    assertFalse(response.body().isMfaResponse());
    assertEquals(Arrays.asList(Product.AUTH, Product.BALANCE, Product.CREDIT_DETAILS, Product.IDENTITY),
      response.body().getItem().getAvailableProducts());
    assertEquals(1, response.body().getItem().getBilledProducts().size());
    assertThat(response.body().getItem().getBilledProducts(), hasItems(Product.TRANSACTIONS));
    assertNull(response.body().getItem().getError());
    assertEquals(TARTAN_BANK_INSTITUTION_ID, response.body().getItem().getInstitutionId());
    assertNotNull(response.body().getItem().getItemId());
  }
}
