package CH13;

import java.util.Date;

public abstract class GeometricObject {
    private String color;
    private boolean filled;
    private Date dateCreated;

    protected GeometricObject() {

    }

    protected GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }


    public String getColor() {
        return this.color;
    }

    public Date getDateCreated() {
        return this.dateCreated;
    }

    public boolean isFilled() {
        return this.filled;
    }

    public boolean getFilled() {
        return this.filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "{" +
            " color='" + getColor() + "'" +
            ", filled='" + isFilled() + "'" +
            ", dateCreated='" + getDateCreated() + "'" +
            "}";
    }
public abstract  double getArea(); 
public abstract double getPerimeter();


}
