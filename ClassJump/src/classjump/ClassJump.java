

package classjump;

import java.util.ArrayList;
import java.util.List;


public class ClassJump {
    
 private List<Teacher> teachers;

  public ClassJump() {
    this.teachers = new ArrayList<>();
  }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }
    
}
