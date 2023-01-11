package AccioJob.Spring_Mock_Test;

public class Course {
    private String courseName;
    private int numberOfSemesters;

    public Course() {
    }

    public Course(String courseName, int numberOfSemesters) {
        this.courseName = courseName;
        this.numberOfSemesters = numberOfSemesters;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getNumberOfSemesters() {
        return numberOfSemesters;
    }

    public void setNumberOfSemesters(int numberOfSemesters) {
        this.numberOfSemesters = numberOfSemesters;
    }
}
