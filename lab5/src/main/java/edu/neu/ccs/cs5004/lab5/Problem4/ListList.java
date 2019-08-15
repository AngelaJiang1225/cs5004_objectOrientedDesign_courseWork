package edu.neu.ccs.cs5004.lab5.Problem4;

public class ListList implements iListList {
  private List first;
  private ListList rest;

  public ListList(List first, ListList rest) {
    this.first = first;
    this.rest = rest;
  }

  public List getFirst() {
    return first;
  }

  public ListList getRest() {
    return rest;
  }

  public Integer size() {
    if (this.first.equals(null)) {
      return 0;
    }
    return 1 + this.rest.size();
  }

  public Integer length() {
    Integer length = 0;
    for (int i = 0; i < this.size(); i++) {
      if (this.first != null) {
        length += this.first.size();
      }
    }
    return length;
  }

  public Integer sum() {
    Integer sum = 0;
    for (int i = 0; i < this.size(); i++) {
      if (this.first != null) {
        for (int j = 0; j < this.first.size(); j++) {
          sum += this.first.elementAt(j);
        }
      }
    }
    return sum;
  }

  public Boolean isEmpty() {//
    if (this.getFirst() != null) {
      return false;
    }
    return true;
  }

  public void add(List list) {
    if (this.isEmpty()) {
      this.first = list;
      this.rest = null;
    } else {
      this.first = list;
      this.rest = this.getRest().getRest();
    }
  }

  public void removeInteger(Integer ele) {
    if (!this.getFirst().equals(ele) && !this.getRest().isEmpty()) {
      this.getRest().removeInteger(ele);
    } else if (this.getFirst().equals(ele)) {
      this.first = this.getRest().getFirst();
      this.rest = this.getRest().getRest();
    }
  }

  public ListList removeAllInteger(Integer ele) {
    ListList cons = this;
    while (!cons.getRest().isEmpty()) {
      cons.removeInteger(ele);
      cons.first = cons.getRest().getFirst();
    }
    return cons;
  }

}
