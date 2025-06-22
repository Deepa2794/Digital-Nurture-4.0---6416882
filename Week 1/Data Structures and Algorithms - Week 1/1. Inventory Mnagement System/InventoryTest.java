package inventorymanagement;

public class InventoryTest {
 public static void main(String[] args) {
     InventoryManager manager = new InventoryManager();

     manager.addProduct(new Product("P001", "Laptop", 10, 799.99));
     manager.addProduct(new Product("P002", "Smartphone", 20, 499.99));

     manager.displayInventory();

     manager.updateProduct("P002", "Smartphone Pro", 25, 599.99);

     manager.deleteProduct("P001");

     manager.displayInventory();
 }
}
