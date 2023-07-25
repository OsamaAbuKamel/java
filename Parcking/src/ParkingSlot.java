public class ParkingSlot {
    public int row;
    public int column;
    public int level;
    public Car car;

    public ParkingSlot(int row, int column, int level) {
        this.row = row;
        this.column = column;
        this.level = level;
    }

    public void park(Car car) {
        this.car = car;
    }
}
