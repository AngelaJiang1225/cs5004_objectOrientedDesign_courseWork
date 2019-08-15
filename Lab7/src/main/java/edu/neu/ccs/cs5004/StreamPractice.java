package edu.neu.ccs.cs5004;

import java.util.LinkedList;
import java.util.List;

public class StreamPractice {

  public static void main(String[] args) {
    List<Integer> grade1 = new LinkedList<Integer>(){{
      add(60);
      add(70);
      add(80);
    }};
    List<Integer> grade2 = new LinkedList<Integer>(){{
      add(70);
      add(80);
      add(95);
    }};
    List<Integer> grade3 = new LinkedList<Integer>(){{
      add(75);
      add(85);
      add(95);
    }};
    Student stu1 = new Student("a", "007", grade1);
    Student stu2 = new Student("b", "008", grade2);
    Student stu3 = new Student("c", "009", grade3);
    CourseList n1 = new CourseList();
    n1.addCourseList(stu1);
    n1.addCourseList(stu2);
    n1.addCourseList(stu3);
    n1.getMax();
  }

}
