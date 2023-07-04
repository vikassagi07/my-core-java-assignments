//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
// class Product {
//    private String name;
//    private double price;
//    private int quantity;
//
//    public Product(String name, double price, int quantity) {
//        this.name = name;
//        this.price = price;
//        this.quantity = quantity;
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
//    public int getQuantity() {
//        return quantity;
//    }
//
//
//    public String toString() {
//        return "Product [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
//    }
//}
//
//public class StoreInventory {
//    private List<Product> inventory;
//    private Connection connection;
//
//    public StoreInventory() {
//        inventory = new ArrayList<>();
//        connectToDatabase();
//    }
//
//    private void connectToDatabase() {
//        try {
//            String url = "jdbc:oracle:thin:@localhost:1521:ORCL";
//            String username = "your_username";
//            String password = "your_password";
//            connection = DriverManager.getConnection(url, username, password);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void addProduct() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter product name: ");
//        String name = scanner.nextLine();
//        System.out.print("Enter product price: ");
//        double price = scanner.nextDouble();
//        System.out.print("Enter product quantity: ");
//        int quantity = scanner.nextInt();
//
//        Product product = new Product(name, price, quantity);
//        inventory.add(product);
//        saveToDatabase(product);
//        System.out.println("Product added successfully!");
//    }
//
//    public void removeProduct() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the index of the product to remove: ");
//        int index = scanner.nextInt();
//
//        if (index >= 0 && index < inventory.size()) {
//            Product product = inventory.remove(index);
//            deleteFromDatabase(product);
//            System.out.println("Product removed successfully!");
//        } else {
//            System.out.println("Invalid index. Please try again.");
//        }
//    }
//
//    private void saveToDatabase(Product product) {
//        String sql = "INSERT INTO products (name, price, quantity) VALUES (?, ?, ?)";
//
//        try {
//            PreparedStatement statement = connection.prepareStatement(sql);
//            statement.setString(1, product.getName());
//            statement.setDouble(2, product.getPrice());
//            statement.setInt(3, product.getQuantity());
//            statement.executeUpdate();
//            statement.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    private void deleteFromDatabase(Product product) {
//        String sql = "DELETE FROM products WHERE name = ?";
//
//        try {
//            PreparedStatement statement = connection.prepareStatement(sql);
//            statement.setString(1, product.getName());
//            statement.executeUpdate();
//            statement.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void printInventory() {
//        System.out.println("Inventory:");
//        for (Product product : inventory) {
//            System.out.println(product);
//        }
//    }
//
//    public static void main(String[] args) {
//        StoreInventory store = new StoreInventory();
//        Scanner scanner = new Scanner(System.in);
//        int choice;
//
//        do {
//            System.out.println("1. Add Product");
//            System.out.println("2. Remove Product");
//            System.out.println("3. Print Inventory");
//            System.out.println("0. Exit");
//            System.out.print("Enter your choice: ");
//            choice = scanner.nextInt();
//
//            switch (choice) {
//                case 1:
//                    store.addProduct();
//                    break;
//                case 2:
//                    store.removeProduct();
//                    break;
//                case 3:
//                    store.printInventory();
//                    break;
//                case 0:
//                    System.out.println("Exiting...");
//                    break;
//                default:
//                    System.out.println("Invalid choice. Please try again.");
//                    break;
//            }
//        } while (choice != 0);
//
//        scanner.close();
//    }
//}