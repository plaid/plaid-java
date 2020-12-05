package com.plaid.client.request;

import com.plaid.client.model.banktransfer.BankTransferUser;
import com.plaid.client.request.common.BaseAccessTokenRequest;
import java.util.Map;

public class BankTransferCreateRequest extends BaseAccessTokenRequest {
  private String idempotencyKey;
  private String accessToken;
  private String accountId;
  private String type;
  private String network;
  private String amount;
  private String isoCurrencyCode;
  private String description;
  private String achClass;
  private BankTransferUser user;
  private String customTag;
  private Map<String, String> metadata;
  private String originationAccountId;

  public LinkTokenCreateRequest(
    String idempotencyKey,
    String accessToken,
    String accountId,
    BankTransferType type,
    BankTransferNetwork network,
    String amount,
    String isoCurrencyCode,
    String description,
    BankTransferUser user,
  ) {
    super(accessToken);
    this.idempotencyKey = idempotencyKey;
    this.accountId = accountId;
    this.type = type;
    this.network = network;
    this.amount = amount;
    this.isoCurrencyCode = isoCurrencyCode;
    this.description = description;
    this.user = user;
  }

  public BankTransferCreateRequest withAchClass(ACHClass achClass) {
    this.achClass = achClass;
    return this;
  }

  public BankTransferCreateRequest withCustomTag(String customTag) {
    this.customTag = customTag;
    return this;
  }

  public BankTransferCreateRequest withMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public BankTransferCreateRequest withOriginationAccountId(String originationAccountId) {
    this.originationAccountId = originationAccountId;
    return this;
  }
}
