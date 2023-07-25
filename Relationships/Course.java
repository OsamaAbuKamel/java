package Relationships;

import java.util.ArrayList;

public class Course {
    private String title;
    private String courseID;
    private Name instructor;
    private ArrayList<Student> studentList;
    private ArrayList<Faculty> facultyList;

    public Course() {
    }

    public Course(String title, String courseID, Name instructor) {
        this.title = title;
        this.courseID = courseID;
        this.instructor = instructor;
        studentList = new ArrayList<>();
        facultyList = new ArrayList<>();

    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCourseID() {
        return this.courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public Name getInstructor() {
        return this.instructor;
    }

    public void setInstructor(Name instructor) {
        this.instructor = instructor;
    }

    public ArrayList<Student> getStudentList() {
        return this.studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    public ArrayList<Faculty> getFacultyList() {
        return this.facultyList;
    }

    public void setFacultyList(ArrayList<Faculty> facultyList) {
        this.facultyList = facultyList;
    }

    public boolean addStudent(Student c) {
        if (!studentList.contains(c)) {
            studentList.add(c);
            return true;
        }
        return false;
    }

    public boolean removeStudent(Student c) {
        if (studentList.contains(c)) {
            return studentList.remove(c);
        }
        return false;
    }

    public boolean updateStudent(Student c, int i) {
        if (studentList.contains(c)) {
            studentList.add(i, c);
            return true;
        }
        return false;
    }

    public boolean searchStudent(Student c, int age) {
        if (studentList.contains(c) && age == c.getAge()) {
            return true;
        }
        return false;
    }

    public boolean searchStudent(Student c, Name name) {
        if (studentList.contains(c) && name == c.getName()) {
            return true;
        }
        return false;
    }

    public boolean addFaculty(Faculty c) {
        if (facultyList.contains(c))
            return true;
        return false;
    }

    public boolean removeFaculty(Faculty c) {
        if (facultyList.contains(c))
            return true;
        return false;
    }

    public boolean updateFaculty(Faculty c, int i) {
        if (studentList.contains(c)) {
            facultyList.add(i, c);
            return true;
        }
        return false;
    }

    public boolean searchFaculty(Faculty f, int yearsOfExperience) {
        if (studentList.contains(f) && yearsOfExperience == f.getYearsOfExperience()) {
            return true;
        }
        return false;
    }

    public boolean searchFaculty(Faculty f, String name) {
        if (studentList.contains(f) && name == f.getName()) {
            return true;
        }
        return false;
    }
    //print info all methods

    // public void printInfo() {
    //     System.out.println("Title: " + getTitle());
    //     System.out.println("CourseID: " + getCourseID());
    //     System.out.println("Instructor: " + getInstructor());
    //     System.out.println("Student List: " + getStudentList());
    //     System.out.println("Faculty List: " + getFacultyList());
    // }



    @Override
    public String toString() {
        return "{" +
                " title='" + getTitle() + "'" +
                ", courseID='" + getCourseID() + "'" +
                ", instructor='" + getInstructor() + "'" +
                ", studentList='" + getStudentList() + "'" +
                ", facultyList='" + getFacultyList() + "'" +
                "}";
    }

}
