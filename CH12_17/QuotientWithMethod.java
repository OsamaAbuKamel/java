package CH12_17;

import java.util.Scanner;

public class QuotientWithMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
    }

    public static int quotient(int number1, int number2) {
        if (number2 == 0) {
            System.out.println("Divisor cannot be zero");
            System.exit(1);
        }
        return number1 / number2;
    }
}
