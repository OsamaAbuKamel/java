package activity3lab2;

public class Scientific extends Tawjihi {
    public Scientific(int seatingNumber, int id, String name, String school, char gender) {
        super(seatingNumber, id, name, school, gender);
        addSubject(new Subject(Names.ARABIC, Type.MANDATORY, 0));
        addSubject(new Subject(Names.ENGLISH, Type.MANDATORY, 0));
        addSubject(new Subject(Names.MATH, Type.MANDATORY, 0));
        addSubject(new Subject(Names.PHYSICS, Type.MANDATORY, 0));
        addSubject(new Subject(Names.BIOLOGY, Type.ELECTIVEI, 0));
        addSubject(new Subject(Names.CHEMISTRY, Type.ELECTIVEI, 0));
        addSubject(new Subject(Names.RELIGIOUSEDUCATION, Type.ELECTIVEII, 0));
        addSubject(new Subject(Names.TECHNOLGY, Type.ELECTIVEII, 0));
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

    @Override
    public double calculateAverage() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calculateAverage'");
    }

}

enum PersonName {
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