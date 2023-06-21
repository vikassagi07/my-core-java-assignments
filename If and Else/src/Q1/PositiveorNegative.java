package Q1;

import java.util.Scanner;

public class PositiveorNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       System.out.print("Enter a Number");
        double number = scanner.nextDouble();

        checkNumber(number);
    }

    public static void checkNumber(double number) {
        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }
}
