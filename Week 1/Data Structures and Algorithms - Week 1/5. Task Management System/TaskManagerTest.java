package taskmanagement;

public class TaskManagerTest {
 public static void main(String[] args) {
     TaskLinkedList taskList = new TaskLinkedList();

     taskList.addTask(new Task(1, "Design Database", "In Progress"));
     taskList.addTask(new Task(2, "Implement API", "Not Started"));
     taskList.addTask(new Task(3, "Write Tests", "Not Started"));

     System.out.println("📋 All Tasks:");
     taskList.displayTasks();

     System.out.println("\n🔍 Searching for Task ID 2:");
     Task found = taskList.searchTask(2);
     System.out.println(found != null ? "Found: " + found : "Task not found.");

     System.out.println("\n❌ Deleting Task ID 1:");
     taskList.deleteTask(1);

     System.out.println("\n📋 Updated Task List:");
     taskList.displayTasks();
 }
}
