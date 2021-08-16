package com.plaid.client.internal.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.plaid.client.request.TransactionsGetRequest;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TransactionsBaseOptionsSerializerTest {

  public static class ChildOptions extends TransactionsGetRequest.Options {
    private int anotherIntValue = 2;
  }

  public static class ChildOptionsContainer {
    private ChildOptions options = new ChildOptions();
  }

  public static class OptionsContainer {
    private TransactionsGetRequest.Options options = new TransactionsGetRequest.Options();
  }

  public static class OptionalContainer {
    private Optional<TransactionsGetRequest.BaseOptions> options = Optional.of(new ChildOptions());
  }


  @Test public void testSerializesChildren() {
    Gson gson = new GsonBuilder()
      .registerTypeAdapter(TransactionsGetRequest.BaseOptions.class, new TransactionsBaseOptionsSerializer())
      .create();

    ChildOptionsContainer child = new ChildOptionsContainer();

    String result = gson.toJson(child);
    assertEquals("{\"options\":{\"anotherIntValue\":2}}", result);
  }

  @Test public void testSerializesChildrenWithOptional() {
    Gson gson = new GsonBuilder()
            .registerTypeAdapter(TransactionsGetRequest.BaseOptions.class, new TransactionsBaseOptionsSerializer())
            .registerTypeAdapterFactory(new OptionalTypeAdapterFactory())
            .create();

    OptionalContainer optional = new OptionalContainer();

    String result = gson.toJson(optional);
    assertEquals("{\"options\":{\"anotherIntValue\":2}}", result);
  }


  @Test public void testSerializesBase() {
    Gson gson = new GsonBuilder()
      .registerTypeAdapter(TransactionsGetRequest.BaseOptions.class, new TransactionsBaseOptionsSerializer())
      .create();

    OptionsContainer base = new OptionsContainer();

    String result = gson.toJson(base);
    assertEquals("{\"options\":{}}", result);
  }
}
