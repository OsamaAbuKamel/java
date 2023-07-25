package Test;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;

public class Test1 extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        // Create a label with the text "Hello, World!"
        Label label = new Label("Hello, World!");

        // Create a layout pane (StackPane) and add the label to it
        StackPane root = new StackPane();
        root.getChildren().add(label);

        // Create a scene with the layout pane as the root and set its size
        Scene scene = new Scene(root, 300, 200);

        // Set the scene to the primary stage and show the stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("Hello World");
        primaryStage.show(); // write your code here javafx print hello world

    }
}

// public class Test1 {
// public static void main(String[] args) {
// Object o = new A(); // Implicit casting

// }
// }

// class A {
// public A() {
// System.out.println("A's constructor is invoked");
// }
// }

// class B extends A {
// public B(int h) {
// System.out.println("B's constructor is invoked");
// }
// }
// Object [] arrays = new int[50];
// Object [] arrays = new Integer[4];
// Object [] array = new Object[11];
// array[0] = new Integer(10);
// array[1] = new String("Hello");
// array[2] = new Double(12.5);
// array[3] = new Float(12.5);
// array[4] = new Character('A');
// array[5] = new Boolean(true);
// array[7] = new int[50];
// array[8] = new Integer[50];
// array[9] = new String[50];
// array[10] = new Double[50];

// for (int i = 0; i < array.length; i++) {
// System.out.println(array[i]);
// }

// System.out.println("====================================");
// arrays[0] = new Integer(10);

// for (int i = 0; i < arrays.length; i++) {
// System.out.println(arrays[i]);
// }
// Integer[] list1 = {12, 24, 55, 1};
// Double[] list2 = {12.4, 24.0, 55.2, 1.0};
// int[] list3 = {1, 2, 3};
// printArray(list1);
// printArray(list2);
// // printArray(list3);
// }

// public static void printArray(Object[] list) {
// for (Object o: list)
// System.out.print(o + " ");
// System.out.println();
// new Person().printPerson();
// new Student().printPerson();
// }
// }
// class Student extends Person {
// public String getInfo() {
// return "Student";
// }
// }
// class Person {
// public String getInfo() {
// return "Person";
// }
// public void printPerson() {
// System.out.println(getInfo());
// }
// }
