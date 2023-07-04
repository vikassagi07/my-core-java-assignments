package com.if2;

import java.util.Scanner;

public class Check {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();

        checkOddEven(number);
    }

    public static void checkOddEven(int number) {
        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("odd");
        }
    }
}
