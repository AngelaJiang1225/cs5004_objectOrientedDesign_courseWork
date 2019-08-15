package edu.neu.ccs.cs5004;
    import java.util.*;

public class CourseList {
  private List<Student> courseList;

  public CourseList() {
    courseList = new LinkedList<>();
  }

  public List<Student> getCourseList() {
    return courseList;
  }
  public void addCourseList(Student student){
    this.courseList.add(student);
  }
  public void getMax() {
    //Optional<Student> optionalStudent =
     int maxGrade = courseList.stream().reduce(
        (student1, student2)->student1.getGrades().stream().mapToInt(v->v).max().getAsInt() >
        student2.getGrades().stream().mapToInt(v->v).max().getAsInt()?
            student1: student2).get().getGrades().stream().mapToInt(g->g).max().getAsInt();
         //Integer maxGrade = optionalStudent.
    //optionalStudent.ifPresent(System.out::println);
    Optional<Student> optionalStudent =
    courseList.stream().reduce(
        (student1, student2)->student1.getGrades().stream().mapToInt(v->v).max().getAsInt() >
            student2.getGrades().stream().mapToInt(v->v).max().getAsInt()?
            student1: student2);
    System.out.println("The max grade is: "+ maxGrade);
    optionalStudent.ifPresent(System.out::println);
    //s1.getGrades().stream().mapToInt(g -> g).sum();
  }

}
