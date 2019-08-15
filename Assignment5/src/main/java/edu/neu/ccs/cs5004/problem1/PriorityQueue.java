package edu.neu.ccs.cs5004.problem1;

/**
 * Interface representing operations of priority queue.
 */
public interface PriorityQueue {
  /**
   * Create an empty queue.
   *
   * @return Empty queue
   */
  static Empty createEmpty() {
    return new Empty();
  }

  /**
   * Justify whether the queue is empty.
   *
   * @return true if the queue is empty
   */
  Boolean isEmpty();

  /**
   * Create and return a new BagCons to add specified element.
   *
   * @param priority the priority of the element to be added
   * @param value    the value of the element to be added
   * @return new BagCons that add the element
   */
  // add element in the order of decreasing priority
  Cons add(Integer priority, String value);

  /**
   * Throws exception if the pop is invalid.
   *
   * @return the element to be peeked
   * @throws InvalidPopPeekEmptyException InvalidPopPeekEmptyException
   */
  String peek() throws InvalidPopPeekEmptyException;

  /**
   * returns the PQ without the element with the highest priority.
   *
   * @return new queue that has popped
   * @throws InvalidPopPeekEmptyException if the pop is invalid throw the exception
   */
  PriorityQueue pop() throws InvalidPopPeekEmptyException;

}
