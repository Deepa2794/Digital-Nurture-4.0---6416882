package sortingcustomer;

public class OrderTest {
 public static void main(String[] args) {
     Order[] orders = {
         new Order("O001", "Alice", 250.0),
         new Order("O002", "Bob", 120.5),
         new Order("O003", "Charlie", 430.25),
         new Order("O004", "Diana", 99.99),
         new Order("O005", "Eve", 300.0)
     };

     System.out.println("🔵 Original Orders:");
     OrderSorter.printOrders(orders);

     System.out.println("\n🔵 Sorted by Bubble Sort:");
     Order[] bubbleSorted = orders.clone();
     OrderSorter.bubbleSort(bubbleSorted);
     OrderSorter.printOrders(bubbleSorted);

     System.out.println("\n🔵 Sorted by Quick Sort:");
     Order[] quickSorted = orders.clone();
     OrderSorter.quickSort(quickSorted, 0, quickSorted.length - 1);
     OrderSorter.printOrders(quickSorted);
 }
}
