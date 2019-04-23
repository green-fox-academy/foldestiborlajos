import java.util.ArrayList;
import java.util.List;

public class Cohort {
  protected String name;
  List<Student> students;
  List<Mentor> mentors;

  public Cohort (String name){
    this.name = name;
    this.students = new ArrayList<>();
    this.mentors = new ArrayList<>();
  }

  public void addStudent(Student student){
    students.add(student);
  }

  public void addMentor (Mentor mentor) {
    mentors.add(mentor);
  }

  public void info() {
    System.out.println( "The " + getName() + " cohort has " + students.size() + " stundets and " +
            mentors.size() + " mentors");
  }

  public List<Mentor> getMentors() {
    return mentors;
  }

  public void setMentors(List<Mentor> mentors) {
    this.mentors = mentors;
  }

  public List<Student> getStudents() {
    return students;
  }

  public void setStudents(List<Student> students) {
    this.students = students;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
