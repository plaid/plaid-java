package com.plaid.client.internal.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.plaid.client.request.InvestmentsTransactionsGetRequest;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InvestmentsTransactionsBaseOptionsSerializerTest {

  public static class ChildOptions extends InvestmentsTransactionsGetRequest.Options {
    private int anotherIntValue = 2;
  }

  public static class ChildOptionsContainer {
    private ChildOptions options = new ChildOptions();
  }

  public static class OptionsContainer {
    private InvestmentsTransactionsGetRequest.Options options = new InvestmentsTransactionsGetRequest.Options();
  }

  public static class OptionalContainer {
    private Optional<InvestmentsTransactionsGetRequest.BaseOptions> options = Optional.of(new ChildOptions());
  }


  @Test public void testSerializesChildren() {
    Gson gson = new GsonBuilder()
      .registerTypeAdapter(InvestmentsTransactionsGetRequest.BaseOptions.class, new InvestmentsTransactionsBaseOptionsSerializer())
      .create();

    ChildOptionsContainer child = new ChildOptionsContainer();

    String result = gson.toJson(child);
    assertEquals("{\"options\":{\"anotherIntValue\":2}}", result);
  }

  @Test public void testSerializesChildrenWithOptional() {
    Gson gson = new GsonBuilder()
            .registerTypeAdapter(InvestmentsTransactionsGetRequest.BaseOptions.class, new InvestmentsTransactionsBaseOptionsSerializer())
            .registerTypeAdapterFactory(new OptionalTypeAdapterFactory())
            .create();

    OptionalContainer optional = new OptionalContainer();

    String result = gson.toJson(optional);
    assertEquals("{\"options\":{\"anotherIntValue\":2}}", result);
  }


  @Test public void testSerializesBase() {
    Gson gson = new GsonBuilder()
      .registerTypeAdapter(InvestmentsTransactionsGetRequest.BaseOptions.class, new InvestmentsTransactionsBaseOptionsSerializer())
      .create();

    OptionsContainer base = new OptionsContainer();

    String result = gson.toJson(base);
    assertEquals("{\"options\":{}}", result);
  }
}
