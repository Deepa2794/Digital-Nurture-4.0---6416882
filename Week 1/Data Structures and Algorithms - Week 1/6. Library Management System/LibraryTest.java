package lms;

import java.util.Arrays;

public class LibraryTest {
 public static void main(String[] args) {
     Book[] books = {
         new Book(1, "Java Programming", "Alice"),
         new Book(2, "Python Basics", "Bob"),
         new Book(3, "Data Structures", "Charlie"),
         new Book(4, "Web Development", "David")
     };

     Arrays.sort(books);  

     System.out.println("🔍 Linear Search for 'Python Basics':");
     Book foundLinear = Library.linearSearch(books, "Python Basics");
     System.out.println(foundLinear != null ? "Found: " + foundLinear : "Not found");

     System.out.println("\n🔎 Binary Search for 'Web Development':");
     Book foundBinary = Library.binarySearch(books, "Web Development");
     System.out.println(foundBinary != null ? "Found: " + foundBinary : "Not found");
 }
}
