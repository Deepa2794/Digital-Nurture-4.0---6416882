package lms;
import java.util.Arrays;

public class Library {

 public static Book linearSearch(Book[] books, String title) {
     for (Book book : books) {
         if (book.title.equalsIgnoreCase(title)) {
             return book;
         }
     }
     return null;
 }

 public static Book binarySearch(Book[] books, String title) {
     int left = 0;
     int right = books.length - 1;

     while (left <= right) {
         int mid = left + (right - left) / 2;
         int result = title.compareToIgnoreCase(books[mid].title);

         if (result == 0) {
             return books[mid];
         } else if (result < 0) {
             right = mid - 1;
         } else {
             left = mid + 1;
         }
     }

     return null;
 }
}
