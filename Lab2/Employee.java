package Lab2;

import java.util.Objects;
import Relationships.Name;

public class Employee extends Person {
    private double salary;

    public Employee() {

    }

    public Employee(Name name, int age, double salary) {
        super(age, name);
        this.salary = salary;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void printInfo() {
        System.out.println("Employee information");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Employee)
            return this.getAge() == ((Employee) obj).getAge();
        return false;
    }
}
