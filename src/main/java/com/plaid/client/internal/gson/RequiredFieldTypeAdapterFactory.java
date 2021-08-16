package com.plaid.client.internal.gson;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.lang.reflect.ParameterizedType;

public class RequiredFieldTypeAdapterFactory implements TypeAdapterFactory {
  @Override
  public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
    if (!type.getRawType().isAssignableFrom(RequiredField.class)) {
      return null;
    }

    final TypeAdapter delegateAdapter = gson.getAdapter(TypeToken.get(((ParameterizedType) type.getType()).getActualTypeArguments()[0]));

    return new TypeAdapter<T>() {
      @Override
      @SuppressWarnings({"unchecked", "rawtypes"})
      public void write(JsonWriter out, T value) throws IOException {
        RequiredField requiredField = (RequiredField) value;

        if (requiredField == null || !requiredField.isPresent()) {
          boolean oldSerializeNulls = out.getSerializeNulls();
          out.setSerializeNulls(true);
          out.nullValue();
          out.setSerializeNulls(oldSerializeNulls);
        } else {
          delegateAdapter.write(out, requiredField.get());
        }
      }

      @Override
      @SuppressWarnings("unchecked")
      public T read(JsonReader reader) throws IOException {
        return (T) RequiredField.of(delegateAdapter.read(reader));
      }
    };
  }
}
