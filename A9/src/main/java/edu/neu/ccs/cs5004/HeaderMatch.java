package edu.neu.ccs.cs5004;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Represents the receiver's information according to the header.
 */

public class HeaderMatch {

  private Map<String, String> headerMatchMap;

  /**
   * Creates header matched with each receiver's info map.
   */
  public HeaderMatch() {
    this.headerMatchMap = new HashMap<String, String>();
  }

  /**
   * Create the hashmap.
   *
   * @param userValues the hashmap to use
   */
  public HeaderMatch(Map<String, String> userValues) {
    this.headerMatchMap = userValues;
  }

  /**
   * Return the hshmap.
   *
   * @return the hash map.
   */
  public Map<String, String> getReceivers() {
    return this.headerMatchMap;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    HeaderMatch that = (HeaderMatch) obj;
    return Objects.equals(headerMatchMap, that.headerMatchMap);
  }

  @Override
  public int hashCode() {

    return Objects.hash(headerMatchMap);
  }

  @Override
  public String toString() {
    return "HeaderValues{"
        + "userValues=" + headerMatchMap
        + '}';
  }
}