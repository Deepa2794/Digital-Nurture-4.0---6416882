package inventorymanagement;

import java.util.HashMap;

public class InventoryManager {
 private HashMap<String, Product> inventory;

 public InventoryManager() {
     inventory = new HashMap<>();
 }

 public void addProduct(Product product) {
     if (inventory.containsKey(product.getProductId())) {
         System.out.println("Product already exists.");
     } else {
         inventory.put(product.getProductId(), product);
         System.out.println("Product added: " + product);
     }
 }

 public void updateProduct(String productId, String name, int quantity, double price) {
     Product product = inventory.get(productId);
     if (product != null) {
         product.setProductName(name);
         product.setQuantity(quantity);
         product.setPrice(price);
         System.out.println("Product updated: " + product);
     } else {
         System.out.println("Product not found.");
     }
 }

 public void deleteProduct(String productId) {
     Product removed = inventory.remove(productId);
     if (removed != null) {
         System.out.println("Product removed: " + removed);
     } else {
         System.out.println("Product not found.");
     }
 }

 public void displayInventory() {
     if (inventory.isEmpty()) {
         System.out.println("Inventory is empty.");
     } else {
         System.out.println("Current Inventory:");
         for (Product p : inventory.values()) {
             System.out.println(p);
         }
     }
 }
}
