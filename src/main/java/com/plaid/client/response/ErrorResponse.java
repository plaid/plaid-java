package com.plaid.client.response;

/**
 * Common response returned when an error occurs as a result of any API call.
 *
 * @see <a href="https://plaid.com/docs/api/">https://plaid.com/docs/api</a>
 */
public final class ErrorResponse extends BaseResponse {
  /**
   * The error type.
   */
  public enum ErrorType {
    INVALID_REQUEST, INVALID_INPUT, RATE_LIMIT_EXCEEDED, API_ERROR, ITEM_ERROR, INSTITUTION_ERROR, ASSET_REPORT_ERROR
  }

  private String displayMessage;
  private String errorCode;
  private String errorMessage;
  private ErrorType errorType;

  // Error code constants
  public static String PRODUCT_NOT_READY = "PRODUCT_NOT_READY";

  public String getDisplayMessage() {
    return displayMessage;
  }

  public String getErrorCode() {
    return errorCode;
  }

  public String getErrorMessage() {
    return errorMessage;
  }

  public ErrorType getErrorType() {
    return errorType;
  }

  @Override
  public String toString() {
    return "ErrorResponse{" +
      "displayMessage='" + displayMessage + '\'' +
      ", errorCode='" + errorCode + '\'' +
      ", errorMessage='" + errorMessage + '\'' +
      ", errorType='" + errorType + '\'' +
      ", requestId='" + getRequestId() + '\'' +
      '}';
  }
}
