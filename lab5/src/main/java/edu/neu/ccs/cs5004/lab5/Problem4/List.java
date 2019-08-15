package edu.neu.ccs.cs5004.lab5.Problem4;


/**
 * Represents a non-emty list of integers
 */
public class List implements edu.neu.ccs.cs5004.lab5.simpleList.List {
  private Integer first;
  private edu.neu.ccs.cs5004.lab5.simpleList.List rest;

  /**
   * Given an integer and a list create a new list with the
   * same elements as {@code rest} and with {@code first} prepended.
   *
   * @param first new element to add to the beginning of the list
   * @param rest  the list we are going to use to add our new element
   */
  public List(Integer first, edu.neu.ccs.cs5004.lab5.simpleList.List rest) {
    this.first = first;
    this.rest = rest;
  }

  /**
   * Getter for property 'first'.
   *
   * @return Value for property 'first'.
   */
  public Integer getFirst() {
    return first;
  }

  /**
   * Getter for property 'rest'.
   *
   * @return Value for property 'rest'.
   */
  public edu.neu.ccs.cs5004.lab5.simpleList.List getRest() {
    return rest;
  }


  public Integer size() { //                   // <4>
    return 1 + this.getRest().size();      // <5>
  }


  public Boolean isEmpty() {
    return false;
  }


  public edu.neu.ccs.cs5004.lab5.simpleList.List add(Integer element) {
    return new edu.neu.ccs.cs5004.lab5.simpleList.Cons(element, this);
  }


  public Integer last() {
    if (this.rest.isEmpty()) {
      return this.first;
    } else {
      return this.rest.last();
    }

  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    edu.neu.ccs.cs5004.lab5.simpleList.Cons cons = (edu.neu.ccs.cs5004.lab5.simpleList.Cons) o;

    if (getFirst() != null ? !getFirst().equals(cons.getFirst()) : cons.getFirst() != null)
      return false;
    return getRest() != null ? getRest().equals(cons.getRest()) : cons.getRest() == null;
  }

  @Override
  public int hashCode() {
    int result = getFirst() != null ? getFirst().hashCode() : 0;
    result = 31 * result + (getRest() != null ? getRest().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "Cons{"
        + "first=" + first
        + ", rest=" + rest
        + '}';
  }

  public Boolean contains(Integer element) {
    if (this.first != null) {
      if (element.equals(this.first)) {
        return true;
      }
      return this.rest.contains(element);
    } else {
      return false;
    }
  }

  public Integer elementAt(Integer index) {
    if (index >= this.size() || index < 0 || this.first == null) {
      return null;
    }
    if (index.equals(0)) {
      return this.first;
    }
    return this.rest.elementAt(index - 1);
  }
}




