package taskmanagement;

public class TaskLinkedList {

 private static class Node {
     Task task;
     Node next;

     Node(Task task) {
         this.task = task;
         this.next = null;
     }
 }

 private Node head;

 public void addTask(Task task) {
     Node newNode = new Node(task);
     if (head == null) {
         head = newNode;
     } else {
         Node curr = head;
         while (curr.next != null) {
             curr = curr.next;
         }
         curr.next = newNode;
     }
 }

 public Task searchTask(int id) {
     Node curr = head;
     while (curr != null) {
         if (curr.task.taskId == id) {
             return curr.task;
         }
         curr = curr.next;
     }
     return null;
 }

 public void displayTasks() {
     Node curr = head;
     while (curr != null) {
         System.out.println(curr.task);
         curr = curr.next;
     }
 }

 public void deleteTask(int id) {
     if (head == null) return;

     if (head.task.taskId == id) {
         head = head.next;
         System.out.println("Task with ID " + id + " deleted.");
         return;
     }

     Node curr = head;
     while (curr.next != null && curr.next.task.taskId != id) {
         curr = curr.next;
     }

     if (curr.next != null) {
         curr.next = curr.next.next;
         System.out.println("Task with ID " + id + " deleted.");
     } else {
         System.out.println("Task with ID " + id + " not found.");
     }
 }
}
