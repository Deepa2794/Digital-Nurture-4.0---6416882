package ecommerce;

public class SearchTest {
 public static void main(String[] args) {
     Product[] products = {
         new Product("P101", "Laptop", "Electronics"),
         new Product("P102", "Shampoo", "Personal Care"),
         new Product("P103", "T-Shirt", "Clothing"),
         new Product("P104", "Phone", "Electronics"),
         new Product("P105", "Shoes", "Footwear")
     };

     System.out.println("🔍 Linear Search:");
     Product result1 = SearchUtil.linearSearch(products, "Phone");
     System.out.println(result1 != null ? "Found: " + result1 : "Product not found.");

     SearchUtil.sortProductsByName(products);

     System.out.println("\n🔍 Binary Search:");
     Product result2 = SearchUtil.binarySearch(products, "Phone");
     System.out.println(result2 != null ? "Found: " + result2 : "Product not found.");
 }
}
