package com.plaid.client.internal.gson;

import java.util.NoSuchElementException;

/**
 * Our own simple implementation of an Optional wrapper.
 *
 * Java 8 has this built in, and Guava would provide one too,
 * but we want to target Java 7 and avoid external dependencies,
 * so for now we're using our own.
 */
public final class Optional<T> {
  private static Optional<Object> EMPTY = new Optional<>(null);
  private final T value;

  private Optional(T value) {
    this.value = value;
  }

  /**
   * Create a new Optional containing value.
   *
   * @param value The value contained.
   * @return The value wrapped in an Optional.
   */
  public static <T, S extends T> Optional<T> of(S value) {
    if (value == null) {
      throw new IllegalArgumentException("Optional does not support NULL, use Optional.empty() instead.");
    }

    return new Optional<T>(value);
  }

  /**
   * Get an empty Optional object.
   *
   * @return The Optional object representing no value.
   */
  @SuppressWarnings("unchecked")
  public static <T> Optional<T> empty() {
    return (Optional<T>) EMPTY;
  }

  /**
   * Get the contained value, or if this Optional is empty, throws {@link NoSuchElementException}.
   *
   * @return Contained value, if present.
   */
  public T get() {
    if (!isPresent()) {
      throw new NoSuchElementException();
    }

    return value;
  }

  /**
   * Whether there is a value present in this Optional.
   *
   * @return <code>true</code> if this present contains a value, <code>false</code> otherwise.
   */
  public boolean isPresent() {
    return value != null;
  }

  /**
   * Return the Optional value if present, otherwise return other wrapped in an Optional.
   *
   * @param other The replacement value if one was not present.
   * @return The contained value if one was present, otherwise <code>other</code>.
   */
  public Optional<T> orElse(T other) {
    if (isPresent()) {
      return this;
    } else {
      return Optional.of(other);
    }
  }
}
