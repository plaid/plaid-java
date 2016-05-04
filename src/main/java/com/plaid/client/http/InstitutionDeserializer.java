package com.plaid.client.http;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.plaid.client.response.Institution;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

// this class is necessary to properly deserialize Institutions returned by the institution/search endpoint
public class InstitutionDeserializer extends JsonDeserializer<Institution> {
    @Override
    public Institution deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode node = jp.getCodec().readTree(jp);
        String id = node.get("id").asText();
        String name = node.get("name").asText();
        Boolean hasMfa = (node.get("has_mfa") != null) ? node.get("has_mfa").asBoolean() : null;
        Map<String, Boolean> productsMap = mapper.convertValue(node.get("products"), Map.class);
        List<String> mfa = mapper.convertValue(node.get("mfa"), List.class);
        Institution.CredentialNames credentialNames = mapper.convertValue(node.get("credentials"), Institution.CredentialNames.class);
        String type = node.get("type").asText();
        List products = new ArrayList(productsMap.keySet());
        return new Institution.InstitutionBuilder().setCredentialNames(credentialNames)
                .setHasMfa(hasMfa)
                .setId(id)
                .setMfaTypes(mfa)
                .setName(name)
                .setProducts(products)
                .setType(type)
                .createInstitution();
    }

}

