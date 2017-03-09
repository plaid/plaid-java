package com.plaid.client.internal.gson;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.lang.reflect.ParameterizedType;

/**
 * GSON TypeAdapter for the Optional type.
 */
public class OptionalTypeAdapterFactory implements TypeAdapterFactory {
  @Override
  public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
    if (!Optional.class.isAssignableFrom(type.getRawType())) {
      return null;
    }

    final TypeAdapter delegateAdapter = gson.getAdapter(TypeToken.get(((ParameterizedType) type.getType()).getActualTypeArguments()[0]));

    return new TypeAdapter<T>() {
      @Override
      @SuppressWarnings({"unchecked", "rawtypes"})
      public void write(JsonWriter out, T value) throws IOException {
        if (((Optional) value).isPresent()) {
          delegateAdapter.write(out, ((Optional) value).get());
        } else {
          out.nullValue();
        }
      }

      @Override
      @SuppressWarnings("unchecked")
      public T read(JsonReader in) throws IOException {
        Object readObject = delegateAdapter.read(in);
        if (readObject == null) {
          return (T) Optional.empty();
        } else {
          return (T) Optional.of(readObject);
        }
      }
    };
  }
}
