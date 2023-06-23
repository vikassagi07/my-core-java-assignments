import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
 class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + "]";
    }
}

public class StoreInventory {
    private static ArrayList<Product> inventory = new ArrayList<>();

    private static void addProduct(String name, double price) {
        Product product = new Product(name, price);
        inventory.add(product);
        System.out.println("Product added to inventory.");
    }

    private static void removeProduct(String name) {
        for (Product product : inventory) {
            if (product.getName().equalsIgnoreCase(name)) {
                inventory.remove(product);
                System.out.println("Product removed from inventory.");
                return;
            }
        }
        System.out.println("Product not found in inventory.");
    }

    private static void storeInventoryData() {
        try {
            FileWriter writer = new FileWriter("inventory.txt");
            for (Product product : inventory) {
                writer.write(product.getName() + "," + product.getPrice() + "\n");
            }
            writer.close();
            System.out.println("Inventory data has been stored in the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while storing the inventory data.");
            e.printStackTrace();
        }
    }

    private static void displayInventory() {
        System.out.println("Inventory:");
        for (Product product : inventory) {
            System.out.println(product);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("1. Add product");
            System.out.println("2. Remove product");
            System.out.println("3. Display inventory");
            System.out.println("4. Store inventory data");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter product name: ");
                    scanner.nextLine(); // Consume the newline character
                    String name = scanner.nextLine();
                    System.out.print("Enter product price: ");
                    double price = scanner.nextDouble();
                    addProduct(name, price);
                    break;
                case 2:
                    System.out.print("Enter product name to remove: ");
                    scanner.nextLine(); // Consume the newline character
                    String productName = scanner.nextLine();
                    removeProduct(productName);
                    break;
                case 3:
                    displayInventory();
                    break;
                case 4:
                    storeInventoryData();
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.println();
        }

        scanner.close();
    }
}