package com.plaid.client.internal.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ObjectSerializerTest {

  public static class BaseClass {
    private int intValue = 1;
  }

  public static class ChildClass extends BaseClass {
    private int anotherIntValue = 2;
  }

  @Test public void testSerializesChildren() {
    Gson gson = new GsonBuilder()
      .registerTypeAdapter(BaseClass.class, new ObjectSerializer())
      .create();

    ChildClass child = new ChildClass();
    BaseClass base = child;

    String result = gson.toJson(base);
    // Both fields should be present
    assertEquals("{\"anotherIntValue\":2,\"intValue\":1}", result);
  }
}
