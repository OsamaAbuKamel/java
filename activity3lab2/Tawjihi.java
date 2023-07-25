package activity3lab2;

import java.util.ArrayList;

enum Names {
    ARABIC, ENGLISH, PHYSICS, MATH, BIOLOGY, CHEMISTRY, RELIGIOUSEDUCATION, TECHNOLGY, HISTORY, GEOGRAPHY,
    SCIENTIFICCULTUREHY;
}

public abstract class Tawjihi extends Student {
    final static String NAMEEE="newm";
    private int seatingNumber;
    private int year = 2022;
    private ArrayList<Subject> subjects;
    Names names;

    public Tawjihi() {
    }

    // create constructor take seatingNumber
    public Tawjihi(int seatingNumber, int id, String name, String school, char gender) {
        super(id, name, school, gender);
        this.seatingNumber = seatingNumber;
        subjects = new ArrayList<Subject>();
    }

    public int getSeatingNumber() {
        return this.seatingNumber;
    }

    public void setSeatingNumber(int seatingNumber) {
        this.seatingNumber = seatingNumber;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public ArrayList<Subject> getSubjects() {
        return this.subjects;
    }

    public void setSubjects(ArrayList<Subject> subjects) {
        this.subjects = subjects;
    }

    public void seatingNumber(int seatingNumber) {
        this.seatingNumber = seatingNumber;
    }

    public abstract double calculateAverage();

    @Override
    public String toString() {
        return "{" +
                " seatingNumber='" + getSeatingNumber() + "'" +
                ", year='" + getYear() + "'" +
                ", subjects='" + getSubjects() + "'" +
                "'" +
                "}";
    }

    public void addSubject(Subject subject) {
        this.subjects.add(subject);
    }

    public Subject getSubject(String title) {
        for (int i = 0; i < subjects.size(); i++) {
            if (subjects.get(i).getTitle().equals(title)) {
                return subjects.get(i);
            }
        }
        return null;
    }

}
