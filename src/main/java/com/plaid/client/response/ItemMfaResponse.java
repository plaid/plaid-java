package com.plaid.client.response;

import com.plaid.client.request.common.MfaType;

import java.util.List;

public final class ItemMfaResponse extends BaseResponse {
  // mfa response fields
  private Device device;
  private List<String> deviceList;
  private MfaType mfaType;
  private List<String> questions;
  private List<MfaSelection> selections;
  // normal response fields
  private ItemStatus item;

  public final static class Device {
    private String displayMessage;

    public String getDisplayMessage() {
	      return displayMessage;
	    }
  }

  public Device getDevice() {
    return device;
  }

  public List<String> getDeviceList() {
    return deviceList;
  }

  public MfaType getMfaType() {
    return mfaType;
  }

  public List<String> getQuestions() {
    return questions;
  }

  public List<MfaSelection> getSelections() {
    return selections;
  }

  public ItemStatus getItem() {
    return item;
  }

  public boolean isItemResponse() {
    return item != null;
  }

  public boolean isMfaResponse() {
    return mfaType != null;
  }
}
