package insidetheclass;

public class CircleIC implements Comparable<CircleIC>, Cloneable {
    private double radius;

    public CircleIC() {
    }

    public CircleIC(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof CircleIC) {
            return radius == ((CircleIC) o).radius;
        } else
            return false;
    }

    @Override
    public String toString() {
        return "{" +
                " radius= " + getRadius() + " Area is: " + getArea() +
                "}";
    }

    @Override
    public int compareTo(CircleIC o) {
        if (getArea() > o.getArea()) {
            return 1;
        } else if (getArea() < o.getArea()) {
            return -1;
        } else
            return 0;
    }

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public static void main(String[] args) {
        CircleIC circle = new CircleIC(3.4);
        CircleIC circle1 = new CircleIC(36.5);
        CircleIC circle2 = (CircleIC) circle1.clone();
        System.out.println(circle.equals(circle1));
        System.out.println(circle.compareTo(circle1));
        System.out.println(circle1.equals(circle2));
        System.out.println(circle1.compareTo(circle2));
        System.out.println(circle);
        System.out.println(circle1);
        System.out.println(circle2);
    }
}
