package ecommerce;

public class SearchUtil {

 public static Product linearSearch(Product[] products, String name) {
     for (Product p : products) {
         if (p.productName.equalsIgnoreCase(name)) {
             return p;
         }
     }
     return null;
 }

 public static Product binarySearch(Product[] products, String name) {
     int left = 0;
     int right = products.length - 1;

     while (left <= right) {
         int mid = (left + right) / 2;
         int cmp = name.compareToIgnoreCase(products[mid].productName);
         if (cmp == 0) {
             return products[mid];
         } else if (cmp < 0) {
             right = mid - 1;
         } else {
             left = mid + 1;
         }
     }
     return null;
 }

 public static void sortProductsByName(Product[] products) {
     java.util.Arrays.sort(products, (a, b) -> a.productName.compareToIgnoreCase(b.productName));
 }
}
