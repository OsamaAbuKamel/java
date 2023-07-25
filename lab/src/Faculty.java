
import java.util.ArrayList;

enum FacultyName {
    SCIENCE, TECHNOLOGY, ENGINEERING, BUSINESS;
}

public class Faculty implements Comparable<Faculty>, Cloneable {
    private FacultyName name;
    private int yearsOfExperience;
    private ArrayList<Course> courseList;

    public Faculty() {
        this.courseList = new ArrayList<Course>();

    }

    public Faculty(FacultyName name, int yearsOfExperience) {
        this.name = name;
        this.yearsOfExperience = yearsOfExperience;
        this.courseList = new ArrayList<Course>();
    }

    public FacultyName getName() {
        return name;
    }

    public void setName(FacultyName name) {
        this.name = name;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public ArrayList<Course> getCourses() {
        return courseList;
    }

    public void addCourse(Course course) {
        if (courseList.contains(course) == false) {
            courseList.add(course);
        } else
            throw new NullPointerException("ADD COURSE: Course already exists");
    }

    public void removeCourse(TitleCourse course) {
        for (int i = 0; i < courseList.size(); i++) {
            if (courseList.get(i).getCourseTitle().equals(course)) {
                courseList.remove(i);
            } else
                throw new IllegalArgumentException("REMOVE COURSE: Course not found");
        }
    }

    public void update(int i, Course c) {
        if (i >= 0 && !courseList.isEmpty()) {
            courseList.set(i, c);
        } else {
            throw new IndexOutOfBoundsException("EXCEPTION IN UPDATE STUDENT");
        }
    }

    public void search(String courseNo) {
        for (Course course : courseList) {
            if (course.getCourseNumber().name().equals(courseNo)) {
                course.printInfo();
                return;
            }
        }
        throw new IllegalArgumentException("COURSE NOT FOUND.");
    }

    public void printInfo() {
        System.out.print("FACULTY NAME: " + getName());
        System.out.print(", YEARS OF EXPERIENCE: " + getYearsOfExperience());
        if (!courseList.isEmpty()) {
            System.out.print(", Courses: [");
            for (int i = 0; i < courseList.size(); i++) {
                if (i > 0) {
                    System.out.print(", ");
                }
                System.out.print(
                        "COURSE TITLE: " + courseList.get(i).getCourseTitle() + ", COURSE NUMBER: "
                                + courseList.get(i).getCourseNumber());
            }
            System.out.print("]");
        } else
            System.out.print(" COURSES: IS EMPTY");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Faculty) {
            Faculty f = (Faculty) obj;
            return f.getName().equals(this.getName());
        }
        return false;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

    @Override
    public int compareTo(Faculty o) {
        if (getYearsOfExperience() > o.getYearsOfExperience()) {
            return 1;
        }
        if (getYearsOfExperience() < o.getYearsOfExperience()) {
            return -1;
        }
        return 0;
    }

}
