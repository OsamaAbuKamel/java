import java.util.ArrayList;

enum TitleCourse {
    OOP, ENGLISH, DIGITAL, DATASTRUCTURE, ALGORITHM, DATABASE, LINUX;
}

enum CourseNum {
    COMP2311, ENGS2202, ENCS2340, COMP242, comp336, COMP3330, COMP311;
}

public class Course implements Comparable<Course>, Cloneable {

    private TitleCourse courseTitle;
    private CourseNum courseNumber;
    private Name instructor;
    private int maxEnrollment;
    ArrayList<Student> studentList;
    ArrayList<Faculty> facultyList;

    public Course() {
        studentList = new ArrayList<>();
        facultyList = new ArrayList<>();
    }

    public Course(TitleCourse courseTitle, CourseNum courseNumber, Name instructor, int maxEnrollment) {
        this.courseTitle = courseTitle;
        this.courseNumber = courseNumber;
        this.instructor = instructor;
        this.maxEnrollment = maxEnrollment;
        studentList = new ArrayList<>();
        facultyList = new ArrayList<>();
    }

    public TitleCourse getCourseTitle() {
        return this.courseTitle;
    }

    public void setCourseTitle(TitleCourse courseTitle) {
        this.courseTitle = courseTitle;
    }

    public CourseNum getCourseNumber() {
        return this.courseNumber;
    }

    public void setCourseNumber(CourseNum courseNumber) {
        this.courseNumber = courseNumber;
    }

    public int getMaxEnrollment() {
        return maxEnrollment;
    }

    public void setMaxEnrollment(int maxEnrollment) {
        this.maxEnrollment = maxEnrollment;
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

    public void addStudent(Student student) {
        if (studentList.contains(student) == false)
            studentList.add(student);
        else
            throw new IllegalArgumentException("EXCEPTION IN ADD STUDENT");

    }

    public void removeStudent(String studentId) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getStudentID().equals(studentId)) {
                studentList.remove(i);
                return;
            }
        }
        throw new IllegalArgumentException("EXCEPTION IN REMOVE STUDENT");
    }

    public void updateStudent(int i, Student student) {
        if (!studentList.isEmpty()) {
            studentList.set(i, student);
        } else {
            throw new IndexOutOfBoundsException("EXCEPTION IN UPDATE STUDENT");
        }
    }

    public void searchStudent(String id) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getStudentID().equals(id)) {
                studentList.get(i).printInfo();
                return;
            }
        }
        throw new IllegalArgumentException("EXCEPTION IN SEARCH STUDENT,NOT FOUND");

    }

    public void addFaculty(Faculty faculty) {
        if (facultyList.contains(faculty) == false)
            facultyList.add(faculty);
        else
            throw new IllegalArgumentException("EXCEPTION IN ADD FACULTY");
    }

    public void removeFaculty(FacultyName faculty) {
        for (int i = 0; i < facultyList.size(); i++) {
            if (facultyList.get(i).getName().equals(faculty)) {
                facultyList.remove(i);
                return;
            }
        }
        throw new IllegalArgumentException("EXCEPTION IN REMOVE FACULTY");

    }

    public void updateFaculty(int i, Faculty faculty) {
        if (i >= 0 && !facultyList.isEmpty()) {
            facultyList.set(i, faculty);
        } else {
            throw new IndexOutOfBoundsException("EXCEPTION IN UPDATE FACULTY");
        }
    }

    public void searchForFaculty(String facultyName) {
        for (Faculty faculty : facultyList) {
            if (faculty.getName().name().equalsIgnoreCase(facultyName)) {
                faculty.printInfo();
                return;
            }
        }
        throw new IllegalArgumentException("Faculty not found.");

    }

    public void printInfo() {
        System.out.print("COURSE TITLE: " + getCourseTitle());
        System.out.print(", COURSE NUMBER: " + getCourseNumber());
        System.out.print(", INSTRUCTOR: " + getInstructor());
        System.out.print(", MAX ENROLLMENT: " + getMaxEnrollment());
        if (!studentList.isEmpty()) {
            System.out.print(", STUDENT: [");
            for (int i = 0; i < studentList.size(); i++) {
                if (i > 0) {
                    System.out.println(",");
                }
                System.out.print(studentList.get(i).getStudentID());
            }
            System.out.print(" ]");
        }
        if (!facultyList.isEmpty()) {
            System.out.print(", FACULTY: [");
            for (int i = 0; i < facultyList.size(); i++) {
                if (i > 0) {
                    System.out.println(",");
                }
                System.out.print(facultyList.get(i).getName() + "");
            }
            System.out.print("]");
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Course)
            return courseNumber == ((Course) obj).courseNumber;
        return false;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

    @Override
    public int compareTo(Course o) {
        if (getMaxEnrollment() > o.getMaxEnrollment()) {
            return 1;
        } else if (getMaxEnrollment() < o.getMaxEnrollment()) {
            return -1;
        } else
            return 0;
    }
}
