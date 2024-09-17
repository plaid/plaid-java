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
import com.plaid.client.model.AssetReportFreddieGetRequest;
import com.plaid.client.model.AssetReportFreddieGetResponse;
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
import com.plaid.client.model.BankTransferSweepGetRequest;
import com.plaid.client.model.BankTransferSweepGetResponse;
import com.plaid.client.model.BankTransferSweepListRequest;
import com.plaid.client.model.BankTransferSweepListResponse;
import com.plaid.client.model.BeaconAccountRiskEvaluateRequest;
import com.plaid.client.model.BeaconAccountRiskEvaluateResponse;
import com.plaid.client.model.BeaconDuplicateGetRequest;
import com.plaid.client.model.BeaconDuplicateGetResponse;
import com.plaid.client.model.BeaconReportCreateRequest;
import com.plaid.client.model.BeaconReportCreateResponse;
import com.plaid.client.model.BeaconReportGetRequest;
import com.plaid.client.model.BeaconReportGetResponse;
import com.plaid.client.model.BeaconReportListRequest;
import com.plaid.client.model.BeaconReportListResponse;
import com.plaid.client.model.BeaconReportSyndicationGetRequest;
import com.plaid.client.model.BeaconReportSyndicationGetResponse;
import com.plaid.client.model.BeaconReportSyndicationListRequest;
import com.plaid.client.model.BeaconReportSyndicationListResponse;
import com.plaid.client.model.BeaconUserAccountInsightsGetRequest;
import com.plaid.client.model.BeaconUserAccountInsightsGetResponse;
import com.plaid.client.model.BeaconUserCreateRequest;
import com.plaid.client.model.BeaconUserCreateResponse;
import com.plaid.client.model.BeaconUserGetRequest;
import com.plaid.client.model.BeaconUserGetResponse;
import com.plaid.client.model.BeaconUserHistoryListRequest;
import com.plaid.client.model.BeaconUserHistoryListResponse;
import com.plaid.client.model.BeaconUserReviewRequest;
import com.plaid.client.model.BeaconUserUpdateRequest;
import com.plaid.client.model.BeaconUserUpdateResponse;
import com.plaid.client.model.CRALoansRegisterRequest;
import com.plaid.client.model.CategoriesGetResponse;
import com.plaid.client.model.ConsentEventsGetRequest;
import com.plaid.client.model.ConsentEventsGetResponse;
import com.plaid.client.model.ConsumerReportPDFGetRequest;
import com.plaid.client.model.CraBankIncomeCreateRequest;
import com.plaid.client.model.CraBankIncomeCreateResponse;
import com.plaid.client.model.CraBankIncomeGetRequest;
import com.plaid.client.model.CraBankIncomeGetResponse;
import com.plaid.client.model.CraBaseReportCreateRequest;
import com.plaid.client.model.CraBaseReportCreateResponse;
import com.plaid.client.model.CraBaseReportGetRequest;
import com.plaid.client.model.CraBaseReportGetResponse;
import com.plaid.client.model.CraCheckReportBaseReportGetRequest;
import com.plaid.client.model.CraCheckReportBaseReportGetResponse;
import com.plaid.client.model.CraCheckReportCreateRequest;
import com.plaid.client.model.CraCheckReportCreateResponse;
import com.plaid.client.model.CraCheckReportIncomeInsightsGetRequest;
import com.plaid.client.model.CraCheckReportIncomeInsightsGetResponse;
import com.plaid.client.model.CraCheckReportNetworkInsightsGetRequest;
import com.plaid.client.model.CraCheckReportNetworkInsightsGetResponse;
import com.plaid.client.model.CraCheckReportPDFGetRequest;
import com.plaid.client.model.CraCheckReportPartnerInsightsGetRequest;
import com.plaid.client.model.CraCheckReportPartnerInsightsGetResponse;
import com.plaid.client.model.CraLoanUnregisterResponse;
import com.plaid.client.model.CraLoansApplicationsRegisterRequest;
import com.plaid.client.model.CraLoansApplicationsRegisterResponse;
import com.plaid.client.model.CraLoansRegisterResponse;
import com.plaid.client.model.CraLoansUnregisterRequest;
import com.plaid.client.model.CraLoansUpdateRequest;
import com.plaid.client.model.CraLoansUpdateResponse;
import com.plaid.client.model.CraMonitoringInsightsGetRequest;
import com.plaid.client.model.CraMonitoringInsightsGetResponse;
import com.plaid.client.model.CraMonitoringInsightsSubscribeRequest;
import com.plaid.client.model.CraMonitoringInsightsSubscribeResponse;
import com.plaid.client.model.CraMonitoringInsightsUnsubscribeRequest;
import com.plaid.client.model.CraMonitoringInsightsUnsubscribeResponse;
import com.plaid.client.model.CraPartnerInsightsGetRequest;
import com.plaid.client.model.CraPartnerInsightsGetResponse;
import com.plaid.client.model.CreditAuditCopyTokenCreateRequest;
import com.plaid.client.model.CreditAuditCopyTokenCreateResponse;
import com.plaid.client.model.CreditAuditCopyTokenRemoveRequest;
import com.plaid.client.model.CreditAuditCopyTokenRemoveResponse;
import com.plaid.client.model.CreditAuditCopyTokenUpdateRequest;
import com.plaid.client.model.CreditAuditCopyTokenUpdateResponse;
import com.plaid.client.model.CreditBankEmploymentGetRequest;
import com.plaid.client.model.CreditBankEmploymentGetResponse;
import com.plaid.client.model.CreditBankIncomeGetRequest;
import com.plaid.client.model.CreditBankIncomeGetResponse;
import com.plaid.client.model.CreditBankIncomePDFGetRequest;
import com.plaid.client.model.CreditBankIncomeRefreshRequest;
import com.plaid.client.model.CreditBankIncomeRefreshResponse;
import com.plaid.client.model.CreditBankIncomeWebhookUpdateRequest;
import com.plaid.client.model.CreditBankIncomeWebhookUpdateResponse;
import com.plaid.client.model.CreditBankStatementsUploadsGetRequest;
import com.plaid.client.model.CreditBankStatementsUploadsGetResponse;
import com.plaid.client.model.CreditEmploymentGetRequest;
import com.plaid.client.model.CreditEmploymentGetResponse;
import com.plaid.client.model.CreditFreddieMacReportsGetRequest;
import com.plaid.client.model.CreditFreddieMacReportsGetResponse;
import com.plaid.client.model.CreditPayrollIncomeGetRequest;
import com.plaid.client.model.CreditPayrollIncomeGetResponse;
import com.plaid.client.model.CreditPayrollIncomeParsingConfigUpdateRequest;
import com.plaid.client.model.CreditPayrollIncomeParsingConfigUpdateResponse;
import com.plaid.client.model.CreditPayrollIncomePrecheckRequest;
import com.plaid.client.model.CreditPayrollIncomePrecheckResponse;
import com.plaid.client.model.CreditPayrollIncomeRefreshRequest;
import com.plaid.client.model.CreditPayrollIncomeRefreshResponse;
import com.plaid.client.model.CreditPayrollIncomeRiskSignalsGetRequest;
import com.plaid.client.model.CreditPayrollIncomeRiskSignalsGetResponse;
import com.plaid.client.model.CreditRelayCreateRequest;
import com.plaid.client.model.CreditRelayCreateResponse;
import com.plaid.client.model.CreditRelayGetRequest;
import com.plaid.client.model.CreditRelayPDFGetRequest;
import com.plaid.client.model.CreditRelayRefreshRequest;
import com.plaid.client.model.CreditRelayRefreshResponse;
import com.plaid.client.model.CreditRelayRemoveRequest;
import com.plaid.client.model.CreditRelayRemoveResponse;
import com.plaid.client.model.CreditSessionsGetRequest;
import com.plaid.client.model.CreditSessionsGetResponse;
import com.plaid.client.model.DashboardUserGetRequest;
import com.plaid.client.model.DashboardUserGetResponse;
import com.plaid.client.model.DashboardUserListRequest;
import com.plaid.client.model.DashboardUserListResponse;
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
import com.plaid.client.model.EmploymentVerificationGetRequest;
import com.plaid.client.model.EmploymentVerificationGetResponse;
import com.plaid.client.model.FDXNotification;
import java.io.File;
import com.plaid.client.model.GetRecipientResponse;
import com.plaid.client.model.GetRecipientsResponse;
import com.plaid.client.model.IdentityDocumentsUploadsGetRequest;
import com.plaid.client.model.IdentityDocumentsUploadsGetResponse;
import com.plaid.client.model.IdentityGetRequest;
import com.plaid.client.model.IdentityGetResponse;
import com.plaid.client.model.IdentityMatchRequest;
import com.plaid.client.model.IdentityMatchResponse;
import com.plaid.client.model.IdentityRefreshRequest;
import com.plaid.client.model.IdentityRefreshResponse;
import com.plaid.client.model.IdentityVerificationAutofillCreateRequest;
import com.plaid.client.model.IdentityVerificationAutofillCreateResponse;
import com.plaid.client.model.IdentityVerificationCreateRequest;
import com.plaid.client.model.IdentityVerificationCreateResponse;
import com.plaid.client.model.IdentityVerificationGetRequest;
import com.plaid.client.model.IdentityVerificationGetResponse;
import com.plaid.client.model.IdentityVerificationListRequest;
import com.plaid.client.model.IdentityVerificationListResponse;
import com.plaid.client.model.IdentityVerificationRetryRequest;
import com.plaid.client.model.IdentityVerificationRetryResponse;
import com.plaid.client.model.IncomeVerificationCreateRequest;
import com.plaid.client.model.IncomeVerificationCreateResponse;
import com.plaid.client.model.IncomeVerificationDocumentsDownloadRequest;
import com.plaid.client.model.IncomeVerificationPaystubsGetRequest;
import com.plaid.client.model.IncomeVerificationPaystubsGetResponse;
import com.plaid.client.model.IncomeVerificationPrecheckRequest;
import com.plaid.client.model.IncomeVerificationPrecheckResponse;
import com.plaid.client.model.IncomeVerificationTaxformsGetRequest;
import com.plaid.client.model.IncomeVerificationTaxformsGetResponse;
import com.plaid.client.model.InstitutionsGetByIdRequest;
import com.plaid.client.model.InstitutionsGetByIdResponse;
import com.plaid.client.model.InstitutionsGetRequest;
import com.plaid.client.model.InstitutionsGetResponse;
import com.plaid.client.model.InstitutionsSearchRequest;
import com.plaid.client.model.InstitutionsSearchResponse;
import com.plaid.client.model.InvestmentsAuthGetRequest;
import com.plaid.client.model.InvestmentsAuthGetResponse;
import com.plaid.client.model.InvestmentsHoldingsGetRequest;
import com.plaid.client.model.InvestmentsHoldingsGetResponse;
import com.plaid.client.model.InvestmentsRefreshRequest;
import com.plaid.client.model.InvestmentsRefreshResponse;
import com.plaid.client.model.InvestmentsTransactionsGetRequest;
import com.plaid.client.model.InvestmentsTransactionsGetResponse;
import com.plaid.client.model.IssuesGetRequest;
import com.plaid.client.model.IssuesGetResponse;
import com.plaid.client.model.IssuesSearchRequest;
import com.plaid.client.model.IssuesSearchResponse;
import com.plaid.client.model.IssuesSubscribeRequest;
import com.plaid.client.model.IssuesSubscribeResponse;
import com.plaid.client.model.ItemAccessTokenInvalidateRequest;
import com.plaid.client.model.ItemAccessTokenInvalidateResponse;
import com.plaid.client.model.ItemActivityListRequest;
import com.plaid.client.model.ItemActivityListResponse;
import com.plaid.client.model.ItemApplicationListRequest;
import com.plaid.client.model.ItemApplicationListResponse;
import com.plaid.client.model.ItemApplicationScopesUpdateRequest;
import com.plaid.client.model.ItemApplicationScopesUpdateResponse;
import com.plaid.client.model.ItemApplicationUnlinkRequest;
import com.plaid.client.model.ItemApplicationUnlinkResponse;
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
import com.plaid.client.model.LinkDeliveryCreateRequest;
import com.plaid.client.model.LinkDeliveryCreateResponse;
import com.plaid.client.model.LinkDeliveryGetRequest;
import com.plaid.client.model.LinkDeliveryGetResponse;
import com.plaid.client.model.LinkOAuthCorrelationIdExchangeRequest;
import com.plaid.client.model.LinkOAuthCorrelationIdExchangeResponse;
import com.plaid.client.model.LinkProfileEligibilityCheckRequest;
import com.plaid.client.model.LinkProfileEligibilityCheckResponse;
import com.plaid.client.model.LinkTokenCreateRequest;
import com.plaid.client.model.LinkTokenCreateResponse;
import com.plaid.client.model.LinkTokenGetRequest;
import com.plaid.client.model.LinkTokenGetResponse;
import com.plaid.client.model.NetworkInsightsReportGetRequest;
import com.plaid.client.model.NetworkInsightsReportGetResponse;
import com.plaid.client.model.PartnerCustomerCreateRequest;
import com.plaid.client.model.PartnerCustomerCreateResponse;
import com.plaid.client.model.PartnerCustomerEnableRequest;
import com.plaid.client.model.PartnerCustomerEnableResponse;
import com.plaid.client.model.PartnerCustomerGetRequest;
import com.plaid.client.model.PartnerCustomerGetResponse;
import com.plaid.client.model.PartnerCustomerOAuthInstitutionsGetRequest;
import com.plaid.client.model.PartnerCustomerOAuthInstitutionsGetResponse;
import com.plaid.client.model.PartnerCustomerRemoveRequest;
import com.plaid.client.model.PartnerCustomerRemoveResponse;
import com.plaid.client.model.PaymentInitiationConsentCreateRequest;
import com.plaid.client.model.PaymentInitiationConsentCreateResponse;
import com.plaid.client.model.PaymentInitiationConsentGetRequest;
import com.plaid.client.model.PaymentInitiationConsentGetResponse;
import com.plaid.client.model.PaymentInitiationConsentPaymentExecuteRequest;
import com.plaid.client.model.PaymentInitiationConsentPaymentExecuteResponse;
import com.plaid.client.model.PaymentInitiationConsentRevokeRequest;
import com.plaid.client.model.PaymentInitiationConsentRevokeResponse;
import com.plaid.client.model.PaymentInitiationPaymentCreateRequest;
import com.plaid.client.model.PaymentInitiationPaymentCreateResponse;
import com.plaid.client.model.PaymentInitiationPaymentGetRequest;
import com.plaid.client.model.PaymentInitiationPaymentGetResponse;
import com.plaid.client.model.PaymentInitiationPaymentListRequest;
import com.plaid.client.model.PaymentInitiationPaymentListResponse;
import com.plaid.client.model.PaymentInitiationPaymentReverseRequest;
import com.plaid.client.model.PaymentInitiationPaymentReverseResponse;
import com.plaid.client.model.PaymentInitiationPaymentTokenCreateRequest;
import com.plaid.client.model.PaymentInitiationPaymentTokenCreateResponse;
import com.plaid.client.model.PaymentInitiationRecipientCreateRequest;
import com.plaid.client.model.PaymentInitiationRecipientCreateResponse;
import com.plaid.client.model.PaymentInitiationRecipientGetRequest;
import com.plaid.client.model.PaymentInitiationRecipientGetResponse;
import com.plaid.client.model.PaymentInitiationRecipientListRequest;
import com.plaid.client.model.PaymentInitiationRecipientListResponse;
import com.plaid.client.model.PaymentProfileCreateRequest;
import com.plaid.client.model.PaymentProfileCreateResponse;
import com.plaid.client.model.PaymentProfileGetRequest;
import com.plaid.client.model.PaymentProfileGetResponse;
import com.plaid.client.model.PaymentProfileRemoveRequest;
import com.plaid.client.model.PaymentProfileRemoveResponse;
import com.plaid.client.model.PlaidError;
import com.plaid.client.model.ProcessorAccountGetRequest;
import com.plaid.client.model.ProcessorAccountGetResponse;
import com.plaid.client.model.ProcessorApexProcessorTokenCreateRequest;
import com.plaid.client.model.ProcessorAuthGetRequest;
import com.plaid.client.model.ProcessorAuthGetResponse;
import com.plaid.client.model.ProcessorBalanceGetRequest;
import com.plaid.client.model.ProcessorBalanceGetResponse;
import com.plaid.client.model.ProcessorBankTransferCreateRequest;
import com.plaid.client.model.ProcessorBankTransferCreateResponse;
import com.plaid.client.model.ProcessorIdentityGetRequest;
import com.plaid.client.model.ProcessorIdentityGetResponse;
import com.plaid.client.model.ProcessorIdentityMatchRequest;
import com.plaid.client.model.ProcessorIdentityMatchResponse;
import com.plaid.client.model.ProcessorLiabilitiesGetRequest;
import com.plaid.client.model.ProcessorLiabilitiesGetResponse;
import com.plaid.client.model.ProcessorSignalDecisionReportRequest;
import com.plaid.client.model.ProcessorSignalDecisionReportResponse;
import com.plaid.client.model.ProcessorSignalEvaluateRequest;
import com.plaid.client.model.ProcessorSignalEvaluateResponse;
import com.plaid.client.model.ProcessorSignalPrepareRequest;
import com.plaid.client.model.ProcessorSignalPrepareResponse;
import com.plaid.client.model.ProcessorSignalReturnReportRequest;
import com.plaid.client.model.ProcessorSignalReturnReportResponse;
import com.plaid.client.model.ProcessorStripeBankAccountTokenCreateRequest;
import com.plaid.client.model.ProcessorStripeBankAccountTokenCreateResponse;
import com.plaid.client.model.ProcessorTokenCreateRequest;
import com.plaid.client.model.ProcessorTokenCreateResponse;
import com.plaid.client.model.ProcessorTokenPermissionsGetRequest;
import com.plaid.client.model.ProcessorTokenPermissionsGetResponse;
import com.plaid.client.model.ProcessorTokenPermissionsSetRequest;
import com.plaid.client.model.ProcessorTokenPermissionsSetResponse;
import com.plaid.client.model.ProcessorTokenWebhookUpdateRequest;
import com.plaid.client.model.ProcessorTokenWebhookUpdateResponse;
import com.plaid.client.model.ProcessorTransactionsGetRequest;
import com.plaid.client.model.ProcessorTransactionsGetResponse;
import com.plaid.client.model.ProcessorTransactionsRecurringGetRequest;
import com.plaid.client.model.ProcessorTransactionsRecurringGetResponse;
import com.plaid.client.model.ProcessorTransactionsRefreshRequest;
import com.plaid.client.model.ProcessorTransactionsRefreshResponse;
import com.plaid.client.model.ProcessorTransactionsSyncRequest;
import com.plaid.client.model.ProcessorTransactionsSyncResponse;
import com.plaid.client.model.ProfileGetRequest;
import com.plaid.client.model.ProfileGetResponse;
import com.plaid.client.model.ProfileNetworkStatusGetRequest;
import com.plaid.client.model.ProfileNetworkStatusGetResponse;
import com.plaid.client.model.SandboxBankIncomeFireWebhookRequest;
import com.plaid.client.model.SandboxBankIncomeFireWebhookResponse;
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
import com.plaid.client.model.SandboxPaymentProfileResetLoginRequest;
import com.plaid.client.model.SandboxPaymentProfileResetLoginResponse;
import com.plaid.client.model.SandboxProcessorTokenCreateRequest;
import com.plaid.client.model.SandboxProcessorTokenCreateResponse;
import com.plaid.client.model.SandboxPublicTokenCreateRequest;
import com.plaid.client.model.SandboxPublicTokenCreateResponse;
import com.plaid.client.model.SandboxTransferFireWebhookRequest;
import com.plaid.client.model.SandboxTransferFireWebhookResponse;
import com.plaid.client.model.SandboxTransferLedgerDepositSimulateRequest;
import com.plaid.client.model.SandboxTransferLedgerDepositSimulateResponse;
import com.plaid.client.model.SandboxTransferLedgerSimulateAvailableRequest;
import com.plaid.client.model.SandboxTransferLedgerSimulateAvailableResponse;
import com.plaid.client.model.SandboxTransferLedgerWithdrawSimulateRequest;
import com.plaid.client.model.SandboxTransferLedgerWithdrawSimulateResponse;
import com.plaid.client.model.SandboxTransferRefundSimulateRequest;
import com.plaid.client.model.SandboxTransferRefundSimulateResponse;
import com.plaid.client.model.SandboxTransferRepaymentSimulateRequest;
import com.plaid.client.model.SandboxTransferRepaymentSimulateResponse;
import com.plaid.client.model.SandboxTransferSimulateRequest;
import com.plaid.client.model.SandboxTransferSimulateResponse;
import com.plaid.client.model.SandboxTransferSweepSimulateRequest;
import com.plaid.client.model.SandboxTransferSweepSimulateResponse;
import com.plaid.client.model.SandboxTransferTestClockAdvanceRequest;
import com.plaid.client.model.SandboxTransferTestClockAdvanceResponse;
import com.plaid.client.model.SandboxTransferTestClockCreateRequest;
import com.plaid.client.model.SandboxTransferTestClockCreateResponse;
import com.plaid.client.model.SandboxTransferTestClockGetRequest;
import com.plaid.client.model.SandboxTransferTestClockGetResponse;
import com.plaid.client.model.SandboxTransferTestClockListRequest;
import com.plaid.client.model.SandboxTransferTestClockListResponse;
import com.plaid.client.model.SandboxUserResetLoginRequest;
import com.plaid.client.model.SandboxUserResetLoginResponse;
import com.plaid.client.model.SignalDecisionReportRequest;
import com.plaid.client.model.SignalDecisionReportResponse;
import com.plaid.client.model.SignalEvaluateRequest;
import com.plaid.client.model.SignalEvaluateResponse;
import com.plaid.client.model.SignalPrepareRequest;
import com.plaid.client.model.SignalPrepareResponse;
import com.plaid.client.model.SignalReturnReportRequest;
import com.plaid.client.model.SignalReturnReportResponse;
import com.plaid.client.model.StatementsDownloadRequest;
import com.plaid.client.model.StatementsListRequest;
import com.plaid.client.model.StatementsListResponse;
import com.plaid.client.model.StatementsRefreshRequest;
import com.plaid.client.model.StatementsRefreshResponse;
import com.plaid.client.model.TransactionsEnhanceGetRequest;
import com.plaid.client.model.TransactionsEnhanceGetResponse;
import com.plaid.client.model.TransactionsEnrichRequest;
import com.plaid.client.model.TransactionsEnrichResponse;
import com.plaid.client.model.TransactionsGetRequest;
import com.plaid.client.model.TransactionsGetResponse;
import com.plaid.client.model.TransactionsRecurringGetRequest;
import com.plaid.client.model.TransactionsRecurringGetResponse;
import com.plaid.client.model.TransactionsRefreshRequest;
import com.plaid.client.model.TransactionsRefreshResponse;
import com.plaid.client.model.TransactionsRulesCreateRequest;
import com.plaid.client.model.TransactionsRulesCreateResponse;
import com.plaid.client.model.TransactionsRulesListRequest;
import com.plaid.client.model.TransactionsRulesListResponse;
import com.plaid.client.model.TransactionsRulesRemoveRequest;
import com.plaid.client.model.TransactionsRulesRemoveResponse;
import com.plaid.client.model.TransactionsSyncRequest;
import com.plaid.client.model.TransactionsSyncResponse;
import com.plaid.client.model.TransactionsUserInsightsGetRequest;
import com.plaid.client.model.TransactionsUserInsightsGetResponse;
import com.plaid.client.model.TransferAuthorizationCancelRequest;
import com.plaid.client.model.TransferAuthorizationCancelResponse;
import com.plaid.client.model.TransferAuthorizationCreateRequest;
import com.plaid.client.model.TransferAuthorizationCreateResponse;
import com.plaid.client.model.TransferBalanceGetRequest;
import com.plaid.client.model.TransferBalanceGetResponse;
import com.plaid.client.model.TransferCancelRequest;
import com.plaid.client.model.TransferCancelResponse;
import com.plaid.client.model.TransferCapabilitiesGetRequest;
import com.plaid.client.model.TransferCapabilitiesGetResponse;
import com.plaid.client.model.TransferConfigurationGetRequest;
import com.plaid.client.model.TransferConfigurationGetResponse;
import com.plaid.client.model.TransferCreateRequest;
import com.plaid.client.model.TransferCreateResponse;
import com.plaid.client.model.TransferDiligenceDocumentUploadRequest;
import com.plaid.client.model.TransferDiligenceDocumentUploadResponse;
import com.plaid.client.model.TransferDiligenceSubmitRequest;
import com.plaid.client.model.TransferDiligenceSubmitResponse;
import com.plaid.client.model.TransferEventListRequest;
import com.plaid.client.model.TransferEventListResponse;
import com.plaid.client.model.TransferEventSyncRequest;
import com.plaid.client.model.TransferEventSyncResponse;
import com.plaid.client.model.TransferGetRequest;
import com.plaid.client.model.TransferGetResponse;
import com.plaid.client.model.TransferIntentCreateRequest;
import com.plaid.client.model.TransferIntentCreateResponse;
import com.plaid.client.model.TransferIntentGetRequest;
import com.plaid.client.model.TransferIntentGetResponse;
import com.plaid.client.model.TransferLedgerDepositRequest;
import com.plaid.client.model.TransferLedgerDepositResponse;
import com.plaid.client.model.TransferLedgerDistributeRequest;
import com.plaid.client.model.TransferLedgerDistributeResponse;
import com.plaid.client.model.TransferLedgerGetRequest;
import com.plaid.client.model.TransferLedgerGetResponse;
import com.plaid.client.model.TransferLedgerWithdrawRequest;
import com.plaid.client.model.TransferLedgerWithdrawResponse;
import com.plaid.client.model.TransferListRequest;
import com.plaid.client.model.TransferListResponse;
import com.plaid.client.model.TransferMetricsGetRequest;
import com.plaid.client.model.TransferMetricsGetResponse;
import com.plaid.client.model.TransferMigrateAccountRequest;
import com.plaid.client.model.TransferMigrateAccountResponse;
import com.plaid.client.model.TransferOriginatorCreateRequest;
import com.plaid.client.model.TransferOriginatorCreateResponse;
import com.plaid.client.model.TransferOriginatorFundingAccountUpdateRequest;
import com.plaid.client.model.TransferOriginatorFundingAccountUpdateResponse;
import com.plaid.client.model.TransferOriginatorGetRequest;
import com.plaid.client.model.TransferOriginatorGetResponse;
import com.plaid.client.model.TransferOriginatorListRequest;
import com.plaid.client.model.TransferOriginatorListResponse;
import com.plaid.client.model.TransferPlatformOriginatorCreateRequest;
import com.plaid.client.model.TransferPlatformOriginatorCreateResponse;
import com.plaid.client.model.TransferPlatformRequirementSubmitRequest;
import com.plaid.client.model.TransferPlatformRequirementSubmitResponse;
import com.plaid.client.model.TransferQuestionnaireCreateRequest;
import com.plaid.client.model.TransferQuestionnaireCreateResponse;
import com.plaid.client.model.TransferRecurringCancelRequest;
import com.plaid.client.model.TransferRecurringCancelResponse;
import com.plaid.client.model.TransferRecurringCreateRequest;
import com.plaid.client.model.TransferRecurringCreateResponse;
import com.plaid.client.model.TransferRecurringGetRequest;
import com.plaid.client.model.TransferRecurringGetResponse;
import com.plaid.client.model.TransferRecurringListRequest;
import com.plaid.client.model.TransferRecurringListResponse;
import com.plaid.client.model.TransferRefundCancelRequest;
import com.plaid.client.model.TransferRefundCancelResponse;
import com.plaid.client.model.TransferRefundCreateRequest;
import com.plaid.client.model.TransferRefundCreateResponse;
import com.plaid.client.model.TransferRefundGetRequest;
import com.plaid.client.model.TransferRefundGetResponse;
import com.plaid.client.model.TransferRepaymentListRequest;
import com.plaid.client.model.TransferRepaymentListResponse;
import com.plaid.client.model.TransferRepaymentReturnListRequest;
import com.plaid.client.model.TransferRepaymentReturnListResponse;
import com.plaid.client.model.TransferSweepGetRequest;
import com.plaid.client.model.TransferSweepGetResponse;
import com.plaid.client.model.TransferSweepListRequest;
import com.plaid.client.model.TransferSweepListResponse;
import com.plaid.client.model.UserAccountSessionGetRequest;
import com.plaid.client.model.UserAccountSessionGetResponse;
import com.plaid.client.model.UserCreateRequest;
import com.plaid.client.model.UserCreateResponse;
import com.plaid.client.model.UserItemsGetRequest;
import com.plaid.client.model.UserItemsGetResponse;
import com.plaid.client.model.UserRemoveRequest;
import com.plaid.client.model.UserRemoveResponse;
import com.plaid.client.model.UserUpdateRequest;
import com.plaid.client.model.UserUpdateResponse;
import com.plaid.client.model.WalletCreateRequest;
import com.plaid.client.model.WalletCreateResponse;
import com.plaid.client.model.WalletGetRequest;
import com.plaid.client.model.WalletGetResponse;
import com.plaid.client.model.WalletListRequest;
import com.plaid.client.model.WalletListResponse;
import com.plaid.client.model.WalletTransactionExecuteRequest;
import com.plaid.client.model.WalletTransactionExecuteResponse;
import com.plaid.client.model.WalletTransactionGetRequest;
import com.plaid.client.model.WalletTransactionGetResponse;
import com.plaid.client.model.WalletTransactionListRequest;
import com.plaid.client.model.WalletTransactionListResponse;
import com.plaid.client.model.WatchlistScreeningEntityCreateRequest;
import com.plaid.client.model.WatchlistScreeningEntityCreateResponse;
import com.plaid.client.model.WatchlistScreeningEntityGetRequest;
import com.plaid.client.model.WatchlistScreeningEntityGetResponse;
import com.plaid.client.model.WatchlistScreeningEntityHistoryListRequest;
import com.plaid.client.model.WatchlistScreeningEntityHistoryListResponse;
import com.plaid.client.model.WatchlistScreeningEntityHitListRequest;
import com.plaid.client.model.WatchlistScreeningEntityHitListResponse;
import com.plaid.client.model.WatchlistScreeningEntityListRequest;
import com.plaid.client.model.WatchlistScreeningEntityListResponse;
import com.plaid.client.model.WatchlistScreeningEntityProgramGetRequest;
import com.plaid.client.model.WatchlistScreeningEntityProgramGetResponse;
import com.plaid.client.model.WatchlistScreeningEntityProgramListRequest;
import com.plaid.client.model.WatchlistScreeningEntityProgramListResponse;
import com.plaid.client.model.WatchlistScreeningEntityReviewCreateRequest;
import com.plaid.client.model.WatchlistScreeningEntityReviewCreateResponse;
import com.plaid.client.model.WatchlistScreeningEntityReviewListRequest;
import com.plaid.client.model.WatchlistScreeningEntityReviewListResponse;
import com.plaid.client.model.WatchlistScreeningEntityUpdateRequest;
import com.plaid.client.model.WatchlistScreeningEntityUpdateResponse;
import com.plaid.client.model.WatchlistScreeningIndividualCreateRequest;
import com.plaid.client.model.WatchlistScreeningIndividualCreateResponse;
import com.plaid.client.model.WatchlistScreeningIndividualGetRequest;
import com.plaid.client.model.WatchlistScreeningIndividualGetResponse;
import com.plaid.client.model.WatchlistScreeningIndividualHistoryListRequest;
import com.plaid.client.model.WatchlistScreeningIndividualHistoryListResponse;
import com.plaid.client.model.WatchlistScreeningIndividualHitListRequest;
import com.plaid.client.model.WatchlistScreeningIndividualHitListResponse;
import com.plaid.client.model.WatchlistScreeningIndividualListRequest;
import com.plaid.client.model.WatchlistScreeningIndividualListResponse;
import com.plaid.client.model.WatchlistScreeningIndividualProgramGetRequest;
import com.plaid.client.model.WatchlistScreeningIndividualProgramGetResponse;
import com.plaid.client.model.WatchlistScreeningIndividualProgramListRequest;
import com.plaid.client.model.WatchlistScreeningIndividualProgramListResponse;
import com.plaid.client.model.WatchlistScreeningIndividualReviewCreateRequest;
import com.plaid.client.model.WatchlistScreeningIndividualReviewCreateResponse;
import com.plaid.client.model.WatchlistScreeningIndividualReviewListRequest;
import com.plaid.client.model.WatchlistScreeningIndividualReviewListResponse;
import com.plaid.client.model.WatchlistScreeningIndividualUpdateRequest;
import com.plaid.client.model.WatchlistScreeningIndividualUpdateResponse;
import com.plaid.client.model.WebhookVerificationKeyGetRequest;
import com.plaid.client.model.WebhookVerificationKeyGetResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface PlaidApi {
  /**
   * Retrieve real-time balance data
   * The &#x60;/accounts/balance/get&#x60; endpoint returns the real-time balance for each of an Item&#39;s accounts. While other endpoints, such as &#x60;/accounts/get&#x60;, return a balance object, only &#x60;/accounts/balance/get&#x60; forces the available and current balance fields to be refreshed rather than cached. This endpoint can be used for existing Items that were added via any of Plaid’s other products. This endpoint can be used as long as Link has been initialized with any other product, &#x60;balance&#x60; itself is not a product that can be used to initialize Link. As this endpoint triggers a synchronous request for fresh data, latency may be higher than for other Plaid endpoints (typically less than 10 seconds, but occasionally up to 30 seconds or more); if you encounter errors, you may find it necessary to adjust your timeout period when making requests.
   * @param accountsBalanceGetRequest  (required)
   * @return Call&lt;AccountsGetResponse&gt;
   * 
   * @see <a href="/api/products/balance/#accountsbalanceget">Retrieve real-time balance data Documentation</a>
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
   * The &#x60;/accounts/get&#x60; endpoint can be used to retrieve a list of accounts associated with any linked Item. Plaid will only return active bank accounts — that is, accounts that are not closed and are capable of carrying a balance. For items that went through the updated account selection pane, this endpoint only returns accounts that were permissioned by the user when they initially created the Item. If a user creates a new account after the initial link, you can capture this event through the [&#x60;NEW_ACCOUNTS_AVAILABLE&#x60;](https://plaid.com/docs/api/items/#new_accounts_available) webhook and then use Link&#39;s [update mode](https://plaid.com/docs/link/update-mode/) to request that the user share this new account with you.  &#x60;/accounts/get&#x60; is free to use and retrieves cached information, rather than extracting fresh information from the institution. The balance returned will reflect the balance at the time of the last successful Item update. If the Item is enabled for a regularly updating product, such as Transactions, Investments, or Liabilities, the balance will typically update about once a day, as long as the Item is healthy. If the Item is enabled only for products that do not frequently update, such as Auth or Identity, balance data may be much older.  For realtime balance information, use the paid endpoint &#x60;/accounts/balance/get&#x60; instead.
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
   * @see <a href="/api/products/assets/#asset_reportaudit_copycreate">Create Asset Report Audit Copy Documentation</a>
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
   * @see <a href="/api/products/assets/#asset_reportaudit_copyremove">Remove Asset Report Audit Copy Documentation</a>
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
   * The &#x60;/asset_report/create&#x60; endpoint initiates the process of creating an Asset Report, which can then be retrieved by passing the &#x60;asset_report_token&#x60; return value to the &#x60;/asset_report/get&#x60; or &#x60;/asset_report/pdf/get&#x60; endpoints.  The Asset Report takes some time to be created and is not available immediately after calling &#x60;/asset_report/create&#x60;. The exact amount of time to create the report will vary depending on how many days of history are requested and will typically range from a few seconds to about one minute. When the Asset Report is ready to be retrieved using &#x60;/asset_report/get&#x60; or &#x60;/asset_report/pdf/get&#x60;, Plaid will fire a &#x60;PRODUCT_READY&#x60; webhook. For full details of the webhook schema, see [Asset Report webhooks](https://plaid.com/docs/api/products/assets/#webhooks).  The &#x60;/asset_report/create&#x60; endpoint creates an Asset Report at a moment in time. Asset Reports are immutable. To get an updated Asset Report, use the &#x60;/asset_report/refresh&#x60; endpoint.
   * @param assetReportCreateRequest  (required)
   * @return Call&lt;AssetReportCreateResponse&gt;
   * 
   * @see <a href="/api/products/assets/#asset_reportcreate">Create an Asset Report Documentation</a>
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
   * By default, an Asset Report will contain all of the accounts on a given Item. In some cases, you may not want the Asset Report to contain all accounts. For example, you might have the end user choose which accounts are relevant in Link using the Account Select view, which you can enable in the dashboard. Or, you might always exclude certain account types or subtypes, which you can identify by using the &#x60;/accounts/get&#x60; endpoint. To narrow an Asset Report to only a subset of accounts, use the &#x60;/asset_report/filter&#x60; endpoint.  To exclude certain Accounts from an Asset Report, first use the &#x60;/asset_report/create&#x60; endpoint to create the report, then send the &#x60;asset_report_token&#x60; along with a list of &#x60;account_ids&#x60; to exclude to the &#x60;/asset_report/filter&#x60; endpoint, to create a new Asset Report which contains only a subset of the original Asset Report&#39;s data.  Because Asset Reports are immutable, calling &#x60;/asset_report/filter&#x60; does not alter the original Asset Report in any way; rather, &#x60;/asset_report/filter&#x60; creates a new Asset Report with a new token and id. Asset Reports created via &#x60;/asset_report/filter&#x60; do not contain new Asset data, and are not billed.  Plaid will fire a [&#x60;PRODUCT_READY&#x60;](https://plaid.com/docs/api/products/assets/#product_ready) webhook once generation of the filtered Asset Report has completed.
   * @param assetReportFilterRequest  (required)
   * @return Call&lt;AssetReportFilterResponse&gt;
   * 
   * @see <a href="/api/products/assets/#asset_reportfilter">Filter Asset Report Documentation</a>
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
   * The &#x60;/asset_report/get&#x60; endpoint retrieves the Asset Report in JSON format. Before calling &#x60;/asset_report/get&#x60;, you must first create the Asset Report using &#x60;/asset_report/create&#x60; (or filter an Asset Report using &#x60;/asset_report/filter&#x60;) and then wait for the [&#x60;PRODUCT_READY&#x60;](https://plaid.com/docs/api/products/assets/#product_ready) webhook to fire, indicating that the Report is ready to be retrieved.  By default, an Asset Report includes transaction descriptions as returned by the bank, as opposed to parsed and categorized by Plaid. You can also receive cleaned and categorized transactions, as well as additional insights like merchant name or location information. We call this an Asset Report with Insights. An Asset Report with Insights provides transaction category, location, and merchant information in addition to the transaction strings provided in a standard Asset Report. To retrieve an Asset Report with Insights, call &#x60;/asset_report/get&#x60; endpoint with &#x60;include_insights&#x60; set to &#x60;true&#x60;.  For latency-sensitive applications, you can optionally call &#x60;/asset_report/create&#x60; with &#x60;options.add_ons&#x60; set to &#x60;[\&quot;fast_assets\&quot;]&#x60;. This will cause Plaid to create two versions of the Asset Report: one with only current and available balance and identity information, and then later on the complete Asset Report. You will receive separate webhooks for each version of the Asset Report.
   * @param assetReportGetRequest  (required)
   * @return Call&lt;AssetReportGetResponse&gt;
   * 
   * @see <a href="/api/products/assets/#asset_reportget">Retrieve an Asset Report Documentation</a>
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
   * The &#x60;/asset_report/pdf/get&#x60; endpoint retrieves the Asset Report in PDF format. Before calling &#x60;/asset_report/pdf/get&#x60;, you must first create the Asset Report using &#x60;/asset_report/create&#x60; (or filter an Asset Report using &#x60;/asset_report/filter&#x60;) and then wait for the [&#x60;PRODUCT_READY&#x60;](https://plaid.com/docs/api/products/assets/#product_ready) webhook to fire, indicating that the Report is ready to be retrieved.  The response to &#x60;/asset_report/pdf/get&#x60; is the PDF binary data. The &#x60;request_id&#x60;  is returned in the &#x60;Plaid-Request-ID&#x60; header.  [View a sample PDF Asset Report](https://plaid.com/documents/sample-asset-report.pdf).
   * @param assetReportPDFGetRequest  (required)
   * @return Call&lt;ResponseBody&gt;
   * 
   * @see <a href="/api/products/assets/#asset_reportpdfget">Retrieve a PDF Asset Report Documentation</a>
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
   * @see <a href="/api/products/assets/#asset_reportrefresh">Refresh an Asset Report Documentation</a>
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
   * The &#x60;/item/remove&#x60; endpoint allows you to invalidate an &#x60;access_token&#x60;, meaning you will not be able to create new Asset Reports with it. Removing an Item does not affect any Asset Reports or Audit Copies you have already created, which will remain accessible until you remove them specifically.  The &#x60;/asset_report/remove&#x60; endpoint allows you to remove access to an Asset Report. Removing an Asset Report invalidates its &#x60;asset_report_token&#x60;, meaning you will no longer be able to use it to access Report data or create new Audit Copies. Removing an Asset Report does not affect the underlying Items, but does invalidate any &#x60;audit_copy_tokens&#x60; associated with the Asset Report.
   * @param assetReportRemoveRequest  (required)
   * @return Call&lt;AssetReportRemoveResponse&gt;
   * 
   * @see <a href="/api/products/assets/#asset_reportremove">Delete an Asset Report Documentation</a>
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
   * The &#x60;/auth/get&#x60; endpoint returns the bank account and bank identification numbers (such as routing numbers, for US accounts) associated with an Item&#39;s checking and savings accounts, along with high-level account data and balances when available.  Versioning note: In API version 2017-03-08, the schema of the &#x60;numbers&#x60; object returned by this endpoint is substantially different. For details, see [Plaid API versioning](https://plaid.com/docs/api/versioning/#version-2018-05-22).
   * @param authGetRequest  (required)
   * @return Call&lt;AuthGetResponse&gt;
   * 
   * @see <a href="/api/products/auth/#authget">Retrieve auth data Documentation</a>
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
   * @see <a href="/bank-transfers/reference#bank_transferbalanceget">Get balance of your Bank Transfer account Documentation</a>
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
   * @see <a href="/bank-transfers/reference#bank_transfercancel">Cancel a bank transfer Documentation</a>
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
   * @see <a href="/bank-transfers/reference#bank_transfercreate">Create a bank transfer Documentation</a>
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
   * Use the &#x60;/bank_transfer/event/list&#x60; endpoint to get a list of Plaid-initiated ACH or bank transfer events based on specified filter criteria. When using Auth with micro-deposit verification enabled, this endpoint can be used to fetch status updates on ACH micro-deposits. For more details, see [micro-deposit events](https://plaid.com/docs/auth/coverage/microdeposit-events/).
   * @param bankTransferEventListRequest  (required)
   * @return Call&lt;BankTransferEventListResponse&gt;
   * 
   * @see <a href="/api/products/auth#bank_transfereventlist">List bank transfer events Documentation</a>
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
   * &#x60;/bank_transfer/event/sync&#x60; allows you to request up to the next 25 Plaid-initiated bank transfer events that happened after a specific &#x60;event_id&#x60;. When using Auth with micro-deposit verification enabled, this endpoint can be used to fetch status updates on ACH micro-deposits. For more details, see [micro-deposit events](https://www.plaid.com/docs/auth/coverage/microdeposit-events/).
   * @param bankTransferEventSyncRequest  (required)
   * @return Call&lt;BankTransferEventSyncResponse&gt;
   * 
   * @see <a href="/api/products/auth/#bank_transfereventsync">Sync bank transfer events Documentation</a>
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
   * @see <a href="/bank-transfers/reference#bank_transferget">Retrieve a bank transfer Documentation</a>
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
   * @see <a href="/bank-transfers/reference#bank_transferlist">List bank transfers Documentation</a>
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
   * @see <a href="/bank-transfers/reference#bank_transfermigrate_account">Migrate account into Bank Transfers Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("bank_transfer/migrate_account")
  Call<BankTransferMigrateAccountResponse> bankTransferMigrateAccount(
    @retrofit2.http.Body BankTransferMigrateAccountRequest bankTransferMigrateAccountRequest
  );

  /**
   * Retrieve a sweep
   * The &#x60;/bank_transfer/sweep/get&#x60; endpoint fetches information about the sweep corresponding to the given &#x60;sweep_id&#x60;.
   * @param bankTransferSweepGetRequest  (required)
   * @return Call&lt;BankTransferSweepGetResponse&gt;
   * 
   * @see <a href="/api/products/transfer/#bank_transfersweepget">Retrieve a sweep Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("bank_transfer/sweep/get")
  Call<BankTransferSweepGetResponse> bankTransferSweepGet(
    @retrofit2.http.Body BankTransferSweepGetRequest bankTransferSweepGetRequest
  );

  /**
   * List sweeps
   * The &#x60;/bank_transfer/sweep/list&#x60; endpoint fetches information about the sweeps matching the given filters.
   * @param bankTransferSweepListRequest  (required)
   * @return Call&lt;BankTransferSweepListResponse&gt;
   * 
   * @see <a href="/api/products/transfer/#bank_transfersweeplist">List sweeps Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("bank_transfer/sweep/list")
  Call<BankTransferSweepListResponse> bankTransferSweepList(
    @retrofit2.http.Body BankTransferSweepListRequest bankTransferSweepListRequest
  );

  /**
   * Evaluate risk of a bank account
   * Use &#x60;/beacon/account_risk/v1/evaluate&#x60; to get risk insights for a linked account.
   * @param beaconAccountRiskEvaluateRequest  (required)
   * @return Call&lt;BeaconAccountRiskEvaluateResponse&gt;
   * 
   * @see <a href="none">Evaluate risk of a bank account Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("beacon/account_risk/v1/evaluate")
  Call<BeaconAccountRiskEvaluateResponse> beaconAccountRiskEvaluate(
    @retrofit2.http.Body BeaconAccountRiskEvaluateRequest beaconAccountRiskEvaluateRequest
  );

  /**
   * Get a Beacon Duplicate
   * Returns a Beacon Duplicate for a given Beacon Duplicate id.  A Beacon Duplicate represents a pair of similar Beacon Users within your organization.  Two Beacon User revisions are returned for each Duplicate record in either the &#x60;beacon_user1&#x60; or &#x60;beacon_user2&#x60; response fields.  The &#x60;analysis&#x60; field in the response indicates which fields matched between &#x60;beacon_user1&#x60; and &#x60;beacon_user2&#x60;. 
   * @param beaconDuplicateGetRequest  (required)
   * @return Call&lt;BeaconDuplicateGetResponse&gt;
   * 
   * @see <a href="/api/products/beacon/#beaconduplicateget">Get a Beacon Duplicate Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("beacon/duplicate/get")
  Call<BeaconDuplicateGetResponse> beaconDuplicateGet(
    @retrofit2.http.Body BeaconDuplicateGetRequest beaconDuplicateGetRequest
  );

  /**
   * Create a Beacon Report
   * Create a fraud report for a given Beacon User.
   * @param beaconReportCreateRequest  (required)
   * @return Call&lt;BeaconReportCreateResponse&gt;
   * 
   * @see <a href="/api/products/beacon/#beaconreportcreate">Create a Beacon Report Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("beacon/report/create")
  Call<BeaconReportCreateResponse> beaconReportCreate(
    @retrofit2.http.Body BeaconReportCreateRequest beaconReportCreateRequest
  );

  /**
   * Get a Beacon Report
   * Returns a Beacon report for a given Beacon report id.
   * @param beaconReportGetRequest  (required)
   * @return Call&lt;BeaconReportGetResponse&gt;
   * 
   * @see <a href="/api/products/beacon/#beaconreportget">Get a Beacon Report Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("beacon/report/get")
  Call<BeaconReportGetResponse> beaconReportGet(
    @retrofit2.http.Body BeaconReportGetRequest beaconReportGetRequest
  );

  /**
   * List Beacon Reports for a Beacon User
   * Use the &#x60;/beacon/report/list&#x60; endpoint to view all Beacon Reports you created for a specific Beacon User. The reports returned by this endpoint are exclusively reports you created for a specific user. A Beacon User can only have one active report at a time, but a new report can be created if a previous report has been deleted. The results from this endpoint are paginated; the &#x60;next_cursor&#x60; field will be populated if there is another page of results that can be retrieved. To fetch the next page, pass the &#x60;next_cursor&#x60; value as the &#x60;cursor&#x60; parameter in the next request.
   * @param beaconReportListRequest  (required)
   * @return Call&lt;BeaconReportListResponse&gt;
   * 
   * @see <a href="/api/products/beacon/#beaconreportlist">List Beacon Reports for a Beacon User Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("beacon/report/list")
  Call<BeaconReportListResponse> beaconReportList(
    @retrofit2.http.Body BeaconReportListRequest beaconReportListRequest
  );

  /**
   * Get a Beacon Report Syndication
   * Returns a Beacon Report Syndication for a given Beacon Report Syndication id.
   * @param beaconReportSyndicationGetRequest  (required)
   * @return Call&lt;BeaconReportSyndicationGetResponse&gt;
   * 
   * @see <a href="/api/products/beacon/#beaconreport_syndicationget">Get a Beacon Report Syndication Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("beacon/report_syndication/get")
  Call<BeaconReportSyndicationGetResponse> beaconReportSyndicationGet(
    @retrofit2.http.Body BeaconReportSyndicationGetRequest beaconReportSyndicationGetRequest
  );

  /**
   * List Beacon Report Syndications for a Beacon User
   * Use the &#x60;/beacon/report_syndication/list&#x60; endpoint to view all Beacon Reports that have been syndicated to a specific Beacon User. This endpoint returns Beacon Report Syndications which are references to Beacon Reports created either by you, or another Beacon customer, that matched the specified Beacon User. A Beacon User can have multiple active Beacon Report Syndications at once. The results from this endpoint are paginated; the &#x60;next_cursor&#x60; field will be populated if there is another page of results that can be retrieved. To fetch the next page, pass the &#x60;next_cursor&#x60; value as the &#x60;cursor&#x60; parameter in the next request.
   * @param beaconReportSyndicationListRequest  (required)
   * @return Call&lt;BeaconReportSyndicationListResponse&gt;
   * 
   * @see <a href="/api/products/beacon/#beaconreport_syndicationlist">List Beacon Report Syndications for a Beacon User Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("beacon/report_syndication/list")
  Call<BeaconReportSyndicationListResponse> beaconReportSyndicationList(
    @retrofit2.http.Body BeaconReportSyndicationListRequest beaconReportSyndicationListRequest
  );

  /**
   * Get Account Insights for a Beacon User
   * Get Account Insights for all Accounts linked to this Beacon User. The insights for each account are computed based on the information that was last retrieved from the financial institution.
   * @param beaconUserAccountInsightsGetRequest  (required)
   * @return Call&lt;BeaconUserAccountInsightsGetResponse&gt;
   * 
   * @see <a href="/api/products/beacon/#beaconuseraccount_insightsget">Get Account Insights for a Beacon User Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("beacon/user/account_insights/get")
  Call<BeaconUserAccountInsightsGetResponse> beaconUserAccountInsightsGet(
    @retrofit2.http.Body BeaconUserAccountInsightsGetRequest beaconUserAccountInsightsGetRequest
  );

  /**
   * Create a Beacon User
   * Create and scan a Beacon User against your Beacon Program, according to your program&#39;s settings.  When you submit a new user to &#x60;/beacon/user/create&#x60;, several checks are performed immediately:    - The user&#39;s PII (provided within the &#x60;user&#x60; object) is searched against all other users within the Beacon Program you specified. If a match is found that violates your program&#39;s \&quot;Duplicate Information Filtering\&quot; settings, the user will be returned with a status of &#x60;pending_review&#x60;.    - The user&#39;s PII is also searched against all fraud reports created by your organization across all of your Beacon Programs. If the user&#39;s data matches a fraud report that your team created, the user will be returned with a status of &#x60;rejected&#x60;.    - Finally, the user&#39;s PII is searched against all fraud report shared with the Beacon Network by other companies. If a matching fraud report is found, the user will be returned with a &#x60;pending_review&#x60; status if your program has enabled automatic flagging based on network fraud.
   * @param beaconUserCreateRequest  (required)
   * @return Call&lt;BeaconUserCreateResponse&gt;
   * 
   * @see <a href="/api/products/beacon/#beaconusercreate">Create a Beacon User Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("beacon/user/create")
  Call<BeaconUserCreateResponse> beaconUserCreate(
    @retrofit2.http.Body BeaconUserCreateRequest beaconUserCreateRequest
  );

  /**
   * Get a Beacon User
   * Fetch a Beacon User.  The Beacon User is returned with all of their associated information and a &#x60;status&#x60; based on the Beacon Network duplicate record and fraud checks. 
   * @param beaconUserGetRequest  (required)
   * @return Call&lt;BeaconUserGetResponse&gt;
   * 
   * @see <a href="/api/products/beacon/#beaconuserget">Get a Beacon User Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("beacon/user/get")
  Call<BeaconUserGetResponse> beaconUserGet(
    @retrofit2.http.Body BeaconUserGetRequest beaconUserGetRequest
  );

  /**
   * List a Beacon User&#39;s history
   * List all changes to the Beacon User in reverse-chronological order.
   * @param beaconUserHistoryListRequest  (required)
   * @return Call&lt;BeaconUserHistoryListResponse&gt;
   * 
   * @see <a href="/api/products/beacon/#beaconuserhistorylist">List a Beacon User&#39;s history Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("beacon/user/history/list")
  Call<BeaconUserHistoryListResponse> beaconUserHistoryList(
    @retrofit2.http.Body BeaconUserHistoryListRequest beaconUserHistoryListRequest
  );

  /**
   * Review a Beacon User
   * Update the status of a Beacon User.  When updating a Beacon User&#39;s status via this endpoint, Plaid validates that the status change is consistent with the related state for this Beacon User. Specifically, we will check:  1. Whether there are any associated Beacon Reports connected to the Beacon User, and 2. Whether there are any confirmed Beacon Report Syndications connected to the Beacon User.  When updating a Beacon User&#39;s status to \&quot;rejected\&quot;, we enforce that either a Beacon Report has been created for the Beacon User or a Beacon Report Syndication has been confirmed. When updating a Beacon User&#39;s status to \&quot;cleared\&quot;, we enforce that there are no active Beacon Reports or confirmed Beacon Report Syndications associated with the user. If you previously created a Beacon Report for this user, you must delete it before updating the Beacon User&#39;s status to \&quot;cleared\&quot;. There are no restrictions on updating a Beacon User&#39;s status to \&quot;pending_review\&quot;.  If these conditions are not met, the request will be rejected with an error explaining the issue.
   * @param beaconUserReviewRequest  (required)
   * @return Call&lt;BeaconUserGetResponse&gt;
   * 
   * @see <a href="/api/products/beacon/#beaconuserreview">Review a Beacon User Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("beacon/user/review")
  Call<BeaconUserGetResponse> beaconUserReview(
    @retrofit2.http.Body BeaconUserReviewRequest beaconUserReviewRequest
  );

  /**
   * Update the identity data of a Beacon User
   * Update the identity data for a Beacon User in your Beacon Program or add new accounts to the Beacon User.  Similar to &#x60;/beacon/user/create&#x60;, several checks are performed immediately when you submit an identity data change to &#x60;/beacon/user/update&#x60;:    - The user&#39;s updated PII is searched against all other users within the Beacon Program you specified. If a match is found that violates your program&#39;s \&quot;Duplicate Information Filtering\&quot; settings, the user will be returned with a status of &#x60;pending_review&#x60;.    - The user&#39;s updated PII is also searched against all fraud reports created by your organization across all of your Beacon Programs. If the user&#39;s data matches a fraud report that your team created, the user will be returned with a status of &#x60;rejected&#x60;.    - Finally, the user&#39;s PII is searched against all fraud report shared with the Beacon Network by other companies. If a matching fraud report is found, the user will be returned with a &#x60;pending_review&#x60; status if your program has enabled automatic flagging based on network fraud.  Plaid maintains a version history for each Beacon User, so the Beacon User&#39;s identity data before and after the update is retained as separate versions.
   * @param beaconUserUpdateRequest  (required)
   * @return Call&lt;BeaconUserUpdateResponse&gt;
   * 
   * @see <a href="/api/products/beacon/#beaconuserupdate">Update the identity data of a Beacon User Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("beacon/user/update")
  Call<BeaconUserUpdateResponse> beaconUserUpdate(
    @retrofit2.http.Body BeaconUserUpdateRequest beaconUserUpdateRequest
  );

  /**
   * Get categories
   * Send a request to the &#x60;/categories/get&#x60; endpoint to get detailed information on categories returned by Plaid. This endpoint does not require authentication.  All implementations are recommended to use the newer &#x60;personal_finance_category&#x60; taxonomy instead of the older &#x60;category&#x60; taxonomy supported by this endpoint. The [&#x60;personal_finance_category taxonomy&#x60; CSV file](https://plaid.com/documents/transactions-personal-finance-category-taxonomy.csv) is available for download and is not accessible via API.
   * @param body  (required)
   * @return Call&lt;CategoriesGetResponse&gt;
   * 
   * @see <a href="/api/products/transactions/#categoriesget">Get categories Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("categories/get")
  Call<CategoriesGetResponse> categoriesGet(
    @retrofit2.http.Body Object body
  );

  /**
   * List a historical log of item consent events
   * List a historical log of item consent events
   * @param consentEventsGetRequest  (required)
   * @return Call&lt;ConsentEventsGetResponse&gt;
   * 
   * @see <a href="/api/consent/#consenteventsget">List a historical log of item consent events Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("consent/events/get")
  Call<ConsentEventsGetResponse> consentEventsGet(
    @retrofit2.http.Body ConsentEventsGetRequest consentEventsGetRequest
  );

  /**
   * Retrieve a PDF Reports
   * Retrieves all existing CRB Bank Income and Base reports for the consumer in PDF format.  Response is PDF binary data. The &#x60;request_id&#x60; is returned in the &#x60;Plaid-Request-ID&#x60; header.
   * @param consumerReportPDFGetRequest  (required)
   * @return Call&lt;ResponseBody&gt;
   * 
   * @see <a href="/none/">Retrieve a PDF Reports Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("consumer_report/pdf/get")
  Call<ResponseBody> consumerReportPdfGet(
    @retrofit2.http.Body ConsumerReportPDFGetRequest consumerReportPDFGetRequest
  );

  /**
   * Create a CRA report for income verification
   * &#x60;/cra/bank_income/create&#x60; creates a CRA report for income verification
   * @param craBankIncomeCreateRequest  (required)
   * @return Call&lt;CraBankIncomeCreateResponse&gt;
   * 
   * @see <a href="/api/products/income/#crabank_incomecreate">Create a CRA report for income verification Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("cra/bank_income/create")
  Call<CraBankIncomeCreateResponse> craBankIncomeCreate(
    @retrofit2.http.Body CraBankIncomeCreateRequest craBankIncomeCreateRequest
  );

  /**
   * Retrieve information from the bank accounts used for income verification
   * &#x60;/cra/bank_income/get&#x60; returns the bank income report(s) for a specified user.
   * @param craBankIncomeGetRequest  (required)
   * @return Call&lt;CraBankIncomeGetResponse&gt;
   * 
   * @see <a href="/api/products/income/#crabank_incomeget">Retrieve information from the bank accounts used for income verification Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("cra/bank_income/get")
  Call<CraBankIncomeGetResponse> craBankIncomeGet(
    @retrofit2.http.Body CraBankIncomeGetRequest craBankIncomeGetRequest
  );

  /**
   * Create a Base Report
   * This endpoint allows the customer to create a Base Report by passing in a user token. The Base Report will be generated based on the most recently linked item from the user token.
   * @param craBaseReportCreateRequest  (required)
   * @return Call&lt;CraBaseReportCreateResponse&gt;
   * 
   * @see <a href="/none/">Create a Base Report Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("cra/base_report/create")
  Call<CraBaseReportCreateResponse> craBaseReportCreate(
    @retrofit2.http.Body CraBaseReportCreateRequest craBaseReportCreateRequest
  );

  /**
   * Retrieve a Base Report
   * This endpoint allows the customer to retrieve a Base Report. Customers should pass in the &#x60;user_token&#x60; created in &#x60;/user/create&#x60;.
   * @param craBaseReportGetRequest  (required)
   * @return Call&lt;CraBaseReportGetResponse&gt;
   * 
   * @see <a href="/none/">Retrieve a Base Report Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("cra/base_report/get")
  Call<CraBaseReportGetResponse> craBaseReportGet(
    @retrofit2.http.Body CraBaseReportGetRequest craBaseReportGetRequest
  );

  /**
   * Retrieve a Base Report
   * This endpoint allows you to retrieve the Base Report for your user, allowing you to receive comprehensive bank account and cash flow data. You should call this endpoint after you&#39;ve received a &#x60;CHECK_REPORT_READY&#x60; webhook, either after the Link session for the user or after calling &#x60;/cra/check_report/create&#x60;. If the most recent consumer report for the user doesn&#39;t have sufficient data to generate the base report, or the consumer report has expired, you will receive an error indicating that you should create a new consumer report by calling &#x60;/cra/check_report/create&#x60;.
   * @param craCheckReportBaseReportGetRequest  (required)
   * @return Call&lt;CraCheckReportBaseReportGetResponse&gt;
   * 
   * @see <a href="/check/api/#cracheck_reportbase_reportget">Retrieve a Base Report Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("cra/check_report/base_report/get")
  Call<CraCheckReportBaseReportGetResponse> craCheckReportBaseReportGet(
    @retrofit2.http.Body CraCheckReportBaseReportGetRequest craCheckReportBaseReportGetRequest
  );

  /**
   * Create a Consumer Report
   * &#x60;/cra/check_report/create&#x60; creates a Consumer Report powered by Plaid Check. You can call this endpoint to create a new report if &#x60;consumer_report_permissible_purpose&#x60; was omitted during Link token creation. If you did provide a &#x60;consumer_report_permissible_purpose&#x60; during Link token creation, then Plaid Check will automatically begin creating a Consumer Report once the user completes the Link process, and it is not necessary to call &#x60;/cra/check_report/create&#x60; before retrieving the report.   &#x60;/cra/check_report/create&#x60; can also be used to refresh data in an existing report. A Consumer Report will last for 24 hours before expiring; you should call any &#x60;/get&#x60; endpoints on the report before it expires. If a report expires, you can call &#x60;/cra/check_report/create&#x60; again to re-generate it. Note that refreshing or regenerating a report is a billable event.\&quot;
   * @param craCheckReportCreateRequest  (required)
   * @return Call&lt;CraCheckReportCreateResponse&gt;
   * 
   * @see <a href="/check/api/#cracheck_reportcreate">Create a Consumer Report Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("cra/check_report/create")
  Call<CraCheckReportCreateResponse> craCheckReportCreate(
    @retrofit2.http.Body CraCheckReportCreateRequest craCheckReportCreateRequest
  );

  /**
   * Retrieve cash flow information from your user&#39;s banks
   * This endpoint allows you to retrieve the Income Insights report for your user.  You should call this endpoint after you&#39;ve received a &#x60;CHECK_REPORT_READY&#x60; webhook, either after the Link session for the user or after calling &#x60;/cra/check_report/create&#x60;. If the most recent consumer report for the user doesn’t have sufficient data to generate the base report, or the consumer report has expired, you will receive an error indicating that you should create a new consumer report by calling &#x60;/cra/check_report/create&#x60;.
   * @param craCheckReportIncomeInsightsGetRequest  (required)
   * @return Call&lt;CraCheckReportIncomeInsightsGetResponse&gt;
   * 
   * @see <a href="/check/api/#cracheck_reportincome_insightsget">Retrieve cash flow information from your user&#39;s banks Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("cra/check_report/income_insights/get")
  Call<CraCheckReportIncomeInsightsGetResponse> craCheckReportIncomeInsightsGet(
    @retrofit2.http.Body CraCheckReportIncomeInsightsGetRequest craCheckReportIncomeInsightsGetRequest
  );

  /**
   * Retrieve network attributes for the user
   * This endpoint allows you to retrieve the Network Insights product for your user. You should call this endpoint after you&#39;ve received the &#x60;CHECK_REPORT_READY&#x60; webhook, either after the Link session for the user or after calling &#x60;/cra/check_report/create&#x60;. If the most recent consumer report for the user doesn’t have sufficient data to generate the report, or the consumer report has expired, you will receive an error indicating that you should create a new consumer report by calling &#x60;/cra/check_report/create&#x60;.  If you did not initialize Link with the &#x60;cra_network_attributes&#x60; product or have generated a report using &#x60;/cra/check_report/create&#x60;, we will generate the attributes when you call this endpoint.
   * @param craCheckReportNetworkInsightsGetRequest  (required)
   * @return Call&lt;CraCheckReportNetworkInsightsGetResponse&gt;
   * 
   * @see <a href="/check/api/#cracheck_reportnetwork_insightsget">Retrieve network attributes for the user Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("cra/check_report/network_insights/get")
  Call<CraCheckReportNetworkInsightsGetResponse> craCheckReportNetworkInsightsGet(
    @retrofit2.http.Body CraCheckReportNetworkInsightsGetRequest craCheckReportNetworkInsightsGetRequest
  );

  /**
   * Retrieve cash flow insights from partners
   * This endpoint allows you to retrieve the Partner Insights report for your user. You should call this endpoint after you&#39;ve received the &#x60;CHECK_REPORT_READY&#x60; webhook, either after the Link session for the user or after calling &#x60;/cra/check_report/create&#x60;. If the most recent consumer report for the user doesn’t have sufficient data to generate the base report, or the consumer report has expired, you will receive an error indicating that you should create a new consumer report by calling &#x60;/cra/check_report/create&#x60;.  If you did not initialize Link with the &#x60;credit_partner_insights&#x60; product or have generated a report using &#x60;/cra/check_report/create&#x60;, we will call our partners to generate the insights when you call this endpoint. In this case, you may optionally provide parameters under &#x60;options&#x60; to configure which insights you want to receive.
   * @param craCheckReportPartnerInsightsGetRequest  (required)
   * @return Call&lt;CraCheckReportPartnerInsightsGetResponse&gt;
   * 
   * @see <a href="/check/api/#cracheck_reportpartner_insightsget">Retrieve cash flow insights from partners Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("cra/check_report/partner_insights/get")
  Call<CraCheckReportPartnerInsightsGetResponse> craCheckReportPartnerInsightsGet(
    @retrofit2.http.Body CraCheckReportPartnerInsightsGetRequest craCheckReportPartnerInsightsGetRequest
  );

  /**
   * Retrieve Consumer Reports as a PDF
   * &#x60;/cra/check_report/pdf/get&#x60; retrieves the most recent Consumer Report in PDF format. By default, the most recent Base Report (if it exists) for the user will be returned. To request that the most recent Income Insights report be included in the PDF as well, use the &#x60;add-ons&#x60; field.
   * @param craCheckReportPDFGetRequest  (required)
   * @return Call&lt;ResponseBody&gt;
   * 
   * @see <a href="/check/api/#cracheck_reportpdfget">Retrieve Consumer Reports as a PDF Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("cra/check_report/pdf/get")
  Call<ResponseBody> craCheckReportPdfGet(
    @retrofit2.http.Body CraCheckReportPDFGetRequest craCheckReportPDFGetRequest
  );

  /**
   * Register loan applications and decisions.
   * &#x60;/cra/loans/applications/register&#x60; registers loan applications and decisions.
   * @param craLoansApplicationsRegisterRequest  (required)
   * @return Call&lt;CraLoansApplicationsRegisterResponse&gt;
   * 
   * @see <a href="/none/">Register loan applications and decisions. Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("cra/loans/applications/register")
  Call<CraLoansApplicationsRegisterResponse> craLoansApplicationsRegister(
    @retrofit2.http.Body CraLoansApplicationsRegisterRequest craLoansApplicationsRegisterRequest
  );

  /**
   * Register a list of loans to their applicants.
   * &#x60;/cra/loans/register&#x60; registers a list of loans to their applicants.
   * @param crALoansRegisterRequest  (required)
   * @return Call&lt;CraLoansRegisterResponse&gt;
   * 
   * @see <a href="/none/">Register a list of loans to their applicants. Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("cra/loans/register")
  Call<CraLoansRegisterResponse> craLoansRegister(
    @retrofit2.http.Body CRALoansRegisterRequest crALoansRegisterRequest
  );

  /**
   * Unregister a list of loans.
   * &#x60;/cra/loans/unregister&#x60; indicates the loans have reached a final status and no further updates are expected.
   * @param craLoansUnregisterRequest  (required)
   * @return Call&lt;CraLoanUnregisterResponse&gt;
   * 
   * @see <a href="/none/">Unregister a list of loans. Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("cra/loans/unregister")
  Call<CraLoanUnregisterResponse> craLoansUnregister(
    @retrofit2.http.Body CraLoansUnregisterRequest craLoansUnregisterRequest
  );

  /**
   * Updates loan data.
   * &#x60;/cra/loans/update&#x60; updates loan information such as the status and payment history.
   * @param craLoansUpdateRequest  (required)
   * @return Call&lt;CraLoansUpdateResponse&gt;
   * 
   * @see <a href="/none/">Updates loan data. Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("cra/loans/update")
  Call<CraLoansUpdateResponse> craLoansUpdate(
    @retrofit2.http.Body CraLoansUpdateRequest craLoansUpdateRequest
  );

  /**
   * Retrieve a Monitoring Insights Report
   * This endpoint allows you to retrieve a Monitoring Insights report by passing in the &#x60;user_token&#x60; referred to in the webhook you received.
   * @param craMonitoringInsightsGetRequest  (required)
   * @return Call&lt;CraMonitoringInsightsGetResponse&gt;
   * 
   * @see <a href="/none/">Retrieve a Monitoring Insights Report Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("cra/monitoring_insights/get")
  Call<CraMonitoringInsightsGetResponse> craMonitoringInsightsGet(
    @retrofit2.http.Body CraMonitoringInsightsGetRequest craMonitoringInsightsGetRequest
  );

  /**
   * Subscribe to Monitoring Insights
   * This endpoint allows you to subscribe to insights for a user&#39;s linked CRA items, which are updated every 14 days.
   * @param craMonitoringInsightsSubscribeRequest  (required)
   * @return Call&lt;CraMonitoringInsightsSubscribeResponse&gt;
   * 
   * @see <a href="/none/">Subscribe to Monitoring Insights Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("cra/monitoring_insights/subscribe")
  Call<CraMonitoringInsightsSubscribeResponse> craMonitoringInsightsSubscribe(
    @retrofit2.http.Body CraMonitoringInsightsSubscribeRequest craMonitoringInsightsSubscribeRequest
  );

  /**
   * Unsubscribe from Monitoring Insights
   * This endpoint allows you to unsubscribe from previously subscribed Monitoring Insights.
   * @param craMonitoringInsightsUnsubscribeRequest  (required)
   * @return Call&lt;CraMonitoringInsightsUnsubscribeResponse&gt;
   * 
   * @see <a href="/none/">Unsubscribe from Monitoring Insights Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("cra/monitoring_insights/unsubscribe")
  Call<CraMonitoringInsightsUnsubscribeResponse> craMonitoringInsightsUnsubscribe(
    @retrofit2.http.Body CraMonitoringInsightsUnsubscribeRequest craMonitoringInsightsUnsubscribeRequest
  );

  /**
   * Retrieve cash flow insights from the bank accounts used for income verification
   * &#x60;/cra/partner_insights/get&#x60; returns cash flow insights for a specified user.
   * @param craPartnerInsightsGetRequest  (required)
   * @return Call&lt;CraPartnerInsightsGetResponse&gt;
   * 
   * @see <a href="/api/products/income/#crapartner_insightsget">Retrieve cash flow insights from the bank accounts used for income verification Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("cra/partner_insights/get")
  Call<CraPartnerInsightsGetResponse> craPartnerInsightsGet(
    @retrofit2.http.Body CraPartnerInsightsGetRequest craPartnerInsightsGetRequest
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
   * Retrieve an Asset Report with Freddie Mac format. Only Freddie Mac can use this endpoint.
   * The &#x60;credit/asset_report/freddie_mac/get&#x60; endpoint retrieves the Asset Report in Freddie Mac&#39;s JSON format.
   * @param assetReportFreddieGetRequest  (required)
   * @return Call&lt;AssetReportFreddieGetResponse&gt;
   * 
   * @see <a href="/none/">Retrieve an Asset Report with Freddie Mac format. Only Freddie Mac can use this endpoint. Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("credit/asset_report/freddie_mac/get")
  Call<AssetReportFreddieGetResponse> creditAssetReportFreddieMacGet(
    @retrofit2.http.Body AssetReportFreddieGetRequest assetReportFreddieGetRequest
  );

  /**
   * Create Asset or Income Report Audit Copy Token
   * Plaid can create an Audit Copy token of an Asset Report and/or Income Report to share with participating Government Sponsored Entity (GSE). If you participate in the Day 1 Certainty™ program, Plaid can supply an Audit Copy token directly to Fannie Mae on your behalf. An Audit Copy token contains the same underlying data as the Asset Report and/or Income Report (result of /credit/payroll_income/get).  Use the &#x60;/credit/audit_copy_token/create&#x60; endpoint to create an &#x60;audit_copy_token&#x60; and then pass that token to the GSE who needs access.
   * @param creditAuditCopyTokenCreateRequest  (required)
   * @return Call&lt;CreditAuditCopyTokenCreateResponse&gt;
   * 
   * @see <a href="/api/products/income/#creditaudit_copy_tokencreate">Create Asset or Income Report Audit Copy Token Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("credit/audit_copy_token/create")
  Call<CreditAuditCopyTokenCreateResponse> creditAuditCopyTokenCreate(
    @retrofit2.http.Body CreditAuditCopyTokenCreateRequest creditAuditCopyTokenCreateRequest
  );

  /**
   * Update an Audit Copy Token
   * The &#x60;/credit/audit_copy_token/update&#x60; endpoint updates an existing  Audit Copy Token by adding the report tokens in the &#x60;report_tokens&#x60; field to the &#x60;audit_copy_token&#x60;. If the Audit Copy Token already contains a report of a certain type, it will be replaced with the token provided in the &#x60;report_tokens&#x60; field.
   * @param creditAuditCopyTokenUpdateRequest  (required)
   * @return Call&lt;CreditAuditCopyTokenUpdateResponse&gt;
   * 
   * @see <a href="/none/">Update an Audit Copy Token Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("credit/audit_copy_token/update")
  Call<CreditAuditCopyTokenUpdateResponse> creditAuditCopyTokenUpdate(
    @retrofit2.http.Body CreditAuditCopyTokenUpdateRequest creditAuditCopyTokenUpdateRequest
  );

  /**
   * Retrieve information from the bank accounts used for employment verification
   * &#x60;/credit/bank_employment/get&#x60; returns the employment report(s) derived from bank transaction data for a specified user.
   * @param creditBankEmploymentGetRequest  (required)
   * @return Call&lt;CreditBankEmploymentGetResponse&gt;
   * 
   * @see <a href="/api/products/income/#creditbank_employmentget">Retrieve information from the bank accounts used for employment verification Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("beta/credit/v1/bank_employment/get")
  Call<CreditBankEmploymentGetResponse> creditBankEmploymentGet(
    @retrofit2.http.Body CreditBankEmploymentGetRequest creditBankEmploymentGetRequest
  );

  /**
   * Retrieve information from the bank accounts used for income verification
   * &#x60;/credit/bank_income/get&#x60; returns the bank income report(s) for a specified user. A single report corresponds to all institutions linked in a single Link session. To include multiple institutions in a single report, use [Multi-Item Link](https://plaid.com/docs/link/multi-item-link). To return older reports, use the &#x60;options.count&#x60; field.
   * @param creditBankIncomeGetRequest  (required)
   * @return Call&lt;CreditBankIncomeGetResponse&gt;
   * 
   * @see <a href="/api/products/income/#creditbank_incomeget">Retrieve information from the bank accounts used for income verification Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("credit/bank_income/get")
  Call<CreditBankIncomeGetResponse> creditBankIncomeGet(
    @retrofit2.http.Body CreditBankIncomeGetRequest creditBankIncomeGetRequest
  );

  /**
   * Retrieve information from the bank accounts used for income verification in PDF format
   * &#x60;/credit/bank_income/pdf/get&#x60; returns the most recent bank income report for a specified user in PDF format.  A single report corresponds to all institutions linked in a single Link session. To include multiple institutions in a single report, use [Multi-Item Link](https://plaid.com/docs/link/multi-item-link).
   * @param creditBankIncomePDFGetRequest  (required)
   * @return Call&lt;ResponseBody&gt;
   * 
   * @see <a href="/api/products/income/#creditbank_incomepdfget">Retrieve information from the bank accounts used for income verification in PDF format Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("credit/bank_income/pdf/get")
  Call<ResponseBody> creditBankIncomePdfGet(
    @retrofit2.http.Body CreditBankIncomePDFGetRequest creditBankIncomePDFGetRequest
  );

  /**
   * Refresh a user&#39;s bank income information
   * &#x60;/credit/bank_income/refresh&#x60; refreshes the most recent bank income report data for a specific user. If the most recent bank income report is no longer valid (i.e. deleted), the endpoint will refresh the most recent valid report instead.
   * @param creditBankIncomeRefreshRequest  (required)
   * @return Call&lt;CreditBankIncomeRefreshResponse&gt;
   * 
   * @see <a href="/api/products/income/#creditbank_incomerefresh">Refresh a user&#39;s bank income information Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("credit/bank_income/refresh")
  Call<CreditBankIncomeRefreshResponse> creditBankIncomeRefresh(
    @retrofit2.http.Body CreditBankIncomeRefreshRequest creditBankIncomeRefreshRequest
  );

  /**
   * Subscribe and unsubscribe to proactive notifications for a user&#39;s income profile
   * &#x60;/credit/bank_income/webhook/update&#x60; allows you to subscribe or unsubscribe a user for income webhook notifications. By default, all users start out unsubscribed.  If a user is subscribed, on significant changes to the user&#39;s income profile, you will receive a &#x60;BANK_INCOME_REFRESH_UPDATE&#x60; webhook, prompting you to refresh bank income data for the user.
   * @param creditBankIncomeWebhookUpdateRequest  (required)
   * @return Call&lt;CreditBankIncomeWebhookUpdateResponse&gt;
   * 
   * @see <a href="/api/products/income/#creditbank_incomewebhookupdate">Subscribe and unsubscribe to proactive notifications for a user&#39;s income profile Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("credit/bank_income/webhook/update")
  Call<CreditBankIncomeWebhookUpdateResponse> creditBankIncomeWebhookUpdate(
    @retrofit2.http.Body CreditBankIncomeWebhookUpdateRequest creditBankIncomeWebhookUpdateRequest
  );

  /**
   * Retrieve data for a user&#39;s uploaded bank statements
   * &#x60;/credit/bank_statements/uploads/get&#x60; returns parsed data from bank statements uploaded by users as part of the Document Income flow. If your account is not enabled for Document Parsing, contact your account manager to request access.
   * @param creditBankStatementsUploadsGetRequest  (required)
   * @return Call&lt;CreditBankStatementsUploadsGetResponse&gt;
   * 
   * @see <a href="/api/products/income/#creditbank_statementsuploadsget">Retrieve data for a user&#39;s uploaded bank statements Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("credit/bank_statements/uploads/get")
  Call<CreditBankStatementsUploadsGetResponse> creditBankStatementsUploadsGet(
    @retrofit2.http.Body CreditBankStatementsUploadsGetRequest creditBankStatementsUploadsGetRequest
  );

  /**
   * Retrieve a summary of an individual&#39;s employment information
   * &#x60;/credit/employment/get&#x60; returns a list of items with employment information from a user&#39;s payroll provider that was verified by an end user.
   * @param creditEmploymentGetRequest  (required)
   * @return Call&lt;CreditEmploymentGetResponse&gt;
   * 
   * @see <a href="/api/products/income/#creditemploymentget">Retrieve a summary of an individual&#39;s employment information Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("credit/employment/get")
  Call<CreditEmploymentGetResponse> creditEmploymentGet(
    @retrofit2.http.Body CreditEmploymentGetRequest creditEmploymentGetRequest
  );

  /**
   * Retrieve an Asset Report with Freddie Mac format (aka VOA - Verification Of Assets), and a Verification Of Employment (VOE) report if this one is available. Only Freddie Mac can use this endpoint.
   * The &#x60;credit/asset_report/freddie_mac/get&#x60; endpoint retrieves the Verification of Assets and Verification of Employment reports.
   * @param creditFreddieMacReportsGetRequest  (required)
   * @return Call&lt;CreditFreddieMacReportsGetResponse&gt;
   * 
   * @see <a href="/none/">Retrieve an Asset Report with Freddie Mac format (aka VOA - Verification Of Assets), and a Verification Of Employment (VOE) report if this one is available. Only Freddie Mac can use this endpoint. Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("credit/freddie_mac/reports/get")
  Call<CreditFreddieMacReportsGetResponse> creditFreddieMacReportsGet(
    @retrofit2.http.Body CreditFreddieMacReportsGetRequest creditFreddieMacReportsGetRequest
  );

  /**
   * Retrieve a user&#39;s payroll information
   * This endpoint gets payroll income information for a specific user, either as a result of the user connecting to their payroll provider or uploading a pay related document.
   * @param creditPayrollIncomeGetRequest  (required)
   * @return Call&lt;CreditPayrollIncomeGetResponse&gt;
   * 
   * @see <a href="/api/products/income/#creditpayroll_incomeget">Retrieve a user&#39;s payroll information Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("credit/payroll_income/get")
  Call<CreditPayrollIncomeGetResponse> creditPayrollIncomeGet(
    @retrofit2.http.Body CreditPayrollIncomeGetRequest creditPayrollIncomeGetRequest
  );

  /**
   * Update the parsing configuration for a document income verification
   * &#x60;/credit/payroll_income/parsing_config/update&#x60; updates the parsing configuration for a document income verification.
   * @param creditPayrollIncomeParsingConfigUpdateRequest  (required)
   * @return Call&lt;CreditPayrollIncomeParsingConfigUpdateResponse&gt;
   * 
   * @see <a href="/api/products/income/#creditpayroll_incomeparsing_configupdate">Update the parsing configuration for a document income verification Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("credit/payroll_income/parsing_config/update")
  Call<CreditPayrollIncomeParsingConfigUpdateResponse> creditPayrollIncomeParsingConfigUpdate(
    @retrofit2.http.Body CreditPayrollIncomeParsingConfigUpdateRequest creditPayrollIncomeParsingConfigUpdateRequest
  );

  /**
   * Check income verification eligibility and optimize conversion
   * &#x60;/credit/payroll_income/precheck&#x60; is an optional endpoint that can be called before initializing a Link session for income verification. It evaluates whether a given user is supportable by digital income verification. If the user is eligible for digital verification, that information will be associated with the user token, and in this way will generate a Link UI optimized for the end user and their specific employer. If the user cannot be confirmed as eligible, the user can still use the income verification flow, but they may be required to manually upload a paystub to verify their income.  While all request fields are optional, providing &#x60;employer&#x60; data will increase the chance of receiving a useful result.  When testing in Sandbox, you can control the results by providing special test values in the &#x60;employer&#x60; and &#x60;access_tokens&#x60; fields. &#x60;employer_good&#x60; and &#x60;employer_bad&#x60; will result in &#x60;HIGH&#x60; and &#x60;LOW&#x60; confidence values, respectively. &#x60;employer_multi&#x60; will result in a &#x60;HIGH&#x60; confidence with multiple payroll options. Likewise, &#x60;access_good&#x60; and &#x60;access_bad&#x60; will result in &#x60;HIGH&#x60; and &#x60;LOW&#x60; confidence values, respectively. Any other value for &#x60;employer&#x60; and &#x60;access_tokens&#x60; in Sandbox will result in &#x60;UNKNOWN&#x60; confidence.
   * @param creditPayrollIncomePrecheckRequest  (required)
   * @return Call&lt;CreditPayrollIncomePrecheckResponse&gt;
   * @deprecated
   * 
   * @see <a href="/api/products/income/#creditpayroll_incomeprecheck">Check income verification eligibility and optimize conversion Documentation</a>
   */
  @Deprecated
  @Headers({
    "Content-Type:application/json"
  })
  @POST("credit/payroll_income/precheck")
  Call<CreditPayrollIncomePrecheckResponse> creditPayrollIncomePrecheck(
    @retrofit2.http.Body CreditPayrollIncomePrecheckRequest creditPayrollIncomePrecheckRequest
  );

  /**
   * Refresh a digital payroll income verification
   * &#x60;/credit/payroll_income/refresh&#x60; refreshes a given digital payroll income verification.
   * @param creditPayrollIncomeRefreshRequest  (required)
   * @return Call&lt;CreditPayrollIncomeRefreshResponse&gt;
   * 
   * @see <a href="/api/products/income/#creditpayroll_incomerefresh">Refresh a digital payroll income verification Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("credit/payroll_income/refresh")
  Call<CreditPayrollIncomeRefreshResponse> creditPayrollIncomeRefresh(
    @retrofit2.http.Body CreditPayrollIncomeRefreshRequest creditPayrollIncomeRefreshRequest
  );

  /**
   * Retrieve fraud insights for a user&#39;s manually uploaded document(s).
   * &#x60;/credit/payroll_income/risk_signals/get&#x60; can be used as part of the Document Income flow to assess a user-uploaded document for signs of potential fraud or tampering. It returns a risk score for each uploaded document that indicates the likelihood of the document being fraudulent, in addition to details on the individual risk signals contributing to the score.  To trigger risk signal generation for an Item, call &#x60;/link/token/create&#x60; with &#x60;parsing_config&#x60; set to include &#x60;risk_signals&#x60;, or call &#x60;/credit/payroll_income/parsing_config/update&#x60;. Once risk signal generation has been triggered, &#x60;/credit/payroll_income/risk_signals/get&#x60; can be called at any time after the &#x60;INCOME_VERIFICATION_RISK_SIGNALS&#x60; webhook has been fired.  &#x60;/credit/payroll_income/risk_signals/get&#x60; is offered as an add-on to Document Income and is billed separately. To request access to this endpoint, submit a product access request or contact your Plaid account manager.
   * @param creditPayrollIncomeRiskSignalsGetRequest  (required)
   * @return Call&lt;CreditPayrollIncomeRiskSignalsGetResponse&gt;
   * 
   * @see <a href="/api/products/income/#creditpayroll_incomerisk_signalsget">Retrieve fraud insights for a user&#39;s manually uploaded document(s). Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("credit/payroll_income/risk_signals/get")
  Call<CreditPayrollIncomeRiskSignalsGetResponse> creditPayrollIncomeRiskSignalsGet(
    @retrofit2.http.Body CreditPayrollIncomeRiskSignalsGetRequest creditPayrollIncomeRiskSignalsGetRequest
  );

  /**
   * Create a relay token to share an Asset Report with a partner client
   * Plaid can share an Asset Report directly with a participating third party on your behalf. The shared Asset Report is the exact same Asset Report originally created in &#x60;/asset_report/create&#x60;.  To grant a third party access to an Asset Report, use the &#x60;/credit/relay/create&#x60; endpoint to create a &#x60;relay_token&#x60; and then pass that token to your third party. Each third party has its own &#x60;secondary_client_id&#x60;; for example, &#x60;ce5bd328dcd34123456&#x60;. You&#39;ll need to create a separate &#x60;relay_token&#x60; for each third party that needs access to the report on your behalf.
   * @param creditRelayCreateRequest  (required)
   * @return Call&lt;CreditRelayCreateResponse&gt;
   * 
   * @see <a href="/api/products/assets/#creditrelaycreate">Create a relay token to share an Asset Report with a partner client Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("credit/relay/create")
  Call<CreditRelayCreateResponse> creditRelayCreate(
    @retrofit2.http.Body CreditRelayCreateRequest creditRelayCreateRequest
  );

  /**
   * Retrieve the reports associated with a relay token that was shared with you
   * &#x60;/credit/relay/get&#x60; allows third parties to receive a report that was shared with them, using a &#x60;relay_token&#x60; that was created by the report owner.
   * @param creditRelayGetRequest  (required)
   * @return Call&lt;AssetReportGetResponse&gt;
   * 
   * @see <a href="/api/products/assets/#creditrelayget">Retrieve the reports associated with a relay token that was shared with you Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("credit/relay/get")
  Call<AssetReportGetResponse> creditRelayGet(
    @retrofit2.http.Body CreditRelayGetRequest creditRelayGetRequest
  );

  /**
   * Retrieve the pdf reports associated with a relay token that was shared with you (beta)
   * &#x60;/credit/relay/pdf/get&#x60; allows third parties to receive a pdf report that was shared with them, using a &#x60;relay_token&#x60; that was created by the report owner.  The &#x60;/credit/relay/pdf/get&#x60; endpoint retrieves the Asset Report in PDF format. Before calling &#x60;/credit/relay/pdf/get&#x60;, you must first create the Asset Report using &#x60;/credit/relay/create&#x60; and then wait for the [&#x60;PRODUCT_READY&#x60;](https://plaid.com/docs/api/products/assets/#product_ready) webhook to fire, indicating that the Report is ready to be retrieved.  The response to &#x60;/credit/relay/pdf/get&#x60; is the PDF binary data. The &#x60;request_id&#x60; is returned in the &#x60;Plaid-Request-ID&#x60; header.  [View a sample PDF Asset Report](https://plaid.com/documents/sample-asset-report.pdf).
   * @param creditRelayPDFGetRequest  (required)
   * @return Call&lt;ResponseBody&gt;
   * 
   * @see <a href="/api/products/assets/#creditrelaypdfget">Retrieve the pdf reports associated with a relay token that was shared with you (beta) Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("credit/relay/pdf/get")
  Call<ResponseBody> creditRelayPdfGet(
    @retrofit2.http.Body CreditRelayPDFGetRequest creditRelayPDFGetRequest
  );

  /**
   * Refresh a report of a relay token
   * The &#x60;/credit/relay/refresh&#x60; endpoint allows third parties to refresh a report that was relayed to them, using a &#x60;relay_token&#x60; that was created by the report owner. A new report will be created with the original report parameters, but with the most recent data available based on the &#x60;days_requested&#x60; value of the original report.
   * @param creditRelayRefreshRequest  (required)
   * @return Call&lt;CreditRelayRefreshResponse&gt;
   * 
   * @see <a href="/api/products/assets/#creditrelayrefresh">Refresh a report of a relay token Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("credit/relay/refresh")
  Call<CreditRelayRefreshResponse> creditRelayRefresh(
    @retrofit2.http.Body CreditRelayRefreshRequest creditRelayRefreshRequest
  );

  /**
   * Remove relay token
   * The &#x60;/credit/relay/remove&#x60; endpoint allows you to invalidate a &#x60;relay_token&#x60;. The third party holding the token will no longer be able to access or refresh the reports which the &#x60;relay_token&#x60; gives access to. The original report, associated Items, and other relay tokens that provide access to the same report are not affected and will remain accessible after removing the given &#x60;relay_token&#x60;.
   * @param creditRelayRemoveRequest  (required)
   * @return Call&lt;CreditRelayRemoveResponse&gt;
   * 
   * @see <a href="/api/products/assets/#creditrelayremove">Remove relay token Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("credit/relay/remove")
  Call<CreditRelayRemoveResponse> creditRelayRemove(
    @retrofit2.http.Body CreditRelayRemoveRequest creditRelayRemoveRequest
  );

  /**
   * Remove an Audit Copy token
   * The &#x60;/credit/audit_copy_token/remove&#x60; endpoint allows you to remove an Audit Copy. Removing an Audit Copy invalidates the &#x60;audit_copy_token&#x60; associated with it, meaning both you and any third parties holding the token will no longer be able to use it to access Report data. Items associated with the Report data and other Audit Copies of it are not affected and will remain accessible after removing the given Audit Copy.
   * @param creditAuditCopyTokenRemoveRequest  (required)
   * @return Call&lt;CreditAuditCopyTokenRemoveResponse&gt;
   * 
   * @see <a href="/api/products/income/#creditaudit_copy_tokenremove">Remove an Audit Copy token Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("credit/audit_copy_token/remove")
  Call<CreditAuditCopyTokenRemoveResponse> creditReportAuditCopyRemove(
    @retrofit2.http.Body CreditAuditCopyTokenRemoveRequest creditAuditCopyTokenRemoveRequest
  );

  /**
   * Retrieve Link sessions for your user
   * This endpoint can be used for your end users after they complete the Link flow. This endpoint returns a list of Link sessions that your user completed, where each session includes the results from the Link flow.  These results include details about the Item that was created and some product related metadata (showing, for example, whether the user finished the bank income verification step).
   * @param creditSessionsGetRequest  (required)
   * @return Call&lt;CreditSessionsGetResponse&gt;
   * 
   * @see <a href="/api/products/income/#creditsessionsget">Retrieve Link sessions for your user Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("credit/sessions/get")
  Call<CreditSessionsGetResponse> creditSessionsGet(
    @retrofit2.http.Body CreditSessionsGetRequest creditSessionsGetRequest
  );

  /**
   * Retrieve a dashboard user
   * The &#x60;/dashboard_user/get&#x60; endpoint provides details (such as email address) about a specific Dashboard user based on the &#x60;dashboard_user_id&#x60; field, which is returned in the &#x60;audit_trail&#x60; object of certain Monitor and Beacon endpoints. This can be used to identify the specific reviewer who performed a Dashboard action.
   * @param dashboardUserGetRequest  (required)
   * @return Call&lt;DashboardUserGetResponse&gt;
   * 
   * @see <a href="/api/kyc-aml-users/#dashboard_userget">Retrieve a dashboard user Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("dashboard_user/get")
  Call<DashboardUserGetResponse> dashboardUserGet(
    @retrofit2.http.Body DashboardUserGetRequest dashboardUserGetRequest
  );

  /**
   * List dashboard users
   * The &#x60;/dashboard_user/list&#x60; endpoint provides details (such as email address) all Dashboard users associated with your account. This can use used to audit or track the list of reviewers for Monitor, Beacon, and Identity Verification products.
   * @param dashboardUserListRequest  (required)
   * @return Call&lt;DashboardUserListResponse&gt;
   * 
   * @see <a href="/api/kyc-aml-users/#dashboard_userlist">List dashboard users Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("dashboard_user/list")
  Call<DashboardUserListResponse> dashboardUserList(
    @retrofit2.http.Body DashboardUserListRequest dashboardUserListRequest
  );

  /**
   * (Deprecated) Create a deposit switch without using Plaid Exchange
   * This endpoint provides an alternative to &#x60;/deposit_switch/create&#x60; for customers who have not yet fully integrated with Plaid Exchange. Like &#x60;/deposit_switch/create&#x60;, it creates a deposit switch entity that will be persisted throughout the lifecycle of the switch.
   * @param depositSwitchAltCreateRequest  (required)
   * @return Call&lt;DepositSwitchAltCreateResponse&gt;
   * @deprecated
   * 
   * @see <a href="/deposit-switch/reference#deposit_switchaltcreate">(Deprecated) Create a deposit switch without using Plaid Exchange Documentation</a>
   */
  @Deprecated
  @Headers({
    "Content-Type:application/json"
  })
  @POST("deposit_switch/alt/create")
  Call<DepositSwitchAltCreateResponse> depositSwitchAltCreate(
    @retrofit2.http.Body DepositSwitchAltCreateRequest depositSwitchAltCreateRequest
  );

  /**
   * (Deprecated) Create a deposit switch
   * This endpoint creates a deposit switch entity that will be persisted throughout the lifecycle of the switch.
   * @param depositSwitchCreateRequest  (required)
   * @return Call&lt;DepositSwitchCreateResponse&gt;
   * @deprecated
   * 
   * @see <a href="/deposit-switch/reference#deposit_switchcreate">(Deprecated) Create a deposit switch Documentation</a>
   */
  @Deprecated
  @Headers({
    "Content-Type:application/json"
  })
  @POST("deposit_switch/create")
  Call<DepositSwitchCreateResponse> depositSwitchCreate(
    @retrofit2.http.Body DepositSwitchCreateRequest depositSwitchCreateRequest
  );

  /**
   * (Deprecated) Retrieve a deposit switch
   * This endpoint returns information related to how the user has configured their payroll allocation and the state of the switch. You can use this information to build logic related to the user&#39;s direct deposit allocation preferences.
   * @param depositSwitchGetRequest  (required)
   * @return Call&lt;DepositSwitchGetResponse&gt;
   * @deprecated
   * 
   * @see <a href="/deposit-switch/reference#deposit_switchget">(Deprecated) Retrieve a deposit switch Documentation</a>
   */
  @Deprecated
  @Headers({
    "Content-Type:application/json"
  })
  @POST("deposit_switch/get")
  Call<DepositSwitchGetResponse> depositSwitchGet(
    @retrofit2.http.Body DepositSwitchGetRequest depositSwitchGetRequest
  );

  /**
   * (Deprecated) Create a deposit switch token
   * In order for the end user to take action, you will need to create a public token representing the deposit switch. This token is used to initialize Link. It can be used one time and expires after 30 minutes. 
   * @param depositSwitchTokenCreateRequest  (required)
   * @return Call&lt;DepositSwitchTokenCreateResponse&gt;
   * @deprecated
   * 
   * @see <a href="/deposit-switch/reference#deposit_switchtokencreate">(Deprecated) Create a deposit switch token Documentation</a>
   */
  @Deprecated
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
   * (Deprecated) Retrieve a summary of an individual&#39;s employment information
   * &#x60;/employment/verification/get&#x60; returns a list of employments through a user payroll that was verified by an end user.  This endpoint has been deprecated; new integrations should use &#x60;/credit/employment/get&#x60; instead.
   * @param employmentVerificationGetRequest  (required)
   * @return Call&lt;EmploymentVerificationGetResponse&gt;
   * @deprecated
   * 
   * @see <a href="/api/products/income/#employmentverificationget">(Deprecated) Retrieve a summary of an individual&#39;s employment information Documentation</a>
   */
  @Deprecated
  @Headers({
    "Content-Type:application/json"
  })
  @POST("employment/verification/get")
  Call<EmploymentVerificationGetResponse> employmentVerificationGet(
    @retrofit2.http.Body EmploymentVerificationGetRequest employmentVerificationGetRequest
  );

  /**
   * Webhook receiver for fdx notifications
   * A generic webhook receiver endpoint for FDX Event Notifications
   * @param fdXNotification  (required)
   * @return Call&lt;Void&gt;
   * 
   * @see <a href="/api/fdx/notifications/#post">Webhook receiver for fdx notifications Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("fdx/notifications")
  Call<Void> fdxNotifications(
    @retrofit2.http.Body FDXNotification fdXNotification
  );

  /**
   * Get Recipient
   * Get a specific recipient
   * @param recipientId Recipient Identifier. Uniquely identifies the recipient (required)
   * @param OAUTH_STATE_ID The value that is passed into the OAuth URI &#39;state&#39; query parameter. (optional)
   * @return Call&lt;GetRecipientResponse&gt;
   */
  @GET("fdx/recipient/{recipientId}")
  Call<GetRecipientResponse> getRecipient(
    @retrofit2.http.Path("recipientId") String recipientId, @retrofit2.http.Header("OAUTH-STATE-ID") String OAUTH_STATE_ID
  );

  /**
   * Get Recipients
   * Returns a list of Recipients
   * @return Call&lt;GetRecipientsResponse&gt;
   */
  @GET("fdx/recipients")
  Call<GetRecipientsResponse> getRecipients();
    

  /**
   * Returns uploaded document identity
   * Use &#x60;/identity/documents/uploads/get&#x60; to retrieve document uploaded identity.
   * @param identityDocumentsUploadsGetRequest  (required)
   * @return Call&lt;IdentityDocumentsUploadsGetResponse&gt;
   * 
   * @see <a href="none">Returns uploaded document identity Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("identity/documents/uploads/get")
  Call<IdentityDocumentsUploadsGetResponse> identityDocumentsUploadsGet(
    @retrofit2.http.Body IdentityDocumentsUploadsGetRequest identityDocumentsUploadsGetRequest
  );

  /**
   * Retrieve identity data
   * The &#x60;/identity/get&#x60; endpoint allows you to retrieve various account holder information on file with the financial institution, including names, emails, phone numbers, and addresses. Only name data is guaranteed to be returned; other fields will be empty arrays if not provided by the institution.  Note: In API versions 2018-05-22 and earlier, the &#x60;owners&#x60; object is not returned, and instead identity information is returned in the top level &#x60;identity&#x60; object. For more details, see [Plaid API versioning](https://plaid.com/docs/api/versioning/#version-2019-05-29).
   * @param identityGetRequest  (required)
   * @return Call&lt;IdentityGetResponse&gt;
   * 
   * @see <a href="/api/products/identity/#identityget">Retrieve identity data Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("identity/get")
  Call<IdentityGetResponse> identityGet(
    @retrofit2.http.Body IdentityGetRequest identityGetRequest
  );

  /**
   * Retrieve identity match score
   * The &#x60;/identity/match&#x60; endpoint generates a match score, which indicates how well the provided identity data matches the identity information on file with the account holder&#39;s financial institution.  Fields within the &#x60;balances&#x60; object will always be null when retrieved by &#x60;/identity/match&#x60;. Instead, use the free &#x60;/accounts/get&#x60; endpoint to request balance cached data, or &#x60;/accounts/balance/get&#x60; for real-time data.
   * @param identityMatchRequest  (required)
   * @return Call&lt;IdentityMatchResponse&gt;
   * 
   * @see <a href="/api/products/identity/#identitymatch">Retrieve identity match score Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("identity/match")
  Call<IdentityMatchResponse> identityMatch(
    @retrofit2.http.Body IdentityMatchRequest identityMatchRequest
  );

  /**
   * Refresh identity data
   * &#x60;/identity/refresh&#x60; is an optional endpoint for users of the Identity product. It initiates an on-demand extraction to fetch the most up to date Identity information from the Financial Institution. This on-demand extraction takes place in addition to the periodic extractions that automatically occur for any Identity-enabled Item. If changes to Identity are discovered after calling &#x60;/identity/refresh&#x60;, Plaid will fire a webhook [&#x60;DEFAULT_UPDATE&#x60;](https://plaid.com/docs/api/products/identity/#default_update).  As this endpoint triggers a synchronous request for fresh data, latency may be higher than for other Plaid endpoints (typically less than 10 seconds, but occasionally up to 30 seconds or more); if you encounter errors, you may find it necessary to adjust your timeout period when making requests.  &#x60;/identity/refresh&#x60; is offered as an add-on to Identity and has a separate [fee model](/docs/account/billing/#per-request-flat-fee). To request access to this endpoint, submit a [product access request](https://dashboard.plaid.com/team/products) or contact your Plaid account manager.
   * @param identityRefreshRequest  (required)
   * @return Call&lt;IdentityRefreshResponse&gt;
   * 
   * @see <a href="/api/products/identity/#identityrefresh">Refresh identity data Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("identity/refresh")
  Call<IdentityRefreshResponse> identityRefresh(
    @retrofit2.http.Body IdentityRefreshRequest identityRefreshRequest
  );

  /**
   * Create autofill for an Identity Verification
   * Try to autofill an Identity Verification based of the provided phone number, date of birth and country of residence.
   * @param identityVerificationAutofillCreateRequest  (required)
   * @return Call&lt;IdentityVerificationAutofillCreateResponse&gt;
   * 
   * @see <a href="/api/products/identity-verification/#identity_verificationautofillcreate">Create autofill for an Identity Verification Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("identity_verification/autofill/create")
  Call<IdentityVerificationAutofillCreateResponse> identityVerificationAutofillCreate(
    @retrofit2.http.Body IdentityVerificationAutofillCreateRequest identityVerificationAutofillCreateRequest
  );

  /**
   * Create a new Identity Verification
   * Create a new Identity Verification for the user specified by the &#x60;client_user_id&#x60; field. The requirements and behavior of the verification are determined by the &#x60;template_id&#x60; provided. If you don&#39;t know whether the associated user already has an active Identity Verification, you can specify &#x60;\&quot;is_idempotent\&quot;: true&#x60; in the request body. With idempotency enabled, a new Identity Verification will only be created if one does not already exist for the associated &#x60;client_user_id&#x60; and &#x60;template_id&#x60;. If an Identity Verification is found, it will be returned unmodified with an &#x60;200 OK&#x60; HTTP status code.  You can also use this endpoint to supply information you already have collected about the user; if any of these fields are specified, the screens prompting the user to enter them will be skipped during the Link flow. 
   * @param identityVerificationCreateRequest  (required)
   * @return Call&lt;IdentityVerificationCreateResponse&gt;
   * 
   * @see <a href="/api/products/identity-verification/#identity_verificationcreate">Create a new Identity Verification Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("identity_verification/create")
  Call<IdentityVerificationCreateResponse> identityVerificationCreate(
    @retrofit2.http.Body IdentityVerificationCreateRequest identityVerificationCreateRequest
  );

  /**
   * Retrieve Identity Verification
   * Retrieve a previously created Identity Verification.
   * @param identityVerificationGetRequest  (required)
   * @return Call&lt;IdentityVerificationGetResponse&gt;
   * 
   * @see <a href="/api/products/identity-verification/#identity_verificationget">Retrieve Identity Verification Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("identity_verification/get")
  Call<IdentityVerificationGetResponse> identityVerificationGet(
    @retrofit2.http.Body IdentityVerificationGetRequest identityVerificationGetRequest
  );

  /**
   * List Identity Verifications
   * Filter and list Identity Verifications created by your account
   * @param identityVerificationListRequest  (required)
   * @return Call&lt;IdentityVerificationListResponse&gt;
   * 
   * @see <a href="/api/products/identity-verification/#identity_verificationlist">List Identity Verifications Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("identity_verification/list")
  Call<IdentityVerificationListResponse> identityVerificationList(
    @retrofit2.http.Body IdentityVerificationListRequest identityVerificationListRequest
  );

  /**
   * Retry an Identity Verification
   * Allow a customer to retry their Identity Verification
   * @param identityVerificationRetryRequest  (required)
   * @return Call&lt;IdentityVerificationRetryResponse&gt;
   * 
   * @see <a href="/api/products/identity-verification/#identity_verificationretry">Retry an Identity Verification Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("identity_verification/retry")
  Call<IdentityVerificationRetryResponse> identityVerificationRetry(
    @retrofit2.http.Body IdentityVerificationRetryRequest identityVerificationRetryRequest
  );

  /**
   * (Deprecated) Create an income verification instance
   * &#x60;/income/verification/create&#x60; begins the income verification process by returning an &#x60;income_verification_id&#x60;. You can then provide the &#x60;income_verification_id&#x60; to &#x60;/link/token/create&#x60; under the &#x60;income_verification&#x60; parameter in order to create a Link instance that will prompt the user to go through the income verification flow. Plaid will fire an &#x60;INCOME&#x60; webhook once the user completes the Payroll Income flow, or when the uploaded documents in the Document Income flow have finished processing. 
   * @param incomeVerificationCreateRequest  (required)
   * @return Call&lt;IncomeVerificationCreateResponse&gt;
   * @deprecated
   * 
   * @see <a href="/api/products/income/#incomeverificationcreate">(Deprecated) Create an income verification instance Documentation</a>
   */
  @Deprecated
  @Headers({
    "Content-Type:application/json"
  })
  @POST("income/verification/create")
  Call<IncomeVerificationCreateResponse> incomeVerificationCreate(
    @retrofit2.http.Body IncomeVerificationCreateRequest incomeVerificationCreateRequest
  );

  /**
   * (Deprecated) Download the original documents used for income verification
   * &#x60;/income/verification/documents/download&#x60; provides the ability to download the source documents associated with the verification.  If Document Income was used, the documents will be those the user provided in Link. For Payroll Income, the most recent files available for download from the payroll provider will be available from this endpoint.  The response to &#x60;/income/verification/documents/download&#x60; is a ZIP file in binary data. If a &#x60;document_id&#x60; is passed, a single document will be contained in this file. If not, the response will contain all documents associated with the verification.  The &#x60;request_id&#x60; is returned in the &#x60;Plaid-Request-ID&#x60; header.
   * @param incomeVerificationDocumentsDownloadRequest  (required)
   * @return Call&lt;ResponseBody&gt;
   * @deprecated
   * 
   * @see <a href="/api/products/income/#incomeverificationdocumentsdownload">(Deprecated) Download the original documents used for income verification Documentation</a>
   */
  @Deprecated
  @Headers({
    "Content-Type:application/json"
  })
  @POST("income/verification/documents/download")
  Call<ResponseBody> incomeVerificationDocumentsDownload(
    @retrofit2.http.Body IncomeVerificationDocumentsDownloadRequest incomeVerificationDocumentsDownloadRequest
  );

  /**
   * (Deprecated) Retrieve information from the paystubs used for income verification
   * &#x60;/income/verification/paystubs/get&#x60; returns the information collected from the paystubs that were used to verify an end user&#39;s income. It can be called once the status of the verification has been set to &#x60;VERIFICATION_STATUS_PROCESSING_COMPLETE&#x60;, as reported by the &#x60;INCOME: verification_status&#x60; webhook. Attempting to call the endpoint before verification has been completed will result in an error.  This endpoint has been deprecated; new integrations should use &#x60;/credit/payroll_income/get&#x60; instead.
   * @param incomeVerificationPaystubsGetRequest  (required)
   * @return Call&lt;IncomeVerificationPaystubsGetResponse&gt;
   * @deprecated
   * 
   * @see <a href="/api/products/income/#incomeverificationpaystubsget">(Deprecated) Retrieve information from the paystubs used for income verification Documentation</a>
   */
  @Deprecated
  @Headers({
    "Content-Type:application/json"
  })
  @POST("income/verification/paystubs/get")
  Call<IncomeVerificationPaystubsGetResponse> incomeVerificationPaystubsGet(
    @retrofit2.http.Body IncomeVerificationPaystubsGetRequest incomeVerificationPaystubsGetRequest
  );

  /**
   * (Deprecated) Check digital income verification eligibility and optimize conversion
   * &#x60;/income/verification/precheck&#x60; is an optional endpoint that can be called before initializing a Link session for income verification. It evaluates whether a given user is supportable by digital income verification and returns a &#x60;precheck_id&#x60; that can be provided to &#x60;/link/token/create&#x60;. If the user is eligible for digital verification, providing the &#x60;precheck_id&#x60; in this way will generate a Link UI optimized for the end user and their specific employer. If the user cannot be confirmed as eligible, the &#x60;precheck_id&#x60; can still be provided to &#x60;/link/token/create&#x60; and the user can still use the income verification flow, but they may be required to manually upload a paystub to verify their income.  While all request fields are optional, providing either &#x60;employer&#x60; or &#x60;transactions_access_tokens&#x60; data will increase the chance of receiving a useful result.  This endpoint has been deprecated; new integrations should use &#x60;/credit/payroll_income/precheck&#x60; instead.
   * @param incomeVerificationPrecheckRequest  (required)
   * @return Call&lt;IncomeVerificationPrecheckResponse&gt;
   * @deprecated
   * 
   * @see <a href="/api/products/income/#incomeverificationprecheck">(Deprecated) Check digital income verification eligibility and optimize conversion Documentation</a>
   */
  @Deprecated
  @Headers({
    "Content-Type:application/json"
  })
  @POST("income/verification/precheck")
  Call<IncomeVerificationPrecheckResponse> incomeVerificationPrecheck(
    @retrofit2.http.Body IncomeVerificationPrecheckRequest incomeVerificationPrecheckRequest
  );

  /**
   * (Deprecated) Retrieve information from the tax documents used for income verification
   * &#x60;/income/verification/taxforms/get&#x60; returns the information collected from forms that were used to verify an end user&#39;&#39;s income. It can be called once the status of the verification has been set to &#x60;VERIFICATION_STATUS_PROCESSING_COMPLETE&#x60;, as reported by the &#x60;INCOME: verification_status&#x60; webhook. Attempting to call the endpoint before verification has been completed will result in an error.  This endpoint has been deprecated; new integrations should use &#x60;/credit/payroll_income/get&#x60; instead.
   * @param incomeVerificationTaxformsGetRequest  (required)
   * @return Call&lt;IncomeVerificationTaxformsGetResponse&gt;
   * @deprecated
   * 
   * @see <a href="/api/products/income/#incomeverificationtaxformsget">(Deprecated) Retrieve information from the tax documents used for income verification Documentation</a>
   */
  @Deprecated
  @Headers({
    "Content-Type:application/json"
  })
  @POST("income/verification/taxforms/get")
  Call<IncomeVerificationTaxformsGetResponse> incomeVerificationTaxformsGet(
    @retrofit2.http.Body IncomeVerificationTaxformsGetRequest incomeVerificationTaxformsGetRequest
  );

  /**
   * Get details of all supported institutions
   * Returns a JSON response containing details on all financial institutions currently supported by Plaid. Because Plaid supports thousands of institutions, results are paginated.  If there is no overlap between an institution’s enabled products and a client’s enabled products, then the institution will be filtered out from the response. As a result, the number of institutions returned may not match the count specified in the call.
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
   * Returns a JSON response containing details on a specified financial institution currently supported by Plaid.  Versioning note: API versions 2019-05-29 and earlier allow use of the &#x60;public_key&#x60; parameter instead of the &#x60;client_id&#x60; and &#x60;secret&#x60; to authenticate to this endpoint. The &#x60;public_key&#x60; has been deprecated; all customers are encouraged to use &#x60;client_id&#x60; and &#x60;secret&#x60; instead. 
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
   * Returns a JSON response containing details for institutions that match the query parameters, up to a maximum of ten institutions per query.  Versioning note: API versions 2019-05-29 and earlier allow use of the &#x60;public_key&#x60; parameter instead of the &#x60;client_id&#x60; and &#x60;secret&#x60; parameters to authenticate to this endpoint. The &#x60;public_key&#x60; parameter has since been deprecated; all customers are encouraged to use &#x60;client_id&#x60; and &#x60;secret&#x60; instead. 
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
   * Get data needed to authorize an investments transfer
   * The &#x60;/investments/auth/get&#x60; endpoint allows developers to receive user-authorized data to facilitate the transfer of holdings
   * @param investmentsAuthGetRequest  (required)
   * @return Call&lt;InvestmentsAuthGetResponse&gt;
   * 
   * @see <a href="/api/products/investments-move/#investmentsauthget">Get data needed to authorize an investments transfer Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("investments/auth/get")
  Call<InvestmentsAuthGetResponse> investmentsAuthGet(
    @retrofit2.http.Body InvestmentsAuthGetRequest investmentsAuthGetRequest
  );

  /**
   * Get Investment holdings
   * The &#x60;/investments/holdings/get&#x60; endpoint allows developers to receive user-authorized stock position data for &#x60;investment&#x60;-type accounts.
   * @param investmentsHoldingsGetRequest  (required)
   * @return Call&lt;InvestmentsHoldingsGetResponse&gt;
   * 
   * @see <a href="/api/products/investments/#investmentsholdingsget">Get Investment holdings Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("investments/holdings/get")
  Call<InvestmentsHoldingsGetResponse> investmentsHoldingsGet(
    @retrofit2.http.Body InvestmentsHoldingsGetRequest investmentsHoldingsGetRequest
  );

  /**
   * Refresh investment data
   * &#x60;/investments/refresh&#x60; is an optional endpoint for users of the Investments product. It initiates an on-demand extraction to fetch the newest investment holdings and transactions for an Item. This on-demand extraction takes place in addition to the periodic extractions that automatically occur one or more times per day for any Investments-enabled Item. If changes to investments are discovered after calling &#x60;/investments/refresh&#x60;, Plaid will fire webhooks: [&#x60;HOLDINGS: DEFAULT_UPDATE&#x60;](https://plaid.com/docs/api/products/investments/#holdings-default_update) if any new holdings are detected, and [&#x60;INVESTMENTS_TRANSACTIONS: DEFAULT_UPDATE&#x60;](https://plaid.com/docs/api/products/investments/#investments_transactions-default_update) if any new investment transactions are detected. Updated holdings and investment transactions can be fetched by calling &#x60;/investments/holdings/get&#x60; and &#x60;/investments/transactions/get&#x60;. Note that the &#x60;/investments/refresh&#x60; endpoint is not supported by all institutions. If called on an Item from an institution that does not support this functionality, it will return a &#x60;PRODUCT_NOT_SUPPORTED&#x60; error.  As this endpoint triggers a synchronous request for fresh data, latency may be higher than for other Plaid endpoints (typically less than 10 seconds, but occasionally up to 30 seconds or more); if you encounter errors, you may find it necessary to adjust your timeout period when making requests.  &#x60;/investments/refresh&#x60; is offered as an add-on to Investments and has a separate [fee model](/docs/account/billing/#per-request-flat-fee). To request access to this endpoint, submit a [product access request](https://dashboard.plaid.com/team/products) or contact your Plaid account manager.
   * @param investmentsRefreshRequest  (required)
   * @return Call&lt;InvestmentsRefreshResponse&gt;
   * 
   * @see <a href="/api/products/investments/#investmentsrefresh">Refresh investment data Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("investments/refresh")
  Call<InvestmentsRefreshResponse> investmentsRefresh(
    @retrofit2.http.Body InvestmentsRefreshRequest investmentsRefreshRequest
  );

  /**
   * Get investment transactions
   * The &#x60;/investments/transactions/get&#x60; endpoint allows developers to retrieve up to 24 months of user-authorized transaction data for investment accounts.  Transactions are returned in reverse-chronological order, and the sequence of transaction ordering is stable and will not shift.  Due to the potentially large number of investment transactions associated with an Item, results are paginated. Manipulate the count and offset parameters in conjunction with the &#x60;total_investment_transactions&#x60; response body field to fetch all available investment transactions.  Note that Investments does not have a webhook to indicate when initial transaction data has loaded (unless you use the &#x60;async_update&#x60; option). Instead, if transactions data is not ready when &#x60;/investments/transactions/get&#x60; is first called, Plaid will wait for the data. For this reason, calling &#x60;/investments/transactions/get&#x60; immediately after Link may take up to one to two minutes to return.  Data returned by the asynchronous investments extraction flow (when &#x60;async_update&#x60; is set to true) may not be immediately available to &#x60;/investments/transactions/get&#x60;. To be alerted when the data is ready to be fetched, listen for the &#x60;HISTORICAL_UPDATE&#x60; webhook. If no investments history is ready when &#x60;/investments/transactions/get&#x60; is called, it will return a &#x60;PRODUCT_NOT_READY&#x60; error.
   * @param investmentsTransactionsGetRequest  (required)
   * @return Call&lt;InvestmentsTransactionsGetResponse&gt;
   * 
   * @see <a href="/api/products/investments/#investmentstransactionsget">Get investment transactions Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("investments/transactions/get")
  Call<InvestmentsTransactionsGetResponse> investmentsTransactionsGet(
    @retrofit2.http.Body InvestmentsTransactionsGetRequest investmentsTransactionsGetRequest
  );

  /**
   * Get an Issue
   * Retrieve detailed information about a specific &#x60;Issue&#x60;. This endpoint returns a single &#x60;Issue&#x60; object.
   * @param issuesGetRequest  (required)
   * @return Call&lt;IssuesGetResponse&gt;
   * 
   * @see <a href="/api/products/link/#supportapi">Get an Issue Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("issues/get")
  Call<IssuesGetResponse> issuesGet(
    @retrofit2.http.Body IssuesGetRequest issuesGetRequest
  );

  /**
   * Search for an Issue
   * Search for an issue associated with one of the following identifiers:  &#x60;item_id&#x60;, &#x60;link_session_id&#x60; or Link session &#x60;request_id&#x60;.  This endpoint returns a list of &#x60;Issue&#x60; objects, with an empty list indicating that no issues are associated with the provided identifier. At least one of the identifiers must be provided to perform the search.
   * @param issuesSearchRequest  (required)
   * @return Call&lt;IssuesSearchResponse&gt;
   * 
   * @see <a href="/api/products/link/#supportapi">Search for an Issue Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("issues/search")
  Call<IssuesSearchResponse> issuesSearch(
    @retrofit2.http.Body IssuesSearchRequest issuesSearchRequest
  );

  /**
   * Subscribe to an Issue
   * Allows a user to subscribe to updates on a specific &#x60;Issue&#x60; using a POST method. Subscribers will receive webhook notifications when the issue status changes, particularly when resolved.
   * @param issuesSubscribeRequest  (required)
   * @return Call&lt;IssuesSubscribeResponse&gt;
   * 
   * @see <a href="/api/products/link/#supportapi">Subscribe to an Issue Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("issues/subscribe")
  Call<IssuesSubscribeResponse> issuesSubscribe(
    @retrofit2.http.Body IssuesSubscribeRequest issuesSubscribeRequest
  );

  /**
   * Invalidate access_token
   * By default, the &#x60;access_token&#x60; associated with an Item does not expire and should be stored in a persistent, secure manner.  You can use the &#x60;/item/access_token/invalidate&#x60; endpoint to rotate the &#x60;access_token&#x60; associated with an Item. The endpoint returns a new &#x60;access_token&#x60; and immediately invalidates the previous &#x60;access_token&#x60;. 
   * @param itemAccessTokenInvalidateRequest  (required)
   * @return Call&lt;ItemAccessTokenInvalidateResponse&gt;
   * 
   * @see <a href="/api/items/#itemaccess_tokeninvalidate">Invalidate access_token Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("item/access_token/invalidate")
  Call<ItemAccessTokenInvalidateResponse> itemAccessTokenInvalidate(
    @retrofit2.http.Body ItemAccessTokenInvalidateRequest itemAccessTokenInvalidateRequest
  );

  /**
   * List a historical log of user consent events
   * List a historical log of user consent events
   * @param itemActivityListRequest  (required)
   * @return Call&lt;ItemActivityListResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("item/activity/list")
  Call<ItemActivityListResponse> itemActivityList(
    @retrofit2.http.Body ItemActivityListRequest itemActivityListRequest
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
   * Unlink a user’s connected application
   * Unlink a user’s connected application. On an unlink request, Plaid will immediately revoke the Application’s access to the User’s data.  The User will have to redo the OAuth authentication process in order to restore functionality.  This endpoint only removes ongoing data access permissions, therefore the User will need to reach out to the Application itself in order to disable and delete their account and delete any data that the Application already received (if the Application does not do so by default).  This endpoint should be called in real time as the User is unlinking an Application, and should not be batched in order to ensure that the change is reflected as soon as possible.
   * @param itemApplicationUnlinkRequest  (required)
   * @return Call&lt;ItemApplicationUnlinkResponse&gt;
   * 
   * @see <a href="none">Unlink a user’s connected application Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("item/application/unlink")
  Call<ItemApplicationUnlinkResponse> itemApplicationUnlink(
    @retrofit2.http.Body ItemApplicationUnlinkRequest itemApplicationUnlinkRequest
  );

  /**
   * Create public token
   * Note: As of July 2020, the &#x60;/item/public_token/create&#x60; endpoint is deprecated. Instead, use &#x60;/link/token/create&#x60; with an &#x60;access_token&#x60; to create a Link token for use with [update mode](https://plaid.com/docs/link/update-mode).  If you need your user to take action to restore or resolve an error associated with an Item, generate a public token with the &#x60;/item/public_token/create&#x60; endpoint and then initialize Link with that &#x60;public_token&#x60;.  A &#x60;public_token&#x60; is one-time use and expires after 30 minutes. You use a &#x60;public_token&#x60; to initialize Link in [update mode](https://plaid.com/docs/link/update-mode) for a particular Item. You can generate a &#x60;public_token&#x60; for an Item even if you did not use Link to create the Item originally.  The &#x60;/item/public_token/create&#x60; endpoint is **not** used to create your initial &#x60;public_token&#x60;. If you have not already received an &#x60;access_token&#x60; for a specific Item, use Link to obtain your &#x60;public_token&#x60; instead. See the [Quickstart](https://plaid.com/docs/quickstart) for more information.
   * @param itemPublicTokenCreateRequest  (required)
   * @return Call&lt;ItemPublicTokenCreateResponse&gt;
   * 
   * @see <a href="/api/link/#itempublic_tokencreate">Create public token Documentation</a>
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
   * &#x60;/item/import&#x60; creates an Item via your Plaid Exchange Integration and returns an &#x60;access_token&#x60;. As part of an &#x60;/item/import&#x60; request, you will include a User ID (&#x60;user_auth.user_id&#x60;) and Authentication Token (&#x60;user_auth.auth_token&#x60;) that enable data aggregation through your Plaid Exchange API endpoints. These authentication principals are to be chosen by you.  Upon creating an Item via &#x60;/item/import&#x60;, Plaid will automatically begin an extraction of that Item through the Plaid Exchange infrastructure you have already integrated.
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
   * Exchange a Link &#x60;public_token&#x60; for an API &#x60;access_token&#x60;. Link hands off the &#x60;public_token&#x60; client-side via the &#x60;onSuccess&#x60; callback once a user has successfully created an Item. The &#x60;public_token&#x60; is ephemeral and expires after 30 minutes. An &#x60;access_token&#x60; does not expire, but can be revoked by calling &#x60;/item/remove&#x60;.  The response also includes an &#x60;item_id&#x60; that should be stored with the &#x60;access_token&#x60;. The &#x60;item_id&#x60; is used to identify an Item in a webhook. The &#x60;item_id&#x60; can also be retrieved by making an &#x60;/item/get&#x60; request.
   * @param itemPublicTokenExchangeRequest  (required)
   * @return Call&lt;ItemPublicTokenExchangeResponse&gt;
   * 
   * @see <a href="/api/items/#itempublic_tokenexchange">Exchange public token for an access token Documentation</a>
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
   * The &#x60;/item/remove&#x60; endpoint allows you to remove an Item. Once removed, the &#x60;access_token&#x60;, as well as any processor tokens or bank account tokens associated with the Item, is no longer valid and cannot be used to access any data that was associated with the Item.   Calling &#x60;/item/remove&#x60; is a recommended best practice when offboarding users or if a user chooses to disconnect an account linked via Plaid. For subscription products, such as Transactions, Liabilities, and Investments, calling &#x60;/item/remove&#x60; is required to end subscription billing for the Item.  In Limited Production, calling &#x60;/item/remove&#x60; does not impact the number of remaining Limited Production Items you have available.  Removing an Item does not affect any Asset Reports or Audit Copies you have already created, which will remain accessible until you remove access to them specifically using the &#x60;/asset_report/remove&#x60; endpoint.  Also note that for certain OAuth-based institutions, an Item removed via &#x60;/item/remove&#x60; may still show as an active connection in the institution&#39;s OAuth permission manager.  API versions 2019-05-29 and earlier return a &#x60;removed&#x60; boolean as part of the response.
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
   * The POST &#x60;/item/webhook/update&#x60; allows you to update the webhook URL associated with an Item. This request triggers a [&#x60;WEBHOOK_UPDATE_ACKNOWLEDGED&#x60;](https://plaid.com/docs/api/items/#webhook_update_acknowledged) webhook to the newly specified webhook URL.
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
   * The &#x60;/liabilities/get&#x60; endpoint returns various details about an Item with loan or credit accounts. Liabilities data is available primarily for US financial institutions, with some limited coverage of Canadian institutions. Currently supported account types are account type &#x60;credit&#x60; with account subtype &#x60;credit card&#x60; or &#x60;paypal&#x60;, and account type &#x60;loan&#x60; with account subtype &#x60;student&#x60; or &#x60;mortgage&#x60;. To limit accounts listed in Link to types and subtypes supported by Liabilities, you can use the &#x60;account_filters&#x60; parameter when [creating a Link token](https://plaid.com/docs/api/link/#linktokencreate).  The types of information returned by Liabilities can include balances and due dates, loan terms, and account details such as original loan amount and guarantor. Data is refreshed approximately once per day; the latest data can be retrieved by calling &#x60;/liabilities/get&#x60;.
   * @param liabilitiesGetRequest  (required)
   * @return Call&lt;LiabilitiesGetResponse&gt;
   * 
   * @see <a href="/api/products/liabilities/#liabilitiesget">Retrieve Liabilities data Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("liabilities/get")
  Call<LiabilitiesGetResponse> liabilitiesGet(
    @retrofit2.http.Body LiabilitiesGetRequest liabilitiesGetRequest
  );

  /**
   * Create Hosted Link session
   * Use the &#x60;/link_delivery/create&#x60; endpoint to create a Hosted Link session.
   * @param linkDeliveryCreateRequest  (required)
   * @return Call&lt;LinkDeliveryCreateResponse&gt;
   * 
   * @see <a href="/assets/waitlist/hosted-link/">Create Hosted Link session Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("link_delivery/create")
  Call<LinkDeliveryCreateResponse> linkDeliveryCreate(
    @retrofit2.http.Body LinkDeliveryCreateRequest linkDeliveryCreateRequest
  );

  /**
   * Get Hosted Link session
   * Use the &#x60;/link_delivery/get&#x60; endpoint to get the status of a Hosted Link session.
   * @param linkDeliveryGetRequest  (required)
   * @return Call&lt;LinkDeliveryGetResponse&gt;
   * 
   * @see <a href="/assets/waitlist/hosted-link/">Get Hosted Link session Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("link_delivery/get")
  Call<LinkDeliveryGetResponse> linkDeliveryGet(
    @retrofit2.http.Body LinkDeliveryGetRequest linkDeliveryGetRequest
  );

  /**
   * Exchange the Link Correlation Id for a Link Token
   * Exchange an OAuth &#x60;link_correlation_id&#x60; for the corresponding &#x60;link_token&#x60;. The &#x60;link_correlation_id&#x60; is only available for &#39;payment_initiation&#39; products and is provided to the client via the OAuth &#x60;redirect_uri&#x60; as a query parameter. The &#x60;link_correlation_id&#x60; is ephemeral and expires in a brief period, after which it can no longer be exchanged for the &#39;link_token&#39;.
   * @param linkOAuthCorrelationIdExchangeRequest  (required)
   * @return Call&lt;LinkOAuthCorrelationIdExchangeResponse&gt;
   * 
   * @see <a href="/api/oauth/#linkcorrelationid">Exchange the Link Correlation Id for a Link Token Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("link/oauth/correlation_id/exchange")
  Call<LinkOAuthCorrelationIdExchangeResponse> linkOauthCorrelationIdExchange(
    @retrofit2.http.Body LinkOAuthCorrelationIdExchangeRequest linkOAuthCorrelationIdExchangeRequest
  );

  /**
   * Check profile eligibility
   * The &#x60;/link/profile/eligibility/check&#x60; endpoint can be used to check whether a user with the supplied phone number has a saved profile that satisfies customer-defined eligibility requirements.
   * @param linkProfileEligibilityCheckRequest  (required)
   * @return Call&lt;LinkProfileEligibilityCheckResponse&gt;
   * 
   * @see <a href="/api/link/#profileeligibilitycheck">Check profile eligibility Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("link/profile/eligibility/check")
  Call<LinkProfileEligibilityCheckResponse> linkProfileEligibilityCheck(
    @retrofit2.http.Body LinkProfileEligibilityCheckRequest linkProfileEligibilityCheckRequest
  );

  /**
   * Create Link Token
   * The &#x60;/link/token/create&#x60; endpoint creates a &#x60;link_token&#x60;, which is required as a parameter when initializing Link. Once Link has been initialized, it returns a &#x60;public_token&#x60;. For most Plaid products, the &#x60;public_token&#x60; is saved and exchanged for an &#x60;access_token&#x60; via &#x60;/item/public_token/exchange&#x60; as part of the main Link flow. For more details, see the [Link flow overview](https://plaid.com/docs/link/#link-flow-overview).  A &#x60;link_token&#x60; generated by &#x60;/link/token/create&#x60; is also used to initialize other Link flows, such as the [update mode](https://plaid.com/docs/link/update-mode) flow for tokens with expired credentials, or the Identity Verification flow.
   * @param linkTokenCreateRequest  (required)
   * @return Call&lt;LinkTokenCreateResponse&gt;
   * 
   * @see <a href="/api/link/#linktokencreate">Create Link Token Documentation</a>
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
   * The &#x60;/link/token/get&#x60; endpoint gets information about a Link session, including all callbacks fired during the session along with their metadata, including the public token. This endpoint is used with Link flows that don&#39;t provide a public token via frontend callbacks, such as the [Hosted Link flow](https://plaid.com/docs/link/hosted-link/) and the [Multi-Item Link flow](https://plaid.com/docs/link/multi-item-link/). It also can be useful for debugging purposes.
   * @param linkTokenGetRequest  (required)
   * @return Call&lt;LinkTokenGetResponse&gt;
   * 
   * @see <a href="/api/link/#linktokenget">Get Link Token Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("link/token/get")
  Call<LinkTokenGetResponse> linkTokenGet(
    @retrofit2.http.Body LinkTokenGetRequest linkTokenGetRequest
  );

  /**
   * Retrieve network insights for the provided &#x60;access_tokens&#x60;
   * This endpoint allows you to retrieve the Network Insights from a list of &#x60;access_tokens&#x60;.
   * @param networkInsightsReportGetRequest  (required)
   * @return Call&lt;NetworkInsightsReportGetResponse&gt;
   * 
   * @see <a href="/api/network_insights/report/#get">Retrieve network insights for the provided &#x60;access_tokens&#x60; Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("network_insights/report/get")
  Call<NetworkInsightsReportGetResponse> networkInsightsReportGet(
    @retrofit2.http.Body NetworkInsightsReportGetRequest networkInsightsReportGetRequest
  );

  /**
   * Creates a new end customer for a Plaid reseller.
   * The &#x60;/partner/customer/create&#x60; endpoint is used by reseller partners to create end customers.
   * @param partnerCustomerCreateRequest  (required)
   * @return Call&lt;PartnerCustomerCreateResponse&gt;
   * 
   * @see <a href="/api/partner/#partnercustomercreate">Creates a new end customer for a Plaid reseller. Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("partner/customer/create")
  Call<PartnerCustomerCreateResponse> partnerCustomerCreate(
    @retrofit2.http.Body PartnerCustomerCreateRequest partnerCustomerCreateRequest
  );

  /**
   * Enables a Plaid reseller&#39;s end customer in the Production environment.
   * The &#x60;/partner/customer/enable&#x60; endpoint is used by reseller partners to enable an end customer in the full Production environment.
   * @param partnerCustomerEnableRequest  (required)
   * @return Call&lt;PartnerCustomerEnableResponse&gt;
   * 
   * @see <a href="/api/partner/#partnercustomerenable">Enables a Plaid reseller&#39;s end customer in the Production environment. Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("partner/customer/enable")
  Call<PartnerCustomerEnableResponse> partnerCustomerEnable(
    @retrofit2.http.Body PartnerCustomerEnableRequest partnerCustomerEnableRequest
  );

  /**
   * Returns a Plaid reseller&#39;s end customer.
   * The &#x60;/partner/customer/get&#x60; endpoint is used by reseller partners to retrieve data about a single end customer.
   * @param partnerCustomerGetRequest  (required)
   * @return Call&lt;PartnerCustomerGetResponse&gt;
   * 
   * @see <a href="/api/partner/#partnercustomerget">Returns a Plaid reseller&#39;s end customer. Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("partner/customer/get")
  Call<PartnerCustomerGetResponse> partnerCustomerGet(
    @retrofit2.http.Body PartnerCustomerGetRequest partnerCustomerGetRequest
  );

  /**
   * Returns OAuth-institution registration information for a given end customer.
   * The &#x60;/partner/customer/oauth_institutions/get&#x60; endpoint is used by reseller partners to retrieve OAuth-institution registration information about a single end customer. To learn how to set up a webhook to listen to status update events, visit the [reseller documentation](https://plaid.com/docs/account/resellers/#enabling-end-customers).
   * @param partnerCustomerOAuthInstitutionsGetRequest  (required)
   * @return Call&lt;PartnerCustomerOAuthInstitutionsGetResponse&gt;
   * 
   * @see <a href="/api/partner/#partnercustomeroauth_institutionsget">Returns OAuth-institution registration information for a given end customer. Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("partner/customer/oauth_institutions/get")
  Call<PartnerCustomerOAuthInstitutionsGetResponse> partnerCustomerOauthInstitutionsGet(
    @retrofit2.http.Body PartnerCustomerOAuthInstitutionsGetRequest partnerCustomerOAuthInstitutionsGetRequest
  );

  /**
   * Removes a Plaid reseller&#39;s end customer.
   * The &#x60;/partner/customer/remove&#x60; endpoint is used by reseller partners to remove an end customer. Removing an end customer will remove it from view in the Plaid Dashboard and deactivate its API keys. This endpoint can only be used to remove an end customer that has not yet been enabled in full Production.
   * @param partnerCustomerRemoveRequest  (required)
   * @return Call&lt;PartnerCustomerRemoveResponse&gt;
   * 
   * @see <a href="/api/partner/#partnercustomerremove">Removes a Plaid reseller&#39;s end customer. Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("partner/customer/remove")
  Call<PartnerCustomerRemoveResponse> partnerCustomerRemove(
    @retrofit2.http.Body PartnerCustomerRemoveRequest partnerCustomerRemoveRequest
  );

  /**
   * Create payment consent
   * The &#x60;/payment_initiation/consent/create&#x60; endpoint is used to create a payment consent, which can be used to initiate payments on behalf of the user. Payment consents are created with &#x60;UNAUTHORISED&#x60; status by default and must be authorised by the user before payments can be initiated.  Consents can be limited in time and scope, and have constraints that describe limitations for payments.
   * @param paymentInitiationConsentCreateRequest  (required)
   * @return Call&lt;PaymentInitiationConsentCreateResponse&gt;
   * 
   * @see <a href="/api/products/payment-initiation/#payment_initiationconsentcreate">Create payment consent Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("payment_initiation/consent/create")
  Call<PaymentInitiationConsentCreateResponse> paymentInitiationConsentCreate(
    @retrofit2.http.Body PaymentInitiationConsentCreateRequest paymentInitiationConsentCreateRequest
  );

  /**
   * Get payment consent
   * The &#x60;/payment_initiation/consent/get&#x60; endpoint can be used to check the status of a payment consent, as well as to receive basic information such as recipient and constraints.
   * @param paymentInitiationConsentGetRequest  (required)
   * @return Call&lt;PaymentInitiationConsentGetResponse&gt;
   * 
   * @see <a href="/api/products/payment-initiation/#payment_initiationconsentget">Get payment consent Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("payment_initiation/consent/get")
  Call<PaymentInitiationConsentGetResponse> paymentInitiationConsentGet(
    @retrofit2.http.Body PaymentInitiationConsentGetRequest paymentInitiationConsentGetRequest
  );

  /**
   * Execute a single payment using consent
   * The &#x60;/payment_initiation/consent/payment/execute&#x60; endpoint can be used to execute payments using payment consent.
   * @param paymentInitiationConsentPaymentExecuteRequest  (required)
   * @return Call&lt;PaymentInitiationConsentPaymentExecuteResponse&gt;
   * 
   * @see <a href="/api/products/payment-initiation/#payment_initiationconsentpaymentexecute">Execute a single payment using consent Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("payment_initiation/consent/payment/execute")
  Call<PaymentInitiationConsentPaymentExecuteResponse> paymentInitiationConsentPaymentExecute(
    @retrofit2.http.Body PaymentInitiationConsentPaymentExecuteRequest paymentInitiationConsentPaymentExecuteRequest
  );

  /**
   * Revoke payment consent
   * The &#x60;/payment_initiation/consent/revoke&#x60; endpoint can be used to revoke the payment consent. Once the consent is revoked, it is not possible to initiate payments using it.
   * @param paymentInitiationConsentRevokeRequest  (required)
   * @return Call&lt;PaymentInitiationConsentRevokeResponse&gt;
   * 
   * @see <a href="/api/products/payment-initiation/#payment_initiationconsentrevoke">Revoke payment consent Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("payment_initiation/consent/revoke")
  Call<PaymentInitiationConsentRevokeResponse> paymentInitiationConsentRevoke(
    @retrofit2.http.Body PaymentInitiationConsentRevokeRequest paymentInitiationConsentRevokeRequest
  );

  /**
   * Create a payment
   * After creating a payment recipient, you can use the &#x60;/payment_initiation/payment/create&#x60; endpoint to create a payment to that recipient.  Payments can be one-time or standing order (recurring) and can be denominated in either EUR, GBP or other chosen [currency](https://plaid.com/docs/api/products/payment-initiation/#payment_initiation-payment-create-request-amount-currency).  If making domestic GBP-denominated payments, your recipient must have been created with BACS numbers. In general, EUR-denominated payments will be sent via SEPA Credit Transfer, GBP-denominated payments will be sent via the Faster Payments network and for non-Eurozone markets typically via the local payment scheme, but the payment network used will be determined by the institution. Payments sent via Faster Payments will typically arrive immediately, while payments sent via SEPA Credit Transfer or other local payment schemes will typically arrive in one business day.  Standing orders (recurring payments) must be denominated in GBP and can only be sent to recipients in the UK. Once created, standing order payments cannot be modified or canceled via the API. An end user can cancel or modify a standing order directly on their banking application or website, or by contacting the bank. Standing orders will follow the payment rules of the underlying rails (Faster Payments in UK). Payments can be sent Monday to Friday, excluding bank holidays. If the pre-arranged date falls on a weekend or bank holiday, the payment is made on the next working day. It is not possible to guarantee the exact time the payment will reach the recipient’s account, although at least 90% of standing order payments are sent by 6am.  In Limited Production, payments must be below 5 GBP or other chosen [currency](https://plaid.com/docs/api/products/payment-initiation/#payment_initiation-payment-create-request-amount-currency), and standing orders, variable recurring payments, and Virtual Accounts are not supported.
   * @param paymentInitiationPaymentCreateRequest  (required)
   * @return Call&lt;PaymentInitiationPaymentCreateResponse&gt;
   * 
   * @see <a href="/api/products/payment-initiation/#payment_initiationpaymentcreate">Create a payment Documentation</a>
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
   * @see <a href="/api/products/payment-initiation/#payment_initiationpaymentget">Get payment details Documentation</a>
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
   * @see <a href="/api/products/payment-initiation/#payment_initiationpaymentlist">List payments Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("payment_initiation/payment/list")
  Call<PaymentInitiationPaymentListResponse> paymentInitiationPaymentList(
    @retrofit2.http.Body PaymentInitiationPaymentListRequest paymentInitiationPaymentListRequest
  );

  /**
   * Reverse an existing payment
   * Reverse a settled payment from a Plaid virtual account.  The original payment must be in a settled state to be refunded. To refund partially, specify the amount as part of the request. If the amount is not specified, the refund amount will be equal to all of the remaining payment amount that has not been refunded yet.  The refund will go back to the source account that initiated the payment. The original payment must have been initiated to a Plaid virtual account so that this account can be used to initiate the refund.  Providing counterparty information such as date of birth and address increases  the likelihood of refund being successful without human intervention. 
   * @param paymentInitiationPaymentReverseRequest  (required)
   * @return Call&lt;PaymentInitiationPaymentReverseResponse&gt;
   * 
   * @see <a href="/api/products/payment-initiation/#payment_initiationpaymentreverse">Reverse an existing payment Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("payment_initiation/payment/reverse")
  Call<PaymentInitiationPaymentReverseResponse> paymentInitiationPaymentReverse(
    @retrofit2.http.Body PaymentInitiationPaymentReverseRequest paymentInitiationPaymentReverseRequest
  );

  /**
   * Create payment recipient
   * Create a payment recipient for payment initiation.  The recipient must be in Europe, within a country that is a member of the Single Euro Payment Area (SEPA) or a non-Eurozone country [supported](https://plaid.com/global) by Plaid. For a standing order (recurring) payment, the recipient must be in the UK.  It is recommended to use &#x60;bacs&#x60; in the UK and &#x60;iban&#x60; in EU.  The endpoint is idempotent: if a developer has already made a request with the same payment details, Plaid will return the same &#x60;recipient_id&#x60;. 
   * @param paymentInitiationRecipientCreateRequest  (required)
   * @return Call&lt;PaymentInitiationRecipientCreateResponse&gt;
   * 
   * @see <a href="/api/products/payment-initiation/#payment_initiationrecipientcreate">Create payment recipient Documentation</a>
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
   * @see <a href="/api/products/payment-initiation/#payment_initiationrecipientget">Get payment recipient Documentation</a>
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
   * @see <a href="/api/products/payment-initiation/#payment_initiationrecipientlist">List payment recipients Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("payment_initiation/recipient/list")
  Call<PaymentInitiationRecipientListResponse> paymentInitiationRecipientList(
    @retrofit2.http.Body PaymentInitiationRecipientListRequest paymentInitiationRecipientListRequest
  );

  /**
   * Create payment profile
   * Use &#x60;/payment_profile/create&#x60; endpoint to create a new payment profile. To initiate the account linking experience, call &#x60;/link/token/create&#x60; and provide the &#x60;payment_profile_token&#x60; in the &#x60;transfer.payment_profile_token&#x60; field. You can then use the &#x60;payment_profile_token&#x60; when creating transfers using &#x60;/transfer/authorization/create&#x60; and &#x60;/transfer/create&#x60;.
   * @param paymentProfileCreateRequest  (required)
   * @return Call&lt;PaymentProfileCreateResponse&gt;
   * @deprecated
   * 
   * @see <a href="/api/products/transfer/#payment_profilecreate">Create payment profile Documentation</a>
   */
  @Deprecated
  @Headers({
    "Content-Type:application/json"
  })
  @POST("payment_profile/create")
  Call<PaymentProfileCreateResponse> paymentProfileCreate(
    @retrofit2.http.Body PaymentProfileCreateRequest paymentProfileCreateRequest
  );

  /**
   * Get payment profile
   * Use &#x60;/payment_profile/get&#x60; endpoint to get the status of a given Payment Profile.
   * @param paymentProfileGetRequest  (required)
   * @return Call&lt;PaymentProfileGetResponse&gt;
   * @deprecated
   * 
   * @see <a href="/api/products/transfer/#payment_profileget">Get payment profile Documentation</a>
   */
  @Deprecated
  @Headers({
    "Content-Type:application/json"
  })
  @POST("payment_profile/get")
  Call<PaymentProfileGetResponse> paymentProfileGet(
    @retrofit2.http.Body PaymentProfileGetRequest paymentProfileGetRequest
  );

  /**
   * Remove payment profile
   * Use the &#x60;/payment_profile/remove&#x60; endpoint to remove a given Payment Profile. Once it’s removed, it can no longer be used to create transfers.
   * @param paymentProfileRemoveRequest  (required)
   * @return Call&lt;PaymentProfileRemoveResponse&gt;
   * @deprecated
   * 
   * @see <a href="/api/products/transfer/#payment_profileremove">Remove payment profile Documentation</a>
   */
  @Deprecated
  @Headers({
    "Content-Type:application/json"
  })
  @POST("payment_profile/remove")
  Call<PaymentProfileRemoveResponse> paymentProfileRemove(
    @retrofit2.http.Body PaymentProfileRemoveRequest paymentProfileRemoveRequest
  );

  /**
   * Retrieve the account associated with a processor token
   * This endpoint returns the account associated with a given processor token.  This endpoint retrieves cached information, rather than extracting fresh information from the institution. As a result, the account balance returned may not be up-to-date; for realtime balance information, use &#x60;/processor/balance/get&#x60; instead. Note that some information is nullable. 
   * @param processorAccountGetRequest  (required)
   * @return Call&lt;ProcessorAccountGetResponse&gt;
   * 
   * @see <a href="/api/processor-partners/#processoraccountget">Retrieve the account associated with a processor token Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("processor/account/get")
  Call<ProcessorAccountGetResponse> processorAccountGet(
    @retrofit2.http.Body ProcessorAccountGetRequest processorAccountGetRequest
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
   * The &#x60;/processor/auth/get&#x60; endpoint returns the bank account and bank identification number (such as the routing number, for US accounts), for a checking or savings account that&#39;&#39;s associated with a given &#x60;processor_token&#x60;. The endpoint also returns high-level account data and balances when available.  Versioning note: API versions 2019-05-29 and earlier use a different schema for the &#x60;numbers&#x60; object returned by this endpoint. For details, see [Plaid API versioning](https://plaid.com/docs/api/versioning/#version-2020-09-14). 
   * @param processorAuthGetRequest  (required)
   * @return Call&lt;ProcessorAuthGetResponse&gt;
   * 
   * @see <a href="/api/processor-partners/#processorauthget">Retrieve Auth data Documentation</a>
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
   * @see <a href="/api/processor-partners/#processorbalanceget">Retrieve Balance data Documentation</a>
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
   * @see <a href="/api/processor-partners/#bank_transfercreate">Create a bank transfer as a processor Documentation</a>
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
   * @see <a href="/api/processor-partners/#processoridentityget">Retrieve Identity data Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("processor/identity/get")
  Call<ProcessorIdentityGetResponse> processorIdentityGet(
    @retrofit2.http.Body ProcessorIdentityGetRequest processorIdentityGetRequest
  );

  /**
   * Retrieve identity match score
   * The &#x60;/processor/identity/match&#x60; endpoint generates a match score, which indicates how well the provided identity data matches the identity information on file with the account holder&#39;s financial institution.  Fields within the &#x60;balances&#x60; object will always be null when retrieved by &#x60;/identity/match&#x60;. Instead, use the free &#x60;/accounts/get&#x60; endpoint to request balance cached data, or &#x60;/accounts/balance/get&#x60; for real-time data.
   * @param processorIdentityMatchRequest  (required)
   * @return Call&lt;ProcessorIdentityMatchResponse&gt;
   * 
   * @see <a href="/api/processor-partners/#processoridentitymatch">Retrieve identity match score Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("processor/identity/match")
  Call<ProcessorIdentityMatchResponse> processorIdentityMatch(
    @retrofit2.http.Body ProcessorIdentityMatchRequest processorIdentityMatchRequest
  );

  /**
   * Retrieve Liabilities data
   * The &#x60;/processor/liabilities/get&#x60; endpoint returns various details about a loan or credit account. Liabilities data is available primarily for US financial institutions, with some limited coverage of Canadian institutions. Currently supported account types are account type &#x60;credit&#x60; with account subtype &#x60;credit card&#x60; or &#x60;paypal&#x60;, and account type &#x60;loan&#x60; with account subtype &#x60;student&#x60; or &#x60;mortgage&#x60;.  The types of information returned by Liabilities can include balances and due dates, loan terms, and account details such as original loan amount and guarantor. Data is refreshed approximately once per day; the latest data can be retrieved by calling &#x60;/processor/liabilities/get&#x60;.  Note: This request may take some time to complete if &#x60;liabilities&#x60; was not specified as an initial product when creating the processor token. This is because Plaid must communicate directly with the institution to retrieve the additional data.
   * @param processorLiabilitiesGetRequest  (required)
   * @return Call&lt;ProcessorLiabilitiesGetResponse&gt;
   * 
   * @see <a href="/api/processor-partners/#processorliabilitiesget">Retrieve Liabilities data Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("processor/liabilities/get")
  Call<ProcessorLiabilitiesGetResponse> processorLiabilitiesGet(
    @retrofit2.http.Body ProcessorLiabilitiesGetRequest processorLiabilitiesGetRequest
  );

  /**
   * Report whether you initiated an ACH transaction
   * After calling &#x60;/processor/signal/evaluate&#x60;, call &#x60;/processor/signal/decision/report&#x60; to report whether the transaction was initiated.  If you are using the [Plaid Transfer product](https://www.plaid.com/docs/transfer) to create transfers, it is not necessary to use this endpoint, as Plaid already knows whether the transfer was initiated.
   * @param processorSignalDecisionReportRequest  (required)
   * @return Call&lt;ProcessorSignalDecisionReportResponse&gt;
   * 
   * @see <a href="/api/processor-partners/#processorsignaldecisionreport">Report whether you initiated an ACH transaction Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("processor/signal/decision/report")
  Call<ProcessorSignalDecisionReportResponse> processorSignalDecisionReport(
    @retrofit2.http.Body ProcessorSignalDecisionReportRequest processorSignalDecisionReportRequest
  );

  /**
   * Evaluate a planned ACH transaction
   * Use &#x60;/processor/signal/evaluate&#x60; to evaluate a planned ACH transaction as a processor to get a return risk assessment (such as a risk score and risk tier) and additional risk signals.  In order to obtain a valid score for an ACH transaction, Plaid must have an access token for the account, and the Item must be healthy (receiving product updates) or have recently been in a healthy state. If the transaction does not meet eligibility requirements, an error will be returned corresponding to the underlying cause. If &#x60;/processor/signal/evaluate&#x60; is called on the same transaction multiple times within a 24-hour period, cached results may be returned. For more information please refer to our error documentation on [item errors](/docs/errors/item/) and [Link in Update Mode](/docs/link/update-mode/).  Note: This request may take some time to complete if Signal is being added to an existing Item. This is because Plaid must communicate directly with the institution when retrieving the data for the first time. To reduce this latency, you can call &#x60;/signal/prepare&#x60; on the Item before you need to request Signal data.
   * @param processorSignalEvaluateRequest  (required)
   * @return Call&lt;ProcessorSignalEvaluateResponse&gt;
   * 
   * @see <a href="/api/processor-partners/#processorsignalevaluate">Evaluate a planned ACH transaction Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("processor/signal/evaluate")
  Call<ProcessorSignalEvaluateResponse> processorSignalEvaluate(
    @retrofit2.http.Body ProcessorSignalEvaluateRequest processorSignalEvaluateRequest
  );

  /**
   * Opt-in a processor token to Signal
   * When a processor token is not initialized with Signal, call &#x60;/processor/signal/prepare&#x60; to opt-in that processor token to the Signal data collection process, which will improve the accuracy of the Signal score.  If this endpoint is called with a processor token that is already initialized with Signal, it will return a 200 response and will not modify the processor token.
   * @param processorSignalPrepareRequest  (required)
   * @return Call&lt;ProcessorSignalPrepareResponse&gt;
   * 
   * @see <a href="/api/processor-partners/#processorsignalprepare">Opt-in a processor token to Signal Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("processor/signal/prepare")
  Call<ProcessorSignalPrepareResponse> processorSignalPrepare(
    @retrofit2.http.Body ProcessorSignalPrepareRequest processorSignalPrepareRequest
  );

  /**
   * Report a return for an ACH transaction
   * Call the &#x60;/processor/signal/return/report&#x60; endpoint to report a returned transaction that was previously sent to the &#x60;/processor/signal/evaluate&#x60; endpoint. Your feedback will be used by the model to incorporate the latest risk trend in your portfolio.  If you are using the [Plaid Transfer product](https://www.plaid.com/docs/transfer) to create transfers, it is not necessary to use this endpoint, as Plaid already knows whether the transfer was returned.
   * @param processorSignalReturnReportRequest  (required)
   * @return Call&lt;ProcessorSignalReturnReportResponse&gt;
   * 
   * @see <a href="/api/processor-partners/#processorsignalreturnreport">Report a return for an ACH transaction Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("processor/signal/return/report")
  Call<ProcessorSignalReturnReportResponse> processorSignalReturnReport(
    @retrofit2.http.Body ProcessorSignalReturnReportRequest processorSignalReturnReportRequest
  );

  /**
   * Create Stripe bank account token
   *  Used to create a token suitable for sending to Stripe to enable Plaid-Stripe integrations. For a detailed guide on integrating Stripe, see [Add Stripe to your app](https://plaid.com/docs/auth/partnerships/stripe/).  Note that the Stripe bank account token is a one-time use token. To store bank account information for later use, you can use a Stripe customer object and create an associated bank account from the token, or you can use a Stripe Custom account and create an associated external bank account from the token. This bank account information should work indefinitely, unless the user&#39;s bank account information changes or they revoke Plaid&#39;s permissions to access their account. Stripe bank account information cannot be modified once the bank account token has been created. If you ever need to change the bank account details used by Stripe for a specific customer, have the user go through Link again and create a new bank account token from the new &#x60;access_token&#x60;.  Bank account tokens can also be revoked, using &#x60;/item/remove&#x60;.
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
   * Used to create a token suitable for sending to one of Plaid&#39;s partners to enable integrations. Note that Stripe partnerships use bank account tokens instead; see &#x60;/processor/stripe/bank_account_token/create&#x60; for creating tokens for use with Stripe integrations. Once created, a processor token for a given Item cannot be modified or updated. If the account must be linked to a new or different partner resource, create a new Item by having the user go through the Link flow again; a new processor token can then be created from the new &#x60;access_token&#x60;. Processor tokens can also be revoked, using &#x60;/item/remove&#x60;.
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
   * Get a processor token&#39;s product permissions
   * Used to get a processor token&#39;s product permissions. The &#x60;products&#x60; field will be an empty list if the processor can access all available products.
   * @param processorTokenPermissionsGetRequest  (required)
   * @return Call&lt;ProcessorTokenPermissionsGetResponse&gt;
   * 
   * @see <a href="/api/processors/#processortokenpermissionsget">Get a processor token&#39;s product permissions Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("processor/token/permissions/get")
  Call<ProcessorTokenPermissionsGetResponse> processorTokenPermissionsGet(
    @retrofit2.http.Body ProcessorTokenPermissionsGetRequest processorTokenPermissionsGetRequest
  );

  /**
   * Control a processor&#39;s access to products
   * Used to control a processor&#39;s access to products on the given processor token. By default, a processor will have access to all available products on the corresponding item. To restrict access to a particular set of products, call this endpoint with the desired products. To restore access to all available products, call this endpoint with an empty list. This endpoint can be called multiple times as your needs and your processor&#39;s needs change.
   * @param processorTokenPermissionsSetRequest  (required)
   * @return Call&lt;ProcessorTokenPermissionsSetResponse&gt;
   * 
   * @see <a href="/api/processors/#processortokenpermissionsset">Control a processor&#39;s access to products Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("processor/token/permissions/set")
  Call<ProcessorTokenPermissionsSetResponse> processorTokenPermissionsSet(
    @retrofit2.http.Body ProcessorTokenPermissionsSetRequest processorTokenPermissionsSetRequest
  );

  /**
   * Update a processor token&#39;s webhook URL
   * This endpoint allows you, the processor, to update the webhook URL associated with a processor token. This request triggers a &#x60;WEBHOOK_UPDATE_ACKNOWLEDGED&#x60; webhook to the newly specified webhook URL.
   * @param processorTokenWebhookUpdateRequest  (required)
   * @return Call&lt;ProcessorTokenWebhookUpdateResponse&gt;
   * 
   * @see <a href="/api/processor-partners/#processortokenwebhookupdate">Update a processor token&#39;s webhook URL Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("processor/token/webhook/update")
  Call<ProcessorTokenWebhookUpdateResponse> processorTokenWebhookUpdate(
    @retrofit2.http.Body ProcessorTokenWebhookUpdateRequest processorTokenWebhookUpdateRequest
  );

  /**
   * Get transaction data
   * The &#x60;/processor/transactions/get&#x60; endpoint allows developers to receive user-authorized transaction data for credit, depository, and some loan-type accounts (only those with account subtype &#x60;student&#x60;; coverage may be limited). Transaction data is standardized across financial institutions, and in many cases transactions are linked to a clean name, entity type, location, and category. Similarly, account data is standardized and returned with a clean name, number, balance, and other meta information where available.  Transactions are returned in reverse-chronological order, and the sequence of transaction ordering is stable and will not shift.  Transactions are not immutable and can also be removed altogether by the institution; a removed transaction will no longer appear in &#x60;/processor/transactions/get&#x60;.  For more details, see [Pending and posted transactions](https://plaid.com/docs/transactions/transactions-data/#pending-and-posted-transactions).  Due to the potentially large number of transactions associated with a processor token, results are paginated. Manipulate the &#x60;count&#x60; and &#x60;offset&#x60; parameters in conjunction with the &#x60;total_transactions&#x60; response body field to fetch all available transactions.  Data returned by &#x60;/processor/transactions/get&#x60; will be the data available for the processor token as of the most recent successful check for new transactions. Plaid typically checks for new data multiple times a day, but these checks may occur less frequently, such as once a day, depending on the institution. To force Plaid to check for new transactions, you can use the &#x60;/processor/transactions/refresh&#x60; endpoint.  Note that data may not be immediately available to &#x60;/processor/transactions/get&#x60;. Plaid will begin to prepare transactions data upon Item link, if Link was initialized with &#x60;transactions&#x60;, or upon the first call to &#x60;/processor/transactions/get&#x60;, if it wasn&#39;t. If no transaction history is ready when &#x60;/processor/transactions/get&#x60; is called, it will return a &#x60;PRODUCT_NOT_READY&#x60; error.  To receive Transactions webhooks for a processor token, set its webhook URL via the [&#x60;/processor/token/webhook/update&#x60;](https://plaid.com/docs/api/processor-partners/#processortokenwebhookupdate) endpoint.
   * @param processorTransactionsGetRequest  (required)
   * @return Call&lt;ProcessorTransactionsGetResponse&gt;
   * 
   * @see <a href="/api/processor-partners/#processortransactionsget">Get transaction data Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("processor/transactions/get")
  Call<ProcessorTransactionsGetResponse> processorTransactionsGet(
    @retrofit2.http.Body ProcessorTransactionsGetRequest processorTransactionsGetRequest
  );

  /**
   * Fetch recurring transaction streams
   * The &#x60;/processor/transactions/recurring/get&#x60; endpoint allows developers to receive a summary of the recurring outflow and inflow streams (expenses and deposits) from a user’s checking, savings or credit card accounts. Additionally, Plaid provides key insights about each recurring stream including the category, merchant, last amount, and more. Developers can use these insights to build tools and experiences that help their users better manage cash flow, monitor subscriptions, reduce spend, and stay on track with bill payments.  This endpoint is offered as an add-on to Transactions. To request access to this endpoint, submit a [product access request](https://dashboard.plaid.com/team/products) or contact your Plaid account manager.  This endpoint can only be called on a processor token that has already been initialized with Transactions (either during Link, by specifying it in &#x60;/link/token/create&#x60;; or after Link, by calling &#x60;/processor/transactions/get&#x60; or &#x60;/processor/transactions/sync&#x60;). Once all historical transactions have been fetched, call &#x60;/processor/transactions/recurring/get&#x60; to receive the Recurring Transactions streams and subscribe to the [&#x60;RECURRING_TRANSACTIONS_UPDATE&#x60;](https://plaid.com/docs/api/products/transactions/#recurring_transactions_update) webhook. To know when historical transactions have been fetched, if you are using &#x60;/processor/transactions/sync&#x60; listen for the [&#x60;SYNC_UPDATES_AVAILABLE&#x60;](https://plaid.com/docs/api/products/transactions/#SyncUpdatesAvailableWebhook-historical-update-complete) webhook and check that the &#x60;historical_update_complete&#x60; field in the payload is &#x60;true&#x60;. If using &#x60;/processor/transactions/get&#x60;, listen for the [&#x60;HISTORICAL_UPDATE&#x60;](https://plaid.com/docs/api/products/transactions/#historical_update) webhook.  After the initial call, you can call &#x60;/processor/transactions/recurring/get&#x60; endpoint at any point in the future to retrieve the latest summary of recurring streams. Listen to the [&#x60;RECURRING_TRANSACTIONS_UPDATE&#x60;](https://plaid.com/docs/api/products/transactions/#recurring_transactions_update) webhook to be notified when new updates are available.  To receive Transactions webhooks for a processor token, set its webhook URL via the [&#x60;/processor/token/webhook/update&#x60;](https://plaid.com/docs/api/processor-partners/#processortokenwebhookupdate) endpoint.
   * @param processorTransactionsRecurringGetRequest  (required)
   * @return Call&lt;ProcessorTransactionsRecurringGetResponse&gt;
   * 
   * @see <a href="/api/processor-partners/#processortransactionsrecurringget">Fetch recurring transaction streams Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("processor/transactions/recurring/get")
  Call<ProcessorTransactionsRecurringGetResponse> processorTransactionsRecurringGet(
    @retrofit2.http.Body ProcessorTransactionsRecurringGetRequest processorTransactionsRecurringGetRequest
  );

  /**
   * Refresh transaction data
   * &#x60;/processor/transactions/refresh&#x60; is an optional endpoint for users of the Transactions product. It initiates an on-demand extraction to fetch the newest transactions for a processor token. This on-demand extraction takes place in addition to the periodic extractions that automatically occur one or more times per day for any Transactions-enabled processor token. If changes to transactions are discovered after calling &#x60;/processor/transactions/refresh&#x60;, Plaid will fire a webhook: for &#x60;/transactions/sync&#x60; users, [&#x60;SYNC_UPDATES_AVAILABLE&#x60;](https://plaid.com/docs/api/products/transactions/#sync_updates_available) will be fired if there are any transactions updated, added, or removed. For users of both &#x60;/processor/transactions/sync&#x60; and &#x60;/processor/transactions/get&#x60;, [&#x60;TRANSACTIONS_REMOVED&#x60;](https://plaid.com/docs/api/products/transactions/#transactions_removed) will be fired if any removed transactions are detected, and [&#x60;DEFAULT_UPDATE&#x60;](https://plaid.com/docs/api/products/transactions/#default_update) will be fired if any new transactions are detected. New transactions can be fetched by calling &#x60;/processor/transactions/get&#x60; or &#x60;/processor/transactions/sync&#x60;. Note that the &#x60;/transactions/refresh&#x60; endpoint is not supported for Capital One (&#x60;ins_128026&#x60;) non-depository accounts and will result in a &#x60;PRODUCTS_NOT_SUPPORTED&#x60; error if called on an Item that contains only non-depository accounts from that institution.  As this endpoint triggers a synchronous request for fresh data, latency may be higher than for other Plaid endpoints (typically less than 10 seconds, but occasionally up to 30 seconds or more); if you encounter errors, you may find it necessary to adjust your timeout period when making requests.  &#x60;/processor/transactions/refresh&#x60; is offered as an add-on to Transactions and has a separate [fee model](/docs/account/billing/#per-request-flat-fee). To request access to this endpoint, submit a [product access request](https://dashboard.plaid.com/team/products) or contact your Plaid account manager.
   * @param processorTransactionsRefreshRequest  (required)
   * @return Call&lt;ProcessorTransactionsRefreshResponse&gt;
   * 
   * @see <a href="/api/processor-partners/#processortransactionsrefresh">Refresh transaction data Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("processor/transactions/refresh")
  Call<ProcessorTransactionsRefreshResponse> processorTransactionsRefresh(
    @retrofit2.http.Body ProcessorTransactionsRefreshRequest processorTransactionsRefreshRequest
  );

  /**
   * Get incremental transaction updates on a processor token
   * This endpoint replaces &#x60;/processor/transactions/get&#x60; and its associated webhooks for most common use-cases.  The &#x60;/processor/transactions/sync&#x60; endpoint allows developers to subscribe to all transactions associated with a processor token and get updates synchronously in a stream-like manner, using a cursor to track which updates have already been seen. &#x60;/processor/transactions/sync&#x60; provides the same functionality as &#x60;/processor/transactions/get&#x60; and can be used instead of &#x60;/processor/transactions/get&#x60; to simplify the process of tracking transactions updates.  This endpoint provides user-authorized transaction data for &#x60;credit&#x60;, &#x60;depository&#x60;, and some loan-type accounts (only those with account subtype &#x60;student&#x60;; coverage may be limited). For transaction history from &#x60;investments&#x60; accounts, use &#x60;/investments/transactions/get&#x60; instead.  Returned transactions data is grouped into three types of update, indicating whether the transaction was added, removed, or modified since the last call to the API.  In the first call to &#x60;/processor/transactions/sync&#x60; for a processor token, the endpoint will return all historical transactions data associated with that processor token up until the time of the API call (as \&quot;adds\&quot;), which then generates a &#x60;next_cursor&#x60; for that processor token. In subsequent calls, send the &#x60;next_cursor&#x60; to receive only the changes that have occurred since the previous call.  Due to the potentially large number of transactions associated with a processor token, results are paginated. The &#x60;has_more&#x60; field specifies if additional calls are necessary to fetch all available transaction updates. Call &#x60;/processor/transactions/sync&#x60; with the new cursor, pulling all updates, until &#x60;has_more&#x60; is &#x60;false&#x60;.  When retrieving paginated updates, track both the &#x60;next_cursor&#x60; from the latest response and the original cursor from the first call in which &#x60;has_more&#x60; was &#x60;true&#x60;; if a call to &#x60;/processor/transactions/sync&#x60; fails when retrieving a paginated update, which can occur as a result of the [&#x60;TRANSACTIONS_SYNC_MUTATION_DURING_PAGINATION&#x60;](https://plaid.com/docs/errors/transactions/#transactions_sync_mutation_during_pagination) error, the entire pagination request loop must be restarted beginning with the cursor for the first page of the update, rather than retrying only the single request that failed.  Whenever new or updated transaction data becomes available, &#x60;/processor/transactions/sync&#x60; will provide these updates. Plaid typically checks for new data multiple times a day, but these checks may occur less frequently, such as once a day, depending on the institution. To force Plaid to check for new transactions, use the &#x60;/processor/transactions/refresh&#x60; endpoint.  Note that for newly created processor tokens, data may not be immediately available to &#x60;/processor/transactions/sync&#x60;. Plaid begins preparing transactions data when the corresponding Item is created, but the process can take anywhere from a few seconds to several minutes to complete, depending on the number of transactions available.  To receive Transactions webhooks for a processor token, set its webhook URL via the [&#x60;/processor/token/webhook/update&#x60;](https://plaid.com/docs/api/processor-partners/#processortokenwebhookupdate) endpoint.
   * @param processorTransactionsSyncRequest  (required)
   * @return Call&lt;ProcessorTransactionsSyncResponse&gt;
   * 
   * @see <a href="/api/processor-partners/#processortransactionssync">Get incremental transaction updates on a processor token Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("processor/transactions/sync")
  Call<ProcessorTransactionsSyncResponse> processorTransactionsSync(
    @retrofit2.http.Body ProcessorTransactionsSyncRequest processorTransactionsSyncRequest
  );

  /**
   * Retrieve a Profile
   * Returns user permissioned profile data including identity and item access tokens.
   * @param profileGetRequest  (required)
   * @return Call&lt;ProfileGetResponse&gt;
   * 
   * @see <a href="/api/profile/#profileget">Retrieve a Profile Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("profile/get")
  Call<ProfileGetResponse> profileGet(
    @retrofit2.http.Body ProfileGetRequest profileGetRequest
  );

  /**
   * Check a user&#39;s Plaid Network status
   * The &#x60;/profile/network_status/get&#x60; endpoint can be used to check whether Plaid has a matching profile for the user.
   * @param profileNetworkStatusGetRequest  (required)
   * @return Call&lt;ProfileNetworkStatusGetResponse&gt;
   * 
   * @see <a href="/api/profile/#networkstatusget">Check a user&#39;s Plaid Network status Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("profile/network_status/get")
  Call<ProfileNetworkStatusGetResponse> profileNetworkStatusGet(
    @retrofit2.http.Body ProfileNetworkStatusGetRequest profileNetworkStatusGetRequest
  );

  /**
   * Manually fire a bank income webhook in sandbox
   * Use the &#x60;/sandbox/bank_income/fire_webhook&#x60; endpoint to manually trigger a Bank Income webhook in the Sandbox environment.
   * @param sandboxBankIncomeFireWebhookRequest  (required)
   * @return Call&lt;SandboxBankIncomeFireWebhookResponse&gt;
   * 
   * @see <a href="/api/sandbox/#sandboxbankincomefire_webhook">Manually fire a bank income webhook in sandbox Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("sandbox/bank_income/fire_webhook")
  Call<SandboxBankIncomeFireWebhookResponse> sandboxBankIncomeFireWebhook(
    @retrofit2.http.Body SandboxBankIncomeFireWebhookRequest sandboxBankIncomeFireWebhookRequest
  );

  /**
   * Manually fire a Bank Transfer webhook
   * Use the &#x60;/sandbox/bank_transfer/fire_webhook&#x60; endpoint to manually trigger a Bank Transfers webhook in the Sandbox environment.
   * @param sandboxBankTransferFireWebhookRequest  (required)
   * @return Call&lt;SandboxBankTransferFireWebhookResponse&gt;
   * 
   * @see <a href="/bank-transfers/reference/#sandboxbank_transferfire_webhook">Manually fire a Bank Transfer webhook Documentation</a>
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
   * @see <a href="/bank-transfers/reference/#sandboxbank_transfersimulate">Simulate a bank transfer event in Sandbox Documentation</a>
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
   * Use the &#x60;/sandbox/income/fire_webhook&#x60; endpoint to manually trigger a Payroll or Document Income webhook in the Sandbox environment.
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
   * The &#x60;/sandbox/item/fire_webhook&#x60; endpoint is used to test that code correctly handles webhooks. This endpoint can trigger the following webhooks:  &#x60;DEFAULT_UPDATE&#x60;: Webhook to be fired for a given Sandbox Item simulating a default update event for the respective product as specified with the &#x60;webhook_type&#x60; in the request body. Valid sandbox &#x60;DEFAULT_UPDATE&#x60; responses include: &#x60;AUTH&#x60;, &#x60;IDENTITY&#x60;, &#x60;TRANSACTIONS&#x60;, &#x60;INVESTMENTS_TRANSACTIONS&#x60;, &#x60;LIABILITIES&#x60;, &#x60;HOLDINGS&#x60;. If the Item does not support the product, a &#x60;SANDBOX_PRODUCT_NOT_ENABLED&#x60; error will result.  &#x60;NEW_ACCOUNTS_AVAILABLE&#x60;: Fired to indicate that a new account is available on the Item and you can launch update mode to request access to it.  &#x60;SMS_MICRODEPOSITS_VERIFICATION&#x60;: Fired when a given same day micro-deposit item is verified via SMS verification.  &#x60;LOGIN_REPAIRED&#x60;: Fired when an Item recovers from the &#x60;ITEM_LOGIN_REQUIRED&#x60; without the user going through update mode in your app.  &#x60;RECURRING_TRANSACTIONS_UPDATE&#x60;: Recurring Transactions webhook to be fired for a given Sandbox Item. If the Item does not support Recurring Transactions, a &#x60;SANDBOX_PRODUCT_NOT_ENABLED&#x60; error will result.  &#x60;SYNC_UPDATES_AVAILABLE&#x60;: Transactions webhook to be fired for a given Sandbox Item.  If the Item does not support Transactions, a &#x60;SANDBOX_PRODUCT_NOT_ENABLED&#x60; error will result.  &#x60;PRODUCT_READY&#x60;: Assets webhook to be fired when a given asset report has been successfully generated. If the Item does not support Assets, a &#x60;SANDBOX_PRODUCT_NOT_ENABLED&#x60; error will result.  &#x60;ERROR&#x60;: Assets webhook to be fired when asset report generation has failed. If the Item does not support Assets, a &#x60;SANDBOX_PRODUCT_NOT_ENABLED&#x60; error will result.  Note that this endpoint is provided for developer ease-of-use and is not required for testing webhooks; webhooks will also fire in Sandbox under the same conditions that they would in Production (except for webhooks of type &#x60;TRANSFER&#x60;).
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
   * The &#x60;/sandbox/item/set_verification_status&#x60; endpoint can be used to change the verification status of an Item in in the Sandbox in order to simulate the Automated Micro-deposit flow.  For more information on testing Automated Micro-deposits in Sandbox, see [Auth full coverage testing](https://plaid.com/docs/auth/coverage/testing#).
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
   * Save the selected accounts when connecting to the Platypus Oauth institution
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
   * Reset the login of a Payment Profile
   * &#x60;/sandbox/payment_profile/reset_login/&#x60; forces a Payment Profile into a state where the login is no longer valid. This makes it easy to test update mode for Payment Profile in the Sandbox environment.   After calling &#x60;/sandbox/payment_profile/reset_login&#x60;, calls to the &#x60;/transfer/authorization/create&#x60; with the Payment Profile will result in a &#x60;decision_rationale&#x60; &#x60;PAYMENT_PROFILE_LOGIN_REQUIRED&#x60;. You can then use update mode for Payment Profile to restore it into a good state.   In order to invoke this endpoint, you must first [create a Payment Profile](https://plaid.com/docs/transfer/add-to-app/#create-a-payment-profile-optional) and [go through the Link flow](https://plaid.com/docs/transfer/add-to-app/#create-a-link-token).
   * @param sandboxPaymentProfileResetLoginRequest  (required)
   * @return Call&lt;SandboxPaymentProfileResetLoginResponse&gt;
   * @deprecated
   * 
   * @see <a href="/api/sandbox/#sandboxpayment_profilereset_login">Reset the login of a Payment Profile Documentation</a>
   */
  @Deprecated
  @Headers({
    "Content-Type:application/json"
  })
  @POST("sandbox/payment_profile/reset_login")
  Call<SandboxPaymentProfileResetLoginResponse> sandboxPaymentProfileResetLogin(
    @retrofit2.http.Body SandboxPaymentProfileResetLoginRequest sandboxPaymentProfileResetLoginRequest
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
   * Use the &#x60;/sandbox/public_token/create&#x60; endpoint to create a valid &#x60;public_token&#x60;  for an arbitrary institution ID, initial products, and test credentials. The created &#x60;public_token&#x60; maps to a new Sandbox Item. You can then call &#x60;/item/public_token/exchange&#x60; to exchange the &#x60;public_token&#x60; for an &#x60;access_token&#x60; and perform all API actions. &#x60;/sandbox/public_token/create&#x60; can also be used with the [&#x60;user_custom&#x60; test username](https://plaid.com/docs/sandbox/user-custom) to generate a test account with custom data, or with Plaid&#39;s [pre-populated Sandbox test accounts](https://plaid.com/docs/sandbox/test-credentials/).
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
   * Manually fire a Transfer webhook
   * Use the &#x60;/sandbox/transfer/fire_webhook&#x60; endpoint to manually trigger a &#x60;TRANSFER_EVENTS_UPDATE&#x60; webhook in the Sandbox environment.
   * @param sandboxTransferFireWebhookRequest  (required)
   * @return Call&lt;SandboxTransferFireWebhookResponse&gt;
   * 
   * @see <a href="/api/sandbox/#sandboxtransferfire_webhook">Manually fire a Transfer webhook Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("sandbox/transfer/fire_webhook")
  Call<SandboxTransferFireWebhookResponse> sandboxTransferFireWebhook(
    @retrofit2.http.Body SandboxTransferFireWebhookRequest sandboxTransferFireWebhookRequest
  );

  /**
   * Simulate a ledger deposit event in Sandbox
   * Use the &#x60;/sandbox/transfer/ledger/deposit/simulate&#x60; endpoint to simulate a ledger deposit event in the Sandbox environment.
   * @param sandboxTransferLedgerDepositSimulateRequest  (required)
   * @return Call&lt;SandboxTransferLedgerDepositSimulateResponse&gt;
   * 
   * @see <a href="/api/sandbox/#sandboxtransferledgerdepositsimulate">Simulate a ledger deposit event in Sandbox Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("sandbox/transfer/ledger/deposit/simulate")
  Call<SandboxTransferLedgerDepositSimulateResponse> sandboxTransferLedgerDepositSimulate(
    @retrofit2.http.Body SandboxTransferLedgerDepositSimulateRequest sandboxTransferLedgerDepositSimulateRequest
  );

  /**
   * Simulate converting pending balance to available balance
   * Use the &#x60;/sandbox/transfer/ledger/simulate_available&#x60; endpoint to simulate converting pending balance to available balance for all originators in the Sandbox environment.
   * @param sandboxTransferLedgerSimulateAvailableRequest  (required)
   * @return Call&lt;SandboxTransferLedgerSimulateAvailableResponse&gt;
   * 
   * @see <a href="/api/sandbox/#sandboxtransferledgersimulate_available">Simulate converting pending balance to available balance Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("sandbox/transfer/ledger/simulate_available")
  Call<SandboxTransferLedgerSimulateAvailableResponse> sandboxTransferLedgerSimulateAvailable(
    @retrofit2.http.Body SandboxTransferLedgerSimulateAvailableRequest sandboxTransferLedgerSimulateAvailableRequest
  );

  /**
   * Simulate a ledger withdraw event in Sandbox
   * Use the &#x60;/sandbox/transfer/ledger/withdraw/simulate&#x60; endpoint to simulate a ledger withdraw event in the Sandbox environment.
   * @param sandboxTransferLedgerWithdrawSimulateRequest  (required)
   * @return Call&lt;SandboxTransferLedgerWithdrawSimulateResponse&gt;
   * 
   * @see <a href="/api/sandbox/#sandboxtransferledgerwithdrawsimulate">Simulate a ledger withdraw event in Sandbox Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("sandbox/transfer/ledger/withdraw/simulate")
  Call<SandboxTransferLedgerWithdrawSimulateResponse> sandboxTransferLedgerWithdrawSimulate(
    @retrofit2.http.Body SandboxTransferLedgerWithdrawSimulateRequest sandboxTransferLedgerWithdrawSimulateRequest
  );

  /**
   * Simulate a refund event in Sandbox
   * Use the &#x60;/sandbox/transfer/refund/simulate&#x60; endpoint to simulate a refund event in the Sandbox environment.  Note that while an event will be simulated and will appear when using endpoints such as &#x60;/transfer/event/sync&#x60; or &#x60;/transfer/event/list&#x60;, no transactions will actually take place and funds will not move between accounts, even within the Sandbox.
   * @param sandboxTransferRefundSimulateRequest  (required)
   * @return Call&lt;SandboxTransferRefundSimulateResponse&gt;
   * 
   * @see <a href="/api/sandbox/#sandboxtransferrefundsimulate">Simulate a refund event in Sandbox Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("sandbox/transfer/refund/simulate")
  Call<SandboxTransferRefundSimulateResponse> sandboxTransferRefundSimulate(
    @retrofit2.http.Body SandboxTransferRefundSimulateRequest sandboxTransferRefundSimulateRequest
  );

  /**
   * Trigger the creation of a repayment
   * Use the &#x60;/sandbox/transfer/repayment/simulate&#x60; endpoint to trigger the creation of a repayment. As a side effect of calling this route, a repayment is created that includes all unreimbursed returns of guaranteed transfers. If there are no such returns, an 400 error is returned.
   * @param sandboxTransferRepaymentSimulateRequest  (required)
   * @return Call&lt;SandboxTransferRepaymentSimulateResponse&gt;
   * 
   * @see <a href="/api/sandbox/#sandboxtransferrepaymentsimulate">Trigger the creation of a repayment Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("sandbox/transfer/repayment/simulate")
  Call<SandboxTransferRepaymentSimulateResponse> sandboxTransferRepaymentSimulate(
    @retrofit2.http.Body SandboxTransferRepaymentSimulateRequest sandboxTransferRepaymentSimulateRequest
  );

  /**
   * Simulate a transfer event in Sandbox
   * Use the &#x60;/sandbox/transfer/simulate&#x60; endpoint to simulate a transfer event in the Sandbox environment.  Note that while an event will be simulated and will appear when using endpoints such as &#x60;/transfer/event/sync&#x60; or &#x60;/transfer/event/list&#x60;, no transactions will actually take place and funds will not move between accounts, even within the Sandbox.
   * @param sandboxTransferSimulateRequest  (required)
   * @return Call&lt;SandboxTransferSimulateResponse&gt;
   * 
   * @see <a href="/api/sandbox/#sandboxtransfersimulate">Simulate a transfer event in Sandbox Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("sandbox/transfer/simulate")
  Call<SandboxTransferSimulateResponse> sandboxTransferSimulate(
    @retrofit2.http.Body SandboxTransferSimulateRequest sandboxTransferSimulateRequest
  );

  /**
   * Simulate creating a sweep
   * Use the &#x60;/sandbox/transfer/sweep/simulate&#x60; endpoint to create a sweep and associated events in the Sandbox environment. Upon calling this endpoint, all transfers with a sweep status of &#x60;swept&#x60; will become &#x60;swept_settled&#x60;, all &#x60;posted&#x60; or &#x60;pending&#x60; transfers with a sweep status of &#x60;unswept&#x60; will become &#x60;swept&#x60;, and all &#x60;returned&#x60; transfers with a sweep status of &#x60;swept&#x60; will become &#x60;return_swept&#x60;.
   * @param sandboxTransferSweepSimulateRequest  (required)
   * @return Call&lt;SandboxTransferSweepSimulateResponse&gt;
   * 
   * @see <a href="/api/sandbox/#sandboxtransfersweepsimulate">Simulate creating a sweep Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("sandbox/transfer/sweep/simulate")
  Call<SandboxTransferSweepSimulateResponse> sandboxTransferSweepSimulate(
    @retrofit2.http.Body SandboxTransferSweepSimulateRequest sandboxTransferSweepSimulateRequest
  );

  /**
   * Advance a test clock
   * Use the &#x60;/sandbox/transfer/test_clock/advance&#x60; endpoint to advance a &#x60;test_clock&#x60; in the Sandbox environment.  A test clock object represents an independent timeline and has a &#x60;virtual_time&#x60; field indicating the current timestamp of the timeline. A test clock can be advanced by incrementing &#x60;virtual_time&#x60;, but may never go back to a lower &#x60;virtual_time&#x60;.  If a test clock is advanced, we will simulate the changes that ought to occur during the time that elapsed.  For example, a client creates a weekly recurring transfer with a test clock set at t. When the client advances the test clock by setting &#x60;virtual_time&#x60; &#x3D; t + 15 days, 2 new originations should be created, along with the webhook events.  The advancement of the test clock from its current &#x60;virtual_time&#x60; should be limited such that there are no more than 20 originations resulting from the advance operation on each &#x60;recurring_transfer&#x60; associated with the &#x60;test_clock&#x60;.  For example, if the recurring transfer associated with this test clock originates once every 4 weeks, you can advance the &#x60;virtual_time&#x60; up to 80 weeks on each API call.
   * @param sandboxTransferTestClockAdvanceRequest  (required)
   * @return Call&lt;SandboxTransferTestClockAdvanceResponse&gt;
   * 
   * @see <a href="/api/sandbox/#sandboxtransfertest_clockadvance">Advance a test clock Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("sandbox/transfer/test_clock/advance")
  Call<SandboxTransferTestClockAdvanceResponse> sandboxTransferTestClockAdvance(
    @retrofit2.http.Body SandboxTransferTestClockAdvanceRequest sandboxTransferTestClockAdvanceRequest
  );

  /**
   * Create a test clock
   * Use the &#x60;/sandbox/transfer/test_clock/create&#x60; endpoint to create a &#x60;test_clock&#x60; in the Sandbox environment.  A test clock object represents an independent timeline and has a &#x60;virtual_time&#x60; field indicating the current timestamp of the timeline. Test clocks are used for testing recurring transfers in Sandbox.  A test clock can be associated with up to 5 recurring transfers.
   * @param sandboxTransferTestClockCreateRequest  (required)
   * @return Call&lt;SandboxTransferTestClockCreateResponse&gt;
   * 
   * @see <a href="/api/sandbox/#sandboxtransfertest_clockcreate">Create a test clock Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("sandbox/transfer/test_clock/create")
  Call<SandboxTransferTestClockCreateResponse> sandboxTransferTestClockCreate(
    @retrofit2.http.Body SandboxTransferTestClockCreateRequest sandboxTransferTestClockCreateRequest
  );

  /**
   * Get a test clock
   * Use the &#x60;/sandbox/transfer/test_clock/get&#x60; endpoint to get a &#x60;test_clock&#x60; in the Sandbox environment.
   * @param sandboxTransferTestClockGetRequest  (required)
   * @return Call&lt;SandboxTransferTestClockGetResponse&gt;
   * 
   * @see <a href="/api/sandbox/#sandboxtransfertest_clockget">Get a test clock Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("sandbox/transfer/test_clock/get")
  Call<SandboxTransferTestClockGetResponse> sandboxTransferTestClockGet(
    @retrofit2.http.Body SandboxTransferTestClockGetRequest sandboxTransferTestClockGetRequest
  );

  /**
   * List test clocks
   * Use the &#x60;/sandbox/transfer/test_clock/list&#x60; endpoint to see a list of all your test clocks in the Sandbox environment, by ascending &#x60;virtual_time&#x60;. Results are paginated; use the &#x60;count&#x60; and &#x60;offset&#x60; query parameters to retrieve the desired test clocks.
   * @param sandboxTransferTestClockListRequest  (required)
   * @return Call&lt;SandboxTransferTestClockListResponse&gt;
   * 
   * @see <a href="/api/sandbox/#sandboxtransfertest_clocklist">List test clocks Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("sandbox/transfer/test_clock/list")
  Call<SandboxTransferTestClockListResponse> sandboxTransferTestClockList(
    @retrofit2.http.Body SandboxTransferTestClockListRequest sandboxTransferTestClockListRequest
  );

  /**
   * Force item(s) for a Sandbox User into an error state
   * &#x60;/sandbox/user/reset_login/&#x60; functions the same as &#x60;/sandbox/item/reset_login&#x60;, but will modify Items related to a User. This endpoint forces each Item into an &#x60;ITEM_LOGIN_REQUIRED&#x60; state in order to simulate an Item whose login is no longer valid. This makes it easy to test Link&#39;s [update mode](https://plaid.com/docs/link/update-mode) flow in the Sandbox environment.  After calling &#x60;/sandbox/user/reset_login&#x60;, You can then use Plaid Link update mode to restore Items associated with the User to a good state. An &#x60;ITEM_LOGIN_REQUIRED&#x60; webhook will also be fired after a call to this endpoint, if one is associated with the Item.   In the Sandbox, Items will transition to an &#x60;ITEM_LOGIN_REQUIRED&#x60; error state automatically after 30 days, even if this endpoint is not called.
   * @param sandboxUserResetLoginRequest  (required)
   * @return Call&lt;SandboxUserResetLoginResponse&gt;
   * 
   * @see <a href="/api/sandbox/#sandboxuserreset_login">Force item(s) for a Sandbox User into an error state Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("sandbox/user/reset_login")
  Call<SandboxUserResetLoginResponse> sandboxUserResetLogin(
    @retrofit2.http.Body SandboxUserResetLoginRequest sandboxUserResetLoginRequest
  );

  /**
   * Report whether you initiated an ACH transaction
   * After calling &#x60;/signal/evaluate&#x60; (or &#x60;/accounts/balance/get&#x60;, for participants in the [Balance Plus](http://plaid.com/docs/balance/balance-plus) beta), call &#x60;/signal/decision/report&#x60; to report whether the transaction was initiated.
   * @param signalDecisionReportRequest  (required)
   * @return Call&lt;SignalDecisionReportResponse&gt;
   * 
   * @see <a href="/api/products/signal#signaldecisionreport">Report whether you initiated an ACH transaction Documentation</a>
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
   * Use &#x60;/signal/evaluate&#x60; to evaluate a planned ACH transaction to get a return risk assessment (such as a risk score and risk tier) and additional risk signals.  In order to obtain a valid score for an ACH transaction, Plaid must have an access token for the account, and the Item must be healthy (receiving product updates) or have recently been in a healthy state. If the transaction does not meet eligibility requirements, an error will be returned corresponding to the underlying cause. If &#x60;/signal/evaluate&#x60; is called on the same transaction multiple times within a 24-hour period, cached results may be returned. For more information please refer to the error documentation on [Item errors](/docs/errors/item/) and [Link in Update Mode](/docs/link/update-mode/).  Note: This request may take some time to complete if Signal is being added to an existing Item. This is because Plaid must communicate directly with the institution when retrieving the data for the first time.
   * @param signalEvaluateRequest  (required)
   * @return Call&lt;SignalEvaluateResponse&gt;
   * 
   * @see <a href="/api/products/signal#signalevaluate">Evaluate a planned ACH transaction Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("signal/evaluate")
  Call<SignalEvaluateResponse> signalEvaluate(
    @retrofit2.http.Body SignalEvaluateRequest signalEvaluateRequest
  );

  /**
   * Opt-in an Item to Signal
   * When Link is not initialized with Signal, call &#x60;/signal/prepare&#x60; to opt-in that Item to the Signal data collection process, developing a Signal score.  If run on an Item that is already initialized with Signal, this endpoint will return a 200 response and will not modify the Item.
   * @param signalPrepareRequest  (required)
   * @return Call&lt;SignalPrepareResponse&gt;
   * 
   * @see <a href="/api/products/signal#signalprepare">Opt-in an Item to Signal Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("signal/prepare")
  Call<SignalPrepareResponse> signalPrepare(
    @retrofit2.http.Body SignalPrepareRequest signalPrepareRequest
  );

  /**
   * Report a return for an ACH transaction
   * Call the &#x60;/signal/return/report&#x60; endpoint to report a returned transaction that was previously sent to the &#x60;/signal/evaluate&#x60; or (for participants in the [Balance Plus](http://plaid.com/docs/balance/balance-plus) beta) the &#x60;/accounts/balance/get&#x60; endpoint. Your feedback will be used by the model to incorporate the latest risk trend in your portfolio.
   * @param signalReturnReportRequest  (required)
   * @return Call&lt;SignalReturnReportResponse&gt;
   * 
   * @see <a href="/api/products/signal#signalreturnreport">Report a return for an ACH transaction Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("signal/return/report")
  Call<SignalReturnReportResponse> signalReturnReport(
    @retrofit2.http.Body SignalReturnReportRequest signalReturnReportRequest
  );

  /**
   * Retrieve a single statement.
   * The &#x60;/statements/download&#x60; endpoint retrieves a single statement PDF in binary format.  The response will contain a &#x60;Plaid-Content-Hash&#x60; header containing a SHA 256 checksum of the statement. This can be used to verify that the file being sent by Plaid is the same file that was downloaded to your system.
   * @param statementsDownloadRequest  (required)
   * @return Call&lt;ResponseBody&gt;
   * 
   * @see <a href="/api/products/statements#statementsdownload">Retrieve a single statement. Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("statements/download")
  Call<ResponseBody> statementsDownload(
    @retrofit2.http.Body StatementsDownloadRequest statementsDownloadRequest
  );

  /**
   * Retrieve a list of all statements associated with an item.
   * The &#x60;/statements/list&#x60; endpoint retrieves a list of all statements associated with an item.
   * @param statementsListRequest  (required)
   * @return Call&lt;StatementsListResponse&gt;
   * 
   * @see <a href="/api/products/statements#statementslist">Retrieve a list of all statements associated with an item. Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("statements/list")
  Call<StatementsListResponse> statementsList(
    @retrofit2.http.Body StatementsListRequest statementsListRequest
  );

  /**
   * Refresh statements data.
   * &#x60;/statements/refresh&#x60; initiates an on-demand extraction to fetch the statements for the provided dates.
   * @param statementsRefreshRequest  (required)
   * @return Call&lt;StatementsRefreshResponse&gt;
   * 
   * @see <a href="/api/products/statements#statementsrefresh">Refresh statements data. Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("statements/refresh")
  Call<StatementsRefreshResponse> statementsRefresh(
    @retrofit2.http.Body StatementsRefreshRequest statementsRefreshRequest
  );

  /**
   * enhance locally-held transaction data
   * The &#x60;/beta/transactions/v1/enhance&#x60; endpoint enriches raw transaction data provided directly by clients.  The product is currently in beta.
   * @param transactionsEnhanceGetRequest  (required)
   * @return Call&lt;TransactionsEnhanceGetResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("beta/transactions/v1/enhance")
  Call<TransactionsEnhanceGetResponse> transactionsEnhance(
    @retrofit2.http.Body TransactionsEnhanceGetRequest transactionsEnhanceGetRequest
  );

  /**
   * Enrich locally-held transaction data
   * The &#x60;/transactions/enrich&#x60; endpoint enriches raw transaction data generated by your own banking products or retrieved from other non-Plaid sources.
   * @param transactionsEnrichRequest  (required)
   * @return Call&lt;TransactionsEnrichResponse&gt;
   * 
   * @see <a href="/api/products/enrich/#transactionsenrich">Enrich locally-held transaction data Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("transactions/enrich")
  Call<TransactionsEnrichResponse> transactionsEnrich(
    @retrofit2.http.Body TransactionsEnrichRequest transactionsEnrichRequest
  );

  /**
   * Get transaction data
   * Note: All new implementations are encouraged to use &#x60;/transactions/sync&#x60; rather than &#x60;/transactions/get&#x60;. &#x60;/transactions/sync&#x60; provides the same functionality as &#x60;/transactions/get&#x60; and improves developer ease-of-use for handling transactions updates.  The &#x60;/transactions/get&#x60; endpoint allows developers to receive user-authorized transaction data for credit, depository, and some loan-type accounts (only those with account subtype &#x60;student&#x60;; coverage may be limited). For transaction history from investments accounts, use the [Investments endpoint](https://plaid.com/docs/api/products/investments/) instead. Transaction data is standardized across financial institutions, and in many cases transactions are linked to a clean name, entity type, location, and category. Similarly, account data is standardized and returned with a clean name, number, balance, and other meta information where available.  Transactions are returned in reverse-chronological order, and the sequence of transaction ordering is stable and will not shift.  Transactions are not immutable and can also be removed altogether by the institution; a removed transaction will no longer appear in &#x60;/transactions/get&#x60;.  For more details, see [Pending and posted transactions](https://plaid.com/docs/transactions/transactions-data/#pending-and-posted-transactions).  Due to the potentially large number of transactions associated with an Item, results are paginated. Manipulate the &#x60;count&#x60; and &#x60;offset&#x60; parameters in conjunction with the &#x60;total_transactions&#x60; response body field to fetch all available transactions.  Data returned by &#x60;/transactions/get&#x60; will be the data available for the Item as of the most recent successful check for new transactions. Plaid typically checks for new data multiple times a day, but these checks may occur less frequently, such as once a day, depending on the institution. To find out when the Item was last updated, use the [Item Debugger](https://plaid.com/docs/account/activity/#troubleshooting-with-item-debugger) or call &#x60;/item/get&#x60;; the &#x60;item.status.transactions.last_successful_update&#x60; field will show the timestamp of the most recent successful update. To force Plaid to check for new transactions, you can use the &#x60;/transactions/refresh&#x60; endpoint.  Note that data may not be immediately available to &#x60;/transactions/get&#x60;. Plaid will begin to prepare transactions data upon Item link, if Link was initialized with &#x60;transactions&#x60;, or upon the first call to &#x60;/transactions/get&#x60;, if it wasn&#39;t. To be alerted when transaction data is ready to be fetched, listen for the [&#x60;INITIAL_UPDATE&#x60;](https://plaid.com/docs/api/products/transactions/#initial_update) and [&#x60;HISTORICAL_UPDATE&#x60;](https://plaid.com/docs/api/products/transactions/#historical_update) webhooks. If no transaction history is ready when &#x60;/transactions/get&#x60; is called, it will return a &#x60;PRODUCT_NOT_READY&#x60; error.
   * @param transactionsGetRequest  (required)
   * @return Call&lt;TransactionsGetResponse&gt;
   * 
   * @see <a href="/api/products/transactions/#transactionsget">Get transaction data Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("transactions/get")
  Call<TransactionsGetResponse> transactionsGet(
    @retrofit2.http.Body TransactionsGetRequest transactionsGetRequest
  );

  /**
   * Fetch recurring transaction streams
   * The &#x60;/transactions/recurring/get&#x60; endpoint allows developers to receive a summary of the recurring outflow and inflow streams (expenses and deposits) from a user’s checking, savings or credit card accounts. Additionally, Plaid provides key insights about each recurring stream including the category, merchant, last amount, and more. Developers can use these insights to build tools and experiences that help their users better manage cash flow, monitor subscriptions, reduce spend, and stay on track with bill payments.  This endpoint is offered as an add-on to Transactions. To request access to this endpoint, submit a [product access request](https://dashboard.plaid.com/team/products) or contact your Plaid account manager.  This endpoint can only be called on an Item that has already been initialized with Transactions (either during Link, by specifying it in &#x60;/link/token/create&#x60;; or after Link, by calling &#x60;/transactions/get&#x60; or &#x60;/transactions/sync&#x60;).   When using Recurring Transactions, for best results, make sure to use the [&#x60;days_requested&#x60;](https://plaid.com/docs/api/link/#link-token-create-request-transactions-days-requested) parameter to request at least 180 days of history when initializing Items with Transactions. Once all historical transactions have been fetched, call &#x60;/transactions/recurring/get&#x60; to receive the Recurring Transactions streams and subscribe to the [&#x60;RECURRING_TRANSACTIONS_UPDATE&#x60;](https://plaid.com/docs/api/products/transactions/#recurring_transactions_update) webhook. To know when historical transactions have been fetched, if you are using &#x60;/transactions/sync&#x60; listen for the [&#x60;SYNC_UPDATES_AVAILABLE&#x60;](https://plaid.com/docs/api/products/transactions/#SyncUpdatesAvailableWebhook-historical-update-complete) webhook and check that the &#x60;historical_update_complete&#x60; field in the payload is &#x60;true&#x60;. If using &#x60;/transactions/get&#x60;, listen for the [&#x60;HISTORICAL_UPDATE&#x60;](https://plaid.com/docs/api/products/transactions/#historical_update) webhook.  After the initial call, you can call &#x60;/transactions/recurring/get&#x60; endpoint at any point in the future to retrieve the latest summary of recurring streams. Listen to the [&#x60;RECURRING_TRANSACTIONS_UPDATE&#x60;](https://plaid.com/docs/api/products/transactions/#recurring_transactions_update) webhook to be notified when new updates are available.
   * @param transactionsRecurringGetRequest  (required)
   * @return Call&lt;TransactionsRecurringGetResponse&gt;
   * 
   * @see <a href="/api/products/transactions/#transactionsrecurringget">Fetch recurring transaction streams Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("transactions/recurring/get")
  Call<TransactionsRecurringGetResponse> transactionsRecurringGet(
    @retrofit2.http.Body TransactionsRecurringGetRequest transactionsRecurringGetRequest
  );

  /**
   * Refresh transaction data
   * &#x60;/transactions/refresh&#x60; is an optional endpoint that initiates an on-demand extraction to fetch the newest transactions for an Item. The on-demand extraction takes place in addition to the periodic extractions that automatically occur one or more times per day for any Transactions-enabled Item. The Item must already have Transactions added as a product in order to call &#x60;/transactions/refresh&#x60;.  If changes to transactions are discovered after calling &#x60;/transactions/refresh&#x60;, Plaid will fire a webhook: for &#x60;/transactions/sync&#x60; users, [&#x60;SYNC_UPDATES_AVAILABLE&#x60;](https://plaid.com/docs/api/products/transactions/#sync_updates_available) will be fired if there are any transactions updated, added, or removed. For users of both &#x60;/transactions/sync&#x60; and &#x60;/transactions/get&#x60;, [&#x60;TRANSACTIONS_REMOVED&#x60;](https://plaid.com/docs/api/products/transactions/#transactions_removed) will be fired if any removed transactions are detected, and [&#x60;DEFAULT_UPDATE&#x60;](https://plaid.com/docs/api/products/transactions/#default_update) will be fired if any new transactions are detected. New transactions can be fetched by calling &#x60;/transactions/get&#x60; or &#x60;/transactions/sync&#x60;.  Note that the &#x60;/transactions/refresh&#x60; endpoint is not supported for Capital One (&#x60;ins_128026&#x60;) non-depository accounts and will result in a &#x60;PRODUCTS_NOT_SUPPORTED&#x60; error if called on an Item that contains only non-depository accounts from that institution.  As this endpoint triggers a synchronous request for fresh data, latency may be higher than for other Plaid endpoints (typically less than 10 seconds, but occasionally up to 30 seconds or more); if you encounter errors, you may find it necessary to adjust your timeout period when making requests.  &#x60;/transactions/refresh&#x60; is offered as an optional add-on to Transactions and has a separate [fee model](/docs/account/billing/#per-request-flat-fee). To request access to this endpoint, submit a [product access request](https://dashboard.plaid.com/team/products) or contact your Plaid account manager.
   * @param transactionsRefreshRequest  (required)
   * @return Call&lt;TransactionsRefreshResponse&gt;
   * 
   * @see <a href="/api/products/transactions/#transactionsrefresh">Refresh transaction data Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("transactions/refresh")
  Call<TransactionsRefreshResponse> transactionsRefresh(
    @retrofit2.http.Body TransactionsRefreshRequest transactionsRefreshRequest
  );

  /**
   * Create transaction category rule
   * The &#x60;/transactions/rules/v1/create&#x60; endpoint creates transaction categorization rules.  Rules will be applied on the Item&#39;s transactions returned in &#x60;/transactions/get&#x60; response.  The product is currently in beta. To request access, contact transactions-feedback@plaid.com.
   * @param transactionsRulesCreateRequest  (required)
   * @return Call&lt;TransactionsRulesCreateResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("beta/transactions/rules/v1/create")
  Call<TransactionsRulesCreateResponse> transactionsRulesCreate(
    @retrofit2.http.Body TransactionsRulesCreateRequest transactionsRulesCreateRequest
  );

  /**
   * Return a list of rules created for the Item associated with the access token.
   * The &#x60;/transactions/rules/v1/list&#x60; returns a list of transaction rules created for the Item associated with the access token.
   * @param transactionsRulesListRequest  (required)
   * @return Call&lt;TransactionsRulesListResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("beta/transactions/rules/v1/list")
  Call<TransactionsRulesListResponse> transactionsRulesList(
    @retrofit2.http.Body TransactionsRulesListRequest transactionsRulesListRequest
  );

  /**
   * Remove transaction rule
   * The &#x60;/transactions/rules/v1/remove&#x60; endpoint is used to remove a transaction rule.
   * @param transactionsRulesRemoveRequest  (required)
   * @return Call&lt;TransactionsRulesRemoveResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("beta/transactions/rules/v1/remove")
  Call<TransactionsRulesRemoveResponse> transactionsRulesRemove(
    @retrofit2.http.Body TransactionsRulesRemoveRequest transactionsRulesRemoveRequest
  );

  /**
   * Get incremental transaction updates on an Item
   * The &#x60;/transactions/sync&#x60; endpoint allows developers to subscribe to all transactions associated with an Item and get updates synchronously in a stream-like manner, using a cursor to track which updates have already been seen.  &#x60;/transactions/sync&#x60; provides the same functionality as &#x60;/transactions/get&#x60; and can be used instead of &#x60;/transactions/get&#x60; to simplify the process of tracking transactions updates. To learn more about migrating from &#x60;/transactions/get&#x60;, see the [Transactions Sync migration guide](https://plaid.com/docs/transactions/sync-migration/).  This endpoint provides user-authorized transaction data for &#x60;credit&#x60;, &#x60;depository&#x60;, and some loan-type accounts (only those with account subtype &#x60;student&#x60;; coverage may be limited). For transaction history from &#x60;investments&#x60; accounts, use &#x60;/investments/transactions/get&#x60; instead.  Returned transactions data is grouped into three types of update, indicating whether the transaction was added, removed, or modified since the last call to the API.  In the first call to &#x60;/transactions/sync&#x60; for an Item, the endpoint will return all historical transactions data associated with that Item up until the time of the API call (as \&quot;adds\&quot;), which then generates a &#x60;next_cursor&#x60; for that Item. In subsequent calls, send the &#x60;next_cursor&#x60; to receive only the changes that have occurred since the previous call.  Due to the potentially large number of transactions associated with an Item, results are paginated. The &#x60;has_more&#x60; field specifies if additional calls are necessary to fetch all available transaction updates. Call &#x60;/transactions/sync&#x60; with the new cursor, pulling all updates, until &#x60;has_more&#x60; is &#x60;false&#x60;.  When retrieving paginated updates, track both the &#x60;next_cursor&#x60; from the latest response and the original cursor from the first call in which &#x60;has_more&#x60; was &#x60;true&#x60;; if a call to &#x60;/transactions/sync&#x60; fails due to the [&#x60;TRANSACTIONS_SYNC_MUTATION_DURING_PAGINATION&#x60;](https://plaid.com/docs/errors/transactions/#transactions_sync_mutation_during_pagination) error, the entire pagination request loop must be restarted beginning with the cursor for the first page of the update, rather than retrying only the single request that failed.  Whenever new or updated transaction data becomes available, &#x60;/transactions/sync&#x60; will provide these updates. Plaid typically checks for new data multiple times a day, but these checks may occur less frequently, such as once a day, depending on the institution. To find out when the Item was last updated, use the [Item Debugger](https://plaid.com/docs/account/activity/#troubleshooting-with-item-debugger) or call &#x60;/item/get&#x60;; the &#x60;item.status.transactions.last_successful_update&#x60; field will show the timestamp of the most recent successful update. To force Plaid to check for new transactions, use the &#x60;/transactions/refresh&#x60; endpoint.  For newly created Items, data may not be immediately available to &#x60;/transactions/sync&#x60;. Plaid begins preparing transactions data when the Item is created, but the process can take anywhere from a few seconds to several minutes to complete, depending on the number of transactions available.  To be alerted when new data is available, listen for the [&#x60;SYNC_UPDATES_AVAILABLE&#x60;](https://plaid.com/docs/api/products/transactions/#sync_updates_available) webhook.
   * @param transactionsSyncRequest  (required)
   * @return Call&lt;TransactionsSyncResponse&gt;
   * 
   * @see <a href="/api/products/transactions/#transactionssync">Get incremental transaction updates on an Item Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("transactions/sync")
  Call<TransactionsSyncResponse> transactionsSync(
    @retrofit2.http.Body TransactionsSyncRequest transactionsSyncRequest
  );

  /**
   * Obtain user insights based on transactions sent through /transactions/enrich
   * The &#x60;/beta/transactions/user_insights/v1/get&#x60; gets user insights for clients who have enriched data with &#x60;/transactions/enrich&#x60;.  The product is currently in beta.
   * @param transactionsUserInsightsGetRequest  (required)
   * @return Call&lt;TransactionsUserInsightsGetResponse&gt;
   * 
   * @see <a href="/api/products/enrich/#userinsightsget">Obtain user insights based on transactions sent through /transactions/enrich Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("beta/transactions/user_insights/v1/get")
  Call<TransactionsUserInsightsGetResponse> transactionsUserInsightsGet(
    @retrofit2.http.Body TransactionsUserInsightsGetRequest transactionsUserInsightsGetRequest
  );

  /**
   * Cancel a transfer authorization
   * Use the &#x60;/transfer/authorization/cancel&#x60; endpoint to cancel a transfer authorization. A transfer authorization is eligible for cancellation if it has not yet been used to create a transfer.
   * @param transferAuthorizationCancelRequest  (required)
   * @return Call&lt;TransferAuthorizationCancelResponse&gt;
   * 
   * @see <a href="/api/products/transfer/initiating-transfers/#transferauthorizationcancel">Cancel a transfer authorization Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("transfer/authorization/cancel")
  Call<TransferAuthorizationCancelResponse> transferAuthorizationCancel(
    @retrofit2.http.Body TransferAuthorizationCancelRequest transferAuthorizationCancelRequest
  );

  /**
   * Create a transfer authorization
   * Use the &#x60;/transfer/authorization/create&#x60; endpoint to authorize a transfer. This endpoint must be called prior to calling &#x60;/transfer/create&#x60;. The transfer authorization will expire if not used after one hour. (You can contact your account manager to change the default authorization lifetime.)   There are four possible outcomes to calling this endpoint:  - If the &#x60;authorization.decision&#x60; in the response is &#x60;declined&#x60;, the proposed transfer has failed the risk check and you cannot proceed with the transfer.  - If the &#x60;authorization.decision&#x60; is &#x60;user_action_required&#x60;, additional user input is needed, usually to fix a broken bank connection, before Plaid can properly assess the risk. You need to launch Link in update mode to complete the required user action. When calling &#x60;/link/token/create&#x60; to get a new Link token, instead of providing &#x60;access_token&#x60; in the request, you should set [&#x60;transfer.authorization_id&#x60;](https://plaid.com/docs/api/link/#link-token-create-request-transfer-authorization-id) as the &#x60;authorization.id&#x60;. After the Link flow is completed, you may re-attempt the authorization. - If the &#x60;authorization.decision&#x60; is &#x60;approved&#x60;, and the &#x60;authorization.rationale_code&#x60; is &#x60;null&#x60;, the transfer has passed the risk check and you can proceed to call &#x60;/transfer/create&#x60;. - If the &#x60;authorization.decision&#x60; is &#x60;approved&#x60; and the &#x60;authorization.rationale_code&#x60; is non-&#x60;null&#x60;, the risk check could not be run: you may proceed with the transfer, but should perform your own risk evaluation. For more details, see the response schema.  In Plaid&#39;s Sandbox environment the decisions will be returned as follows:    - To approve a transfer with &#x60;null&#x60; rationale code, make an authorization request with an &#x60;amount&#x60; less than the available balance in the account.    - To approve a transfer with the rationale code &#x60;MANUALLY_VERIFIED_ITEM&#x60;, create an Item in Link through the [Same Day Micro-deposits flow](https://plaid.com/docs/auth/coverage/testing/#testing-same-day-micro-deposits).    - To get an authorization decision of &#x60;user_action_required&#x60;, [reset the login for an Item](https://plaid.com/docs/sandbox/#item_login_required).    - To decline a transfer with the rationale code &#x60;NSF&#x60;, the available balance on the account must be less than the authorization &#x60;amount&#x60;. See [Create Sandbox test data](https://plaid.com/docs/sandbox/user-custom/) for details on how to customize data in Sandbox.    - To decline a transfer with the rationale code &#x60;RISK&#x60;, the available balance on the account must be exactly $0. See [Create Sandbox test data](https://plaid.com/docs/sandbox/user-custom/) for details on how to customize data in Sandbox.
   * @param transferAuthorizationCreateRequest  (required)
   * @return Call&lt;TransferAuthorizationCreateResponse&gt;
   * 
   * @see <a href="/api/products/transfer/initiating-transfers/#transferauthorizationcreate">Create a transfer authorization Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("transfer/authorization/create")
  Call<TransferAuthorizationCreateResponse> transferAuthorizationCreate(
    @retrofit2.http.Body TransferAuthorizationCreateRequest transferAuthorizationCreateRequest
  );

  /**
   * (Deprecated) Retrieve a balance held with Plaid
   * (Deprecated) Use the &#x60;/transfer/balance/get&#x60; endpoint to view a balance held with Plaid.
   * @param transferBalanceGetRequest  (required)
   * @return Call&lt;TransferBalanceGetResponse&gt;
   * @deprecated
   * 
   * @see <a href="/api/products/transfer/balance/#transferbalanceget">(Deprecated) Retrieve a balance held with Plaid Documentation</a>
   */
  @Deprecated
  @Headers({
    "Content-Type:application/json"
  })
  @POST("transfer/balance/get")
  Call<TransferBalanceGetResponse> transferBalanceGet(
    @retrofit2.http.Body TransferBalanceGetRequest transferBalanceGetRequest
  );

  /**
   * Cancel a transfer
   * Use the &#x60;/transfer/cancel&#x60; endpoint to cancel a transfer.  A transfer is eligible for cancellation if the &#x60;cancellable&#x60; property returned by &#x60;/transfer/get&#x60; is &#x60;true&#x60;.
   * @param transferCancelRequest  (required)
   * @return Call&lt;TransferCancelResponse&gt;
   * 
   * @see <a href="/api/products/transfer/initiating-transfers/#transfercancel">Cancel a transfer Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("transfer/cancel")
  Call<TransferCancelResponse> transferCancel(
    @retrofit2.http.Body TransferCancelRequest transferCancelRequest
  );

  /**
   * Get RTP eligibility information of a transfer
   * Use the &#x60;/transfer/capabilities/get&#x60; endpoint to determine the RTP eligibility information of an account to be used with Transfer. This endpoint works on all Transfer-capable Items, including those created by &#x60;/transfer/migrate_account&#x60;. To simulate RTP eligibility in Sandbox, log in using the username &#x60;user_good&#x60; and password &#x60;pass_good&#x60; and use the first two checking and savings accounts in the \&quot;First Platypus Bank\&quot; institution (ending in 0000 or 1111), which will return &#x60;true&#x60;. Any other account will return &#x60;false&#x60;.
   * @param transferCapabilitiesGetRequest  (required)
   * @return Call&lt;TransferCapabilitiesGetResponse&gt;
   * 
   * @see <a href="/api/products/transfer/account-linking/#transfercapabilitiesget">Get RTP eligibility information of a transfer Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("transfer/capabilities/get")
  Call<TransferCapabilitiesGetResponse> transferCapabilitiesGet(
    @retrofit2.http.Body TransferCapabilitiesGetRequest transferCapabilitiesGetRequest
  );

  /**
   * Get transfer product configuration
   * Use the &#x60;/transfer/configuration/get&#x60; endpoint to view your transfer product configurations.
   * @param transferConfigurationGetRequest  (required)
   * @return Call&lt;TransferConfigurationGetResponse&gt;
   * 
   * @see <a href="/api/products/transfer/metrics/#transferconfigurationget">Get transfer product configuration Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("transfer/configuration/get")
  Call<TransferConfigurationGetResponse> transferConfigurationGet(
    @retrofit2.http.Body TransferConfigurationGetRequest transferConfigurationGetRequest
  );

  /**
   * Create a transfer
   * Use the &#x60;/transfer/create&#x60; endpoint to initiate a new transfer. This endpoint is retryable and idempotent; if a transfer with the provided &#x60;transfer_id&#x60; has already been created, it will return the transfer details without creating a new transfer. A transfer may still be created if a 500 error is returned; to detect this scenario, use [Transfer events](https://plaid.com/docs/transfer/reconciling-transfers/).
   * @param transferCreateRequest  (required)
   * @return Call&lt;TransferCreateResponse&gt;
   * 
   * @see <a href="/api/products/transfer/initiating-transfers/#transfercreate">Create a transfer Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("transfer/create")
  Call<TransferCreateResponse> transferCreate(
    @retrofit2.http.Body TransferCreateRequest transferCreateRequest
  );

  /**
   * Upload transfer diligence document on behalf of the originator
   * Third-party sender customers can use &#x60;/transfer/diligence/document/upload&#x60; endpoint to upload a document on behalf of its end customer (i.e. originator) to Plaid. You’ll need to send a request of type multipart/form-data. You must provide the &#x60;client_id&#x60; in the &#x60;PLAID-CLIENT-ID&#x60; header and &#x60;secret&#x60; in the &#x60;PLAID-SECRET&#x60; header.
   * @param transferDiligenceDocumentUploadRequest  (required)
   * @return Call&lt;TransferDiligenceDocumentUploadResponse&gt;
   * 
   * @see <a href="/api/products/transfer/platform-payments/#transferdiligencedocumentupload">Upload transfer diligence document on behalf of the originator Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("transfer/diligence/document/upload")
  Call<TransferDiligenceDocumentUploadResponse> transferDiligenceDocumentUpload(
    @retrofit2.http.Body TransferDiligenceDocumentUploadRequest transferDiligenceDocumentUploadRequest
  );

  /**
   * Submit transfer diligence on behalf of the originator
   * Use the &#x60;/transfer/diligence/submit&#x60; endpoint to submit transfer diligence on behalf of the originator (i.e., the end customer).
   * @param transferDiligenceSubmitRequest  (required)
   * @return Call&lt;TransferDiligenceSubmitResponse&gt;
   * 
   * @see <a href="/api/products/transfer/platform-payments/#transferdiligencesubmit">Submit transfer diligence on behalf of the originator Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("transfer/diligence/submit")
  Call<TransferDiligenceSubmitResponse> transferDiligenceSubmit(
    @retrofit2.http.Body TransferDiligenceSubmitRequest transferDiligenceSubmitRequest
  );

  /**
   * List transfer events
   * Use the &#x60;/transfer/event/list&#x60; endpoint to get a list of transfer events based on specified filter criteria.
   * @param transferEventListRequest  (required)
   * @return Call&lt;TransferEventListResponse&gt;
   * 
   * @see <a href="/api/products/transfer/reading-transfers/#transfereventlist">List transfer events Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("transfer/event/list")
  Call<TransferEventListResponse> transferEventList(
    @retrofit2.http.Body TransferEventListRequest transferEventListRequest
  );

  /**
   * Sync transfer events
   * &#x60;/transfer/event/sync&#x60; allows you to request up to the next 25 transfer events that happened after a specific &#x60;event_id&#x60;. Use the &#x60;/transfer/event/sync&#x60; endpoint to guarantee you have seen all transfer events.
   * @param transferEventSyncRequest  (required)
   * @return Call&lt;TransferEventSyncResponse&gt;
   * 
   * @see <a href="/api/products/transfer/reading-transfers/#transfereventsync">Sync transfer events Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("transfer/event/sync")
  Call<TransferEventSyncResponse> transferEventSync(
    @retrofit2.http.Body TransferEventSyncRequest transferEventSyncRequest
  );

  /**
   * Retrieve a transfer
   * The &#x60;/transfer/get&#x60; endpoint fetches information about the transfer corresponding to the given &#x60;transfer_id&#x60; or &#x60;authorization_id&#x60;. One of &#x60;transfer_id&#x60; or &#x60;authorization_id&#x60; must be populated but not both.
   * @param transferGetRequest  (required)
   * @return Call&lt;TransferGetResponse&gt;
   * 
   * @see <a href="/api/products/transfer/reading-transfers/#transferget">Retrieve a transfer Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("transfer/get")
  Call<TransferGetResponse> transferGet(
    @retrofit2.http.Body TransferGetRequest transferGetRequest
  );

  /**
   * Create a transfer intent object to invoke the Transfer UI
   * Use the &#x60;/transfer/intent/create&#x60; endpoint to generate a transfer intent object and invoke the Transfer UI.
   * @param transferIntentCreateRequest  (required)
   * @return Call&lt;TransferIntentCreateResponse&gt;
   * 
   * @see <a href="/api/products/transfer/account-linking/#transferintentcreate">Create a transfer intent object to invoke the Transfer UI Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("transfer/intent/create")
  Call<TransferIntentCreateResponse> transferIntentCreate(
    @retrofit2.http.Body TransferIntentCreateRequest transferIntentCreateRequest
  );

  /**
   * Retrieve more information about a transfer intent
   * Use the &#x60;/transfer/intent/get&#x60; endpoint to retrieve more information about a transfer intent.
   * @param transferIntentGetRequest  (required)
   * @return Call&lt;TransferIntentGetResponse&gt;
   * 
   * @see <a href="/api/products/transfer/account-linking/#transferintentget">Retrieve more information about a transfer intent Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("transfer/intent/get")
  Call<TransferIntentGetResponse> transferIntentGet(
    @retrofit2.http.Body TransferIntentGetRequest transferIntentGetRequest
  );

  /**
   * Deposit funds into a Plaid Ledger balance
   * Use the &#x60;/transfer/ledger/deposit&#x60; endpoint to deposit funds into Plaid Ledger.
   * @param transferLedgerDepositRequest  (required)
   * @return Call&lt;TransferLedgerDepositResponse&gt;
   * 
   * @see <a href="/api/products/transfer/ledger/#transferledgerdeposit">Deposit funds into a Plaid Ledger balance Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("transfer/ledger/deposit")
  Call<TransferLedgerDepositResponse> transferLedgerDeposit(
    @retrofit2.http.Body TransferLedgerDepositRequest transferLedgerDepositRequest
  );

  /**
   * Move available balance between the ledgers of the platform and one of its originators
   * Use the &#x60;/transfer/ledger/distribute&#x60; endpoint to move available balance between the ledgers of the platform and one of its originators.
   * @param transferLedgerDistributeRequest  (required)
   * @return Call&lt;TransferLedgerDistributeResponse&gt;
   * 
   * @see <a href="/api/products/transfer/ledger/#transferledgerdistribute">Move available balance between the ledgers of the platform and one of its originators Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("transfer/ledger/distribute")
  Call<TransferLedgerDistributeResponse> transferLedgerDistribute(
    @retrofit2.http.Body TransferLedgerDistributeRequest transferLedgerDistributeRequest
  );

  /**
   * Retrieve Plaid Ledger balance
   * Use the &#x60;/transfer/ledger/get&#x60; endpoint to view a balance on the ledger held with Plaid.
   * @param transferLedgerGetRequest  (required)
   * @return Call&lt;TransferLedgerGetResponse&gt;
   * 
   * @see <a href="/api/products/transfer/ledger/#transferledgerget">Retrieve Plaid Ledger balance Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("transfer/ledger/get")
  Call<TransferLedgerGetResponse> transferLedgerGet(
    @retrofit2.http.Body TransferLedgerGetRequest transferLedgerGetRequest
  );

  /**
   * Withdraw funds from a Plaid Ledger balance
   * Use the &#x60;/transfer/ledger/withdraw&#x60; endpoint to withdraw funds from a Plaid Ledger balance.
   * @param transferLedgerWithdrawRequest  (required)
   * @return Call&lt;TransferLedgerWithdrawResponse&gt;
   * 
   * @see <a href="/api/products/transfer/ledger/#transferledgerwithdraw">Withdraw funds from a Plaid Ledger balance Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("transfer/ledger/withdraw")
  Call<TransferLedgerWithdrawResponse> transferLedgerWithdraw(
    @retrofit2.http.Body TransferLedgerWithdrawRequest transferLedgerWithdrawRequest
  );

  /**
   * List transfers
   * Use the &#x60;/transfer/list&#x60; endpoint to see a list of all your transfers and their statuses. Results are paginated; use the &#x60;count&#x60; and &#x60;offset&#x60; query parameters to retrieve the desired transfers. 
   * @param transferListRequest  (required)
   * @return Call&lt;TransferListResponse&gt;
   * 
   * @see <a href="/api/products/transfer/reading-transfers/#transferlist">List transfers Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("transfer/list")
  Call<TransferListResponse> transferList(
    @retrofit2.http.Body TransferListRequest transferListRequest
  );

  /**
   * Get transfer product usage metrics
   * Use the &#x60;/transfer/metrics/get&#x60; endpoint to view your transfer product usage metrics.
   * @param transferMetricsGetRequest  (required)
   * @return Call&lt;TransferMetricsGetResponse&gt;
   * 
   * @see <a href="/api/products/transfer/metrics/#transfermetricsget">Get transfer product usage metrics Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("transfer/metrics/get")
  Call<TransferMetricsGetResponse> transferMetricsGet(
    @retrofit2.http.Body TransferMetricsGetRequest transferMetricsGetRequest
  );

  /**
   * Migrate account into Transfers
   * As an alternative to adding Items via Link, you can also use the &#x60;/transfer/migrate_account&#x60; endpoint to migrate known account and routing numbers to Plaid Items. This endpoint is also required when adding an Item for use with wire transfers; if you intend to create wire transfers on this account, you must provide &#x60;wire_routing_number&#x60;. Note that Items created in this way are not compatible with endpoints for other products, such as &#x60;/accounts/balance/get&#x60;, and can only be used with Transfer endpoints.  If you require access to other endpoints, create the Item through Link instead.  Access to &#x60;/transfer/migrate_account&#x60; is not enabled by default; to obtain access, contact your Plaid Account Manager.
   * @param transferMigrateAccountRequest  (required)
   * @return Call&lt;TransferMigrateAccountResponse&gt;
   * 
   * @see <a href="/api/products/transfer/account-linking/#transfermigrate_account">Migrate account into Transfers Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("transfer/migrate_account")
  Call<TransferMigrateAccountResponse> transferMigrateAccount(
    @retrofit2.http.Body TransferMigrateAccountRequest transferMigrateAccountRequest
  );

  /**
   * Create a new originator
   * Use the &#x60;/transfer/originator/create&#x60; endpoint to create a new originator and return an &#x60;originator_client_id&#x60;.
   * @param transferOriginatorCreateRequest  (required)
   * @return Call&lt;TransferOriginatorCreateResponse&gt;
   * 
   * @see <a href="/api/products/transfer/platform-payments/#transferoriginatorcreate">Create a new originator Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("transfer/originator/create")
  Call<TransferOriginatorCreateResponse> transferOriginatorCreate(
    @retrofit2.http.Body TransferOriginatorCreateRequest transferOriginatorCreateRequest
  );

  /**
   * Update the funding account associated with the originator
   * Use the &#x60;/transfer/originator/funding_account/update&#x60; endpoint to update the funding account associated with the originator.
   * @param transferOriginatorFundingAccountUpdateRequest  (required)
   * @return Call&lt;TransferOriginatorFundingAccountUpdateResponse&gt;
   * 
   * @see <a href="/api/products/transfer/platform-payments/#transferoriginatorfunding_accountupdate">Update the funding account associated with the originator Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("transfer/originator/funding_account/update")
  Call<TransferOriginatorFundingAccountUpdateResponse> transferOriginatorFundingAccountUpdate(
    @retrofit2.http.Body TransferOriginatorFundingAccountUpdateRequest transferOriginatorFundingAccountUpdateRequest
  );

  /**
   * Get status of an originator&#39;s onboarding
   * The &#x60;/transfer/originator/get&#x60; endpoint gets status updates for an originator&#39;s onboarding process. This information is also available via the Transfer page on the Plaid dashboard.
   * @param transferOriginatorGetRequest  (required)
   * @return Call&lt;TransferOriginatorGetResponse&gt;
   * 
   * @see <a href="/api/products/transfer/platform-payments/#transferoriginatorget">Get status of an originator&#39;s onboarding Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("transfer/originator/get")
  Call<TransferOriginatorGetResponse> transferOriginatorGet(
    @retrofit2.http.Body TransferOriginatorGetRequest transferOriginatorGetRequest
  );

  /**
   * Get status of all originators&#39; onboarding
   * The &#x60;/transfer/originator/list&#x60; endpoint gets status updates for all of your originators&#39; onboarding. This information is also available via the Plaid dashboard.
   * @param transferOriginatorListRequest  (required)
   * @return Call&lt;TransferOriginatorListResponse&gt;
   * 
   * @see <a href="/api/products/transfer/platform-payments/#transferoriginatorlist">Get status of all originators&#39; onboarding Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("transfer/originator/list")
  Call<TransferOriginatorListResponse> transferOriginatorList(
    @retrofit2.http.Body TransferOriginatorListRequest transferOriginatorListRequest
  );

  /**
   * Create an originator for scaled platform customers
   * The &#x60;/transfer/platform/originator/create&#x60; endpoint allows gathering information about the originator specific to the Scaled Platform Transfer offering, including the originator&#39;s agreement to legal terms required before accepting any further information related to the originator.
   * @param transferPlatformOriginatorCreateRequest  (required)
   * @return Call&lt;TransferPlatformOriginatorCreateResponse&gt;
   * 
   * @see <a href="/api/products/transfer/platform/originator/#transferplatformoriginatorcreate">Create an originator for scaled platform customers Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("transfer/platform/originator/create")
  Call<TransferPlatformOriginatorCreateResponse> transferPlatformOriginatorCreate(
    @retrofit2.http.Body TransferPlatformOriginatorCreateRequest transferPlatformOriginatorCreateRequest
  );

  /**
   * Submit onboarding requirements for Scaled Platform originators
   * The &#x60;/transfer/platform/requirement/submit&#x60; endpoint allows platforms to submit onboarding requirements for an originator as part of the Scaled Platform Transfer offering.
   * @param transferPlatformRequirementSubmitRequest  (required)
   * @return Call&lt;TransferPlatformRequirementSubmitResponse&gt;
   * 
   * @see <a href="/api/products/transfer/platform-payments/#transferplatformrequirementsubmit">Submit onboarding requirements for Scaled Platform originators Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("transfer/platform/requirement/submit")
  Call<TransferPlatformRequirementSubmitResponse> transferPlatformRequirementSubmit(
    @retrofit2.http.Body TransferPlatformRequirementSubmitRequest transferPlatformRequirementSubmitRequest
  );

  /**
   * Generate a Plaid-hosted onboarding UI URL.
   * The &#x60;/transfer/questionnaire/create&#x60; endpoint generates a Plaid-hosted onboarding UI URL. Redirect the originator to this URL to provide their due diligence information and agree to Plaid’s terms for ACH money movement.
   * @param transferQuestionnaireCreateRequest  (required)
   * @return Call&lt;TransferQuestionnaireCreateResponse&gt;
   * 
   * @see <a href="/api/products/transfer/platform-payments/#transferquestionnairecreate">Generate a Plaid-hosted onboarding UI URL. Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("transfer/questionnaire/create")
  Call<TransferQuestionnaireCreateResponse> transferQuestionnaireCreate(
    @retrofit2.http.Body TransferQuestionnaireCreateRequest transferQuestionnaireCreateRequest
  );

  /**
   * Cancel a recurring transfer.
   * Use the &#x60;/transfer/recurring/cancel&#x60; endpoint to cancel a recurring transfer.  Scheduled transfer that hasn&#39;t been submitted to bank will be cancelled.
   * @param transferRecurringCancelRequest  (required)
   * @return Call&lt;TransferRecurringCancelResponse&gt;
   * 
   * @see <a href="/api/products/transfer/recurring-transfers/#transferrecurringcancel">Cancel a recurring transfer. Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("transfer/recurring/cancel")
  Call<TransferRecurringCancelResponse> transferRecurringCancel(
    @retrofit2.http.Body TransferRecurringCancelRequest transferRecurringCancelRequest
  );

  /**
   * Create a recurring transfer
   * Use the &#x60;/transfer/recurring/create&#x60; endpoint to initiate a new recurring transfer. This capability is not currently supported for Transfer UI or Platform Payments (beta) customers.
   * @param transferRecurringCreateRequest  (required)
   * @return Call&lt;TransferRecurringCreateResponse&gt;
   * 
   * @see <a href="/api/products/transfer/recurring-transfers/#transferrecurringcreate">Create a recurring transfer Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("transfer/recurring/create")
  Call<TransferRecurringCreateResponse> transferRecurringCreate(
    @retrofit2.http.Body TransferRecurringCreateRequest transferRecurringCreateRequest
  );

  /**
   * Retrieve a recurring transfer
   * The &#x60;/transfer/recurring/get&#x60; fetches information about the recurring transfer corresponding to the given &#x60;recurring_transfer_id&#x60;.
   * @param transferRecurringGetRequest  (required)
   * @return Call&lt;TransferRecurringGetResponse&gt;
   * 
   * @see <a href="/api/products/transfer/recurring-transfers/#transferrecurringget">Retrieve a recurring transfer Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("transfer/recurring/get")
  Call<TransferRecurringGetResponse> transferRecurringGet(
    @retrofit2.http.Body TransferRecurringGetRequest transferRecurringGetRequest
  );

  /**
   * List recurring transfers
   * Use the &#x60;/transfer/recurring/list&#x60; endpoint to see a list of all your recurring transfers and their statuses. Results are paginated; use the &#x60;count&#x60; and &#x60;offset&#x60; query parameters to retrieve the desired recurring transfers. 
   * @param transferRecurringListRequest  (required)
   * @return Call&lt;TransferRecurringListResponse&gt;
   * 
   * @see <a href="/api/products/transfer/recurring-transfers/#transferrecurringlist">List recurring transfers Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("transfer/recurring/list")
  Call<TransferRecurringListResponse> transferRecurringList(
    @retrofit2.http.Body TransferRecurringListRequest transferRecurringListRequest
  );

  /**
   * Cancel a refund
   * Use the &#x60;/transfer/refund/cancel&#x60; endpoint to cancel a refund.  A refund is eligible for cancellation if it has not yet been submitted to the payment network.
   * @param transferRefundCancelRequest  (required)
   * @return Call&lt;TransferRefundCancelResponse&gt;
   * 
   * @see <a href="/api/products/transfer/refunds/#transferrefundcancel">Cancel a refund Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("transfer/refund/cancel")
  Call<TransferRefundCancelResponse> transferRefundCancel(
    @retrofit2.http.Body TransferRefundCancelRequest transferRefundCancelRequest
  );

  /**
   * Create a refund
   * Use the &#x60;/transfer/refund/create&#x60; endpoint to create a refund for a transfer. A transfer can be refunded if the transfer was initiated in the past 180 days.  Processing of the refund will not occur until at least 4 business days following the transfer&#39;s settlement date, plus any hold/settlement delays. This 3-day window helps better protect your business from regular ACH returns. Consumer initiated returns (unauthorized returns) could still happen for about 60 days from the settlement date. If the original transfer is canceled, returned or failed, all pending refunds will automatically be canceled. Processed refunds cannot be revoked.
   * @param transferRefundCreateRequest  (required)
   * @return Call&lt;TransferRefundCreateResponse&gt;
   * 
   * @see <a href="/api/products/transfer/refunds/#transferrefundcreate">Create a refund Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("transfer/refund/create")
  Call<TransferRefundCreateResponse> transferRefundCreate(
    @retrofit2.http.Body TransferRefundCreateRequest transferRefundCreateRequest
  );

  /**
   * Retrieve a refund
   * The &#x60;/transfer/refund/get&#x60; endpoint fetches information about the refund corresponding to the given &#x60;refund_id&#x60;.
   * @param transferRefundGetRequest  (required)
   * @return Call&lt;TransferRefundGetResponse&gt;
   * 
   * @see <a href="/api/products/transfer/refunds/#transferrefundget">Retrieve a refund Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("transfer/refund/get")
  Call<TransferRefundGetResponse> transferRefundGet(
    @retrofit2.http.Body TransferRefundGetRequest transferRefundGetRequest
  );

  /**
   * Lists historical repayments
   * The &#x60;/transfer/repayment/list&#x60; endpoint fetches repayments matching the given filters. Repayments are returned in reverse-chronological order (most recent first) starting at the given &#x60;start_time&#x60;.
   * @param transferRepaymentListRequest  (required)
   * @return Call&lt;TransferRepaymentListResponse&gt;
   * 
   * @see <a href="/api/products/transfer/#transferrepaymentlist">Lists historical repayments Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("transfer/repayment/list")
  Call<TransferRepaymentListResponse> transferRepaymentList(
    @retrofit2.http.Body TransferRepaymentListRequest transferRepaymentListRequest
  );

  /**
   * List the returns included in a repayment
   * The &#x60;/transfer/repayment/return/list&#x60; endpoint retrieves the set of returns that were batched together into the specified repayment. The sum of amounts of returns retrieved by this request equals the amount of the repayment.
   * @param transferRepaymentReturnListRequest  (required)
   * @return Call&lt;TransferRepaymentReturnListResponse&gt;
   * 
   * @see <a href="/api/products/transfer/#transferrepaymentreturnlist">List the returns included in a repayment Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("transfer/repayment/return/list")
  Call<TransferRepaymentReturnListResponse> transferRepaymentReturnList(
    @retrofit2.http.Body TransferRepaymentReturnListRequest transferRepaymentReturnListRequest
  );

  /**
   * Retrieve a sweep
   * The &#x60;/transfer/sweep/get&#x60; endpoint fetches a sweep corresponding to the given &#x60;sweep_id&#x60;.
   * @param transferSweepGetRequest  (required)
   * @return Call&lt;TransferSweepGetResponse&gt;
   * 
   * @see <a href="/api/products/transfer/reading-transfers/#transfersweepget">Retrieve a sweep Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("transfer/sweep/get")
  Call<TransferSweepGetResponse> transferSweepGet(
    @retrofit2.http.Body TransferSweepGetRequest transferSweepGetRequest
  );

  /**
   * List sweeps
   * The &#x60;/transfer/sweep/list&#x60; endpoint fetches sweeps matching the given filters.
   * @param transferSweepListRequest  (required)
   * @return Call&lt;TransferSweepListResponse&gt;
   * 
   * @see <a href="/api/products/transfer/reading-transfers/#transfersweeplist">List sweeps Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("transfer/sweep/list")
  Call<TransferSweepListResponse> transferSweepList(
    @retrofit2.http.Body TransferSweepListRequest transferSweepListRequest
  );

  /**
   * Retrieve User Account
   * Returns user permissioned account data including identity and Item access tokens.
   * @param userAccountSessionGetRequest  (required)
   * @return Call&lt;UserAccountSessionGetResponse&gt;
   * 
   * @see <a href="/api/products/layer/#user_accountsessionget">Retrieve User Account Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("user_account/session/get")
  Call<UserAccountSessionGetResponse> userAccountSessionGet(
    @retrofit2.http.Body UserAccountSessionGetRequest userAccountSessionGetRequest
  );

  /**
   * Create user
   * This endpoint should be called for each of your end users before they begin a Plaid Check or Income flow, or a Multi-Item Link flow. This provides you a single token to access all data associated with the user. You should only create one per end user.  The &#x60;consumer_report_user_identity&#x60; object must be present in order to create a Plaid Check Consumer Report for a user. If it is not provided during the &#x60;/user/create&#x60; call, it can be added later by calling &#x60;/user/update&#x60;.  If you call the endpoint multiple times with the same &#x60;client_user_id&#x60;, the first creation call will succeed and the rest will fail with an error message indicating that the user has been created for the given &#x60;client_user_id&#x60;.  Ensure that you store the &#x60;user_token&#x60; along with your user&#39;s identifier in your database, as it is not possible to retrieve a previously created &#x60;user_token&#x60;.
   * @param userCreateRequest  (required)
   * @return Call&lt;UserCreateResponse&gt;
   * 
   * @see <a href="/api/users/#usercreate">Create user Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("user/create")
  Call<UserCreateResponse> userCreate(
    @retrofit2.http.Body UserCreateRequest userCreateRequest
  );

  /**
   * Get Items associated with a User
   * Returns Items associated with a User along with their corresponding statuses.
   * @param userItemsGetRequest  (required)
   * @return Call&lt;UserItemsGetResponse&gt;
   * 
   * @see <a href="/api/users/#useritemsget">Get Items associated with a User Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("user/items/get")
  Call<UserItemsGetResponse> userItemsGet(
    @retrofit2.http.Body UserItemsGetRequest userItemsGetRequest
  );

  /**
   * Remove user
   * &#x60;/user/remove&#x60; deletes a user token and and associated information, including any Items associated with the token.  Any subsequent calls to retrieve information using the same user token will result in an error stating the user does not exist.
   * @param userRemoveRequest  (required)
   * @return Call&lt;UserRemoveResponse&gt;
   * 
   * @see <a href="/api/users/#userremove">Remove user Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("user/remove")
  Call<UserRemoveResponse> userRemove(
    @retrofit2.http.Body UserRemoveRequest userRemoveRequest
  );

  /**
   * Update user information
   * This endpoint is used to update user information associated with an existing &#x60;user_token&#x60;. It can also be used to enable an existing &#x60;user_token&#x60; for use with Consumer Reports by Plaid Check, by adding a &#x60;consumer_report_user_identity&#x60; object to the user.
   * @param userUpdateRequest  (required)
   * @return Call&lt;UserUpdateResponse&gt;
   * 
   * @see <a href="/api/users/#userupdate">Update user information Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("user/update")
  Call<UserUpdateResponse> userUpdate(
    @retrofit2.http.Body UserUpdateRequest userUpdateRequest
  );

  /**
   * Create an e-wallet
   * Create an e-wallet. The response is the newly created e-wallet object.
   * @param walletCreateRequest  (required)
   * @return Call&lt;WalletCreateResponse&gt;
   * 
   * @see <a href="/api/products/virtual-accounts/#walletcreate">Create an e-wallet Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("wallet/create")
  Call<WalletCreateResponse> walletCreate(
    @retrofit2.http.Body WalletCreateRequest walletCreateRequest
  );

  /**
   * Fetch an e-wallet
   * Fetch an e-wallet. The response includes the current balance.
   * @param walletGetRequest  (required)
   * @return Call&lt;WalletGetResponse&gt;
   * 
   * @see <a href="/api/products/virtual-accounts/#walletget">Fetch an e-wallet Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("wallet/get")
  Call<WalletGetResponse> walletGet(
    @retrofit2.http.Body WalletGetRequest walletGetRequest
  );

  /**
   * Fetch a list of e-wallets
   * This endpoint lists all e-wallets in descending order of creation.
   * @param walletListRequest  (required)
   * @return Call&lt;WalletListResponse&gt;
   * 
   * @see <a href="/api/products/virtual-accounts/#walletlist">Fetch a list of e-wallets Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("wallet/list")
  Call<WalletListResponse> walletList(
    @retrofit2.http.Body WalletListRequest walletListRequest
  );

  /**
   * Execute a transaction using an e-wallet
   * Execute a transaction using the specified e-wallet. Specify the e-wallet to debit from, the counterparty to credit to, the idempotency key to prevent duplicate transactions, the amount and reference for the transaction. Transactions will settle in seconds to several days, depending on the underlying payment rail.
   * @param walletTransactionExecuteRequest  (required)
   * @return Call&lt;WalletTransactionExecuteResponse&gt;
   * 
   * @see <a href="/api/products/virtual-accounts/#wallettransactionexecute">Execute a transaction using an e-wallet Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("wallet/transaction/execute")
  Call<WalletTransactionExecuteResponse> walletTransactionExecute(
    @retrofit2.http.Body WalletTransactionExecuteRequest walletTransactionExecuteRequest
  );

  /**
   * Fetch an e-wallet transaction
   * Fetch a specific e-wallet transaction
   * @param walletTransactionGetRequest  (required)
   * @return Call&lt;WalletTransactionGetResponse&gt;
   * 
   * @see <a href="/api/products/virtual-accounts/#wallettransactionget">Fetch an e-wallet transaction Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("wallet/transaction/get")
  Call<WalletTransactionGetResponse> walletTransactionGet(
    @retrofit2.http.Body WalletTransactionGetRequest walletTransactionGetRequest
  );

  /**
   * List e-wallet transactions
   * This endpoint lists the latest transactions of the specified e-wallet. Transactions are returned in descending order by the &#x60;created_at&#x60; time.
   * @param walletTransactionListRequest  (required)
   * @return Call&lt;WalletTransactionListResponse&gt;
   * 
   * @see <a href="/api/products/virtual-accounts/#wallettransactionlist">List e-wallet transactions Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("wallet/transaction/list")
  Call<WalletTransactionListResponse> walletTransactionList(
    @retrofit2.http.Body WalletTransactionListRequest walletTransactionListRequest
  );

  /**
   * Create a watchlist screening for an entity
   * Create a new entity watchlist screening to check your customer against watchlists defined in the associated entity watchlist program. If your associated program has ongoing screening enabled, this is the profile information that will be used to monitor your customer over time.
   * @param watchlistScreeningEntityCreateRequest  (required)
   * @return Call&lt;WatchlistScreeningEntityCreateResponse&gt;
   * 
   * @see <a href="/api/products/monitor/#watchlist_screeningentitycreate">Create a watchlist screening for an entity Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("watchlist_screening/entity/create")
  Call<WatchlistScreeningEntityCreateResponse> watchlistScreeningEntityCreate(
    @retrofit2.http.Body WatchlistScreeningEntityCreateRequest watchlistScreeningEntityCreateRequest
  );

  /**
   * Get an entity screening
   * Retrieve an entity watchlist screening.
   * @param watchlistScreeningEntityGetRequest  (required)
   * @return Call&lt;WatchlistScreeningEntityGetResponse&gt;
   * 
   * @see <a href="/api/products/monitor/#watchlist_screeningentityget">Get an entity screening Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("watchlist_screening/entity/get")
  Call<WatchlistScreeningEntityGetResponse> watchlistScreeningEntityGet(
    @retrofit2.http.Body WatchlistScreeningEntityGetRequest watchlistScreeningEntityGetRequest
  );

  /**
   * List history for entity watchlist screenings
   * List all changes to the entity watchlist screening in reverse-chronological order. If the watchlist screening has not been edited, no history will be returned.
   * @param watchlistScreeningEntityHistoryListRequest  (required)
   * @return Call&lt;WatchlistScreeningEntityHistoryListResponse&gt;
   * 
   * @see <a href="/api/products/monitor/#watchlist_screeningentityhistorylist">List history for entity watchlist screenings Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("watchlist_screening/entity/history/list")
  Call<WatchlistScreeningEntityHistoryListResponse> watchlistScreeningEntityHistoryList(
    @retrofit2.http.Body WatchlistScreeningEntityHistoryListRequest watchlistScreeningEntityHistoryListRequest
  );

  /**
   * List hits for entity watchlist screenings
   * List all hits for the entity watchlist screening.
   * @param watchlistScreeningEntityHitListRequest  (required)
   * @return Call&lt;WatchlistScreeningEntityHitListResponse&gt;
   * 
   * @see <a href="/api/products/monitor/#watchlist_screeningentityhitlist">List hits for entity watchlist screenings Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("watchlist_screening/entity/hit/list")
  Call<WatchlistScreeningEntityHitListResponse> watchlistScreeningEntityHitList(
    @retrofit2.http.Body WatchlistScreeningEntityHitListRequest watchlistScreeningEntityHitListRequest
  );

  /**
   * List entity watchlist screenings
   * List all entity screenings.
   * @param watchlistScreeningEntityListRequest  (required)
   * @return Call&lt;WatchlistScreeningEntityListResponse&gt;
   * 
   * @see <a href="/api/products/monitor/#watchlist_screeningentitylist">List entity watchlist screenings Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("watchlist_screening/entity/list")
  Call<WatchlistScreeningEntityListResponse> watchlistScreeningEntityList(
    @retrofit2.http.Body WatchlistScreeningEntityListRequest watchlistScreeningEntityListRequest
  );

  /**
   * Get entity watchlist screening program
   * Get an entity watchlist screening program
   * @param watchlistScreeningEntityProgramGetRequest  (required)
   * @return Call&lt;WatchlistScreeningEntityProgramGetResponse&gt;
   * 
   * @see <a href="/api/products/monitor/#watchlist_screeningentityprogramget">Get entity watchlist screening program Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("watchlist_screening/entity/program/get")
  Call<WatchlistScreeningEntityProgramGetResponse> watchlistScreeningEntityProgramGet(
    @retrofit2.http.Body WatchlistScreeningEntityProgramGetRequest watchlistScreeningEntityProgramGetRequest
  );

  /**
   * List entity watchlist screening programs
   * List all entity watchlist screening programs
   * @param watchlistScreeningEntityProgramListRequest  (required)
   * @return Call&lt;WatchlistScreeningEntityProgramListResponse&gt;
   * 
   * @see <a href="/api/products/monitor/#watchlist_screeningentityprogramlist">List entity watchlist screening programs Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("watchlist_screening/entity/program/list")
  Call<WatchlistScreeningEntityProgramListResponse> watchlistScreeningEntityProgramList(
    @retrofit2.http.Body WatchlistScreeningEntityProgramListRequest watchlistScreeningEntityProgramListRequest
  );

  /**
   * Create a review for an entity watchlist screening
   * Create a review for an entity watchlist screening. Reviews are compliance reports created by users in your organization regarding the relevance of potential hits found by Plaid.
   * @param watchlistScreeningEntityReviewCreateRequest  (required)
   * @return Call&lt;WatchlistScreeningEntityReviewCreateResponse&gt;
   * 
   * @see <a href="/api/products/monitor/#watchlist_screeningentityreviewcreate">Create a review for an entity watchlist screening Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("watchlist_screening/entity/review/create")
  Call<WatchlistScreeningEntityReviewCreateResponse> watchlistScreeningEntityReviewCreate(
    @retrofit2.http.Body WatchlistScreeningEntityReviewCreateRequest watchlistScreeningEntityReviewCreateRequest
  );

  /**
   * List reviews for entity watchlist screenings
   * List all reviews for a particular entity watchlist screening. Reviews are compliance reports created by users in your organization regarding the relevance of potential hits found by Plaid.
   * @param watchlistScreeningEntityReviewListRequest  (required)
   * @return Call&lt;WatchlistScreeningEntityReviewListResponse&gt;
   * 
   * @see <a href="/api/products/monitor/#watchlist_screeningentityreviewlist">List reviews for entity watchlist screenings Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("watchlist_screening/entity/review/list")
  Call<WatchlistScreeningEntityReviewListResponse> watchlistScreeningEntityReviewList(
    @retrofit2.http.Body WatchlistScreeningEntityReviewListRequest watchlistScreeningEntityReviewListRequest
  );

  /**
   * Update an entity screening
   * Update an entity watchlist screening.
   * @param watchlistScreeningEntityUpdateRequest The entity screening was successfully updated. (required)
   * @return Call&lt;WatchlistScreeningEntityUpdateResponse&gt;
   * 
   * @see <a href="/api/products/monitor/#watchlist_screeningentityupdate">Update an entity screening Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("watchlist_screening/entity/update")
  Call<WatchlistScreeningEntityUpdateResponse> watchlistScreeningEntityUpdate(
    @retrofit2.http.Body WatchlistScreeningEntityUpdateRequest watchlistScreeningEntityUpdateRequest
  );

  /**
   * Create a watchlist screening for a person
   * Create a new Watchlist Screening to check your customer against watchlists defined in the associated Watchlist Program. If your associated program has ongoing screening enabled, this is the profile information that will be used to monitor your customer over time.
   * @param watchlistScreeningIndividualCreateRequest  (required)
   * @return Call&lt;WatchlistScreeningIndividualCreateResponse&gt;
   * 
   * @see <a href="/api/products/monitor/#watchlist_screeningindividualcreate">Create a watchlist screening for a person Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("watchlist_screening/individual/create")
  Call<WatchlistScreeningIndividualCreateResponse> watchlistScreeningIndividualCreate(
    @retrofit2.http.Body WatchlistScreeningIndividualCreateRequest watchlistScreeningIndividualCreateRequest
  );

  /**
   * Retrieve an individual watchlist screening
   * Retrieve a previously created individual watchlist screening
   * @param watchlistScreeningIndividualGetRequest  (required)
   * @return Call&lt;WatchlistScreeningIndividualGetResponse&gt;
   * 
   * @see <a href="/api/products/monitor/#watchlist_screeningindividualget">Retrieve an individual watchlist screening Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("watchlist_screening/individual/get")
  Call<WatchlistScreeningIndividualGetResponse> watchlistScreeningIndividualGet(
    @retrofit2.http.Body WatchlistScreeningIndividualGetRequest watchlistScreeningIndividualGetRequest
  );

  /**
   * List history for individual watchlist screenings
   * List all changes to the individual watchlist screening in reverse-chronological order. If the watchlist screening has not been edited, no history will be returned.
   * @param watchlistScreeningIndividualHistoryListRequest  (required)
   * @return Call&lt;WatchlistScreeningIndividualHistoryListResponse&gt;
   * 
   * @see <a href="/api/products/monitor/#watchlist_screeningindividualhistorylist">List history for individual watchlist screenings Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("watchlist_screening/individual/history/list")
  Call<WatchlistScreeningIndividualHistoryListResponse> watchlistScreeningIndividualHistoryList(
    @retrofit2.http.Body WatchlistScreeningIndividualHistoryListRequest watchlistScreeningIndividualHistoryListRequest
  );

  /**
   * List hits for individual watchlist screening
   * List all hits found by Plaid for a particular individual watchlist screening.
   * @param watchlistScreeningIndividualHitListRequest  (required)
   * @return Call&lt;WatchlistScreeningIndividualHitListResponse&gt;
   * 
   * @see <a href="/api/products/monitor/#watchlist_screeningindividualhitlist">List hits for individual watchlist screening Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("watchlist_screening/individual/hit/list")
  Call<WatchlistScreeningIndividualHitListResponse> watchlistScreeningIndividualHitList(
    @retrofit2.http.Body WatchlistScreeningIndividualHitListRequest watchlistScreeningIndividualHitListRequest
  );

  /**
   * List Individual Watchlist Screenings
   * List previously created watchlist screenings for individuals
   * @param watchlistScreeningIndividualListRequest  (required)
   * @return Call&lt;WatchlistScreeningIndividualListResponse&gt;
   * 
   * @see <a href="/api/products/monitor/#watchlist_screeningindividuallist">List Individual Watchlist Screenings Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("watchlist_screening/individual/list")
  Call<WatchlistScreeningIndividualListResponse> watchlistScreeningIndividualList(
    @retrofit2.http.Body WatchlistScreeningIndividualListRequest watchlistScreeningIndividualListRequest
  );

  /**
   * Get individual watchlist screening program
   * Get an individual watchlist screening program
   * @param watchlistScreeningIndividualProgramGetRequest  (required)
   * @return Call&lt;WatchlistScreeningIndividualProgramGetResponse&gt;
   * 
   * @see <a href="/api/products/monitor/#watchlist_screeningindividualprogramget">Get individual watchlist screening program Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("watchlist_screening/individual/program/get")
  Call<WatchlistScreeningIndividualProgramGetResponse> watchlistScreeningIndividualProgramGet(
    @retrofit2.http.Body WatchlistScreeningIndividualProgramGetRequest watchlistScreeningIndividualProgramGetRequest
  );

  /**
   * List individual watchlist screening programs
   * List all individual watchlist screening programs
   * @param watchlistScreeningIndividualProgramListRequest  (required)
   * @return Call&lt;WatchlistScreeningIndividualProgramListResponse&gt;
   * 
   * @see <a href="/api/products/monitor/#watchlist_screeningindividualprogramlist">List individual watchlist screening programs Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("watchlist_screening/individual/program/list")
  Call<WatchlistScreeningIndividualProgramListResponse> watchlistScreeningIndividualProgramList(
    @retrofit2.http.Body WatchlistScreeningIndividualProgramListRequest watchlistScreeningIndividualProgramListRequest
  );

  /**
   * Create a review for an individual watchlist screening
   * Create a review for the individual watchlist screening. Reviews are compliance reports created by users in your organization regarding the relevance of potential hits found by Plaid.
   * @param watchlistScreeningIndividualReviewCreateRequest  (required)
   * @return Call&lt;WatchlistScreeningIndividualReviewCreateResponse&gt;
   * 
   * @see <a href="/api/products/monitor/#watchlist_screeningindividualreviewcreate">Create a review for an individual watchlist screening Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("watchlist_screening/individual/review/create")
  Call<WatchlistScreeningIndividualReviewCreateResponse> watchlistScreeningIndividualReviewCreate(
    @retrofit2.http.Body WatchlistScreeningIndividualReviewCreateRequest watchlistScreeningIndividualReviewCreateRequest
  );

  /**
   * List reviews for individual watchlist screenings
   * List all reviews for the individual watchlist screening.
   * @param watchlistScreeningIndividualReviewListRequest  (required)
   * @return Call&lt;WatchlistScreeningIndividualReviewListResponse&gt;
   * 
   * @see <a href="/api/products/monitor/#watchlist_screeningindividualreviewlist">List reviews for individual watchlist screenings Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("watchlist_screening/individual/review/list")
  Call<WatchlistScreeningIndividualReviewListResponse> watchlistScreeningIndividualReviewList(
    @retrofit2.http.Body WatchlistScreeningIndividualReviewListRequest watchlistScreeningIndividualReviewListRequest
  );

  /**
   * Update individual watchlist screening
   * Update a specific individual watchlist screening. This endpoint can be used to add additional customer information, correct outdated information, add a reference id, assign the individual to a reviewer, and update which program it is associated with. Please note that you may not update &#x60;search_terms&#x60; and &#x60;status&#x60; at the same time since editing &#x60;search_terms&#x60; may trigger an automatic &#x60;status&#x60; change.
   * @param watchlistScreeningIndividualUpdateRequest  (required)
   * @return Call&lt;WatchlistScreeningIndividualUpdateResponse&gt;
   * 
   * @see <a href="/api/products/monitor/#watchlist_screeningindividualupdate">Update individual watchlist screening Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("watchlist_screening/individual/update")
  Call<WatchlistScreeningIndividualUpdateResponse> watchlistScreeningIndividualUpdate(
    @retrofit2.http.Body WatchlistScreeningIndividualUpdateRequest watchlistScreeningIndividualUpdateRequest
  );

  /**
   * Get webhook verification key
   * Plaid signs all outgoing webhooks and provides JSON Web Tokens (JWTs) so that you can verify the authenticity of any incoming webhooks to your application. A message signature is included in the &#x60;Plaid-Verification&#x60; header.  The &#x60;/webhook_verification_key/get&#x60; endpoint provides a JSON Web Key (JWK) that can be used to verify a JWT.
   * @param webhookVerificationKeyGetRequest  (required)
   * @return Call&lt;WebhookVerificationKeyGetResponse&gt;
   * 
   * @see <a href="/api/webhooks/webhook-verification/#get-webhook-verification-key">Get webhook verification key Documentation</a>
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("webhook_verification_key/get")
  Call<WebhookVerificationKeyGetResponse> webhookVerificationKeyGet(
    @retrofit2.http.Body WebhookVerificationKeyGetRequest webhookVerificationKeyGetRequest
  );

}
