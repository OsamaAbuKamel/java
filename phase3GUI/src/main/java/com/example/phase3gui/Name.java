package com.example.phase3gui;

public class Name {
    private String firstName;
    private String middleName;
    private String lastName;

    public Name() {
    }

    // constructor using a one string
    public Name(String name) {
        // split the name into words
        String[] names = name.split(" ");
        if (names.length == 1) {
            this.firstName = names[0];
        } else if (names.length == 2) {
            this.firstName = names[0];
            this.lastName = names[1];
        } else if (names.length == 3) {
            this.firstName = names[0];
            this.middleName = names[1];
            this.lastName = names[2];
        }
    }

    /**
     * Constructor for objects of class Name
     */
    public Name(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // setters and getters
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
        if (middleName == null && lastName == null) {
            return firstName;
        } else if (middleName == null && lastName != null) {
            return firstName + " " + lastName;
        } else if (middleName != null && lastName == null) {
            return firstName + " " + middleName;
        } else {
            return firstName + " " + middleName + " " + lastName;
        }
    }
}
