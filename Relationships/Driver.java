package Relationships;

import java.util.ArrayList;

public class Driver {
        public static void main(String[] args) {
                Address address = new Address(07, "bethlehem", "west bank");
                Name name = new Name("osama", "kamel");
                Faculty faculty = new Faculty("IT", "IT", 4);
                Course course = new Course("oop", "comp231", name);
                Course course1 = new Course("digital", "ENC323", name);
                Course course2 = new Course("stat", "stat231", name);
                Student student = new Student(12, 20, address, 'o', name);
                // course.addStudent(student);
                // course.addFaculty(faculty);
                // student.addCourse(course);
                // student.printInfo();
                // System.out.println("-------------------------------");
                // System.out.println(student.search(course, "comp231"));
                // System.out.println(student.search("oop"));
                if (course.addStudent(student)) {
                        System.out.println(student.toString() + " was added to the list!");
                } else {
                        System.out.println(" is already in the list.");
                }
                // if (course.addStudent(student)) {
                //         System.out.println(student.toString() + " was added to the list!");
                // } else {
                //         System.out.println(" is already in the list.");
                // }


                // if (student.addCourse(course)) {
                //         System.out.println(course.toString() + " was added to the list!");
                // } else {
                //         System.out.println(course.toString() + " is already in the list.");
                // }

                // System.out.println("-------------------------------");
                // System.out.println("UPDATE : " + student.update(0, course1));
                // student.printInfo();
                // System.out.println("-------------------------------");
                // student.removeCourse(course);
                // student.printInfo();

        }
}
