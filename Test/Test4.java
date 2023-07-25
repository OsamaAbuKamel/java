package Test;

import java.util.ArrayList;

public class Test4 {
    public static void main(String[] args) {
        String string = "AlShoroq Building@Main Street@Ramallah@9843";
    String[] pieces = string.split("@");
    for (String piece : pieces) {
        System.out.println(piece);
        System.out.println("====================");
    }
    


    }
}

//         // Create an ArrayList of Strings
//         ArrayList<String> list = new ArrayList<>();
//         list.add("Hello");
//         list.add("World");

//         // Check if the string "Hello" is in the list
//     boolean contains = list.contains("world");

//         // Print the result
//         System.out.println("Does the list contain 'Hello'? " + contains);
//     }
// }