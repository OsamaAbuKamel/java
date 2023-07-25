import java.util.ArrayList;

public class ParkingLot {
    public ArrayList<Level> levels;

    public ParkingLot() {
        levels = new ArrayList<Level>();
    }

    public boolean park(Car car) {
        for (Level level : levels) {
            if (level.park(car)) {
                return true;
            } else {
                continue;
            }
        }
        return false;
    }
}