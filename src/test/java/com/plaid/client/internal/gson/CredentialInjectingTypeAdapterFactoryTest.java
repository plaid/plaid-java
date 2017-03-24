package com.plaid.client.internal.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.plaid.client.request.IdentityGetRequest;
import com.plaid.client.request.InstitutionsSearchRequest;
import org.junit.Test;

public class CredentialInjectingTypeAdapterFactoryTest {

  @Test(expected = RuntimeException.class)
  public void testFailsToSerializePublicRequestWithoutPublicKey() throws Exception {
    Gson gson = new GsonBuilder()
      .registerTypeAdapterFactory(new CredentialInjectingTypeAdapterFactory(null, "foo", "bar"))
      .create();

    gson.toJson(new InstitutionsSearchRequest("something"));
  }

  @Test(expected = RuntimeException.class)
  public void testFailsToSerializePrivateRequestWithoutSecretKey() throws Exception {
    Gson gson = new GsonBuilder()
      .registerTypeAdapterFactory(new CredentialInjectingTypeAdapterFactory("stuff", "foo", null))
      .create();

    gson.toJson(new IdentityGetRequest("blahblahblah"));
  }

  @Test(expected = RuntimeException.class)
  public void testFailsToSerializePrivateRequestWithoutClientId() throws Exception {
    Gson gson = new GsonBuilder()
      .registerTypeAdapterFactory(new CredentialInjectingTypeAdapterFactory("stuff", null, "secretss"))
      .create();

    gson.toJson(new IdentityGetRequest("blahblahblah"));
  }
}
