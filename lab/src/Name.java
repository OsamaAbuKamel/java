public class Name {
    private String firstName;
    private String middleName;
    private String lastName;

    public Name() {
    }

    public Name(String firstName) {
        this.firstName = firstName;
    }

    public Name(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return " " + getFirstName() +
                ", " + getMiddleName() +
                ", " + getLastName();
    }

}
