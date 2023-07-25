package Array_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class E11_7 {
    public static void main(String[] args) {
        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(3);
        // list.add(5);
        // list.add(4);
        // list.add(4);
        // list.add(21);
        // System.out.println(list);
        // sort(list);
        // removeDuplicate(list);
        // shuffle(list);
        // ArrayList<Double> listDo = new ArrayList<>();
        // listDo.add(2.0);
        // listDo.add(3.0);
        // listDo.add(1.0);
        // System.out.println(sum(listDo));
        String s = "abs";
        System.out.println(toCharacterArray(s));



    }
    public static void shuffle(ArrayList<Integer> list) {
        // int temp = 0;
        // for (int i = 0; i < list.size(); i++) {
        //     int randomIndex = (int) (Math.random() * list.size());
        //     temp = list.get(i);
        //     list.set(i, list.get(randomIndex));
        //     list.set(randomIndex, temp);
        // }
        Collections.shuffle(list);
        System.out.println("shuffle is: "+list);
    }

    public static void removeDuplicate(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (list.get(i) == list.get(j)) {
                    list.remove(i);
                }
            }
        }
        System.out.print(list);
    }

    public static double sum(ArrayList<Double> list) {
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }

    public static void sort(ArrayList<Integer> list) {
        Collections.sort(list);
        list.stream().sorted().forEach(System.out::println);

    }
    public static ArrayList<Character> toCharacterArray(String s){
        ArrayList <Character> list = new ArrayList<>();
       for (int i = 0; i <s.length(); i++) {
        list.add(s.charAt(i));
       }
       return list;
    }

}
