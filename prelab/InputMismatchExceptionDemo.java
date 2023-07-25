package prelab;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptionDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueInput = true;
        while (continueInput) {
            try {
                System.out.print("Enter an integer: ");
                int number = input.nextInt();
                // Display the result
                System.out.println("The number entered is " + number);
                continueInput = false;
            } catch (InputMismatchException ex) {
                System.out.println("Try again. (" +
                        "Incorrect input: an integer is required)");
                /*
                 * by adding input. nextLine();
                 * After catching the exception,
                 * it ensures that the invalid entry is cleared from the entry's memory. This
                 * allows the user to enter a new entry in the next cycle of the loop, which
                 * breaks the infinite loop.
                 */
                input.nextLine(); // discard input
            }
        }
    }
}