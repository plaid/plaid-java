package com.plaid.client.internal.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class ImmutableListStripUnknownEnumsTypeAdapterFactoryTest {
  private static class SomeObject {
    List<String> contents;
    List<SomeEnum> someEnums;
  }

  private enum SomeEnum {
    @SerializedName("foo") FOO,
    @SerializedName("bar") BAR,
  }

  private Gson gson;

  @Before
  public void setUp() throws Exception {
    gson = new GsonBuilder()
      .registerTypeAdapterFactory(new ImmutableListStripUnknownEnumsTypeAdapterFactory())
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
    assertNull(result.someEnums);
  }

  @Test
  public void testDeserializeNonNullContentsCorrect() throws Exception {
    SomeObject result =
      gson.fromJson(
        "{\"contents\":[\"hello\",\"there\",\"interesting\",\"data\", null], \"someEnums\":[\"foo\", \"bar\", \"baz\"]}",
        SomeObject.class);
    assertEquals(Arrays.asList("hello", "there", "interesting", "data", null), result.contents);
    assertEquals(Arrays.asList(SomeEnum.FOO, SomeEnum.BAR), result.someEnums);
  }

  @Test(expected = UnsupportedOperationException.class)
  public void testDeserializeNonNullIsImmutable() throws Exception {
    SomeObject result =
      gson.fromJson("{\"contents\":[\"hello\",\"there\",\"interesting\",\"data\"]}",
        SomeObject.class);
    result.contents.add("blah blah blah");
  }
}
