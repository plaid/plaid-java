package com.plaid.client.request;

import com.plaid.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.plaid.client.model.AccountsBalanceGetRequest;
import com.plaid.client.model.AccountsGetRequest;
import com.plaid.client.model.AccountsGetResponse;
import com.plaid.client.model.ApplicationGetRequest;
import com.plaid.client.model.ApplicationGetResponse;
import com.plaid.client.model.AssetReportAuditCopyCreateRequest;
import com.plaid.client.model.AssetReportAuditCopyCreateResponse;
import com.plaid.client.model.AssetReportAuditCopyGetRequest;
import com.plaid.client.model.AssetReportAuditCopyRemoveRequest;
import com.plaid.client.model.AssetReportAuditCopyRemoveResponse;
import com.plaid.client.model.AssetReportCreateRequest;
import com.plaid.client.model.AssetReportCreateResponse;
import com.plaid.client.model.AssetReportFilterRequest;
import com.plaid.client.model.AssetReportFilterResponse;
import com.plaid.client.model.AssetReportGetRequest;
import com.plaid.client.model.AssetReportGetResponse;
import com.plaid.client.model.AssetReportPDFGetRequest;
import com.plaid.client.model.AssetReportRefreshRequest;
import com.plaid.client.model.AssetReportRefreshResponse;
import com.plaid.client.model.AssetReportRemoveRequest;
import com.plaid.client.model.AssetReportRemoveResponse;
import com.plaid.client.model.AuthGetRequest;
import com.plaid.client.model.AuthGetResponse;
import com.plaid.client.model.BankTransferBalanceGetRequest;
import com.plaid.client.model.BankTransferBalanceGetResponse;
import com.plaid.client.model.BankTransferCancelRequest;
import com.plaid.client.model.BankTransferCancelResponse;
import com.plaid.client.model.BankTransferCreateRequest;
import com.plaid.client.model.BankTransferCreateResponse;
import com.plaid.client.model.BankTransferEventListRequest;
import com.plaid.client.model.BankTransferEventListResponse;
import com.plaid.client.model.BankTransferEventSyncRequest;
import com.plaid.client.model.BankTransferEventSyncResponse;
import com.plaid.client.model.BankTransferGetRequest;
import com.plaid.client.model.BankTransferGetResponse;
import com.plaid.client.model.BankTransferListRequest;
import com.plaid.client.model.BankTransferListResponse;
import com.plaid.client.model.BankTransferMigrateAccountRequest;
import com.plaid.client.model.BankTransferMigrateAccountResponse;
import com.plaid.client.model.CategoriesGetResponse;
import com.plaid.client.model.DepositSwitchAltCreateRequest;
import com.plaid.client.model.DepositSwitchAltCreateResponse;
import com.plaid.client.model.DepositSwitchCreateRequest;
import com.plaid.client.model.DepositSwitchCreateResponse;
import com.plaid.client.model.DepositSwitchGetRequest;
import com.plaid.client.model.DepositSwitchGetResponse;
import com.plaid.client.model.DepositSwitchTokenCreateRequest;
import com.plaid.client.model.DepositSwitchTokenCreateResponse;
import com.plaid.client.model.EmployersSearchRequest;
import com.plaid.client.model.EmployersSearchResponse;
import com.plaid.client.model.Error;
import java.io.File;
import com.plaid.client.model.IdentityGetRequest;
import com.plaid.client.model.IdentityGetResponse;
import com.plaid.client.model.IncomeVerificationCreateRequest;
import com.plaid.client.model.IncomeVerificationCreateResponse;
import com.plaid.client.model.IncomeVerificationDocumentsDownloadRequest;
import com.plaid.client.model.IncomeVerificationPaystubsGetRequest;
import com.plaid.client.model.IncomeVerificationPaystubsGetResponse;
import com.plaid.client.model.IncomeVerificationRefreshRequest;
import com.plaid.client.model.IncomeVerificationRefreshResponse;
import com.plaid.client.model.IncomeVerificationSummaryGetRequest;
import com.plaid.client.model.IncomeVerificationSummaryGetResponse;
import com.plaid.client.model.InstitutionsGetByIdRequest;
import com.plaid.client.model.InstitutionsGetByIdResponse;
import com.plaid.client.model.InstitutionsGetRequest;
import com.plaid.client.model.InstitutionsGetResponse;
import com.plaid.client.model.InstitutionsSearchRequest;
import com.plaid.client.model.InstitutionsSearchResponse;
import com.plaid.client.model.InvestmentsHoldingsGetRequest;
import com.plaid.client.model.InvestmentsHoldingsGetResponse;
import com.plaid.client.model.InvestmentsTransactionsGetRequest;
import com.plaid.client.model.InvestmentsTransactionsGetResponse;
import com.plaid.client.model.ItemAccessTokenInvalidateRequest;
import com.plaid.client.model.ItemAccessTokenInvalidateResponse;
import com.plaid.client.model.ItemApplicationListRequest;
import com.plaid.client.model.ItemApplicationListResponse;
import com.plaid.client.model.ItemApplicationScopesUpdateRequest;
import com.plaid.client.model.ItemApplicationScopesUpdateResponse;
import com.plaid.client.model.ItemGetRequest;
import com.plaid.client.model.ItemGetResponse;
import com.plaid.client.model.ItemImportRequest;
import com.plaid.client.model.ItemImportResponse;
import com.plaid.client.model.ItemPublicTokenCreateRequest;
import com.plaid.client.model.ItemPublicTokenCreateResponse;
import com.plaid.client.model.ItemPublicTokenExchangeRequest;
import com.plaid.client.model.ItemPublicTokenExchangeResponse;
import com.plaid.client.model.ItemRemoveRequest;
import com.plaid.client.model.ItemRemoveResponse;
import com.plaid.client.model.ItemWebhookUpdateRequest;
import com.plaid.client.model.ItemWebhookUpdateResponse;
import com.plaid.client.model.LiabilitiesGetRequest;
import com.plaid.client.model.LiabilitiesGetResponse;
import com.plaid.client.model.LinkTokenCreateRequest;
import com.plaid.client.model.LinkTokenCreateResponse;
import com.plaid.client.model.LinkTokenGetRequest;
import com.plaid.client.model.LinkTokenGetResponse;
import com.plaid.client.model.PaymentInitiationPaymentCreateRequest;
import com.plaid.client.model.PaymentInitiationPaymentCreateResponse;
import com.plaid.client.model.PaymentInitiationPaymentGetRequest;
import com.plaid.client.model.PaymentInitiationPaymentGetResponse;
import com.plaid.client.model.PaymentInitiationPaymentListRequest;
import com.plaid.client.model.PaymentInitiationPaymentListResponse;
import com.plaid.client.model.PaymentInitiationPaymentTokenCreateRequest;
import com.plaid.client.model.PaymentInitiationPaymentTokenCreateResponse;
import com.plaid.client.model.PaymentInitiationRecipientCreateRequest;
import com.plaid.client.model.PaymentInitiationRecipientCreateResponse;
import com.plaid.client.model.PaymentInitiationRecipientGetRequest;
import com.plaid.client.model.PaymentInitiationRecipientGetResponse;
import com.plaid.client.model.PaymentInitiationRecipientListRequest;
import com.plaid.client.model.PaymentInitiationRecipientListResponse;
import com.plaid.client.model.ProcessorApexProcessorTokenCreateRequest;
import com.plaid.client.model.ProcessorAuthGetRequest;
import com.plaid.client.model.ProcessorAuthGetResponse;
import com.plaid.client.model.ProcessorBalanceGetRequest;
import com.plaid.client.model.ProcessorBalanceGetResponse;
import com.plaid.client.model.ProcessorBankTransferCreateRequest;
import com.plaid.client.model.ProcessorBankTransferCreateResponse;
import com.plaid.client.model.ProcessorIdentityGetRequest;
import com.plaid.client.model.ProcessorIdentityGetResponse;
import com.plaid.client.model.ProcessorStripeBankAccountTokenCreateRequest;
import com.plaid.client.model.ProcessorStripeBankAccountTokenCreateResponse;
import com.plaid.client.model.ProcessorTokenCreateRequest;
import com.plaid.client.model.ProcessorTokenCreateResponse;
import com.plaid.client.model.SandboxBankTransferFireWebhookRequest;
import com.plaid.client.model.SandboxBankTransferFireWebhookResponse;
import com.plaid.client.model.SandboxBankTransferSimulateRequest;
import com.plaid.client.model.SandboxBankTransferSimulateResponse;
import com.plaid.client.model.SandboxIncomeFireWebhookRequest;
import com.plaid.client.model.SandboxIncomeFireWebhookResponse;
import com.plaid.client.model.SandboxItemFireWebhookRequest;
import com.plaid.client.model.SandboxItemFireWebhookResponse;
import com.plaid.client.model.SandboxItemResetLoginRequest;
import com.plaid.client.model.SandboxItemResetLoginResponse;
import com.plaid.client.model.SandboxItemSetVerificationStatusRequest;
import com.plaid.client.model.SandboxItemSetVerificationStatusResponse;
import com.plaid.client.model.SandboxOauthSelectAccountsRequest;
import com.plaid.client.model.SandboxProcessorTokenCreateRequest;
import com.plaid.client.model.SandboxProcessorTokenCreateResponse;
import com.plaid.client.model.SandboxPublicTokenCreateRequest;
import com.plaid.client.model.SandboxPublicTokenCreateResponse;
import com.plaid.client.model.SignalDecisionReportRequest;
import com.plaid.client.model.SignalDecisionReportResponse;
import com.plaid.client.model.SignalEvaluateRequest;
import com.plaid.client.model.SignalEvaluateResponse;
import com.plaid.client.model.SignalReturnReportRequest;
import com.plaid.client.model.SignalReturnReportResponse;
import com.plaid.client.model.TransactionsGetRequest;
import com.plaid.client.model.TransactionsGetResponse;
import com.plaid.client.model.TransactionsRefreshRequest;
import com.plaid.client.model.TransactionsRefreshResponse;
import com.plaid.client.model.WebhookVerificationKeyGetRequest;
import com.plaid.client.model.WebhookVerificationKeyGetResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface PlaidApi {
  /**
   * Retrieve real-time balance data
   * The &#x60;/accounts/balance/get&#x60; endpoint returns the real-time balance for each of an Item&#39;s accounts. While other endpoints may return a balance object, only &#x60;/accounts/balance/get&#x60; forces the available and current balance fields to be refreshed rather than cached. This endpoint can be used for existing Items that were added via any of Plaid’s other products. This endpoint can be used as long as Link has been initialized with any other product, &#x60;balance&#x60; itself is not a product that can be used to initialize Link.
   * @param accountsBalanceGetRequest  (required)
   * @return Call&lt;AccountsGetResponse&gt;
   * 
   * @see <a href="/api/products/#accountsbalanceget">Retrieve real-time balance data Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("accounts/balance/get")
  Call<AccountsGetResponse> accountsBalanceGet(
    @retrofit2.http.Body AccountsBalanceGetRequest accountsBalanceGetRequest
  );

  /**
   * Retrieve accounts
   * The &#x60;/accounts/get&#x60;  endpoint can be used to retrieve information for any linked Item. Note that some information is nullable. Plaid will only return active bank accounts, i.e. accounts that are not closed and are capable of carrying a balance.  This endpoint retrieves cached information, rather than extracting fresh information from the institution. As a result, balances returned may not be up-to-date; for realtime balance information, use &#x60;/accounts/balance/get&#x60; instead.
   * @param accountsGetRequest  (required)
   * @return Call&lt;AccountsGetResponse&gt;
   * 
   * @see <a href="/api/accounts/#accountsget">Retrieve accounts Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("accounts/get")
  Call<AccountsGetResponse> accountsGet(
    @retrofit2.http.Body AccountsGetRequest accountsGetRequest
  );

  /**
   * Retrieve information about a Plaid application
   * Allows financial institutions to retrieve information about Plaid clients for the purpose of building control-tower experiences
   * @param applicationGetRequest  (required)
   * @return Call&lt;ApplicationGetResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("application/get")
  Call<ApplicationGetResponse> applicationGet(
    @retrofit2.http.Body ApplicationGetRequest applicationGetRequest
  );

  /**
   * Create Asset Report Audit Copy
   * Plaid can provide an Audit Copy of any Asset Report directly to a participating third party on your behalf. For example, Plaid can supply an Audit Copy directly to Fannie Mae on your behalf if you participate in the Day 1 Certainty™ program. An Audit Copy contains the same underlying data as the Asset Report.  To grant access to an Audit Copy, use the &#x60;/asset_report/audit_copy/create&#x60; endpoint to create an &#x60;audit_copy_token&#x60; and then pass that token to the third party who needs access. Each third party has its own &#x60;auditor_id&#x60;, for example &#x60;fannie_mae&#x60;. You’ll need to create a separate Audit Copy for each third party to whom you want to grant access to the Report.
   * @param assetReportAuditCopyCreateRequest  (required)
   * @return Call&lt;AssetReportAuditCopyCreateResponse&gt;
   * 
   * @see <a href="/api/products/#asset_reportaudit_copycreate">Create Asset Report Audit Copy Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("asset_report/audit_copy/create")
  Call<AssetReportAuditCopyCreateResponse> assetReportAuditCopyCreate(
    @retrofit2.http.Body AssetReportAuditCopyCreateRequest assetReportAuditCopyCreateRequest
  );

  /**
   * Retrieve an Asset Report Audit Copy
   * &#x60;/asset_report/audit_copy/get&#x60; allows auditors to get a copy of an Asset Report that was previously shared via the &#x60;/asset_report/audit_copy/create&#x60; endpoint.  The caller of &#x60;/asset_report/audit_copy/create&#x60; must provide the &#x60;audit_copy_token&#x60; to the auditor.  This token can then be used to call &#x60;/asset_report/audit_copy/create&#x60;.
   * @param assetReportAuditCopyGetRequest  (required)
   * @return Call&lt;AssetReportGetResponse&gt;
   * 
   * @see <a href="/none/">Retrieve an Asset Report Audit Copy Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("asset_report/audit_copy/get")
  Call<AssetReportGetResponse> assetReportAuditCopyGet(
    @retrofit2.http.Body AssetReportAuditCopyGetRequest assetReportAuditCopyGetRequest
  );

  /**
   * Remove Asset Report Audit Copy
   * The &#x60;/asset_report/audit_copy/remove&#x60; endpoint allows you to remove an Audit Copy. Removing an Audit Copy invalidates the &#x60;audit_copy_token&#x60; associated with it, meaning both you and any third parties holding the token will no longer be able to use it to access Report data. Items associated with the Asset Report, the Asset Report itself and other Audit Copies of it are not affected and will remain accessible after removing the given Audit Copy.
   * @param assetReportAuditCopyRemoveRequest  (required)
   * @return Call&lt;AssetReportAuditCopyRemoveResponse&gt;
   * 
   * @see <a href="/api/products/#asset_reportaudit_copyremove">Remove Asset Report Audit Copy Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("asset_report/audit_copy/remove")
  Call<AssetReportAuditCopyRemoveResponse> assetReportAuditCopyRemove(
    @retrofit2.http.Body AssetReportAuditCopyRemoveRequest assetReportAuditCopyRemoveRequest
  );

  /**
   * Create an Asset Report
   * The &#x60;/asset_report/create&#x60; endpoint initiates the process of creating an Asset Report, which can then be retrieved by passing the &#x60;asset_report_token&#x60; return value to the &#x60;/asset_report/get&#x60; or &#x60;/asset_report/pdf/get&#x60; endpoints.  The Asset Report takes some time to be created and is not available immediately after calling &#x60;/asset_report/create&#x60;. When the Asset Report is ready to be retrieved using &#x60;/asset_report/get&#x60; or &#x60;/asset_report/pdf/get&#x60;, Plaid will fire a &#x60;PRODUCT_READY&#x60; webhook. For full details of the webhook schema, see [Asset Report webhooks](https://plaid.com/docs/api/webhooks/#Assets-webhooks).  The &#x60;/asset_report/create&#x60; endpoint creates an Asset Report at a moment in time. Asset Reports are immutable. To get an updated Asset Report, use the &#x60;/asset_report/refresh&#x60; endpoint.
   * @param assetReportCreateRequest  (required)
   * @return Call&lt;AssetReportCreateResponse&gt;
   * 
   * @see <a href="/api/products/#asset_reportcreate">Create an Asset Report Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("asset_report/create")
  Call<AssetReportCreateResponse> assetReportCreate(
    @retrofit2.http.Body AssetReportCreateRequest assetReportCreateRequest
  );

  /**
   * Filter Asset Report
   * By default, an Asset Report will contain all of the accounts on a given Item. In some cases, you may not want the Asset Report to contain all accounts. For example, you might have the end user choose which accounts are relevant in Link using the Account Select view, which you can enable in the dashboard. Or, you might always exclude certain account types or subtypes, which you can identify by using the &#x60;/accounts/get&#x60; endpoint. To narrow an Asset Report to only a subset of accounts, use the &#x60;/asset_report/filter&#x60; endpoint.  To exclude certain Accounts from an Asset Report, first use the &#x60;/asset_report/create&#x60; endpoint to create the report, then send the &#x60;asset_report_token&#x60; along with a list of &#x60;account_ids&#x60; to exclude to the &#x60;/asset_report/filter&#x60; endpoint, to create a new Asset Report which contains only a subset of the original Asset Report&#39;s data.  Because Asset Reports are immutable, calling &#x60;/asset_report/filter&#x60; does not alter the original Asset Report in any way; rather, &#x60;/asset_report/filter&#x60; creates a new Asset Report with a new token and id. Asset Reports created via &#x60;/asset_report/filter&#x60; do not contain new Asset data, and are not billed.  Plaid will fire a [&#x60;PRODUCT_READY&#x60;](https://plaid.com/docs/api/webhooks) webhook once generation of the filtered Asset Report has completed.
   * @param assetReportFilterRequest  (required)
   * @return Call&lt;AssetReportFilterResponse&gt;
   * 
   * @see <a href="/api/products/#asset_reportfilter">Filter Asset Report Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("asset_report/filter")
  Call<AssetReportFilterResponse> assetReportFilter(
    @retrofit2.http.Body AssetReportFilterRequest assetReportFilterRequest
  );

  /**
   * Retrieve an Asset Report
   * The &#x60;/asset_report/get&#x60; endpoint retrieves the Asset Report in JSON format. Before calling &#x60;/asset_report/get&#x60;, you must first create the Asset Report using &#x60;/asset_report/create&#x60; (or filter an Asset Report using &#x60;/asset_report/filter&#x60;) and then wait for the [&#x60;PRODUCT_READY&#x60;](https://plaid.com/docs/api/webhooks) webhook to fire, indicating that the Report is ready to be retrieved.  By default, an Asset Report includes transaction descriptions as returned by the bank, as opposed to parsed and categorized by Plaid. You can also receive cleaned and categorized transactions, as well as additional insights like merchant name or location information. We call this an Asset Report with Insights. An Asset Report with Insights provides transaction category, location, and merchant information in addition to the transaction strings provided in a standard Asset Report.  To retrieve an Asset Report with Insights, call the &#x60;/asset_report/get&#x60; endpoint with &#x60;include_insights&#x60; set to &#x60;true&#x60;.
   * @param assetReportGetRequest  (required)
   * @return Call&lt;AssetReportGetResponse&gt;
   * 
   * @see <a href="/api/products/#asset_reportget">Retrieve an Asset Report Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("asset_report/get")
  Call<AssetReportGetResponse> assetReportGet(
    @retrofit2.http.Body AssetReportGetRequest assetReportGetRequest
  );

  /**
   * Retrieve a PDF Asset Report
   * The &#x60;/asset_report/pdf/get&#x60; endpoint retrieves the Asset Report in PDF format. Before calling &#x60;/asset_report/pdf/get&#x60;, you must first create the Asset Report using &#x60;/asset_report/create&#x60; (or filter an Asset Report using &#x60;/asset_report/filter&#x60;) and then wait for the [&#x60;PRODUCT_READY&#x60;](https://plaid.com/docs/api/webhooks) webhook to fire, indicating that the Report is ready to be retrieved.  The response to &#x60;/asset_report/pdf/get&#x60; is the PDF binary data. The &#x60;request_id&#x60;  is returned in the &#x60;Plaid-Request-ID&#x60; header.  [View a sample PDF Asset Report](https://plaid.com/documents/sample-asset-report.pdf).
   * @param assetReportPDFGetRequest  (required)
   * @return Call&lt;ResponseBody&gt;
   * 
   * @see <a href="/api/products/#asset_reportpdfget">Retrieve a PDF Asset Report Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("asset_report/pdf/get")
  Call<ResponseBody> assetReportPdfGet(
    @retrofit2.http.Body AssetReportPDFGetRequest assetReportPDFGetRequest
  );

  /**
   * Refresh an Asset Report
   * An Asset Report is an immutable snapshot of a user&#39;s assets. In order to \&quot;refresh\&quot; an Asset Report you created previously, you can use the &#x60;/asset_report/refresh&#x60; endpoint to create a new Asset Report based on the old one, but with the most recent data available.  The new Asset Report will contain the same Items as the original Report, as well as the same filters applied by any call to &#x60;/asset_report/filter&#x60;. By default, the new Asset Report will also use the same parameters you submitted with your original &#x60;/asset_report/create&#x60; request, but the original &#x60;days_requested&#x60; value and the values of any parameters in the &#x60;options&#x60; object can be overridden with new values. To change these arguments, simply supply new values for them in your request to &#x60;/asset_report/refresh&#x60;. Submit an empty string (\&quot;\&quot;) for any previously-populated fields you would like set as empty.
   * @param assetReportRefreshRequest  (required)
   * @return Call&lt;AssetReportRefreshResponse&gt;
   * 
   * @see <a href="/api/products/#asset_reportrefresh">Refresh an Asset Report Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("asset_report/refresh")
  Call<AssetReportRefreshResponse> assetReportRefresh(
    @retrofit2.http.Body AssetReportRefreshRequest assetReportRefreshRequest
  );

  /**
   * Delete an Asset Report
   * The &#x60;/item/remove&#x60; endpoint allows you to invalidate an &#x60;access_token&#x60;, meaning you will not be able to create new Asset Reports with it. Removing an Item does not affect any Asset Reports or Audit Copies you have already created, which will remain accessible until you remove them specifically.  The &#x60;/asset_report/remove&#x60; endpoint allows you to remove an Asset Report. Removing an Asset Report invalidates its &#x60;asset_report_token&#x60;, meaning you will no longer be able to use it to access Report data or create new Audit Copies. Removing an Asset Report does not affect the underlying Items, but does invalidate any &#x60;audit_copy_tokens&#x60; associated with the Asset Report.
   * @param assetReportRemoveRequest  (required)
   * @return Call&lt;AssetReportRemoveResponse&gt;
   * 
   * @see <a href="/api/products/#asset_reportremove">Delete an Asset Report Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("asset_report/remove")
  Call<AssetReportRemoveResponse> assetReportRemove(
    @retrofit2.http.Body AssetReportRemoveRequest assetReportRemoveRequest
  );

  /**
   * Retrieve auth data
   * The &#x60;/auth/get&#x60; endpoint returns the bank account and bank identification numbers (such as routing numbers, for US accounts) associated with an Item&#39;s checking and savings accounts, along with high-level account data and balances when available.  Note: This request may take some time to complete if &#x60;auth&#x60; was not specified as an initial product when creating the Item. This is because Plaid must communicate directly with the institution to retrieve the data.  Also note that &#x60;/auth/get&#x60; will not return data for any new accounts opened after the Item was created. To obtain data for new accounts, create a new Item.
   * @param authGetRequest  (required)
   * @return Call&lt;AuthGetResponse&gt;
   * 
   * @see <a href="/api/products/#authget">Retrieve auth data Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("auth/get")
  Call<AuthGetResponse> authGet(
    @retrofit2.http.Body AuthGetRequest authGetRequest
  );

  /**
   * Get balance of your Bank Transfer account
   * Use the &#x60;/bank_transfer/balance/get&#x60; endpoint to see the available balance in your bank transfer account. Debit transfers increase this balance once their status is posted. Credit transfers decrease this balance when they are created.  The transactable balance shows the amount in your account that you are able to use for transfers, and is essentially your available balance minus your minimum balance.  Note that this endpoint can only be used with FBO accounts, when using Bank Transfers in the Full Service configuration. It cannot be used on your own account when using Bank Transfers in the BTS Platform configuration.
   * @param bankTransferBalanceGetRequest  (required)
   * @return Call&lt;BankTransferBalanceGetResponse&gt;
   * 
   * @see <a href="/api/products#bank_transferbalanceget">Get balance of your Bank Transfer account Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("bank_transfer/balance/get")
  Call<BankTransferBalanceGetResponse> bankTransferBalanceGet(
    @retrofit2.http.Body BankTransferBalanceGetRequest bankTransferBalanceGetRequest
  );

  /**
   * Cancel a bank transfer
   * Use the &#x60;/bank_transfer/cancel&#x60; endpoint to cancel a bank transfer.  A transfer is eligible for cancelation if the &#x60;cancellable&#x60; property returned by &#x60;/bank_transfer/get&#x60; is &#x60;true&#x60;.
   * @param bankTransferCancelRequest  (required)
   * @return Call&lt;BankTransferCancelResponse&gt;
   * 
   * @see <a href="/api/products#bank_transfercancel">Cancel a bank transfer Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("bank_transfer/cancel")
  Call<BankTransferCancelResponse> bankTransferCancel(
    @retrofit2.http.Body BankTransferCancelRequest bankTransferCancelRequest
  );

  /**
   * Create a bank transfer
   * Use the &#x60;/bank_transfer/create&#x60; endpoint to initiate a new bank transfer.
   * @param bankTransferCreateRequest  (required)
   * @return Call&lt;BankTransferCreateResponse&gt;
   * 
   * @see <a href="/api/products#bank_transfercreate">Create a bank transfer Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("bank_transfer/create")
  Call<BankTransferCreateResponse> bankTransferCreate(
    @retrofit2.http.Body BankTransferCreateRequest bankTransferCreateRequest
  );

  /**
   * List bank transfer events
   * Use the &#x60;/bank_transfer/event/list&#x60; endpoint to get a list of bank transfer events based on specified filter criteria.
   * @param bankTransferEventListRequest  (required)
   * @return Call&lt;BankTransferEventListResponse&gt;
   * 
   * @see <a href="/api/products#bank_transfereventlist">List bank transfer events Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("bank_transfer/event/list")
  Call<BankTransferEventListResponse> bankTransferEventList(
    @retrofit2.http.Body BankTransferEventListRequest bankTransferEventListRequest
  );

  /**
   * Sync bank transfer events
   * &#x60;/bank_transfer/event/sync&#x60; allows you to request up to the next 25 bank transfer events that happened after a specific &#x60;event_id&#x60;. Use the &#x60;/bank_transfer/event/sync&#x60; endpoint to guarantee you have seen all bank transfer events. 
   * @param bankTransferEventSyncRequest  (required)
   * @return Call&lt;BankTransferEventSyncResponse&gt;
   * 
   * @see <a href="/api/products#bank_transfereventsync">Sync bank transfer events Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("bank_transfer/event/sync")
  Call<BankTransferEventSyncResponse> bankTransferEventSync(
    @retrofit2.http.Body BankTransferEventSyncRequest bankTransferEventSyncRequest
  );

  /**
   * Retrieve a bank transfer
   * The &#x60;/bank_transfer/get&#x60; fetches information about the bank transfer corresponding to the given &#x60;bank_transfer_id&#x60;.
   * @param bankTransferGetRequest  (required)
   * @return Call&lt;BankTransferGetResponse&gt;
   * 
   * @see <a href="/api/products#bank_transferget">Retrieve a bank transfer Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("bank_transfer/get")
  Call<BankTransferGetResponse> bankTransferGet(
    @retrofit2.http.Body BankTransferGetRequest bankTransferGetRequest
  );

  /**
   * List bank transfers
   * Use the &#x60;/bank_transfer/list&#x60; endpoint to see a list of all your bank transfers and their statuses. Results are paginated; use the &#x60;count&#x60; and &#x60;offset&#x60; query parameters to retrieve the desired bank transfers. 
   * @param bankTransferListRequest  (required)
   * @return Call&lt;BankTransferListResponse&gt;
   * 
   * @see <a href="/api/products#bank_transferlist">List bank transfers Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("bank_transfer/list")
  Call<BankTransferListResponse> bankTransferList(
    @retrofit2.http.Body BankTransferListRequest bankTransferListRequest
  );

  /**
   * Migrate account into Bank Transfers
   * As an alternative to adding Items via Link, you can also use the &#x60;/bank_transfer/migrate_account&#x60; endpoint to migrate known account and routing numbers to Plaid Items.  Note that Items created in this way are not compatible with endpoints for other products, such as &#x60;/accounts/balance/get&#x60;, and can only be used with Bank Transfer endpoints.  If you require access to other endpoints, create the Item through Link instead.  Access to &#x60;/bank_transfer/migrate_account&#x60; is not enabled by default; to obtain access, contact your Plaid Account Manager.
   * @param bankTransferMigrateAccountRequest  (required)
   * @return Call&lt;BankTransferMigrateAccountResponse&gt;
   * 
   * @see <a href="/api/products#bank_transfermigrate_account">Migrate account into Bank Transfers Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("bank_transfer/migrate_account")
  Call<BankTransferMigrateAccountResponse> bankTransferMigrateAccount(
    @retrofit2.http.Body BankTransferMigrateAccountRequest bankTransferMigrateAccountRequest
  );

  /**
   * Get Categories
   * Send a request to the &#x60;/categories/get&#x60;  endpoint to get detailed information on categories returned by Plaid. This endpoint does not require authentication.
   * @param body  (required)
   * @return Call&lt;CategoriesGetResponse&gt;
   * 
   * @see <a href="/api/products/#categoriesget">Get Categories Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("categories/get")
  Call<CategoriesGetResponse> categoriesGet(
    @retrofit2.http.Body Object body
  );

  /**
   * Create payment token
   * The &#x60;/payment_initiation/payment/token/create&#x60; endpoint has been deprecated. New Plaid customers will be unable to use this endpoint, and existing customers are encouraged to migrate to the newer, &#x60;link_token&#x60;-based flow. The recommended flow is to provide the &#x60;payment_id&#x60; to &#x60;/link/token/create&#x60;, which returns a &#x60;link_token&#x60; used to initialize Link.  The &#x60;/payment_initiation/payment/token/create&#x60; is used to create a &#x60;payment_token&#x60;, which can then be used in Link initialization to enter a payment initiation flow. You can only use a &#x60;payment_token&#x60; once. If this attempt fails, the end user aborts the flow, or the token expires, you will need to create a new payment token. Creating a new payment token does not require end user input.
   * @param paymentInitiationPaymentTokenCreateRequest  (required)
   * @return Call&lt;PaymentInitiationPaymentTokenCreateResponse&gt;
   * @deprecated
   * 
   * @see <a href="/link/maintain-legacy-integration/#creating-a-payment-token">Create payment token Documentation</a>
   */
  @Deprecated
  @Headers({
    "Content-Type:application/json"
  })
  @POST("payment_initiation/payment/token/create")
  Call<PaymentInitiationPaymentTokenCreateResponse> createPaymentToken(
    @retrofit2.http.Body PaymentInitiationPaymentTokenCreateRequest paymentInitiationPaymentTokenCreateRequest
  );

  /**
   * Create a deposit switch without using Plaid Exchange
   * This endpoint provides an alternative to &#x60;/deposit_switch/create&#x60; for customers who have not yet fully integrated with Plaid Exchange. Like &#x60;/deposit_switch/create&#x60;, it creates a deposit switch entity that will be persisted throughout the lifecycle of the switch.
   * @param depositSwitchAltCreateRequest  (required)
   * @return Call&lt;DepositSwitchAltCreateResponse&gt;
   * 
   * @see <a href="/api/products#deposit_switchaltcreate">Create a deposit switch without using Plaid Exchange Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("deposit_switch/alt/create")
  Call<DepositSwitchAltCreateResponse> depositSwitchAltCreate(
    @retrofit2.http.Body DepositSwitchAltCreateRequest depositSwitchAltCreateRequest
  );

  /**
   * Create a deposit switch
   * This endpoint creates a deposit switch entity that will be persisted throughout the lifecycle of the switch.
   * @param depositSwitchCreateRequest  (required)
   * @return Call&lt;DepositSwitchCreateResponse&gt;
   * 
   * @see <a href="/api/products#deposit_switchcreate">Create a deposit switch Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("deposit_switch/create")
  Call<DepositSwitchCreateResponse> depositSwitchCreate(
    @retrofit2.http.Body DepositSwitchCreateRequest depositSwitchCreateRequest
  );

  /**
   * Retrieve a deposit switch
   * This endpoint returns information related to how the user has configured their payroll allocation and the state of the switch. You can use this information to build logic related to the user&#39;s direct deposit allocation preferences.
   * @param depositSwitchGetRequest  (required)
   * @return Call&lt;DepositSwitchGetResponse&gt;
   * 
   * @see <a href="/api/products#deposit_switchget">Retrieve a deposit switch Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("deposit_switch/get")
  Call<DepositSwitchGetResponse> depositSwitchGet(
    @retrofit2.http.Body DepositSwitchGetRequest depositSwitchGetRequest
  );

  /**
   * Create a deposit switch token
   * In order for the end user to take action, you will need to create a public token representing the deposit switch. This token is used to initialize Link. It can be used one time and expires after 30 minutes. 
   * @param depositSwitchTokenCreateRequest  (required)
   * @return Call&lt;DepositSwitchTokenCreateResponse&gt;
   * 
   * @see <a href="/deposit-switch/reference#deposit_switchtokencreate">Create a deposit switch token Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("deposit_switch/token/create")
  Call<DepositSwitchTokenCreateResponse> depositSwitchTokenCreate(
    @retrofit2.http.Body DepositSwitchTokenCreateRequest depositSwitchTokenCreateRequest
  );

  /**
   * Search employer database
   * &#x60;/employers/search&#x60; allows you the ability to search Plaid’s database of known employers, for use with Deposit Switch. You can use this endpoint to look up a user&#39;s employer in order to confirm that they are supported. Users with non-supported employers can then be routed out of the Deposit Switch flow.  The data in the employer database is currently limited. As the Deposit Switch and Income products progress through their respective beta periods, more employers are being regularly added. Because the employer database is frequently updated, we recommend that you do not cache or store data from this endpoint for more than a day.
   * @param employersSearchRequest  (required)
   * @return Call&lt;EmployersSearchResponse&gt;
   * 
   * @see <a href="/api/employers/#employerssearch">Search employer database Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("employers/search")
  Call<EmployersSearchResponse> employersSearch(
    @retrofit2.http.Body EmployersSearchRequest employersSearchRequest
  );

  /**
   * Retrieve identity data
   * The &#x60;/identity/get&#x60; endpoint allows you to retrieve various account holder information on file with the financial institution, including names, emails, phone numbers, and addresses. Only name data is guaranteed to be returned; other fields will be empty arrays if not provided by the institution.  Note: This request may take some time to complete if identity was not specified as an initial product when creating the Item. This is because Plaid must communicate directly with the institution to retrieve the data.
   * @param identityGetRequest  (required)
   * @return Call&lt;IdentityGetResponse&gt;
   * 
   * @see <a href="/api/products/#identityget">Retrieve identity data Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("identity/get")
  Call<IdentityGetResponse> identityGet(
    @retrofit2.http.Body IdentityGetRequest identityGetRequest
  );

  /**
   * Create an income verification instance
   * &#x60;/income/verification/create&#x60; begins the income verification process by returning an &#x60;income_verification_id&#x60;. You can then provide the &#x60;income_verification_id&#x60; to &#x60;/link/token/create&#x60; under the &#x60;income_verification&#x60; parameter in order to create a Link instance that will prompt the user to go through the income verification flow. Plaid will fire an &#x60;INCOME&#x60; webhook once the user completes the Payroll Income flow, or when the uploaded documents in the Document Income flow have finished processing. 
   * @param incomeVerificationCreateRequest  (required)
   * @return Call&lt;IncomeVerificationCreateResponse&gt;
   * 
   * @see <a href="/api/products/#incomeverificationcreate">Create an income verification instance Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("income/verification/create")
  Call<IncomeVerificationCreateResponse> incomeVerificationCreate(
    @retrofit2.http.Body IncomeVerificationCreateRequest incomeVerificationCreateRequest
  );

  /**
   * Download the original documents used for income verification
   * &#x60;/income/verification/documents/download&#x60; provides the ability to download the source paystub PDF that the end user uploaded via Paystub Import.  The response to &#x60;/income/verification/documents/download&#x60; is a ZIP file in binary data. The &#x60;request_id&#x60;  is returned in the &#x60;Plaid-Request-ID&#x60; header.  For Payroll Income, the most recent file available for download with the payroll provider will also be available from this endpoint.
   * @param incomeVerificationDocumentsDownloadRequest  (required)
   * @return Call&lt;ResponseBody&gt;
   * 
   * @see <a href="/api/products/#incomeverificationdocumentsdownload">Download the original documents used for income verification Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("income/verification/documents/download")
  Call<ResponseBody> incomeVerificationDocumentsDownload(
    @retrofit2.http.Body IncomeVerificationDocumentsDownloadRequest incomeVerificationDocumentsDownloadRequest
  );

  /**
   * Retrieve information from the paystubs used for income verification
   * &#x60;/income/verification/paystubs/get&#x60; returns the information collected from the paystubs that were used to verify an end user&#39;s income. It can be called once the status of the verification has been set to &#x60;VERIFICATION_STATUS_PROCESSING_COMPLETE&#x60;, as reported by the &#x60;INCOME: verification_status&#x60; webhook. Attempting to call the endpoint before verification has been completed will result in an error.
   * @param incomeVerificationPaystubsGetRequest  (required)
   * @return Call&lt;IncomeVerificationPaystubsGetResponse&gt;
   * 
   * @see <a href="/api/products/#incomeverificationpaystubsget">Retrieve information from the paystubs used for income verification Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("income/verification/paystubs/get")
  Call<IncomeVerificationPaystubsGetResponse> incomeVerificationPaystubsGet(
    @retrofit2.http.Body IncomeVerificationPaystubsGetRequest incomeVerificationPaystubsGetRequest
  );

  /**
   * Refresh an income verification
   * &#x60;/income/verification/refresh&#x60; refreshes a given income verification.
   * @param incomeVerificationRefreshRequest  (required)
   * @return Call&lt;IncomeVerificationRefreshResponse&gt;
   * 
   * @see <a href="/api/products/#incomeverificationrefresh">Refresh an income verification Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("income/verification/refresh")
  Call<IncomeVerificationRefreshResponse> incomeVerificationRefresh(
    @retrofit2.http.Body IncomeVerificationRefreshRequest incomeVerificationRefreshRequest
  );

  /**
   * Retrieve a summary of information derived from income verification
   * &#x60;/income/verification/summary/get&#x60; returns a verification summary for the income that was verified for an end user. It can be called once the status of the verification has been set to &#x60;VERIFICATION_STATUS_PROCESSING_COMPLETE&#x60;, as reported by the &#x60;INCOME: verification_status&#x60; webhook. Attempting to call the endpoint before verification has been completed will result in an error.
   * @param incomeVerificationSummaryGetRequest  (required)
   * @return Call&lt;IncomeVerificationSummaryGetResponse&gt;
   * 
   * @see <a href="/api/products/#incomeverificationsummaryget">Retrieve a summary of information derived from income verification Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("income/verification/summary/get")
  Call<IncomeVerificationSummaryGetResponse> incomeVerificationSummaryGet(
    @retrofit2.http.Body IncomeVerificationSummaryGetRequest incomeVerificationSummaryGetRequest
  );

  /**
   * Get details of all supported institutions
   * Returns a JSON response containing details on all financial institutions currently supported by Plaid. Because Plaid supports thousands of institutions, results are paginated.  If there is no overlap between an institution’s enabled products and a client’s enabled products, then the institution will be filtered out from the response. As a result, the number of institutions returned may not match the count specified in the call.  This data changes frequently. If you store it locally on your system, be sure to update it regularly.
   * @param institutionsGetRequest  (required)
   * @return Call&lt;InstitutionsGetResponse&gt;
   * 
   * @see <a href="/api/institutions/#institutionsget">Get details of all supported institutions Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("institutions/get")
  Call<InstitutionsGetResponse> institutionsGet(
    @retrofit2.http.Body InstitutionsGetRequest institutionsGetRequest
  );

  /**
   * Get details of an institution
   * Returns a JSON response containing details on a specified financial institution currently supported by Plaid.
   * @param institutionsGetByIdRequest  (required)
   * @return Call&lt;InstitutionsGetByIdResponse&gt;
   * 
   * @see <a href="/api/institutions/#institutionsget_by_id">Get details of an institution Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("institutions/get_by_id")
  Call<InstitutionsGetByIdResponse> institutionsGetById(
    @retrofit2.http.Body InstitutionsGetByIdRequest institutionsGetByIdRequest
  );

  /**
   * Search institutions
   * Returns a JSON response containing details for institutions that match the query parameters, up to a maximum of ten institutions per query.
   * @param institutionsSearchRequest  (required)
   * @return Call&lt;InstitutionsSearchResponse&gt;
   * 
   * @see <a href="/api/institutions/#institutionssearch">Search institutions Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("institutions/search")
  Call<InstitutionsSearchResponse> institutionsSearch(
    @retrofit2.http.Body InstitutionsSearchRequest institutionsSearchRequest
  );

  /**
   * Get Investment holdings
   * The &#x60;/investments/holdings/get&#x60; endpoint allows developers to receive user-authorized stock position data for &#x60;investment&#x60;-type accounts.
   * @param investmentsHoldingsGetRequest  (required)
   * @return Call&lt;InvestmentsHoldingsGetResponse&gt;
   * 
   * @see <a href="/api/products/#investmentsholdingsget">Get Investment holdings Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("investments/holdings/get")
  Call<InvestmentsHoldingsGetResponse> investmentsHoldingsGet(
    @retrofit2.http.Body InvestmentsHoldingsGetRequest investmentsHoldingsGetRequest
  );

  /**
   * Get investment transactions
   * The &#x60;/investments/transactions/get&#x60; endpoint allows developers to retrieve user-authorized transaction data for investment accounts.  Transactions are returned in reverse-chronological order, and the sequence of transaction ordering is stable and will not shift.  Due to the potentially large number of investment transactions associated with an Item, results are paginated. Manipulate the count and offset parameters in conjunction with the &#x60;total_investment_transactions&#x60; response body field to fetch all available investment transactions.
   * @param investmentsTransactionsGetRequest  (required)
   * @return Call&lt;InvestmentsTransactionsGetResponse&gt;
   * 
   * @see <a href="/api/products/#investmentstransactionsget">Get investment transactions Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("investments/transactions/get")
  Call<InvestmentsTransactionsGetResponse> investmentsTransactionsGet(
    @retrofit2.http.Body InvestmentsTransactionsGetRequest investmentsTransactionsGetRequest
  );

  /**
   * Invalidate access_token
   * By default, the &#x60;access_token&#x60; associated with an Item does not expire and should be stored in a persistent, secure manner.  You can use the &#x60;/item/access_token/invalidate&#x60; endpoint to rotate the &#x60;access_token&#x60; associated with an Item. The endpoint returns a new &#x60;access_token&#x60; and immediately invalidates the previous &#x60;access_token&#x60;. 
   * @param itemAccessTokenInvalidateRequest  (required)
   * @return Call&lt;ItemAccessTokenInvalidateResponse&gt;
   * 
   * @see <a href="/api/tokens/#itemaccess_tokeninvalidate">Invalidate access_token Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("item/access_token/invalidate")
  Call<ItemAccessTokenInvalidateResponse> itemAccessTokenInvalidate(
    @retrofit2.http.Body ItemAccessTokenInvalidateRequest itemAccessTokenInvalidateRequest
  );

  /**
   * List a user’s connected applications
   * List a user’s connected applications
   * @param itemApplicationListRequest  (required)
   * @return Call&lt;ItemApplicationListResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("item/application/list")
  Call<ItemApplicationListResponse> itemApplicationList(
    @retrofit2.http.Body ItemApplicationListRequest itemApplicationListRequest
  );

  /**
   * Update the scopes of access for a particular application
   * Enable consumers to update product access on selected accounts for an application.
   * @param itemApplicationScopesUpdateRequest  (required)
   * @return Call&lt;ItemApplicationScopesUpdateResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("item/application/scopes/update")
  Call<ItemApplicationScopesUpdateResponse> itemApplicationScopesUpdate(
    @retrofit2.http.Body ItemApplicationScopesUpdateRequest itemApplicationScopesUpdateRequest
  );

  /**
   * Create public token
   * Note: As of July 2020, the &#x60;/item/public_token/create&#x60; endpoint is deprecated. Instead, use &#x60;/link/token/create&#x60; with an &#x60;access_token&#x60; to create a Link token for use with [update mode](https://plaid.com/docs/link/update-mode).  If you need your user to take action to restore or resolve an error associated with an Item, generate a public token with the &#x60;/item/public_token/create&#x60; endpoint and then initialize Link with that &#x60;public_token&#x60;.  A &#x60;public_token&#x60; is one-time use and expires after 30 minutes. You use a &#x60;public_token&#x60; to initialize Link in [update mode](https://plaid.com/docs/link/update-mode) for a particular Item. You can generate a &#x60;public_token&#x60; for an Item even if you did not use Link to create the Item originally.  The &#x60;/item/public_token/create&#x60; endpoint is **not** used to create your initial &#x60;public_token&#x60;. If you have not already received an &#x60;access_token&#x60; for a specific Item, use Link to obtain your &#x60;public_token&#x60; instead. See the [Quickstart](https://plaid.com/docs/quickstart) for more information.
   * @param itemPublicTokenCreateRequest  (required)
   * @return Call&lt;ItemPublicTokenCreateResponse&gt;
   * 
   * @see <a href="/api/tokens/#itempublic_tokencreate">Create public token Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("item/public_token/create")
  Call<ItemPublicTokenCreateResponse> itemCreatePublicToken(
    @retrofit2.http.Body ItemPublicTokenCreateRequest itemPublicTokenCreateRequest
  );

  /**
   * Retrieve an Item
   * Returns information about the status of an Item.
   * @param itemGetRequest  (required)
   * @return Call&lt;ItemGetResponse&gt;
   * 
   * @see <a href="/api/items/#itemget">Retrieve an Item Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("item/get")
  Call<ItemGetResponse> itemGet(
    @retrofit2.http.Body ItemGetRequest itemGetRequest
  );

  /**
   * Import Item
   * &#x60;/item/import&#x60; creates an Item via your Plaid Exchange Integration and returns an &#x60;access_token&#x60;. As part of an &#x60;/item/import&#x60; request, you will include a User ID (&#x60;user_auth.user_id&#x60;) and Authentication Token (&#x60;user_auth.auth_token&#x60;) that enable data aggregation through your Plaid Exchange API endpoints. These authentication principals are to be chosen by you.  Upon creating an Item via &#x60;/item/import&#x60;, Plaid will automatically begin an extraction of that Item through the Plaid Exchange infrastructure you have already integrated. This will automatically generate the Plaid native account ID for the account the user will switch their direct deposit to (&#x60;target_account_id&#x60;).
   * @param itemImportRequest  (required)
   * @return Call&lt;ItemImportResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("item/import")
  Call<ItemImportResponse> itemImport(
    @retrofit2.http.Body ItemImportRequest itemImportRequest
  );

  /**
   * Exchange public token for an access token
   * Exchange a Link &#x60;public_token&#x60; for an API &#x60;access_token&#x60;. Link hands off the &#x60;public_token&#x60; client-side via the &#x60;onSuccess&#x60; callback once a user has successfully created an Item. The &#x60;public_token&#x60; is ephemeral and expires after 30 minutes.  The response also includes an &#x60;item_id&#x60; that should be stored with the &#x60;access_token&#x60;. The &#x60;item_id&#x60; is used to identify an Item in a webhook. The &#x60;item_id&#x60; can also be retrieved by making an &#x60;/item/get&#x60; request.
   * @param itemPublicTokenExchangeRequest  (required)
   * @return Call&lt;ItemPublicTokenExchangeResponse&gt;
   * 
   * @see <a href="/api/tokens/#itempublic_tokenexchange">Exchange public token for an access token Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("item/public_token/exchange")
  Call<ItemPublicTokenExchangeResponse> itemPublicTokenExchange(
    @retrofit2.http.Body ItemPublicTokenExchangeRequest itemPublicTokenExchangeRequest
  );

  /**
   * Remove an Item
   * The &#x60;/item/remove&#x60;  endpoint allows you to remove an Item. Once removed, the &#x60;access_token&#x60;  associated with the Item is no longer valid and cannot be used to access any data that was associated with the Item.  Note that in the Development environment, issuing an &#x60;/item/remove&#x60;  request will not decrement your live credential count. To increase your credential account in Development, contact Support.  Also note that for certain OAuth-based institutions, an Item removed via &#x60;/item/remove&#x60; may still show as an active connection in the institution&#39;s OAuth permission manager.
   * @param itemRemoveRequest  (required)
   * @return Call&lt;ItemRemoveResponse&gt;
   * 
   * @see <a href="/api/items/#itemremove">Remove an Item Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("item/remove")
  Call<ItemRemoveResponse> itemRemove(
    @retrofit2.http.Body ItemRemoveRequest itemRemoveRequest
  );

  /**
   * Update Webhook URL
   * The POST &#x60;/item/webhook/update&#x60; allows you to update the webhook URL associated with an Item. This request triggers a [&#x60;WEBHOOK_UPDATE_ACKNOWLEDGED&#x60;](https://plaid.com/docs/api/webhooks/#item-webhook-url-updated) webhook to the newly specified webhook URL.
   * @param itemWebhookUpdateRequest  (required)
   * @return Call&lt;ItemWebhookUpdateResponse&gt;
   * 
   * @see <a href="/api/items/#itemwebhookupdate">Update Webhook URL Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("item/webhook/update")
  Call<ItemWebhookUpdateResponse> itemWebhookUpdate(
    @retrofit2.http.Body ItemWebhookUpdateRequest itemWebhookUpdateRequest
  );

  /**
   * Retrieve Liabilities data
   * The &#x60;/liabilities/get&#x60; endpoint returns various details about an Item with loan or credit accounts. Liabilities data is available primarily for US financial institutions, with some limited coverage of Canadian institutions. Currently supported account types are account type &#x60;credit&#x60; with account subtype &#x60;credit card&#x60; or &#x60;paypal&#x60;, and account type &#x60;loan&#x60; with account subtype &#x60;student&#x60; or &#x60;mortgage&#x60;. To limit accounts listed in Link to types and subtypes supported by Liabilities, you can use the &#x60;account_filters&#x60; parameter when [creating a Link token](https://plaid.com/docs/api/tokens/#linktokencreate).  The types of information returned by Liabilities can include balances and due dates, loan terms, and account details such as original loan amount and guarantor. Data is refreshed approximately once per day; the latest data can be retrieved by calling &#x60;/liabilities/get&#x60;.  Note: This request may take some time to complete if &#x60;liabilities&#x60; was not specified as an initial product when creating the Item. This is because Plaid must communicate directly with the institution to retrieve the additional data.
   * @param liabilitiesGetRequest  (required)
   * @return Call&lt;LiabilitiesGetResponse&gt;
   * 
   * @see <a href="/api/products/#liabilitiesget">Retrieve Liabilities data Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("liabilities/get")
  Call<LiabilitiesGetResponse> liabilitiesGet(
    @retrofit2.http.Body LiabilitiesGetRequest liabilitiesGetRequest
  );

  /**
   * Create Link Token
   * The &#x60;/link/token/create&#x60; endpoint creates a &#x60;link_token&#x60;, which is required as a parameter when initializing Link. Once Link has been initialized, it returns a &#x60;public_token&#x60;, which can then be exchanged for an &#x60;access_token&#x60; via &#x60;/item/public_token/exchange&#x60; as part of the main Link flow.  A &#x60;link_token&#x60; generated by &#x60;/link/token/create&#x60; is also used to initialize other Link flows, such as the update mode flow for tokens with expired credentials, or the Payment Initiation (Europe) flow.
   * @param linkTokenCreateRequest  (required)
   * @return Call&lt;LinkTokenCreateResponse&gt;
   * 
   * @see <a href="/api/tokens/#linktokencreate">Create Link Token Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("link/token/create")
  Call<LinkTokenCreateResponse> linkTokenCreate(
    @retrofit2.http.Body LinkTokenCreateRequest linkTokenCreateRequest
  );

  /**
   * Get Link Token
   * The &#x60;/link/token/get&#x60; endpoint gets information about a previously-created &#x60;link_token&#x60; using the &#x60;/link/token/create&#x60; endpoint. It can be useful for debugging purposes.
   * @param linkTokenGetRequest  (required)
   * @return Call&lt;LinkTokenGetResponse&gt;
   * 
   * @see <a href="/api/tokens/#linktokenget">Get Link Token Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("link/token/get")
  Call<LinkTokenGetResponse> linkTokenGet(
    @retrofit2.http.Body LinkTokenGetRequest linkTokenGetRequest
  );

  /**
   * Create a payment
   * After creating a payment recipient, you can use the &#x60;/payment_initiation/payment/create&#x60; endpoint to create a payment to that recipient.  Payments can be one-time or standing order (recurring) and can be denominated in either EUR or GBP.  If making domestic GBP-denominated payments, your recipient must have been created with BACS numbers. In general, EUR-denominated payments will be sent via SEPA Credit Transfer and GBP-denominated payments will be sent via the Faster Payments network, but the payment network used will be determined by the institution. Payments sent via Faster Payments will typically arrive immediately, while payments sent via SEPA Credit Transfer will typically arrive in one business day.  Standing orders (recurring payments) must be denominated in GBP and can only be sent to recipients in the UK. Once created, standing order payments cannot be modified or canceled via the API. An end user can cancel or modify a standing order directly on their banking application or website, or by contacting the bank. Standing orders will follow the payment rules of the underlying rails (Faster Payments in UK). Payments can be sent Monday to Friday, excluding bank holidays. If the pre-arranged date falls on a weekend or bank holiday, the payment is made on the next working day. It is not possible to guarantee the exact time the payment will reach the recipient’s account, although at least 90% of standing order payments are sent by 6am.  In the Development environment, payments must be below 5 GBP / EUR. For details on any payment limits in Production, contact your Plaid Account Manager.
   * @param paymentInitiationPaymentCreateRequest  (required)
   * @return Call&lt;PaymentInitiationPaymentCreateResponse&gt;
   * 
   * @see <a href="/api/products/#payment_initiationpaymentcreate">Create a payment Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("payment_initiation/payment/create")
  Call<PaymentInitiationPaymentCreateResponse> paymentInitiationPaymentCreate(
    @retrofit2.http.Body PaymentInitiationPaymentCreateRequest paymentInitiationPaymentCreateRequest
  );

  /**
   * Get payment details
   * The &#x60;/payment_initiation/payment/get&#x60; endpoint can be used to check the status of a payment, as well as to receive basic information such as recipient and payment amount. In the case of standing orders, the &#x60;/payment_initiation/payment/get&#x60; endpoint will provide information about the status of the overall standing order itself; the API cannot be used to retrieve payment status for individual payments within a standing order.
   * @param paymentInitiationPaymentGetRequest  (required)
   * @return Call&lt;PaymentInitiationPaymentGetResponse&gt;
   * 
   * @see <a href="/api/products/#payment_initiationpaymentget">Get payment details Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("payment_initiation/payment/get")
  Call<PaymentInitiationPaymentGetResponse> paymentInitiationPaymentGet(
    @retrofit2.http.Body PaymentInitiationPaymentGetRequest paymentInitiationPaymentGetRequest
  );

  /**
   * List payments
   * The &#x60;/payment_initiation/payment/list&#x60; endpoint can be used to retrieve all created payments. By default, the 10 most recent payments are returned. You can request more payments and paginate through the results using the optional &#x60;count&#x60; and &#x60;cursor&#x60; parameters.
   * @param paymentInitiationPaymentListRequest  (required)
   * @return Call&lt;PaymentInitiationPaymentListResponse&gt;
   * 
   * @see <a href="/api/products/#payment_initiationpaymentlist">List payments Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("payment_initiation/payment/list")
  Call<PaymentInitiationPaymentListResponse> paymentInitiationPaymentList(
    @retrofit2.http.Body PaymentInitiationPaymentListRequest paymentInitiationPaymentListRequest
  );

  /**
   * Create payment recipient
   * Create a payment recipient for payment initiation.  The recipient must be in Europe, within a country that is a member of the Single Euro Payment Area (SEPA).  For a standing order (recurring) payment, the recipient must be in the UK.  The endpoint is idempotent: if a developer has already made a request with the same payment details, Plaid will return the same &#x60;recipient_id&#x60;. 
   * @param paymentInitiationRecipientCreateRequest  (required)
   * @return Call&lt;PaymentInitiationRecipientCreateResponse&gt;
   * 
   * @see <a href="/api/products/#payment_initiationrecipientcreate">Create payment recipient Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("payment_initiation/recipient/create")
  Call<PaymentInitiationRecipientCreateResponse> paymentInitiationRecipientCreate(
    @retrofit2.http.Body PaymentInitiationRecipientCreateRequest paymentInitiationRecipientCreateRequest
  );

  /**
   * Get payment recipient
   * Get details about a payment recipient you have previously created.
   * @param paymentInitiationRecipientGetRequest  (required)
   * @return Call&lt;PaymentInitiationRecipientGetResponse&gt;
   * 
   * @see <a href="/api/products/#payment_initiationrecipientget">Get payment recipient Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("payment_initiation/recipient/get")
  Call<PaymentInitiationRecipientGetResponse> paymentInitiationRecipientGet(
    @retrofit2.http.Body PaymentInitiationRecipientGetRequest paymentInitiationRecipientGetRequest
  );

  /**
   * List payment recipients
   * The &#x60;/payment_initiation/recipient/list&#x60; endpoint list the payment recipients that you have previously created.
   * @param paymentInitiationRecipientListRequest  (required)
   * @return Call&lt;PaymentInitiationRecipientListResponse&gt;
   * 
   * @see <a href="/api/products/#payment_initiationrecipientlist">List payment recipients Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("payment_initiation/recipient/list")
  Call<PaymentInitiationRecipientListResponse> paymentInitiationRecipientList(
    @retrofit2.http.Body PaymentInitiationRecipientListRequest paymentInitiationRecipientListRequest
  );

  /**
   * Create Apex bank account token
   * Used to create a token suitable for sending to Apex to enable Plaid-Apex integrations.
   * @param processorApexProcessorTokenCreateRequest  (required)
   * @return Call&lt;ProcessorTokenCreateResponse&gt;
   * 
   * @see <a href="/none/">Create Apex bank account token Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("processor/apex/processor_token/create")
  Call<ProcessorTokenCreateResponse> processorApexProcessorTokenCreate(
    @retrofit2.http.Body ProcessorApexProcessorTokenCreateRequest processorApexProcessorTokenCreateRequest
  );

  /**
   * Retrieve Auth data
   * The &#x60;/processor/auth/get&#x60; endpoint returns the bank account and bank identification number (such as the routing number, for US accounts), for a checking or savings account that&#39;s associated with a given &#x60;processor_token&#x60;. The endpoint also returns high-level account data and balances when available.
   * @param processorAuthGetRequest  (required)
   * @return Call&lt;ProcessorAuthGetResponse&gt;
   * 
   * @see <a href="/api/processors/#processorauthget">Retrieve Auth data Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("processor/auth/get")
  Call<ProcessorAuthGetResponse> processorAuthGet(
    @retrofit2.http.Body ProcessorAuthGetRequest processorAuthGetRequest
  );

  /**
   * Retrieve Balance data
   * The &#x60;/processor/balance/get&#x60; endpoint returns the real-time balance for each of an Item&#39;s accounts. While other endpoints may return a balance object, only &#x60;/processor/balance/get&#x60; forces the available and current balance fields to be refreshed rather than cached. 
   * @param processorBalanceGetRequest The &#x60;/processor/balance/get&#x60; endpoint returns the real-time balance for the account associated with a given &#x60;processor_token&#x60;.  The current balance is the total amount of funds in the account. The available balance is the current balance less any outstanding holds or debits that have not yet posted to the account.  Note that not all institutions calculate the available balance. In the event that available balance is unavailable from the institution, Plaid will return an available balance value of &#x60;null&#x60;. (required)
   * @return Call&lt;ProcessorBalanceGetResponse&gt;
   * 
   * @see <a href="/api/processors/#processorbalanceget">Retrieve Balance data Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("processor/balance/get")
  Call<ProcessorBalanceGetResponse> processorBalanceGet(
    @retrofit2.http.Body ProcessorBalanceGetRequest processorBalanceGetRequest
  );

  /**
   * Create a bank transfer as a processor
   * Use the &#x60;/processor/bank_transfer/create&#x60; endpoint to initiate a new bank transfer as a processor
   * @param processorBankTransferCreateRequest  (required)
   * @return Call&lt;ProcessorBankTransferCreateResponse&gt;
   * 
   * @see <a href="/api/processors/#bank_transfercreate">Create a bank transfer as a processor Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("processor/bank_transfer/create")
  Call<ProcessorBankTransferCreateResponse> processorBankTransferCreate(
    @retrofit2.http.Body ProcessorBankTransferCreateRequest processorBankTransferCreateRequest
  );

  /**
   * Retrieve Identity data
   * The &#x60;/processor/identity/get&#x60; endpoint allows you to retrieve various account holder information on file with the financial institution, including names, emails, phone numbers, and addresses.
   * @param processorIdentityGetRequest  (required)
   * @return Call&lt;ProcessorIdentityGetResponse&gt;
   * 
   * @see <a href="/api/processors/#processoridentityget">Retrieve Identity data Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("processor/identity/get")
  Call<ProcessorIdentityGetResponse> processorIdentityGet(
    @retrofit2.http.Body ProcessorIdentityGetRequest processorIdentityGetRequest
  );

  /**
   * Create Stripe bank account token
   * Used to create a token suitable for sending to Stripe to enable Plaid-Stripe integrations. For a detailed guide on integrating Stripe, see [Add Stripe to your app](https://plaid.com/docs/auth/partnerships/stripe/).
   * @param processorStripeBankAccountTokenCreateRequest  (required)
   * @return Call&lt;ProcessorStripeBankAccountTokenCreateResponse&gt;
   * 
   * @see <a href="/api/processors/#processorstripebank_account_tokencreate">Create Stripe bank account token Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("processor/stripe/bank_account_token/create")
  Call<ProcessorStripeBankAccountTokenCreateResponse> processorStripeBankAccountTokenCreate(
    @retrofit2.http.Body ProcessorStripeBankAccountTokenCreateRequest processorStripeBankAccountTokenCreateRequest
  );

  /**
   * Create processor token
   * Used to create a token suitable for sending to one of Plaid&#39;s partners to enable integrations. Note that Stripe partnerships use bank account tokens instead; see &#x60;/processor/stripe/bank_account_token/create&#x60; for creating tokens for use with Stripe integrations.
   * @param processorTokenCreateRequest  (required)
   * @return Call&lt;ProcessorTokenCreateResponse&gt;
   * 
   * @see <a href="/api/processors/#processortokencreate">Create processor token Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("processor/token/create")
  Call<ProcessorTokenCreateResponse> processorTokenCreate(
    @retrofit2.http.Body ProcessorTokenCreateRequest processorTokenCreateRequest
  );

  /**
   * Manually fire a Bank Transfer webhook
   * Use the &#x60;/sandbox/bank_transfer/fire_webhook&#x60; endpoint to manually trigger a Bank Transfers webhook in the Sandbox environment.
   * @param sandboxBankTransferFireWebhookRequest  (required)
   * @return Call&lt;SandboxBankTransferFireWebhookResponse&gt;
   * 
   * @see <a href="/api/sandbox/#sandboxbank_transferfire_webhook">Manually fire a Bank Transfer webhook Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("sandbox/bank_transfer/fire_webhook")
  Call<SandboxBankTransferFireWebhookResponse> sandboxBankTransferFireWebhook(
    @retrofit2.http.Body SandboxBankTransferFireWebhookRequest sandboxBankTransferFireWebhookRequest
  );

  /**
   * Simulate a bank transfer event in Sandbox
   * Use the &#x60;/sandbox/bank_transfer/simulate&#x60; endpoint to simulate a bank transfer event in the Sandbox environment.  Note that while an event will be simulated and will appear when using endpoints such as &#x60;/bank_transfer/event/sync&#x60; or &#x60;/bank_transfer/event/list&#x60;, no transactions will actually take place and funds will not move between accounts, even within the Sandbox.
   * @param sandboxBankTransferSimulateRequest  (required)
   * @return Call&lt;SandboxBankTransferSimulateResponse&gt;
   * 
   * @see <a href="/api/sandbox/#sandboxbank_transfersimulate">Simulate a bank transfer event in Sandbox Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("sandbox/bank_transfer/simulate")
  Call<SandboxBankTransferSimulateResponse> sandboxBankTransferSimulate(
    @retrofit2.http.Body SandboxBankTransferSimulateRequest sandboxBankTransferSimulateRequest
  );

  /**
   * Manually fire an Income webhook
   * Use the &#x60;/sandbox/income/fire_webhook&#x60; endpoint to manually trigger an Income webhook in the Sandbox environment.
   * @param sandboxIncomeFireWebhookRequest  (required)
   * @return Call&lt;SandboxIncomeFireWebhookResponse&gt;
   * 
   * @see <a href="/api/sandbox/#sandboxincomefire_webhook">Manually fire an Income webhook Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("sandbox/income/fire_webhook")
  Call<SandboxIncomeFireWebhookResponse> sandboxIncomeFireWebhook(
    @retrofit2.http.Body SandboxIncomeFireWebhookRequest sandboxIncomeFireWebhookRequest
  );

  /**
   * Fire a test webhook
   * The &#x60;/sandbox/item/fire_webhook&#x60; endpoint is used to test that code correctly handles webhooks. Calling this endpoint triggers a Transactions &#x60;DEFAULT_UPDATE&#x60; webhook to be fired for a given Sandbox Item. If the Item does not support Transactions, a &#x60;SANDBOX_PRODUCT_NOT_ENABLED&#x60; error will result.
   * @param sandboxItemFireWebhookRequest  (required)
   * @return Call&lt;SandboxItemFireWebhookResponse&gt;
   * 
   * @see <a href="/api/sandbox/#sandboxitemfire_webhook">Fire a test webhook Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("sandbox/item/fire_webhook")
  Call<SandboxItemFireWebhookResponse> sandboxItemFireWebhook(
    @retrofit2.http.Body SandboxItemFireWebhookRequest sandboxItemFireWebhookRequest
  );

  /**
   * Force a Sandbox Item into an error state
   * &#x60;/sandbox/item/reset_login/&#x60; forces an Item into an &#x60;ITEM_LOGIN_REQUIRED&#x60; state in order to simulate an Item whose login is no longer valid. This makes it easy to test Link&#39;s [update mode](https://plaid.com/docs/link/update-mode) flow in the Sandbox environment.  After calling &#x60;/sandbox/item/reset_login&#x60;, You can then use Plaid Link update mode to restore the Item to a good state. An &#x60;ITEM_LOGIN_REQUIRED&#x60; webhook will also be fired after a call to this endpoint, if one is associated with the Item.   In the Sandbox, Items will transition to an &#x60;ITEM_LOGIN_REQUIRED&#x60; error state automatically after 30 days, even if this endpoint is not called.
   * @param sandboxItemResetLoginRequest  (required)
   * @return Call&lt;SandboxItemResetLoginResponse&gt;
   * 
   * @see <a href="/api/sandbox/#sandboxitemreset_login">Force a Sandbox Item into an error state Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("sandbox/item/reset_login")
  Call<SandboxItemResetLoginResponse> sandboxItemResetLogin(
    @retrofit2.http.Body SandboxItemResetLoginRequest sandboxItemResetLoginRequest
  );

  /**
   * Set verification status for Sandbox account
   * The &#x60;/sandbox/item/set_verification_status&#x60; endpoint can be used to change the verification status of an Item in in the Sandbox in order to simulate the Automated Micro-deposit flow.  Note that not all Plaid developer accounts are enabled for micro-deposit based verification by default. Your account must be enabled for this feature in order to test it in Sandbox. To enable this features or check your status, contact your account manager or [submit a product access Support ticket](https://dashboard.plaid.com/support/new/product-and-development/product-troubleshooting/request-product-access).  For more information on testing Automated Micro-deposits in Sandbox, see [Auth full coverage testing](https://plaid.com/docs/auth/coverage/testing#).
   * @param sandboxItemSetVerificationStatusRequest  (required)
   * @return Call&lt;SandboxItemSetVerificationStatusResponse&gt;
   * 
   * @see <a href="/api/sandbox/#sandboxitemset_verification_status">Set verification status for Sandbox account Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("sandbox/item/set_verification_status")
  Call<SandboxItemSetVerificationStatusResponse> sandboxItemSetVerificationStatus(
    @retrofit2.http.Body SandboxItemSetVerificationStatusRequest sandboxItemSetVerificationStatusRequest
  );

  /**
   * Save the selected accounts when connecting to the Platypus Oauth institution
   * 
   * @param sandboxOauthSelectAccountsRequest  (required)
   * @return Call&lt;Object&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("sandbox/oauth/select_accounts")
  Call<Object> sandboxOauthSelectAccounts(
    @retrofit2.http.Body SandboxOauthSelectAccountsRequest sandboxOauthSelectAccountsRequest
  );

  /**
   * Create a test Item and processor token
   * Use the &#x60;/sandbox/processor_token/create&#x60; endpoint to create a valid &#x60;processor_token&#x60; for an arbitrary institution ID and test credentials. The created &#x60;processor_token&#x60; corresponds to a new Sandbox Item. You can then use this &#x60;processor_token&#x60; with the &#x60;/processor/&#x60; API endpoints in Sandbox. You can also use &#x60;/sandbox/processor_token/create&#x60; with the [&#x60;user_custom&#x60; test username](https://plaid.com/docs/sandbox/user-custom) to generate a test account with custom data.
   * @param sandboxProcessorTokenCreateRequest  (required)
   * @return Call&lt;SandboxProcessorTokenCreateResponse&gt;
   * 
   * @see <a href="/api/sandbox/#sandboxprocessor_tokencreate">Create a test Item and processor token Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("sandbox/processor_token/create")
  Call<SandboxProcessorTokenCreateResponse> sandboxProcessorTokenCreate(
    @retrofit2.http.Body SandboxProcessorTokenCreateRequest sandboxProcessorTokenCreateRequest
  );

  /**
   * Create a test Item
   * Use the &#x60;/sandbox/public_token/create&#x60;  endpoint to create a valid &#x60;public_token&#x60;  for an arbitrary institution ID, initial products, and test credentials. The created &#x60;public_token&#x60; maps to a new Sandbox Item. You can then call &#x60;/item/public_token/exchange&#x60; to exchange the &#x60;public_token&#x60; for an &#x60;access_token&#x60; and perform all API actions. &#x60;/sandbox/public_token/create&#x60; can also be used with the [&#x60;user_custom&#x60; test username](https://plaid.com/docs/sandbox/user-custom) to generate a test account with custom data.
   * @param sandboxPublicTokenCreateRequest  (required)
   * @return Call&lt;SandboxPublicTokenCreateResponse&gt;
   * 
   * @see <a href="/api/sandbox/#sandboxpublic_tokencreate">Create a test Item Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("sandbox/public_token/create")
  Call<SandboxPublicTokenCreateResponse> sandboxPublicTokenCreate(
    @retrofit2.http.Body SandboxPublicTokenCreateRequest sandboxPublicTokenCreateRequest
  );

  /**
   * Report whether you initiated an ACH transaction
   * After calling &#x60;/signal/evaluate&#x60;, call &#x60;/signal/decision/report&#x60; to report whether the transaction was initiated. This endpoint will return an &#x60;INVALID_REQUEST&#x60; error if called a second time with a different value for &#x60;initiated&#x60;.
   * @param signalDecisionReportRequest  (required)
   * @return Call&lt;SignalDecisionReportResponse&gt;
   * 
   * @see <a href="/signal/reference#signaldecisionreport">Report whether you initiated an ACH transaction Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("signal/decision/report")
  Call<SignalDecisionReportResponse> signalDecisionReport(
    @retrofit2.http.Body SignalDecisionReportRequest signalDecisionReportRequest
  );

  /**
   * Evaluate a planned ACH transaction
   * Use &#x60;/signal/evaluate&#x60; to evaluate a planned ACH transaction to get a return risk assessment (such as a risk score and risk tier) and additional risk signals.  In order to obtain a valid score for an ACH transaction, Plaid must have an access token for the account, and the Item must be healthy (receiving product updates) or have recently been in a healthy state. If the transaction does not meet eligibility requirements, an error will be returned corresponding to the underlying cause.
   * @param signalEvaluateRequest  (required)
   * @return Call&lt;SignalEvaluateResponse&gt;
   * 
   * @see <a href="/signal/reference#signalevaluate">Evaluate a planned ACH transaction Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("signal/evaluate")
  Call<SignalEvaluateResponse> signalEvaluate(
    @retrofit2.http.Body SignalEvaluateRequest signalEvaluateRequest
  );

  /**
   * Report a return for an ACH transaction
   * Call the &#x60;/signal/return/report&#x60; endpoint to report a returned transaction that was previously sent to the &#x60;/signal/evaluate&#x60; endpoint. Your feedback will be used by the model to incorporate the latest risk trend in your portfolio.
   * @param signalReturnReportRequest  (required)
   * @return Call&lt;SignalReturnReportResponse&gt;
   * 
   * @see <a href="/signal/reference#signalreturnreport">Report a return for an ACH transaction Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("signal/return/report")
  Call<SignalReturnReportResponse> signalReturnReport(
    @retrofit2.http.Body SignalReturnReportRequest signalReturnReportRequest
  );

  /**
   * Get transaction data
   * The &#x60;/transactions/get&#x60; endpoint allows developers to receive user-authorized transaction data for credit, depository, and some loan-type accounts (only those with account subtype &#x60;student&#x60;; coverage may be limited). For transaction history from investments accounts, use the [Investments endpoint](https://plaid.com/docs/api/products#investments) instead. Transaction data is standardized across financial institutions, and in many cases transactions are linked to a clean name, entity type, location, and category. Similarly, account data is standardized and returned with a clean name, number, balance, and other meta information where available.  Transactions are returned in reverse-chronological order, and the sequence of transaction ordering is stable and will not shift.  Transactions are not immutable and can also be removed altogether by the institution; a removed transaction will no longer appear in &#x60;/transactions/get&#x60;.  For more details, see [Pending and posted transactions](https://plaid.com/docs/transactions/transactions-data/#pending-and-posted-transactions).  Due to the potentially large number of transactions associated with an Item, results are paginated. Manipulate the &#x60;count&#x60; and &#x60;offset&#x60; parameters in conjunction with the &#x60;total_transactions&#x60; response body field to fetch all available transactions.  Data returned by &#x60;/transactions/get&#x60; will be the data available for the Item as of the most recent successful check for new transactions. Plaid typically checks for new data multiple times a day, but these checks may occur less frequently, such as once a day, depending on the institution. An Item&#39;s &#x60;status.transactions.last_successful_update&#x60; field will show the timestamp of the most recent successful update. To force Plaid to check for new transactions, you can use the &#x60;/transactions/refresh&#x60; endpoint.  Note that data may not be immediately available to &#x60;/transactions/get&#x60;. Plaid will begin to prepare transactions data upon Item link, if Link was initialized with &#x60;transactions&#x60;, or upon the first call to &#x60;/transactions/get&#x60;, if it wasn&#39;t. To be alerted when transaction data is ready to be fetched, listen for the [&#x60;INITIAL_UPDATE&#x60;](https://plaid.com/docs/api/webhooks#transactions-initial_update) and [&#x60;HISTORICAL_UPDATE&#x60;](https://plaid.com/docs/api/webhooks#transactions-historical_update) webhooks. If no transaction history is ready when &#x60;/transactions/get&#x60; is called, it will return a &#x60;PRODUCT_NOT_READY&#x60; error.
   * @param transactionsGetRequest  (required)
   * @return Call&lt;TransactionsGetResponse&gt;
   * 
   * @see <a href="/api/products/#transactionsget">Get transaction data Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("transactions/get")
  Call<TransactionsGetResponse> transactionsGet(
    @retrofit2.http.Body TransactionsGetRequest transactionsGetRequest
  );

  /**
   * Refresh transaction data
   * &#x60;/transactions/refresh&#x60; is an optional endpoint for users of the Transactions product. It initiates an on-demand extraction to fetch the newest transactions for an Item. This on-demand extraction takes place in addition to the periodic extractions that automatically occur multiple times a day for any Transactions-enabled Item. If changes to transactions are discovered after calling &#x60;/transactions/refresh&#x60;, Plaid will fire a webhook: [&#x60;TRANSACTIONS_REMOVED&#x60;](https://plaid.com/docs/api/webhooks#deleted-transactions-detected) will be fired if any removed transactions are detected, and [&#x60;DEFAULT_UPDATE&#x60;](https://plaid.com/docs/api/webhooks#transactions-default_update) will be fired if any new transactions are detected. New transactions can be fetched by calling &#x60;/transactions/get&#x60;.  Access to &#x60;/transactions/refresh&#x60; in Production is specific to certain pricing plans. If you cannot access &#x60;/transactions/refresh&#x60; in Production, [contact Sales](https://www.plaid.com/contact) for assistance.
   * @param transactionsRefreshRequest  (required)
   * @return Call&lt;TransactionsRefreshResponse&gt;
   * 
   * @see <a href="/api/products/#transactionsrefresh">Refresh transaction data Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("transactions/refresh")
  Call<TransactionsRefreshResponse> transactionsRefresh(
    @retrofit2.http.Body TransactionsRefreshRequest transactionsRefreshRequest
  );

  /**
   * Get webhook verification key
   * Plaid signs all outgoing webhooks and provides JSON Web Tokens (JWTs) so that you can verify the authenticity of any incoming webhooks to your application. A message signature is included in the &#x60;Plaid-Verification&#x60; header.  The &#x60;/webhook_verification_key/get&#x60; endpoint provides a JSON Web Key (JWK) that can be used to verify a JWT.
   * @param webhookVerificationKeyGetRequest  (required)
   * @return Call&lt;WebhookVerificationKeyGetResponse&gt;
   * 
   * @see <a href="/api/webhooks/webhook-verification/#webhook_verification_keyget">Get webhook verification key Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("webhook_verification_key/get")
  Call<WebhookVerificationKeyGetResponse> webhookVerificationKeyGet(
    @retrofit2.http.Body WebhookVerificationKeyGetRequest webhookVerificationKeyGetRequest
  );

}
