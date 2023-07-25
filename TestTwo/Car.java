package TestTwo;

public class Car extends Vehicle {

    private int carId;

    public Car() {
        super();
    }

    public Car(String name, String color, int carId) {
        super(name, color);
        this.carId = carId;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    @Override
    public void convert() {
        System.out.println("Car converted");

    }

    @Override
    public void start() {
        System.out.println("Car Started");
    }
}