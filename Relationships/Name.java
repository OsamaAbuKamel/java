package Relationships;

public class Name {
    private String firstName;
    private String lastName;

    public Name() {
    }

    public Name(String firstName, String lastName) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName.length() > 1 && firstName.length() < 13) {
            firstName = firstName.toLowerCase();
            this.firstName = firstName;
        } else {
            System.out.println("THE FIRST NAME IS LONGER THAN THE ALLOWED LIMIT");
        }
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        if (lastName.length() > 1 && lastName.length() < 13) {
            lastName = lastName.toLowerCase();
            this.lastName = lastName;
        } else {
            System.out.println("THE LAST NAME IS LONGER THAN THE ALLOWED LIMIT");
        }
    }

    @Override
    public String toString() {
        return "{" +
                " firstName='" + getFirstName() + "'" +
                ", lastName='" + getLastName() + "'" +
                "}";
    }

}
