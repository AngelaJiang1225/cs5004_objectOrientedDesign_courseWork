package edu.neu.ccs.cs5004.problem1;

/**
 * Represent an element with details.
 */
public class Element {
  private Integer priority;
  private String value;

  /**
   * Construct an element with details.
   *
   * @param priority the priority of element
   * @param value    the value of element
   */
  public Element(Integer priority, String value) {
    if (this.checkPriority(priority)) {
      this.priority = priority;
    }
    this.value = value;
  }

  /**
   * check if the priority is positive.
   *
   * @param priority the priority of element
   * @return true if it is positive,else exception
   * @throws IllegalArgumentException throws this exception if the number is not positive
   */
  public Boolean checkPriority(Integer priority) throws IllegalArgumentException {
    if (priority < 0) {
      throw new IllegalArgumentException("The priority should be positive!");
    } else {
      return true;
    }
  }

  /**
   * Get the priority of the queue.
   *
   * @return the priority of the element
   */
  public Integer getPriority() {
    return this.priority;
  }

  /**
   * Get the value of the elememt.
   *
   * @return the value of the element
   */
  public String getValue() {
    return this.value;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || this.getClass() != obj.getClass()) {
      return false;
    }
    Element ele = (Element) obj;
    if (this.getPriority() != null ? !this.getPriority().equals(ele.getPriority())
        : ele.getPriority() != null) {
      return false;
    }
    return this.getValue() != null ? this.getValue().equals(ele.getValue())
        : ele.getValue() == null;
  }

  @Override
  public int hashCode() {
    int result = getPriority() != null ? getPriority().hashCode() : 0;
    result = 31 * result + (getValue() != null ? getValue().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "Element{"
        + "priority=" + this.getPriority()
        + ", value=" + this.getValue()
        + '}';
  }
}
