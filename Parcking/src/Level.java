import java.util.ArrayList;

public class Level {
    public int levelNumber;
    public int rows;
    public ArrayList<ParkingSlot> parkingSlots;
    public int SLOTS_PRE_ROW = 5;

    public Level(int levelNumber, int rows) {
        this.levelNumber = levelNumber;
        this.rows = rows;
        this.parkingSlots = new ArrayList<>();
    }

    public ParkingSlot findAvailableSlot() {
        int totalNumberSpaces = rows * SLOTS_PRE_ROW;
        if (parkingSlots.size() >= totalNumberSpaces) {
            return null;

        } else if (parkingSlots.isEmpty()) {
            return new ParkingSlot(0, 0, levelNumber);
        } else {
            ParkingSlot lastSpace = parkingSlots.get(parkingSlots.size() - 1);
            if (lastSpace.column < SLOTS_PRE_ROW) {
                return new ParkingSlot(lastSpace.row, lastSpace.column, levelNumber);
            } else {
                return new ParkingSlot(lastSpace.row + 1, 0, levelNumber);
            }
        }
    }

    public boolean park(Car car) {
        ParkingSlot freeSpace = findAvailableSlot();
        if (freeSpace == null) {
            return false;
        } else {
            freeSpace.park(car);
            parkingSlots.add(freeSpace);
            return true;
        }
    }
}
