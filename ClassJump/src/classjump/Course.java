
package classjump;

import java.util.ArrayList;
import java.util.List;


public class Course {
  private String name;
  private String description;
  private List<Lecture> lectures;
  private List<Sheet> sheets;

  public Course(String name, String description) {
    this.name = name;
    this.description = description;
    this.lectures = new ArrayList<>();
    this.sheets = new ArrayList<>();
  }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Lecture> getLectures() {
        return lectures;
    }

    public void setLectures(List<Lecture> lectures) {
        this.lectures = lectures;
    }

    public List<Sheet> getSheets() {
        return sheets;
    }

    public void setSheets(List<Sheet> sheets) {
        this.sheets = sheets;
    }
      public void addLecture(Lecture lecture) {
    lectures.add(lecture);
  }

  public void deleteLecture(String lectureName) {
    lectures.removeIf(lecture -> lecture.getName().equals(lectureName));
  }

  public void addSheet(Sheet sheet) {
    sheets.add(sheet);
  }

  public void deleteSheet(String sheetName) {
    sheets.removeIf(sheet -> sheet.getFilename().equals(sheetName));

  }
}
