

package classjump;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
  private String name;
  private String email;
  private String password;
  private List<Course> courses;
    public Teacher(String name, String email, String password) {
    this.name = name;
    this.email = email;
    this.password = password;
    this.courses = new ArrayList<>();
  }

    public String getName() {
        return name;
    }
      public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
      public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
    public void addcourse(Course course){
        courses.add(course);
    }
    public void deletcourse(String courseName){
        courses.removeIf(course -> course.getName().equals(courseName));
    }

}

