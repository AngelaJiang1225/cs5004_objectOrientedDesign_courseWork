package edu.neu.ccs.cs5004.problem2;

public class Empty implements BagOfWords {


  @Override
  public Boolean isEmpty() {
    return true;
  }

  @Override
  public Integer size() {
    return 0;
  }

  @Override
  public BagOfWords add(String str) {
    return new BagCons(str, new Empty());
  }

  @Override
  public Boolean contains(String str) {
    return false;
  }

  public Empty remove(String str) {
    return this;
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
