package Test;


public class CircleEqualMethod {
    double radius;

    public CircleEqualMethod(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }    

    // public double getPerimeter() {
    //     return 2 * Math.PI * this.radius;
    // }
    

    // public double getRadius() {
    //     return this.radius;
    // }

    // public void setRadius(double radius) {
    //     this.radius = radius;
    // }

    // public boolean equals(CircleEqualMethod circle){
    //     return this.radius == circle.radius;
    // }
    public boolean equals(Object o){
            return this.radius == ((CircleEqualMethod)o).radius;
    }
}
