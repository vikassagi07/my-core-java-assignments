package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Product {
    String name;//i have created two instance variables
    double price;

    public Product(String name, double price) { //This constructor accepts string and double type values and assign them to
                                                //  name and price instance variables.
        this.name = name;
        this.price = price;
    }


}
class StoreInventory {
    public static void main(String[] args) {
        List<Product> inventory = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Store Inventory");
        System.out.println("Enter product details (name and price), or 'quit' to exit:");

        while (true) {
            System.out.print("Product name: ");
            String name = scanner.nextLine();

            if (name.equalsIgnoreCase("quit")) {
                break;
            }

            System.out.print("Product price: ");
            double price = Double.parseDouble(scanner.nextLine());

            inventory.add(new Product(name, price));
            System.out.println("Product added to inventory.");
        }


        System.out.println("Store Inventory:");
        for (Product product : inventory) {
            System.out.println(product);
        }
        scanner.close();
    }
}
