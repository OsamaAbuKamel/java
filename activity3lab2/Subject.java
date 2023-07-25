package activity3lab2;

enum Type {
    MANDATORY, ELECTIVEI, ELECTIVEII;
}
public class Subject {
    private Names title;
    private Type type;
    private int mark;

    public Subject(Names title, Type type, int mark) {
        this.title = title;
        this.type = type;
        this.mark = mark;
    }

    public Names getTitle() {
        return this.title;
    }

    public void setTitle(Names title) {
        this.title = title;
    }

    public Type getType() {
        return this.type;
    }

    public void setType(Type type) {
        if (type == Type.MANDATORY || type == Type.ELECTIVEI || type == Type.ELECTIVEII) {
            this.type = type;
        } else
            System.out.println("Error");
    }

    public int getMark() {
        return this.mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "{" +
                " title='" + getTitle() + "'" +
                ", type='" + getType() + "'" +
                ", mark='" + getMark() + "'" +
                "}";
    }

}

