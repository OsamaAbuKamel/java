
public abstract class Person {
    private int age;
    private Name name;
    private Address address;
    private char gender;

    public Person() {
        super();
    }

    public Person(int age, Name name, Address address, char gender) {
        this.age = age;
        this.name = name;
        this.address = address;
        this.gender = gender;
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

    public abstract void printInfo();
}