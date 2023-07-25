package CH11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Arraylist11_4 {
    public static void main(String[] args) {
        // ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Max is: " + max());
        // System.out.println("最小值: " + min(list));
        // System.out.println("總和: " + sum(list));

    }

    public static Integer max() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(3);
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        return list.stream().max(Integer::compare).get();
    //     if (list == null || list.size() == 0) {
    //         return null;
    //     }

    //     int max = list.get(0);
    //     for (int i = 1; i < list.size(); i++) {
    //         if (list.get(i) > max) {
    //             max = list.get(i);
    //         }
    //     }

    //     return max;
    // }
}}