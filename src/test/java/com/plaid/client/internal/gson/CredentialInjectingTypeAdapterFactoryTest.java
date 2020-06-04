package com.plaid.client.internal.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.plaid.client.request.IdentityGetRequest;
import com.plaid.client.request.InstitutionsSearchRequest;
import org.junit.Test;

public class CredentialInjectingTypeAdapterFactoryTest {

  @Test(expected = RuntimeException.class)
  public void testFailsToSerializePrivateRequestWithoutSecretKey() throws Exception {
    Gson gson = new GsonBuilder()
      .registerTypeAdapterFactory(new CredentialInjectingTypeAdapterFactory("foo", null))
      .create();

    gson.toJson(new IdentityGetRequest("blahblahblah"));
  }

  @Test(expected = RuntimeException.class)
  public void testFailsToSerializePrivateRequestWithoutClientId() throws Exception {
    Gson gson = new GsonBuilder()
      .registerTypeAdapterFactory(new CredentialInjectingTypeAdapterFactory(null, "secretss"))
      .create();

    gson.toJson(new IdentityGetRequest("blahblahblah"));
  }
}
