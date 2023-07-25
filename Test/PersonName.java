package Test;

// Enum definition
public enum PersonName {
    JOHN("John"),
    MARY("Mary"),
    MARK("Mark");

    private final String name;

    PersonName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Abstract Person class
abstract class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void displayDetails();

    public void prayForPerson() {
        System.out.println("Praying for " + name);
    }
}

// Student class extending Person
class Student extends Person {
    private int studentId;

    public Student(String name, int studentId) {
        super(name);
        this.studentId = studentId;
    }

    @Override
    public void displayDetails() {
        System.out.println("Name: " + getName());
        System.out.println("Student ID: " + studentId);
        prayForPerson();
    }
}

// Main class to test the code
 class Main {
    public static void main(String[] args) {
        PersonName personName = PersonName.JOHN;
        String name = personName.getName();
        int studentId = 12345;

        Student student = new Student(name, studentId);
        student.displayDetails();
    }
}
