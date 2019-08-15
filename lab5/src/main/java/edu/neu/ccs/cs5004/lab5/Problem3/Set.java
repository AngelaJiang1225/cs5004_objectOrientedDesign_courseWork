package edu.neu.ccs.cs5004.lab5.Problem3;

import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 * Represents a non-emty list of integers
 */
public class Set implements iSet {
  private Integer first;
  private Set rest;

  public Set(Integer first, Set rest) {
    this.first = first;
    this.rest = rest;
  }

  public Integer getFirst() {
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

  public Set add(Integer n) {
    if (this.isEmpty()) {
      this.first = n;
      this.rest = null;
      return this;
    }
    if (!this.contains(n) && !this.isEmpty()) {
      this.rest = this.add(this.getFirst());
      this.first = n;
      return this;
    }
    return this;
  }

  public Set remove(Integer ele) {
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

  public Integer last() {
    if (this.rest.isEmpty()) {
      return this.first;
    } else {
      return this.rest.last();
    }

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
}





