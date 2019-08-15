package edu.neu.ccs.cs5004.lab5.simpleList;

/**
 * Represents the empty list of integers.
 */


public abstract class Empty implements List {


  /**
   * {@inheritDoc}
   */

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    else return true;
  }


  /**
   * {@inheritDoc}
   */

  public int hashCode() {
    return 42;
  }


  public String toString() {
    return "Empty{}";
  }


  public Integer size() {
    return 0;
  }


  public Boolean isEmpty() {
    return true;
  }


  public List add(Integer element) {
    return new Cons(element, this);
  }


  public Integer last() throws InvalidCallException {
    throw new InvalidCallException("Called last() on empty!");
  }
}
