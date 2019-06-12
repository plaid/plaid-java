package com.plaid.client.internal.gson;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.plaid.client.request.InvestmentsTransactionsGetRequest;
import java.lang.reflect.Type;

// By default Gson serialization takes the field base class and iterates through those fields.
// However by serializing the field as an Object type it automatically picks up member variables
// of child classes.
public class InvestmentsTransactionsBaseOptionsSerializer implements JsonSerializer<InvestmentsTransactionsGetRequest.BaseOptions> {
  @Override public JsonElement serialize(InvestmentsTransactionsGetRequest.BaseOptions options, Type type,
    JsonSerializationContext ctx) {
    return ctx.serialize(options);
  }
}
