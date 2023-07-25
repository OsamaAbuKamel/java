package CH13;

public class Rectangle extends GeometricObject {
    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return this.width * this.height;

    }

    @Override
    public double getPerimeter() {
        return 2 * (this.width + this.height);

    }

    @Override
    public String toString() {
        return "{" +
                " width='" + getWidth() + "'" +
                ", height='" + getHeight() + "'" +
                "}";
    }

}
