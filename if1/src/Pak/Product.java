package Pak;

import java.util.ArrayList;
import java.util.List;

class Product {
     int id;
     String name;
    double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class Store {
    private List<Product> inventory;

    public Store() {
        inventory = new ArrayList<>();
    }

    public void addProduct(Product product) {
        inventory.add(product);
        System.out.println("Product added to the inventory: " + product.getName());
    }

    public void removeProduct(int productId) {
        Product removedProduct = null;
        for (Product product : inventory) {
            if (product.getId() == productId) {
                removedProduct = product;
                break;
            }
        }

        if (removedProduct != null) {
            inventory.remove(removedProduct);
            System.out.println("Product removed from the inventory: " + removedProduct.getName());
        } else {
            System.out.println("Product not found in the inventory: " + productId);
        }
    }

    public void displayInventory() {
        System.out.println("Store Inventory:");
        for (Product product : inventory) {
            System.out.println("ID: " + product.getId() + ", Name: " + product.getName() + ", Price: $" + product.getPrice());
        }
    }

    public static void main(String[] args) {
        Store store = new Store();

        Product product1 = new Product(1, "Shirt", 19.99);
        Product product2 = new Product(2, "Jeans", 29.99);
        Product product3 = new Product(3, "Shoes", 49.99);

        store.addProduct(product1);
        store.addProduct(product2);
        store.addProduct(product3);

        store.displayInventory();

        store.removeProduct(2);
        store.removeProduct(4);

        store.displayInventory();
    }
}

