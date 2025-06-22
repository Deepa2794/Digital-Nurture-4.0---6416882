package employeemanagement;

public class EmployeeTest {
 public static void main(String[] args) {
     EmployeeManager manager = new EmployeeManager(5);

     manager.addEmployee(new Employee(101, "Alice", "Developer", 60000));
     manager.addEmployee(new Employee(102, "Bob", "Manager", 75000));
     manager.addEmployee(new Employee(103, "Charlie", "Tester", 50000));

     System.out.println("👥 All Employees:");
     manager.displayAllEmployees();

     System.out.println("\n🔍 Searching for Employee ID 102:");
     Employee e = manager.searchEmployee(102);
     System.out.println(e != null ? "Found: " + e : "Not found");

     System.out.println("\n❌ Deleting Employee ID 101:");
     manager.deleteEmployee(101);

     System.out.println("\n👥 Updated Employees:");
     manager.displayAllEmployees();
 }
}
