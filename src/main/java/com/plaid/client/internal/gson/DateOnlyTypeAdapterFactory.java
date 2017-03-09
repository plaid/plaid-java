package com.plaid.client.internal.gson;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateOnlyTypeAdapterFactory implements TypeAdapterFactory {
  private static final String DATE_FORMAT = "yyyy-MM-dd";
  private final SimpleDateFormat simpleDateFormat;

  public DateOnlyTypeAdapterFactory() {
    this.simpleDateFormat = new SimpleDateFormat(DATE_FORMAT);
  }

  @Override
  public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
    if (!Date.class.isAssignableFrom(type.getRawType())) {
      return null;
    }

    return new TypeAdapter<T>() {
      @Override
      public void write(JsonWriter out, T value) throws IOException {
        // date formatters not thread safe :'(
        synchronized (simpleDateFormat) {
          out.value(simpleDateFormat.format((Date) value));
        }
      }

      @Override
      public T read(JsonReader in) throws IOException {
        throw new UnsupportedOperationException("read() is not implemented");
      }
    };
  }
}
