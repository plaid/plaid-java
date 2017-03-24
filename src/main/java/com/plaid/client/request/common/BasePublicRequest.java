package com.plaid.client.request.common;

/**
 * Abstract base class for requests that require public_key.
 *
 * These fields are later injected by the json serializer, and thus are public.
 */
public abstract class BasePublicRequest {
  public String publicKey;
}
