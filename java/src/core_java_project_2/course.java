package core_java_project_2;

import java.io.Serializable;


public class course implements Serializable {

    private static final long serialVersionUID = 1L;

    private int courseId;
    private String courseName;

    public course(int courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return courseId + " - " + courseName;
    }
}