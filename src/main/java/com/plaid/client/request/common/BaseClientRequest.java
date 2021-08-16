package com.plaid.client.request.common;

/**
 * Abstract base class for requests that require client_id and secret.
 *
 * These fields are later injected by the json serializer, and thus are public.
 */
public abstract class BaseClientRequest {
  public String clientId;
  public String secret;
}
