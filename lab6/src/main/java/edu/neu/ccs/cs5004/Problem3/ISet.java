package edu.neu.ccs.cs5004.Problem3;
/**
 * Represents a Set of Integers
 */
public interface ISet<T> {

  /**
   * Returns the total number of elements in the list.
   *
   * @return number of elements in this list
   */
  Integer size();                                // <1>


  /**
   * Creates an empty set.
   */
  Set emptySet();

  /**
   * Justify whether the set is empty
   *
   * @return
   */
  Boolean isEmpty();

 Set add(T n);

  Set remove(T ele);

  T last();

  Boolean contains(T element);

}

