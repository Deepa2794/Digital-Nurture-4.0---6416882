package ecommerce;

public class Product {
 String productId;
 String productName;
 String category;

 public Product(String productId, String productName, String category) {
     this.productId = productId;
     this.productName = productName;
     this.category = category;
 }

 public String toString() {
     return "[ID: " + productId + ", Name: " + productName + ", Category: " + category + "]";
 }
}
