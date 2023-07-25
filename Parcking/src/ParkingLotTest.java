import java.util.ArrayList;
import java.util.List;

public class ParkingLotTest {
    public static void main(String[] args) {
        ArrayList<ParkingLot> list = new ArrayList<>();
        ParkingLot parkingLot = new ParkingLot();
        Car car = new Car("123");
        parkingLot.park(car);
        list.add(parkingLot);
        System.out.println(list);

    }
}