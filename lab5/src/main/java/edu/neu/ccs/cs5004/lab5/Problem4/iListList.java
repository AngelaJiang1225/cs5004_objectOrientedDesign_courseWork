package edu.neu.ccs.cs5004.lab5.Problem4;

public interface iListList {
  Integer size(); //the	number	of	list	of	integers

  Integer length(); // the	number	of	total	integers	inside	this	list

  Integer sum(); //  returns	the	sum	of	all	integers	inside	this	list

  Boolean isEmpty();

  void add(List list);

  void removeInteger(Integer ele);
}

