package ArrayDS;

import java.util.ArrayList;

public class SimpleArray1 {
    public static void main(String[] args) {
        // One diminution array
        int[] arr = new int[5];
        arr[0] = 54;
        arr[1] = 74;
        arr[2] = 5;
        arr[3] = 14;
        arr[4] = 4;
        System.out.println("Simple Array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

        // find java array two diminution 3*3.
        int[][] data = new int[3][3];
        data[0][0] = 4;
        data[0][1] = 45;
        data[1][0] = 4;
        data[1][1] = 84;
        data[2][0] = 7;
        data[2][1] = 12;
        data[2][2] = 4;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(data[i][j] + "\t");
            }
            System.out.println("\n");
        }
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(4);
        arrayList.add(4);
        arrayList.add(98);
        arrayList.forEach((n) -> System.out.println(n));
    }
}
