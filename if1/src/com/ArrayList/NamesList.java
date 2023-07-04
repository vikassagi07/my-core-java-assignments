package com.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class NamesList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);


        String input="";

        while (!input.equalsIgnoreCase("quit")) {
            System.out.println("Type 'list' to display names");
            System.out.println("'quit' to stop");
            System.out.println("Enter a name :");

            input = scanner.nextLine();

            if (input.equalsIgnoreCase("list")) {
                System.out.println("Names in the list:");
                for (String name : names) {
                    System.out.println(name);
                }
            }
            {
                names.add(input);
            }
        }
    }
}