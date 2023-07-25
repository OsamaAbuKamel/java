
import java.util.ArrayList;

public class Student extends Person implements Comparable<Student>, Cloneable {
    private String studentID;
    private ArrayList<Course> courseList;

    public Student() {
        courseList = new ArrayList<>();
    }

    public Student(String studentID, int age, Address address, char gender, Name name) {
        super(age, name, address, gender);
        this.setStudentID(studentID);
        this.setGender(gender);
        courseList = new ArrayList<>();
    }

    public String getStudentID() {
        return this.studentID;
    }

    public void setStudentID(String studentID) {
        if (isValidID(studentID)) {
            this.studentID = studentID;
        } else {
            System.out.println("THE STUDENT ID IS ERROR");
        }
    }

    public ArrayList<Course> getCourseList() {
        return this.courseList;
    }

    public void setCourseList(ArrayList<Course> course) {
        this.courseList = course;
    }

    public void addCourse(Course c) {
        if (!courseList.contains(c))
            courseList.add(c);
    }

    public void removeCourse(TitleCourse c) {
        for (int i = 0; i < courseList.size(); i++) {
            if (courseList.get(i).getCourseTitle().equals(c)) {
                courseList.remove(i);
            } else
                throw new IllegalArgumentException("REMOVE COURSE: Course not found");
        }

    }

    public void updateCourse(int i, Course c) {
        if (i >= 0 && !courseList.isEmpty()) {
            courseList.set(i, c);
        } else {
            throw new IndexOutOfBoundsException("EXCEPTION IN UPDATE STUDENT");
        }
    }

    public void search(String courseTitle) {
        for (Course course : courseList) {
            if (course.getCourseTitle().name().equalsIgnoreCase(courseTitle)) {
                course.printInfo();
                return;
            }
        }
        throw new IllegalArgumentException("COURSE NOT FOUND.");

    }

    private boolean isValidID(String studentID) {
        return String.valueOf(studentID).length() == 7;
    }

    @Override
    public void printInfo() {
        System.out.print("STUDENT ID: " + getStudentID());
        System.out.print(", AGE: " + getAge());
        System.out.print(", ADDRESS: " + getAddress());
        System.out.print(", NAME: " + getName());
        System.out.print(", GENDER: " + getGender());
        if (!courseList.isEmpty()) {
            System.out.println(", COURSE: [");
            for (int i = 0; i < courseList.size(); i++) {
                if (i > 0) {
                    System.out.print(" ,");
                }
                System.out.print(
                        "COURSE TITLE: " + courseList.get(i).getCourseTitle() + ", COURSE NUMBER: "
                                + courseList.get(i).getCourseNumber());
            }
            System.out.println("]");
        } else
            System.out.println(", COURSE IS EMPTY");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            return this.getStudentID().equals(((Student) obj).getStudentID());
        } else {
            return false;
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
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
