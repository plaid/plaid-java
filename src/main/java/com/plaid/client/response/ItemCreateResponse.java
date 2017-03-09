package com.plaid.client.response;

import com.plaid.client.request.common.MfaType;

import java.util.List;

/**
 * Combined response object for both normal and MFA-related responses to /item/create calls.
 *
 * You can use {@link #isMfaResponse()} and {@link #isItemResponse()} to determine which kind of response
 * was received from the server.
 *
 * @see <a href="https://plaid.com/docs/api/">https://plaid.com/docs/api</a>
 */
public final class ItemCreateResponse extends BaseResponse {
  // normal response fields
  private String accessToken;
  private ItemStatus item;
  // MFA response fields
  private String device;
  private List<MfaDevice> deviceList;
  private MfaType mfaType;
  private List<String> questions;
  private List<MfaSelection> selections;

  public static class MfaDevice {
    private String deviceId;
    private String type;
    private String mask;

    public String getDeviceId() {
      return deviceId;
    }

    public String getType() {
      return type;
    }

    public String getMask() {
      return mask;
    }
  }

  public String getAccessToken() {
    return accessToken;
  }

  public ItemStatus getItem() {
    return item;
  }

  public String getDevice() {
    return device;
  }

  public MfaType getMfaType() {
    return mfaType;
  }

  public List<String> getQuestions() {
    return questions;
  }

  public List<MfaDevice> getDeviceList() {
    return deviceList;
  }

  public List<MfaSelection> getSelections() {
    return selections;
  }

  /**
   * @return <code>true</code> this is a normal response containing an item.
   */
  public boolean isItemResponse() {
    return item != null;
  }

  /**
   * @return <code>true</code> this is an MFA response, and MFA will be required before proceeding.
   */
  public boolean isMfaResponse() {
    return mfaType != null;
  }
}
