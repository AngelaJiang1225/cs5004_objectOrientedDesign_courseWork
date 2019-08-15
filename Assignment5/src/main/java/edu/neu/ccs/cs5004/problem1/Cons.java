package edu.neu.ccs.cs5004.problem1;

/**
 * Represent the priority queue that is not empty.
 */
public class Cons implements PriorityQueue {
  private Element first;
  private PriorityQueue rest;

  /**
   * Creat queue with details.
   *
   * @param first the first element in the queue
   * @param rest  the rest of the queue
   */
  public Cons(Element first, PriorityQueue rest) {
    this.first = first;
    this.rest = rest;
  }

  /**
   * Get the first element.
   *
   * @return the first element
   */
  public Element getFirst() {
    return first;
  }

  /**
   * Get the rest of the queue.
   *
   * @return the rest of the queue.
   */
  public PriorityQueue getRest() {
    return rest;
  }

  @Override
  public Cons add(Integer priority, String value) {
    if (this.getRest() == null) {
      if (this.getFirst().getPriority() < priority) {
        return new Cons(new Element(priority, value), this);
      } else {
        return new Cons(this.getFirst(), new Cons(new Element(priority, value), new Empty()));
      }
    } else if (this.getFirst().getPriority() < priority) {
      return new Cons(new Element(priority, value), this);

    } else {
      return new Cons(this.getFirst(), this.getRest().add(priority, value));
    }
  }

  @Override
  public PriorityQueue pop() {
    //if(this.getFirst() == null) throw new InvalidPopPeekEmptyException("You can not pop!");
    if (this.getRest() == null) {
      return new Empty();
    } else {
      return new Cons(((Cons) this.getRest()).getFirst(), ((Cons) this.getRest()).getRest());
    }
  }

  @Override
  public String peek() {
    return this.getFirst().getValue();
  }

  @Override
  public Boolean isEmpty() {
    return false;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || this.getClass() != obj.getClass()) {
      return false;
    }
    Cons cons = (Cons) obj;
    if (this.getFirst() != null ? !this.getFirst().equals(cons.getFirst())
        : cons.getFirst() != null) {
      return false;
    }
    return this.getRest() != null ? this.getRest().equals(cons.getRest())
        : cons.getRest() == null;
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
    str.append("Cons{");
    Cons temp = this;
    while (!temp.getRest().isEmpty()) {
      str.append("(").append(temp.getFirst().getPriority()).append(", ")
          .append(temp.getFirst().getValue()).append(")").append(", ");
      temp = (Cons) temp.getRest();
    }
    str.append("(" + temp.getFirst().getPriority() + ", " + temp.getFirst().getValue() + ")" + "}");
    return str.toString();
  }
}

