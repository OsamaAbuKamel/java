package Lab2;
import Relationships.Name;

public abstract class Person {
    private int age;
    private Name name;

    public Person() {
        super();
    }

    public Person(int age, Name name) {
        super();
        this.age = age;
        this.name = name;
        // System.out.println("hello from Person cons 2");

    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name=name;
    }
    public abstract void printInfo() ;

}