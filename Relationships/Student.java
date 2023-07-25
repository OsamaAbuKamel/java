package Relationships;

import java.util.ArrayList;

public class Student implements Comparable<Student> {
    private int studentID;
    private int age;
    private Address address;
    private char gender;
    private Name name;
    private ArrayList<Course> courses;

    public Student() {
    }

    public Student(int studentID, int age, Address address, char gender, Name name) {
        this.studentID = studentID;
        this.age = age;
        this.address = address;
        this.gender = gender;
        this.name = name;
        courses = new ArrayList<>();
    }

    public int getStudentID() {
        return this.studentID;
    }

    public void setStudentID(int studentID) {
        if (isValidID(studentID)) {
            this.studentID = studentID;
        } else {
            System.out.println("THE STUDENT ID IS ERROR");
        }
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public char getGender() {
        return this.gender;
    }

    public void setGender(char gender) {
        gender = Character.toUpperCase(gender);
        if (gender == 'F' || gender == 'M') {
            this.gender = gender;
        } else {
            System.out.println("ERROR, ENTER M:MALE OR F:FEMALE ");
        }
    }

    public Name getName() {
        return this.name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public ArrayList<Course> getCourses() {
        return this.courses;
    }

    public void setCourses(ArrayList<Course> course) {
        this.courses = course;
    }

    public boolean addCourse(Course c) {
        if (!courses.contains(c)) {
            courses.add(c);
            return true;
        }
        return false;

    }

    public boolean removeCourse(Course c) {
        if (courses.contains(c)) {
            courses.remove(c);
            return true;
        }
        return false;
    }

    public boolean update(int i, Course c) {
        courses.set(i, c);
        return true;
    }

    public boolean search(Course c, String courseNo) {
        c.setCourseID(courseNo);
        if (courses.contains(c) && courseNo.equals(c.getCourseID())) {
            return true;
        } else {
            return false;
        }
    }

    public boolean search(String title) {
        // Course c = new Course();
        // if (courses.contains(c) && title.equals(c.getTitle())) {
        // return true;
        // } else {
        // return false;
        // }
        Course c = new Course();
        c.setTitle(title);
        for (Course course : courses) {
            if (course.getTitle().equals(c.getTitle())) {
                return true;
            }
        }
        return false;

    }

    public boolean isValidID(int studentID) {
        return String.valueOf(studentID).length() == 7;
    }

    // // print info for all method
    // public void printInfo() {
    // System.out.println("Student ID: " + getStudentID());
    // System.out.println("Student Age: " + getAge());
    // System.out.println("Student Gender: " + getGender());
    // System.out.println("Student Name: " + getName().toString());
    // System.out.println("Student Address: " + getAddress().toString());
    // System.out.println("Student Courses: " + getCourses().toString());
    // // print search method

    // }

    @Override
    public String toString() {
        return "{" +
                " studentID='" + getStudentID() + "'" +
                ", age='" + getAge() + "'" +
                ", address='" + getAddress() + "'" +
                ", gender='" + getGender() + "'" +
                ", name='" + getName() + "'" +
                ", courses='" + getCourses() + "'" +
                "}";
    }

    @Override
    public int compareTo(Student o) {
        if (this.getAge() > o.getAge()) {
            return 1;
        } else if (this.getAge() < o.getAge()) {
            return -1;
        } else
            return 0;
    }

}
