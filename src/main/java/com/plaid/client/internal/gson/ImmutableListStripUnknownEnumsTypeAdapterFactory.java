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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Deserializes all {@link List} types as unmodifiable lists to
 * preserve immutability.
 */
public class ImmutableListStripUnknownEnumsTypeAdapterFactory implements TypeAdapterFactory {
  @Override
  public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
    if (!List.class.isAssignableFrom(type.getRawType())) {
      return null;
    }

    final TypeAdapter<T> delegate = gson.getDelegateAdapter(this, type);
    Type actualTypeArgument = ((ParameterizedType) type.getType()).getActualTypeArguments()[0];

    final boolean isEnumType = actualTypeArgument instanceof Class && Enum.class.isAssignableFrom(
      (Class<?>) actualTypeArgument);
    return new TypeAdapter<T>() {
      @Override
      public void write(JsonWriter out, T value) throws IOException {
        // no-op. just pass through to the delegate.
        delegate.write(out, value);
      }

      @Override
      @SuppressWarnings({"unchecked", "rawtypes"})
      public T read(JsonReader in) throws IOException {
        T value = delegate.read(in);

        if (value == null) {
          return null;
        }

        List<?> valueList = (List<?>) value;
        if (isEnumType) {
          List<Object> strippedList = new ArrayList<>(valueList.size());
          for (Object enumValue : valueList) {
            if (enumValue != null) {
              strippedList.add(enumValue);
            }
          }
          return (T) Collections.unmodifiableList(strippedList);
        }
        return (T) Collections.unmodifiableList(valueList);
      }
    };
  }
}
