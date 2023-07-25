package Lab2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import Relationships.Name;

public class Driver {
    public static void main(String[] args) {
        // Driver driver = new Driver();
        // Person student = new Student();
        // Person employee = new Employee();
        // driver.print(employee);
        // driver.print(student);

        // Person[] persons = new Person [5];
        // persons[0] = new Employee();
        // persons[1] = new Student();

        // ArrayList<Person> list = new ArrayList<>();
        // list.add(employee);
        Name name = new Name("osama", "kamel");
        Student student2 = new Student(40, name, 20);
        Student student3 = new Student(90, name, 25);
        Student student4 = new Student(90, name, 17);
        //! Sort by ArrayList
        ArrayList<Student> list = new ArrayList<>();
        list.add(student2);
        list.add(student3);
        list.add(student4);
        // Sort the ArrayList by age using the compareTo method
        Collections.sort(list);
        // Print the sorted ArrayList
        for (Student student : list) {
            System.out.println(student);
        }
        System.out.println("------------------------");
        //? Sort by Array
        Student [] students = new Student[3];
        students[0] = student2;
        students[1] = student3;
        students[2] = student4;
        Arrays.sort(students);
        for (Student student : students) {
            System.out.print(student+" ");
            System.out.println();
            
        }

    }
}
    // public  void print(Person p){
    //     p.printInfo();

    // }
    

