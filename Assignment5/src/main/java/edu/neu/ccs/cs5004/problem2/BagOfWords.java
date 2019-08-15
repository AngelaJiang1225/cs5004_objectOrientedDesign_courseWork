package edu.neu.ccs.cs5004.problem2;

public interface BagOfWords {
  /**
   * Justify whether the bag is empty or not.
   *
   * @return true if the bag of words is empty,else return false.
   */
  Boolean isEmpty();

  /**
   * Return the size of the bag.
   *
   * @return the size of the bag.
   */
  Integer size();

  /**
   * Return a new bag with s added.
   *
   * @param str new String
   * @return new bag that adds a new String s
   */
  BagOfWords add(String str);

  /**
   * Return true if the bag contains String s,else return false.
   *
   * @param str the String s
   * @return true if the bag contains s
   */
  Boolean contains(String str);

  /**
   * Return true if the object equals the bag.
   *
   * @param obj the object to be compared
   * @return true if the object equals the bag.
   */
  boolean equals(Object obj);

  /**
   * create an empty bag of words.
   *
   * @return an new empty bag of words
   */
  static Empty emptyBagOfWords() {
    return new Empty();
  }
}
