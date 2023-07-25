package CH13;

import java.util.ArrayList;
import java.util.Arrays;

public class DriverCH13 {
    public static void main(String[] args) throws CloneNotSupportedException {
        // Circle circle = new Circle (5.5,"blue",true);
        // System.out.println(circle);
        // todo Rectangle rectangle = new Rectangle ();
        ComparableRectangle comparableRectangle = new ComparableRectangle(8, 7);
        ComparableRectangle rectangle = (ComparableRectangle)comparableRectangle.clone();
        // System.out.println(comparableRectangle.compareTo(rectangle));
        // System.out.println(rectangle);
        System.out.println(rectangle);
        // ! Integer n1 = 3;
        // Object n2 = 4;
        // System.out.println(n1.compareTo((Integer) n2));

        //? Person[] persons = { new Person(3), new Person(4), new Person(1) };
        // java.util.Arrays.sort(persons);
        // ArrayList <Person> arrayList = new ArrayList<>(Arrays.asList(persons));
        // for (Person person : persons) {
        //     System.out.println(person);
        // }
        // System.out.println(arrayList);

    }
}

//? class Person implements Comparable<Person> {
//     private int id;

//     Person(int id) {
//         this.id = id;
//     }

//     @Override
//     public int compareTo(Person o) {
//         if (id > o.id) {
//             return 1;
            
//         } else if(id<o.id) {
//             return -1;
            
//         }
//         return 0;
//     }
//     @Override
//     public String toString() {
//         return "Person [id=" + id + "]";
//     }

// }