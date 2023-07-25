package CH13;

public class Circle extends GeometricObject {
    private final double PI = 3.14;
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    @Override
    public double getArea() {
        double area = 0;
        area = PI * radius * radius;
        return area;

    }

    @Override
    public double getPerimeter() {
        double perimeter = 2 * PI * radius;
        return perimeter;
    }

    @Override
    public String toString() {
        return super.toString() + "{" +
                " radius='" + getRadius() + "'" +
                "Area='" + getArea() + "'" +
                "Perimeter='" + getPerimeter() + "'" +
                "Diameter = '" + getDiameter() +
                "}";
    }

}
