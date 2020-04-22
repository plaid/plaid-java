package com.plaid.client.internal.gson;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.Date;

public class OptionalDateTypeAdapterFactory implements TypeAdapterFactory {
  private static final String DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.sss'Z'";
  private final SimpleDateFormat simpleDateFormat;

  public OptionalDateTypeAdapterFactory() {
    this.simpleDateFormat = new SimpleDateFormat(DATE_FORMAT);
  }

  @Override
  public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
    if (!Optional.class.isAssignableFrom(type.getRawType())) {
      return null;
    }
    Type maybeDateType = ((ParameterizedType) type.getType()).getActualTypeArguments()[0];
    if (!Date.class.isAssignableFrom(TypeToken.get(maybeDateType).getRawType())) {
      return null;
    }

    return new TypeAdapter<T>() {
      @Override
      public void write(JsonWriter out, T value) throws IOException {
        if (((Optional) value).isPresent()) {
          Date dateValue = (Date) (((Optional) value).get());
          // date formatters not thread safe :'(
          synchronized (simpleDateFormat) {
            out.value(simpleDateFormat.format(dateValue));
          }
        } else {
          out.nullValue();
        }
      }

      @Override
      public T read(JsonReader in) throws IOException {
        throw new UnsupportedOperationException("read() is not implemented");
      }
    };
  }
}
