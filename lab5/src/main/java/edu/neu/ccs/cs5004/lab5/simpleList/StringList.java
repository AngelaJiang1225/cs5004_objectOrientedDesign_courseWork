package edu.neu.ccs.cs5004.lab5.simpleList;

public class StringList implements StrList {
  private String first;
  private StringList rest;

  public StringList(String first, StringList rest) {
    this.first = first;
    this.rest = rest;
  }

  public String getFirst() {
    return first;
  }

  public StringList getRest() {
    return rest;
  }

  public Boolean isEmpty() {
    if (this.first == null) {
      return true;
    } else {
      return false;
    }
  }

  public Integer size() {
    return 1 + this.getRest().size();
  }

  public Boolean contains(String str) {
    if (this.first != null) {
      if (str.equals(this.first)) {
        return true;
      }
      return this.rest.contains(str);
    } else {
      return false;
    }
  }

  public Boolean containsAll(StringList strList) {
    if (this.getFirst() != null && strList.getFirst() != null && this.first.equals(strList.first)) {
      return this.getRest().containsAll(strList.getRest());
    }
    return false;
  }

  public StringList filterLargerThan(String str, StringList res) {
    for (int i = 0; i < this.size(); i++) {
      if (this.getFirst().length() > str.length()) {
        StringList temp = res;
        res.first = this.getFirst();
        res.rest = temp;
      }
    }
    return res;
  }


  /**
   * remove string element from the String Set
   *
   * @param str
   * @return the String list that remove the input String element
   */
  public StringList remove(String str) {
    for (int i = 0; i < this.size(); i++) {
      if (this.first.equals(str)) {
        this.first = this.getRest().first;
        this.rest = this.getRest().rest;
      }
    }
    return this;
  }

  public Boolean hasDuplicates() {
    for (int i = 0; i < this.size(); i++) {
      if (this.getFirst().equals(this.getRest().getFirst())) {
        return true;
      }
      this.first = this.getRest().getFirst();
      this.rest = this.getRest().getRest();
    }
    return (this.rest.hasDuplicates());
  }

  public StringList removeDuplicates(String str) {
    if (this.getFirst() != null) {
      this.rest = this.remove(this.getFirst());
      return this.getRest();
    } else {
      return this;
    }
  }
}

