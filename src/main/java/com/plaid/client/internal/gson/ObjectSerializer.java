package com.plaid.client.internal.gson;

import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.plaid.client.request.TransactionsGetRequest;
import java.lang.reflect.Type;

// By default Gson serialization takes the field base class and iterates through those fields.
// However by serializing the field as an Object type it automatically picks up member variables
// of child classes.
public class ObjectSerializer implements JsonSerializer<TransactionsGetRequest.Options> {
  @Override public JsonElement serialize(TransactionsGetRequest.Options options, Type type,
    JsonSerializationContext ctx) {
    return ctx.serialize(options);
  }
}
