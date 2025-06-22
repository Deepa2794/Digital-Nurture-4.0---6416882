package mvcpattern;

public class MVCPatternTest {
 public static void main(String[] args) {
   
     Student student = new Student("S101", "Alice", "A");

     StudentView view = new StudentView();

     StudentController controller = new StudentController(student, view);

     controller.updateView();

     System.out.println("\nUpdating student info...\n");

     controller.setStudentName("Alicia");
     controller.setStudentGrade("A+");

     controller.updateView();
 }
}
