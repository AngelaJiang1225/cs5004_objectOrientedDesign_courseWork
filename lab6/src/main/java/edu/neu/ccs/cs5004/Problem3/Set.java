package edu.neu.ccs.cs5004.Problem3;

/**
 * Represents a non-emty list of integers
 */
public class Set <T> implements ISet {
  private T first;
  private Set rest;

  public Set(T first, Set rest) {
    this.first = first;
    this.rest = rest;
  }

  public T getFirst() {
    return first;
  }


  public Set getRest() {
    return rest;
  }


  public Integer size() {
    if (this.isEmpty()) {
      return 0;
    }
    return 1 + this.getRest().size();
  }


  public Set emptySet() {
    Set emptySet = new Set(null, null);
    return emptySet;
  }

  public Boolean isEmpty() {
    if (this.getFirst() == null && this.getRest() == null) {
      return true;
    } else {
      return false;
    }
  }

  public Set add(Object n) {
    if (this.isEmpty()) {
      this.first = (T)n;
      this.rest = null;
      return this;
    }
    if (!this.contains(n) && !this.isEmpty()) {
      this.rest = this.add(this.getFirst());
      this.first = (T)n;
      return this;
    }
    return this;
  }

  public Set remove(Object ele) {
    if (this.isEmpty()) {
      return this;
    } else if (this.contains(ele)) {//contain ele
      if (this.getFirst().equals(ele)) {
        return this.getRest();
      } else {
        return new Set(this.getFirst(), this.getRest().remove(ele));
      }
    } else {// not contain ele
      return this;
    }
  }

  public T last() {
    if (this.rest.isEmpty()) {
      return this.first;
    } else {
      return (T) this.rest.last();
    }

  }

  public Boolean contains(Object element) {
    if (this.first != null) {
      if (element.equals(this.first)) {
        return true;
      }
      return this.rest.contains(element);
    } else {
      return false;
    }
  }
}






