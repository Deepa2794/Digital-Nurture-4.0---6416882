package employeemanagement;

public class EmployeeManager {
 private Employee[] employees;
 private int size;

 public EmployeeManager(int capacity) {
     employees = new Employee[capacity];
     size = 0;
 }

 public void addEmployee(Employee emp) {
     if (size < employees.length) {
         employees[size++] = emp;
     } else {
         System.out.println("Array is full. Cannot add more employees.");
     }
 }

 public Employee searchEmployee(int id) {
     for (int i = 0; i < size; i++) {
         if (employees[i].employeeId == id) {
             return employees[i];
         }
     }
     return null;
 }

 public void displayAllEmployees() {
     for (int i = 0; i < size; i++) {
         System.out.println(employees[i]);
     }
 }

 public void deleteEmployee(int id) {
     for (int i = 0; i < size; i++) {
         if (employees[i].employeeId == id) {
             // Shift remaining elements left
             for (int j = i; j < size - 1; j++) {
                 employees[j] = employees[j + 1];
             }
             employees[size - 1] = null;
             size--;
             System.out.println("Employee with ID " + id + " deleted.");
             return;
         }
     }
     System.out.println("Employee not found.");
 }
}
