package com.plaid.client.request;

import com.plaid.client.internal.gson.RequiredField;
import com.plaid.client.request.common.BaseAccessTokenRequest;
import com.plaid.client.request.common.MfaType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.plaid.client.internal.Util.notEmpty;
import static com.plaid.client.internal.Util.notNull;

/**
 * Request for the /item/mfa endpoint.
 *
 * @see <a href="https://plaid.com/docs/api/">https://plaid.com/docs/api</a>
 */
public final class ItemMfaRequest extends BaseAccessTokenRequest {
  private final MfaType mfaType;
  private RequiredField<List<String>> responses = RequiredField.empty();
  private Options options;

  public ItemMfaRequest(String accessToken, MfaType mfaType) {
    super(accessToken);
    notNull(mfaType, "mfaType");
    this.mfaType = mfaType;
  }

  public ItemMfaRequest withResponsesToken(String responsesToken) {
    this.options = new Options(responsesToken);
    return this;
  }

  public ItemMfaRequest withResponses(String... responses) {
    this.withResponses(Arrays.asList(responses));
    return this;
  }

  public ItemMfaRequest withResponses(List<String> responses) {
    notEmpty(responses, "responses");
    this.responses = RequiredField.of(new ArrayList<>(responses));
    return this;
  }

  private static class Options {
    private final String responsesToken;

    private Options(String responsesToken) {
      this.responsesToken = responsesToken;
    }
  }
}
