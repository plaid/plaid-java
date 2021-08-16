package com.plaid.client.internal.gson;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.plaid.client.request.common.BaseClientRequest;

import java.io.IOException;

/**
 * Creates custom {@link TypeAdapter} which inject credentials into request objects
 * during serialization.
 */
public class CredentialInjectingTypeAdapterFactory implements TypeAdapterFactory {
  private final String clientId;
  private final String secret;

  public CredentialInjectingTypeAdapterFactory(String clientId, String secret) {
    this.clientId = clientId;
    this.secret = secret;
  }

  @Override
  public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
    final TypeAdapter<T> defaultAdapter = gson.getDelegateAdapter(this, type);

    if (BaseClientRequest.class.isAssignableFrom(type.getRawType())) {
      return new TypeAdapter<T>() {
        @Override
        public void write(JsonWriter out, T value) throws IOException {
          if (clientId == null) {
            throw new RuntimeException("clientId was not provided, can't serialize!");
          }

          if (secret == null) {
            throw new RuntimeException("secret was not provided, can't serialize!");
          }

          // inject credentials
          ((BaseClientRequest) value).clientId = clientId;
          ((BaseClientRequest) value).secret = secret;

          defaultAdapter.write(out, value);
        }

        @Override
        public T read(JsonReader in) throws IOException {
          return defaultAdapter.read(in);
        }
      };
    } else {
      return null;
    }
  }
}
