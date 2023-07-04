//package com.Q9;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//class Q9 {
//    private String name;
//    private double price;
//
//    public Product(String name, double price) {
//        this.name = name;
//        this.price = price;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    @Override
//    public String toString() {
//        return "Product [name=" + name + ", price=" + price + "]";
//    }
//}
//
//class Store {
//    private List<Product> inventory;
//
//    public Store() {
//        inventory = new ArrayList<>();
//    }
//
//    public void addProduct(Product product) {
//        inventory.add(product);
//        System.out.println("Product added to the inventory: " + product);
//    }
//
//    public void removeProduct(Product product) {
//        if (inventory.contains(product)) {
//            inventory.remove(product);
//            System.out.println("Product removed from the inventory: " + product);
//        } else {
//            System.out.println("Product not found in the inventory: " + product);
//        }
//    }
//
//    public void displayInventory() {
//        System.out.println("Store Inventory:");
//        for (Product product : inventory) {
//            System.out.println(product);
//        }
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Store store = new Store();
//        Scanner scanner = new Scanner(System.in);
//
//        while (true) {
//            System.out.println("Enter product name (or 'quit' to exit):");
//            String name = scanner.nextLine();
//
//            if (name.equalsIgnoreCase("quit")) {
//                break;
//            }
//
//            System.out.println("Enter product price:");
//            double price = scanner.nextDouble();
//            scanner.nextLine(); // Consume the newline character
//
//            Product product = new Product(name, price);
//            store.addProduct(product);
//            store.displayInventory();
//        }
//
//        scanner.close();
//    }
//}