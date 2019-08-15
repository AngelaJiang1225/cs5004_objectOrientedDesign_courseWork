package edu.neu.ccs.cs5004;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Represent the contact file as a map of map to
 * clarify each users' info structure.
 */
public class ContactFile {
  private Map<Integer, HeaderMatch> contactMap;

  /**
   * Create an empty contact file.
   */
  public ContactFile() {
    this.contactMap = new HashMap<Integer, HeaderMatch>();
  }

  /**
   * Creates instance of contact info.
   *
   * @param contacts the contact info as map
   */
  public ContactFile(Map<Integer, HeaderMatch> contacts) {
    this.contactMap = contacts;
  }

  /**
   * Returns the contact file's info.
   *
   * @return the contact file's info as a map
   */
  public Map<Integer, HeaderMatch> getContactMap() {
    return this.contactMap;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    ContactFile that = (ContactFile) obj;
    return Objects.equals(this.contactMap, that.contactMap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.contactMap);
  }

  @Override
  public String toString() {
    return "ContactFile{"
        + "contacts=" + this.contactMap
        + '}';
  }
}

