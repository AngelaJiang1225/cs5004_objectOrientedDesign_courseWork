package edu.neu.ccs.cs5004.problem1;

/**
 * Create a new empty priority queue.
 */
public class Empty implements PriorityQueue {

  @Override
  public Cons add(Integer priority, String value) {
    return new Cons(new Element(priority, value), this);
  }

  @Override
  public String peek() throws InvalidPopPeekEmptyException {
    throw new InvalidPopPeekEmptyException("Cannot peek empty!");
  }

  @Override
  public PriorityQueue pop() throws InvalidPopPeekEmptyException {
    throw new InvalidPopPeekEmptyException("Cannot pop empty!");
  }

  @Override
  public Boolean isEmpty() {
    return true;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || this.getClass() != obj.getClass()) {
      return false;
    } else {
      return true;
    }
  }

  @Override
  public int hashCode() {
    return 42;
  }

  @Override
  public String toString() {
    return "Empty{}";
  }
}
