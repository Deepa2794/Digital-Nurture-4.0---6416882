package sortingcustomer;

public class Order {
 String orderId;
 String customerName;
 double totalPrice;

 public Order(String orderId, String customerName, double totalPrice) {
     this.orderId = orderId;
     this.customerName = customerName;
     this.totalPrice = totalPrice;
 }

 public String toString() {
     return "[Order ID: " + orderId + ", Customer: " + customerName + ", Total: $" + totalPrice + "]";
 }
}
