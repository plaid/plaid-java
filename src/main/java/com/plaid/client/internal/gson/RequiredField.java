package com.plaid.client.internal.gson;

/**
 * Simple wrapper class for JSON fields that must always
 * be present in serialized output (that is, if not present,
 * <code>null</code> must always be emitted as its value).
 * <p>
 * Basically the same thing as Optional which is in Java 1.8,
 * but we reimplement our own to support lower java versions.
 *
 * @param <T> the type being wrapped
 */
public final class RequiredField<T> {
  private final T value;

  private static final RequiredField<Object> EMPTY = new RequiredField<>(null);

  private RequiredField(T value) {
    this.value = value;
  }

  @SuppressWarnings("unchecked")
  public static <T> RequiredField<T> empty() {
    return (RequiredField<T>) EMPTY;
  }

  public static <T, S extends T> RequiredField<T> of(S value) {
    return new RequiredField<T>(value);
  }

  public boolean isPresent() {
    return value != null;
  }

  public T get() {
    return value;
  }
}
