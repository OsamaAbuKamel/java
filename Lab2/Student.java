package Lab2;

import Relationships.Address;
import Relationships.Course;
import Relationships.Name;
import java.util.ArrayList;

public class Student extends Person implements Comparable<Student> {
    Name nameStudent;
    private double avg;
    Address a;
    ArrayList<Course> arrayList;

    public Student() {
        // this(0.0, name, 0);
        System.out.println("hello from Student cons 1");
    }

    public Student(double avg, Name name, int age) {
        super(age, name);
        this.avg = avg;
        // System.out.println("hello from Student cons 2");
    }

    public double getAvg() {
        return this.avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    @Override
    public void printInfo() {
        System.out.println("Student information");
    }
    // toString

    @Override
    public String toString() {
        return "{" +
                " nameStudent='" + getName() + "'" +
                ", avg='" + getAvg() + "'" +
                ", a='" + getAge() + "'" + "'" +
                "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student)
            return this.getAge() == ((Student) obj).getAge();
        return false;
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
