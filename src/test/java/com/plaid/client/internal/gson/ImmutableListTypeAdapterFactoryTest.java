package com.plaid.client.internal.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class ImmutableListTypeAdapterFactoryTest {
  private static class SomeObject {
    List<String> contents;
  }

  private Gson gson;

  @Before
  public void setUp() throws Exception {
    gson = new GsonBuilder()
      .registerTypeAdapterFactory(new ImmutableListTypeAdapterFactory())
      .create();
  }

  @Test
  public void testSerialize() throws Exception {
    SomeObject obj = new SomeObject();
    obj.contents = Arrays.asList("hello", "there", "interesting", "data");
    String json = gson.toJson(obj);
    assertEquals("{\"contents\":[\"hello\",\"there\",\"interesting\",\"data\"]}", json);
  }

  @Test
  public void testDeserializeNull() throws Exception {
    SomeObject result = gson.fromJson("{}", SomeObject.class);
    assertNull(result.contents);

    result = gson.fromJson("{\"contents\": null}", SomeObject.class);
    assertNull(result.contents);
  }

  @Test
  public void testDeserializeNonNullContentsCorrect() throws Exception {
    SomeObject result = gson.fromJson("{\"contents\":[\"hello\",\"there\",\"interesting\",\"data\"]}", SomeObject.class);
    assertEquals(Arrays.asList("hello", "there", "interesting", "data"), result.contents);
  }

  @Test(expected = UnsupportedOperationException.class)
  public void testDeserializeNonNullIsImmutable() throws Exception {
    SomeObject result = gson.fromJson("{\"contents\":[\"hello\",\"there\",\"interesting\",\"data\"]}", SomeObject.class);
    result.contents.add("blah blah blah");
  }
}
