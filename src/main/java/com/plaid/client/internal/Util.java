package com.plaid.client.internal;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Internal utility class for request and response model validation.
 */
public final class Util {
  /**
   * Throws {@link IllegalArgumentException} if provided object is <code>null</code>.
   *
   * @param obj    The object to null check.
   * @param name The name of the field, used to generate an appropriate error message.
   */
  public static void notNull(Object obj, String name) {
    if (obj == null) {
      throw new IllegalArgumentException(name + " == null");
    }
  }

  /**
   * Checks that a given collection is not null and not empty.
   *
   * @param collection    The collection to check
   * @param name The name of the collection to use when raising an error.
   * @throws IllegalArgumentException If the collection was null or empty.
   */
  public static void notEmpty(Collection collection, String name) {
    notNull(collection, name);

    if (collection.isEmpty()) {
      throw new IllegalArgumentException(name + " must not be empty");
    }
  }

  /**
   * Checks that a given array is not null and not empty.
   *
   * @param arr    The array to check
   * @param name The name of the array to use when raising an error.
   * @throws IllegalArgumentException If the collection was null or empty.
   */
  public static void notEmpty(Object[] arr, String name) {
    notNull(arr, name);

    if (arr.length == 0) {
      throw new IllegalArgumentException(name + "must not be empty");
    }
  }

  /**
   * Checks that a given map is not null and not empty.
   *
   * @param map    The map to check
   * @param name The name of the collection to use when raising an error.
   * @throws IllegalArgumentException If the collection was null or empty.
   */
  public static void notEmpty(Map map, String name) {
    notNull(map, name);

    if (map.isEmpty()) {
      throw new IllegalArgumentException(name + " must not be empty");
    }
  }

  /**
   * Checks that i is not null and is in the range min &lt;= i &lt;= max.
   *
   * @param value    The integer value to check.
   * @param min  The minimum bound, inclusive.
   * @param max  The maximum bound, inclusive.
   * @param name The name of the variable being checked, included when an error is raised.
   * @throws IllegalArgumentException If i is null or outside the range.
   */
  public static void isBetween(Integer value, int min, int max, String name) {
    notNull(value, name);

    if (value < min || value > max) {
      throw new IllegalArgumentException(name + "(" + value + ") out of range: " + min + " <= " + name + " <= " + max);
    }
  }

  /**
   * Checks that i is not null and is a positive number
   *
   * @param value    The integer value to check.
   * @param name The name of the variable being checked, included when an error is raised.
   * @throws IllegalArgumentException If i is null or less than 0
   */
  public static void isPositive(Integer value, String name) {
    notNull(value, name);

    if (value < 0) {
      throw new IllegalArgumentException(name + "must be a positive number.");
    }
  }

  /**
   * Helper to convert an alternating key1,value1,key2,value2,...
   * array into a map.
   *
   * @param args Alternating arguments.
   * @return Resulting map.
   */
  public static Map<String, String> arrayToMap(String[] args) {
    if (args.length % 2 != 0) {
      throw new IllegalArgumentException("Must pass in an even number of args, one key per value.");
    }

    Map<String, String> ret = new HashMap<>();

    for (int i = 0; i < args.length; i += 2) {
      ret.put(args[i], args[i + 1]);
    }

    return ret;
  }
}
