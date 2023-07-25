package Array_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayToList {
    public static void main(String[] args) {
    String []arr = {"red", "green", "blue"};
    ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
    System.out.println(list.toString());

    Integer[] array = {3,5,95,4,15,34,3,6,5};
    ArrayList<Integer> listInt = new ArrayList<>(Arrays.asList(array));
    Collections.sort(listInt);
    System.out.println(listInt);
    Collections.shuffle(listInt);
    System.out.println(listInt);
    // listInt.stream().sorted(Integer::compare).forEach(System.out::print);
   

    
    }
    
}
