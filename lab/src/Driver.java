import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Driver {
    static Scanner scanner = new Scanner(System.in);
    static Course course = new Course();
    static Student student = new Student();
    static Faculty faculty = new Faculty();
    static CourseNum courseNum;
    static TitleCourse courseTitle;
    static FacultyName facultyName;

    public static void main(String[] args) {
        System.out.println("Faculty Name: ");
        for (int i = 0; i < 4; i++) {
            System.out.print(" " + FacultyName.values()[i]);
        }
        System.out.println("\nCourse Number: ");
        for (int i = 0; i < 7; i++) {
            System.out.print(" " + CourseNum.values()[i]);
        }
        System.out.println("\nCourse Title: ");
        for (int i = 0; i < 7; i++) {
            System.out.print(" " + TitleCourse.values()[i]);
        }
        System.out.println("\n---------------------------------------");
        while (true) {
            choice();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            switch (choice) {
                case 1:
                    addStudentInCourse();
                    break;
                case 2:
                    addFacultyInCourse();
                    break;
                case 3:
                    addCourseInFacultyAndStudent();
                    break;
                case 4:
                    System.out.println("Enter student ID to remove:");
                    String removeStudentID = scanner.nextLine();
                    // Remove a student from the course
                    course.removeStudent(removeStudentID);
                    break;
                case 5:
                    System.out.println("Enter faculty name to remove:");
                    String removeFacultyName = scanner.nextLine();
                    facultyName = FacultyName.valueOf(removeFacultyName);
                    // Remove a faculty from the course
                    course.removeFaculty(facultyName);
                    break;
                case 6:
                    System.out.println("Enter course title to remove:");
                    String removeCourseTitle = scanner.nextLine();
                    courseTitle = TitleCourse.valueOf(removeCourseTitle);
                    // Remove a course from the faculty and student
                    faculty.removeCourse(courseTitle);
                    student.removeCourse(courseTitle);
                    break;
                case 7:
                    System.out.println("Enter student ID to search:");
                    String searchStudentID = scanner.nextLine();
                    // Search for a student
                    course.searchStudent(searchStudentID);
                    break;
                case 8:
                    System.out.println("Enter faculty name to search:");
                    String searchFacultyName = scanner.nextLine();
                    // Search for a faculty
                    course.searchForFaculty(searchFacultyName);
                    break;
                case 9:
                    System.out.println("Enter course title to search:");
                    String searchCourseTitle = scanner.nextLine();
                    // Search for a course
                    student.search(searchCourseTitle);
                    break;
                case 10:
                    course.printInfo();
                    break;
                case 11:
                    student.printInfo();
                    break;
                case 12:
                    faculty.printInfo();
                    break;
                case 13:
                    // Reading student and faculty from file
                    System.out.println("Enter the file path:");
                    String filePath = scanner.nextLine();
                    try {
                        readFileTxt(filePath);
                    } catch (FileNotFoundException e) {
                        System.out.println("File not found.");
                    }
                    break;
                case 14:
                    updateStudentInCourse();
                    break;
                case 0:
                    // Exiting the program
                    System.out.println("Exiting program...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void choice() {
        System.out.println("\nSelect an option:");
        System.out.println("1. Add Student In Course");
        System.out.println("2. Add Faculty In Course");
        System.out.println("3. Add Course In Faculty and Student");
        System.out.println("4. Remove Student");
        System.out.println("5. Remove Faculty");
        System.out.println("6. Remove Course");
        System.out.println("7. Search Student");
        System.out.println("8. Search Faculty");
        System.out.println("9. Search Course");
        System.out.println("10. print info for Course");
        System.out.println("11. print info for Student");
        System.out.println("12. print info for Faculty");
        System.out.println("13. Read Student and Faculty from File");
        System.out.println("14.update course");
        System.out.println("0. Exit");

    }

    public static void updateStudentInCourse() {
        System.out.println("Enter student details:");
        System.out.println("Student ID:");
        student.setStudentID(scanner.nextLine());
        System.out.println("Age:");
        student.setAge(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Gender:");
        student.setGender(scanner.nextLine().charAt(0));
        System.out.println("Name:");
        student.setName(new Name(scanner.nextLine()));
        System.out.println("Enter index ");
        course.updateStudent(scanner.nextInt(), student);
    }

    public static void addStudentInCourse() {
        System.out.println("Enter student details:");
        System.out.println("Student ID:");
        student.setStudentID(scanner.nextLine());
        System.out.println("Age:");
        student.setAge(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Gender:");
        student.setGender(scanner.nextLine().charAt(0));
        System.out.println("Name:");
        student.setName(new Name(scanner.nextLine()));
        course.addStudent(student);
    }

    public static void addFacultyInCourse() {
        System.out.println("Enter faculty details:");
        System.out.println("Name:");
        String name = scanner.nextLine();
        facultyName = FacultyName.valueOf(name);
        System.out.println("Years of Experience:");
        faculty.setYearsOfExperience(scanner.nextInt());
        scanner.nextLine();
        faculty.setName(facultyName);
        course.addFaculty(faculty);
    }

    public static void addCourseInFacultyAndStudent() {
        System.out.println("Enter course details:");
        System.out.println("Course Title:");
        String courseTitleS = scanner.nextLine();
        courseTitle = TitleCourse.valueOf(courseTitleS);
        System.out.println("Course Number:");
        String courseNumber = scanner.nextLine();
        courseNum = CourseNum.valueOf(courseNumber);
        System.out.println("Instructor Name:");
        course.setInstructor(new Name(scanner.nextLine()));
        System.out.println("Max Enrollment:");
        course.setMaxEnrollment(scanner.nextInt());
        scanner.nextLine();
        course.setCourseTitle(courseTitle);
        course.setCourseNumber(courseNum);
        faculty.addCourse(course);
        student.addCourse(course);
    }

    public static void readFileTxt(String fileName) throws FileNotFoundException {
        Integer i, m = 0;
        Character g;
        Integer maxE = 0;
        try (Scanner input = new Scanner(new File(fileName))) {
            while (input.hasNext()) {
                String studentId = input.next();
                String age = input.next();
                i = Integer.parseInt(age);
                String line = input.next();
                String[] data = line.split("@");
                int streetAddress = Integer.parseInt(data[0]);
                String city = data[1];
                String state = data[2];
                Address d = new Address(streetAddress, city, state);
                String gender = input.next();
                g = gender.charAt(0);
                String name = input.next();
                String part[] = name.split("@");
                String first = part[0];
                String middle = part[1];
                String last = part[2];
                Name n = new Name(first, middle, last);
                // FacultyName name, int yearsOfExperience
                input.nextLine();
                String facultyN = input.next();
                FacultyName facultyName = FacultyName.valueOf(facultyN);
                String yearsOfExperience = input.next();
                m = Integer.parseInt(yearsOfExperience);
                faculty = new Faculty(facultyName, m);
                student = new Student(studentId, i, d, g, n);

                input.nextLine();
                String courseT = input.next();
                courseT = courseT.toUpperCase();
                TitleCourse titleCourse = TitleCourse.valueOf(courseT);
                String courseN = input.next();
                courseN = courseN.toUpperCase();
                CourseNum courseNum = CourseNum.valueOf(courseN);
                String name1 = input.next();
                String part2[] = name1.split("@");
                String first2 = part2[0];
                String middle2 = part2[1];
                String last2 = part2[2];
                Name n2 = new Name(first2, middle2, last2);
                String maxEnrool = input.next();
                maxE = maxE.parseInt(maxEnrool);
                course = new Course(titleCourse, courseNum, n2, maxE);
                student.addCourse(course);
                course.addStudent(student);
                course.addFaculty(faculty);
                course.printInfo();
            }
        }
    }
}
