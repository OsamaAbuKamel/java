package activity3lab2;

public abstract class Student {
    private int id;
    private String name;
    private String school;
    private char gender;

    public Student() {
    }

    public Student(int id, String name, String school, char gender) {
        this.id = id;
        this.name = name;
        this.school = school;
        this.gender = gender;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool() {
        return this.school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public char getGender() {
        return this.gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", school='" + getSchool() + "'" +
            ", gender='" + getGender() + "'" +
            "}";
    } 
}
