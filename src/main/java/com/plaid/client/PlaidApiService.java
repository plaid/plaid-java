package com.plaid.client;

import com.plaid.client.request.AccountsBalanceGetRequest;
import com.plaid.client.request.AccountsGetRequest;
import com.plaid.client.request.AuthGetRequest;
import com.plaid.client.request.CategoriesGetRequest;
import com.plaid.client.request.CreditDetailsGetRequest;
import com.plaid.client.request.IdentityGetRequest;
import com.plaid.client.request.InstitutionsGetByIdRequest;
import com.plaid.client.request.InstitutionsGetRequest;
import com.plaid.client.request.InstitutionsSearchRequest;
import com.plaid.client.request.ItemAccessTokenInvalidateRequest;
import com.plaid.client.request.ItemAccessTokenUpdateVersionRequest;
import com.plaid.client.request.ItemCreateRequest;
import com.plaid.client.request.ItemCredentialsEncryptRequest;
import com.plaid.client.request.ItemCredentialsUpdateRequest;
import com.plaid.client.request.ItemDeleteRequest;
import com.plaid.client.request.ItemGetRequest;
import com.plaid.client.request.ItemMfaEncryptRequest;
import com.plaid.client.request.ItemMfaRequest;
import com.plaid.client.request.ItemPublicTokenCreateRequest;
import com.plaid.client.request.ItemPublicTokenExchangeRequest;
import com.plaid.client.request.ItemStripeTokenCreateRequest;
import com.plaid.client.request.ItemWebhookUpdateRequest;
import com.plaid.client.request.TransactionsDeactivateRequest;
import com.plaid.client.request.TransactionsGetRequest;
import com.plaid.client.response.AccountsBalanceGetResponse;
import com.plaid.client.response.AccountsGetResponse;
import com.plaid.client.response.AuthGetResponse;
import com.plaid.client.response.CategoriesGetResponse;
import com.plaid.client.response.CreditDetailsGetResponse;
import com.plaid.client.response.IdentityGetResponse;
import com.plaid.client.response.InstitutionsGetByIdResponse;
import com.plaid.client.response.InstitutionsGetResponse;
import com.plaid.client.response.InstitutionsSearchResponse;
import com.plaid.client.response.ItemAccessTokenInvalidateResponse;
import com.plaid.client.response.ItemAccessTokenUpdateVersionResponse;
import com.plaid.client.response.ItemCreateResponse;
import com.plaid.client.response.ItemCredentialsEncryptResponse;
import com.plaid.client.response.ItemCredentialsUpdateResponse;
import com.plaid.client.response.ItemDeleteResponse;
import com.plaid.client.response.ItemGetResponse;
import com.plaid.client.response.ItemMfaEncryptResponse;
import com.plaid.client.response.ItemMfaResponse;
import com.plaid.client.response.ItemPublicTokenCreateResponse;
import com.plaid.client.response.ItemPublicTokenExchangeResponse;
import com.plaid.client.response.ItemStripeTokenCreateResponse;
import com.plaid.client.response.ItemWebhookUpdateResponse;
import com.plaid.client.response.TransactionsDeactivateResponse;
import com.plaid.client.response.TransactionsGetResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface PlaidApiService {

  // item, link, and credentials calls
  ////////////////////////////////////////////////////////
  ////////////////////////////////////////////////////////
  @POST("/item/create")
  Call<ItemCreateResponse> itemCreate(@Body ItemCreateRequest request);

  @POST("/item/mfa")
  Call<ItemMfaResponse> itemMfa(@Body ItemMfaRequest request);

  @POST("/item/get")
  Call<ItemGetResponse> itemGet(@Body ItemGetRequest request);

  @POST("/item/credentials/update")
  Call<ItemCredentialsUpdateResponse> itemCredentialsUpdate(@Body ItemCredentialsUpdateRequest request);

  @POST("/item/credentials/encrypt")
  Call<ItemCredentialsEncryptResponse> itemCredentialsEncrypt(@Body ItemCredentialsEncryptRequest request);

  @POST("/item/mfa/encrypt")
  Call<ItemMfaEncryptResponse> itemMfaEncrypt(@Body ItemMfaEncryptRequest request);

  @POST("/item/public_token/exchange")
  Call<ItemPublicTokenExchangeResponse> itemPublicTokenExchange(@Body ItemPublicTokenExchangeRequest request);

  @POST("/item/public_token/create")
  Call<ItemPublicTokenCreateResponse> itemPublicTokenCreate(@Body ItemPublicTokenCreateRequest request);

  @POST("/processor/stripe/bank_account_token/create")
  Call<ItemStripeTokenCreateResponse> itemStripeTokenCreate(@Body ItemStripeTokenCreateRequest request);

  @POST("/item/access_token/invalidate")
  Call<ItemAccessTokenInvalidateResponse> itemAccessTokenInvalidate(@Body ItemAccessTokenInvalidateRequest request);

  @POST("/item/access_token/update_version")
  Call<ItemAccessTokenUpdateVersionResponse> itemAccessTokenUpdateVersion(@Body ItemAccessTokenUpdateVersionRequest request);

  @POST("/item/delete")
  Call<ItemDeleteResponse> itemDelete(@Body ItemDeleteRequest request);

  @POST("/item/webhook/update")
  Call<ItemWebhookUpdateResponse> itemWebhookUpdate(@Body ItemWebhookUpdateRequest request);

  // products
  ////////////////////////////////////////////////////////
  ////////////////////////////////////////////////////////
  @POST("/accounts/get")
  Call<AccountsGetResponse> accountsGet(@Body AccountsGetRequest request);

  @POST("/accounts/balance/get")
  Call<AccountsBalanceGetResponse> accountsBalanceGet(@Body AccountsBalanceGetRequest request);

  @POST("/auth/get")
  Call<AuthGetResponse> authGet(@Body AuthGetRequest request);

  @POST("/identity/get")
  Call<IdentityGetResponse> identityGet(@Body IdentityGetRequest request);

  @POST("/transactions/get")
  Call<TransactionsGetResponse> transactionsGet(@Body TransactionsGetRequest request);

  @POST("/transactions/deactivate")
  Call<TransactionsDeactivateResponse> transactionsDeactivate(@Body TransactionsDeactivateRequest request);

  @POST("/credit_details/get")
  Call<CreditDetailsGetResponse> creditDetailsGet(@Body CreditDetailsGetRequest request);

  @POST("/categories/get")
  Call<CategoriesGetResponse> categoriesGet(@Body CategoriesGetRequest request);

  // institutions
  ////////////////////////////////////////////////////////
  ////////////////////////////////////////////////////////
  @POST("/institutions/get")
  Call<InstitutionsGetResponse> institutionsGet(@Body InstitutionsGetRequest request);

  @POST("/institutions/get_by_id")
  Call<InstitutionsGetByIdResponse> institutionsGetById(@Body InstitutionsGetByIdRequest request);

  @POST("/institutions/search")
  Call<InstitutionsSearchResponse> institutionsSearch(@Body InstitutionsSearchRequest request);
}
