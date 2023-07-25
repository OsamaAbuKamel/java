package Relationships;

import java.util.ArrayList;

public class Faculty {
    private String name;
    private String department;
    private int yearsOfExperience;
    private ArrayList<Course> courseList;

    public Faculty(String name, String department, int yearsOfExperience) {
        this.name = name;
        this.department = department;
        this.yearsOfExperience = yearsOfExperience;
        this.courseList = new ArrayList<Course>();
    }

    // Getters and setters for the data fields
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

       // Get the ArrayList of courses
       public ArrayList<Course> getCourses() {
        return courseList;
    }

    // Add and remove courses from the ArrayList
    public boolean addCourse(Course course) {
        if (!courseList.contains(course)) {
            courseList.add(course);
            return true;
        }
        return false;
    }

    public boolean removeCourse(Course course) {
        if (courseList.contains(course)) {
            courseList.remove(course);
            return true;
        }
        return false;
    }
    public boolean update(int i, Course c) {
        courseList.add(i, c);
        return true;
    }

    public boolean search(Course c, String courseNo) {
        if (courseList.contains(c) && courseNo.equals(c.getCourseID())) {
            return true;
        } else {
            return false;
        }
    }

    public boolean search(String title) {
        Course c = new Course();
        c.setTitle(title);
        for (Course course : courseList) {
            if (course.getTitle().equals(c.getTitle())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "{" +
                " name='" + getName() + "'" +
                ", department='" + getDepartment() + "'" +
                ", yearsOfExperience='" + getYearsOfExperience() + "'" +
                ", courses='" + getCourses() + "'" +
                "}";
    }

}
