import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Product {
     String name; //i have created two instance variables
     double price;

    public Product(String name, double price) { //This constructor accepts string and double type values and assign them to
                                                //  name and price instance variables.
        this.name = name;
        this.price = price;
    }

    public String getName() { //we used this getter method that return values to there instance variables
        return name;
    }

//    public double getPrice() {
//        return price;
//    }


    public String toString() {   //It is used to represent the product instance variables in the form of
                                // [ name=-----,price=----]
        return "Product [name=" + name + ", price=" + price + "]";
    }

}   //this is the class of product with detail like name & price

public class Main {
    public static void main(String[] args) { //main method
        List<Product> inventory = new ArrayList<>(); //implementation of arraylist
        Scanner scanner = new Scanner(System.in); //we used scanner object to give input from run console

        System.out.println("Enter product details (name and price) separated by space:");
        System.out.println("To add the products use 'add' to remove the product use 'remove'");
        System.out.println("To see the store inventory type inventory");
        System.out.println("Type completed to exit"); //These print statements are to guide the user about giving inputs
                                                    //these are shown in run console
        while (true) {                              //while loop continuously allows us to give input in console
                                                    // until we give input as completed or if we give input as inventor it shows inventory
            String input = scanner.nextLine();      //

            if (input.equalsIgnoreCase("completed")) {
                break;
            } else if (input.equalsIgnoreCase("inventory")) {
                displayInventory(inventory);
                continue;
            }

            String[] commandArgs = input.split(" "); //
            String command = commandArgs[0];

            if (command.equalsIgnoreCase("add")) {
                if (commandArgs.length != 3) {
                    System.out.println("Invalid input. Please enter 'add name price'.");
                    continue;
                }

                String name = commandArgs[1].trim();
                double price;
                try {
                    price = Double.parseDouble(commandArgs[2].trim());
                } catch (NumberFormatException e) {
                    System.out.println("Invalid price. Please enter a valid numeric value.");
                    continue;
                }

                Product product = new Product(name, price);
                inventory.add(product);
                System.out.println("Product added to the inventory: " + product);
            } else if (command.equalsIgnoreCase("remove")) {
                if (commandArgs.length != 2) {
                    System.out.println("Invalid input. Please enter 'remove name'.");
                    continue;
                }

                String name = commandArgs[1].trim();
                boolean removed = false;

                for (int i = 0; i < inventory.size(); i++) {
                    Product product = inventory.get(i);
                    if (product.getName().equalsIgnoreCase(name)) {
                        inventory.remove(i);
                        removed = true;
                        System.out.println("Product removed from the inventory: " + product);
                        break;
                    }
                }

                if (!removed) {
                    System.out.println("Product not found in the inventory: " + name);
                }
            } else {
                System.out.println("Invalid command. Please enter 'add' or 'remove' followed by appropriate arguments.");
            }
        }

        scanner.close();
    }
    public static void displayInventory(List<Product> inventory) {
        System.out.println("Store Inventory:");
        for (Product product : inventory) {
            System.out.println(product);
        }
    }
}