package Array_List;

import java.util.ArrayList;

import CH11.Circle;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<String> cityList = new ArrayList<>();
        cityList.add("London");
        cityList.add("Denver");
        cityList.add("Paris");
        cityList.add("Miami");
        cityList.add("Seoul");
        cityList.add("Tokyo");
        System.out.println("Print city list: "+cityList.toString());
        System.out.println("List Size: "+cityList.size());
        System.out.println("Is Miami in the lest is: "+cityList.contains("Miami"));
        System.out.println("Is Denver in the lest is: "+cityList.indexOf("Denver"));
        System.out.println("Is The list empty: "+cityList.isEmpty());
        cityList.add(2, "Xian");
        cityList.remove("Miami");
        cityList.remove(1);
        System.out.println(cityList.toString());
        for (int i = cityList.size()-1;i>=0; i--) {
            System.out.print(cityList.get(i)+ " ");
            System.out.println();  
        }
        // cityList.stream().sorted(String::compareTo).forEach(System.out::println);
        System.out.println(cityList.stream().findFirst());
        System.out.println(cityList.stream().count());
        System.out.println(cityList.stream().max(String::compareTo));


        ArrayList<Circle> list = new ArrayList<>();
        list.add(new Circle(2));
        list.add(new Circle(3));
        System.out.println("The area of the circle? " +list.get(0).getArea());

        }
}
