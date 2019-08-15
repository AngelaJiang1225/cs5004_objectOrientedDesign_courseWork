package edu.neu.ccs.cs5004;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Represent each line as a list of string.
 */
public class TemplateLine {
  //private String line;
  private List<String> lineList;// the list that change line of string into list.

  /**
   * Create an empty TemplateLine.
   */
  public TemplateLine() {
    this.lineList = new ArrayList<>();
  }

  /**
   * Get the linelist of the TemplateLine.
   *
   * @return the linelist of the TemplateLine.
   */
  public List<String> getLineList() {
    return this.lineList;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }
    if (object == null || getClass() != object.getClass()) {
      return false;
    }
    TemplateLine that = (TemplateLine) object;
    return Objects.equals(lineList, that.lineList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lineList);
  }

  @Override
  public String toString() {
    return this.getLineList().toString();
  }
}
