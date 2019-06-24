package com.plaid.client.request.common;

import com.google.gson.annotations.SerializedName;

public enum Product {
  @SerializedName("assets") ASSETS,
  @SerializedName("balance") BALANCE,
  @SerializedName("credit_details") CREDIT_DETAILS,
  @SerializedName("income") INCOME,
  @SerializedName("identity") IDENTITY,
  @SerializedName("auth") AUTH,
  @SerializedName("transactions") TRANSACTIONS,
  @SerializedName("investments") INVESTMENTS,
  @SerializedName("liabilities") LIABILITIES,
}
