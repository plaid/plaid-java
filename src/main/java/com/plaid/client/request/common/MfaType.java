package com.plaid.client.request.common;

import com.google.gson.annotations.SerializedName;

public enum MfaType {
  @SerializedName("device")DEVICE,
  @SerializedName("device_list")DEVICE_LIST,
  @SerializedName("questions")QUESTIONS,
  @SerializedName("selections")SELECTIONS
}
