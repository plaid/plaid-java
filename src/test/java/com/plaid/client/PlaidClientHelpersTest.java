package com.plaid.client;

import com.plaid.client.response.ErrorResponse;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import org.junit.Before;
import org.junit.Test;
import retrofit2.Response;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class PlaidClientHelpersTest {
  private PlaidClient plaidClient;

  @Before
  public void setUp() throws Exception {
    plaidClient = PlaidClient.newBuilder()
      .sandboxBaseUrl()
      .publicKey("foo")
      .clientIdAndSecret("bar", "baz")
      .build();
  }

  @Test
  public void testParseError() throws Exception {
    ErrorResponse errorResponse = plaidClient.parseError(Response.error(400, ResponseBody.create(MediaType.parse("application/json"),
      "{\n" +
        "  \"display_message\": \"some message\",\n" +
        "  \"error_code\": \"INVALID_FIELD\",\n" +
        "  \"error_message\": \"query must be a non-empty string\",\n" +
        "  \"error_type\": \"INVALID_REQUEST\",\n" +
        "  \"request_id\": \"4mfTq\"\n" +
        "}"
    )));

    assertEquals("some message", errorResponse.getDisplayMessage());
    assertEquals("INVALID_FIELD", errorResponse.getErrorCode());
    assertEquals("query must be a non-empty string", errorResponse.getErrorMessage());
    assertEquals(ErrorResponse.ErrorType.INVALID_REQUEST, errorResponse.getErrorType());
    assertEquals("4mfTq", errorResponse.getRequestId());
  }

  @Test
  public void testParseErrorMalformed() throws Exception {
    try {
      plaidClient.parseError(Response.error(400, ResponseBody.create(MediaType.parse("application/json"), "{")));
      fail("expected an exception to get thrown");
    } catch (Exception e) {
      assertEquals("Could not parse error response", e.getMessage());
    }
  }
}
