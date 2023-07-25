package CH13;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

public class LargestNumber13_5 {
    public static void main(String[] args) {
        Number x = Integer.valueOf(3);
        System.out.println(x.intValue());
        // System.out.println(((Integer) x).compareTo(4));
        if (x instanceof Integer) {
            System.out.println(((Integer) x).compareTo(5));
        } else if (x instanceof Double) {
            System.out.println(((Double) x).compareTo(4.0));
        }
        // Number x = 3;
        // System.out.println(x.intValue());
        // System.out.println(x.doubleValue());
        // Number[] numberArray = new Integer[2];
        // numberArray[0] = Integer.valueOf(1);
        ArrayList<Number> arrayList = new ArrayList<>();
        arrayList.add(45);
        arrayList.add(3445.53);
        arrayList.add(new BigInteger("1"));
        // arrayList.add(new BigInteger("78888888888888888844455454545"));
        arrayList.add(new BigDecimal("0.0909090989091343433344343"));
        System.out.println("The largest number is " + getLargestNumber(arrayList));

    }

    public static Number getLargestNumber(ArrayList<Number> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        Number number = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (number.doubleValue() < list.get(i).doubleValue()) {
                number = list.get(i);
            }

        }
        return number;
    }

}
