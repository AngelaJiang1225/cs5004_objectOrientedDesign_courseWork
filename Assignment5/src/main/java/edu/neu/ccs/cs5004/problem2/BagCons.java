package edu.neu.ccs.cs5004.problem2;

/**
 * Represent the bag of word with details.
 */
public class BagCons implements BagOfWords {
  private String first;
  private BagOfWords rest;

  /**
   * Create a bag of world with details.
   *
   * @param first the first string
   * @param rest  the rest of the bag
   */
  public BagCons(String first, BagOfWords rest) {
    this.first = first;
    this.rest = rest;
  }

  /**
   * Get the first element.
   *
   * @return the first element
   */
  public String getFirst() {
    return this.first;
  }

  /**
   * Get the rest of the bag of words.
   *
   * @return the rest of the bag of words
   */
  public BagOfWords getRest() {
    return this.rest;
  }

  @Override
  public Boolean isEmpty() {
    return false;
  }

  @Override
  public Integer size() {
    if (this.getRest() != null) {
      return 1 + this.getRest().size();
    } else {
      return 1;
    }
  }

  @Override
  public BagOfWords add(String str) {
    //BagOfWords returns a new BagOfWords,
    // anotherBag that contains all the elements of tedBag and the newly added element s.
    return new BagCons(str, this);
  }

  @Override
  public Boolean contains(String str) {
    if (this.isEmpty() || (!this.getFirst().equals(str)) && this.getRest() == null) {
      return false;
    } else if (this.getFirst().equals(str)) {
      return true;
    } else {
      return this.getRest().contains(str);
    }
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || this.getClass() != obj.getClass()) {
      return false;
    }
    BagCons that = (BagCons) obj;
    if (!that.size().equals(this.size())) {
      return false;
    }
    if (that.contains(this.getFirst())) {
      if (that.getRest().isEmpty()) {
        return true;
      }
      return (that.remove(this.getFirst()).equals(this.getRest()));
    } else {
      return false;
    }
  }

  /**
   * return a new bag that has removed the string s.
   *
   * @param str the string to be removed
   * @return bag of words after removing specified str
   */
  public BagOfWords remove(String str) {
    if (!this.contains(str)) {
      return this;
    } else if (!this.getRest().isEmpty()) {
      if (this.getFirst().equals(str)) {
        return new BagCons(((BagCons) this.getRest()).getFirst(),
            ((BagCons) this.getRest()).getRest());
      } else {
        return ((BagCons) this.getRest()).remove(str);
      }
    } else {
      return new Empty();
    }
  }

  @Override
  public int hashCode() {
    int result = getFirst() != null ? getFirst().hashCode() : 0;
    result = 31 * result + (getRest() != null ? getRest().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    StringBuilder str = new StringBuilder();
    str.append("BagCons{");
    BagCons curBagCons = this;
    for (int i = 0; i < this.size() - 1; i++) {
      str.append(curBagCons.getFirst()).append(", ");
      curBagCons = (BagCons) curBagCons.getRest();
    }
    str.append(curBagCons.getFirst());
    str.append("}");
    return str.toString();
  }
}
